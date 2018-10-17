package org.atlanmod.cypriot.generator.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.atlanmod.cypriot.cyprIoT.Bind;
import org.atlanmod.cypriot.cyprIoT.ChannelToBind;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.NamedElement;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.cyprIoT.Role;
import org.atlanmod.cypriot.cyprIoT.ToBindPubSub;
import org.atlanmod.cypriot.cyprIoT.Topic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.ThingMLModel;

public final class NetworkHelper {
	
	public enum TopicTypes {
		PUBTOPIC, SUBTOPIC
	}

	public enum GeneratorPlatform {
		CPOSIX, JAVA, ARDUINO, JAVASCRIPT
	}

	public enum CommunicationPlatform {
		MQTT, COAP, HTTP
	}

	private NetworkHelper() {}
	
	/**
	 * Get the ID name of any EObject
	 * @param instance
	 * @return The ID name
	 */
	public static String getIdNameOfEobject(EObject eObject) {
		String name =null;
		if (eObject instanceof NamedElement) {
			name = ((NamedElement)eObject).getName();
		}
		return name;
	}

	/**
	 * Utility function to get the file from a path
	 * @param filePathString
	 * @return
	 * @throws FileNotFoundException 
	 */
	public static File getFileFromPath(String filePathString) throws FileNotFoundException {
		File file = new File(filePathString);
		try {
			if(isFileExists(file)) {
				return file;
			}
		} catch (Exception e) {
			throw new FileNotFoundException();
		}
		
		return null;
	}

	/**
	 * Utility function to check if a file exist in the given path
	 * @param instance
	 * @return True if the file exist, False if not
	 */
	public static boolean isFileExists(File file) {
		if(file.exists() && !file.isDirectory()) {
		    return true;
		}
		return false;
	}

	/**
	 * Check whether there is only one configuration in the imported ThingML file
	 * @param thingmlModel
	 * @return True if there is only one configuration, False if not.
	 */
	public static boolean isConfigOne(ThingMLModel thingmlModel) {
		int configCount = thingmlModel.getConfigs().size();
		return isIntOne(configCount);
	}
	
	/**
	 * Check whether there is only one external connector in the imported ThingML file
	 * @param thingmlModel
	 * @return True if there is only one connector, False if not.
	 */
	public static boolean isConnectorOne(Configuration configuration) {
		int configCount = configuration.getConnectors().size();
		return isIntOne(configCount);
	}

	/**
	 * @param configCount
	 * @return
	 */
	public static boolean isIntOne(int configCount) {
		return configCount==1;
	}

	/**
	 * Get the assigned roles to the thing corresponding to the instanceThing
	 * @param instance
	 * @return The roles assigned to the instanceThing
	 */
	public static EList<Role> getAssignedRolesToThing(InstanceThing instance) {
		return instance.getThingToInstantiate().getAssignedRoles();
	}

	/**
	 * @param instanceThing
	 * @param bindPubSubs
	 * @return
	 */
	public static List<Topic> getAllTopicsOfType(InstanceThing instanceThing, List<Bind> bindPubSubs,
			NetworkHelper.TopicTypes topicType) {
		ArrayList<Topic> topics = new ArrayList<Topic>();
	
		for (Bind bind : bindPubSubs) {
			EList<Topic> allTopics = ((ToBindPubSub) bind.getChannelToBind()).getTopics();
			for (Topic topic : allTopics) {
				if (bind.getBindAction().getLiteral().equals("=>") && topicType == NetworkHelper.TopicTypes.PUBTOPIC) {
					topics.add(topic);
				} else if (bind.getBindAction().getLiteral().equals("<=") && topicType == NetworkHelper.TopicTypes.SUBTOPIC) {
					topics.add(topic);
				}
			}
		}
		return topics;
	}

	/**
	 * Find the PubSub binds using ThingInstance as subject
	 * 
	 * @param instanceThing
	 * @param network
	 * @return
	 */
	public static List<Bind> pubSubBindsContainingThingInstances(InstanceThing instanceThing, Network network) {
		ArrayList<Bind> binds = new ArrayList<Bind>();
		for (Bind bind : network.getHasBinds()) {
			ChannelToBind channelToBind = bind.getChannelToBind();
			if (isChannelToBindPubSub(channelToBind) && isInstanceThingInBind(instanceThing, bind)) {
				binds.add(bind);
			}
		}
		return binds;
	}

	/**
	 * @param channelToBind
	 * @return
	 */
	public static boolean isChannelToBindPubSub(ChannelToBind channelToBind) {
		return channelToBind instanceof ToBindPubSub;
	}

	/**
	 * @param instanceThing
	 * @param bind
	 * @return
	 */
	public static boolean isInstanceThingInBind(InstanceThing instanceThing, Bind bind) {
		return bind.getBindsInstanceThing().equals(instanceThing);
	}

}
