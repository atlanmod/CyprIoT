package org.atlanmod.cypriot.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
import org.atlanmod.cypriot.cyprIoT.Role
import org.atlanmod.cypriot.cyprIoT.RuleComm
import org.atlanmod.cypriot.cyprIoT.Thing
import org.atlanmod.cypriot.cyprIoT.User
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
class CypriotRuleParsingTest {

	@Inject
	ParseHelper<CyprIoTModel> parseHelper
	@Inject
	extension ValidationTestHelper

	@Inject
	Provider<ResourceSet> resourcesetProvider;

	/*******************************
	 * RULE TESTS                   *
	 *******************************/
	@Test
	def void RuleWithDenyReceiveBetweenThings() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1 deny:receive thing2
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithDenyReceiveBetweenTwoPorts() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1->port:port1 deny:receive thing2->port:port2
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
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithDenyReceiveBetweenAPortAndThing() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1->port:port1 deny:receive thing2
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
		])
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithDenyReceiveBetweenThingAndAPort() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing2 deny:receive thing1->port:port1
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
		])
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	// TODO test rule with state
	@Test
	def void RuleWithAllowReceiveBetweenThings() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1 allow:receive thing2
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithAllowReceiveBetweenTwoPorts() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1->port:port1 allow:receive thing2->port:port2
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
		Assert.assertNotNull(result)
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
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithDenySendBetweenTwoPorts() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1->port:port1 deny:send thing2->port:port2
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
		Assert.assertNotNull(result)
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
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithAllowSendBetweenTwoPorts() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1->port:port1 allow:send thing2->port:port2
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
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithDenySendReceiveBetweenThings() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1 deny:send-receive thing2
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithDenySendReceiveBetweenTwoPorts() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1->port:port1 deny:send-receive thing2->port:port2
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
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithAllowSendReceiveBetweenThings() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1 allow:send-receive thing2
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithAllowSendReceiveBetweenTwoPorts() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			thing thing2 import "thing2.thingml"
			policy anyname {
				rule thing1->port:port1 allow:send-receive thing2->port:port2
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
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithAllowSendBetweenThingAndRole() {
		val result = parseHelper.parse('''
			role role1
			thing thing1 import "thing1.thingml"
			policy anyname {
				rule thing1 allow:send role1
			}
		''')
		result.assertNoErrors
		var rule = result.specifyPolicies.get(0).hasRules.get(0)
		Assert.assertTrue((rule as RuleComm).commSubject.subjectOther instanceof Thing)
		Assert.assertTrue((rule as RuleComm).commObject.subjectOther instanceof Role)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithAllowSendBetweenRoleAndPort() {
		val result = parseHelper.parse('''
			role role1
			thing thing1 import "thing1.thingml"
			policy anyname {
				rule thing1->port:port1 allow:send role1
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
		])
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithAllowSendBetweenRoleAndThing() {
		val result = parseHelper.parse('''
			role role1
			thing thing1 import "thing1.thingml"
			policy anyname {
				rule role1 allow:send thing1
			}
		''')
		result.assertNoErrors
		var rule = result.specifyPolicies.get(0).hasRules.get(0)
		Assert.assertTrue((rule as RuleComm).commSubject.subjectOther instanceof Role)
		Assert.assertTrue((rule as RuleComm).commObject.subjectOther instanceof Thing)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithAllowSendBetweenPortAndRole() {
		val result = parseHelper.parse('''
			role role1
			thing thing1 import "thing1.thingml"
			policy anyname {
				rule role1 allow:send thing1->port:port1
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
		])
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithAllowSendBetweenThingAndUser() {
		val result = parseHelper.parse('''
			user user1
			thing thing1 import "thing1.thingml"
			policy anyname {
				rule thing1 allow:send user1
			}
		''')
		result.assertNoErrors
		var rule = result.specifyPolicies.get(0).hasRules.get(0)
		Assert.assertTrue((rule as RuleComm).commSubject.subjectOther instanceof Thing)
		Assert.assertTrue((rule as RuleComm).commObject.subjectOther instanceof User)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithAllowSendBetweenUserAndPort() {
		val result = parseHelper.parse('''
			role user1
			thing thing1 import "thing1.thingml"
			policy anyname {
				rule thing1->port:port1 allow:send user1
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
		])
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithAllowSendBetweenUserAndThing() {
		val result = parseHelper.parse('''
			user user1
			thing thing1 import "thing1.thingml"
			policy anyname {
				rule user1 allow:send thing1
			}
		''')
		result.assertNoErrors
		var rule = result.specifyPolicies.get(0).hasRules.get(0)
		Assert.assertTrue((rule as RuleComm).commSubject.subjectOther instanceof User)
		Assert.assertTrue((rule as RuleComm).commObject.subjectOther instanceof Thing)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void RuleWithAllowSendBetweenPortAndUser() {
		val result = parseHelper.parse('''
			user user1
			thing thing1 import "thing1.thingml"
			policy anyname {
				rule user1 allow:send thing1->port:port1
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
		])
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
