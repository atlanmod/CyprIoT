package org.atlanmod.cypriot.generator;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.commons.Utilities;
import org.atlanmod.cypriot.generator.exceptions.ModeExceptionHandler;
import org.atlanmod.cypriot.generator.main.App;
import org.atlanmod.cypriot.generator.models.CypriotLoader;
import org.atlanmod.cypriot.generator.models.ThingMLLoader;
import org.junit.Test;
import org.thingml.xtext.thingML.ThingMLModel;

public class MainTests {
	
	static final Logger log = Logger.getLogger(MainTests.class.getName());

	@Test
	public void applicationRunTest() 
	{
		String[] args = new String[] {"-i ../examples/sac/sample.cy\n","-vv"};
		App app = new App();
		app.main(args);
	    assertNotNull(app);
	}
	@Test
	public void loadCyriotModelFromFileTest() 
	{
		String textToWrite = "role:sensor";
		String fileName ="temp";
		String fileExtenstion = ".cy";
		CypriotLoader model = new CypriotLoader();
		File file = Utilities.writeStringToTemporaryFile(textToWrite, fileName, fileExtenstion, log);
		CyprIoTModel loadedModel = model.loadModelFromFile(file, CyprIoTModel.class, log);
	    assertNotNull(loadedModel);
	}

	@Test
	public void loadThingMLFromStringTest() {
		String textToWrite = "thing Hello{}";
		String fileName ="temp";
		String fileExtenstion = ".thingml";
		ThingMLLoader model = new ThingMLLoader();
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
