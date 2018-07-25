package org.atlanmod.cypriot.generator;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.thingml.xtext.thingML.ThingMLModel;

import main.Utils;

public class MainTests {
	@Test
	public void loadThingMLFromString() 
	{
		String thingmlModel = "thing Hello{}";
	    ThingMLModel loadedModel = Utils.loadModel(thingmlModel);
	    assertNotNull(loadedModel);
	}
}
