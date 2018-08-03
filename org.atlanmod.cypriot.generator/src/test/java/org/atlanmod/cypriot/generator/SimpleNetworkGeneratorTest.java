package org.atlanmod.cypriot.generator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Role;
import org.atlanmod.cypriot.generator.commons.Utilities;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;
import org.atlanmod.cypriot.generator.networkgenerator.SimpleNetworkGenerator;
import org.eclipse.emf.common.util.EList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimpleNetworkGeneratorTest {
	
	static final Logger log = Logger.getLogger(SimpleNetworkGeneratorTest.class.getName());

	SimpleNetworkGenerator networkGen = new SimpleNetworkGenerator();
	final String fileUnderTestPath = "src/test/resources/simple.cy";
	File cypriotFile = new File(fileUnderTestPath);
	File doesNotExist = new File("src/test/resources/doesNotExist.cy");
	String fileContent = Utilities.getContentFromFile(cypriotFile);
	CypriotModelLoader cyLoader = new CypriotModelLoader(fileContent);
	CyprIoTModel cyModel = cyLoader.loadModel();
	InstanceThing instanceThing = cyModel.getNetworks().get(0).getInstancesThing().get(0);

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
		File file = networkGen.getFileFromPath(fileUnderTestPath);
		assertNotNull(file);
	}

	@Test
	public void testGetIdNameOfEobject() {
		String objectName = networkGen.getIdNameOfEobject(instanceThing);
		assertNotNull(objectName);
		assertEquals(objectName, "thing1");
	}

	@Test
	public void testGetAssignedRolesToThing() {
		EList<Role> rolesInstance = networkGen.getAssignedRolesToThing(instanceThing);
		EList<Role> roleThing = cyModel.getImportThings().get(0).getAssignedRoles();
		rolesInstance.equals(roleThing);	
	}

	@Test
	public void testGetImportedThingPath() {
		
		String fullPath = cypriotFile.getAbsoluteFile().getParentFile().getAbsolutePath()+"/thing1.thingml";
		assertEquals(fullPath, networkGen.getImportedThingPath(instanceThing));
	}

}
