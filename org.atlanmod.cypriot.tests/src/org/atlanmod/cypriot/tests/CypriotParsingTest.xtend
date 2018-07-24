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
			role:sensor
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void UserDeclaration() {
		val result = parseHelper.parse('''
			user:anyuser
				assigned actor
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	
	@Test
	def void ThingDeclaration() {
		val result = parseHelper.parse('''
			thing:Hello 
				assigned sensor
				import "Hello.thingml"
		''')
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
	def void ReqRepDeclaration() {
		val result = parseHelper.parse('''
			channel:reqrep Rest {
				endpoint speed
			}
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
