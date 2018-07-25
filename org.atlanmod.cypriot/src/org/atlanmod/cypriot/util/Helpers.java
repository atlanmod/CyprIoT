/**
 * 
 */
/**
 * @author imad
 *
 */
package org.atlanmod.cypriot.util;

import java.util.ArrayList;

import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstancePubSub;
import org.atlanmod.cypriot.cyprIoT.InstanceReqRep;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.PubSub;
import org.atlanmod.cypriot.cyprIoT.ReqRep;
import org.atlanmod.cypriot.cyprIoT.Role;
import org.atlanmod.cypriot.cyprIoT.Thing;
import org.atlanmod.cypriot.cyprIoT.Topic;
import org.atlanmod.cypriot.cyprIoT.User;
import org.eclipse.emf.ecore.EObject;



public class Helpers {
	
	
	@SuppressWarnings("unchecked") // I know what I am doing :-)
	public static <C> C findContainer(EObject eObject, Class<C> cClass) {
		while (eObject != null && !cClass.isAssignableFrom(eObject.getClass())) {
			eObject = eObject.eContainer();
		}
		return (C) eObject;
	}
	
	public static CyprIoTModel findContainingModel(EObject object) {
		return findContainer(object, CyprIoTModel.class);
	}
	public static Thing findContainingThing(EObject object) {
		return findContainer(object,Thing.class);
	}
	public static PubSub findContainingPubSub(EObject object) {
		return findContainer(object,PubSub.class);
	}
	public static ArrayList<CyprIoTModel> allIoTLangModels(CyprIoTModel model) {
		ArrayList<CyprIoTModel> result = new ArrayList<CyprIoTModel>();
		result.add(model);
		/*
		ResourceSet rs = model.eResource().getResourceSet();
		
		for (String importuri : model.getImportURI()) {
			importuri = importuri.substring(1);
			importuri = importuri.substring(0, importuri.length()-1).trim();
			ThingMLModel m = getModelFromRelativeURI(model, importuri);
			if (m!=null) result.add(m);
		}
		*/

        ArrayList<CyprIoTModel> temp = new ArrayList<CyprIoTModel>();

        int prevSize = result.size();
        int newSize = prevSize;
        do {
//            for (IoTLangModel m : result) {
//                for(String m2_uri : m.getImportURI()) {
//                	IoTLangModel m2 = getModelFromRelativeURI(m, m2_uri);
//                	if(m2 == null) {
//                		continue;
//                	}
//                	if (!temp.contains(m2)) {
//                        temp.add(m2);
//                    }
//                }
//            }
            for (CyprIoTModel m : temp) {
                if (!result.contains(m)) {
                    result.add(m);
                }
            }
            prevSize = newSize;
            newSize = result.size();
        } while (newSize > prevSize);
        
		return result;
	}
	public static ArrayList<Role> allRoles(CyprIoTModel model) {
		ArrayList<Role> result = new ArrayList<Role>();
		for (CyprIoTModel m : allIoTLangModels(model)) {
			for (Role r : m.getRoles()) {
				result.add((Role)r);
			}
		}
		return result;
	}
	
	public static ArrayList<Thing> allThings(CyprIoTModel model) {
	ArrayList<Thing> result = new ArrayList<Thing>();
	for (CyprIoTModel m : allIoTLangModels(model)) {
		for (Thing t : m.getImportThings()) {
				result.add((Thing)t);
		}
	}
	return result;
	}
	public static ArrayList<PubSub> allPusSub(CyprIoTModel model) {
		ArrayList<PubSub> result = new ArrayList<PubSub>();
		for (CyprIoTModel m : allIoTLangModels(model)) {
			for (PubSub t : m.getPubsubs()) {
				result.add((PubSub)t);
			}
		}
		return result;
	}
	public static ArrayList<ReqRep> allReqRep(CyprIoTModel model) {
		ArrayList<ReqRep> result = new ArrayList<ReqRep>();
		for (CyprIoTModel m : allIoTLangModels(model)) {
			for (ReqRep t : m.getReqreps()) {
				result.add((ReqRep)t);
			}
		}
		return result;
	}
	public static ArrayList<Topic> allTopics(PubSub pubSub) {
		ArrayList<Topic> result = new ArrayList<Topic>();
			for (Topic t : pubSub.getHasTopics()) {
				result.add((Topic)t);		
			}
		return result;
	}
	
	public static ArrayList<InstanceThing> allThinginstances(CyprIoTModel model) {
		ArrayList<InstanceThing> result = new ArrayList<InstanceThing>();
			for (InstanceThing t : model.getNetworks().get(0).getInstancesThing() ) {
				if ( t instanceof InstanceThing) result.add((InstanceThing)t);
		}
		return result;
	}
	
	public static ArrayList<InstancePubSub> allPubSubinstances(CyprIoTModel model) {
		ArrayList<InstancePubSub> result = new ArrayList<InstancePubSub>();
		for (InstancePubSub t : model.getNetworks().get(0).getInstancesPubsub() ) {
			if ( t instanceof InstancePubSub) result.add((InstancePubSub)t);
		}
		return result;
	}
	
	public static ArrayList<InstanceReqRep> allReqRepinstances(CyprIoTModel model) {
		ArrayList<InstanceReqRep> result = new ArrayList<InstanceReqRep>();
		for (InstanceReqRep t : model.getNetworks().get(0).getInstancesReqrep() ) {
			if ( t instanceof InstanceReqRep) result.add((InstanceReqRep)t);
		}
		return result;
	}
	
	public static ArrayList<Topic> allTopicsPubSub(PubSub pubsub) {
		ArrayList<Topic> result = new ArrayList<Topic>();
		for (Topic t : pubsub.getHasTopics() ) {
			if ( t instanceof Topic) result.add((Topic)t);
		}
		return result;
	}
	/*public static ArrayList<InstanceReqRep> allPtpinstances(IoTLangModel model) {
		ArrayList<InstanceReqRep> result = new ArrayList<InstanceReqRep>();
		for (InstanceChannel m : allChannelinstances(model)) {
			for (InstanceReqRep t : m.getInstancesReqRep()) {
					result.add((InstanceReqRep)t);
			}
		}
		return result;
	}*/
	
	/*public static ArrayList<Channel> allChannels(IoTLangModel model) {
		ArrayList<Channel> result = new ArrayList<Channel>();
		for (IoTLangModel m : allIoTLangModels(model)) {
			for (Channel t : m.getChannels()) {
					result.add((Channel)t);
			}
		}
		return result;
		}
	*/
	/*public static ArrayList<ReqRep> allPTP(IoTLangModel model) {
		ArrayList<ReqRep> result = new ArrayList<ReqRep>();
		for (Channel m : allChannels(model)) {
			for (ReqRep t : m.getReqRep()) {
					result.add((ReqRep)t);
			}
		}
		return result;
		}*/
	/*public static ArrayList<Message> allMessages(IoTLangModel model) {
		ArrayList<Message> result = new ArrayList<Message>();
		for (IoTLangModel m : allIoTLangModels(model)) {
			for (Message t : m.getMessages()) {
					result.add((Message)t);
			}
		}
		return result;
		}*/
	/*public static ArrayList<Datatype> allDatatypes(IoTLangModel model) {
		ArrayList<Datatype> result = new ArrayList<Datatype>();
		for (IoTLangModel m : allIoTLangModels(model)) {
			for (Datatype t : m.getDatatypes()) {
					result.add((Datatype)t);
			}
		}
		return result;
		}
	public static ArrayList<Port> allPorts(IoTLangModel model) {
		ArrayList<Port> result = new ArrayList<Port>();
		for (Thing t : allThings(model)) {
			result.addAll(t.getHasPort());
		}
		return result;
	}
	public static ArrayList<Protocol> allProtocol(IoTLangModel model) {
		ArrayList<Protocol> result = new ArrayList<Protocol>();
		for (IoTLangModel m : allIoTLangModels(model)) {
			for (Protocol t : m.getProtocols()) {
					result.add((Protocol)t);
			}
		}
		return result;
		}

	
	
	public static ArrayList<Policy> allPolicies(IoTLangModel model) {
		ArrayList<Policy> result = new ArrayList<Policy>();
		for (IoTLangModel m : allIoTLangModels(model)) {
			for (Policy t : m.getPolicies()) {
				result.add((Policy)t);
			}
		}
		return result;
	}
	
	public static ArrayList<Parameter> allParameters(Message message) {
		ArrayList<Parameter> result = new ArrayList<Parameter>();
		result.addAll(message.getParameters());
		return result;
	}
	
	public static ArrayList<Message> allMessages(IoTLangModel model) {
		ArrayList<Message> result = new ArrayList<Message>();
		for (IoTLangModel m : allIoTLangModels(model)) {
			for (Message t : m.getDeclareMessages()) {
					result.add((Message)t);
			}
		}
		return result;
		}
/*	public static ArrayList<NetworkConfiguration> allConfigs(IoTLangModel model) {
		ArrayList<NetworkConfiguration> result = new ArrayList<NetworkConfiguration>();
		for (IoTLangModel m : allIoTLangModels(model)) {
			for (NetworkConfiguration t : m.getNetworkConfigs()) {
					result.add((NetworkConfiguration)t);
			}
		}
		return result;
		}
	public static ArrayList<InstanceThing> allThinginstances(IoTLangModel model) {
		ArrayList<InstanceThing> result = new ArrayList<InstanceThing>();
		for (NetworkConfiguration m : allConfigs(model)) {
			for (Instance t : m.getInstances() ) {
				if ( t instanceof InstanceThing) result.add((InstanceThing)t);
			}
		}
		return result;
	}
	public static ArrayList<InstanceChannel> allChannelinstances(IoTLangModel model) {
		ArrayList<InstanceChannel> result = new ArrayList<InstanceChannel>();
		for (NetworkConfiguration m : allConfigs(model)) {
			for (Instance t : m.getInstances() ) {
				if ( t instanceof InstanceChannel) result.add((InstanceChannel)t);
			}
		}
		return result;
	}

	public static ArrayList<InstancePubSub> allPubSubinstances(IoTLangModel model) {
		ArrayList<InstancePubSub> result = new ArrayList<InstancePubSub>();
		for (InstanceChannel m : allChannelinstances(model)) {
			if(m instanceof InstancePubSub) result.add((InstancePubSub)m);
		}
		return result;
	}*/
	/*public static ArrayList<InstanceReqRep> allPtpinstances(IoTLangModel model) {
		ArrayList<InstanceReqRep> result = new ArrayList<InstanceReqRep>();
		for (InstanceChannel m : allChannelinstances(model)) {
			for (InstanceReqRep t : m.getInstancesReqRep()) {
					result.add((InstanceReqRep)t);
			}
		}
		return result;
	}*/
	public static ArrayList<User> allUsers(CyprIoTModel model) {
		ArrayList<User> result = new ArrayList<User>();
		for (CyprIoTModel m : allIoTLangModels(model)) {
			for (User t : m.getUsers()) {
					result.add((User)t);
			}
		}
		return result;
		}

//	public static ArrayList<Thing> allThings(IoTLangModel model) {
//		ArrayList<Thing> result = new ArrayList<Thing>();
//		for (IoTLangModel m : allThingMLModelModels(model)) {
//			for (Type t : m.getTypes()) {
//				if ( (t instanceof Thing) && !result.contains(t)) 
//					result.add((Thing)t);
//			}
//		}
//		return result;
//	}
//	
//	public static ArrayList<Message> allMessages(Thing thing) {
//		ArrayList<Message> result = new ArrayList<Message>();
//		for (Thing t : allThingFragments(thing)) {
//			for (Message msg : t.getMessages()) {
//				boolean isPresent = false;
//				for(Message m : result) {
//					if (EcoreUtil.equals(msg, m)) {
//						isPresent = true;
//						break;
//					}
//				}
//				if (!isPresent) result.add(msg);
//			}
//		}
//		return result;
//	}
//	
//	
//	public static ArrayList<Thing> allThingFragments(Thing thing) {
//		ArrayList<Thing> result = new ArrayList<Thing>();
//		result.add(thing);
//		for (Thing t : thing.getIncludes())
//			if (t != thing) {
//				for (Thing c : allThingFragments(t))
//					if (!result.contains(c)) result.add(c);
//			}
//		return result;
//	}
}