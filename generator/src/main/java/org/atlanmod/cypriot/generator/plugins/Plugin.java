package org.atlanmod.cypriot.generator.plugins;

import java.io.File;
import java.util.ArrayList;

import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.thingml.xtext.thingML.ThingMLModel;

public interface Plugin {
	void attach(Logger log);
	String getID();
	CyprIoTModel initiliaze();
	ArrayList<ThingMLModel> load(CyprIoTModel model);
	CyprIoTModel transform(CyprIoTModel model);
	void generate(CyprIoTModel model, File outputDirectory);
	void verify(CyprIoTModel model);
	void deploy(CyprIoTModel model);
}
