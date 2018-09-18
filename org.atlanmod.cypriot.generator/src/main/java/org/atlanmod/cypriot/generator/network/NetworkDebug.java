package org.atlanmod.cypriot.generator.network;

import java.io.File;
import java.util.ArrayList;

import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.InstancePTP;
import org.atlanmod.cypriot.cyprIoT.InstancePubSub;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.generator.commons.Helpers;

public class NetworkDebug {
	
	 private Logger log;
	 private Network network;
	
	 public NetworkDebug(Logger log, File cypriotFile, Network network) {
		 this.log=log;
		 this.network=network;
		 debugNetworksInfo();
	 }

	/**
	 * Debug function, will be removed
	 * @param network
	 */
	private void debugNetworksInfo() {

		log.debug("######## Network : "+network.getName()+" ########");
		
		debugChannels(network);

		debugBindPubSubs(network);
	}

	/**
	 * Debug trace for all the channels in the network
	 * @param network
	 */
	private void debugChannels(Network network) {
		debugPubSubInstances(network);
		debugReqRepInstances(network);
	}

	/**
	 * TODO : Rewrite the method
	 * Debug trace for all the PubSub Binds in the network
	 * @param network
	 */
	private void debugBindPubSubs(Network network) {
		/*ArrayList<Bind> bindPubSubs = Helpers.allTypesInNetwork(network, Bind.class);

		for (Bind pubSub : bindPubSubs) {
			InstanceThing instanceThing = ((Bind) pubSub).getThingInstance();
			String subjectPort = ((Bind) pubSub).getSubjectPort();
			ChannelBinding channelBinding = ((Bind) pubSub).getBindingChannel();
			String topics = Helpers.appendStrings(((Bind) pubSub).getTopics(), ",");
			log.debug("Bind ThingInstance : " + NetworkHelper.getIdNameOfEobject(instanceThing) + " port : " + subjectPort + " PubSub : "
					+ channelBinding.getName() + " Topics : " + topics);
		}*/
	}

	/**
	 * Debug trace for all the ReqRep Binds in the network
	 * @param network
	 */
	private void debugReqRepInstances(Network network) {
		ArrayList<InstancePTP> reqReps = Helpers.allTypesInNetwork(network, InstancePTP.class);

		for (InstancePTP reqRep : reqReps) {
			String ReqRepName = ((InstancePTP) reqRep).getName();
			log.debug("ReqRep Name : " + ReqRepName);
		}
	}

	/**
	 * Debug trace for all the PubSubInstances in the network
	 * @param network
	 */
	private void debugPubSubInstances(Network network) {
		ArrayList<InstancePubSub> pubSubs = Helpers.allTypesInNetwork(network, InstancePubSub.class);

		for (InstancePubSub pubSub : pubSubs) {
			String pubSubName = ((InstancePubSub) pubSub).getName();
			log.debug("PubSub Name : " + pubSubName);
		}
	}
}
