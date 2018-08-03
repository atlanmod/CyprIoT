package org.atlanmod.cypriot.generator;

import static org.junit.Assert.*;

import java.io.File;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.generator.commons.Utilities;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;
import org.atlanmod.cypriot.generator.networkgenerator.SimpleNetworkGenerator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimpleNetworkGeneratorTest {
	
	static final Logger log = Logger.getLogger(SimpleNetworkGeneratorTest.class.getName());

	SimpleNetworkGenerator networkGen = new SimpleNetworkGenerator();
	File cypriotFile = new File("src/test/resources/simple.cy");
	File doesNotExist = new File("src/test/resources/doesNotExist.cy");
	String fileContent = Utilities.getContentFromFile(cypriotFile);
	
	@Before
	public void setUp() throws Exception {
		networkGen.setCypriotFile(cypriotFile);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsFileExists() {
		assertTrue(networkGen.isFileExists(cypriotFile));;
		assertFalse(networkGen.isFileExists(doesNotExist));
	}

	@Test
	public void testGetFileFromPath() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIdNameOfEobject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAssignedRolesToThing() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetImportedThingPath() {
		
		CypriotModelLoader cyLoader = new CypriotModelLoader(fileContent);
		InstanceThing instanceThing = cyLoader.loadModel().getNetworks().get(0).getInstancesThing().get(0);
		String importPath = instanceThing.getTypeThing().getImportPath();
		String fullPath = cypriotFile.getAbsoluteFile().getParentFile().getAbsolutePath()+"/"+importPath;
		assertEquals(fullPath, networkGen.getImportedThingPath(instanceThing));
	}

}
