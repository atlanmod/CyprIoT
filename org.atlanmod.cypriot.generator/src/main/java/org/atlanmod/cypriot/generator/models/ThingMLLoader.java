package org.atlanmod.cypriot.generator.models;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.generator.commons.Utilities;
import org.eclipse.emf.ecore.resource.Resource;
import org.thingml.xtext.ThingMLStandaloneSetup;
import org.thingml.xtext.thingML.ThingMLModel;

public class ThingMLLoader extends Model {
	
	static final Logger log = Logger.getLogger(Utilities.class.getName());
	
	ThingMLModel thingMLModel;
	@Override
	void loadModel() {

	}

	/**
	 * A method to register the ThingML factory, mandatory to load a model
	 */	
	@Override
	public void registerFactory() {
		ThingMLStandaloneSetup.doSetup();
	}
	
	/**
	 * Load a ThingML model from a string
	 * 
	 * @param string
	 * @return
	 */
	ThingMLModel loadThingMLModelFromString(String string) {
		registerFactory();
		Resource resource = Utilities.loadResourceFromString(string);
		thingMLModel = loadThingMLModelFromResource(resource);
		return thingMLModel;
	}
	


	/**
	 * Load a ThingML model from a loaded resource
	 * 
	 * @param resource
	 * @return
	 */

	public ThingMLModel loadThingMLModelFromResource(Resource resource) {
		ThingMLModel model = (ThingMLModel) resource.getContents().get(0);
		return model;
	}
}
