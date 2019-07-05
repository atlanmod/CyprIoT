package org.atlanmod.cypriot.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
import org.atlanmod.cypriot.cyprIoT.CyprIoTPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.diagnostics.Diagnostic
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.util.StringInputStream
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(typeof(CypriotWithThingMLInjectorProvider))
class CypriotTriggerRuleParsing {
	@Inject
	ParseHelper<CyprIoTModel> parseHelper
	@Inject
	extension ValidationTestHelper

	@Inject
	Provider<ResourceSet> resourcesetProvider;

	@Test
	def void RuleWithStateTriggerGoToStateError() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1->state:state2 trigger:goToState thing2->state:stateXX
			}
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
		result.assertError(CyprIoTPackage::eINSTANCE.getState,
			Diagnostic.LINKING_DIAGNOSTIC, 'stateXX cannot be resolved.')
	}

	@Test
	def void RuleWithStateTriggerGoToState() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1->state:state2 trigger:goToState thing2->state:state1
			}
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
		result.assertNoErrors
	}

	@Test
	def void RuleWithStateTriggerTransition() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1->state:state2 trigger:performTransition thing2
			}
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
		result.assertNoErrors
	}
	
	@Test
	def void RuleWithStateTriggerFunction() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1->state:state2 trigger:executeFunction thing2->function:bar
			}
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
	}
	
		@Test
	def void RuleWithStateTriggerFunctionNotFound() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1->state:state2 trigger:executeFunction thing2->function:bar
			}
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
		result.assertError(CyprIoTPackage::eINSTANCE.getFunction,
			Diagnostic.LINKING_DIAGNOSTIC,'bar cannot be resolved.')
	}
}
