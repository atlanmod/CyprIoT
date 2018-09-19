package org.atlanmod.cypriot.generator.models;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.atlanmod.cypriot.generator.commons.Helpers;
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
	
	String fileContent;
	
	
	public ModelLoader() {
		registerFactory();
	}
	
	protected abstract void registerFactory();
	protected abstract <T extends EObject> T loadModel();
	
	/**
	 * Load the EMF graph of the model from a File
	 * 
	 * @param file
	 * @return
	 * @throws ModelExceptionHandler 
	 */
	protected <T extends EObject> T loadFromFile(File file, Class<T> type) {
		Resource model = Helpers.createResourceFromFile(file);
		
		try {
			model.load(null);
			EcoreUtil.resolveAll(model);
			for (Resource ressource : model.getResourceSet().getResources()) {
				if(!Helpers.checkProblemsInModel(ressource)) {
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
	
	/**
	 * Load the EMF graph of the model from a String
	 * 
	 * @param string
	 * @return
	 */
	protected Resource loadResourceFromString(String string) {
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
			if(!Helpers.checkProblemsInModel(r)) {
				throw new Exception();
			}
		}
	}
}
