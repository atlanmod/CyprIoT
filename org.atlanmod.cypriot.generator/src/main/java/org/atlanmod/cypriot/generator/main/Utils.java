package org.atlanmod.cypriot.generator.main;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.atlanmod.cypriot.CypriotStandaloneSetup;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.thingml.xtext.ThingMLStandaloneSetup;
import org.thingml.xtext.thingML.ThingMLModel;

public class Utils {
	
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
	 * @param string
	 * @return
	 */
	public static ThingMLModel loadThingMLModelFromString(String string) {
		Utils.registerThingMLFactory();
		Resource resource = loadResourceFromString(string);
		ThingMLModel model = loadThingMLModelFromResource(resource);
		return model;
	}

	/**
	 * Load a Cypriot model from a string
	 * @param string
	 * @return
	 */
	public static CyprIoTModel loadCypriotModel(String str) {
		Utils.registerCypriotFactory();
		Resource resource = loadResourceFromString(str);
		CyprIoTModel model = loadCypriotModelFromResource(resource);
		return model;
	}


	/**
	 * Load a ThingML model from a loaded resource
	 * @param resource
	 * @return
	 */
	private static ThingMLModel loadThingMLModelFromResource(Resource resource) {
		ThingMLModel model = (ThingMLModel) resource.getContents().get(0);
		return model;
	}
	
	/**
	 * Load the EMF graph of the model from a String
	 * @param string
	 * @return
	 */
	private static Resource loadResourceFromString(String string) {
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createURI("dummy:/example.thingml"));
		InputStream in = new ByteArrayInputStream(string.getBytes());
		try {
			resource.load(in, rs.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
			resource.getErrors();
		}
		return resource;
	}

	/**
	 * Load a Cypriot model from a loaded resource
	 * @param resource
	 * @return
	 */
	private static CyprIoTModel loadCypriotModelFromResource(Resource resource) {
		CyprIoTModel model = (CyprIoTModel) resource.getContents().get(0);
		return model;
	}
	
	/**
	 * Get the project version as defined in maven pom.xml
	 */
	public static String getProjectVersion() {
		MavenXpp3Reader reader = new MavenXpp3Reader();
        Model model;
		try {
			model = reader.read(new FileReader("../pom.xml"));
			String projectVersion = model.getVersion();
			return projectVersion;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
