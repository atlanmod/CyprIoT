package main;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

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
	public static ThingMLModel loadModel(String str) {
		Utils.registerThingMLFactory();
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createURI("dummy:/example.thingml"));
		InputStream in = new ByteArrayInputStream(str.getBytes());
		try {
			resource.load(in, rs.getLoadOptions());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resource.getErrors();
		}
		ThingMLModel model = (ThingMLModel) resource.getContents().get(0);
		return model;
	}
}
