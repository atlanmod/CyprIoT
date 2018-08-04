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
import org.thingml.compilers.ThingMLCompiler;
import org.thingml.compilers.c.posixmt.PosixMTCompiler;
import org.thingml.compilers.spi.NetworkPlugin;
import org.thingml.compilers.spi.SerializationPlugin;
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
	private File cypriotOutputDirectory;
	
	public void generate() {
		EList<Network> allNetworks = getNetworksInFile();
		
		for (Network network : allNetworks) {
			
			for (InstanceThing instanceThing : getInstanceThingsInNetwork(network)) {
				
				ThingMLModel thingmlModel = getThingmlModelFromInstanceThing(instanceThing);
				
				ThingMLCompiler thingmlCompiler = setThingMLCompilerPlugins();
				File cypriotThingOutputDirectory = getInstanceThingGenDirectory(instanceThing);
				
				thingmlCompiler.setOutputDirectory(cypriotThingOutputDirectory);
				
				SystemLogger loggerThg = new SystemLogger();
				
				thingmlCompiler.compile(thingmlModel.getConfigs().get(0),loggerThg);				
				
				log.debug("ThingML thing name : "+thingmlModel.getTypes().get(0).getName());
				
			}
			allNetworksInfo(network);
		}

	}



	/**
	 * @param instanceThing
	 * @return
	 */
	public File getInstanceThingGenDirectory(InstanceThing instanceThing) {
		File cypriotThingOutputDirectory = new File(cypriotOutputDirectory.getAbsolutePath()+"/"+getIdNameOfEobject(instanceThing));
		return cypriotThingOutputDirectory;
	}

	/**
	 * @return
	 */
	public ThingMLCompiler setThingMLCompilerPlugins() {
		ThingMLCompiler thingmlCompiler = new PosixMTCompiler();
		log.debug("Compiler ID : "+thingmlCompiler.getID());

		NetworkPlugin networkPlugin = new PosixMQTTPlugin();
		log.debug("Network Plugin : "+networkPlugin.getName());

		SerializationPlugin serializationPlugin = new CByteArraySerializerPlugin();
		log.debug("Serialization Plugin : "+serializationPlugin.getName());

		
		thingmlCompiler.addNetworkPlugin(networkPlugin);
		thingmlCompiler.addSerializationPlugin(serializationPlugin);
		return thingmlCompiler;
	}



	/**
	 * Get all the network in a cy file
	 * @return The list of the network in the file
	 */
	public EList<Network> getNetworksInFile() {
		CypriotModelLoader cypriotModelLoader = new CypriotModelLoader();
		CyprIoTModel model = cypriotModelLoader.loadFromFile(cypriotFile);

		EList<Network> allNetworks = model.getNetworks();
		return allNetworks;
	}
	
	

	/**
	 * Check whether there is only one configuration in the imported ThingML file
	 * @param thingmlModel
	 * @return True if there is only one configuration, False if not.
	 */
	public boolean isConfigCountOne(ThingMLModel thingmlModel) {
		int configCount = thingmlModel.getConfigs().size();
		if(configCount==1) {
			log.debug("There is only one configuration : Ok !");
			return true;
		}
		log.debug("There should be only one configuration in the model.");
		return false;
	}
	
	/**
	 * Get the ThingML model imported by an InstanceThing
	 * @param instanceThing
	 * @return The imported ThingML model
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
	 * Get the instances of things present in a network
	 * @param network
	 * @return 
	 */
	public ArrayList<InstanceThing> getInstanceThingsInNetwork(Network network) {
		ArrayList<InstanceThing> instanceThings = (ArrayList<InstanceThing>) Utilities.allTypesInNetwork(network, InstanceThing.class);
		return instanceThings;
	}

	
	/**
	 * Debug function, will be removed
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
	 * @return True if the file exist, False if not
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
	 * Utility function to get the file from a path
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
	 * Get the ID name of any EObject
	 * @param instance
	 * @return The ID name
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
	 * @return The roles assigned to the instanceThing
	 */
	public EList<Role> getAssignedRolesToThing(InstanceThing instance) {
		return instance.getTypeThing().getAssignedRoles();
	}

	/**
	 * Get the full path of the imported thing model
	 * @param instance
	 * @return The full path
	 */
	public String getImportedThingPath(InstanceThing instance) {
		String thingPath= instance.getTypeThing().getImportPath();
		thingPath = thingPath.replace("\"","");
		String fullThingPath = cypriotFile.getAbsoluteFile().getParentFile().getAbsolutePath()+"/"+thingPath;
		log.debug("Full thing path : "+fullThingPath);
		log.debug("Import path : " + thingPath);
		return fullThingPath;
	}
	
	/**
	 * Get the Cypriot file being processed
	 * @return the cypriotFile
	 */
	public File getCypriotFile() {
		return cypriotFile;
	}

	/**
	 * Set the Cypriot file being processed
	 * @param cypriotFile the cypriotFile to set
	 */
	public void setCypriotFile(File cypriotFile) {
		this.cypriotFile = cypriotFile;
	}



	/**
	 * @return the cypriotOutputDirectory
	 */
	public File getCypriotOutputDirectory() {
		return cypriotOutputDirectory;
	}



	/**
	 * @param cypriotOutputDirectory the cypriotOutputDirectory to set
	 */
	public void setCypriotOutputDirectory(File cypriotOutputDirectory) {
		this.cypriotOutputDirectory = cypriotOutputDirectory;
	}
}