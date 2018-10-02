package org.atlanmod.cypriot.generator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.Thing;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;
import org.atlanmod.cypriot.generator.models.ThingMLModelLoader;
import org.junit.Test;
import org.thingml.xtext.thingML.ThingMLModel;

public class MainTest {
	final String fileUnderTestPath = "../org.atlanmod.cypriot.examples/tests/TDD/simple/simple.cy";
	final File networkModelFile = new File(fileUnderTestPath);
	CypriotModelLoader loader = new CypriotModelLoader();
	CyprIoTModel loadNetworkModel = loader.loadFromFile(networkModelFile);
	@Test
	public void loadNetworkModel() {
		assertTrue(networkModelFile.exists());

		assertNotNull(loadNetworkModel);
	}
	
	@Test
	public void loadThingMLModel() {
		CypriotModelLoader loader = new CypriotModelLoader();
		CyprIoTModel loadNetworkModel = loader.loadFromFile(networkModelFile);
		for (Thing thing : loadNetworkModel.getDeclareThings()) {
			String importPath = thing.getImportPath().replaceAll("\"", "");
			String fullThingMLpPath = networkModelFile.getParentFile().getAbsolutePath()+"/"+importPath;
			File thingMLFile = new File(fullThingMLpPath);
			assertTrue(thingMLFile.exists());
			ThingMLModelLoader loadThing = new ThingMLModelLoader();
			ThingMLModel thingMLModel = loadThing.loadFromFile(thingMLFile);
			assertNotNull(thingMLModel);
		}
	}

}
