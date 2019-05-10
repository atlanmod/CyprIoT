package org.atlanmod.cypriot.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
import org.atlanmod.cypriot.cyprIoT.CyprIoTPackage
import org.atlanmod.cypriot.cyprIoT.InstancePTP
import org.atlanmod.cypriot.cyprIoT.InstancePubSub
import org.atlanmod.cypriot.cyprIoT.InstanceThing
import org.atlanmod.cypriot.cyprIoT.Network
import org.atlanmod.cypriot.cyprIoT.PointToPoint
import org.atlanmod.cypriot.cyprIoT.PubSub
import org.atlanmod.cypriot.cyprIoT.Role
import org.atlanmod.cypriot.cyprIoT.RuleComm
import org.atlanmod.cypriot.cyprIoT.ThingAny
import org.atlanmod.cypriot.cyprIoT.ToBindPubSub
import org.atlanmod.cypriot.cyprIoT.User
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

import static org.junit.Assert.assertTrue

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

	/*******************************
	 * DECLARATION TESTS            *
	 *******************************/
	@Test
	def void roleDeclaration() {
		val result = parseHelper.parse('''
			role anyrole
		''')
		val role = result.declareRoles.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(role instanceof Role)
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
		Assert.assertTrue(role instanceof Role)
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
		Assert.assertTrue(user instanceof User)
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

	/*******************************
	 * POLICY TESTS                 *
	 *******************************/
	@Test
	def void policyDeclaration() {
		val result = parseHelper.parse('''
			policy anyname {
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.specifyPolicies.get(0).name.equals("anyname"))
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void DuplicatePolicyDeclaration() {
		val result = parseHelper.parse('''
			policy anyname {}
			policy anyname {}
		''')
		val policy = result.specifyPolicies.get(0)
		result.assertError(CyprIoTPackage::eINSTANCE.cyprIoTModel, CypriotValidator.POLICY_UNIQUENESS)
		Assert.assertNotNull(policy)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

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
		Assert.assertTrue((rule as RuleComm).commSubject.subjectOther instanceof ThingAny)
		Assert.assertTrue((rule as RuleComm).commObject.subjectOther instanceof Role)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	/*******************************
	 * NETWORK TESTS                *
	 *******************************/
	@Test
	def void networkDeclaration() {
		val result = parseHelper.parse('''
			network anyname {
				domain org.atlanmod
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void multipleNetworksDeclaration() {
		val result = parseHelper.parse('''
			network anyname1 {
				domain org.atlanmod.anyname1
			}
			network anyname2 {
				domain org.atlanmod.anyname2
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstanceThing() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			network anynet {
				domain org.atlanmod
				instance th1:thing1 platform JAVA
			}
		''')
		val thingInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(thingInstanciate instanceof InstanceThing)
		Assert.assertNotNull((thingInstanciate as InstanceThing).thingToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithDuplicateInstanceThings() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			network anynet {
				domain org.atlanmod
				instance th1:thing1 platform JAVA
				instance th1:thing1 platform JAVA
			}
		''')
		val thingInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		Assert.assertTrue(thingInstanciate instanceof InstanceThing)
		result.assertError(CyprIoTPackage::eINSTANCE.network, CypriotValidator.INSTANCETHING_UNIQUENESS)
		Assert.assertNotNull((thingInstanciate as InstanceThing).thingToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithDuplicateInstancePubSub() {
		val result = parseHelper.parse('''
			channel:pubsub anypubsub {}
			network anynet {
				domain org.atlanmod
				instance anypubsub1:anypubsub platform MQTT
				instance anypubsub1:anypubsub platform MQTT
			}
		''')
		val thingInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		Assert.assertTrue(thingInstanciate instanceof InstancePubSub)
		result.assertError(CyprIoTPackage::eINSTANCE.network, CypriotValidator.INSTANCEPUBSUB_UNIQUENESS)
		Assert.assertNotNull((thingInstanciate as InstancePubSub).pubSubToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithDuplicateInstancePTP() {
		val result = parseHelper.parse('''
			channel:ptp anyptp {}
			network anynet {
				domain org.atlanmod
				instance ptp1:anyptp platform HTTP
				instance ptp1:anyptp platform HTTP
			}
		''')
		val thingInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		Assert.assertTrue(thingInstanciate instanceof InstancePTP)
		result.assertError(CyprIoTPackage::eINSTANCE.network, CypriotValidator.INSTANCEPTP_UNIQUENESS)
		Assert.assertNotNull((thingInstanciate as InstancePTP).ptPToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithDuplicateNetworks() {
		val result = parseHelper.parse('''
			network anynet {
				domain org.atlanmod
			}
			network anynet {
				domain org.atlanmod
			}
		''')
		val network = result.specifyNetworks.get(0)
		Assert.assertTrue(network instanceof Network)
		result.assertError(CyprIoTPackage::eINSTANCE.cyprIoTModel, CypriotValidator.NETWORK_UNIQUENESS)
		Assert.assertNotNull(network)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePubSubChannelMQTT() {
		val result = parseHelper.parse('''
			channel:pubsub anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel platform MQTT
			}
		''')
		val pubsubInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(pubsubInstanciate instanceof InstancePubSub)
		assertTrue((pubsubInstanciate as InstancePubSub).targetedPlatform.getName.equals("MQTT"))
		Assert.assertNotNull((pubsubInstanciate as InstancePubSub).pubSubToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePubSubChannelAMQP() {
		val result = parseHelper.parse('''
			channel:pubsub anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel platform AMQP
			}
		''')
		val pubsubInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(pubsubInstanciate instanceof InstancePubSub)
		assertTrue((pubsubInstanciate as InstancePubSub).targetedPlatform.getName.equals("AMQP"))
		Assert.assertNotNull((pubsubInstanciate as InstancePubSub).pubSubToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePTPChannelHTTP() {
		val result = parseHelper.parse('''
			channel:ptp anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel platform HTTP
			}
		''')
		val ptpInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(ptpInstanciate instanceof InstancePTP)
		assertTrue((ptpInstanciate as InstancePTP).targetedPlatform.getName.equals("HTTP"))
		Assert.assertNotNull((ptpInstanciate as InstancePTP).ptPToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePTPChannelCOAP() {
		val result = parseHelper.parse('''
			channel:ptp anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel platform COAP
			}
		''')
		val ptpInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(ptpInstanciate instanceof InstancePTP)
		assertTrue((ptpInstanciate as InstancePTP).targetedPlatform.getName.equals("COAP"))
		Assert.assertNotNull((ptpInstanciate as InstancePTP).ptPToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePTPChannelUPNP() {
		val result = parseHelper.parse('''
			channel:ptp anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel platform UPNP
			}
		''')
		val ptpInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(ptpInstanciate instanceof InstancePTP)
		assertTrue((ptpInstanciate as InstancePTP).targetedPlatform.getName.equals("UPNP"))
		Assert.assertNotNull((ptpInstanciate as InstancePTP).ptPToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePTPChannelZIGBEE() {
		val result = parseHelper.parse('''
			channel:ptp anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel platform ZIGBEE
			}
		''')
		val ptpInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(ptpInstanciate instanceof InstancePTP)
		assertTrue((ptpInstanciate as InstancePTP).targetedPlatform.getName.equals("ZIGBEE"))
		Assert.assertNotNull((ptpInstanciate as InstancePTP).ptPToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithAnInstancePTPChannelZWAVE() {
		val result = parseHelper.parse('''
			channel:ptp anychannel {
			}
			network anynet {
				domain org.atlanmod
				instance ch1:anychannel platform ZWAVE
			}
		''')
		val ptpInstanciate = result.specifyNetworks.get(0).instantiate.get(0)
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(ptpInstanciate instanceof InstancePTP)
		assertTrue((ptpInstanciate as InstancePTP).targetedPlatform.getName.equals("ZWAVE"))
		Assert.assertNotNull((ptpInstanciate as InstancePTP).ptPToInstantiate)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithBinding() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			channel:pubsub anychannel {
				topic anytopic
			}
			network anynet {
				domain org.atlanmod
				instance th1:thing1 platform JAVA
				instance ch1:anychannel platform MQTT
				bind th1 => ch1{anytopic}
			}
		''')
		result.assertNoErrors
		val bind = result.specifyNetworks.get(0).hasBinds.get(0)
		Assert.assertNotNull(bind.bindsInstanceThing)
		Assert.assertTrue(bind.bindAction.literal.equals("=>"))
		Assert.assertNotNull((bind.channelToBind as ToBindPubSub).targetedPubSubInstance)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void NetworkWithInstanceThingWithPort() {
		val result = parseHelper.parse('''
			thing thing1 import "thing1.thingml"
			channel:pubsub anychannel {
				topic anytopic
			}
			network anynet {
				domain org.atlanmod
				instance th1:thing1 platform JAVA
				instance ch1:anychannel platform MQTT
				bind th1.port1 => ch1{anytopic}
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
