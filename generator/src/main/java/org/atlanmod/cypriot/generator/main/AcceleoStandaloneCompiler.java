package org.atlanmod.cypriot.generator.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.common.util.BasicMonitor;

public class AcceleoStandaloneCompiler extends AbstractAcceleoGenerator {
	
	static final Logger log = LogManager.getLogger(AcceleoStandaloneCompiler.class.getName());

    public static String MODULE_FILE_NAME;
    public static String[] TEMPLATE_NAMES = { "generateElement" };
   

	
	@Override
	public String getModuleName() {
		return MODULE_FILE_NAME;
	}

	@Override
	public String[] getTemplateNames() {
		return TEMPLATE_NAMES;
	}
	
	public void generateAcceleo(CyprIoTModel cypriotModel, String targetFolderPath) {
	    List<String> arguments = new ArrayList<String>();
		
		File targetFolder = new File(targetFolderPath);
		try {
			initialize(cypriotModel, targetFolder, arguments);
			super.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
