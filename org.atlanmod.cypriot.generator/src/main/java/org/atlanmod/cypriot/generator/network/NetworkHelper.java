package org.atlanmod.cypriot.generator.network;

import java.io.File;
import java.io.FileNotFoundException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.NamedElement;
import org.atlanmod.cypriot.cyprIoT.Role;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.ThingMLModel;

public class NetworkHelper {
	
	final static Logger log = LogManager.getLogger(NetworkHelper.class.getName());

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
			log.debug("Thing model file is present");
		    return true;
		}
		log.error("Thing model file does not exist");
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
		return instance.getTypeThing().getAssignedRoles();
	}

}
