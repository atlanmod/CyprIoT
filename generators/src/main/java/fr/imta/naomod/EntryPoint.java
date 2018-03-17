package fr.imta.naomod;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.thingml.compilers.ThingMLCompiler;
import org.thingml.compilers.c.arduino.ArduinoCompiler;
import org.thingml.compilers.c.posix.PosixCompiler;
import org.thingml.compilers.debugGUI.plugin.MQTTjs;
import org.thingml.compilers.java.JavaCompiler;
import org.thingml.networkplugins.c.CNoneSerializerPlugin;
import org.thingml.networkplugins.c.arduino.ESP8266MQTTPlugin;
import org.thingml.networkplugins.c.posix.PosixJSONSerializerPlugin;
import org.thingml.networkplugins.c.posix.PosixMQTTPlugin;
import org.thingml.networkplugins.java.JavaByteArraySerializerPlugin;
import org.thingml.networkplugins.java.JavaJSONSerializerPlugin;
import org.thingml.networkplugins.java.JavaMQTTPlugin;
import org.thingml.xtext.ThingMLStandaloneSetup;
import org.thingml.xtext.thingML.ThingMLModel;

import clang.ClangCompiler;
import framework.IoTCompiler;
import javalang.JavalangCompiler;
import lang.IotlangStandaloneSetup;
import lang.iotlang.Bind;
import lang.iotlang.InstanceThing;
import lang.iotlang.IoTLangModel;
import lang.iotlang.NetworkConfiguration;
import lang.iotlang.Policy;
import lang.iotlang.Rule;
import lang.iotlang.Thing;
import lang.iotlang.Topic;


public class EntryPoint {
	public static void main(String[] args) throws IOException {
		procedure();
	}
	public enum PuSubType {  // dans le fichier Civilite.java  
	    PUB, SUB  
	}
	private static void procedure() {
		File input = null;
		input = new File("sample/testing.iotlang");
		
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
        Path currentRelativePath = Paths.get("");
        String pathdirectory = currentRelativePath.toAbsolutePath().toString();
        
        IoTLangModel iotModel = (IoTLangModel) model.getContents().get(0);
        if(iotModel.getNetworkConfigs().get(0).getFormat().equals("sql")) {
        	generateSQLRules(iotModel,pathdirectory);
        }else if(iotModel.getNetworkConfigs().get(0).getFormat().equals("txt")){
        	generateTextRules(iotModel,pathdirectory);
        }
        
        
        
        for (lang.iotlang.InstanceThing th : iotModel.getNetworkConfigs().get(0).getThingInstances()) {
        	String read = th.getTypeThing().getCode().get(0).replace("\"", "");
        	String code ="";
        	try {
				code = readFile("/home/imad/dev/workspaces/iotlang/generators/sample/"+read,StandardCharsets.UTF_8);
	            
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            ThingMLModel thgmodel = loadModel(code);
			System.out.println(read);
            String domainName = iotModel.getNetworkConfigs().get(0).getDomain().get(0).getName().replace("\"", "");
            String thingId= domainName+".5665464";
            String thingPassword= th.getThingPassword().replace("\"", "");
            
            // JAVA
            if(th.getPlatform().equals("java")) {
                File folder = new File(pathdirectory+"/gen/"+iotModel.getNetworkConfigs().get(0).getName()+"/java/"+th.getName());
            	ThingMLCompiler javaCompile = new JavaCompiler();
                JavaMQTTPlugin mqttjava = new JavaMQTTPlugin();
                mqttjava.setmClientId("\""+thingId+"\"");
                mqttjava.setmUsername("\""+thingId+"\"");
                mqttjava.setmPassword("\""+thingPassword+"\"");
                JavaByteArraySerializerPlugin jsonJavaMqtt = new JavaByteArraySerializerPlugin();
                javaCompile.addNetworkPlugin(mqttjava);
                javaCompile.addSerializationPlugin(jsonJavaMqtt);   
                Set<String> topicList = new HashSet<String>();
                for (Bind bind : iotModel.getNetworkConfigs().get(0).getBinds()) {
                	for (Topic topic : bind.getTopics()) {
           				String topicToAdd =domainName.replace(".", "/")+"/"+topic.getName();
                		if(bind.getThingInstance().getName().equals(th.getName())) {
    	            		if(bind.getDirection().equals("=>")) {
    	            			mqttjava.addPubTopic(topicToAdd);
    		       			}else if(bind.getDirection().equals("<=")) {
    		       				mqttjava.addSubTopic(topicToAdd);
    	            		} else {
    	            			mqttjava.addSubTopic(topicToAdd);
    	            			mqttjava.addPubTopic(topicToAdd);
    	            		}
                		}
                	}
           		}  
                javaCompile.setOutputDirectory(folder);
                javaCompile.compile(thgmodel.getConfigs().get(0));
            }else if(th.getPlatform().equals("cposix")) {
                File folder = new File(pathdirectory+"/gen/"+iotModel.getNetworkConfigs().get(0).getName()+"/posix/"+th.getName());

            	 // POSIX
                
                ThingMLCompiler thgCompile = new PosixCompiler();

                PosixMQTTPlugin mqtt = new PosixMQTTPlugin();
                mqtt.setmClientId("\""+thingId+"\"");
                mqtt.setmUsername("\""+thingId+"\"");
                mqtt.setmPassword("\""+thingPassword+"\"");
                CNoneSerializerPlugin jsonposix = new CNoneSerializerPlugin();
                thgCompile.addSerializationPlugin(jsonposix);
                thgCompile.addNetworkPlugin(mqtt);
                
                Set<String> topicList = new HashSet<String>();
                for (Bind bind : iotModel.getNetworkConfigs().get(0).getBinds()) {
                	for (Topic topic : bind.getTopics()) {
           				String topicToAdd =domainName.replace(".", "/")+"/"+topic.getName();
                		if(bind.getThingInstance().getName().equals(th.getName())) {
    	            		if(bind.getDirection().equals("=>")) {
    	            			mqtt.addPubTopic(topicToAdd);
    		       			}else if(bind.getDirection().equals("<=")) {
    		       				mqtt.addSubTopic(topicToAdd);
    	            		} else {
    	            			mqtt.addSubTopic(topicToAdd);
    	            			mqtt.addPubTopic(topicToAdd);
    	            		}
                		}
                	}
           		}                   
                thgCompile.setOutputDirectory(folder);
                thgCompile.compile(thgmodel.getConfigs().get(0));
            } else if(th.getPlatform().equals("arduino")) {
                File folder = new File(pathdirectory+"/gen/"+iotModel.getNetworkConfigs().get(0).getName()+"/arduino/"+th.getName());
            	ThingMLCompiler ardCompile = new ArduinoCompiler();
                ESP8266MQTTPlugin mqttard = new ESP8266MQTTPlugin();
                mqttard.setmClientId("\""+thingId+"\"");
                mqttard.setmUsername("\""+thingId+"\"");
                mqttard.setmPassword("\""+thingPassword+"\"");
                CNoneSerializerPlugin jsonJavaMqtt = new CNoneSerializerPlugin();
                ardCompile.addNetworkPlugin(mqttard);
                ardCompile.addSerializationPlugin(jsonJavaMqtt);   
                Set<String> topicList = new HashSet<String>();
                for (Bind bind : iotModel.getNetworkConfigs().get(0).getBinds()) {
                	for (Topic topic : bind.getTopics()) {
           				String topicToAdd =domainName.replace(".", "/")+"/"+topic.getName();
                		if(bind.getThingInstance().getName().equals(th.getName())) {
    	            		if(bind.getDirection().equals("=>")) {
    	            			mqttard.addPubTopic(topicToAdd);
    		       			}else if(bind.getDirection().equals("<=")) {
    		       				mqttard.addSubTopic(topicToAdd);
    	            		} else {
    	            			mqttard.addSubTopic(topicToAdd);
    	            			mqttard.addPubTopic(topicToAdd);
    	            		}
                		}
                	}
           		}  
                ardCompile.setOutputDirectory(folder);
                ardCompile.compile(thgmodel.getConfigs().get(0));
            }
            for (Topic topic : getTopicsForThing(iotModel,th.getTypeThing(),PuSubType.PUB)) {
				System.out.println("Pub : "+topic.getName());
			}
            for (Topic topic : getTopicsForThing(iotModel,th.getTypeThing(),PuSubType.SUB)) {
				System.out.println("Sub : "+topic.getName());
			}
            setPolicyRules(iotModel,th.getTypeThing());
		}
	}
	
	private static HashSet<Topic> getTopicsForThing(IoTLangModel iotModel,Thing thing, PuSubType puSubType) {
		HashSet<Topic> hs = new HashSet<>();
		EList<Bind> binds = iotModel.getNetworkConfigs().get(0).getBinds();
		for (Bind bind : binds) {
			if(puSubType == puSubType.PUB && bind.getThingInstance().getTypeThing().getName().equals(thing.getName()) && bind.getDirection().contains(">")) {
				for (Topic topic : bind.getTopics()) {
					hs.add(topic);
				}
			} else if(puSubType == puSubType.SUB && bind.getThingInstance().getTypeThing().getName().equals(thing.getName()) && bind.getDirection().contains("<")) {
				for (Topic topic : bind.getTopics()) {
					hs.add(topic);
				}
			}
		}

		return hs;
	}	
	static String readFile(String path, Charset encoding) 
			  throws IOException 
			{
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return new String(encoded, encoding);
			}
	public static ThingMLModel getModelFromRelativeURI(String uri) throws Exception {
		ResourceSet rs = new ResourceSetImpl();
        URI xmiuri = URI.createFileURI(uri);
        Resource model = rs.createResource(xmiuri);
		if (model!= null && model.getContents().size() > 0 && model.getContents().get(0) instanceof ThingMLModel ) {
			return (ThingMLModel)model.getContents().get(0);
		} else {
			throw new Exception("No valid model found for resource "+uri);
		}
	}
	private static void setPolicyRules(IoTLangModel iotModel, Thing thing) {
		Policy policy = iotModel.getPolicies().get(0);
		EList<Bind> binds = iotModel.getNetworkConfigs().get(0).getBinds();
		EList<Bind> binds2 = iotModel.getNetworkConfigs().get(0).getBinds();
		/*for (Rule rule : policy.getHasRules()) {
			if(rule.getSubject().getName().equals(thing.getName())) {
				if(rule.getPermission().equals("deny") && rule.getAction().equals("send")) {
					for (Bind bind : binds) {
						if(bind.getDirection().equals("=>")) {
							System.out.println(bind.getThingInstance().getName()+" before :"+ bind.getDirection());
							bind.setDirection("=");
							System.out.println(bind.getThingInstance().getName()+" after :"+ bind.getDirection());
						} else if(bind.getDirection().equals("<=>")) {
							System.out.println(bind.getThingInstance().getName()+" before :"+ bind.getDirection());
							bind.setDirection("<=");
							System.out.println(bind.getThingInstance().getName()+" after :"+ bind.getDirection());
						}
					}
				}else if(rule.getPermission().equals("deny") && rule.getAction().equals("receive")) {
					for (Bind bind : binds2) {
						if(bind.getDirection().equals("<=")) {
							System.out.println(bind.getThingInstance().getName()+" before :"+ bind.getDirection());
							bind.setDirection("=");
							System.out.println(bind.getThingInstance().getName()+" after :"+ bind.getDirection());
						} else if(bind.getDirection().equals("<=>")) {
							System.out.println(bind.getThingInstance().getName()+" before :"+ bind.getDirection());
							bind.setDirection("=>");
							System.out.println(bind.getThingInstance().getName()+" after :"+ bind.getDirection());
						}
					}
				}else if(rule.getPermission().equals("allow") && rule.getAction().equals("send")) {
					for (Bind bind : iotModel.getNetworkConfigs().get(0).getBinds()) {
						if(!bind.getDirection().contains("=>")) {
							System.out.println(bind.getThingInstance().getName()+" before :"+ bind.getDirection());
							bind.setDirection(bind.getDirection().replace("=", "=>"));
							System.out.println(bind.getThingInstance().getName()+" after :"+ bind.getDirection());
						}
					}
				}else if(rule.getPermission().equals("allow") && rule.getAction().equals("receive")) {
					for (Bind bind : iotModel.getNetworkConfigs().get(0).getBinds()) {
						if(bind.getDirection().contains("=>")) {
							System.out.println(bind.getThingInstance().getName()+" before :"+ bind.getDirection());
							bind.setDirection(bind.getDirection().replace("=", "=>"));
							System.out.println(bind.getThingInstance().getName()+" after :"+ bind.getDirection());
						}
					}
				}
			}
		}*/
		
	}
	 public static ThingMLModel loadModel(String str) {
		 registerThingMLFactory();
	        ResourceSet rs = new ResourceSetImpl();
	        Resource resource = rs.createResource(URI.createURI("dummy:/example.thingml"));
	        InputStream in = new ByteArrayInputStream(str.getBytes());
	        try {
				resource.load(in, rs.getLoadOptions());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resource.getErrors();
			}
	        ThingMLModel model = (ThingMLModel) resource.getContents().get(0);
	        return model;
	    }
	
	public String getTemplateByID(String template_id) {
        final InputStream input = getClass().getClassLoader().getResourceAsStream(template_id);
        String result = null;
        try {
            if (input != null) {
                result = org.apache.commons.io.IOUtils.toString(input, java.nio.charset.Charset.forName("UTF-8"));
                input.close();
            } else {
                System.out.println("[Error] Template not found: " + template_id);
            }
        } catch (Exception e) {
            //e.printStackTrace();
            return null; // the template was not found
        }
        return result;
    }
	
	
	
	
    private static void registerFactory() {
    	IotlangStandaloneSetup.doSetup();
    }
    private static void registerThingMLFactory() {
    	ThingMLStandaloneSetup.doSetup();
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
        } else {
        	log.info("No error was found !");
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
		case "=":
			return 1;
		default:
			return 0;
		}
	}
	protected static String accessConverterTxt(String direction) {
		switch(direction) {
		case "=>":
			return "readwrite";
		case "<=>":
			return "readwrite";
		case "<=":
			return "read";
		case "=":
			return "";
		default:
			return "";
		}
	}
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
				String signature = sign(iotModel.getNetworkConfigs().get(0),bind.getThingInstance());
				for (Topic topic : bind.getTopics()) {
					String topicName = domainName.replace(".", "/")+"/"+topic.getName();
					String accessRight = accessConverterTxt(bind.getDirection());
					if(!accessRight.equals("")) {
					rulesSql.append(
							"user "+iotModel.getNetworkConfigs().get(0).getDomain().get(0).getName().replace("\"", "")+":"+signature+"\n" + 
							"topic "+accessRight+" "+topicName+"\n \n");
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
        sqlFile = new File(pathdirectory+"/gen/"+iotModel.getNetworkConfigs().get(0).getName()+"/acl/acl.sql");
        sqlFile.getParentFile().mkdirs();
		BufferedWriter bufferSql =null;
		try {
			bufferSql = new BufferedWriter(new FileWriter(sqlFile));
			StringBuffer rulesSql = new StringBuffer();
            String domainName = iotModel.getNetworkConfigs().get(0).getDomain().get(0).getName().replace("\"", "");
			for (Bind bind : iotModel.getNetworkConfigs().get(0).getBinds()) {
				String thingName = bind.getThingInstance().getName();
				String signature = sign(iotModel.getNetworkConfigs().get(0),bind.getThingInstance());
				String allID = iotModel.getNetworkConfigs().get(0).getDomain().get(0).getName().replace("\"", "")+":"+signature;
				System.out.println("ID for "+thingName+": " + allID);
				for (Topic topic : bind.getTopics()) {
					String topicName = domainName.replace(".", "/")+"/"+topic.getName();
					int accessRight = accessConverter(bind.getDirection());
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
