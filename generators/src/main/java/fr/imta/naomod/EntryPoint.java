package fr.imta.naomod;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import lang.IotlangStandaloneSetup;
import lang.iotlang.InstanceThing;
import lang.iotlang.IoTLangModel;

public class EntryPoint {
	public static void main(String[] args){
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
					"	// Arduino qui récupère la temparature puis l'envoie via Zigbee\n" + 
					"}\n" + 
					"\n" + 
					"thing AirConditionner {\n" + 
					"	// Arduino qui fait fonctionner un climatiseur\n" + 
					"}\n" + 
					"\n" + 
					"bus ZigbeeBus {\n" + 
					"	// Envoie de message de l'arduino\n" + 
					"	channel defaultChannel\n" + 
					"}\n" + 
					"\n" + 
					"bus MqttBus {\n" + 
					"	// Envoie de message de la gateway au cloud\n" + 
					"	channel  room1 = \"myRoom\"\n" + 
					"}\n" + 
					"\n" + 
					"bus BluetoothBus {\n" + 
					"	// Envoie de message de la gateway au cloud\n" + 
					"	channel  room1 = \"myRoom\"\n" + 
					"}\n" + 
					"\n" + 
					"policy roomPolicy {\n" + 
					"	rule Temperature allow action:receive?AirConditionner\n" + 
					"	rule AirConditionner allow action:receive?Temperature\n" + 
					"}\n" + 
					"\n" + 
					"networkConfiguration wsnConfiguration {\n" + 
					"	domain \"fr.imt.dapi.roomA246\" // thing of  the same domain share the same secret key, a configuration can be deployed into different domain but the domain has to change\n" + 
					"	instancePolicy mypolicy:roomPolicy\n" + 
					"	enforce mypolicy	 // Will check if the configuration respect the policy, if there is any \n" + 
					"						//conflict with the configuration the policy will override it\n" + 
					"	instanceThing instanceTemp[10]:Temperature //@platform \"*:*\"\n" + 
					"	instanceBus mqtt:MqttBus //@platform \"*:*\"\n" + 
					"	instanceBus mqttBus:MqttBus //@platform \"*:*\"\n" + 
					"	bind instanceTemp => mqtt{room1}\n" + 
					"}");
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
        
        IoTLangModel m = (IoTLangModel) model.getContents().get(0);
        
        File outputFile = null;
        outputFile = new File("main.ino");
		BufferedWriter buffer=null;
                
		try {
		buffer = new BufferedWriter(new FileWriter(outputFile));
		buffer.write("#include <dht.h>\n" + 
				"\n" + 
				"dht DHT;\n" + 
				"\n" + 
				"#define DHT11_PIN 8\n" + 
				"#include <SoftwareSerial.h>\n" + 
				"\n" + 
				"SoftwareSerial mySerial(10, 11); // RX, TX\n" + 
				"\n" + 
				"void setup(){\n" + 
				"  mySerial.begin(9600);\n" + 
				"}\n" + 
				"\n" + 
				"void loop()\n" + 
				"{\n" + 
				"  int chk = DHT.read11(DHT11_PIN);\n" + 
				"\n" + 
				"  mySerial.println(DHT.temperature);\n" + 
				"  mySerial.println(DHT.humidity);\n" + 
				"  \n" + 
				"  delay(1000);\n" + 
				"}\n" + 
				"");
		 buffer.write("Config : "+m.getConfigs().get(0).getName()+"\n");
		
		for (InstanceThing config : m.getConfigs().get(0).getInstances()) {
			buffer.write("Instance : "+config.getName()+"\n");
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
}
