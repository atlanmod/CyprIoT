package org.atlanmod.cypriot.generator;

import static org.junit.Assert.assertNotNull;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.commons.Utilities;
import org.junit.Test;
import org.thingml.xtext.thingML.ThingMLModel;

public class MainTests {
	
	static final Logger log = Logger.getLogger(MainTests.class.getName());


	@Test
	public void loadCyriotModelFromFileTest() 
	{
		String textToWrite = "role:sensor";
		String fileName ="temp";
		String fileExtenstion = ".cy";
		File file = Utilities.writeStringToFile(textToWrite, fileName, fileExtenstion);
	    CyprIoTModel loadedModel = Utilities.loadCypriotModelFromFile(file);
	    assertNotNull(loadedModel);
	}

	@Test
	public void loadThingMLFromStringTest() {
		String thingmlModel = "thing Hello{}";
		ThingMLModel loadedModel = Utilities.loadThingMLModelFromString(thingmlModel);
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
