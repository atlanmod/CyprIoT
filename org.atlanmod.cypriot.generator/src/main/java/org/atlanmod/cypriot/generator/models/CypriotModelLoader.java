package org.atlanmod.cypriot.generator.models;

import java.io.File;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.CypriotStandaloneSetup;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * The {@link CypriotModelLoader} class loads a CyprIoT model
 * @author imberium
 *
 */
public class CypriotModelLoader extends ModelLoader {
	
	private static final Logger log = Logger.getLogger(CypriotModelLoader.class.getName());
	
	CyprIoTModel cypriotModel;
		
	public CypriotModelLoader() {
		super();
	}
	
	public CypriotModelLoader(String fileContent) {
		super();
		this.fileContent=fileContent;
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
	@SuppressWarnings("unchecked") // I know what I am doing
	@Override
	protected CyprIoTModel loadModel() {
		Resource resource = loadResourceFromString(fileContent);
		cypriotModel = loadModelFromResource(resource,CyprIoTModel.class);
		return cypriotModel;
	}

	public CyprIoTModel loadFromFile(File file) {
		return loadFromFile(file, CyprIoTModel.class);
	}
}
