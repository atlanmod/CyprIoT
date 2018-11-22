package org.atlanmod.cypriot.generator.transform;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.Bind;
import org.atlanmod.cypriot.cyprIoT.BindAction;
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
	
	static final Logger log = LogManager.getLogger(BindingTransformation.class.getName());

	@Override
	public ThingMLModel transform(InstanceThing instanceThing, ThingMLModel modelToTransform) {
		Network network = (Network) instanceThing.eContainer();
		List<Bind> bindsContainingThingInstances = NetworkHelper
				.pubSubBindsContainingThingInstances(instanceThing, network);
		List<Topic> pubTopics = NetworkHelper.getAllTopicsOfType(bindsContainingThingInstances, BindAction.WRITE);
		List<Topic> subTopics = NetworkHelper.getAllTopicsOfType(bindsContainingThingInstances, BindAction.READ);
		
		Configuration configuration = getThingMLConfiguration(modelToTransform);
		if (NetworkHelper.isConfigOne(modelToTransform) && NetworkHelper.isConnectorOne(configuration)) {
			AbstractConnector connector = getThingMLConnector(configuration);
			if (isConnectorExternal(connector)) {
				connector.getAnnotations().clear();
				modelToTransform.getProtocols().clear();
				Protocol protocol = ThingMLFactory.eINSTANCE.createProtocol();
				protocol.setName("MQTT");
				modelToTransform.getProtocols().add(protocol);
				((ExternalConnector) connector).setProtocol(protocol);
				addTopicsToInstance(connector, pubTopics, NetworkHelper.TopicTypes.PUBTOPIC);
				addTopicsToInstance(connector, subTopics, NetworkHelper.TopicTypes.SUBTOPIC);
			}
		}
		return modelToTransform;
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
		return connector instanceof ExternalConnector;
	}

}
