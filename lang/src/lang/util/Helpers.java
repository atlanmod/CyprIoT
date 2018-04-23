/**
 * 
 */
/**
 * @author imad
 *
 */
package lang.util;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import lang.iotlang.Channel;
import lang.iotlang.Instance;
import lang.iotlang.InstanceChannel;
import lang.iotlang.InstancePubSub;
//import lang.iotlang.InstanceReqRep;
import lang.iotlang.InstanceThing;
import lang.iotlang.IoTLangModel;
import lang.iotlang.Message;
import lang.iotlang.NetworkConfiguration;
import lang.iotlang.Parameter;
import lang.iotlang.Policy;
import lang.iotlang.Port;
//import lang.iotlang.Protocol;
import lang.iotlang.PubSub;
//import lang.iotlang.ReqRep;
import lang.iotlang.Role;
import lang.iotlang.Rule;
import lang.iotlang.Thing;
import lang.iotlang.Topic;
import lang.iotlang.User;


public class Helpers {
	
	
	@SuppressWarnings("unchecked") // I know what I am doing :-)
	public static <C> C findContainer(EObject eObject, Class<C> cClass) {
		while (eObject != null && !cClass.isAssignableFrom(eObject.getClass())) {
			eObject = eObject.eContainer();
		}
		return (C) eObject;
	}
	
	public static IoTLangModel findContainingModel(EObject object) {
		return findContainer(object, IoTLangModel.class);
	}
	public static Thing findContainingThing(EObject object) {
		return findContainer(object,Thing.class);
	}
	public static ArrayList<IoTLangModel> allIoTLangModels(IoTLangModel model) {
		ArrayList<IoTLangModel> result = new ArrayList<IoTLangModel>();
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

        ArrayList<IoTLangModel> temp = new ArrayList<IoTLangModel>();

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
            for (IoTLangModel m : temp) {
                if (!result.contains(m)) {
                    result.add(m);
                }
            }
            prevSize = newSize;
            newSize = result.size();
        } while (newSize > prevSize);
        
		return result;
	}
	
	public static ArrayList<Role> allTRoles(IoTLangModel model) {
		ArrayList<Role> result = new ArrayList<Role>();
		for (IoTLangModel m : allIoTLangModels(model)) {
			for (Role t : m.getPolicies().get(0).getHasRoles()) {
					result.add((Role)t);
			}
		}
		return result;
		}
	
	public static ArrayList<Thing> allThings(IoTLangModel model) {
	ArrayList<Thing> result = new ArrayList<Thing>();
	for (IoTLangModel m : allIoTLangModels(model)) {
		for (Thing t : m.getThings()) {
				result.add((Thing)t);
		}
	}
	return result;
	}
	public static ArrayList<Channel> allChannels(IoTLangModel model) {
		ArrayList<Channel> result = new ArrayList<Channel>();
		for (IoTLangModel m : allIoTLangModels(model)) {
			for (Channel t : m.getChannels()) {
					result.add((Channel)t);
			}
		}
		return result;
		}
	public static ArrayList<PubSub> allPusSub(IoTLangModel model) {
		ArrayList<PubSub> result = new ArrayList<PubSub>();
		for (Channel m : allChannels(model)) {
			for (PubSub t : m.getPubSub()) {
					result.add((PubSub)t);
			}
		}
		return result;
		}
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
		}*/
	public static ArrayList<Port> allPorts(IoTLangModel model) {
		ArrayList<Port> result = new ArrayList<Port>();
		for (Thing t : allThings(model)) {
			result.addAll(t.getPorts());
		}
		return result;
	}
	/*public static ArrayList<Protocol> allProtocol(IoTLangModel model) {
		ArrayList<Protocol> result = new ArrayList<Protocol>();
		for (IoTLangModel m : allIoTLangModels(model)) {
			for (Protocol t : m.getProtocols()) {
					result.add((Protocol)t);
			}
		}
		return result;
		}
	*/
	public static ArrayList<Topic> allTopics(IoTLangModel model) {
		ArrayList<Topic> result = new ArrayList<Topic>();
		for (PubSub m : allPusSub(model)) {
			for (Topic t : m.getHasTopics()) {
					result.add((Topic)t);
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
			for (Message t : m.getMessages()) {
					result.add((Message)t);
			}
		}
		return result;
		}
	public static ArrayList<NetworkConfiguration> allConfigs(IoTLangModel model) {
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
			for (InstancePubSub t : m.getInstancesPubSub()) {
					result.add((InstancePubSub)t);
			}
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
	public static ArrayList<User> allUsers(IoTLangModel model) {
		ArrayList<User> result = new ArrayList<User>();
		for (IoTLangModel m : allIoTLangModels(model)) {
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