package fr.imta.naomod;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import lang.IotlangStandaloneSetup;
import lang.iotlang.Bind;
import lang.iotlang.InstanceThing;
import lang.iotlang.IoTLangModel;
import lang.iotlang.NetworkConfiguration;
import lang.iotlang.Rule;
import lang.iotlang.Topic;

public class EntryPoint {
	public static void main(String[] args){
		final String param = "sql";
		//
		KeyPairGenerator keyGen;
		try {
			keyGen = KeyPairGenerator.getInstance("RSA");
	        keyGen.initialize(512);
	        byte[] publicKey = keyGen.genKeyPair().getPublic().getEncoded();
	        StringBuffer retString = new StringBuffer();
	        for (int i = 0; i < publicKey.length; ++i) {
	            retString.append(Integer.toHexString(0x0100 + (publicKey[i] & 0x00FF)).substring(1));
	        }
	        System.out.println(retString);
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		File input = null;
		input = new File("testing.iotlang");
		BufferedWriter output=null;
		try {
		output = new BufferedWriter(new FileWriter(input));
			output.write("thing Temperature {\n" + 
					"	// Arduino that senses the temperature\n" + 
					"	port ok\n" + 
					"}\n" + 
					"//thing fragment msgAndPorts{\n" + 
					"//	message sensorData (value : Int16);\n" + 
					"//	required port AnalogInput \n" + 
					"//    {	\n" + 
					"//		sends sensorData\n" + 
					"//		receives sensorData\n" + 
					"//	}\n" + 
					"//}\n" + 
					"\n" + 
					"thing AirConditionner {\n" + 
					"	// Android that handles the air conditionner\n" + 
					"	port ok\n" + 
					"}\n" + 
					"\n" + 
					"thing AndroidUser {\n" + 
					"	// Simple android application that give the user the possibility to select the temperature\n" + 
					"	port ok\n" + 
					"}\n" + 
					"datatype int <8>;\n" + 
					"message temperatureMessage(int)\n" + 
					"protocol mqtt\n" + 
					"\n" + 
					"channel:pubsub MqttBus {\n" + 
					"	topic room1 (temperatureMessage)\n" +
					"	topic room2 (temperatureMessage)\n" +
					"}\n" + 
					"\n" + 
					"channel:reqrep ptp {\n" + 
					"	\n" + 
					"}\n" + 
					"policy roomPolicy {\n" + 
					"	rule Temperature allow:receive message:temperatureMessage\n" + 
					"	rule AirConditionner allow:receive Temperature.ok\n" + 
					"	rule Temperature deny:send AirConditionner.ok\n" + 
					"}\n" + 
					"\n" + 
					"//configuration AndroidConf {\n" + 
					"//	instance myAndroid:AndroidUser\n" + 
					"//}\n" + 
					"//configuration AirConditionnerConf {\n" + 
					"//	instance myAirConditionner:AirConditionner\n" + 
					"//	\n" + 
					"//}\n" + 
					"//configuration TemperatureConf {\n" + 
					"//	instance mytemperature:Temperature\n" + 
					"//}\n" + 
					"\n" + 
					"networkConfiguration wsnConfiguration {\n" + 
					"	domain \"fr.imt.dapi.roomA246\" // thing of  the same domain share the same secret key, a configuration can be deployed into different domain but the domain has to change\n" + 
					"	instancePolicy mypolicy:roomPolicy\n" + 
					"	enforce mypolicy\n" + 
					"	instanceThing instanceTemp[10]:Temperature target nesc\n" + 
					"	instanceThing instanceTemp2[10]:Temperature target cposix\n" + 
					"	instancePubSub mqtt:MqttBus target \"mosquitto\" over mqtt \n" + 
					"	instanceReqRep ptp:ptp target \"mosquitto\" over mqtt\n" + 
					"	bind instanceTemp => mqtt{room1,room2}\n" + 
					"	connect instanceTemp => ptp\n" + 
					"}\n" + 
					"");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	          if ( output != null ) {
	            try {
					output.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	       }
	     }
		registerFactory();
		ResourceSet rs = new ResourceSetImpl();
        URI xmiuri = URI.createFileURI(input.getAbsolutePath());
        Resource model = rs.createResource(xmiuri);
        try {
			model.load(null);
	        EcoreUtil.resolveAll(model);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        for (Resource r : model.getResourceSet().getResources()) {
            checkEMFErrorsAndWarnings(r, Logger.SYSTEM);
        }
        
        IoTLangModel iotModel = (IoTLangModel) model.getContents().get(0);
        
        File outputFile = null;
        outputFile = new File("main.ino");
		BufferedWriter buffer=null;
                
		try {
			buffer = new BufferedWriter(new FileWriter(outputFile));
			for (InstanceThing instanceThing : iotModel.getConfigs().get(0).getThingInstances()) {
				buffer.write("InstanceThing : "+sign(iotModel.getConfigs().get(0), instanceThing)+"\n");
			}
			for (Bind instanceThing : iotModel.getConfigs().get(0).getBinds()) {
				buffer.write("Bind : "+iotModel.getConfigs().get(0).getBinds().size()+"\n");
			}
			buffer.write("Domain : "+iotModel.getConfigs().get(0).getDomain().get(0).getName().replace("\"", "")+"\n");
			for (Rule rule : iotModel.getConfigs().get(0).getInstancePoliciy().get(0).getTypePolicy().getHasRules()) {
				if(rule.getObject()!=null) {
					String objectName = rule.getObject().getPorts().get(0).getName();
					buffer.write("Rules : "+objectName+"\n");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	          if ( buffer != null ) {
	            try {
	            	buffer.close();
	            	
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	       }
	     }
        
		generateSQLRules(iotModel);
        
        
		System.out.println("It works ! "+input.getAbsolutePath());
	}
	
    private static void registerFactory() {
    	IotlangStandaloneSetup.doSetup();
    }
	
	private static boolean checkEMFErrorsAndWarnings(Resource model, Logger log) {
    	log.info("Checking for EMF errors and warnings");
        boolean isOK = true;
        if (model.getErrors().size() > 0) {
            isOK = false;
            log.error("ERROR: The input model contains " + model.getErrors().size() + " errors.");
            for (Resource.Diagnostic d : model.getErrors()) {    
            		String location = d.getLocation();
            		if (location == null) {
            			location = model.getURI().toFileString();
            		}
            		log.error("Error in file  " + location + " (" + d.getLine() + ", " + d.getColumn() + "): " + d.getMessage());
            }
        }

        if (model.getWarnings().size() > 0) {
        	log.warning("WARNING: The input model contains " + model.getWarnings().size() + " warnings.");
            for (Resource.Diagnostic d : model.getWarnings()) {
          		String location = d.getLocation();
        		if (location == null) {
        			location = model.getURI().toFileString();
        		}
        		log.warning("Warning in file  " + location + " (" + d.getLine() + ", " + d.getColumn() + "): " + d.getMessage());
            }
        }
        return isOK;
    }
	
	public static String sha256(String base) {
	    try{
	        MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        byte[] hash = digest.digest(base.getBytes("UTF-8"));
	        StringBuffer hexString = new StringBuffer();

	        for (int i = 0; i < hash.length; i++) {
	            String hex = Integer.toHexString(0xff & hash[i]);
	            if(hex.length() == 1) hexString.append('0');
	            hexString.append(hex);
	        }

	        return hexString.toString();
	    } catch(Exception ex){
	       throw new RuntimeException(ex);
	    }
	}
	
	public static String sign(NetworkConfiguration config, InstanceThing thing) {
		String  signature = sha256(config.getDomain().get(0).getName()+thing.getName().toString());
		return String.valueOf((signature.hashCode() & 0xfffffff));
	}
	protected static int accessConverter(String direction) {
		switch(direction) {
		case "=>":
			return 2;
		case "<=>":
			return 2;
		case "<=":
			return 1;
		default:
			return 0;
		}
	}
	public static void generateSQLRules(IoTLangModel iotModel) {
		File sqlFile = null;
		sqlFile = new File("acl.sql");
		BufferedWriter bufferSql =null;
		try {
			bufferSql = new BufferedWriter(new FileWriter(sqlFile));
			StringBuffer rulesSql = new StringBuffer();
			for (Bind bind : iotModel.getConfigs().get(0).getBinds()) {
				String signature = sign(iotModel.getConfigs().get(0),bind.getThingInstance());
				for (Topic topic : bind.getTopics()) {
					String topicName = topic.getName();
					int accessRight = accessConverter(bind.getDirection());
					rulesSql.append(
							"INSERT INTO acls (username,topic,rw)\n" + 
							"SELECT * FROM (SELECT "+signature+", '"+topicName+"', "+accessRight+") AS tmp\n" + 
							"WHERE NOT EXISTS (\n" + 
							"    SELECT username FROM acls WHERE username = "+signature+" AND topic='"+topicName+"' AND rw="+accessRight+"\n" + 
							") LIMIT 1;\n \n");
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
