package org.atlanmod.cypriot.scoping

import java.util.Collections
import java.util.List
import org.atlanmod.cypriot.cyprIoT.BridgeSubject
import org.atlanmod.cypriot.cyprIoT.CyprIoTPackage
import org.atlanmod.cypriot.cyprIoT.Network
import org.atlanmod.cypriot.cyprIoT.PointToPoint
import org.atlanmod.cypriot.cyprIoT.PubSub
import org.atlanmod.cypriot.cyprIoT.ThingAny
import org.atlanmod.cypriot.cyprIoT.ToBindPTP
import org.atlanmod.cypriot.cyprIoT.ToBindPubSub
import org.atlanmod.cypriot.cyutil.Helpers
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.atlanmod.cypriot.cyprIoT.Bind
import org.atlanmod.cypriot.cyprIoT.SubjectOther
import org.atlanmod.cypriot.cyprIoT.ObjectOther
import org.atlanmod.cypriot.cyprIoT.Thing
import java.util.ArrayList

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class CypriotScopeProvider extends AbstractCypriotScopeProvider {
	val cypriotInstance = CyprIoTPackage.eINSTANCE;
	protected List<? extends EObject> EMPTY = Collections.EMPTY_LIST;
	
	override IScope getScope(EObject context, EReference reference) {
		if (reference == cypriotInstance.user_AssignedRoles || reference == cypriotInstance.thing_AssignedRoles) {
			return Scopes.scopeFor(Helpers.allRoles(Helpers.findContainingModel(context)))
		} else if (reference == cypriotInstance.typeThing_ThingToInstantiate) {
			return Scopes.scopeFor(Helpers.allThings(Helpers.findContainingModel(context)))
		} else if (reference == cypriotInstance.typePubSub_PubSubToInstantiate) {
			return Scopes.scopeFor(Helpers.allPusSub(Helpers.findContainingModel(context)))
		} else if (reference == cypriotInstance.typePTP_PtPToInstantiate) {
			return Scopes.scopeFor(Helpers.allReqRep(Helpers.findContainingModel(context)))
		} else if (reference == cypriotInstance.typeThing_Owner) {
			return Scopes.scopeFor(Helpers.allUsers(Helpers.findContainingModel(context)))
		} else if (reference == cypriotInstance.typePubSub_User) {
			return Scopes.scopeFor(Helpers.allUsers(Helpers.findContainingModel(context)))
		} else if (reference == cypriotInstance.topic_SubtopicOf) {
			return Scopes.scopeFor(Helpers.allTopicsInPubSub(context.eContainer as PubSub))
		} else if (reference == cypriotInstance.bind_BindsInstanceThing) {
			return Scopes.scopeFor(Helpers.allThinginstances(context.eContainer as Network))
		} else if (reference == cypriotInstance.bind_BindsInstanceThingBack) {
			return Scopes.scopeFor(Helpers.allThinginstances(context.eContainer as Network).filter[
				k | !k.name.equals((context as Bind).bindsInstanceThing.name)
			])
		} else if (reference == cypriotInstance.toBindPubSub_TargetedPubSubInstance) {
			return Scopes.scopeFor(Helpers.allPubSubinstances(context.eContainer.eContainer as Network))
		} else if (reference == cypriotInstance.toBindPTP_TargetedPtpInstance) {
			return Scopes.scopeFor(Helpers.allPtPinstances(context.eContainer.eContainer as Network))
		} else if (reference == cypriotInstance.toBindPubSub_Topics) {
			return Scopes.scopeFor(Helpers.allTopics((context as ToBindPubSub).targetedPubSubInstance))
		} else if (reference == cypriotInstance.toBindPTP_BindsToConnectionPoint) {
			return Scopes.scopeFor(Helpers.allConnectionPoints((context as ToBindPTP).targetedPtpInstance))
		} else if (reference == cypriotInstance.networkBridge_BridgeSubject) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, BridgeSubject)
			return Scopes.scopeFor(candidates)	
		} else if (reference == cypriotInstance.policiesEnforcement_HasEnforcedPolicies) {
			return Scopes.scopeFor(Helpers.allPolicies(Helpers.findContainingModel(context)))
		} else if (reference == cypriotInstance.thingWithStateOrPort_Thing) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, ThingAny)
			return Scopes.scopeFor(candidates)
		} else if (reference == cypriotInstance.thingWithFunction_Thing) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, ThingAny)
			return Scopes.scopeFor(candidates)
		} else if (reference == cypriotInstance.commSubject_SubjectOther) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, SubjectOther)
			return Scopes.scopeFor(candidates)
		} else if (reference == cypriotInstance.commObject_ObjectOther) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, ObjectOther)
			return Scopes.scopeFor(candidates)
		} else if (reference == cypriotInstance.topic_AcceptedMessages) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, Thing)
			return Scopes.scopeFor(Helpers.allMessagesInNetworkModel(candidates as ArrayList<Thing>))
		} else if (reference == cypriotInstance.bind_PortToBind) {
			return Scopes.scopeFor(Helpers.getAllPortsThing(Helpers.findContainingBind(context).bindsInstanceThing.typeThing.thingToInstantiate))
		} else if (reference == cypriotInstance.bind_PortToBindBack) {
			return Scopes.scopeFor(Helpers.getAllPortsThing(Helpers.findContainingBind(context).bindsInstanceThingBack.typeThing.thingToInstantiate))
		}else if (reference == cypriotInstance.getPort_Port) {
			return Scopes.scopeFor(Helpers.getAllPortsThingAny(Helpers.allContainedCrossReferencesOfType(context.eContainer, ThingAny).get(0)))
		} else if (reference == cypriotInstance.getState_State) {
			return Scopes.scopeFor(Helpers.getAllStatesThingAny(Helpers.allContainedCrossReferencesOfType(context.eContainer, ThingAny).get(0)))
		} else if (reference == cypriotInstance.getFunction_Function) {
			return Scopes.scopeFor(Helpers.getAllFunctionsThingAny(Helpers.allContainedCrossReferencesOfType(context.eContainer, ThingAny).get(0)))
		} else if (reference == cypriotInstance.pubSubWithTopic_Pubsub) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, PubSub)
			return Scopes.scopeFor(candidates)	
		} else if (reference == cypriotInstance.getTopic_Topic) {
			return Scopes.scopeFor(Helpers.allTopicsInPubSub(Helpers.allContainedCrossReferencesOfType(context.eContainer, PubSub).get(0)))
		} else if (reference == cypriotInstance.PTPWithConnectionPoint_Ptp) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, PointToPoint)
			return Scopes.scopeFor(candidates)	
		} else if (reference == cypriotInstance.actionTrigger_ThingToTransition) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, ThingAny)
			return Scopes.scopeFor(candidates)	
		} else if (reference == cypriotInstance.getConnectionPoint_ConnectionPoint) {
			return Scopes.scopeFor(Helpers.allConnectionPointsInPTP(Helpers.allContainedCrossReferencesOfType(context.eContainer, PointToPoint).get(0)))
		} else {
			System.err.println("INFO: Resolving reference : " + reference.name + " in Class " +
				(reference.eContainer as ENamedElement).getName);
		}
		return IScope.NULLSCOPE;
	}
}

