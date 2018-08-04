package org.atlanmod.cypriot.generator;

import static org.junit.Assert.*;

import java.io.File;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.commons.FileProcessor;
import org.atlanmod.cypriot.generator.commons.TemporaryFileProcessor;
import org.atlanmod.cypriot.generator.commons.Utilities;
import org.atlanmod.cypriot.generator.main.App;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;
import org.atlanmod.cypriot.generator.models.ModelLoader;
import org.atlanmod.cypriot.generator.models.ThingMLModelLoader;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.thingml.xtext.thingML.ThingMLModel;

public class MainTest {
	
	static final Logger log = Logger.getLogger(MainTest.class.getName());

	@Test
	public void loadResourceFromStringTest() throws Exception {
/*		String string = "role:anyrole";
		ModelLoader cypriotModelLoader = new CypriotModelLoader(null);
		Resource resource = cypriotModelLoader.loadResourceFromString(string);
		assertTrue(Utilities.checkProblemsInModel(resource));
		assertTrue(Utilities.checkErrorsInResource(resource));
		assertTrue(Utilities.checkWarningInResource(resource));
		assertNotNull(resource);*/
	}
	
	@Test(expected = NullPointerException.class)
	public void loadResourceFromStringTestException() throws Exception {
/*		String string = "blabla*\\$$";
		ModelLoader cypriotModelLoader = new CypriotModelLoader(null);
		Resource resource = cypriotModelLoader.loadResourceFromString(string);
		Utilities.checkProblemsInModel(resource);*/
//		assertFalse(Utilities.checkProblemsInModel(resource));
//		assertFalse(Utilities.checkErrorsInResource(resource));
//		assertFalse(Utilities.checkWarningInResource(resource));
	}
	
	@Test
	public void loadCyriotModelFromFileTest() 
	{
		String textToWrite = "role:anyrole";
		String fileName ="temp";
		String fileExtenstion = ".cy";
		CypriotModelLoader model = new CypriotModelLoader(null);
		FileProcessor fileprocessor = new TemporaryFileProcessor();
		fileprocessor.setTextToWrite(textToWrite);
		fileprocessor.setFileName(fileName);
		fileprocessor.setFileExtenstion(fileExtenstion);
		File file = fileprocessor.build();
		CyprIoTModel loadedModel = model.loadFromFile(file);
	    assertNotNull(loadedModel);
	}

	@Test
	public void loadThingMLFromStringTest() {
		String textToWrite = "thing Hello{}";
		String fileName ="temp";
		String fileExtenstion = ".thingml";
		ThingMLModelLoader model = new ThingMLModelLoader();
		FileProcessor fileprocessor = new TemporaryFileProcessor();
		fileprocessor.setFileName(fileName);
		fileprocessor.setFileExtenstion(fileExtenstion);
		fileprocessor.setTextToWrite(textToWrite);
		File file = fileprocessor.build();
		ThingMLModel loadedModel = model.loadFromFile(file);
	    assertNotNull(loadedModel);
	}

	@Test
	public void getProjectVersionTest() throws Exception {
		String projectVersion = Utilities.getProjectVersionFromMaven();
		assertNotNull(projectVersion);
	}

	@Test
	public void readFileTest() throws Exception {
		File file = File.createTempFile("temp", "some-text");
		file.deleteOnExit();
		assertNotNull(Utilities.getContentFromFile(file));
	}

}
