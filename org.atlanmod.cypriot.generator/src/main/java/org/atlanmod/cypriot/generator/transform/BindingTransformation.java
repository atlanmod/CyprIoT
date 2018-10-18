package org.atlanmod.cypriot.generator.transform;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.Bind;
import org.atlanmod.cypriot.cyprIoT.BindAction;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.cyprIoT.Topic;
import org.atlanmod.cypriot.generator.utilities.NetworkHelper;
import org.thingml.xtext.thingML.AbstractConnector;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.ExternalConnector;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xtext.thingML.Protocol;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLModel;

public class BindingTransformation implements Transformation {
	private List<Topic> pubTopics;
	private List<Topic> subTopics;

	static final Logger log = LogManager.getLogger(BindingTransformation.class.getName());

	@Override
	public ThingMLModel transform(CyprIoTModel networkModel, InstanceThing instanceThing) {
		Network network = (Network) instanceThing.eContainer();
		List<Bind> bindsContainingThingInstances = NetworkHelper
				.pubSubBindsContainingThingInstances(instanceThing, network);
		pubTopics = NetworkHelper.getAllTopicsOfType(bindsContainingThingInstances, BindAction.WRITE);
		subTopics = NetworkHelper.getAllTopicsOfType(bindsContainingThingInstances, BindAction.READ);
		ThingMLModel thingmlModel = NetworkHelper.getThingmlModelFromInstanceThing(instanceThing);
		
		Configuration configuration = getThingMLConfiguration(thingmlModel);
		if (NetworkHelper.isConfigOne(thingmlModel) && NetworkHelper.isConnectorOne(configuration)) {
			AbstractConnector connector = getThingMLConnector(configuration);
			if (isConnectorExternal(connector)) {
				clearAnnotationsFromConnector(connector);
				clearProtocolToX(thingmlModel, connector, "MQTT");
				addTopicsToInstance(connector, pubTopics, NetworkHelper.TopicTypes.PUBTOPIC);
				addTopicsToInstance(connector, subTopics, NetworkHelper.TopicTypes.SUBTOPIC);
			}
		}
		return thingmlModel;
	}

	/**
	 * @param connector
	 * @param topics
	 */
	private void addTopicsToInstance(AbstractConnector connector, List<Topic> topics,
			NetworkHelper.TopicTypes topicType) {
		for (Topic topic : topics) {
			PlatformAnnotation annotation = setTopicAnnotation(topicType);
			annotation.setValue(getTopicFullPath(topic) + "");
			connector.getAnnotations().add(annotation);
		}
	}

	/**
	 * @param topic
	 * @return
	 */
	private StringBuilder getTopicFullPath(Topic topic) {
		StringBuilder topicFull = new StringBuilder();
		if (!topic.getSubtopicOf().isEmpty()) {
			topicFull.append(topic.getSubtopicOf().get(0).getName() + "/" + topic.getName());
		} else {
			topicFull.append(topic.getName());
		}
		return topicFull;
	}

	/**
	 * @param topicType
	 * @return
	 */
	private PlatformAnnotation setTopicAnnotation(NetworkHelper.TopicTypes topicType) {
		PlatformAnnotation annotation = ThingMLFactory.eINSTANCE.createPlatformAnnotation();
		switch (topicType) {
		case PUBTOPIC:
			annotation.setName("publish_topic");
			break;
		case SUBTOPIC:
			annotation.setName("subscribe_topic");
			break;
		default:
			break;
		}
		return annotation;
	}

	/**
	 * Set the protocol name to X, if any protocol is defined
	 * 
	 * @param thingmlModel
	 * @param connector
	 */
	private void clearProtocolToX(ThingMLModel thingmlModel, AbstractConnector connector, String protocolName) {
		if (!thingmlModel.getProtocols().isEmpty()) {
			log.debug("Protocols are present.");
			thingmlModel.getProtocols().clear();
		}
		Protocol protocol = setThingMLProtocolName(protocolName, thingmlModel);
		setProtocolToExternalConnectorInThingML(connector, protocol);
	}

	/**
	 * @param connector
	 * @param protocol
	 */
	private void setProtocolToExternalConnectorInThingML(AbstractConnector connector, Protocol protocol) {
		((ExternalConnector) connector).setProtocol(protocol);
	}

	/**
	 * @param thingmlModel
	 * @param protocol
	 */
	private void addProtocolToThingML(ThingMLModel thingmlModel, Protocol protocol) {
		thingmlModel.getProtocols().add(protocol);
	}

	/**
	 * @param protocolName
	 * @return
	 */
	private Protocol setThingMLProtocolName(String protocolName, ThingMLModel thingmlModel) {
		Protocol protocol = ThingMLFactory.eINSTANCE.createProtocol();
		protocol.setName(protocolName);
		addProtocolToThingML(thingmlModel, protocol);
		return protocol;
	}

	/**
	 * Clear annotation from the connector (they may contain protocol specific
	 * properties)
	 * 
	 * @param connector
	 */
	private void clearAnnotationsFromConnector(AbstractConnector connector) {
		if (!connector.getAnnotations().isEmpty()) {
			log.debug("Annotations are present in the connector.");
			connector.getAnnotations().clear();
		}
	}

	/**
	 * @param configuration
	 * @return
	 */
	private AbstractConnector getThingMLConnector(Configuration configuration) {
		return configuration.getConnectors().get(0);
	}

	/**
	 * @param thingmlModel
	 * @return
	 */
	private Configuration getThingMLConfiguration(ThingMLModel thingmlModel) {
		return thingmlModel.getConfigs().get(0);
	}

	/**
	 * @param connector
	 * @return
	 */
	private boolean isConnectorExternal(AbstractConnector connector) {
		if (connector instanceof ExternalConnector) {
			log.debug("The connector of "+((ExternalConnector)connector).getInst().getName()+" is external.");
			return true;
		}
		log.error("The connector in the configuration must be external.");
		return false;
	}

}
