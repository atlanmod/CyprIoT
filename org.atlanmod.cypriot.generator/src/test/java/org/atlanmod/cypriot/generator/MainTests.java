package org.atlanmod.cypriot.generator;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.atlanmod.cypriot.generator.commons.Utilities;
import org.junit.Test;
import org.thingml.xtext.thingML.ThingMLModel;

public class MainTests {
	@Test
	public void loadThingMLFromStringTest() 
	{
		String thingmlModel = "thing Hello{}";
	    ThingMLModel loadedModel = Utilities.loadThingMLModelFromString(thingmlModel);
	    assertNotNull(loadedModel);
	}
	
	@Test
	public void getProjectVersionTest()  throws Exception {
	    String projectVersion = Utilities.getProjectVersion();    
	    assertNotNull(projectVersion);
	}
	
	@Test
	public void readFileTest()  throws Exception {
		File file = File.createTempFile( "temp", "some-text");
		file.deleteOnExit();
	    assertNotNull(Utilities.getContentFromFile(file));
	}

}
