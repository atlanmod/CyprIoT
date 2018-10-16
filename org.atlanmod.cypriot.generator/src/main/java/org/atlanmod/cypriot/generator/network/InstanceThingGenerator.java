package org.atlanmod.cypriot.generator.network;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Topic;
import org.atlanmod.cypriot.generator.models.ThingMLModelLoader;
import org.atlanmod.cypriot.generator.utilities.Helpers;
import org.atlanmod.cypriot.generator.utilities.NetworkHelper;
import org.thingml.compilers.ThingMLCompiler;
import org.thingml.xtext.thingML.AbstractConnector;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.ExternalConnector;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xtext.thingML.Protocol;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLModel;

public class InstanceThingGenerator {
	private InstanceThing instanceThing;
	private File cypriotFile;
	private File outputDirectory;
	private List<Topic> pubTopics;
	private List<Topic> subTopics;

	static final Logger log = LogManager.getLogger(InstanceThingGenerator.class.getName());

	public InstanceThingGenerator(File cypriotFile, InstanceThing instanceThing, File outputDirectory) {
		this.cypriotFile = cypriotFile;
		this.instanceThing = instanceThing;
		this.outputDirectory = outputDirectory;
	}

	public void generate() {
		generateUsingThingMLGenerator();
		debugInstanceThing();
	}

	/**
	 * @param pubTopics the pubTopics to set
	 */
	public void setPubTopics(List<Topic> pubTopics) {
		this.pubTopics = pubTopics;
	}

	/**
	 * @param subTopics the subTopics to set
	 */
	public void setSubTopics(List<Topic> subTopics) {
		this.subTopics = subTopics;
	}

	/**
	 * Debug trace for all the instanceThings in the network
	 * 
	 * @param network
	 */
	private void debugInstanceThing() {
		String instanceName = NetworkHelper.getIdNameOfEobject(instanceThing);
		log.debug("Thing instance Name : " + instanceName + " - Number of instance(s) : "
				+ instanceThing.getDeclareNumberOfInstances());
		String roles = Helpers.appendStrings(NetworkHelper.getAssignedRolesToThing(instanceThing), ",");
		log.debug("Roles for " + instanceName + " : " + roles);
	}

	/**
	 * Generate code for an instanceThing using ThingML compiler
	 * 
	 * @param instanceThing
	 */
	private void generateUsingThingMLGenerator() {
		ThingMLModel thingmlModel = ThingMLCompiler.flattenModel(getThingmlModelFromInstanceThing());
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
		saveAsThingML(thingmlModel);
	}

	/**
	 * @param connector
	 * @param topics
	 */
	private void addTopicsToInstance(AbstractConnector connector, List<Topic> topics, NetworkHelper.TopicTypes topicType) {
		for (Topic topic : topics) {
			PlatformAnnotation annotation = setTopicAnnotation(topicType);
			annotation.setValue(setTopicFullPath(topic) + "");
			connector.getAnnotations().add(annotation);
		}
	}

	/**
	 * @param topic
	 * @return
	 */
	private StringBuilder setTopicFullPath(Topic topic) {
		StringBuilder pubtopicFull = new StringBuilder();
		if (topic.getSubtopicOf().isEmpty()) {
			pubtopicFull.append(topic.getSubtopicOf().get(0).getName() + "/" + topic.getName());
		} else {
			pubtopicFull.append(topic.getName());
		}
		return pubtopicFull;
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
	 * @param thingmlModel
	 * @throws RuntimeException
	 */
	private void saveAsThingML(ThingMLModel thingmlModel) {
		try {
			ThingMLCompiler.saveAsXMI(thingmlModel,
					outputDirectory.getAbsolutePath() + "/" + instanceThing.getName() + "_transformed.thingml");
		} catch (IOException e) {
			log.error(e);
		}
	}

	/**
	 * Set the protocol name to X, if any protocol is defined
	 * 
	 * @param thingmlModel
	 * @param connector
	 */
	private void clearProtocolToX(ThingMLModel thingmlModel, AbstractConnector connector, String protocolName) {
		if (thingmlModel.getProtocols().isEmpty()) {
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
		if (connector.getAnnotations().isEmpty()) {
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
			log.debug("The connector is external.");
			return true;
		}
		log.error("The connector in the configuration must be external.");
		return false;
	}

	/**
	 * Get the ThingML model imported by an InstanceThing
	 * 
	 * @param instanceThing
	 * @return The imported ThingML model
	 */
	private ThingMLModel getThingmlModelFromInstanceThing() {
		String thingPath = getImportedThingPath();
		ThingMLModelLoader thingmlloader = new ThingMLModelLoader();
		File thingMLFile;
		ThingMLModel thingmlModel = null;
		try {
			thingMLFile = NetworkHelper.getFileFromPath(thingPath);
			thingmlModel = thingmlloader.loadModel(thingMLFile);
		} catch (FileNotFoundException e) {
			log.error(e);
		}
		return thingmlModel;
	}

	/**
	 * Get the full path of the imported thing model
	 * 
	 * @param instance
	 * @return The full path
	 */
	private String getImportedThingPath() {
		String thingPath = instanceThing.getThingToInstantiate().getImportPath();
		thingPath = thingPath.replace("\"", "");
		String fullThingPath = cypriotFile.getAbsoluteFile().getParentFile().getAbsolutePath() + File.separator
				+ thingPath;
		log.debug("Full thing path : " + fullThingPath);
		log.debug("Import path : " + thingPath);
		return fullThingPath;
	}

}
