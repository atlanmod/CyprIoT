package org.atlanmod.cypriot.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
import org.atlanmod.cypriot.cyprIoT.CyprIoTPackage
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
class CypriotDeclarationParsingTest {

	@Inject
	ParseHelper<CyprIoTModel> parseHelper
	@Inject
	extension ValidationTestHelper
	
	@Inject
	Provider<ResourceSet> resourcesetProvider;

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
				import "Hello.thingml"
				assigned sensor
		''', URI.createFileURI("/test.cy"), resourcesetProvider.get => [
			createResource(URI.createFileURI("/Hello.thingml")) => [
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
			createResource(URI.createFileURI("/thing2.thingml")) => [
				load(new StringInputStream('''
					thing thing2{
						message message1()
						provided port port2 {
							receives message1
						}
						statechart thing1 init state1 {
							state state1 {}
							state state2 {}
						}
					}
					protocol X;
					configuration thing1Cfg {
						instance thing2Inst:thing2
						connector thing2.port2 over X
					}
				''', "UTF-8"), resourceSet.loadOptions)
			]
		])
		val thing = result.declareThings.get(0)
		result.assertError(CyprIoTPackage::eINSTANCE.cyprIoTModel, CypriotValidator.THING_UNIQUENESS)
		Assert.assertNotNull(thing)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void PubSubDeclaration() {
		val result = parseHelper.parse('''
			channel anypubsub {
				path topic1 
				path topic2 fork topic1
			}
		''')
		val topics = result.declareChannels.get(0).hasPaths
		val subtopics = topics.get(1).fork
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
			channel anypubsub {}
			channel anypubsub {}
		''')
		val pubsub = result.declareChannels.get(0)
		result.assertError(CyprIoTPackage::eINSTANCE.cyprIoTModel, CypriotValidator.PUBSUB_UNIQUENESS)
		Assert.assertNotNull(pubsub)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void DuplicateTopicsDeclaration() {
		val result = parseHelper.parse('''
			channel anypubsub {
				path anytopic
				path anytopic
			}
		''')
		val pubsub = result.declareChannels.get(0).hasPaths.get(0)
		result.assertError(CyprIoTPackage::eINSTANCE.typeChannel, CypriotValidator.TOPIC_UNIQUENESS)
		Assert.assertNotNull(pubsub)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void PtPDeclaration() {
		val result = parseHelper.parse('''
			channel Rest {
				path speed
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

}
