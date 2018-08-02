package org.atlanmod.cypriot.generator.models;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.thingml.xtext.ThingMLStandaloneSetup;
import org.thingml.xtext.thingML.ThingMLModel;

/**
 * The {@link ThingMLModelLoader} class loads a ThingML model
 * @author imberium
 *
 */
public class ThingMLModelLoader extends ModelLoader {
	
	private static final Logger log = Logger.getLogger(ThingMLModelLoader.class.getName());
	
	ThingMLModel thingMLModel;
	
	public ThingMLModelLoader() {
		super();
	}
	
	public ThingMLModelLoader(String fileContent) {
		super();
		this.fileContent=fileContent;
	}
	
	/**
	 * A method to register the ThingML factory, mandatory to load a model
	 */
	@Override 
	void registerFactory() {
		log.debug("Registering ThingML factory");
		ThingMLStandaloneSetup.doSetup();
	}
	
	/**
	 * Load a ThingML model from a string
	 * 
	 * @param string
	 * @return
	 */
	@Override
	public ThingMLModel loadModel() {
		Resource resource = loadResourceFromString(fileContent);
		thingMLModel = loadModelFromResource(resource,ThingMLModel.class);
		return thingMLModel;
	}


}
