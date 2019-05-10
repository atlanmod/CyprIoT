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
				instance ch1:anychannel platform MQTT
				bind th1 => ch1{anytopic}
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

}
