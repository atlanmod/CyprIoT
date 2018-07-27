package org.atlanmod.cypriot.generator;

import static org.junit.Assert.assertNotNull;

import org.atlanmod.cypriot.generator.commons.Utilities;
import org.junit.Test;
import org.thingml.xtext.thingML.ThingMLModel;

public class MainTests {
	@Test
	public void loadThingMLFromString() 
	{
		String thingmlModel = "thing Hello{}";
	    ThingMLModel loadedModel = Utilities.loadThingMLModelFromString(thingmlModel);
	    assertNotNull(loadedModel);
	}
	
	@Test
	public void getProjectVersion() 
	{
	    String projectVersion = Utilities.getProjectVersion();
	    assertNotNull(projectVersion);
	}
}
