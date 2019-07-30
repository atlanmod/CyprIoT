package org.atlanmod.cypriot.generator.utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyutil.Helpers;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.acceleo.parser.compiler.AcceleoCompilerHelper;
import org.eclipse.emf.common.util.BasicMonitor;

public class AcceleoStandaloneCompiler extends AbstractAcceleoGenerator {
	
	static final Logger log = LogManager.getLogger(AcceleoStandaloneCompiler.class.getName());

    public static final String MODULE_FILE_NAME = "/org/atlanmod/cypriot/generator/acceleo/mosquitto";
    public static final String[] TEMPLATE_NAMES = { "generateElement" };
   

	
	@Override
	public String getModuleName() {
		return MODULE_FILE_NAME;
	}

	@Override
	public String[] getTemplateNames() {
		return TEMPLATE_NAMES;
	}
	
	public void generateAcceleo(String modelPath, String targetFolderPath) {
		log.info("Generating textual artifacts...");
	    List<String> arguments = new ArrayList<String>();
		CyprIoTModel cypriotModel = Helpers.loadModelFromPath(modelPath, CyprIoTModel.class);
		AcceleoCompilerHelper acceleoCompilerHelper = new AcceleoCompilerHelper();
		acceleoCompilerHelper.setSourceFolder("./src/main/java/org/atlanmod/cypriot/generator/acceleo/");
	    acceleoCompilerHelper.setOutputFolder("./src/main/java/org/atlanmod/cypriot/generator/acceleo/");
		acceleoCompilerHelper.execute();
		
		File targetFolder = new File(targetFolderPath);
		try {
			initialize(cypriotModel, targetFolder, arguments);
			super.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("All textual artifacts generated.");
	}
}
