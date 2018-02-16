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
import org.eclipse.emf.ecore.util.EcoreUtil;

import lang.iotlang.Channel;
import lang.iotlang.Topic;
import lang.iotlang.NetworkConfiguration;
import lang.iotlang.InstancePolicy;
import lang.iotlang.IoTLangModel;
import lang.iotlang.Message;
import lang.iotlang.Policy;
import lang.iotlang.Thing;


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
	
	public static ArrayList<Thing> allThings(IoTLangModel model) {
	ArrayList<Thing> result = new ArrayList<Thing>();
	for (IoTLangModel m : allIoTLangModels(model)) {
		for (Thing t : m.getThings()) {
				result.add((Thing)t);
		}
	}
	return result;
	}
	
	public static ArrayList<Channel> allBuses(IoTLangModel model) {
		ArrayList<Channel> result = new ArrayList<Channel>();
		for (IoTLangModel m : allIoTLangModels(model)) {
			for (Channel t : m.getChannels()) {
					result.add((Channel)t);
			}
		}
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
	
	
	public static ArrayList<Topic> allTopics(IoTLangModel model) {
		ArrayList<Topic> result = new ArrayList<Topic>();
		for (Channel m : allBuses(model)) {
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
	public static ArrayList<NetworkConfiguration> allConfigs(IoTLangModel model) {
		ArrayList<NetworkConfiguration> result = new ArrayList<NetworkConfiguration>();
		for (IoTLangModel m : allIoTLangModels(model)) {
			for (NetworkConfiguration t : m.getConfigs()) {
					result.add((NetworkConfiguration)t);
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