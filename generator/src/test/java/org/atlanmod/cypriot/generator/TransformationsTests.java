package org.atlanmod.cypriot.generator;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyutil.Helpers;
import org.atlanmod.cypriot.generator.main.App;
import org.atlanmod.cypriot.generator.main.M2MHelper;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.thingml.xtext.thingML.ExternalConnector;
import org.thingml.xtext.thingML.ThingMLModel;

import com.google.inject.Inject;;

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
	M2MHelper transformationHelper;
	
	ExecutorService executorService = Executors.newCachedThreadPool();
	@Test
	public void test0_HelloWorld() throws Exception {
		
		File cyprIoTfile = new File(classLoader.getResource("0_HelloWorld/main.cy").getFile());
		File outputDirectory = new File(cyprIoTfile.getParent() + File.separator + "network-gen" + File.separator);
		Resource res = transformationHelper.transform(cyprIoTfile,outputDirectory,false,false,false,false,executorService).get(0);
		
		ThingMLModel parseDevice1 = Helpers.getModelFromResource(res, ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice1);
		assertTrue(parseDevice1.getProtocols().size()==1);
		assertTrue(parseDevice1.getConfigs().size()==1);
		assertTrue(parseDevice1.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice1.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_publish_topic"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));
	}
	
	@Test
	public void test0_HelloWorld2() throws Exception {
		
		File cyprIoTfile = new File(classLoader.getResource("0_HelloWorld2/main.cy").getFile());	
		File outputDirectory = new File(cyprIoTfile.getParent() + File.separator + "network-gen" + File.separator);
		Resource res = transformationHelper.transform(cyprIoTfile,outputDirectory,false,false,false,false,executorService).get(0);
		
		ThingMLModel parseDevice1 = Helpers.getModelFromResource(res, ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice1);
		assertTrue(parseDevice1.getProtocols().size()==1);
		assertTrue(parseDevice1.getConfigs().size()==1);
		assertTrue(parseDevice1.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice1.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_subscribe_topic"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));
	}
	
	@Test
	public void test1_TwoThings() throws Exception {
		
		File cyprIoTfile = new File(classLoader.getResource("1_TwoThings/main.cy").getFile());
		File outputDirectory = new File(cyprIoTfile.getParent() + File.separator + "network-gen" + File.separator);

		// Device 1

		List<Resource> transformedFiles = transformationHelper.transform(cyprIoTfile,outputDirectory,false,false,false,false,executorService);
		ThingMLModel parseDevice1 = Helpers.getModelFromResource(transformedFiles.get(0), ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice1);
		assertTrue(parseDevice1.getProtocols().size()==1);
		assertTrue(parseDevice1.getConfigs().size()==1);
		assertTrue(parseDevice1.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice1.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_publish_topic"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));

		// Device 2
		
		ThingMLModel parseDevice2 = Helpers.getModelFromResource(transformedFiles.get(1), ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice2);
		assertTrue(parseDevice2.getProtocols().size()==1);
		assertTrue(parseDevice2.getConfigs().size()==1);
		assertTrue(parseDevice2.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice2.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice2.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice2.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_subscribe_topic"));
		assertTrue(((ExternalConnector)parseDevice2.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));
	
	}
	
	@Test
	public void test2_TwoWayBind() throws Exception {
		
		//File cyprIoTfile = new File(classLoader.getResource("2_TwoWayBind/main.cy").getFile());
		//File device1 = new File(classLoader.getResource("2_TwoWayBind/device1.thingml").getFile());
		//File device2 = new File(classLoader.getResource("2_TwoWayBind/device2.thingml").getFile());
		
	}
	
	@Test
	public void test3_ThreeThings() throws Exception {
		
		File cyprIoTfile = new File(classLoader.getResource("3_ThreeThings/main.cy").getFile());
		File outputDirectory = new File(cyprIoTfile.getParent() + File.separator + "network-gen" + File.separator);
		List<Resource> transformedFiles = transformationHelper.transform(cyprIoTfile,outputDirectory,false,false,false,false,executorService);

		// Device 1

		ThingMLModel parseDevice1 = Helpers.getModelFromResource(transformedFiles.get(0), ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice1);
		assertTrue(parseDevice1.getProtocols().size()==1);
		assertTrue(parseDevice1.getConfigs().size()==1);
		assertTrue(parseDevice1.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice1.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_publish_topic"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));

		// Device 2
		
		ThingMLModel parseDevice2 = Helpers.getModelFromResource(transformedFiles.get(1), ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice2);
		assertTrue(parseDevice2.getProtocols().size()==1);
		assertTrue(parseDevice2.getConfigs().size()==1);
		assertTrue(parseDevice2.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice2.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice2.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice2.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_subscribe_topic"));
		assertTrue(((ExternalConnector)parseDevice2.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));
			

		// Device 3
		
		ThingMLModel parseDevice3 = Helpers.getModelFromResource(transformedFiles.get(2), ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice3);
		assertTrue(parseDevice3.getProtocols().size()==1);
		assertTrue(parseDevice3.getConfigs().size()==1);
		assertTrue(parseDevice3.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice3.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice3.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice3.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice3.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice3.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice3.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice3.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_subscribe_topic"));
		assertTrue(((ExternalConnector)parseDevice3.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));
			
		

	}
	
	@Test
	public void test4_FourThings() throws Exception {
		
		File cyprIoTfile = new File(classLoader.getResource("4_FourThings/main.cy").getFile());
		File outputDirectory = new File(cyprIoTfile.getParent() + File.separator + "network-gen" + File.separator);
		List<Resource> transformedFiles = transformationHelper.transform(cyprIoTfile,outputDirectory,false,false,false,false,executorService);
		
		// Device 1

		ThingMLModel parseDevice1 = Helpers.getModelFromResource(transformedFiles.get(0), ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice1);
		assertTrue(parseDevice1.getProtocols().size()==1);
		assertTrue(parseDevice1.getConfigs().size()==1);
		assertTrue(parseDevice1.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice1.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_publish_topic"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));

		// Device 2
		
		ThingMLModel parseDevice2 = Helpers.getModelFromResource(transformedFiles.get(1), ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice2);
		assertTrue(parseDevice2.getProtocols().size()==1);
		assertTrue(parseDevice2.getConfigs().size()==1);
		assertTrue(parseDevice2.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice2.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice2.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice2.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_subscribe_topic"));
		assertTrue(((ExternalConnector)parseDevice2.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));
			

		// Device 3
		
		ThingMLModel parseDevice3 = Helpers.getModelFromResource(transformedFiles.get(2), ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice3);
		assertTrue(parseDevice3.getProtocols().size()==1);
		assertTrue(parseDevice3.getConfigs().size()==1);
		assertTrue(parseDevice3.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice3.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice3.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice3.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice3.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice3.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice3.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice3.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_subscribe_topic"));
		assertTrue(((ExternalConnector)parseDevice3.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));
		
		// Device 4
		
		ThingMLModel parseDevice4 = Helpers.getModelFromResource(transformedFiles.get(3), ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice4);
		assertTrue(parseDevice4.getProtocols().size()==1);
		assertTrue(parseDevice4.getConfigs().size()==1);
		assertTrue(parseDevice4.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice4.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice4.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice4.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice4.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice4.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice4.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice4.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_subscribe_topic"));
		assertTrue(((ExternalConnector)parseDevice4.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));
			
	}
	@Test
	public void test5_FiveThings() throws Exception {
		
		File cyprIoTfile = new File(classLoader.getResource("5_FiveThings/main.cy").getFile());
		File outputDirectory = new File(cyprIoTfile.getParent() + File.separator + "network-gen" + File.separator);
		List<Resource> transformedFiles = transformationHelper.transform(cyprIoTfile,outputDirectory,false,false,false,false,executorService);
		
		// Device 1

		ThingMLModel parseDevice1 = Helpers.getModelFromResource(transformedFiles.get(0), ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice1);
		assertTrue(parseDevice1.getProtocols().size()==1);
		assertTrue(parseDevice1.getConfigs().size()==1);
		assertTrue(parseDevice1.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice1.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice1.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_publish_topic"));
		assertTrue(((ExternalConnector)parseDevice1.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));

		// Device 2
		
		ThingMLModel parseDevice2 = Helpers.getModelFromResource(transformedFiles.get(1), ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice2);
		assertTrue(parseDevice2.getProtocols().size()==1);
		assertTrue(parseDevice2.getConfigs().size()==1);
		assertTrue(parseDevice2.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice2.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice2.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice2.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice2.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_subscribe_topic"));
		assertTrue(((ExternalConnector)parseDevice2.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));
			

		// Device 3
		
		ThingMLModel parseDevice3 = Helpers.getModelFromResource(transformedFiles.get(2), ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice3);
		assertTrue(parseDevice3.getProtocols().size()==1);
		assertTrue(parseDevice3.getConfigs().size()==1);
		assertTrue(parseDevice3.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice3.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice3.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice3.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice3.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice3.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice3.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice3.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_subscribe_topic"));
		assertTrue(((ExternalConnector)parseDevice3.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));
		
		// Device 4
		
		ThingMLModel parseDevice4 = Helpers.getModelFromResource(transformedFiles.get(3), ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice4);
		assertTrue(parseDevice4.getProtocols().size()==1);
		assertTrue(parseDevice4.getConfigs().size()==1);
		assertTrue(parseDevice4.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice4.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice4.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice4.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice4.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice4.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice4.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice4.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_subscribe_topic"));
		assertTrue(((ExternalConnector)parseDevice4.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));
		// Device 4
		
		ThingMLModel parseDevice5 = Helpers.getModelFromResource(transformedFiles.get(4), ThingMLModel.class);
		
		validator.assertNoErrors(parseDevice5);
		assertTrue(parseDevice5.getProtocols().size()==1);
		assertTrue(parseDevice5.getConfigs().size()==1);
		assertTrue(parseDevice5.getProtocols().get(0).getName().equals("MQTT"));
		assertTrue(parseDevice5.getProtocols().get(0).getAnnotations().get(0).getName().equals("mqtt_broker_address"));
		assertTrue(parseDevice5.getProtocols().get(0).getAnnotations().get(0).getValue().equals("mqtt.eclipse.org"));
		assertTrue(parseDevice5.getProtocols().get(0).getAnnotations().get(1).getName().equals("mqtt_port_number"));
		assertTrue(parseDevice5.getProtocols().get(0).getAnnotations().get(1).getValue().equals("1883"));
		assertTrue(parseDevice5.getConfigs().get(0).getConnectors().get(0) instanceof ExternalConnector);
		assertTrue(((ExternalConnector)parseDevice5.getConfigs().get(0).getConnectors().get(0)).getProtocol().getName().equals("MQTT"));
		assertTrue(((ExternalConnector)parseDevice5.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getName().equals("mqtt_publish_topic"));
		assertTrue(((ExternalConnector)parseDevice5.getConfigs().get(0).getConnectors().get(0)).getAnnotations().get(0).getValue().equals("org/hello/topic1"));
			
	}
}

