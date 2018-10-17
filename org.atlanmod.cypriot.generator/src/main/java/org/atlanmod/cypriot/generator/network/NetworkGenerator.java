package org.atlanmod.cypriot.generator.network;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.Bind;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.cyprIoT.Topic;
import org.atlanmod.cypriot.generator.utilities.Helpers;
import org.atlanmod.cypriot.generator.utilities.NetworkDebug;
import org.atlanmod.cypriot.generator.utilities.NetworkHelper;
import org.eclipse.emf.common.util.EList;
import org.thingml.xtext.thingML.ThingMLModel;

/**
 * A simple generator that generates a description of the network in human
 * readable format
 * 
 * @author imberium
 *
 */

public class NetworkGenerator {

	public static final Logger log = LogManager.getLogger(NetworkGenerator.class.getName());

	EList<Network> allNetworks;
	File cypriotOutputDirectory;
	CyprIoTModel model;
	Map<String, ThingMLModel> transformedModels = new HashMap<String, ThingMLModel>();

	/**
	 * @param model the model to set
	 */
	public NetworkGenerator(CyprIoTModel model, File cypriotOutputDirectory) {
		this.model = model;
		this.cypriotOutputDirectory=cypriotOutputDirectory;
		allNetworks = model.getSpecifyNetworks();
	}
	
	/**
	 * Process code generation for the whole cypriot file
	 */
	public void generate() {
		generateTheNetwork();
	}
	
	/**
	 * @return the transformedModels
	 */
	public Map<String, ThingMLModel> getTransformedModels() {
		return transformedModels;
	}

	/**
	 * Process code generation for the whole network
	 */
	private void generateTheNetwork() {
		for (Network network : allNetworks) {
			generateForAllInstanceThings(network);
		}
	}

	/**
	 * Generate code for every instanceThing in the network
	 * 
	 * @param network
	 */
	private void generateForAllInstanceThings(Network network) {
		for (InstanceThing instanceThing : Helpers.allEObjectContainedIn(network, InstanceThing.class)) {
			List<Bind> pubSubBindsContainingThingInstances = NetworkHelper
					.pubSubBindsContainingThingInstances(instanceThing, network);
			List<Topic> pubTopics = NetworkHelper.getAllTopicsOfType(instanceThing, pubSubBindsContainingThingInstances,
					NetworkHelper.TopicTypes.PUBTOPIC);
			List<Topic> subTopics = NetworkHelper.getAllTopicsOfType(instanceThing, pubSubBindsContainingThingInstances,
					NetworkHelper.TopicTypes.SUBTOPIC);
			InstanceThingGenerator instanceGen = new InstanceThingGenerator(instanceThing, pubTopics, subTopics);
			transformedModels.put(instanceThing.getName(),instanceGen.generate());
		}
		new NetworkDebug(log, network);
	}
}
