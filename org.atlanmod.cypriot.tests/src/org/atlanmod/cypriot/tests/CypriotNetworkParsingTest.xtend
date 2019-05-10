package org.atlanmod.cypriot.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
import org.atlanmod.cypriot.cyprIoT.CyprIoTPackage
import org.atlanmod.cypriot.cyprIoT.InstancePTP
import org.atlanmod.cypriot.cyprIoT.InstancePubSub
import org.atlanmod.cypriot.cyprIoT.InstanceThing
import org.atlanmod.cypriot.cyprIoT.Network
import org.atlanmod.cypriot.cyprIoT.ToBindPubSub
import org.atlanmod.cypriot.validation.CypriotValidator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.util.StringInputStream
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(typeof(CypriotWithThingMLInjectorProvider))
class CypriotNetworkParsingTest {

	@Inject
	ParseHelper<CyprIoTModel> parseHelper
	@Inject
	extension ValidationTestHelper

	@Inject
	Provider<ResourceSet> resourcesetProvider;

	

	/*******************************
	 * NETWORK TESTS                *
	 *******************************/
	@Test
	def void networkDeclaration() {
		val result = parseHelper.parse('''
			network anyname {
				domain org.atlanmod
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void multipleNetworksDeclaration() {
		val result = parseHelper.parse('''
			network anyname1 {
				domain org.atlanmod.anyname1
			}
			network anyname2 {
				domain org.atlanmod.anyname2
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstanceThing() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			network anynet {
				domain org.atlanmod
				instance th1:thing1 platform JAVA
			}
		''')
		val thingInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(thingInstanciate instanceof InstanceThing)
		Assert.assertNotNull((thingInstanciate as InstanceThing).thingToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithDuplicateInstanceThings() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			network anynet {
				domain org.atlanmod
				instance th1:thing1 platform JAVA
				instance th1:thing1 platform JAVA
			}
		''')
		val thingInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		Assert.assertTrue(thingInstanciate instanceof InstanceThing)
		result.assertError(CyprIoTPackage::eINSTANCE.network, CypriotValidator.INSTANCETHING_UNIQUENESS)
		Assert.assertNotNull((thingInstanciate as InstanceThing).thingToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithDuplicateInstancePubSub() {
		val result = parseHelper.parse('''
			channel:pubsub anypubsub {}
			network anynet {
				domain org.atlanmod
				instance anypubsub1:anypubsub platform MQTT
				instance anypubsub1:anypubsub platform MQTT
			}
		''')
		val thingInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		Assert.assertTrue(thingInstanciate instanceof InstancePubSub)
		result.assertError(CyprIoTPackage::eINSTANCE.network, CypriotValidator.INSTANCEPUBSUB_UNIQUENESS)
		Assert.assertNotNull((thingInstanciate as InstancePubSub).pubSubToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithDuplicateInstancePTP() {
		val result = parseHelper.parse('''
			channel:ptp anyptp {}
			network anynet {
				domain org.atlanmod
				instance ptp1:anyptp platform HTTP
				instance ptp1:anyptp platform HTTP
			}
		''')
		val thingInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		Assert.assertTrue(thingInstanciate instanceof InstancePTP)
		result.assertError(CyprIoTPackage::eINSTANCE.network, CypriotValidator.INSTANCEPTP_UNIQUENESS)
		Assert.assertNotNull((thingInstanciate as InstancePTP).ptPToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithDuplicateNetworks() {
		val result = parseHelper.parse('''
			network anynet {
				domain org.atlanmod
			}
			network anynet {
				domain org.atlanmod
			}
		''')
		val network = result.specifyNetworks.get(0)
		Assert.assertTrue(network instanceof Network)
		result.assertError(CyprIoTPackage::eINSTANCE.cyprIoTModel, CypriotValidator.NETWORK_UNIQUENESS)
		Assert.assertNotNull(network)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePubSubChannelMQTT() {
		val result = parseHelper.parse('''
			channel:pubsub anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel platform MQTT
			}
		''')
		val pubsubInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(pubsubInstanciate instanceof InstancePubSub)
		Assert.assertTrue((pubsubInstanciate as InstancePubSub).targetedPlatform.getName.equals("MQTT"))
		Assert.assertNotNull((pubsubInstanciate as InstancePubSub).pubSubToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePubSubChannelAMQP() {
		val result = parseHelper.parse('''
			channel:pubsub anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel platform AMQP
			}
		''')
		val pubsubInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(pubsubInstanciate instanceof InstancePubSub)
		Assert.assertTrue((pubsubInstanciate as InstancePubSub).targetedPlatform.getName.equals("AMQP"))
		Assert.assertNotNull((pubsubInstanciate as InstancePubSub).pubSubToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePTPChannelHTTP() {
		val result = parseHelper.parse('''
			channel:ptp anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel platform HTTP
			}
		''')
		val ptpInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(ptpInstanciate instanceof InstancePTP)
		Assert.assertTrue((ptpInstanciate as InstancePTP).targetedPlatform.getName.equals("HTTP"))
		Assert.assertNotNull((ptpInstanciate as InstancePTP).ptPToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePTPChannelCOAP() {
		val result = parseHelper.parse('''
			channel:ptp anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel platform COAP
			}
		''')
		val ptpInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(ptpInstanciate instanceof InstancePTP)
		Assert.assertTrue((ptpInstanciate as InstancePTP).targetedPlatform.getName.equals("COAP"))
		Assert.assertNotNull((ptpInstanciate as InstancePTP).ptPToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePTPChannelUPNP() {
		val result = parseHelper.parse('''
			channel:ptp anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel platform UPNP
			}
		''')
		val ptpInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(ptpInstanciate instanceof InstancePTP)
		Assert.assertTrue((ptpInstanciate as InstancePTP).targetedPlatform.getName.equals("UPNP"))
		Assert.assertNotNull((ptpInstanciate as InstancePTP).ptPToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePTPChannelZIGBEE() {
		val result = parseHelper.parse('''
			channel:ptp anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel platform ZIGBEE
			}
		''')
		val ptpInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(ptpInstanciate instanceof InstancePTP)
		Assert.assertTrue((ptpInstanciate as InstancePTP).targetedPlatform.getName.equals("ZIGBEE"))
		Assert.assertNotNull((ptpInstanciate as InstancePTP).ptPToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePTPChannelZWAVE() {
		val result = parseHelper.parse('''
			channel:ptp anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel platform ZWAVE
			}
		''')
		val ptpInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(ptpInstanciate instanceof InstancePTP)
		Assert.assertTrue((ptpInstanciate as InstancePTP).targetedPlatform.getName.equals("ZWAVE"))
		Assert.assertNotNull((ptpInstanciate as InstancePTP).ptPToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithBinding() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			channel:pubsub anychannel {
				topic anytopic
			}
			network anynet {
				domain org.atlanmod
				instance th1:thing1 platform JAVA
				instance ch1:anychannel platform MQTT
				bind th1 => ch1{anytopic}
			}
		''')
		result.assertNoErrors
		val bind = result.specifyNetworks.get(0).hasBinds.get(0)
		Assert.assertNotNull(bind.bindsInstanceThing)
		Assert.assertTrue(bind.bindAction.literal.equals("=>"))
		Assert.assertNotNull((bind.channelToBind as ToBindPubSub).targetedPubSubInstance)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithInstanceThingWithPort() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			channel:pubsub anychannel {
				topic anytopic
			}
			network anynet {
				domain org.atlanmod
				instance th1:thing1 platform JAVA
				instance ch1:anychannel platform MQTT
				bind th1.port1 => ch1{anytopic}
			}
		''', URI.createFileURI("/test.cy"), resourcesetProvider.get => [
			createResource(URI.createFileURI("/thing1.thingml")) => [
				load(new StringInputStream('''
					thing thing1{
						message message1()
						provided port port1 {
							receives message1
						}
						statechart thing1 init state1 {
							state state1 {}
							state state2 {}
						}
					}
					protocol X;
					configuration thing1Cfg {
						instance thing1Inst:thing1
						connector thing1.port1 over X
					}
				''', "UTF-8"), resourceSet.loadOptions)
			]
		])
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
