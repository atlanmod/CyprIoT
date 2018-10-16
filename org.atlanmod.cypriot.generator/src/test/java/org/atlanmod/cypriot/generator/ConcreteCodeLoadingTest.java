package org.atlanmod.cypriot.generator;

import java.io.File;

import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;
import org.junit.Test;

public class ConcreteCodeLoadingTest {
	
	final String fileUnderTestPath = "../org.atlanmod.cypriot.examples/tests/TDD/concretecode/concretecode.cy";
	final File networkModelFile = new File(fileUnderTestPath);
	CypriotModelLoader loader = new CypriotModelLoader();
	CyprIoTModel loadNetworkModel = loader.loadModel(networkModelFile);
	
	@Test
	public void loadConcreteCode() {	
		
	}
}
