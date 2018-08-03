package org.atlanmod.cypriot.generator.networkgenerator;

import java.io.File;
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
import org.eclipse.emf.common.util.EList;

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
		String fileContent = Utilities.getContentFromFile(cypriotFile);
		CypriotModelLoader cypriotModelLoader = new CypriotModelLoader(fileContent);
		CyprIoTModel model = cypriotModelLoader.loadModel();

		EList<Network> allNetworks = model.getNetworks();

		for (Network network : allNetworks) {
			allNetworksInfo(network);
		}

	}

	/**
	 * @param network
	 */
	public void allNetworksInfo(Network network) {
		log.debug("######## Network : "+network.getName()+" ########");
		ArrayList<InstanceThing> instanceThings = Utilities.allTypesInNetwork(network, InstanceThing.class);
		for (InstanceThing instanceThing : instanceThings) {
			InstanceThing instance = (InstanceThing) instanceThing;
			String instanceName = instance.getName();
			log.debug("Thing Name : " + instanceName + " Number : " + instance.getNumberOfInstances());
			String fullThingPath = getImportedThingPath(instance);			
			
			String roles = Utilities.appendStrings(instance.getTypeThing().getAssignedRoles(), ",");
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
			log.debug("Bind ThingInstance : " + instanceThing.getName() + " port : " + subjectPort + " PubSub : "
					+ pubsub.getName() + " Topics : " + topics);
		}
	}

	/**
	 * @param instance
	 * @return
	 */
	public String getImportedThingPath(InstanceThing instance) {
		String thingPath= instance.getTypeThing().getImportPath();
		thingPath = thingPath.replace("\"","");
		String fullThingPath = cypriotFile.getAbsoluteFile().getParentFile().getAbsolutePath()+"/"+thingPath;
		log.debug("Full thing path : "+fullThingPath);
		log.debug("Import path" + thingPath);
		return fullThingPath;
	}
}
