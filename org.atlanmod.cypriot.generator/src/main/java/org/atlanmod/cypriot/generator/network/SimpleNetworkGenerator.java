package org.atlanmod.cypriot.generator.network;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.BindPTP;
import org.atlanmod.cypriot.cyprIoT.BindPubSub;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.cyprIoT.Topic;
import org.atlanmod.cypriot.generator.commons.Helpers;
import org.atlanmod.cypriot.generator.compilers.CPosixGenerator;
import org.atlanmod.cypriot.generator.compilers.GeneratorFactory;
import org.atlanmod.cypriot.generator.compilers.JavaGenerator;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.SaveOptions;

/**
 * A simple generator that generates a description of the network in human
 * readable format
 * 
 * @author imberium
 *
 */
/**
 * @author imad
 *
 */
public class SimpleNetworkGenerator {

	public enum TopicTypes {
	    PUBTOPIC,
	    SUBTOPIC
	}
	
	public enum GeneratorPlatform {
	    CPOSIX,
	    JAVA,
	    ARDUINO,
	    JAVASCRIPT
	}
	
	public enum CommunicationPlatform {
	    MQTT,
	    CoAP,
	    HTTP
	}
	
	static final Logger log = LogManager.getLogger(SimpleNetworkGenerator.class.getName());

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
	 * Generate code for every instanceThing in the network
	 * 
	 * @param network
	 */
	public void generateForAllInstanceThings(Network network) {
		for (InstanceThing instanceThing : getInstanceThingsInNetwork(network)) {
			ArrayList<BindPubSub> pubSubBindsContainingThingInstances = pubSubBindsContainingThingInstances(instanceThing, network);
						
			ArrayList<Topic> pubTopics = getAllTopicsOfType(instanceThing, pubSubBindsContainingThingInstances,TopicTypes.PUBTOPIC);
			ArrayList<Topic> subTopics = getAllTopicsOfType(instanceThing, pubSubBindsContainingThingInstances,TopicTypes.SUBTOPIC);
			
			generateCodeForInstanceThing(instanceThing,pubTopics, subTopics);
		}
	}

	/**
	 * Generate code for a given instanceThing
	 * @param instanceThing
	 */
	public void generateCodeForInstanceThing(InstanceThing instanceThing, ArrayList<Topic> pubTopics,ArrayList<Topic> subTopics) {
		String platform = instanceThing.getPlatform();
		log.debug("Target platform : " + platform);
		GeneratorPlatform generatorPlatform = mapPlatformToEnum(platform);
		GeneratorFactory generatorFactory = getGeneratorFactory(generatorPlatform);
		InstanceThingGenerator instanceGen = new InstanceThingGenerator(cypriotFile,instanceThing,cypriotOutputDirectory,generatorFactory);
		instanceGen.setPubTopics(pubTopics);
		instanceGen.setSubTopics(subTopics);
		instanceGen.generate();
	}

	/**
	 * @param instanceThing
	 * @param bindPubSubs
	 * @return
	 */
	public ArrayList<Topic> getAllTopicsOfType(InstanceThing instanceThing,
			ArrayList<BindPubSub> bindPubSubs, TopicTypes topicType) {
		ArrayList<Topic> topics = new ArrayList<Topic>();

		for (BindPubSub bindPubSub : bindPubSubs) {
			EList<Topic> allTopics = bindPubSub.getTopics();
			for (Topic topic : allTopics) {
				if (bindPubSub.getReadOrWrite().equals("=>") && topicType==TopicTypes.PUBTOPIC) {
					log.debug("ThingInstance " + instanceThing.getName() + " publish to " + topic.getName());
					topics.add(topic);
				} else if(bindPubSub.getReadOrWrite().equals("<=") && topicType==TopicTypes.SUBTOPIC){
					log.debug("ThingInstance " + instanceThing.getName() + " publish to " + topic.getName());
					topics.add(topic);
				}
			}				
		}
		return topics;
	}
	
	public CommunicationPlatform mapProtocolToEnum(String platform) {
		if(platform.equals("MQTT")) {
			return CommunicationPlatform.MQTT;
		} else if (platform.equals("COAP")) {
			return CommunicationPlatform.CoAP;
		} else if (platform.equals("HTTP")) {
			return CommunicationPlatform.HTTP;
		}
		return null;
	}
	
	public GeneratorPlatform mapPlatformToEnum(String platform) {
		if(platform.equals("@posix")) {
			return GeneratorPlatform.CPOSIX;
		} else if (platform.equals("@java")) {
			return GeneratorPlatform.JAVA;
		} else if (platform.equals("@arduino")) {
			return GeneratorPlatform.ARDUINO;
		} else if (platform.equals("@javascript")) {
			return GeneratorPlatform.JAVASCRIPT;
		}
		return null;
	}
	
	/**
	 * Get the factory corresponding to a given platform
	 * @param generatorPlatform
	 * @return	
	 */
	public GeneratorFactory getGeneratorFactory(GeneratorPlatform generatorPlatform) {
	
		switch (generatorPlatform) {
		case CPOSIX:
			return new CPosixGenerator();
		case JAVA:
			return new JavaGenerator();
		default:
			return null;
		}
	}

	/**
	 * Find the ReqRep binds using ThingInstance as subject
	 * 
	 * @param instanceThing
	 * @param network
	 * @return
	 */
	public ArrayList<BindPTP> reqRepBindsContainingThingInstances(InstanceThing instanceThing, Network network) {
		ArrayList<BindPTP> binds = new ArrayList<BindPTP>();
		for (BindPTP bindReqRep : network.getBindPTP()) {
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
		//saveCypriotModelAsXMI(model);
		allNetworks = model.getNetworks();
	}

	/**
	 * Save the model as an XMI
	 * @param model
	 */
	public void saveCypriotModelAsXMI(CyprIoTModel model) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.createResource(URI.createFileURI(cypriotOutputDirectory.getAbsolutePath() + "/output/xmi/cypriot.xmi"));

		res.getContents().add(model);
		EcoreUtil.resolveAll(res);

		SaveOptions opt = SaveOptions.newBuilder().format().noValidation().getOptions();
		try {
			res.save(opt.toOptionsMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
