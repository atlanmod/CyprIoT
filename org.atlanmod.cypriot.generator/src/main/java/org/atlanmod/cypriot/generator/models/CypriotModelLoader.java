package org.atlanmod.cypriot.generator.models;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.CypriotStandaloneSetup;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;

/**
 * The {@link CypriotModelLoader} class is responsible for loading a CyprIoT model
 * @author imberium
 *
 */
public class CypriotModelLoader extends ModelLoader {
	
	private static final Logger log = LogManager.getLogger(CypriotModelLoader.class.getName());
	
	CyprIoTModel cypriotModel;
		
	public CypriotModelLoader() {
		super();
	}
	
	/**
	 * A method to register the Cypriot factory, mandatory to load a model
	 */
	@Override
	protected void registerFactory() {
		log.debug("Registering Cypriot factory");
		CypriotStandaloneSetup.doSetup();
	}
	
	/**
	 * Load a Cypriot model from a string
	 * 
	 * @param string
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public CyprIoTModel loadModel(File inputFile) {
		return loadFromFile(inputFile, CyprIoTModel.class);
	}
}
