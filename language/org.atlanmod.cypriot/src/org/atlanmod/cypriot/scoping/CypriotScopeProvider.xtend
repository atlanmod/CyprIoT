package org.atlanmod.cypriot.scoping

import java.util.ArrayList
import java.util.Collections
import java.util.List
import org.atlanmod.cypriot.cyprIoT.Bind
import org.atlanmod.cypriot.cyprIoT.BridgeSubject
import org.atlanmod.cypriot.cyprIoT.ChannelToBind
import org.atlanmod.cypriot.cyprIoT.CyprIoTPackage
import org.atlanmod.cypriot.cyprIoT.Network
import org.atlanmod.cypriot.cyprIoT.ObjectOther
import org.atlanmod.cypriot.cyprIoT.SubjectOther
import org.atlanmod.cypriot.cyprIoT.ThingAny
import org.atlanmod.cypriot.cyprIoT.TypeChannel
import org.atlanmod.cypriot.cyprIoT.TypeThing
import org.atlanmod.cypriot.cyutil.Helpers
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

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
		if (reference == cypriotInstance.user_AssignedRoles || reference == cypriotInstance.typeThing_AssignedRoles) {
			return Scopes.scopeFor(Helpers.allRoles(Helpers.findContainingModel(context)))
		} else if (reference == cypriotInstance.thingToInstanciate_ThingToInstantiate) {
			return Scopes.scopeFor(Helpers.allThings(Helpers.findContainingModel(context)))
		} else if (reference == cypriotInstance.channelToInstanciate_PubSubToInstantiate) {
			return Scopes.scopeFor(Helpers.allPusSub(Helpers.findContainingModel(context)))
		} else if (reference == cypriotInstance.thingToInstanciate_Owner) {
			return Scopes.scopeFor(Helpers.allUsers(Helpers.findContainingModel(context)))
		} else if (reference == cypriotInstance.path_SubpathOf) {
			return Scopes.scopeFor(Helpers.allTopicsInPubSub(context.eContainer as TypeChannel))
		} else if (reference == cypriotInstance.bind_BindsInstanceThing) {
			return Scopes.scopeFor(Helpers.allThinginstances(context.eContainer as Network))
		} else if (reference == cypriotInstance.bind_BindsInstanceThingBack) {
			return Scopes.scopeFor(Helpers.allThinginstances(context.eContainer as Network).filter[
				k | !k.name.equals((context as Bind).bindsInstanceThing.name)
			])
		} else if (reference == cypriotInstance.channelToBind_TargetedChannelInstance) {
			return Scopes.scopeFor(Helpers.allPubSubinstances(context.eContainer.eContainer as Network))
		} else if (reference == cypriotInstance.channelToBind_Paths) {
			return Scopes.scopeFor(Helpers.allTopics((context as ChannelToBind).targetedChannelInstance))
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
		} else if (reference == cypriotInstance.path_AcceptedMessage) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, TypeThing)
			return Scopes.scopeFor(Helpers.allMessagesInNetworkModel(candidates as ArrayList<TypeThing>))
		} else if (reference == cypriotInstance.bind_PortToBind) {
			return Scopes.scopeFor(Helpers.getAllPortsThing(Helpers.findContainingBind(context).bindsInstanceThing.typeThing.thingToInstantiate))
		} else if (reference == cypriotInstance.bind_PortToBindBack) {
			return Scopes.scopeFor(Helpers.getAllPortsThing(Helpers.findContainingBind(context).bindsInstanceThingBack.typeThing.thingToInstantiate))
		}else if (reference == cypriotInstance.getPort_Port) {
			return Scopes.scopeFor(Helpers.getAllPortsThingAny(Helpers.allContainedCrossThingAny(context.eContainer)))
		} else if (reference == cypriotInstance.getState_State) {
			return Scopes.scopeFor(Helpers.getAllStatesThingAny(Helpers.allContainedCrossThingAny(context.eContainer)))
		} else if (reference == cypriotInstance.getFunction_Function) {
			return Scopes.scopeFor(Helpers.getAllFunctionsThingAny(Helpers.allContainedCrossThingAny(context.eContainer)))
		} else if (reference == cypriotInstance.channelWithPath_Channel) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, TypeChannel)
			return Scopes.scopeFor(candidates)	
		} else if (reference == cypriotInstance.getPath_Path) {
			return Scopes.scopeFor(Helpers.allTopicsInPubSub(Helpers.allContainedCrossPubSub(context.eContainer)))
		} else if (reference == cypriotInstance.actionTrigger_ThingToTransition) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, ThingAny)
			return Scopes.scopeFor(candidates)	
		} else {
			System.err.println("INFO: Resolving reference : " + reference.name + " in Class " +
				(reference.eContainer as ENamedElement).getName);
		}
		return IScope.NULLSCOPE;
	}
}

