package org.atlanmod.cypriot.generator.plugins.installed;

import java.io.File;

import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.plugins.Plugin;
import org.atlanmod.cypriot.generator.utilities.AcceleoStandaloneCompiler;

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
	public CyprIoTModel transform(CyprIoTModel model) {
		return null;
	}

	@Override
	public void generate(CyprIoTModel model, File outputDirectory) {
		AcceleoStandaloneCompiler acceleoStandaloneCompiler = new AcceleoStandaloneCompiler();
		AcceleoStandaloneCompiler.MODULE_FILE_NAME="/org/atlanmod/cypriot/generator/templates/mosquitto";
		acceleoStandaloneCompiler.generateAcceleo(model,outputDirectory.getParent()+File.separator+"external-gen");	
	}

	@Override
	public void verify(CyprIoTModel model) {

	}

	@Override
	public void deploy(CyprIoTModel model) {

	}

}
