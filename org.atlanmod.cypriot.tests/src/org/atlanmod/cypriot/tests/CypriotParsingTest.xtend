package org.atlanmod.cypriot.tests

import com.google.inject.Inject
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
import org.atlanmod.cypriot.cyprIoT.PubSub
import org.atlanmod.cypriot.cyprIoT.Thing
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.atlanmod.cypriot.cyprIoT.Topic
import org.atlanmod.cypriot.cyprIoT.Role

@RunWith(XtextRunner)
@InjectWith(typeof(CypriotInjectorProvider))
class CypriotParsingTest {
	@Inject
	ParseHelper<CyprIoTModel> parseHelper

	@Test
	def void roleDeclaration() {
		val result = parseHelper.parse('''
			role sensor
		''')
		val role = result.declareRoles.get(0)
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
		val role =  result.declareRoles
		val assignedRole =  user.assignedRoles.get(0)
		Assert.assertEquals("anyuser",user.name)
		Assert.assertTrue(assignedRole instanceof Role)
		Assert.assertEquals("actor",assignedRole.name)
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
		val role =  result.declareRoles
		val assignedRole =  thing.assignedRoles.get(0)
		Assert.assertEquals("Hello",thing.name)
		Assert.assertEquals("sensor",assignedRole.name)
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
		Assert.assertTrue(topics.get(0) instanceof Topic)
		Assert.assertEquals("topic1",topics.get(0).name)
		Assert.assertEquals("topic1",subtopics.get(0).name)
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
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void policyDeclaration() {
		val result = parseHelper.parse('''
			policy anyname {
			}
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.specifyPolicies.get(0).name.equals("anyname"))
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void RuleWithDenyReceiveBetweenThings() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1 deny:receive thing2
			}
		''')
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
		Assert.assertNotNull(result)
		Assert.assertTrue(result.specifyPolicies.get(0).hasRules.get(0).thingSubject instanceof Thing)
		Assert.assertTrue(result.specifyPolicies.get(0).hasRules.get(0).thingObject instanceof Thing)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
