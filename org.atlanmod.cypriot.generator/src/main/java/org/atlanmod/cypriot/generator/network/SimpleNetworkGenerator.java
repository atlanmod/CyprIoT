package org.atlanmod.cypriot.generator.network;

import java.io.File;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.BindPubSub;
import org.atlanmod.cypriot.cyprIoT.BindReqRep;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.cyprIoT.Topic;
import org.atlanmod.cypriot.generator.commons.Helpers;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;
import org.eclipse.emf.common.util.EList;

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
			new NetworkDebug(log, cypriotFile, network);
		}
	}

	/**
	 * Generate code for evey instanceThing in the network
	 * 
	 * @param network
	 */
	public void generateForAllInstanceThings(Network network) {
		for (InstanceThing instanceThing : getInstanceThingsInNetwork(network)) {

			ArrayList<BindPubSub> bindPubSubs = pubSubBindsContainingThingInstances(instanceThing, network);

			ArrayList<Topic> pubTopics = getAllPubTopicsOfThingInstace(instanceThing, bindPubSubs);
			ArrayList<Topic> subTopics = getAllSubTopicsOfThingInstace(instanceThing, bindPubSubs);

			reqRepBindsContainingThingInstances(instanceThing, network);
			InstanceThingGenerator instanceGen = new InstanceThingGenerator();
			instanceGen.setCypriotFile(cypriotFile);
			instanceGen.setInstanceThing(instanceThing);
			instanceGen.setOutputDirectory(cypriotOutputDirectory);
			instanceGen.generate();
		}
	}

	
	/**
	 * To be refactored
	 * @param instanceThing
	 * @param bindPubSubs
	 * @return
	 */
	public ArrayList<Topic> getAllSubTopicsOfThingInstace(InstanceThing instanceThing,
			ArrayList<BindPubSub> bindPubSubs) {
		ArrayList<Topic> subTopics = new ArrayList<Topic>();

		for (BindPubSub bindPubSub : bindPubSubs) {
			EList<Topic> topics = bindPubSub.getTopics();
			for (Topic topic : topics) {
				if (bindPubSub.getReadOrWrite().equals("<=")) {
					log.debug("ThingInstance " + instanceThing.getName() + " publish to " + topic.getName());
					subTopics.add(topic);
				} 
			}				
		}
		return subTopics;
	}
	/**
	 * @param instanceThing
	 * @param bindPubSubs
	 * @return
	 */
	public ArrayList<Topic> getAllPubTopicsOfThingInstace(InstanceThing instanceThing,
			ArrayList<BindPubSub> bindPubSubs) {
		ArrayList<Topic> pubTopics = new ArrayList<Topic>();

		for (BindPubSub bindPubSub : bindPubSubs) {
			EList<Topic> topics = bindPubSub.getTopics();
			for (Topic topic : topics) {
				if (bindPubSub.getReadOrWrite().equals("=>")) {
					log.debug("ThingInstance " + instanceThing.getName() + " publish to " + topic.getName());
					pubTopics.add(topic);
				} 
			}				
		}
		return pubTopics;
	}

	/**
	 * Find the ReqRep binds using ThingInstance as subject
	 * 
	 * @param instanceThing
	 * @param network
	 * @return
	 */
	public ArrayList<BindReqRep> reqRepBindsContainingThingInstances(InstanceThing instanceThing, Network network) {
		ArrayList<BindReqRep> binds = new ArrayList<BindReqRep>();
		for (BindReqRep bindReqRep : network.getBindReqRep()) {
			if (bindReqRep.getThingInstance().equals(instanceThing)) {
				log.debug("ThingInstance " + instanceThing.getName() + " is bound to the endpoint "
						+ bindReqRep.getEndpoint());
				binds.add(bindReqRep);
			}
		}
		return binds;
	}

	/**
	 * Find the PubSub binds using ThingInstance as subject
	 * 
	 * @param instanceThing
	 * @param network
	 * @return
	 */
	public ArrayList<BindPubSub> pubSubBindsContainingThingInstances(InstanceThing instanceThing, Network network) {
		ArrayList<BindPubSub> binds = new ArrayList<BindPubSub>();
		for (BindPubSub bindPubSub : network.getBindsPubsub()) {
			if (bindPubSub.getThingInstance().equals(instanceThing)) {
				log.debug("ThingInstance " + instanceThing.getName() + " is bound to "
						+ bindPubSub.getPubSubInstance().getName());
				binds.add(bindPubSub);
			}
		}
		return binds;
	}

	/**
	 * Set all the network from a cy file
	 */
	public void getNetworksInFile() {
		CypriotModelLoader cypriotModelLoader = new CypriotModelLoader();
		CyprIoTModel model = cypriotModelLoader.loadFromFile(cypriotFile);
		allNetworks = model.getNetworks();
	}

	/**
	 * Get the instances of things present in a network
	 * 
	 * @param network
	 * @return
	 */
	public ArrayList<InstanceThing> getInstanceThingsInNetwork(Network network) {
		ArrayList<InstanceThing> instanceThings = (ArrayList<InstanceThing>) Helpers.allTypesInNetwork(network,
				InstanceThing.class);
		return instanceThings;
	}

	/**
	 * Get the Cypriot file being processed
	 * 
	 * @return the cypriotFile
	 */
	public File getCypriotFile() {
		return cypriotFile;
	}

	/**
	 * Set the Cypriot file being processed
	 * 
	 * @param cypriotFile the cypriotFile to set
	 */
	public void setCypriotFile(File cypriotFile) {
		this.cypriotFile = cypriotFile;
	}

	/**
	 * Get the directory of code generation
	 * 
	 * @return the cypriotOutputDirectory
	 */
	public File getCypriotOutputDirectory() {
		return cypriotOutputDirectory;
	}

	/**
	 * Set the directory for code generation
	 * 
	 * @param cypriotOutputDirectory the cypriotOutputDirectory to set
	 */
	public void setCypriotOutputDirectory(File cypriotOutputDirectory) {
		this.cypriotOutputDirectory = cypriotOutputDirectory;
	}
}
