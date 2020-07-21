package org.atlanmod.cypriot.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
import org.atlanmod.cypriot.cyprIoT.CyprIoTPackage
import org.atlanmod.cypriot.cyprIoT.InstanceChannel
import org.atlanmod.cypriot.cyprIoT.InstanceThing
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
		val thingInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(thingInstanciate instanceof InstanceThing)
		Assert.assertNotNull((thingInstanciate as InstanceThing).typeThing.thingToInstantiate)
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
		''', URI.createFileURI("/test.cy"), resourcesetProvider.get => [
			createResource(URI.createFileURI("/thing1.thingml")) => [
				load(new StringInputStream('''
					thing thing1{
						message message1()
						provided port port1 {
							sends message1
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
		val thingInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		Assert.assertTrue(thingInstanciate instanceof InstanceThing)
		result.assertError(CyprIoTPackage::eINSTANCE.network, CypriotValidator.INSTANCETHING_UNIQUENESS)
		Assert.assertNotNull((thingInstanciate as InstanceThing).typeThing.thingToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithDuplicateInstancePubSub() {
		val result = parseHelper.parse('''
			channel anypubsub {}
			network anynet {
				domain org.atlanmod
				instance anypubsub1:anypubsub protocol MQTT
				instance anypubsub1:anypubsub protocol MQTT
			}
		''')
		val thingInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		Assert.assertTrue(thingInstanciate instanceof InstanceChannel)
		result.assertError(CyprIoTPackage::eINSTANCE.network, CypriotValidator.INSTANCEPUBSUB_UNIQUENESS)
		Assert.assertNotNull((thingInstanciate as InstanceChannel).typeChannel.channelToInstantiate)
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
		result.assertError(CyprIoTPackage::eINSTANCE.cyprIoTModel, CypriotValidator.NETWORK_UNIQUENESS)
		Assert.assertNotNull(network)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePubSubChannelMQTT() {
		val result = parseHelper.parse('''
			channel anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel protocol MQTT
			}
		''')
		val pubsubInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(pubsubInstanciate instanceof InstanceChannel)
		Assert.assertTrue((pubsubInstanciate as InstanceChannel).typeChannel.targetedProtocol.getName.equals("MQTT"))
		Assert.assertNotNull((pubsubInstanciate as InstanceChannel).typeChannel.channelToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePubSubChannelAMQP() {
		val result = parseHelper.parse('''
			channel anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel protocol AMQP
			}
		''')
		val pubsubInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(pubsubInstanciate instanceof InstanceChannel)
		Assert.assertTrue((pubsubInstanciate as InstanceChannel).typeChannel.targetedProtocol.getName.equals("AMQP"))
		Assert.assertNotNull((pubsubInstanciate as InstanceChannel).typeChannel.channelToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePTPChannelHTTP() {
		val result = parseHelper.parse('''
			channel anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel protocol HTTP
			}
		''')
		val ptpInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(ptpInstanciate instanceof InstanceChannel)
		Assert.assertTrue((ptpInstanciate as InstanceChannel).typeChannel.targetedProtocol.getName.equals("HTTP"))
		Assert.assertNotNull((ptpInstanciate as InstanceChannel).typeChannel.channelToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePTPChannelCOAP() {
		val result = parseHelper.parse('''
			channel anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel protocol COAP
			}
		''')
		val ptpInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(ptpInstanciate instanceof InstanceChannel)
		Assert.assertTrue((ptpInstanciate as InstanceChannel).typeChannel.targetedProtocol.getName.equals("COAP"))
		Assert.assertNotNull((ptpInstanciate as InstanceChannel).typeChannel.channelToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePTPChannelUPNP() {
		val result = parseHelper.parse('''
			channel anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel protocol UPNP
			}
		''')
		val ptpInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(ptpInstanciate instanceof InstanceChannel)
		Assert.assertTrue((ptpInstanciate as InstanceChannel).typeChannel.targetedProtocol.getName.equals("UPNP"))
		Assert.assertNotNull((ptpInstanciate as InstanceChannel).typeChannel.channelToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePTPChannelZIGBEE() {
		val result = parseHelper.parse('''
			channel anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel protocol ZIGBEE
			}
		''')
		val ptpInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue((ptpInstanciate as InstanceChannel).typeChannel.targetedProtocol.getName.equals("ZIGBEE"))
		Assert.assertNotNull((ptpInstanciate as InstanceChannel).typeChannel.channelToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithBinding() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			channel anychannel {
				path anytopic(message1:JSON)
			}
			network anynet {
				domain org.atlanmod
				instance th1:thing1 platform JAVA
				instance ch1:anychannel protocol MQTT
				bind th1.port1 => ch1{anytopic}
			}
		''', URI.createFileURI("/test.cy"), resourcesetProvider.get => [
			createResource(URI.createFileURI("/thing1.thingml")) => [
				load(new StringInputStream('''
					thing thing1{
						message message1()
						provided port port1 {
							sends message1
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
		val bind = result.specifyNetworks.get(0).hasBinds.get(0)
		Assert.assertNotNull(bind.bindsInstanceThing)
		Assert.assertTrue(bind.bindAction.literal.equals("=>"))
		Assert.assertNotNull(bind.channelToBind.targetedChannelInstance)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithInstanceThingWithPort() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			channel anychannel {
				path anytopic(message1:JSON)
			}
			network anynet {
				domain org.atlanmod
				instance th1:thing1 platform JAVA
				instance ch1:anychannel protocol MQTT
				bind th1.port1 => ch1{anytopic}
			}
		''', URI.createFileURI("/test.cy"), resourcesetProvider.get => [
			createResource(URI.createFileURI("/thing1.thingml")) => [
				load(new StringInputStream('''
					thing thing1{
						message message1()
						provided port port1 {
							sends message1
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
