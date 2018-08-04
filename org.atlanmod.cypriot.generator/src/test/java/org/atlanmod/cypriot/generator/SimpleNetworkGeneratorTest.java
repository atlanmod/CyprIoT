package org.atlanmod.cypriot.generator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Role;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;
import org.atlanmod.cypriot.generator.networkgenerator.NetworkHelper;
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
	CypriotModelLoader cyLoader = new CypriotModelLoader();
	CyprIoTModel cyModel = cyLoader.loadFromFile(cypriotFile);
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
		assertTrue(NetworkHelper.isFileExists(cypriotFile));;
		assertFalse(NetworkHelper.isFileExists(doesNotExist));
	}

	@Test
	public void testGetFileFromPath() throws FileNotFoundException {
		File file = NetworkHelper.getFileFromPath(fileUnderTestPath);
		assertNotNull(file);
	}

	@Test
	public void testGetIdNameOfEobject() {
		String objectName = NetworkHelper.getIdNameOfEobject(instanceThing);
		assertNotNull(objectName);
		assertEquals(objectName, "thing1");
	}

	@Test
	public void testGetAssignedRolesToThing() {
		EList<Role> rolesInstance = NetworkHelper.getAssignedRolesToThing(instanceThing);
		EList<Role> roleThing = cyModel.getImportThings().get(0).getAssignedRoles();
		rolesInstance.equals(roleThing);	
	}

	@Test
	public void testGetImportedThingPath() {
		
		String fullPath = cypriotFile.getAbsoluteFile().getParentFile().getAbsolutePath()+"/thing1.thingml";
		assertEquals(fullPath, NetworkHelper.getImportedThingPath(instanceThing,cypriotFile));
	}

}
