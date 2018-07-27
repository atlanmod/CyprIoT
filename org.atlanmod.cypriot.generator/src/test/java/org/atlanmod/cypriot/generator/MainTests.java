package org.atlanmod.cypriot.generator;

import static org.junit.Assert.assertNotNull;

import org.atlanmod.cypriot.generator.main.Utils;
import org.junit.Test;
import org.thingml.xtext.thingML.ThingMLModel;

public class MainTests {
	@Test
	public void loadThingMLFromString() 
	{
		String thingmlModel = "thing Hello{}";
	    ThingMLModel loadedModel = Utils.loadThingMLModelFromString(thingmlModel);
	    assertNotNull(loadedModel);
	}
	
	@Test
	public void getProjectVersion() 
	{
	    String projectVersion = Utils.getProjectVersion();
	    assertNotNull(projectVersion);
	}
}
