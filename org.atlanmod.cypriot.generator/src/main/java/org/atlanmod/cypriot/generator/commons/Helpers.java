package org.atlanmod.cypriot.generator.commons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.atlanmod.cypriot.cyprIoT.NamedElement;
import org.atlanmod.cypriot.generator.templates.FileProcessingTemplate;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class Helpers {

	private static final Logger log = Logger.getLogger(Helpers.class.getName());

	public static String appendStrings(EList<? extends EObject> list,String separator) {
		String currentSeparator = "";
		StringBuilder builder = new StringBuilder();
		for (EObject eObject : list) {
		    builder.append(currentSeparator);
		    if (eObject instanceof NamedElement) {
		        String name = ((NamedElement)eObject).getName();
			    builder.append(name);

		     }
		    currentSeparator = separator;
		}
		return builder.toString();
	}

	/**
	 * Return all types in a given EObject
	 * 
	 * @param model
	 * @return
	 */
	@SuppressWarnings("unchecked") // I know what I am doing
	public static <T extends EObject> ArrayList<T> allTypesInNetwork(EObject supertype, Class<T> type) {
		
		EList<EObject> allChildrenTypes = supertype.eContents();
		ArrayList<T> instanceThings = new ArrayList<T>();
		for (EObject eObject : allChildrenTypes) {
			if (type.isInstance(eObject)) {
				instanceThings.add((T) eObject);
			}
		}
		return instanceThings;
	}

	/**
	 * Read a file and returns its content
	 * 
	 * @param file File to read
	 * @return
	 */
	public static String getContentFromFile(File file) {
		String content = new FileProcessingTemplate() {}.process(file);
		//log.debug(" \n \n ##### File Content "+file.getName()+ " ##### \n \n"+content);
		return content;
	}

	/**
	 * Create a Xtext resource from a file
	 * 
	 * @param file
	 * @param log
	 * @return
	 */
	public static Resource createResourceFromFile(File file) {
		URI xmiuri = URI.createFileURI(file.getAbsolutePath());
		log.debug("URI : " + xmiuri.path());
		ResourceSet rs = new ResourceSetImpl();
		Resource model = rs.createResource(xmiuri);
		return model;
	}

	/**
	 * Get the project version as defined in maven pom.xml
	 * 
	 * @return
	 */
	public static String getProjectVersionFromMaven() {
		try {
			return readVersionMavenFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (XmlPullParserException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * A private method to help separating error handling from logic
	 * 
	 * @return
	 * @throws IOException
	 * @throws XmlPullParserException
	 * @throws FileNotFoundException
	 */
	private static String readVersionMavenFile() throws IOException, XmlPullParserException, FileNotFoundException {
		MavenXpp3Reader reader = new MavenXpp3Reader();
		Model model;
		model = reader.read(new FileReader("../pom.xml"));
		String projectVersion = model.getVersion();
		return projectVersion;
	}

	/**
	 * Check if there are syntactic errors in the model
	 * 
	 * @param model
	 * @param log
	 * @return
	 */
	public static boolean checkProblemsInModel(Resource model) {
		String[] splitURI = model.getURI().toString().split("/");
		String elementNameFromURI = splitURI[splitURI.length-1];
		log.info("Checking for EMF errors and warnings of \""+elementNameFromURI+"\"");
		boolean noErrors = checkErrorsInResource(model);
		checkWarningInResource(model);
		return noErrors;
	}

	/**
	 * Check if there is any error in the model
	 * 
	 * @param model
	 * @param log
	 * @return
	 */
	public static boolean checkErrorsInResource(Resource model) {
		boolean noErrors = true;
		if (model.getErrors().size() > 0) {
			noErrors = false;
			log.error("ERROR: The input model contains " + model.getErrors().size() + " errors.");
			for (Resource.Diagnostic d : model.getErrors()) {
				String location = d.getLocation();
				if (location == null) {
					location = model.getURI().toFileString();
				}
				log.error("Error in file  " + location + " (" + d.getLine() + ", " + d.getColumn() + "): "
						+ d.getMessage());
			}
		}
		log.debug("No error was found in the model.");
		return noErrors;
	}

	/**
	 * Check if there is any warning in the resource
	 * 
	 * @param model
	 * @param log
	 */
	public static boolean checkWarningInResource(Resource model) {
		boolean noWarning = true;
		if (model.getWarnings().size() > 0) {
			noWarning = false;
			log.warn("WARNING: The input model contains " + model.getWarnings().size() + " warnings.");
			for (Resource.Diagnostic d : model.getWarnings()) {
				String location = d.getLocation();
				if (location == null) {
					location = model.getURI().toFileString();
				}
				log.warn("Warning in file  " + location + " (" + d.getLine() + ", " + d.getColumn() + "): "
						+ d.getMessage());
			}
		}
		return noWarning;
	}

}
