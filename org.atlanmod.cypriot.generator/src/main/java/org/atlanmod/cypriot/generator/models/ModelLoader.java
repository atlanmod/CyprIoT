package org.atlanmod.cypriot.generator.models;

import java.io.File;

import org.atlanmod.cypriot.generator.utilities.Helpers;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * The {@link ModelLoader} class loads a model
 * @author imberium
 *
 */
public abstract class ModelLoader {
	
	String fileContent;
	
	
	public ModelLoader() {
		registerFactory();
	}
	
	protected abstract void registerFactory();
	public abstract <T extends EObject> T loadModel(File inputFile);
	
	/**
	 * Load the EMF graph of the model from a File
	 * 
	 * @param file
	 * @return
	 * @throws ModelExceptionHandler 
	 */
	protected <T extends EObject> T loadFromFile(File file, Class<T> type) {
		Resource model = Helpers.createEMFResourceFromFile(file);
		
		try {
			model.load(null);
			EcoreUtil.resolveAll(model);
			for (Resource ressource : model.getResourceSet().getResources()) {
				if(!Helpers.checkProblemsInEMFResource(ressource)) {
					throw new Exception();
				}
			}
			;
			return type.cast(model.getContents().get(0));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
