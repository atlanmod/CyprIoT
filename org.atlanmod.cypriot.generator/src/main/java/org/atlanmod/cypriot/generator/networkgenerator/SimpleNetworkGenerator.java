package org.atlanmod.cypriot.generator.networkgenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.BindPubSub;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstancePubSub;
import org.atlanmod.cypriot.cyprIoT.InstanceReqRep;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.NamedElement;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.cyprIoT.Role;
import org.atlanmod.cypriot.generator.commons.Utilities;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;
import org.atlanmod.cypriot.generator.models.ThingMLModelLoader;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.thingml.compilers.c.posixmt.PosixMTCompiler;
import org.thingml.networkplugins.c.CByteArraySerializerPlugin;
import org.thingml.networkplugins.c.posix.PosixMQTTPlugin;
import org.thingml.utilities.logging.SystemLogger;
import org.thingml.xtext.thingML.ThingMLModel;

/**
 * A simple generator that generates a description of the network in human
 * readable format
 * 
 * @author imberium
 *
 */
public class SimpleNetworkGenerator {

	final Logger log = Logger.getLogger(SimpleNetworkGenerator.class.getName());
	
	private File cypriotFile;

	/**
	 * @return the cypriotFile
	 */
	public File getCypriotFile() {
		return cypriotFile;
	}

	/**
	 * @param cypriotFile the cypriotFile to set
	 */
	public void setCypriotFile(File cypriotFile) {
		this.cypriotFile = cypriotFile;
	}
	
	public void generate() {
		CypriotModelLoader cypriotModelLoader = new CypriotModelLoader();
		CyprIoTModel model = cypriotModelLoader.loadFromFile(cypriotFile);

		EList<Network> allNetworks = model.getNetworks();
		
		for (Network network : allNetworks) {
			
			for (InstanceThing instanceThing : instancesInNetwork(network)) {
				File cypriotFolder = new File("/home/imad/dev/eclipse/phd/CyprIoT/org.atlanmod.cypriot.generator/../examples/twothings/gen/"+instanceThing.getName()+"/");
				ThingMLModel thingmlModel = getThingmlModelFromInstanceThing(instanceThing);
				PosixMTCompiler thingmlCompiler = new PosixMTCompiler();
				PosixMQTTPlugin mqttPlugin = new PosixMQTTPlugin();
				thingmlCompiler.addNetworkPlugin(mqttPlugin);
				CByteArraySerializerPlugin byteSerial = new CByteArraySerializerPlugin();
				thingmlCompiler.addSerializationPlugin(byteSerial);
				thingmlCompiler.setOutputDirectory(cypriotFolder);
				SystemLogger loggerThg = new SystemLogger();
				thingmlCompiler.compile(thingmlModel.getConfigs().get(0),loggerThg);
				log.debug("Compiler ID : "+thingmlCompiler.getID());
				log.debug("Compiler description : "+thingmlCompiler.getDescription());
				log.debug("ThingML thing name : "+thingmlModel.getTypes().get(0).getName());
			}
			allNetworksInfo(network);
		}

	}

	/**
	 * @param instanceThing
	 * @return
	 */
	public ThingMLModel getThingmlModelFromInstanceThing(InstanceThing instanceThing) {
		String thingPath = getImportedThingPath(instanceThing);
		ThingMLModelLoader thingmlloader = new ThingMLModelLoader();
		File thingMLFile;
		ThingMLModel thingmlModel = null;
		try {
			thingMLFile = getFileFromPath(thingPath);
			thingmlModel= thingmlloader.loadFromFile(thingMLFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return thingmlModel;
	}

	/**
	 * @param network
	 * @return
	 */
	public ArrayList<InstanceThing> instancesInNetwork(Network network) {
		ArrayList<InstanceThing> instanceThings = (ArrayList<InstanceThing>) Utilities.allTypesInNetwork(network, InstanceThing.class);
		return instanceThings;
	}

	
	/**
	 * @param network
	 */
	public void allNetworksInfo(Network network) {
		log.debug("######## Network : "+network.getName()+" ########");
		ArrayList<InstanceThing> instanceThings = Utilities.allTypesInNetwork(network, InstanceThing.class);
		for (InstanceThing instanceThing : instanceThings) {
			String instanceName = getIdNameOfEobject(instanceThing);
			log.debug("Thing Name : " + instanceName + " Number : " + instanceThing.getNumberOfInstances());
			String fullThingPath = getImportedThingPath(instanceThing);			
			
			File file;
			try {
				file = getFileFromPath(fullThingPath);
				if(file!=null) {
					Utilities.getContentFromFile(file);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String roles = Utilities.appendStrings(getAssignedRolesToThing(instanceThing), ",");
			log.debug("Roles : " + roles);
			log.debug("Roles : " + roles);
		}

		ArrayList<InstancePubSub> pubSubs = Utilities.allTypesInNetwork(network, InstancePubSub.class);

		for (InstancePubSub pubSub : pubSubs) {
			String pubSubName = ((InstancePubSub) pubSub).getName();
			log.debug("PubSub Name : " + pubSubName);
		}

		ArrayList<InstanceReqRep> reqReps = Utilities.allTypesInNetwork(network, InstanceReqRep.class);

		for (InstanceReqRep reqRep : reqReps) {
			String ReqRepName = ((InstanceReqRep) reqRep).getName();
			log.debug("ReqRep Name : " + ReqRepName);
		}

		ArrayList<BindPubSub> bindPubSubs = Utilities.allTypesInNetwork(network, BindPubSub.class);

		for (BindPubSub reqRep : bindPubSubs) {
			InstanceThing instanceThing = ((BindPubSub) reqRep).getThingInstance();
			String subjectPort = ((BindPubSub) reqRep).getSubjectPort();
			InstancePubSub pubsub = ((BindPubSub) reqRep).getPubSubInstance();

			String topics = Utilities.appendStrings(((BindPubSub) reqRep).getTopics(), ",");
			log.debug("Bind ThingInstance : " + getIdNameOfEobject(instanceThing) + " port : " + subjectPort + " PubSub : "
					+ pubsub.getName() + " Topics : " + topics);
		}
	}

	
	/**
	 * Utility function to check if a file exist in the given path
	 * @param instance
	 * @return
	 */
	public boolean isFileExists(File file) {
		if(file.exists() && !file.isDirectory()) {
			log.debug("Thing model file is present");
		    return true;
		}
		log.error("Thing model file does not exist");
		return false;
	}

	/**
	 * @param filePathString
	 * @return
	 * @throws FileNotFoundException 
	 */
	public File getFileFromPath(String filePathString) throws FileNotFoundException {
		File file = new File(filePathString);
		try {
			if(isFileExists(file)) {
				return file;
			}
		} catch (Exception e) {
			throw new FileNotFoundException();
		}
		
		return null;
	}
	
	/**
	 * Get the name of any EObject
	 * @param instance
	 * @return
	 */
	public String getIdNameOfEobject(EObject eObject) {
		String name =null;
		if (eObject instanceof NamedElement) {
			name = ((NamedElement)eObject).getName();
		}
		return name;
	}

	/**
	 * Get the assigned roles to the thing corresponding to the instanceThing
	 * @param instance
	 * @return
	 */
	public EList<Role> getAssignedRolesToThing(InstanceThing instance) {
		return instance.getTypeThing().getAssignedRoles();
	}

	/**
	 * Get the full path of the imported thing model
	 * @param instance
	 * @return
	 */
	public String getImportedThingPath(InstanceThing instance) {
		String thingPath= instance.getTypeThing().getImportPath();
		thingPath = thingPath.replace("\"","");
		String fullThingPath = cypriotFile.getAbsoluteFile().getParentFile().getAbsolutePath()+"/"+thingPath;
		log.debug("Full thing path : "+fullThingPath);
		log.debug("Import path : " + thingPath);
		return fullThingPath;
	}
}
