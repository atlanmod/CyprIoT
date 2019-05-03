package org.atlanmod.cypriot.tests

import com.google.inject.Inject
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
import org.atlanmod.cypriot.cyprIoT.InstancePubSub
import org.atlanmod.cypriot.cyprIoT.InstanceThing
import org.atlanmod.cypriot.cyprIoT.PubSub
import org.atlanmod.cypriot.cyprIoT.Role
import org.atlanmod.cypriot.cyprIoT.Thing
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
		Assert.assertTrue((thingInstanciate as InstanceThing).thingToInstantiate instanceof Thing)
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
		Assert.assertTrue((pubsubInstanciate as InstancePubSub).pubSubToInstantiate instanceof PubSub)
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
		Assert.assertTrue((pubsubInstanciate as InstancePubSub).pubSubToInstantiate instanceof PubSub)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

}
