package org.atlanmod.cypriot.generator.utilities;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.Bind;
import org.atlanmod.cypriot.cyprIoT.ChannelToBind;
import org.atlanmod.cypriot.cyprIoT.InstancePTP;
import org.atlanmod.cypriot.cyprIoT.InstancePubSub;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.cyprIoT.ToBindPubSub;

public class NetworkDebug {

	private Logger log;
	private Network network;

	public NetworkDebug(Logger log, Network network) {
		this.log = log;
		this.network = network;
		debugNetworksInfo();
	}

	/**
	 * Debug function, will be removed
	 * 
	 * @param network
	 */
	private void debugNetworksInfo() {

		log.debug("######## Network : " + network.getName() + " ########");

		debugChannels(network);
		debugBindPubSubs(network);
	}

	/**
	 * Debug trace for all the channels in the network
	 * 
	 * @param network
	 */
	private void debugChannels(Network network) {
		debugPubSubInstances(network);
		debugReqRepInstances(network);
	}

	/**
	 * Debug trace for all the PubSub Binds in the network
	 * @param network
	 */
	private void debugBindPubSubs(Network network) {
		List<Bind> allBinds = NetworkHelper.allEObjectContainedIn(network, Bind.class);
		for (Bind bind : allBinds) {
			InstanceThing instanceThing = bind.getBindsInstanceThing();
			String portToBind = bind.getPortToBind();
			ChannelToBind channelToBinds = bind.getChannelToBind();
			String channeName=null;
			String channelTopics=null;
			if(channelToBinds instanceof ToBindPubSub) {
				ToBindPubSub channel = ((ToBindPubSub) channelToBinds);
				channeName = channel.getTargetedPubSubInstance().getName();
				channelTopics = NetworkHelper.appendStrings(channel.getTopics(), ",");
			}
			log.debug("Bind ThingInstance : " + NetworkHelper.getIdNameOfEobject(instanceThing) + " port : " + portToBind + " PubSub : "
					+ channeName + " Topics : " + channelTopics);
		}
	}

	/**
	 * Debug trace for all the ReqRep Binds in the network
	 * 
	 * @param network
	 */
	private void debugReqRepInstances(Network network) {
		List<InstancePTP> reqReps = NetworkHelper.allEObjectContainedIn(network, InstancePTP.class);

		for (InstancePTP reqRep : reqReps) {
			String ReqRepName = ((InstancePTP) reqRep).getName();
			log.debug("ReqRep Name : " + ReqRepName);
		}
	}

	/**
	 * Debug trace for all the PubSubInstances in the network
	 * 
	 * @param network
	 */
	private void debugPubSubInstances(Network network) {
		List<InstancePubSub> pubSubs = NetworkHelper.allEObjectContainedIn(network, InstancePubSub.class);

		for (InstancePubSub pubSub : pubSubs) {
			String pubSubName = ((InstancePubSub) pubSub).getName();
			log.debug("PubSub Name : " + pubSubName);
		}
	}

}
