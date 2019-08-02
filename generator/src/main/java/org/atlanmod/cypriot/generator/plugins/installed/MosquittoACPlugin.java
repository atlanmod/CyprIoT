package org.atlanmod.cypriot.generator.plugins.installed;

import java.io.File;
import java.util.ArrayList;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.plugins.Plugin;
import org.atlanmod.cypriot.generator.utilities.AcceleoStandaloneCompiler;
import org.thingml.xtext.thingML.ThingMLModel;

public class MosquittoACPlugin implements Plugin {

	@Override
	public String getID() {
		return "mosquittoPlugin";
	}

	@Override
	public void attach(Logger log) {
		log.info("Loading Mosquitto Access Control plugin...");
	}

	@Override
	public CyprIoTModel initiliaze() {
		return null;
	}

	@Override
	public ArrayList<ThingMLModel> loadModel(CyprIoTModel model) {
		return null;
	}

	@Override
	public Boolean validate(ArrayList<ThingMLModel> thingmlModel) {
		return null;
	}

	@Override
	public CyprIoTModel transform(CyprIoTModel model) {
		return null;
	}

	@Override
	public void generate(CyprIoTModel model, File outputDirectory) {
		AcceleoStandaloneCompiler acceleoStandaloneCompiler = new AcceleoStandaloneCompiler();
		AcceleoStandaloneCompiler.MODULE_FILE_NAME="/org/atlanmod/cypriot/generator/plugins/installed/acceleo/mosquitto";
		acceleoStandaloneCompiler.generateAcceleo(model,outputDirectory.getParent()+File.separator+"external-gen");	
	}

	@Override
	public void verify(CyprIoTModel model) {

	}

	@Override
	public void deploy(CyprIoTModel model) {

	}

}
