/**
 * 
 */
/**
 * @author imad
 *
 */
package org.atlanmod.cypriot.cyutil;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.atlanmod.cypriot.CypriotStandaloneSetup;
import org.atlanmod.cypriot.cyprIoT.Bind;
import org.atlanmod.cypriot.cyprIoT.BridgeSubject;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.Import;
import org.atlanmod.cypriot.cyprIoT.Instance;
import org.atlanmod.cypriot.cyprIoT.InstanceChannel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.cyprIoT.Path;
import org.atlanmod.cypriot.cyprIoT.Policy;
import org.atlanmod.cypriot.cyprIoT.Role;
import org.atlanmod.cypriot.cyprIoT.ThingAny;
import org.atlanmod.cypriot.cyprIoT.TypeChannel;
import org.atlanmod.cypriot.cyprIoT.TypeThing;
import org.atlanmod.cypriot.cyprIoT.User;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.thingml.xtext.ThingMLStandaloneSetup;
import org.thingml.xtext.constraints.ThingMLHelpers;
import org.thingml.xtext.helpers.CompositeStateHelper;
import org.thingml.xtext.thingML.CompositeState;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.Function;
import org.thingml.xtext.thingML.Message;
import org.thingml.xtext.thingML.Parameter;
import org.thingml.xtext.thingML.Port;
import org.thingml.xtext.thingML.Property;
import org.thingml.xtext.thingML.State;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLModel;
import org.thingml.xtext.thingML.Type;

public class Helpers {

	static final Logger log = LogManager.getLogger(Helpers.class.getName());
	/**
	 * Check whether there is only one Thing type
	 * 
	 * @param thingmlModel
	 * @return True if there is only one Thing type, False if not.
	 */
	public static boolean isThingOne(ThingMLModel thingModel) {
		List<TypeThing> things = new ArrayList<TypeThing>();
		List<Type> alltypes = thingModel.getTypes();
		for (Type type : alltypes) {
			if (type instanceof TypeThing) {
				things.add((TypeThing) type);
			}
		}
		return things.size() == 1;
	}
	
	/**
	 * Check whether there is only one external connector in the imported ThingML
	 * file
	 * 
	 * @param thingmlModel
	 * @return True if there is only one connector, False if not.
	 */
	public static boolean isConnectorOne(Configuration configuration) {
		int connnectorsCount = configuration.getConnectors().size();
		return connnectorsCount == 1;
	}
	

	/**
	 * @param thingModel
	 * @return
	 */
	public static EList<State> getAllStateInThingMLModel(ThingMLModel thingModel) {
		Thing thing = (Thing) thingModel.getTypes().get(0);
		CompositeState statechart = (CompositeState) thing.getBehaviour();
		EList<State> allStates = statechart.getSubstate();
		return allStates;
	}
	
	public static ThingMLModel setNameInThingML(File thingMLInputFile, String thingName) {
		ThingMLModel thingmlModel = Helpers.loadModelFromFile(thingMLInputFile, ThingMLModel.class);
		((Thing)thingmlModel.getTypes().get(0)).setName(thingName);
		return thingmlModel;
	}
	
	/**
	 * Check whether there is only one configuration in the imported ThingML file
	 * 
	 * @param thingmlModel
	 * @return True if there is only one configuration, False if not.
	 */
	public static boolean isConfigOne(ThingMLModel thingmlModel) {
		int configCount = thingmlModel.getConfigs().size();
		return configCount == 1;
	}
	
	public static CyprIoTModel getModelFromRelativeURI(CyprIoTModel cyModel, String uri) throws Exception {
		URI new_uri;
		log.debug("URI of CyprIoT file : " + uri);
		new_uri = URI.createURI(uri);
		if (new_uri.isRelative()) {
			new_uri = new_uri.resolve(cyModel.eResource().getURI());
		}
		Resource r = cyModel.eResource().getResourceSet().getResource(new_uri, true);
		if (!checkProblemsInEMFResource(r)) {
			throw new Exception();
		}
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

	@SuppressWarnings("unchecked")
	public static <C> C allContainedCrossReferencesOfType(EObject parent, Class<?> c) {
		List<C> result = new ArrayList<C>();
		ListIterator<EObject> it = parent.eCrossReferences().listIterator();
		while (it.hasNext()) {
			EObject o = it.next();
			if (c.isInstance(o))
				result.add((C) o);
		}
		if(result.size()>0) {
			return (C) result.get(0);
		}
		return null;
	}
	
	public static ThingAny allContainedCrossThingAny(EObject parent) {
		ThingAny thingAny = allContainedCrossReferencesOfType(parent, ThingAny.class);
		return thingAny;
	}
	
	public static TypeChannel allContainedCrossTypeChannel(EObject parent) {
		TypeChannel typeChannel = allContainedCrossReferencesOfType(parent, TypeChannel.class);
		return typeChannel;
	}
	
	public static InstanceChannel allContainedCrossInstanceChannel(EObject parent) {
		InstanceChannel instanceChannel = allContainedCrossReferencesOfType(parent, InstanceChannel.class);
		return instanceChannel;
	}
	
	public static TypeChannel allContainedCrossPubSub(EObject parent) {
		TypeChannel typeChannel=null;
		List<TypeChannel> result = new ArrayList<TypeChannel>();
		ListIterator<EObject> it = parent.eCrossReferences().listIterator();
		while (it.hasNext()) {
			EObject o = it.next();
			if (o instanceof TypeChannel)
				result.add((TypeChannel) o);
		}
		if(result.size()!=0) {
			typeChannel = allContainedCrossTypeChannel(parent);
		} else {
			if(allContainedCrossInstanceChannel(parent)!=null)
			typeChannel = allContainedCrossInstanceChannel(parent).getTypeChannel().getPubSubToInstantiate();
		}
		
		return typeChannel;
	}

	public static CyprIoTModel findContainingModel(EObject object) {
		return findContainer(object, CyprIoTModel.class);
	}

	public static TypeThing findContainingThing(EObject object) {
		return findContainer(object, TypeThing.class);
	}

	public static TypeChannel findContainingPubSub(EObject object) {
		return findContainer(object, TypeChannel.class);
	}

	public static Bind findContainingBind(EObject object) {
		return findContainer(object, Bind.class);
	}

	public static ThingAny findContainingThingAny(EObject object) {
		return findContainer(object, ThingAny.class);
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

	public static ArrayList<TypeThing> allThings(CyprIoTModel model) {
		ArrayList<TypeThing> result = new ArrayList<TypeThing>();
		for (CyprIoTModel m : allCypriotModels(model)) {
			for (TypeThing t : m.getDeclareThings()) {
				result.add((TypeThing) t);
			}
		}
		return result;
	}

	public static ArrayList<TypeChannel> allPusSub(CyprIoTModel model) {
		ArrayList<TypeChannel> result = new ArrayList<TypeChannel>();
		for (CyprIoTModel m : allCypriotModels(model)) {
			for (TypeChannel t : m.getDeclareChannels()) {
				if (t instanceof TypeChannel) {
					result.add((TypeChannel) t);
				}
			}
		}
		return result;
	}

	public static ArrayList<Path> allTopicsInPubSub(TypeChannel pubSub) {
		ArrayList<Path> result = new ArrayList<Path>();
		for (Path t : pubSub.getHasPaths()) {
			result.add((Path) t);
		}
		return result;
	}
	
	public static ArrayList<Path> allTopics(InstanceChannel pubSub) {
		ArrayList<Path> result = new ArrayList<Path>();
		for (Path t : pubSub.getTypeChannel().getPubSubToInstantiate().getHasPaths()) {
			result.add((Path) t);
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

	public static ArrayList<InstanceThing> allInstanceThingsOwnedByUser(User user) {
		CyprIoTModel cyprIoTModel = (CyprIoTModel) user.eContainer();
		ArrayList<InstanceThing> result = new ArrayList<InstanceThing>();
		List<Network> networks = cyprIoTModel.getSpecifyNetworks();
		for (Network network : networks) {
			List<Instance> instances = network.getInstantiate();
			for (Instance instance : instances) {
				if (instance instanceof InstanceThing) {
					if (((InstanceThing) instance).getTypeThing().getOwner().getName().equals(user.getName())) {
						result.add((InstanceThing) instance);
					}
				}
			}

		}
		return result;
	}

	public static ArrayList<User> allUsersAssignedRole(Role role) {
		CyprIoTModel cyprIoTModel = (CyprIoTModel) role.eContainer();
		ArrayList<User> result = new ArrayList<User>();
		List<User> users = cyprIoTModel.getDeclareUsers();
		for (User user : users) {
			if (user.getAssignedRoles().contains(role)) {
				result.add(user);
			}
		}
		return result;
	}
//	public static ArrayList<ThingSubjectAny> allThingSubject(CyprIoTModel cypriotModel) {
//		ArrayList<ThingSubjectAny> result = new ArrayList<ThingSubjectAny>();
//		
//		
//		for (Network network : cypriotModel.getSpecifyNetworks()) {
//			for (Instance instance : network.getInstantiate()) {
//				//System.out.println("thingins : "+ ((InstanceThing) instance).getName());
//				if (instance instanceof InstanceThing)
//					result.add((InstanceThing) instance);
//			}
//		}
//		result.addAll(cypriotModel.getDeclareThings());
//		return result;
//	}
//	
	/*
	 * public static ArrayList<SubjectAndObject> allSubjectConditions(Rule rule) {
	 * ArrayList<SubjectAndObject> result = new ArrayList<SubjectAndObject>();
	 * 
	 * if(rule.getRuleObject()!=null) { result.add(rule.getRuleObject()); }
	 * result.add(rule.getRuleSubject()); return result; }
	 */

	public static ArrayList<InstanceChannel> allPubSubinstances(Network network) {
		ArrayList<InstanceChannel> result = new ArrayList<InstanceChannel>();
		for (Instance t : network.getInstantiate()) {
			if (t instanceof InstanceChannel)
				result.add((InstanceChannel) t);
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
		TypeThing thingToInstanciate = (bind.getBindsInstanceThing().getTypeThing().getThingToInstantiate());
		ArrayList<Port> result = getAllPortsThing(thingToInstanciate);
		return result;
	}

	public static ArrayList<Function> getAllFunctionsThingAny(ThingAny thingAny) {
		if (thingAny instanceof TypeThing) {
			return allFunctionsThingML((TypeThing) thingAny);
		} else if (thingAny instanceof InstanceThing) {
			return allFunctionsThingML(((InstanceThing) thingAny).getTypeThing().getThingToInstantiate());
		}

		return null;
	}

	public static ArrayList<Function> allFunctionsThingML(TypeThing thing) {
		ThingMLModel thingmlModel = null;
		ArrayList<Function> result = new ArrayList<Function>();
		try {
			thingmlModel = getThingInThingML(thing);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ArrayList<Type> things = new ArrayList<Type>();
		for (Type type : thingmlModel.getTypes()) {
			if(type instanceof Thing) {
				things.add(type);
			}
		}
		if (thingmlModel != null) {
			ArrayList<Function> functions = ThingMLHelpers
					.allFunctions((((Thing) things.get(0))));
			for (Function function : functions) {
				result.add(function);
			}
		}
		return result;
	}

	public static ArrayList<State> getAllStatesThingAny(ThingAny thingAny) {
		if (thingAny instanceof TypeThing) {
			return allStatesThingML((TypeThing) thingAny);
		} else if (thingAny instanceof InstanceThing) {
			return allStatesThingML(((InstanceThing) thingAny).getTypeThing().getThingToInstantiate());
		}

		return null;
	}

	public static ArrayList<Port> getAllPortsThingAny(ThingAny thingAny) {
		if (thingAny instanceof TypeThing) {
			return getAllPortsThing((TypeThing) thingAny);
		} else if (thingAny instanceof InstanceThing) {
			return getAllPortsThing(((InstanceThing) thingAny).getTypeThing().getThingToInstantiate());
		}

		return null;
	}

	/**
	 * @param thingToInstanciate
	 * @return
	 */
	public static ArrayList<Port> getAllPortsThing(TypeThing thingToInstanciate) {
		ThingMLModel thingmlModel;
		ArrayList<Port> result = new ArrayList<Port>();
		thingmlModel = getThingInThingML(thingToInstanciate);
		if (thingmlModel != null)
			result = ThingMLHelpers.allPorts((Thing) thingmlModel.getTypes().get(0));
		return result;
	}

	public static ArrayList<State> allStatesThingML(TypeThing thing) {
		ThingMLModel thingmlModel = null;
		ArrayList<State> result = new ArrayList<State>();
		try {
			thingmlModel = getThingInThingML(thing);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (thingmlModel != null) {
			CompositeState compositeState = ThingMLHelpers
					.allStateMachines((Thing) thingmlModel.getTypes().get(0)).get(0);
			ArrayList<State> states = new ArrayList<State>(
					CompositeStateHelper.allContainedStatesExludingSessions(compositeState));
			for (State state : states) {
				result.add(state);
			}
		}
		return result;
	}

	public static ArrayList<Property> allPropertiesThingML(TypeThing thing) {
		ThingMLModel thingmlModel = null;
		ArrayList<Property> result = new ArrayList<Property>();
		try {
			thingmlModel = getThingInThingML(thing);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (thingmlModel != null) {
			ArrayList<Property> properties = ThingMLHelpers
					.allProperties(((Thing) thingmlModel.getTypes().get(0)));
			for (Property property : properties) {
				result.add(property);
			}
		}
		return result;
	}

	public static ArrayList<Message> allMessagesThingML(TypeThing thing) {
		ThingMLModel thingmlModel = null;
		ArrayList<Message> result = new ArrayList<Message>();
		try {
			thingmlModel = getThingInThingML(thing);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (thingmlModel != null) {
			ArrayList<Message> messages = ThingMLHelpers
					.allMessages(((Thing) thingmlModel.getTypes().get(0)));
			for (Message message : messages) {
				result.add(message);
			}
		}
		return result;
	}
	
	public static ArrayList<Message> allMessagesInNetworkModel(ArrayList<TypeThing> allThings) {
		
		ArrayList<Message> result = new ArrayList<Message>();

		for (TypeThing thing : allThings) {
			if(thing.getImportPath()!=null)	result.addAll(allMessagesThingML(thing));
		}
		
		return result;
	}

	public static ArrayList<Parameter> allMessageParametersThingML(Message message) {
		ArrayList<Parameter> result = new ArrayList<Parameter>();
		if (message != null) {
			for (Parameter parameter : message.getParameters()) {
				result.add(parameter);
			}
		}
		return result;
	}

	public static ThingMLModel getThingMLFromURI(InstanceThing instanceThing) throws Exception {
		log.debug("URI of ThingML file of instanceThing " + instanceThing.getName() + " : "
				+ instanceThing.getTypeThing().getThingToInstantiate().getImportPath());
		TypeThing thingToInstantiate = instanceThing.getTypeThing().getThingToInstantiate();
		return getThingInThingML(thingToInstantiate);
	}

	public static ThingMLModel getThingInThingML(TypeThing thing) {
		if (URI.createFileURI(thing.getImportPath()).isFile()) {
			URI new_uri = URI.createFileURI(thing.getImportPath());
			ThingMLStandaloneSetup.doSetup();

			log.debug("URI of ThingML file : " + new_uri);
			if (new_uri.isRelative()) {
				new_uri = new_uri.resolve(thing.eResource().getURI());
			}
			Resource r = thing.eResource().getResourceSet().getResource(new_uri, true);
			if (r != null && r.getContents().size() > 0 && r.getContents().get(0) instanceof ThingMLModel) {
				return (ThingMLModel) r.getContents().get(0);
			} else {
				try {
					throw new Exception("No valid model found in " + thing.getImportPath());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else {
			try {
				throw new Exception("No valid model found in " + thing.getImportPath());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public static <T extends EObject> T loadModelFromPath(String path, Class<T> type) {
		File file = new File(path);
		return Helpers.loadModelFromFile(file, type);
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
		return getModelFromResource(model, type);
	}

	public static <T extends EObject> T getModelFromResource(Resource model, Class<T> type) {
		
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

    public static void writeStringOnFile(String fileName, String message) {
        FileWriter w = null;
        try {
            w = new FileWriter(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(w);
        PrintWriter wr = new PrintWriter(bw);

        try {
            wr.write(message);
            wr.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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

		if (resource.getWarnings().size() > 0) {
			for (Diagnostic diagnostic : resource.getWarnings()) {
				String location = diagnostic.getLocation();
        		if (location == null) {
        			location = resource.getURI().toFileString();
        		}
				log.warn("Warning in file  " + location + " (" + diagnostic.getLine() + ", " + diagnostic.getColumn() + "): " + diagnostic.getMessage());
			}
		}
		if (resource.getErrors().size() > 0) {
			log.error("CyprIoT Model contains " + resource.getErrors().size() + " errors.");
			for (Diagnostic diagnostic : resource.getErrors()) {
				String location = diagnostic.getLocation();
        		if (location == null) {
        			location = resource.getURI().toFileString();
        		}
        		log.error("Error in file  " + location + " (" + diagnostic.getLine() + ", " + diagnostic.getColumn() + "): " + diagnostic.getMessage());
			}
			return false;
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
	
	public static Resource getResourceFromFile(File thingMLInputFile, String thingName) {
		return Helpers.getResourceFromModel(Helpers.setNameInThingML(thingMLInputFile, thingName));
	}
	
	public static Resource getResourceFromModel(EObject eObject) {
		ResourceSet myres = new ResourceSetImpl();
		Resource res = myres.createResource(URI.createFileURI("dummy.xmi"));
		res.getContents().add(eObject);
		EcoreUtil.resolveAll(res);
		return res;
	}

	/**
	 * Read a file and returns its content
	 * 
	 * @param file File to read
	 * @return
	 */
	public static String getContentFromFile(File file) {
		String content = null;
		FileReader reader = null;
		try {
			reader = new FileReader(file);
			char[] chars = new char[(int) file.length()];
			reader.read(chars);
			content = new String(chars);
			return content;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return content;
	}
}