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
	
	public static void registerThingMLFactory() {
		ThingMLStandaloneSetup.doSetup();
	}
	public static ThingMLModel loadThingMLModel(String str) {
		Utils.registerThingMLFactory();
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createURI("dummy:/example.thingml"));
		InputStream in = new ByteArrayInputStream(str.getBytes());
		try {
			resource.load(in, rs.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
			resource.getErrors();
		}
		ThingMLModel model = (ThingMLModel) resource.getContents().get(0);
		return model;
	}
	
	public static void registerCypriotFactory() {
		CypriotStandaloneSetup.doSetup();
	}
	public static CyprIoTModel loadCypriotModel(String str) {
		Utils.registerCypriotFactory();
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createURI("dummy:/example.cy"));
		InputStream in = new ByteArrayInputStream(str.getBytes());
		try {
			resource.load(in, rs.getLoadOptions());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resource.getErrors();
		}
		CyprIoTModel model = (CyprIoTModel) resource.getContents().get(0);
		return model;
	}
	
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
