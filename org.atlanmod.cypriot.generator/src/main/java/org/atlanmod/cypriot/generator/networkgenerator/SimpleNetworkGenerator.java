package org.atlanmod.cypriot.generator.networkgenerator;

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

	public void generate(String fileContent) {
		CypriotModelLoader cypriotModelLoader = new CypriotModelLoader(fileContent);
		CyprIoTModel model = cypriotModelLoader.loadModel();

		EList<Network> allNetworks = model.getNetworks();

		for (Network network : allNetworks) {
			getallNetworksInfo(network);
		}

	}

	/**
	 * @param network
	 */
	public void getallNetworksInfo(Network network) {
		log.debug("######## Network : "+network.getName()+" ########");
		ArrayList<InstanceThing> instanceThings = Utilities.allTypesInNetwork(network, InstanceThing.class);
		for (InstanceThing instanceThing : instanceThings) {
			InstanceThing instance = (InstanceThing) instanceThing;
			log.debug("Thing Name : " + instance.getName() + " Number : " + instance.getNumberOfInstances());
			log.debug("Import path" + instance.getTypeThing().getImportPath());
			String roles = Utilities.appendStrings(instance.getTypeThing().getAssignedRoles(), ",");
			log.debug("Roles : " + roles);
		}

		ArrayList<InstancePubSub> pubSubs = Utilities.allTypesInNetwork(network, InstancePubSub.class);

		for (InstancePubSub pubSub : pubSubs) {
			log.debug("PubSub Name : " + ((InstancePubSub) pubSub).getName());
		}

		ArrayList<InstanceReqRep> reqReps = Utilities.allTypesInNetwork(network, InstanceReqRep.class);

		for (InstanceReqRep reqRep : reqReps) {
			log.debug("ReqRep Name : " + ((InstanceReqRep) reqRep).getName());
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
}
