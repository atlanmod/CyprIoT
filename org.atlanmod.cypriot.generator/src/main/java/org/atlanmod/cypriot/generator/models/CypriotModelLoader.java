package org.atlanmod.cypriot.generator.models;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.CypriotStandaloneSetup;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.eclipse.emf.ecore.resource.Resource;

public class CypriotModelLoader extends ModelLoader {
	
	private static final Logger log = Logger.getLogger(CypriotModelLoader.class.getName());
	
	CyprIoTModel cypriotModel;
		
	public CypriotModelLoader() {
		super();
	}
	
	/**
	 * A method to register the Cypriot factory, mandatory to load a model
	 */
	@Override
	void registerFactory() {
		log.debug("Registering Cypriot factory");
		CypriotStandaloneSetup.doSetup();
	}
	
	/**
	 * Load a Cypriot model from a string
	 * 
	 * @param string
	 * @return
	 */
	CyprIoTModel loadCypriotModelFromString(String string) {
		Resource resource = loadResourceFromString(string);
		cypriotModel = loadModelFromResource(resource,CyprIoTModel.class);
		return cypriotModel;
	}

}
