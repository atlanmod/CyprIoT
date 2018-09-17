/*
 * generated by Xtext 2.14.0
 */
package org.atlanmod.cypriot.scoping

import java.util.ArrayList
import org.atlanmod.cypriot.cyprIoT.ConnectionPoint
import org.atlanmod.cypriot.cyprIoT.CyprIoTPackage
import org.atlanmod.cypriot.cyprIoT.Policy
import org.atlanmod.cypriot.cyprIoT.PubSub
import org.atlanmod.cypriot.cyprIoT.RuleObject
import org.atlanmod.cypriot.cyprIoT.RuleSubject
import org.atlanmod.cypriot.cyprIoT.Topic
import org.atlanmod.cypriot.cyutil.Helpers
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.atlanmod.cypriot.cyprIoT.Bind

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class CypriotScopeProvider extends AbstractCypriotScopeProvider {
	val cypriotInstance = CyprIoTPackage.eINSTANCE;
	protected ArrayList<EObject> EMPTY = new ArrayList();

	override IScope getScope(EObject context, EReference reference) {

		if (reference == cypriotInstance.user_AssignedRoles || reference == cypriotInstance.thing_AssignedRoles) {
			return Scopes.scopeFor(Helpers.allRoles(Helpers.findContainingModel(context)));
		} else if (reference == cypriotInstance.instanceThing_TypeThing) {
			return Scopes.scopeFor(Helpers.allThings(Helpers.findContainingModel(context)));
		} else if (reference == cypriotInstance.instancePubSub_TypePubSub) {
			return Scopes.scopeFor(Helpers.allPusSub(Helpers.findContainingModel(context)));
		} else if (reference == cypriotInstance.instancePTP_TypePtP) {
			return Scopes.scopeFor(Helpers.allReqRep(Helpers.findContainingModel(context)));
		} else if (reference == cypriotInstance.instanceThing_Owner) {
			return Scopes.scopeFor(Helpers.allUsers(Helpers.findContainingModel(context)));
		} else if (reference == cypriotInstance.topic_SubtopicOf) {
			return Scopes.scopeFor(Helpers.allTopics(context.eContainer as PubSub));
		} else if (reference == cypriotInstance.bind_ThingInstance) {
			return Scopes.scopeFor(Helpers.allThinginstances(Helpers.findContainingModel(context)));
		} else if (reference == cypriotInstance.pubSubBinding_PubSubInstance) {
			return Scopes.scopeFor(Helpers.allPubSubinstances(Helpers.findContainingModel(context)));
		} else if (reference == cypriotInstance.PTPBinding_PtpInstance) {
			return Scopes.scopeFor(Helpers.allPtPinstances(Helpers.findContainingModel(context)));
		} else if (reference == cypriotInstance.pubSubBinding_Topics) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, Topic)
			return Scopes.scopeFor(candidates)
		} else if (reference == cypriotInstance.PTPBinding_ConnectionPoint) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, ConnectionPoint)
			return Scopes.scopeFor(candidates)
		 } else if(reference == cypriotInstance.enforcePolicy_PolicyName){
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, Policy)
			return Scopes.scopeFor(candidates)
		} else if(reference == cypriotInstance.rule_RuleSubject){
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, RuleSubject)
			return Scopes.scopeFor(candidates)
		} else if(reference == cypriotInstance.rule_RuleObject){
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, RuleObject)
			return Scopes.scopeFor(candidates)
		} else if(reference == cypriotInstance.channelBridge_Bind){
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, Bind)
			return Scopes.scopeFor(candidates)
		} else {
			System.err.println("INFO: Resolving reference : " + reference.name + " in Class " +
				(reference.eContainer as ENamedElement).getName);
		}
		return Scopes.scopeFor(EMPTY);
	}
}
