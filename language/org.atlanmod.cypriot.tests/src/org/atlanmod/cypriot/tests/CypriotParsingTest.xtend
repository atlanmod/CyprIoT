package org.atlanmod.cypriot.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
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
class CypriotParsingTest {

	@Inject
	ParseHelper<CyprIoTModel> parseHelper
	@Inject
	extension ValidationTestHelper

	@Inject
	Provider<ResourceSet> resourcesetProvider;

	/*******************************
	 * IMPORT TESTS                *
	 *******************************/
	@Test
	def void importCypriotFileWithBind() {
		val result = parseHelper.parse('''
			import "import1.cy"
			network anynet {
				domain org.atlanmod
				instance th1:thing1 platform JAVA
				instance ch1:anychannel protocol MQTT
				bind th1.port1 => ch1{anytopic}
			}
		''', URI.createFileURI("/test.cy"), resourcesetProvider.get => [
			createResource(URI.createFileURI("/import1.cy")) => [
				load(new StringInputStream('''
					thing thing1 import "thing1.thingml"
					channel:pubsub anychannel {
						topic anytopic
					}
				''', "UTF-8"), resourceSet.loadOptions)
			]
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

	@Test
	def void importCypriotFileWithThingAssignedRole() {
		val result = parseHelper.parse('''
			import "import1.cy"
			thing thing1 assigned anyrole import "thing1.thingml"
		''', URI.createFileURI("/test.cy"), resourcesetProvider.get => [
			createResource(URI.createFileURI("/import1.cy")) => [
				load(new StringInputStream('''
					role anyrole
				''', "UTF-8"), resourceSet.loadOptions)
			]
			createResource(URI.createFileURI("/thing1.thingml")) => [
				load(new StringInputStream('''
					thing thing2{
						function bar() do
							println "test"
						end
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
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void importCypriotFileWithUserAssignedRole() {
		val result = parseHelper.parse('''
			import "import1.cy"
			user user1 assigned anyrole
		''', URI.createFileURI("/test.cy"), resourcesetProvider.get => [
			createResource(URI.createFileURI("/import1.cy")) => [
				load(new StringInputStream('''
					role anyrole
				''', "UTF-8"), resourceSet.loadOptions)
			]
		])
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void TimeDeclaration() {
		val result = parseHelper.parse('''
			time time1 * 4 * * * *
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

}
