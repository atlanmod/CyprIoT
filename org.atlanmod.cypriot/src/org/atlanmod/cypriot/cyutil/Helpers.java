/**
 * 
 */
/**
 * @author imad
 *
 */
package org.atlanmod.cypriot.cyutil;

import java.util.ArrayList;
import java.util.List;

import org.atlanmod.cypriot.cyprIoT.BridgeSubject;
import org.atlanmod.cypriot.cyprIoT.Channel;
import org.atlanmod.cypriot.cyprIoT.ConnectionPoint;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.Import;
import org.atlanmod.cypriot.cyprIoT.Instance;
import org.atlanmod.cypriot.cyprIoT.InstancePTP;
import org.atlanmod.cypriot.cyprIoT.InstancePubSub;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.PointToPoint;
import org.atlanmod.cypriot.cyprIoT.Policy;
import org.atlanmod.cypriot.cyprIoT.PubSub;
import org.atlanmod.cypriot.cyprIoT.Role;
import org.atlanmod.cypriot.cyprIoT.Thing;
import org.atlanmod.cypriot.cyprIoT.Topic;
import org.atlanmod.cypriot.cyprIoT.User;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;

public class Helpers {

	public static CyprIoTModel getModelFromRelativeURI(CyprIoTModel cyModel, String uri) throws Exception {
		URI new_uri;
		System.out.println("URI : " + uri);
		// Import local file
		new_uri = URI.createURI(uri);
		if (new_uri.isRelative()) {
			new_uri = new_uri.resolve(cyModel.eResource().getURI());
		}
		System.out.println("URI : " + new_uri);
		// Load the file into the ResourceSet
		Resource r = cyModel.eResource().getResourceSet().getResource(new_uri, true);
		if (r != null && r.getContents().size() > 0 && r.getContents().get(0) instanceof CyprIoTModel) {
			return (CyprIoTModel) r.getContents().get(0);
		} else {
			throw new Exception("No valid model found for resource " + uri);
		}
	}

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
		return findContainer(object, Thing.class);
	}

	public static PubSub findContainingPubSub(EObject object) {
		return findContainer(object, PubSub.class);
	}

	public static ArrayList<CyprIoTModel> allCypriotModels(CyprIoTModel model) {
		ArrayList<CyprIoTModel> result = new ArrayList<CyprIoTModel>();
		result.add(model);

		ArrayList<CyprIoTModel> temp = new ArrayList<CyprIoTModel>();

		int prevSize = result.size();
		int newSize = prevSize;
		System.out.println("Size : " + prevSize);
		do {
			for (CyprIoTModel m : result) {
				for (Import imp : m.getImports()) {
					try {
						CyprIoTModel m2 = getModelFromRelativeURI(m, imp.getImportURI());
						if (!temp.contains(m2)) {
							temp.add(m2);
						}
					} catch (Exception e) {
					}

				}
			}
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
		for (CyprIoTModel m : allCypriotModels(model)) {
			for (Role role : m.getDeclareRoles()) {
				if (!result.contains(role))
					result.add(role);
			}
		}
		return result;
	}

	public static ArrayList<Policy> allPolicies(CyprIoTModel model) {
		ArrayList<Policy> result = new ArrayList<Policy>();
		for (CyprIoTModel m : allCypriotModels(model)) {
			for (Policy policy : m.getSpecifyPolicies()) {
				if (!result.contains(policy))
					result.add(policy);
			}
		}
		return result;
	}

	public static ArrayList<Thing> allThings(CyprIoTModel model) {
		ArrayList<Thing> result = new ArrayList<Thing>();
		for (CyprIoTModel m : allCypriotModels(model)) {
			for (Thing t : m.getDeclareThings()) {
				result.add((Thing) t);
			}
		}
		return result;
	}

	public static ArrayList<PubSub> allPusSub(CyprIoTModel model) {
		ArrayList<PubSub> result = new ArrayList<PubSub>();
		for (CyprIoTModel m : allCypriotModels(model)) {
			for (Channel t : m.getDeclareChannels()) {
				if (t instanceof PubSub) {
					result.add((PubSub) t);
				}
			}
		}
		return result;
	}

	public static ArrayList<PointToPoint> allReqRep(CyprIoTModel model) {
		ArrayList<PointToPoint> result = new ArrayList<PointToPoint>();
		for (CyprIoTModel m : allCypriotModels(model)) {
			for (Channel t : m.getDeclareChannels()) {
				if (t instanceof PointToPoint) {
					result.add((PointToPoint) t);
				}
			}
		}
		return result;
	}

	public static ArrayList<Topic> allTopicsInType(PubSub pubSub) {
		ArrayList<Topic> result = new ArrayList<Topic>();
		for (Topic t : pubSub.getHasTopics()) {
			result.add((Topic) t);
		}
		return result;
	}

	public static ArrayList<Topic> allTopics(InstancePubSub pubSub) {
		ArrayList<Topic> result = new ArrayList<Topic>();
		for (Topic t : pubSub.getPubSubToInstantiate().getHasTopics()) {
			result.add((Topic) t);
		}
		return result;
	}

	public static ArrayList<ConnectionPoint> allConnectionPoints(InstancePTP ptp) {
		ArrayList<ConnectionPoint> result = new ArrayList<ConnectionPoint>();
		for (ConnectionPoint t : ptp.getPtPToInstantiate().getHasConnectionPoints()) {
			result.add((ConnectionPoint) t);
		}
		return result;
	}

	public static ArrayList<InstanceThing> allThinginstances(CyprIoTModel model) {
		ArrayList<InstanceThing> result = new ArrayList<InstanceThing>();
		for (Instance t : model.getSpecifyNetworks().get(0).getInstantiate()) {
			if (t instanceof InstanceThing)
				result.add((InstanceThing) t);
		}
		return result;
	}

	public static ArrayList<InstancePubSub> allPubSubinstances(CyprIoTModel model) {
		ArrayList<InstancePubSub> result = new ArrayList<InstancePubSub>();
		for (Instance t : model.getSpecifyNetworks().get(0).getInstantiate()) {
			if (t instanceof InstancePubSub)
				result.add((InstancePubSub) t);
		}
		return result;
	}

	public static ArrayList<InstancePTP> allPtPinstances(CyprIoTModel model) {
		ArrayList<InstancePTP> result = new ArrayList<InstancePTP>();
		for (Instance t : model.getSpecifyNetworks().get(0).getInstantiate()) {
			if (t instanceof InstancePTP)
				result.add((InstancePTP) t);
		}
		return result;
	}

	public static ArrayList<BridgeSubject> allBridgeSubjects(CyprIoTModel model) {
		ArrayList<BridgeSubject> result = new ArrayList<BridgeSubject>();
		for (CyprIoTModel m : allCypriotModels(model)) {
			EObject rootElement = EcoreUtil2.getRootContainer(m);
			List<BridgeSubject> subjects = EcoreUtil2.getAllContentsOfType(rootElement, BridgeSubject.class);
			for (BridgeSubject bridgeSubject : subjects) {
				if (bridgeSubject instanceof BridgeSubject) {
					result.add(bridgeSubject);
				}
			}
		}
		return result;
	}
	/*
	 * public static ArrayList<InstanceReqRep> allPtpinstances(IoTLangModel model) {
	 * ArrayList<InstanceReqRep> result = new ArrayList<InstanceReqRep>(); for
	 * (InstanceChannel m : allChannelinstances(model)) { for (InstanceReqRep t :
	 * m.getInstancesReqRep()) { result.add((InstanceReqRep)t); } } return result; }
	 */

	/*
	 * public static ArrayList<Channel> allChannels(IoTLangModel model) {
	 * ArrayList<Channel> result = new ArrayList<Channel>(); for (IoTLangModel m :
	 * allIoTLangModels(model)) { for (Channel t : m.getChannels()) {
	 * result.add((Channel)t); } } return result; }
	 */
	/*
	 * public static ArrayList<ReqRep> allPTP(IoTLangModel model) {
	 * ArrayList<ReqRep> result = new ArrayList<ReqRep>(); for (Channel m :
	 * allChannels(model)) { for (ReqRep t : m.getReqRep()) { result.add((ReqRep)t);
	 * } } return result; }
	 */
	/*
	 * public static ArrayList<Message> allMessages(IoTLangModel model) {
	 * ArrayList<Message> result = new ArrayList<Message>(); for (IoTLangModel m :
	 * allIoTLangModels(model)) { for (Message t : m.getMessages()) {
	 * result.add((Message)t); } } return result; }
	 */
	/*
	 * public static ArrayList<Datatype> allDatatypes(IoTLangModel model) {
	 * ArrayList<Datatype> result = new ArrayList<Datatype>(); for (IoTLangModel m :
	 * allIoTLangModels(model)) { for (Datatype t : m.getDatatypes()) {
	 * result.add((Datatype)t); } } return result; } public static ArrayList<Port>
	 * allPorts(IoTLangModel model) { ArrayList<Port> result = new
	 * ArrayList<Port>(); for (Thing t : allThings(model)) {
	 * result.addAll(t.getHasPort()); } return result; } public static
	 * ArrayList<Protocol> allProtocol(IoTLangModel model) { ArrayList<Protocol>
	 * result = new ArrayList<Protocol>(); for (IoTLangModel m :
	 * allIoTLangModels(model)) { for (Protocol t : m.getProtocols()) {
	 * result.add((Protocol)t); } } return result; }
	 * 
	 * 
	 * 
	 * public static ArrayList<Policy> allPolicies(IoTLangModel model) {
	 * ArrayList<Policy> result = new ArrayList<Policy>(); for (IoTLangModel m :
	 * allIoTLangModels(model)) { for (Policy t : m.getPolicies()) {
	 * result.add((Policy)t); } } return result; }
	 * 
	 * public static ArrayList<Parameter> allParameters(Message message) {
	 * ArrayList<Parameter> result = new ArrayList<Parameter>();
	 * result.addAll(message.getParameters()); return result; }
	 * 
	 * public static ArrayList<Message> allMessages(IoTLangModel model) {
	 * ArrayList<Message> result = new ArrayList<Message>(); for (IoTLangModel m :
	 * allIoTLangModels(model)) { for (Message t : m.getDeclareMessages()) {
	 * result.add((Message)t); } } return result; } /* public static
	 * ArrayList<NetworkConfiguration> allConfigs(IoTLangModel model) {
	 * ArrayList<NetworkConfiguration> result = new
	 * ArrayList<NetworkConfiguration>(); for (IoTLangModel m :
	 * allIoTLangModels(model)) { for (NetworkConfiguration t :
	 * m.getNetworkConfigs()) { result.add((NetworkConfiguration)t); } } return
	 * result; } public static ArrayList<InstanceThing>
	 * allThinginstances(IoTLangModel model) { ArrayList<InstanceThing> result = new
	 * ArrayList<InstanceThing>(); for (NetworkConfiguration m : allConfigs(model))
	 * { for (Instance t : m.getInstances() ) { if ( t instanceof InstanceThing)
	 * result.add((InstanceThing)t); } } return result; } public static
	 * ArrayList<InstanceChannel> allChannelinstances(IoTLangModel model) {
	 * ArrayList<InstanceChannel> result = new ArrayList<InstanceChannel>(); for
	 * (NetworkConfiguration m : allConfigs(model)) { for (Instance t :
	 * m.getInstances() ) { if ( t instanceof InstanceChannel)
	 * result.add((InstanceChannel)t); } } return result; }
	 * 
	 * public static ArrayList<InstancePubSub> allPubSubinstances(IoTLangModel
	 * model) { ArrayList<InstancePubSub> result = new ArrayList<InstancePubSub>();
	 * for (InstanceChannel m : allChannelinstances(model)) { if(m instanceof
	 * InstancePubSub) result.add((InstancePubSub)m); } return result; }
	 */
	/*
	 * public static ArrayList<InstanceReqRep> allPtpinstances(IoTLangModel model) {
	 * ArrayList<InstanceReqRep> result = new ArrayList<InstanceReqRep>(); for
	 * (InstanceChannel m : allChannelinstances(model)) { for (InstanceReqRep t :
	 * m.getInstancesReqRep()) { result.add((InstanceReqRep)t); } } return result; }
	 */
	public static ArrayList<User> allUsers(CyprIoTModel model) {
		ArrayList<User> result = new ArrayList<User>();
		for (CyprIoTModel m : allCypriotModels(model)) {
			for (User t : m.getDeclareUsers()) {
				result.add((User) t);
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