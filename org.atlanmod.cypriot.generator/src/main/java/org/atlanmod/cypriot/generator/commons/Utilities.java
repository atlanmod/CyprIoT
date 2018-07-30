package org.atlanmod.cypriot.generator.commons;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.atlanmod.cypriot.generator.templates.FileProcessingTemplate;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class Utilities {

	static final Logger log = Logger.getLogger(Utilities.class.getName());

	/**
	 * Write a given string into a temporary file
	 * @param textToWrite
	 * @param fileName
	 * @param fileExtenstion
	 * @return
	 */
	public static File writeStringToTemporaryFile(String textToWrite, String fileName, String fileExtenstion, Logger log) {
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			log.debug("Creating a temporary file("+fileName+fileExtenstion+")");
			file = File.createTempFile( fileName, fileExtenstion);
			file.deleteOnExit();
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(textToWrite);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();
			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
		log.debug("File Content : " + getContentFromFile(file) );
		log.debug("Absolute Path : " + file.getAbsolutePath());
		return file;
	}
	
	/**
	 * Read a file and returns its content
	 * 
	 * @param file File to read
	 * @return
	 */
	public static String getContentFromFile(File file) {
		return new FileProcessingTemplate(){}.process(file);
	}

	/**
	 * Create a Xtext resource from a file
	 * @param file
	 * @param log
	 * @return
	 */
	public static Resource createResourceFromFile(File file, Logger log) {
		URI xmiuri = URI.createFileURI(file.getAbsolutePath());
		log.debug("URI : "+ xmiuri.path());
		ResourceSet rs = new ResourceSetImpl();
		Resource model = rs.createResource(xmiuri);
		return model;
	}

	/**
	 * Load the EMF graph of the model from a String
	 * 
	 * @param string
	 * @return
	 */
	public static Resource loadResourceFromString(String string) {
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createURI("dummy:/example.cy"));
		InputStream in = new ByteArrayInputStream(string.getBytes());
		try {
			resource.load(in, rs.getLoadOptions());
			EcoreUtil.resolveAll(resource);
			for (Resource r : resource.getResourceSet().getResources()) {
				if(!checkErrorsInModel(r, log)) {
					throw new Exception();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			resource.getErrors();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resource;
	}

	/**
	 * Get the project version as defined in maven pom.xml
	 * 
	 * @return
	 */
	public static String getProjectVersion() {
		try {
			MavenXpp3Reader reader = new MavenXpp3Reader();
			Model model;
			model = reader.read(new FileReader("../pom.xml"));
			String projectVersion = model.getVersion();
			return projectVersion;
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
	 * Check if there are syntactic errors in the model
	 * @param model
	 * @param log
	 * @return
	 */
	public static boolean checkErrorsInModel(Resource model, Logger log) {
		log.info("Checking for EMF errors and warnings");
		boolean noErrors = checkErrorsInResource(model, log);
		checkWarningInResource(model, log);
		return noErrors;
	}

	/**
	 * Check if there is any error in the model
	 * @param model
	 * @param log
	 * @return
	 */
	public static boolean checkErrorsInResource(Resource model, Logger log) {
		boolean isOK = true;
		if (model.getErrors().size() > 0) {
			isOK = false;
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
		return isOK;
	}

	/**
	 * Check if there is any warning in the resource
	 * @param model
	 * @param log
	 */
	public static void checkWarningInResource(Resource model, Logger log) {
		if (model.getWarnings().size() > 0) {
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
	}
	
}
