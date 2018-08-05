package org.atlanmod.cypriot.generator.networkgenerator;

import java.io.File;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.generator.commons.Utilities;
import org.atlanmod.cypriot.generator.models.ThingMLModelLoader;
import org.thingml.compilers.ThingMLCompiler;
import org.thingml.utilities.logging.SystemLogger;
import org.thingml.xtext.thingML.AbstractConnector;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.ExternalConnector;
import org.thingml.xtext.thingML.ThingMLModel;

public class InstanceThingGenerator {
	InstanceThing instanceThing;
	private File cypriotFile;
	File outputDirectory;

	final static Logger log = Logger.getLogger(InstanceThingGenerator.class.getName());
	
	public void generate() {
		generateUsingThingMLGenerator();
		debugInstanceThing();
	}

	/**
	 * Generate code for an instanceThing using ThingML compiler
	 * 
	 * @param instanceThing
	 */
	public void generateUsingThingMLGenerator() {
		ThingMLModel thingmlModel = getThingmlModelFromInstanceThing();
		log.debug("ThingML thing name : " + thingmlModel.getTypes().get(0).getName());
		File cypriotThingOutputDirectory = getInstanceThingGenDirectory();

		if (NetworkHelper.isConfigOne(thingmlModel)) {
			Configuration configuration = thingmlModel.getConfigs().get(0);
			if (NetworkHelper.isConnectorOne(configuration)) {
				AbstractConnector connector = configuration.getConnectors().get(0);
				if (isConnectorExternal(connector)) {
					ThingMLCompiler thingmlCompiler = NetworkHelper.setThingMLCompilerPlugins();
					thingmlCompiler.setOutputDirectory(cypriotThingOutputDirectory);
					SystemLogger loggerThg = new SystemLogger();
					thingmlCompiler.compile(configuration, loggerThg);
				}
			}

		}
	}

	/**
	 * @param connector
	 * @return
	 */
	public boolean isConnectorExternal(AbstractConnector connector) {
		if (connector instanceof ExternalConnector) {
			log.debug("The connector is external.");
			return true;
		}
		log.error("The connector in the configuration must be external.");
		return false;
	}

	/**
	 * Get the directory of generation for a single thing
	 * 
	 * @param instanceThing
	 * @return
	 */
	public File getInstanceThingGenDirectory() {
		File cypriotThingOutputDirectory = new File(
				outputDirectory.getAbsolutePath() + "/" + NetworkHelper.getIdNameOfEobject(instanceThing));
		return cypriotThingOutputDirectory;
	}

	/**
	 * Get the ThingML model imported by an InstanceThing
	 * 
	 * @param instanceThing
	 * @return The imported ThingML model
	 */
	public ThingMLModel getThingmlModelFromInstanceThing() {
		String thingPath = getImportedThingPath();
		ThingMLModelLoader thingmlloader = new ThingMLModelLoader();
		File thingMLFile;
		ThingMLModel thingmlModel = null;
		try {
			thingMLFile = NetworkHelper.getFileFromPath(thingPath);
			thingmlModel = thingmlloader.loadFromFile(thingMLFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return thingmlModel;
	}

	/**
	 * Get the full path of the imported thing model
	 * 
	 * @param instance
	 * @return The full path
	 */
	public String getImportedThingPath() {
		String thingPath = instanceThing.getTypeThing().getImportPath();
		thingPath = thingPath.replace("\"", "");
		String fullThingPath = cypriotFile.getAbsoluteFile().getParentFile().getAbsolutePath() + "/" + thingPath;
		log.debug("Full thing path : "+fullThingPath);
		log.debug("Import path : " + thingPath);
		return fullThingPath;
	}

	/**
	 * Debug trace for all the instanceThings in the network
	 * 
	 * @param network
	 */
	private void debugInstanceThing() {
		String instanceName = NetworkHelper.getIdNameOfEobject(instanceThing);
		log.debug("Thing Name : " + instanceName + ", number : " + instanceThing.getNumberOfInstances());
		String fullThingPath = getImportedThingPath();

		File file;
		try {
			file = NetworkHelper.getFileFromPath(fullThingPath);
			if (file != null) {
				Utilities.getContentFromFile(file);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String roles = Utilities.appendStrings(NetworkHelper.getAssignedRolesToThing(instanceThing), ",");
		log.debug("Roles for " + instanceName + " : " + roles);
	}

	/**
	 * @return the instanceThing
	 */
	public InstanceThing getInstanceThing() {
		return instanceThing;
	}

	/**
	 * @return the cypriotFile
	 */
	public File getCypriotFile() {
		return cypriotFile;
	}

	/**
	 * @return the outputDirectory
	 */
	public File getOutputDirectory() {
		return outputDirectory;
	}

	/**
	 * @param instanceThing the instanceThing to set
	 */
	public void setInstanceThing(InstanceThing instanceThing) {
		this.instanceThing = instanceThing;
	}

	/**
	 * @param cypriotFile the cypriotFile to set
	 */
	public void setCypriotFile(File cypriotFile) {
		this.cypriotFile = cypriotFile;
	}

	/**
	 * @param outputDirectory the outputDirectory to set
	 */
	public void setOutputDirectory(File outputDirectory) {
		this.outputDirectory = outputDirectory;
	}

}
