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
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(typeof(CypriotWithThingMLInjectorProvider))
class CypriotBindingsTest {
	@Inject
	ParseHelper<CyprIoTModel> parseHelper
	@Inject
	extension ValidationTestHelper

	@Inject
	Provider<ResourceSet> resourcesetProvider;

	@Test
	def void RuleWithStateTriggerGoToState() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			channel:pubsub anypubsub {
				topic anytopic(message2)
			}
			network anynet {
				domain org.atlanmod
				instance th1:thing1 platform JAVA
				instance ch1:anypubsub protocol MQTT
				bind th1.port1 => ch1{anytopic}
			}
		''', URI.createFileURI("/test.cy"), resourcesetProvider.get => [
			createResource(URI.createFileURI("/thing1.thingml")) => [
				load(new StringInputStream('''
					thing thing1{
						message message1()
						message message2()
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
	}
}
