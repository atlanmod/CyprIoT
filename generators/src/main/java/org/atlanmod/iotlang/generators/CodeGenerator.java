package org.atlanmod.iotlang.generators;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.atlanmod.iotlang.utilities.Utils;

import lang.iotlang.Bind;
import lang.iotlang.IoTLangModel;
import lang.iotlang.Topic;

public class CodeGenerator {
	public static void generateTextRules(IoTLangModel iotModel, String pathdirectory) {
		File sqlFile = null;
        sqlFile = new File(pathdirectory+"/gen/"+iotModel.getNetworkConfigs().get(0).getName()+"/acl/acl.txt");
        sqlFile.getParentFile().mkdirs();
		BufferedWriter bufferSql =null;
		try {
			bufferSql = new BufferedWriter(new FileWriter(sqlFile));
			StringBuffer rulesSql = new StringBuffer();
            String domainName = iotModel.getNetworkConfigs().get(0).getDomain().get(0).getName().replace("\"", "");
			for (Bind bind : iotModel.getNetworkConfigs().get(0).getBinds()) {
				String signature = Utils.sign(iotModel.getNetworkConfigs().get(0),bind.getThingInstance());
				for (Topic topic : bind.getTopics()) {
					String topicName = domainName.replace(".", "/")+"/"+topic.getName();
					String accessRight = Utils.accessConverterTxt(bind.getDirection());
					String clientId =iotModel.getNetworkConfigs().get(0).getDomain().get(0).getName().replace("\"", "").replace(".", ":")+":"+bind.getThingInstance().getName()+":"+signature;
					String wildcard = "/#";
					if(!accessRight.equals("")) {
					rulesSql.append(
							"user "+bind.getThingInstance().getOwner().getName().replace("\"", "")+"\n" + 
							"topic "+accessRight+" "+topicName+wildcard+"\n \n");
					}
				}
				
			}
			bufferSql.write(""+rulesSql);
			bufferSql.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	          if ( bufferSql != null ) {
	            try {
	            	bufferSql.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	       }
	     }
		
	}
	
	public static void generateSQLRules(IoTLangModel iotModel, String pathdirectory) {
		File sqlFile = null;
		String sqlUserId ="SELECT pw FROM users WHERE username = '%s' LIMIT 1";
		String sqlSuperUserId ="SELECT IFNULL(COUNT(*), 0) FROM users WHERE username = '%s' AND super = 1";
		String aclCheckQuery ="SELECT topic FROM acls WHERE (username = '%s') AND (rw >= %d)";
		
		String configMosquitto = "auth_plugin /home/jpm/mosquitto-auth-plug/auth-plug.so\n" + 
				"auth_opt_host localhost\n" + 
				"auth_opt_port 3306\n" + 
				"auth_opt_dbname test\n" + 
				"auth_opt_user jjj\n" + 
				"auth_opt_pass supersecret\n" + 
				"auth_opt_userquery "+sqlUserId+"\n" + 
				"auth_opt_superquery "+sqlSuperUserId+"\n" + 
				"auth_opt_aclquery "+aclCheckQuery+"\n" + 
				"auth_opt_anonusername AnonymouS";
		
        sqlFile = new File(pathdirectory+"/gen/"+iotModel.getNetworkConfigs().get(0).getName()+"/acl/acl.sql");
        sqlFile.getParentFile().mkdirs();
		BufferedWriter bufferSql =null;
		try {
			bufferSql = new BufferedWriter(new FileWriter(sqlFile));
			StringBuffer rulesSql = new StringBuffer();
            String domainName = iotModel.getNetworkConfigs().get(0).getDomain().get(0).getName().replace("\"", "");
			for (Bind bind : iotModel.getNetworkConfigs().get(0).getBinds()) {
				String thingName = bind.getThingInstance().getName();
				String signature = Utils.sign(iotModel.getNetworkConfigs().get(0),bind.getThingInstance());
				String allID = iotModel.getNetworkConfigs().get(0).getDomain().get(0).getName().replace("\"", "")+":"+signature;
				System.out.println("ID for "+thingName+": " + allID);
				for (Topic topic : bind.getTopics()) {
					String topicName = domainName.replace(".", "/")+"/"+topic.getName();
					int accessRight = Utils.accessConverter(bind.getDirection());
					if(accessRight!=0) {
					rulesSql.append(
							"INSERT INTO acls (username,topic,rw)\n" + 
							"SELECT * FROM (SELECT "+allID+", '"+topicName+"', "+accessRight+") AS tmp\n" + 
							"WHERE NOT EXISTS (\n" + 
							"    SELECT username FROM acls WHERE username = "+allID+" AND topic='"+topicName+"' AND rw="+accessRight+"\n" + 
							") LIMIT 1;\n \n");
					}
				}
				
			}
			bufferSql.write("CREATE TABLE  IF NOT EXISTS acls ( id INTEGER AUTO_INCREMENT, username VARCHAR(25) "
					+ "NOT NULL, topic VARCHAR(256) NOT NULL, rw INTEGER(1) "
					+ "NOT NULL DEFAULT 1, PRIMARY KEY (id) );\n \n" + 
					rulesSql);
			bufferSql.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	          if ( bufferSql != null ) {
	            try {
	            	bufferSql.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	       }
	     }
		
	}
}
