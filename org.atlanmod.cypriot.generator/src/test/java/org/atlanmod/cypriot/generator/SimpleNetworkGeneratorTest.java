package org.atlanmod.cypriot.generator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.Instance;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Role;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;
import org.atlanmod.cypriot.generator.network.NetworkHelper;
import org.atlanmod.cypriot.generator.network.SimpleNetworkGenerator;
import org.eclipse.emf.common.util.EList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimpleNetworkGeneratorTest {
	
	static final Logger log = LogManager.getLogger(SimpleNetworkGeneratorTest.class.getName());

	SimpleNetworkGenerator networkGen = new SimpleNetworkGenerator();
	final String fileUnderTestPath = "src/test/resources/simple.cy";
	final File cypriotFile = new File(fileUnderTestPath);
	final File doesNotExist = new File("src/test/resources/doesNotExist.cy");
	final File cypriotOutputDirectory = new File("src/test/resources/");
	CypriotModelLoader cyLoader;;
	CyprIoTModel cyModel;
	InstanceThing instanceThing;

	@Before
	public void setUp() throws Exception {
		cyLoader = new CypriotModelLoader();
		cyModel = cyLoader.loadFromFile(cypriotFile);
		for (Instance  instance : cyModel.getNetworks().get(0).getInstances()) {
			if(instance instanceof InstanceThing) {
				instanceThing = (InstanceThing) instance;
				break;
			}
			
		}
		
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

}
