package org.atlanmod.cypriot.generator.models;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.atlanmod.cypriot.generator.commons.Utilities;
import org.atlanmod.cypriot.generator.exceptions.ExceptionHandler;
import org.atlanmod.cypriot.generator.exceptions.ModelExceptionHandler;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * The {@link ModelLoader} class loads a model
 * @author imberium
 *
 */
public abstract class ModelLoader {
	
	final protected ExceptionHandler exceptionHandler = new ModelExceptionHandler();
	
	String fileContent;
	
	
	public ModelLoader() {
		registerFactory();
	}
	
	abstract void registerFactory();
	abstract <T extends EObject> T loadModel();
	
	/**
	 * Load the EMF graph of the model from a File
	 * 
	 * @param file
	 * @return
	 * @throws ModelExceptionHandler 
	 */
	public <T extends EObject> T loadFromFile(File file, Class<T> type) {
		Resource model = Utilities.createResourceFromFile(file);
		
		try {
			model.load(null);
			EcoreUtil.resolveAll(model);
			for (Resource ressource : model.getResourceSet().getResources()) {
				if(!Utilities.checkProblemsInModel(ressource)) {
					throw new Exception();
				}
			}
			;
			return type.cast(model.getContents().get(0));

		} catch (Exception e) {
			this.exceptionHandler.handle(e, "The model couldn't be loaded");
		}
		return null;
	}
	
	/**
	 * Load the EMF graph of the model from a String
	 * 
	 * @param string
	 * @return
	 */
	public Resource loadResourceFromString(String string) {
		try {
			return loadStringAsResouce(string);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Load a model from a loaded resource
	 * 
	 * @param resource
	 * @return
	 */

	<T extends EObject> T loadModelFromResource(Resource resource, Class<T> type) {
		T model = type.cast(resource.getContents().get(0));
		return model;
	}

	/**
	 * A private method to help separating error handling from logic
	 * 
	 * @param string
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
	private Resource loadStringAsResouce(String string) throws IOException, Exception {
		ResourceSet rs = new ResourceSetImpl();
		Resource resources = rs.createResource(URI.createURI("dummy:/example.cy"));
		InputStream in = new ByteArrayInputStream(string.getBytes());
		resources.load(in, rs.getLoadOptions());
		EcoreUtil.resolveAll(resources);
		checkProblemsInChildResources(resources);
		return resources;
	}
	

	/**
	 * @param resources
	 * @throws Exception
	 */
	private void checkProblemsInChildResources(Resource resources) throws Exception {
		for (Resource r : resources.getResourceSet().getResources()) {
			if(!Utilities.checkProblemsInModel(r)) {
				throw new Exception();
			}
		}
	}
}
