package org.atlanmod.cypriot.generator.models;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.CypriotStandaloneSetup;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.commons.Utilities;
import org.eclipse.emf.ecore.resource.Resource;

public class CypriotLoader extends Model {
	
	static final Logger log = Logger.getLogger(Utilities.class.getName());
	
	CyprIoTModel cypriotModel;
	@Override
	void loadModel() {
		
	}
	
	/**
	 * A method to register the Cypriot factory, mandatory to load a model
	 */
	public void registerFactory() {
		CypriotStandaloneSetup.doSetup();
	}
	
	/**
	 * Load a Cypriot model from a string
	 * 
	 * @param string
	 * @return
	 */
	CyprIoTModel loadCypriotModelFromString(String str) {
		registerFactory();
		Resource resource = Utilities.loadResourceFromString(str);
		cypriotModel = loadCypriotModelFromResource(resource);
		return cypriotModel;
	}
	
	/**
	 * Load a Cypriot model from a loaded resource
	 * 
	 * @param resource
	 * @return
	 */
	public CyprIoTModel loadCypriotModelFromResource(Resource resource) {
		CyprIoTModel model = (CyprIoTModel) resource.getContents().get(0);
		return model;
	}

}
