package org.atlanmod.cypriot.generator.utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyutil.Helpers;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.acceleo.parser.compiler.AcceleoCompilerHelper;
import org.eclipse.emf.common.util.BasicMonitor;

public class AcceleoStandaloneCompiler extends AbstractAcceleoGenerator {

    public static final String MODULE_FILE_NAME = "/org/atlanmod/cypriot/generator/acceleo/generate";
    public static final String[] TEMPLATE_NAMES = { "generateElement" };
    public static final String TARGET_FOLDER = "./acceleo-gen/";
    public static final String MODEL_PATH = "./acceleo-gen/hello.cy";
   

	
	@Override
	public String getModuleName() {
		return MODULE_FILE_NAME;
	}

	@Override
	public String[] getTemplateNames() {
		return TEMPLATE_NAMES;
	}
	
	public void generateAcceleo() {
		
	    List<String> arguments = new ArrayList<String>();
		CyprIoTModel cypriotModel = Helpers.loadModelFromPath(MODEL_PATH, CyprIoTModel.class);
		AcceleoCompilerHelper acceleoCompilerHelper = new AcceleoCompilerHelper();
		acceleoCompilerHelper.setSourceFolder("./src/main/java/org/atlanmod/cypriot/generator/acceleo/");
	    acceleoCompilerHelper.execute();
		
		File targetFolder = new File(TARGET_FOLDER);
		try {
			initialize(cypriotModel, targetFolder, arguments);
			super.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
