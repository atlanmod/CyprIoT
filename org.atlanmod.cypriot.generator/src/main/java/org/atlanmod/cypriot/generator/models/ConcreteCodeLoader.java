package org.atlanmod.cypriot.generator.models;

import java.io.File;

import org.eclipse.emf.ecore.EObject;
import org.thingml.xtext.thingML.ThingMLModel;

public class ConcreteCodeLoader extends ModelLoader {

	@Override
	protected void registerFactory() {
		// TODO Auto-generated method stub

	}

	@Override
	protected <T extends EObject> T loadModel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ThingMLModel loadFromFile(File file) {
		return loadFromFile(file, ThingMLModel.class);
	}

}
