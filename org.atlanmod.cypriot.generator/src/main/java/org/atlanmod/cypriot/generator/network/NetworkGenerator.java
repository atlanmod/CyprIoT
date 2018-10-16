package org.atlanmod.cypriot.generator.network;

import java.io.File;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.Bind;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.cyprIoT.Platform;
import org.atlanmod.cypriot.cyprIoT.Topic;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;
import org.atlanmod.cypriot.generator.utilities.Helpers;
import org.atlanmod.cypriot.generator.utilities.NetworkDebug;
import org.atlanmod.cypriot.generator.utilities.NetworkHelper;
import org.eclipse.emf.common.util.EList;

/**
 * A simple generator that generates a description of the network in human
 * readable format
 * 
 * @author imberium
 *
 */
/**
 * @author imberium
 *
 */
public class NetworkGenerator {

	public static final Logger log = LogManager.getLogger(NetworkGenerator.class.getName());

	private File cypriotFile;
	EList<Network> allNetworks;

	/**
	 * Set the Cypriot file being processed
	 * 
	 * @param cypriotFile the cypriotFile to set
	 */
	public void setCypriotFile(File cypriotFile) {
		this.cypriotFile = cypriotFile;
	}
	
	/**
	 * Process code generation for the whole cypriot file
	 */
	public void generate() {
		getNetworksInFile();
		generateTheNetwork();
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
		for (InstanceThing instanceThing : getInstanceThingsInNetwork(network)) {
			List<Bind> pubSubBindsContainingThingInstances = NetworkHelper
					.pubSubBindsContainingThingInstances(instanceThing, network);
			List<Topic> pubTopics = NetworkHelper.getAllTopicsOfType(instanceThing, pubSubBindsContainingThingInstances,
					NetworkHelper.TopicTypes.PUBTOPIC);
			List<Topic> subTopics = NetworkHelper.getAllTopicsOfType(instanceThing, pubSubBindsContainingThingInstances,
					NetworkHelper.TopicTypes.SUBTOPIC);

			generateCodeForInstanceThing(instanceThing, pubTopics, subTopics);
		}
		new NetworkDebug(log, cypriotFile, network);
	}

	/**
	 * Generate code for a given instanceThing
	 * 
	 * @param instanceThing
	 */
	private void generateCodeForInstanceThing(InstanceThing instanceThing, List<Topic> pubTopics,
			List<Topic> subTopics) {
		Platform platform = instanceThing.getTargetedPlatform();
		log.debug("Target platform : " + platform);
		// TODO Code generation happers here
	}

	/**
	 * Set all the network from a cypriot file
	 */
	private void getNetworksInFile() {
		CypriotModelLoader cypriotModelLoader = new CypriotModelLoader();
		CyprIoTModel model = cypriotModelLoader.loadModel(cypriotFile);
		allNetworks = model.getSpecifyNetworks();
	}

	/**
	 * Get the instances of things present in a network
	 * 
	 * @param network
	 * @return
	 */
	private List<InstanceThing> getInstanceThingsInNetwork(Network network) {
		return Helpers.allEObjectContainedIn(network, InstanceThing.class);
	}
}
