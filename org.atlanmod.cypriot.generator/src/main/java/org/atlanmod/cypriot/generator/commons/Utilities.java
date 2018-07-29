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
import org.atlanmod.cypriot.CypriotStandaloneSetup;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.thingml.xtext.ThingMLStandaloneSetup;
import org.thingml.xtext.thingML.ThingMLModel;

public class Utilities {

	static final Logger log = Logger.getLogger(Utilities.class.getName());

	/**
	 * @param textToWrite
	 * @param fileName
	 * @param fileExtenstion
	 * @return
	 */
	public static File writeStringToFile(String textToWrite, String fileName, String fileExtenstion) {
		File file = null;
		FileWriter fw =null;
		BufferedWriter bw = null;
		try {
			file = File.createTempFile( fileName, fileExtenstion);
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(textToWrite);
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
		String content = null;
		FileReader reader = null;
		try {
			reader = new FileReader(file);
			char[] chars = new char[(int) file.length()];
			reader.read(chars);
			content = new String(chars);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return content;
	}

	/**
	 * A method to register the ThingML factory, mandatory to load a model
	 */
	public static void registerThingMLFactory() {
		ThingMLStandaloneSetup.doSetup();
	}

	/**
	 * A method to register the Cypriot factory, mandatory to load a model
	 */
	public static void registerCypriotFactory() {
		CypriotStandaloneSetup.doSetup();
	}

	/**
	 * Load a ThingML model from a string
	 * 
	 * @param string
	 * @return
	 */
	public static ThingMLModel loadThingMLModelFromString(String string) {
		registerThingMLFactory();
		Resource resource = loadResourceFromString(string);
		ThingMLModel model = loadThingMLModelFromResource(resource);
		return model;
	}

	/**
	 * Load a Cypriot model from a string
	 * 
	 * @param string
	 * @return
	 */
	public static CyprIoTModel loadCypriotModelFromString(String str) {
		registerCypriotFactory();
		Resource resource = loadResourceFromString(str);
		CyprIoTModel model = loadCypriotModelFromResource(resource);
		return model;
	}

	/**
	 * Load a ThingML model from a loaded resource
	 * 
	 * @param resource
	 * @return
	 */

	public static ThingMLModel loadThingMLModelFromResource(Resource resource) {
		ThingMLModel model = (ThingMLModel) resource.getContents().get(0);
		return model;
	}

	/**
	 * Load the EMF graph of the model from a File
	 * 
	 * @param file
	 * @return
	 */
	public static CyprIoTModel loadCypriotModelFromFile(File file) {
		registerCypriotFactory();
		ResourceSet rs = new ResourceSetImpl();
		URI xmiuri = URI.createFileURI(file.getAbsolutePath());
		log.debug("URI : "+ xmiuri.path());
		Resource model = rs.createResource(xmiuri);
		try {
			model.load(null);
			EcoreUtil.resolveAll(model);
			for (Resource r : model.getResourceSet().getResources()) {
				checkEMFErrorsAndWarnings(r, log);
			}
			CyprIoTModel m = (CyprIoTModel) model.getContents().get(0);
			return m;

		} catch (Exception e) {
			log.error("Error loading CyprIoT model", e);
		}
		return null;
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
				checkEMFErrorsAndWarnings(r, log);
			}
		} catch (IOException e) {
			e.printStackTrace();
			resource.getErrors();
		}
		return resource;
	}

	/**
	 * Load a Cypriot model from a loaded resource
	 * 
	 * @param resource
	 * @return
	 */
	public static CyprIoTModel loadCypriotModelFromResource(Resource resource) {
		CyprIoTModel model = (CyprIoTModel) resource.getContents().get(0);
		return model;
	}

	/**
	 * Get the project version as defined in maven pom.xml
	 * 
	 * @return
	 */
	public static String getProjectVersion() {
		MavenXpp3Reader reader = new MavenXpp3Reader();
		Model model;
		try {
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

	private static boolean checkEMFErrorsAndWarnings(Resource model, Logger log) {
		log.info("Checking for EMF errors and warnings");
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
		return isOK;
	}
}
