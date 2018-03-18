package org.atlanmod.iotlang.generators;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

import org.atlanmod.iotlang.utilities.Utils;
import org.eclipse.emf.common.util.EList;
import org.thingml.compilers.ThingMLCompiler;
import org.thingml.compilers.c.arduino.ArduinoCompiler;
import org.thingml.compilers.c.posix.PosixCompiler;
import org.thingml.compilers.java.JavaCompiler;
import org.thingml.networkplugins.c.CNoneSerializerPlugin;
import org.thingml.networkplugins.c.arduino.ESP8266MQTTPlugin;
import org.thingml.networkplugins.c.posix.PosixMQTTPlugin;
import org.thingml.networkplugins.java.JavaByteArraySerializerPlugin;
import org.thingml.networkplugins.java.JavaMQTTPlugin;
import org.thingml.xtext.thingML.ThingMLModel;

import lang.iotlang.Bind;
import lang.iotlang.InstanceThing;
import lang.iotlang.IoTLangModel;
import lang.iotlang.Policy;
import lang.iotlang.Thing;
import lang.iotlang.Topic;


public class EntryPoint {
	public static void main(String[] args) throws IOException {
		procedure();
		Path currentRelativePath = Paths.get("");
        String pathdirectory = currentRelativePath.toAbsolutePath().toString();
		IoTLangModel iotModel = Utils.getIoTModelFromFile(currentRelativePath,"sample/testing.iotlang");
		System.out.println(iotModel.getNetworkConfigs().get(0).getName());
	}
	public enum PuSubType {
	    PUB, SUB  
	}
	private static void procedure() {
		Path currentRelativePath = Paths.get("");
        String pathdirectory = currentRelativePath.toAbsolutePath().toString();
		 IoTLangModel iotModel = Utils.getIoTModelFromFile(currentRelativePath,"sample/testing.iotlang");
        
        if(iotModel.getNetworkConfigs().get(0).getFormat().equals("sql")) {
        	CodeGenerator.generateSQLRules(iotModel,pathdirectory);
        }else if(iotModel.getNetworkConfigs().get(0).getFormat().equals("txt")){
        	CodeGenerator.generateTextRules(iotModel,pathdirectory);
        } else {
        	
        }
        for (InstanceThing th : iotModel.getNetworkConfigs().get(0).getThingInstances()) {
        	
            ThingMLModel thgmodel = Utils.loadModel(Utils.readFromFile(th));
            Boolean externOk = false;
            
            String domainName = iotModel.getNetworkConfigs().get(0).getDomain().get(0).getName().replace("\"", "");
            String instanceId = Utils.sign(iotModel.getNetworkConfigs().get(0),th);
            String thingId= domainName+"."+instanceId;
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
            for (Topic topic : Utils.getTopicsForThing(iotModel,th.getTypeThing(),PuSubType.PUB)) {
				System.out.println("Pub : "+topic.getName());
			}
            for (Topic topic : Utils.getTopicsForThing(iotModel,th.getTypeThing(),PuSubType.SUB)) {
				System.out.println("Sub : "+topic.getName());
			}
            setPolicyRules(iotModel,th.getTypeThing());
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
}
