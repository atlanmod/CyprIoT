package org.atlanmod.cypriot.generator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.generator.main.App;
import org.atlanmod.cypriot.generator.utilities.Helpers;
import org.junit.Test;

public class TransformationsTests {
	static final Logger log = LogManager.getLogger(App.class.getName());
	public final static String THINGML_METAMODEL = "./transformations/metamodels/ThingML.ecore";
	public final static String CYPRIOT_METAMODEL = "./transformations/metamodels/cypriot/Cypriot.ecore";
	public final static String TRANSFORMATION_DIRECTORY = "./transformations/";
	public final static String MODULE_NAME = "Network2Thing";
	public final static String INPUT_THINGMLMODEL = "./transformations/models/thing1.xmi";
	public final static String INPUT_CYPRIOMODEL = "./transformations/models/network1.xmi";
	public final static String OUTPUT_MODEL = "./transformations/models/output.xmi";

	

	@Test
	public void testBasic() {
		Helpers.transform(INPUT_CYPRIOMODEL, INPUT_THINGMLMODEL, OUTPUT_MODEL);
	}
}
