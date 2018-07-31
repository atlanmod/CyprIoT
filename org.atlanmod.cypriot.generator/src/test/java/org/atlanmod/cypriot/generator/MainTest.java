package org.atlanmod.cypriot.generator;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.commons.Utilities;
import org.atlanmod.cypriot.generator.main.App;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;
import org.atlanmod.cypriot.generator.models.ThingMLModelLoader;
import org.junit.Test;
import org.thingml.xtext.thingML.ThingMLModel;

public class MainTest {
	
	static final Logger log = Logger.getLogger(MainTest.class.getName());

	@Test
	public void loadCyriotModelFromFileTest() 
	{
		String textToWrite = "role:sensor";
		String fileName ="temp";
		String fileExtenstion = ".cy";
		CypriotModelLoader model = new CypriotModelLoader();
		File file = Utilities.writeStringToTemporaryFile(textToWrite, fileName, fileExtenstion, log);
		CyprIoTModel loadedModel = model.loadModelFromFile(file, CyprIoTModel.class, log);
	    assertNotNull(loadedModel);
	}

	@Test
	public void loadThingMLFromStringTest() {
		String textToWrite = "thing Hello{}";
		String fileName ="temp";
		String fileExtenstion = ".thingml";
		ThingMLModelLoader model = new ThingMLModelLoader();
		File file = Utilities.writeStringToTemporaryFile(textToWrite, fileName, fileExtenstion, log);
		ThingMLModel loadedModel = model.loadModelFromFile(file, ThingMLModel.class, log);
	    assertNotNull(loadedModel);
	}

	@Test
	public void getProjectVersionTest() throws Exception {
		String projectVersion = Utilities.getProjectVersion();
		assertNotNull(projectVersion);
	}

	@Test
	public void readFileTest() throws Exception {
		File file = File.createTempFile("temp", "some-text");
		file.deleteOnExit();
		assertNotNull(Utilities.getContentFromFile(file));
	}

}
