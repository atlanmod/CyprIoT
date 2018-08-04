package org.atlanmod.cypriot.generator.networkgenerator;

import java.io.File;
import java.io.FileNotFoundException;

import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.NamedElement;
import org.atlanmod.cypriot.cyprIoT.Role;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.thingml.compilers.ThingMLCompiler;
import org.thingml.compilers.c.posixmt.PosixMTCompiler;
import org.thingml.compilers.spi.NetworkPlugin;
import org.thingml.compilers.spi.SerializationPlugin;
import org.thingml.networkplugins.c.CByteArraySerializerPlugin;
import org.thingml.networkplugins.c.posix.PosixMQTTPlugin;
import org.thingml.xtext.thingML.ThingMLModel;

public class NetworkHelper {

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
			//SimpleNetworkGenerator.log.debug("Thing model file is present");
		    return true;
		}
		//SimpleNetworkGenerator.log.error("Thing model file does not exist");
		return false;
	}

	/**
	 * Check whether there is only one configuration in the imported ThingML file
	 * @param thingmlModel
	 * @return True if there is only one configuration, False if not.
	 */
	public static boolean isConfigCountOne(ThingMLModel thingmlModel) {
		int configCount = thingmlModel.getConfigs().size();
		if(configCount==1) {
			//log.debug("There is only one configuration : Ok !");
			return true;
		}
		//log.debug("There should be only one configuration in the model.");
		return false;
	}

	/**
	 * Set the network and serialization plugins for the ThingML compiler
	 * @return
	 */
	public static ThingMLCompiler setThingMLCompilerPlugins() {
		ThingMLCompiler thingmlCompiler = new PosixMTCompiler();
		//log.debug("Compiler ID : "+thingmlCompiler.getID());
	
		NetworkPlugin networkPlugin = new PosixMQTTPlugin();
		//log.debug("Network Plugin : "+networkPlugin.getName());
	
		SerializationPlugin serializationPlugin = new CByteArraySerializerPlugin();
		//log.debug("Serialization Plugin : "+serializationPlugin.getName());
	
		
		thingmlCompiler.addNetworkPlugin(networkPlugin);
		thingmlCompiler.addSerializationPlugin(serializationPlugin);
		return thingmlCompiler;
	}

	/**
	 * Get the full path of the imported thing model
	 * @param instance
	 * @return The full path
	 */
	public static String getImportedThingPath(InstanceThing instance, File cypriotFile) {
		String thingPath= instance.getTypeThing().getImportPath();
		thingPath = thingPath.replace("\"","");
		String fullThingPath = cypriotFile.getAbsoluteFile().getParentFile().getAbsolutePath()+"/"+thingPath;
		//log.debug("Full thing path : "+fullThingPath);
		//log.debug("Import path : " + thingPath);
		return fullThingPath;
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
