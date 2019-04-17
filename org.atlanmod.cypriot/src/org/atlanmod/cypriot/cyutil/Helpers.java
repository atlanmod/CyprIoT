/**
 * 
 */
/**
 * @author imad
 *
 */
package org.atlanmod.cypriot.cyutil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.atlanmod.cypriot.CypriotStandaloneSetup;
import org.atlanmod.cypriot.cyprIoT.Bind;
import org.atlanmod.cypriot.cyprIoT.BridgeSubject;
import org.atlanmod.cypriot.cyprIoT.Channel;
import org.atlanmod.cypriot.cyprIoT.ConnectionPoint;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.Import;
import org.atlanmod.cypriot.cyprIoT.Instance;
import org.atlanmod.cypriot.cyprIoT.InstancePTP;
import org.atlanmod.cypriot.cyprIoT.InstancePubSub;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.cyprIoT.PointToPoint;
import org.atlanmod.cypriot.cyprIoT.Policy;
import org.atlanmod.cypriot.cyprIoT.PubSub;
import org.atlanmod.cypriot.cyprIoT.Role;
import org.atlanmod.cypriot.cyprIoT.Rule;
import org.atlanmod.cypriot.cyprIoT.RuleSubject;
import org.atlanmod.cypriot.cyprIoT.SubjectAndObject;
import org.atlanmod.cypriot.cyprIoT.Thing;
import org.atlanmod.cypriot.cyprIoT.Topic;
import org.atlanmod.cypriot.cyprIoT.User;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.thingml.xtext.ThingMLStandaloneSetup;
import org.thingml.xtext.constraints.ThingMLHelpers;
import org.thingml.xtext.helpers.CompositeStateHelper;
import org.thingml.xtext.thingML.CompositeState;
import org.thingml.xtext.thingML.Message;
import org.thingml.xtext.thingML.Parameter;
import org.thingml.xtext.thingML.Port;
import org.thingml.xtext.thingML.Property;
import org.thingml.xtext.thingML.State;
import org.thingml.xtext.thingML.ThingMLModel; 

public class Helpers {

	public static CyprIoTModel getModelFromRelativeURI(CyprIoTModel cyModel, String uri) throws Exception {
		URI new_uri;
		System.out.println("URI : " + uri);
		new_uri = URI.createURI(uri);
		if (new_uri.isRelative()) {
			new_uri = new_uri.resolve(cyModel.eResource().getURI());
		}
		System.out.println("URI : " + new_uri);
		Resource r = cyModel.eResource().getResourceSet().getResource(new_uri, true);
		if (r != null && r.getContents().size() > 0 && r.getContents().get(0) instanceof CyprIoTModel) {
			return (CyprIoTModel) r.getContents().get(0);
		} else {
			throw new Exception("No valid model found for resource " + uri);
		}
	}

	@SuppressWarnings("unchecked")
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
	public static Bind findContainingBind(EObject object) {
		return findContainer(object, Bind.class);
	}
	
	public static RuleSubject findContainingRuleSubject(EObject object) {
		return findContainer(object, RuleSubject.class);
	}

	public static ArrayList<CyprIoTModel> allCypriotModels(CyprIoTModel model) {
		ArrayList<CyprIoTModel> result = new ArrayList<CyprIoTModel>();
		result.add(model);

		ArrayList<CyprIoTModel> temp = new ArrayList<CyprIoTModel>();

		int prevSize = result.size();
		int newSize = prevSize;
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

	public static ArrayList<InstanceThing> allThinginstances(Network network) {
		ArrayList<InstanceThing> result = new ArrayList<InstanceThing>();
		for (Instance t : network.getInstantiate()) {
			if (t instanceof InstanceThing)
				result.add((InstanceThing) t);
		}
		return result;
	}
	
	public static ArrayList<SubjectAndObject> allSubjectConditions(Rule rule) {
		ArrayList<SubjectAndObject> result = new ArrayList<SubjectAndObject>();
		
		if(rule.getRuleObject()!=null) {
			result.add(rule.getRuleObject());
		}
		result.add(rule.getRuleSubject());
		return result;
	}
	

	public static ArrayList<InstancePubSub> allPubSubinstances(Network network) {
		ArrayList<InstancePubSub> result = new ArrayList<InstancePubSub>();
		for (Instance t : network.getInstantiate()) {
			if (t instanceof InstancePubSub)
				result.add((InstancePubSub) t);
		}
		return result;
	}

	public static ArrayList<InstancePTP> allPtPinstances(Network network) {
		ArrayList<InstancePTP> result = new ArrayList<InstancePTP>();
		for (Instance t : network.getInstantiate()) {
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
	
	public static ArrayList<User> allUsers(CyprIoTModel model) {
		ArrayList<User> result = new ArrayList<User>();
		for (CyprIoTModel m : allCypriotModels(model)) {
			for (User t : m.getDeclareUsers()) {
				result.add((User) t);
			}
		}
		return result;
	}
	
	public static ArrayList<Port> allPortsThingML(Bind bind) {
		ThingMLModel thingmlModel = null;
		Thing thingToInstanciate = (bind.getBindsInstanceThing().getThingToInstantiate());
		ArrayList<Port> result = getAllPortsThing(thingToInstanciate);
		return result; 
	}

	/**
	 * @param thingToInstanciate
	 * @return
	 */
	public static ArrayList<Port> getAllPortsThing(Thing thingToInstanciate) {
		ThingMLModel thingmlModel;
		ArrayList<Port> result = new ArrayList<Port>();
		thingmlModel = getThingInThingML(thingToInstanciate);
		if(thingmlModel!=null) result = ThingMLHelpers.allPorts((org.thingml.xtext.thingML.Thing) thingmlModel.getTypes().get(0));
		return result;
	}
	
	public static ArrayList<State> allStatesThingML(Thing thing) {
		ThingMLModel thingmlModel = null;
		ArrayList<State> result = new ArrayList<State>();
		try {
			thingmlModel = getThingInThingML(thing);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(thingmlModel!=null) {
			CompositeState compositeState = ThingMLHelpers.allStateMachines((org.thingml.xtext.thingML.Thing) thingmlModel.getTypes().get(0)).get(0);
			ArrayList<State> states = new ArrayList<State>(CompositeStateHelper.allContainedStatesExludingSessions(compositeState));
			for (State state : states) {
				result.add(state);
			}
		}
		return result; 
	}
	
	public static ArrayList<Property> allPropertiesThingML(Thing thing) {
		ThingMLModel thingmlModel = null;
		ArrayList<Property> result = new ArrayList<Property>();
		try {
			thingmlModel = getThingInThingML(thing);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(thingmlModel!=null) {
			ArrayList<Property> properties = ThingMLHelpers.allProperties(((org.thingml.xtext.thingML.Thing) thingmlModel.getTypes().get(0)));
			for (Property property : properties) {
				result.add(property);
			}
		}
		return result; 
	}
	
	public static ArrayList<Message> allMessagesThingML(Thing thing) {
		ThingMLModel thingmlModel = null;
		ArrayList<Message> result = new ArrayList<Message>();
		try {
			thingmlModel = getThingInThingML(thing);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(thingmlModel!=null) {
			ArrayList<Message> messages = ThingMLHelpers.allMessages(((org.thingml.xtext.thingML.Thing) thingmlModel.getTypes().get(0)));
			for (Message message : messages) {
				result.add(message);
			}
		}
		return result; 
	}
	
	public static ArrayList<Parameter> allMessageParametersThingML(Message message) {
		ArrayList<Parameter> result = new ArrayList<Parameter>();
		if(message!=null) {
			for (Parameter parameter : message.getParameters()) {
				result.add(parameter);
			}
		}
		return result; 
	}
	
	public static ThingMLModel getThingMLFromURI(InstanceThing instanceThing) throws Exception {
		System.out.println("URI : " + instanceThing.getThingToInstantiate().getImportPath());
		Thing thingToInstantiate = instanceThing.getThingToInstantiate();
		return getThingInThingML(thingToInstantiate);
	}
	
	public static ThingMLModel getThingInThingML(Thing thing) {
		URI new_uri = URI.createFileURI(thing.getImportPath());
		ThingMLStandaloneSetup.doSetup();
		//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,new ThingMLFactoryImpl());
		//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("thingml", new ThingMLFactoryImpl());
		if (new_uri.isRelative()) {
			new_uri = new_uri.resolve(thing.eResource().getURI());
		}
		System.out.println("URI : " + new_uri);
		Resource r = thing.eResource().getResourceSet().getResource(new_uri, true);
		if (r != null && r.getContents().size() > 0 && r.getContents().get(0) instanceof ThingMLModel) {
			return (ThingMLModel) r.getContents().get(0);
		} else {
			try {
				throw new Exception("No valid model found for resource " + thing.getImportPath());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	/**
	 * Load the EMF graph of the model from a File
	 * 
	 * @param file
	 * @return
	 * @throws ModelExceptionHandler
	 */
	public static <T extends EObject> T loadModelFromFile(File file, Class<T> type) {
		if (type.isAssignableFrom(CyprIoTModel.class)) {
			CypriotStandaloneSetup.doSetup();
		} else if (type.isAssignableFrom(ThingMLModel.class)) {
			ThingMLStandaloneSetup.doSetup();
		}
		Resource model = createEMFResourceFromFile(file);

		try {
			model.load(null);
			EcoreUtil.resolveAll(model);
			for (Resource ressource : model.getResourceSet().getResources()) {
				if (!checkProblemsInEMFResource(ressource)) {
					throw new Exception();
				}
			}
			;
			return type.cast(model.getContents().get(0));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Utility function to check if a file exist in the given path
	 * 
	 * @param instance
	 * @return True if the file exist, False if not
	 */
	public static boolean isFileExists(File file) {
		return file.exists() && !file.isDirectory();
	}
	

	/**
	 * Check if there are errors and warning inside an EMF resource
	 * 
	 * @param resource
	 * @param log
	 * @return
	 */
	public static boolean checkProblemsInEMFResource(Resource resource) {
		boolean noErrors = true;
		if (!resource.getErrors().isEmpty()) {
			noErrors = false;
		}
		return noErrors;
	}
	
	/**
	 * Create a Xtext resource from a file
	 * 
	 * @param file
	 * @param log
	 * @return
	 */
	public static Resource createEMFResourceFromFile(File file) {
		URI xmiuri = URI.createFileURI(file.getAbsolutePath());
		ResourceSet rs = new ResourceSetImpl();
		return rs.createResource(xmiuri);
	}


}