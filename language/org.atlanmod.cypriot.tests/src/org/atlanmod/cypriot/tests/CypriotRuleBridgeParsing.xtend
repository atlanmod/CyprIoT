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
class CypriotRuleBridgeParsing {
	
	@Inject
	ParseHelper<CyprIoTModel> parseHelper
	@Inject
	extension ValidationTestHelper

	@Inject
	Provider<ResourceSet> resourcesetProvider;
	
	@Test
	def void RuleBridgeBetweenTopics() {
		val result = parseHelper.parse('''
			channel anypubsub {
				path topic1 
				path topic2 subpathOf topic1
			}
			channel anypubsub2 {
				path topic1 
				path topic2 subpathOf topic1
			}
			policy anyname {
				rule anypubsub->path:topic1 bridge:to anypubsub2->path:topic1
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
//	@Test
//	def void RuleBridgeBetweenPorts() {
//		val result = parseHelper.parse('''
//			thing thing1 import "thing1.thingml"
//			thing thing2 import "thing2.thingml"
//			policy anyname {
//				rule thing1->port:port1 bridge:to thing2->port:port2
//			}
//		''', URI.createFileURI("/test.cy"), resourcesetProvider.get => [
//			createResource(URI.createFileURI("/thing1.thingml")) => [
//				load(new StringInputStream('''
//					thing thing1{
//						message message1()
//						provided port port1 {
//							receives message1
//						}
//						statechart thing1 init state1 {
//							state state1 {}
//							state state2 {}
//						}
//					}
//					protocol X;
//					configuration thing1Cfg {
//						instance thing1Inst:thing1
//						connector thing1.port1 over X
//					}
//				''', "UTF-8"), resourceSet.loadOptions)
//			]
//			createResource(URI.createFileURI("/thing2.thingml")) => [
//				load(new StringInputStream('''
//					thing thing2{
//						message message1()
//						provided port port2 {
//							receives message1
//						}
//						statechart thing1 init state1 {
//							state state1 {}
//							state state2 {}
//						}
//					}
//					protocol X;
//					configuration thing1Cfg {
//						instance thing2Inst:thing2
//						connector thing2.port2 over X
//					}
//				''', "UTF-8"), resourceSet.loadOptions)
//			]
//		])
//		result.assertNoErrors
//		Assert.assertNotNull(result)
//		Assert.assertTrue(result.eResource.errors.isEmpty)
//	}
	
//	@Test
//	def void RuleBridgeBetweenPortAndTopic() {
//		val result = parseHelper.parse('''
//			thing thing1 import "thing1.thingml"
//			channel anypubsub {
//				path topic1 
//			}
//			policy anyname {
//				rule thing1->port:port1 bridge:to anypubsub->path:topic1
//			}
//		''', URI.createFileURI("/test.cy"), resourcesetProvider.get => [
//			createResource(URI.createFileURI("/thing1.thingml")) => [
//				load(new StringInputStream('''
//					thing thing1{
//						message message1()
//						provided port port1 {
//							receives message1
//						}
//						statechart thing1 init state1 {
//							state state1 {}
//							state state2 {}
//						}
//					}
//					protocol X;
//					configuration thing1Cfg {
//						instance thing1Inst:thing1
//						connector thing1.port1 over X
//					}
//				''', "UTF-8"), resourceSet.loadOptions)
//			]
//		])
//		result.assertNoErrors
//		Assert.assertNotNull(result)
//		Assert.assertTrue(result.eResource.errors.isEmpty)
//	}
}