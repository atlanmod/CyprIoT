package org.atlanmod.cypriot.generator.models;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.thingml.xtext.ThingMLStandaloneSetup;
import org.thingml.xtext.thingML.ThingMLModel;

/**
 * The {@link ThingMLModelLoader} class loads a ThingML model
 * @author imberium
 *
 */
public class ThingMLModelLoader extends ModelLoader {
	
	private static final Logger log = LogManager.getLogger(ThingMLModelLoader.class.getName());
	
	ThingMLModel thingMLModel;
	
	public ThingMLModelLoader() {
		super();
	}
	
	/**
	 * A method to register the ThingML factory, mandatory to load a model
	 */
	@Override
	protected void registerFactory() {
		log.debug("Registering ThingML factory");
		ThingMLStandaloneSetup.doSetup();
	}
	
	/**
	 * Load a ThingML model from a string
	 * 
	 * @param string
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public ThingMLModel loadModel(File inputFile) {
		return loadFromFile(inputFile, ThingMLModel.class);
	}

}
