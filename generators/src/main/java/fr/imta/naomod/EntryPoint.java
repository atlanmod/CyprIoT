package fr.imta.naomod;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import lang.IotlangStandaloneSetup;
import lang.iotlang.Instance;
import lang.iotlang.IoTLangModel;
import lang.iotlang.Type;

public class EntryPoint {
	public static void main(String[] args){
		File input = null;
		input = new File("testing.iotlang");
		BufferedWriter output=null;
		try {
		output = new BufferedWriter(new FileWriter(input));
			output.write("thing Hello {\n" + 
					"	statechart myStatechart init one {\n" + 
					"		state one {\n" + 
					"			on entry do print \"Hello world\" end \n" + 
					"		}\n" + 
					"	}\n" + 
					"\n" + 
					"}\n" + 
					"\n" + 
					"thing Hello2 {\n" + 
					"	statechart myStatechart init one {\n" + 
					"		state one {\n" + 
					"			on entry do print \"Hello world\" end \n" + 
					"		}\n" + 
					"	}\n" + 
					"\n" + 
					"}\n" + 
					"\n" + 
					"configuration helloexec \n" + 
					"{\n" + 
					"	instance hello:Hello\n" + 
					"	instance hello2:Hello2\n" + 
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
        outputFile = new File("main.c");
		BufferedWriter buffer=null;
                
		try {
		buffer = new BufferedWriter(new FileWriter(outputFile));
		 buffer.write("Config : "+m.getConfigs().get(0).getName()+"\n");
		for (Type type : m.getTypes()) {
			buffer.write("Thing : "+type.getName()+"\n");
		}
		
		for (Instance config : m.getConfigs().get(0).getInstances()) {
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
