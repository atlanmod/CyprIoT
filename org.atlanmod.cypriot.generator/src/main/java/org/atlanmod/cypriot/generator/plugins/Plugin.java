package org.atlanmod.cypriot.generator.plugins;

import java.io.File;
import java.util.ArrayList;

import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.main.App;
import org.thingml.xtext.thingML.ThingMLModel;

public interface Plugin {
	void attach(App app);
	String getID();
	CyprIoTModel initiliaze();
	ArrayList<ThingMLModel> loadModel(CyprIoTModel model);
	Boolean validate(ArrayList<ThingMLModel> thingmlModel);
	CyprIoTModel transform(CyprIoTModel model);
	void generate(CyprIoTModel model, File outputDirectory);
	void verifiy(CyprIoTModel model);
	void deploy(CyprIoTModel model);
}
