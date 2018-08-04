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
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.generator.commons.Utilities;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;
import org.atlanmod.cypriot.generator.models.ThingMLModelLoader;
import org.eclipse.emf.common.util.EList;
import org.thingml.compilers.ThingMLCompiler;
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

	final static Logger log = Logger.getLogger(SimpleNetworkGenerator.class.getName());
	
	private File cypriotFile;
	private File cypriotOutputDirectory;
	EList<Network> allNetworks;
	
	/**
	 * Process code generation for the whole cy file
	 */
	public void generate() {
		getNetworksInFile();
		generateTheNetwork();
	}

	/**
	 * Process code generation for the whole network 
	 */
	public void generateTheNetwork() {
		for (Network network : allNetworks) {
			generateForAllInstanceThings(network);
			NetworkDebug name = new NetworkDebug(log,cypriotFile,network);
		}
	}

	/** 
	 * Generate code for evey instanceThing in the network
	 * @param network
	 */
	public void generateForAllInstanceThings(Network network) {
		for (InstanceThing instanceThing : getInstanceThingsInNetwork(network)) {
			
			ThingMLModel thingmlModel = getThingmlModelFromInstanceThing(instanceThing);
			
			ThingMLCompiler thingmlCompiler = NetworkHelper.setThingMLCompilerPlugins();
			File cypriotThingOutputDirectory = getInstanceThingGenDirectory(instanceThing);
			
			thingmlCompiler.setOutputDirectory(cypriotThingOutputDirectory);
			
			SystemLogger loggerThg = new SystemLogger();
			
			thingmlCompiler.compile(thingmlModel.getConfigs().get(0),loggerThg);				
			
			log.debug("ThingML thing name : "+thingmlModel.getTypes().get(0).getName());
			
		}
	}

	/**
	 * Get the directory of generation for a single thing
	 * @param instanceThing
	 * @return
	 */
	public File getInstanceThingGenDirectory(InstanceThing instanceThing) {
		File cypriotThingOutputDirectory = new File(cypriotOutputDirectory.getAbsolutePath()+"/"+NetworkHelper.getIdNameOfEobject(instanceThing));
		return cypriotThingOutputDirectory;
	}

	/**
	 * Set  all the network from a cy file
	 */
	public void getNetworksInFile() {
		CypriotModelLoader cypriotModelLoader = new CypriotModelLoader();
		CyprIoTModel model = cypriotModelLoader.loadFromFile(cypriotFile);
		allNetworks = model.getNetworks();
	}
	
	/**
	 * Get the ThingML model imported by an InstanceThing
	 * @param instanceThing
	 * @return The imported ThingML model
	 */
	public ThingMLModel getThingmlModelFromInstanceThing(InstanceThing instanceThing) {
		String thingPath = NetworkHelper.getImportedThingPath(instanceThing, cypriotFile);
		ThingMLModelLoader thingmlloader = new ThingMLModelLoader();
		File thingMLFile;
		ThingMLModel thingmlModel = null;
		try {
			thingMLFile = NetworkHelper.getFileFromPath(thingPath);
			thingmlModel= thingmlloader.loadFromFile(thingMLFile);
		} catch (FileNotFoundException e) {
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
	 * Get the directory of code generation
	 * @return the cypriotOutputDirectory
	 */
	public File getCypriotOutputDirectory() {
		return cypriotOutputDirectory;
	}

	/**
	 * Set the directory for code generation
	 * @param cypriotOutputDirectory the cypriotOutputDirectory to set
	 */
	public void setCypriotOutputDirectory(File cypriotOutputDirectory) {
		this.cypriotOutputDirectory = cypriotOutputDirectory;
	}
}
