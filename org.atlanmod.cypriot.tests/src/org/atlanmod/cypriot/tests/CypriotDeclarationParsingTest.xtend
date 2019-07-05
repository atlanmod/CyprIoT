package org.atlanmod.cypriot.tests

import com.google.inject.Inject
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
import org.atlanmod.cypriot.cyprIoT.CyprIoTPackage
import org.atlanmod.cypriot.cyprIoT.PointToPoint
import org.atlanmod.cypriot.cyprIoT.PubSub
import org.atlanmod.cypriot.validation.CypriotValidator
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(typeof(CypriotWithThingMLInjectorProvider))
class CypriotDeclarationParsingTest {

	@Inject
	ParseHelper<CyprIoTModel> parseHelper
	@Inject
	extension ValidationTestHelper

	/*******************************
	 * DECLARATION TESTS            *
	 *******************************/
	@Test
	def void roleDeclaration() {
		val result = parseHelper.parse('''
			role anyrole
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.declareRoles.get(0).name.equals("anyrole"))
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void DuplicateRolesDeclaration() {
		val result = parseHelper.parse('''
			role anyrole
			role anyrole
		''')
		val role = result.declareRoles.get(0)
		result.assertError(CyprIoTPackage::eINSTANCE.cyprIoTModel, CypriotValidator.ROLE_UNIQUENESS)
		Assert.assertNotNull(role)
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
		Assert.assertEquals("actor", assignedRole.name)
		Assert.assertNotNull(assignedRole)
		Assert.assertNotNull(role)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void DuplicateUsersDeclaration() {
		val result = parseHelper.parse('''
			user anyuser
			user anyuser
		''')
		val user = result.declareUsers.get(0)
		result.assertError(CyprIoTPackage::eINSTANCE.cyprIoTModel, CypriotValidator.USER_UNIQUENESS)
		Assert.assertNotNull(user)
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
	def void DuplicateThingsDeclaration() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing1 import "thing1.thingml"
		''')
		val thing = result.declareThings.get(0)
		result.assertError(CyprIoTPackage::eINSTANCE.cyprIoTModel, CypriotValidator.THING_UNIQUENESS)
		Assert.assertNotNull(thing)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void PubSubDeclaration() {
		val result = parseHelper.parse('''
			channel:pubsub anypubsub {
				topic topic1 
				topic topic2 subtopicOf topic1
			}
		''')
		val topics = (result.declareChannels.get(0) as PubSub).hasTopics
		val subtopics = topics.get(1).subtopicOf
		result.assertNoErrors
		Assert.assertEquals("topic1", topics.get(0).name)
		Assert.assertEquals("topic1", subtopics.get(0).name)
		Assert.assertNotNull(subtopics)
		Assert.assertNotNull(topics)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void DuplicatePubSubDeclaration() {
		val result = parseHelper.parse('''
			channel:pubsub anypubsub {}
			channel:pubsub anypubsub {}
		''')
		val pubsub = result.declareChannels.get(0)
		Assert.assertTrue(pubsub instanceof PubSub)
		result.assertError(CyprIoTPackage::eINSTANCE.cyprIoTModel, CypriotValidator.PUBSUB_UNIQUENESS)
		Assert.assertNotNull(pubsub)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void DuplicateTopicsDeclaration() {
		val result = parseHelper.parse('''
			channel:pubsub anypubsub {
				topic anytopic
				topic anytopic
			}
		''')
		val pubsub = (result.declareChannels.get(0) as PubSub).hasTopics.get(0)
		result.assertError(CyprIoTPackage::eINSTANCE.pubSub, CypriotValidator.TOPIC_UNIQUENESS)
		Assert.assertNotNull(pubsub)
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
	def void DuplicatePTPDeclaration() {
		val result = parseHelper.parse('''
			channel:ptp anyptp {}
			channel:ptp anyptp {}
		''')
		val ptp = result.declareChannels.get(0)
		Assert.assertTrue(ptp instanceof PointToPoint)
		result.assertError(CyprIoTPackage::eINSTANCE.cyprIoTModel, CypriotValidator.PTP_UNIQUENESS)
		Assert.assertNotNull(ptp)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void DuplicateConnectionPointsDeclaration() {
		val result = parseHelper.parse('''
			channel:ptp anyptp {
				ConnectionPoint anycp
				ConnectionPoint anycp
			}
		''')
		val ptp = (result.declareChannels.get(0) as PointToPoint).hasConnectionPoints.get(0)
		result.assertError(CyprIoTPackage::eINSTANCE.pointToPoint, CypriotValidator.CONNECTIONPOINT_UNIQUENESS)
		Assert.assertNotNull(ptp)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
