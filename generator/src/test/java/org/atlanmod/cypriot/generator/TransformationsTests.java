package org.atlanmod.cypriot.generator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyutil.Helpers;
import org.atlanmod.cypriot.generator.main.App;
import org.atlanmod.cypriot.generator.utilities.Util;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.thingml.xtext.thingML.ThingMLModel;

import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(ThingMLInjectorProvider.class)
public class TransformationsTests {
	static final Logger log = LogManager.getLogger(App.class.getName());

	@Inject
	ParseHelper<ThingMLModel> parseHelper;
	@Inject
	ValidationTestHelper validator;
	@Inject
	ClassLoader classLoader;
	@Inject
	Util help;
	
	@Test
	public void testBasic() throws Exception {

		File thingMLfile = new File(classLoader.getResource("0_hello/hello.thingml").getFile());
		File cyprIoTfile = new File(classLoader.getResource("0_hello/hello.cy").getFile());
		
		String outputFile = cyprIoTfile.getParent()+File.separator+"network-gen"+File.separator+"output.thingml";
		Resource res = help.transform(outputFile, cyprIoTfile, thingMLfile);
		
		ThingMLModel parse = Helpers.getModelFromResource(res, ThingMLModel.class);
		
		
		validator.assertNoErrors(parse);
		assertTrue(parse.getProtocols().size()==2);
		assertTrue(parse.getProtocols().get(0).getName().equals("AMQP"));
	}
}
