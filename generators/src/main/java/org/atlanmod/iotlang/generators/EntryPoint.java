package org.atlanmod.iotlang.generators;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.atlanmod.iotlang.utilities.Utils;
import org.eclipse.emf.common.util.EList;
import org.thingml.compilers.ThingMLCompiler;
import org.thingml.compilers.c.arduino.ArduinoCompiler;
import org.thingml.compilers.c.posix.PosixCompiler;
import org.thingml.compilers.java.JavaCompiler;
import org.thingml.networkplugins.c.arduino.ESP8266MQTTPlugin;
import org.thingml.networkplugins.c.posix.PosixJSONSerializerPlugin;
import org.thingml.networkplugins.c.posix.PosixMQTTPlugin;
import org.thingml.networkplugins.java.JavaJSONSerializerPlugin;
import org.thingml.networkplugins.java.JavaMQTTPlugin;
import org.thingml.xtext.helpers.ConfigurationHelper;
import org.thingml.xtext.thingML.ExternalConnector;
import org.thingml.xtext.thingML.Instance;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xtext.thingML.Port;
import org.thingml.xtext.thingML.Protocol;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLModel;
import lang.iotlang.Bind;
import lang.iotlang.InstanceThing;
import lang.iotlang.IoTLangModel;
import lang.iotlang.Policy;
import lang.iotlang.Role;
import lang.iotlang.Rule;
import lang.iotlang.Thing;
import lang.iotlang.Topic;
import lang.util.Helpers;


public class EntryPoint {
	private static boolean isErrorFree=true;
	public static void main(String[] args) throws IOException {
		 IoTLangModel iotModel = Utils.getIoTModelFromFile("sample/networkConfig.iotlang");	        
		 for (Thing thing : iotModel.getThings()) {
			 if(!ThingMLConfigExists(thing)) {
				 isErrorFree = false;
			 }
			 
		 }
		if(isErrorFree) {
			procedure(iotModel);
		}else {
			System.err.println("There are some errors in your model");
		}
	}
	
	public enum PuSubType {
	    PUB, SUB  
	}
	
	public static boolean ThingMLConfigExists(Thing thing) {
		File input = null;
		Path currentRelativePath = Paths.get("");
        String pathdirectory = currentRelativePath.toAbsolutePath().toString();
    	String read = thing.getCode().get(0).replace("\"", "");
    	input = new File(pathdirectory+"/sample/"+read);
    	ThingMLModel thgmodel = ThingMLCompiler.loadModel(input);
        if(thgmodel.getConfigs().size()==0) {
        	System.err.println("No Configuration found in the ThingML file for '"+thing.getName()+"'");
        	return false;
        } else {
        	System.out.println("Configuration found !");
        	for (Instance instance : thgmodel.getConfigs().get(0).getInstances()) {
        		if(instance.getType().getName().equals(thing.getName())) {
        			System.out.println("Thing "+thing.getName()+" found in ThingML file !");
        			for(lang.iotlang.Port port : thing.getPorts()) {
        				if(instance.getType().getPorts().stream().map(Port::getName).filter(port.getName()::equals).findFirst().isPresent()) {
                			System.out.println("Port "+port.getName()+" for thing '"+instance.getType().getName()+"'  found in ThingML file !");
        				}else {
                			System.err.println("Port "+port.getName()+" for thing '"+instance.getType().getName()+"' not found in ThingML file !");
                			return false;
        				}
        			}

        		}
        		//System.err.println("Thing '"+thing.getName()+"' not found in ThingML file");
			}
        }
        return true;
	}

	private static void procedure(IoTLangModel iotModel) {
		Path currentRelativePath = Paths.get("");
        String pathdirectory = currentRelativePath.toAbsolutePath().toString();
        if(iotModel.getNetworkConfigs().get(0).getFormat().equals("sql")) {
        	CodeGenerator.generateSQLRules(iotModel,pathdirectory);
        }else if(iotModel.getNetworkConfigs().get(0).getFormat().equals("txt")){
        	CodeGenerator.generateTextRules(iotModel,pathdirectory);
        } else {
        	
        }
        for (InstanceThing th : iotModel.getNetworkConfigs().get(0).getThingInstances()) {
        	            
            String domainName = iotModel.getNetworkConfigs().get(0).getDomain().get(0).getName().replace("\"", "");
            String instanceId = Utils.sign(iotModel.getNetworkConfigs().get(0),th);
            String thingId= domainName+"."+instanceId;
            String thingPassword= th.getThingPassword().replace("\"", "");
            File input = null;
    		String read = th.getTypeThing().getCode().get(0).replace("\"", "");
    		input = new File(pathdirectory+"/sample/"+read);
            ThingMLModel thgmodel = ThingMLCompiler.loadModel(input);
            Protocol protocol = ThingMLFactory.eINSTANCE.createProtocol();
            protocol.setName("MQTT");
			PlatformAnnotation anotHost = ThingMLFactory.eINSTANCE.createPlatformAnnotation();
			anotHost.setName("mqtt_broker_address");
			anotHost.setValue(iotModel.getNetworkConfigs().get(0).getBinds().get(0).getPubSubInstance().getHost().replace("\"", ""));
			
			PlatformAnnotation anotPort = ThingMLFactory.eINSTANCE.createPlatformAnnotation();
			anotPort.setName("mqtt_port_number");
			anotPort.setValue(iotModel.getNetworkConfigs().get(0).getBinds().get(0).getPubSubInstance().getPort().replace("\"", ""));
			
			PlatformAnnotation anotSerializer = ThingMLFactory.eINSTANCE.createPlatformAnnotation();
			anotSerializer.setName("serializer");
			anotSerializer.setValue("JSON");
			
			
			protocol.getAnnotations().add(anotHost);
			protocol.getAnnotations().add(anotPort);
			protocol.getAnnotations().add(anotSerializer);
            thgmodel.getProtocols().add(protocol);
			List<ExternalConnector> extrn = ConfigurationHelper.getExternalConnectors(thgmodel.getConfigs().get(0));
            extrn.get(0).setProtocol(protocol);
			/*ExternalConnector externalConnector;
            externalConnector = ThingMLFactory.eINSTANCE.createExternalConnector();
            Protocol protocol;
            protocol = ThingMLFactory.eINSTANCE.createProtocol();
            thgmodel.eSet(ThingMLPackage.THING_ML_MODEL__PROTOCOLS, protocol);
            Port portX = thgmodel.getConfigs().get(0).getInstances().get(0).getType().getPorts().get(0);
            externalConnector.setPort(portX);
            thgmodel.getConfigs().get(0).eContents().add(externalConnector);*/
            // JAVA
            if(th.getPlatform().equals("java")) {
                File folder = new File(pathdirectory+"/gen/"+iotModel.getNetworkConfigs().get(0).getName()+'/'+th.getName()+"/java/");
//                ThingMLCompilerRegistry registry = ThingMLCompilerRegistry.getInstance();
//                ThingMLCompiler javaCompile = registry.createCompilerInstanceByName("java");
                ThingMLCompiler javaCompile = new JavaCompiler();
                JavaMQTTPlugin mqttjava = new JavaMQTTPlugin();
                mqttjava.setmClientId("\""+thingId+"\"");
                mqttjava.setmUsername("\""+thingId+"\"");
                mqttjava.setmPassword("\""+thingPassword+"\"");
                JavaJSONSerializerPlugin jsonJavaMqtt = new JavaJSONSerializerPlugin();
                javaCompile.addNetworkPlugin(mqttjava);
                javaCompile.addSerializationPlugin(jsonJavaMqtt);   
                Set<String> topicList = new HashSet<String>();
   				
                for (Bind bind : iotModel.getNetworkConfigs().get(0).getBinds()) {
                	for (Topic topic : bind.getTopics()) {
                		String topicToAdd = domainName.replace(".", "/")+"/"+topic.getName()+'/'+th.getName();
           				addTopicToThg(bind, th, thgmodel, topicToAdd);

                	}
           		}  
                javaCompile.setOutputDirectory(folder);
                javaCompile.compile(thgmodel.getConfigs().get(0));
            }else if(th.getPlatform().equals("cposix")) {
                File folder = new File(pathdirectory+"/gen/"+iotModel.getNetworkConfigs().get(0).getName()+'/'+th.getName()+"/posix/");
          	
				// POSIX               
                
               // ThingMLCompilerRegistry registry =  ThingMLCompilerRegistry.getInstance();
                //ThingMLCompiler thgCompile = registry.createCompilerInstanceByName("posix");
                PosixCompiler thgCompile = new PosixCompiler();
                PosixMQTTPlugin mqtt = new PosixMQTTPlugin();
                
                mqtt.setmClientId("\""+thingId+"\"");
                mqtt.setmUsername("\""+thingId+"\"");
                mqtt.setmPassword("\""+thingPassword+"\"");
                PosixJSONSerializerPlugin jsonposix = new PosixJSONSerializerPlugin();
                thgCompile.addSerializationPlugin(jsonposix);
                
                thgCompile.addNetworkPlugin(mqtt);
                
                Set<String> topicList = new HashSet<String>();
                for (Bind bind : iotModel.getNetworkConfigs().get(0).getBinds()) {
                	for (Topic topic : bind.getTopics()) {
           				String topicToAdd =domainName.replace(".", "/")+"/"+topic.getName()+'/'+th.getName();
           				addTopicToThg(bind, th, thgmodel, topicToAdd);
                	}
           		}
                thgCompile.setOutputDirectory(folder);
                thgCompile.compile(thgmodel.getConfigs().get(0));
            } else if(th.getPlatform().equals("arduino")) {
                File folder = new File(pathdirectory+"/gen/"+iotModel.getNetworkConfigs().get(0).getName()+'/'+th.getName()+"/arduino/");
//                ThingMLCompilerRegistry registry = ThingMLCompilerRegistry.getInstance();
//                ThingMLCompiler ardCompile = registry.createCompilerInstanceByName("arduino");
                
                ThingMLCompiler ardCompile = new ArduinoCompiler();
                ESP8266MQTTPlugin mqttard = new ESP8266MQTTPlugin();
                mqttard.setmClientId("\""+thingId+"\"");
                mqttard.setmUsername("\""+thingId+"\"");
                mqttard.setmPassword("\""+thingPassword+"\"");
                PosixJSONSerializerPlugin jsonJavaMqtt = new PosixJSONSerializerPlugin();
                ardCompile.addNetworkPlugin(mqttard);
                ardCompile.addSerializationPlugin(jsonJavaMqtt);   
                Set<String> topicList = new HashSet<String>();
                for (Bind bind : iotModel.getNetworkConfigs().get(0).getBinds()) {
                	for (Topic topic : bind.getTopics()) {
           				String topicToAdd =domainName.replace(".", "/")+"/"+topic.getName()+'/'+th.getName();
           				addTopicToThg(bind, th, thgmodel, topicToAdd);
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
            //checkPolicyRules(iotModel,th.getTypeThing());
		}
	}
	
	public static void addTopicToThg(Bind bind, InstanceThing th, ThingMLModel thgmodel, String topicToAdd) {
			if(th.getName().equals(bind.getThingInstance().getName())) {
   				if(bind.getDirection().equals("=>")) {
   					List<ExternalConnector> extrn = ConfigurationHelper.getExternalConnectors(thgmodel.getConfigs().get(0));
   					PlatformAnnotation anot = ThingMLFactory.eINSTANCE.createPlatformAnnotation();
   					anot.setName("mqtt_publish_topic");
   					anot.setValue(topicToAdd);
   					extrn.get(0).getAnnotations().add(anot);
       			} else if(bind.getDirection().equals("<=")) {
       				List<ExternalConnector> extrn = ConfigurationHelper.getExternalConnectors(thgmodel.getConfigs().get(0));
   					PlatformAnnotation anot = ThingMLFactory.eINSTANCE.createPlatformAnnotation();
   					anot.setName("mqtt_subscribe_topic");
   					anot.setValue(topicToAdd);
   					extrn.get(0).getAnnotations().add(anot);
        		} else {
        			List<ExternalConnector> extrn = ConfigurationHelper.getExternalConnectors(thgmodel.getConfigs().get(0));
        			PlatformAnnotation anot = ThingMLFactory.eINSTANCE.createPlatformAnnotation();
   					PlatformAnnotation anot2 = ThingMLFactory.eINSTANCE.createPlatformAnnotation();
   					anot.setName("mqtt_publish_topic");
   					anot.setValue(topicToAdd);
   					anot2.setName("mqtt_subscribe_topic");
   					anot2.setValue(topicToAdd);
   					extrn.get(0).getAnnotations().add(anot);
   					extrn.get(0).getAnnotations().add(anot2);
        		}
				}
	}
	private static boolean checkPolicyRules(IoTLangModel iotModel,InstanceThing th, Topic topicToAdd) {
		Policy policy = iotModel.getPolicies().get(0);
		EList<Rule> rules = policy.getHasRules();
		EList<Bind> binds = iotModel.getNetworkConfigs().get(0).getBinds();
		
		for (Bind bind : binds) {
			
		}
		
		
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
		return false;
	}
}
