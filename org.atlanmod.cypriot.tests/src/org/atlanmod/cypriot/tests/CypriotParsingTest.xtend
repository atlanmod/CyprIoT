package org.atlanmod.cypriot.tests

import com.google.inject.Inject
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
import org.atlanmod.cypriot.cyprIoT.InstancePTP
import org.atlanmod.cypriot.cyprIoT.InstancePubSub
import org.atlanmod.cypriot.cyprIoT.InstanceThing
import org.atlanmod.cypriot.cyprIoT.PubSub
import org.atlanmod.cypriot.cyprIoT.Role
import org.atlanmod.cypriot.cyprIoT.Thing
import org.atlanmod.cypriot.cyprIoT.ToBindPubSub
import org.atlanmod.cypriot.cyprIoT.Topic
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.assertTrue

@RunWith(XtextRunner)
@InjectWith(typeof(CypriotInjectorProvider))
class CypriotParsingTest {
	@Inject
	ParseHelper<CyprIoTModel> parseHelper
	@Inject 
	extension ValidationTestHelper
	
	
	// Testing the declarations
	
	@Test
	def void roleDeclaration() {
		val result = parseHelper.parse('''
			role sensor
		''')
		val role = result.declareRoles.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(role instanceof Role)
		Assert.assertTrue(result.declareRoles.get(0).name.equals("sensor"))
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void UserDeclaration() {
		val result = parseHelper.parse('''
			role actor
			user anyuser
				assigned actor
		''')
		val user = result.declareUsers.get(0)
		val role = result.declareRoles
		val assignedRole = user.assignedRoles.get(0)
		result.assertNoErrors
		Assert.assertEquals("anyuser", user.name)
		Assert.assertTrue(assignedRole instanceof Role)
		Assert.assertEquals("actor", assignedRole.name)
		Assert.assertNotNull(assignedRole)
		Assert.assertNotNull(role)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void ThingDeclaration() {
		val result = parseHelper.parse('''
			role sensor
			thing Hello 
				assigned sensor
				import "Hello.thingml"
		''')
		val thing = result.declareThings.get(0)
		val role = result.declareRoles
		val assignedRole = thing.assignedRoles.get(0)
		result.assertNoErrors
		Assert.assertEquals("Hello", thing.name)
		Assert.assertEquals("sensor", assignedRole.name)
		Assert.assertNotNull(assignedRole)
		Assert.assertNotNull(role)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void PubSubDeclaration() {
		val result = parseHelper.parse('''
			channel:pubsub Broker {
				topic topic1 
				topic topic2 subtopicOf topic1
			}
		''')
		val topics = (result.declareChannels.get(0) as PubSub).hasTopics
		val subtopics = topics.get(1).subtopicOf
		result.assertNoErrors
		Assert.assertTrue(topics.get(0) instanceof Topic)
		Assert.assertEquals("topic1", topics.get(0).name)
		Assert.assertEquals("topic1", subtopics.get(0).name)
		Assert.assertNotNull(subtopics)
		Assert.assertNotNull(topics)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void PtPDeclaration() {
		val result = parseHelper.parse('''
			channel:ptp Rest {
				ConnectionPoint speed
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	// Testing the policy

	@Test
	def void policyDeclaration() {
		val result = parseHelper.parse('''
			policy anyname {
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.specifyPolicies.get(0).name.equals("anyname"))
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	// Testing the rule
	
	@Test
	def void RuleWithDenyReceiveBetweenThings() { // TODO test rule with ports
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1 deny:receive thing2
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.specifyPolicies.get(0).hasRules.get(0).thingSubject instanceof Thing)
		Assert.assertTrue(result.specifyPolicies.get(0).hasRules.get(0).thingObject instanceof Thing)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithAllowReceiveBetweenThings() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1 allow:receive thing2
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.specifyPolicies.get(0).hasRules.get(0).thingSubject instanceof Thing)
		Assert.assertTrue(result.specifyPolicies.get(0).hasRules.get(0).thingObject instanceof Thing)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithDenySendBetweenThings() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1 deny:send thing2
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.specifyPolicies.get(0).hasRules.get(0).thingSubject instanceof Thing)
		Assert.assertTrue(result.specifyPolicies.get(0).hasRules.get(0).thingObject instanceof Thing)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithAllowSendBetweenThings() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1 allow:send thing2
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.specifyPolicies.get(0).hasRules.get(0).thingSubject instanceof Thing)
		Assert.assertTrue(result.specifyPolicies.get(0).hasRules.get(0).thingObject instanceof Thing)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithDenySendReceiveBetweenThings() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1 deny:send-receive thing2
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.specifyPolicies.get(0).hasRules.get(0).thingSubject instanceof Thing)
		Assert.assertTrue(result.specifyPolicies.get(0).hasRules.get(0).thingObject instanceof Thing)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithAllowSendReceiveBetweenThings() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1 allow:send-receive thing2
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.specifyPolicies.get(0).hasRules.get(0).thingSubject instanceof Thing)
		Assert.assertTrue(result.specifyPolicies.get(0).hasRules.get(0).thingObject instanceof Thing)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void RuleWithAllowSendBetweenThingAndRole() {
		val result = parseHelper.parse('''
			role role1
			thing thing1 import "thing1.thingml"
			policy anyname {
				rule thing1 allow:send role1
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	// Testing the network
	
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
		assertTrue((pubsubInstanciate  as InstancePubSub).targetedPlatform.getName.equals("MQTT"))
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
		assertTrue((pubsubInstanciate  as InstancePubSub).targetedPlatform.getName.equals("AMQP") )
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
		assertTrue((ptpInstanciate  as InstancePTP).targetedPlatform.getName.equals("HTTP") )
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
		assertTrue((ptpInstanciate  as InstancePTP).targetedPlatform.getName.equals("COAP") )
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
		assertTrue((ptpInstanciate  as InstancePTP).targetedPlatform.getName.equals("UPNP") )
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
		assertTrue((ptpInstanciate  as InstancePTP).targetedPlatform.getName.equals("ZIGBEE") )
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
		assertTrue((ptpInstanciate  as InstancePTP).targetedPlatform.getName.equals("ZWAVE") )
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

}
