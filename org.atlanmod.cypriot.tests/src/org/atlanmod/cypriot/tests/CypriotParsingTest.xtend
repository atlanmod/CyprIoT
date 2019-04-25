package org.atlanmod.cypriot.tests

import com.google.inject.Inject
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

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
		Assert.assertNotNull(result)
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
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void RuleWithDenyReceiveBetweenThings() {
		val result = parseHelper.parse('''
			policy anyname {
				rule thing1 deny:receive thing2
			}
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void RuleWithAllowReceiveBetweenThings() {
		val result = parseHelper.parse('''
			policy anyname {
				rule thing1 allow:receive thing2
			}
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void RuleWithDenySendBetweenThings() {
		val result = parseHelper.parse('''
			policy anyname {
				rule thing1 deny:send thing2
			}
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void RuleWithAllowSendBetweenThings() {
		val result = parseHelper.parse('''
			policy anyname {
				rule thing1 allow:send thing2
			}
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
