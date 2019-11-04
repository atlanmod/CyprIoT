package org.atlanmod.cypriot.generator.plugins.installed;

import java.io.File;

import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.main.M2THelper;
import org.atlanmod.cypriot.generator.plugins.Plugin;

public class DocumentationPlugin implements Plugin {

	@Override
	public String getID() {
		return "documentationPlugin";
	}

	@Override
	public void attach(Logger log) {
		log.info("Loading "+getID()+" plugin...");
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
		M2THelper acceleoStandaloneCompiler = new M2THelper();
		M2THelper.MODULE_FILE_NAME="/org/atlanmod/cypriot/generator/templates/documentation";
		acceleoStandaloneCompiler.generateAcceleo(model,outputDirectory);	
	}

	@Override
	public void verify(CyprIoTModel model) {

	}

	@Override
	public void deploy(CyprIoTModel model) {

	}

}
