package org.atlanmod.cypriot.generator.network;

import java.io.File;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.generator.commons.Helpers;
import org.atlanmod.cypriot.generator.compilers.GeneratorFactory;
import org.atlanmod.cypriot.generator.models.ThingMLModelLoader;
import org.thingml.compilers.ThingMLCompiler;
import org.thingml.utilities.logging.SystemLogger;
import org.thingml.xtext.thingML.AbstractConnector;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.ExternalConnector;
import org.thingml.xtext.thingML.Protocol;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLModel;

public class InstanceThingGenerator {
	private InstanceThing instanceThing;
	private File cypriotFile;
	private File outputDirectory;
	private GeneratorFactory generatorFactory;

	
	final static Logger log = Logger.getLogger(InstanceThingGenerator.class.getName());
	
	
	public InstanceThingGenerator(File cypriotFile, InstanceThing instanceThing, File outputDirectory, GeneratorFactory generatorFactory) {
		this.cypriotFile = cypriotFile;
		this.instanceThing = instanceThing;
		this.outputDirectory = outputDirectory;
		this.generatorFactory = generatorFactory;
	}
	
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
		ThingMLModel thingmlModel = ThingMLCompiler.flattenModel(getThingmlModelFromInstanceThing());
		log.debug("ThingML thing name : " + thingmlModel.getTypes().get(0).getName());
		File cypriotThingOutputDirectory = getInstanceThingGenDirectory();
		Configuration configuration = getThingMLConfiguration(thingmlModel);
		if (NetworkHelper.isConfigOne(thingmlModel)) {
			if (NetworkHelper.isConnectorOne(configuration)) {
				AbstractConnector connector = getThingMLConnector(configuration);
				if (isConnectorExternal(connector)) {
					clearAnnotationsFromConnector(connector);
					clearProtocolToX(thingmlModel, connector);
					ThingMLCompiler thingmlCompiler = setThingMLCompilerPlugins();
					thingmlCompiler.setOutputDirectory(cypriotThingOutputDirectory);
					SystemLogger loggerThg = new SystemLogger();
					thingmlCompiler.compile(configuration, loggerThg);
				}
			}

		}
	}

	/**
	 * @param thingmlModel
	 * @param connector
	 */
	public void clearProtocolToX(ThingMLModel thingmlModel, AbstractConnector connector) {
		if(thingmlModel.getProtocols().size()>0) {
			log.debug("Protocols are present.");
			thingmlModel.getProtocols().clear();
		}
		Protocol protocol = ThingMLFactory.eINSTANCE.createProtocol();
		protocol.setName("X");
		thingmlModel.getProtocols().add(protocol);
		((ExternalConnector) connector).setProtocol(protocol);
	}

	/**
	 * @param connector
	 */
	public void clearAnnotationsFromConnector(AbstractConnector connector) {
		if(connector.getAnnotations().size()>0) {
			log.debug("Annotations are present in the connector.");
			connector.getAnnotations().clear();
		}
	}

	/**
	 * @param configuration
	 * @return
	 */
	public AbstractConnector getThingMLConnector(Configuration configuration) {
		AbstractConnector connector = configuration.getConnectors().get(0);
		return connector;
	}

	/**
	 * @param thingmlModel
	 * @return
	 */
	public Configuration getThingMLConfiguration(ThingMLModel thingmlModel) {
		Configuration configuration = thingmlModel.getConfigs().get(0);
		return configuration;
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
				Helpers.getContentFromFile(file);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String roles = Helpers.appendStrings(NetworkHelper.getAssignedRolesToThing(instanceThing), ",");
		log.debug("Roles for " + instanceName + " : " + roles);
	}
	

	/**
	 * Set the network and serialization plugins for the ThingML compiler
	 * @return
	 */
	public ThingMLCompiler setThingMLCompilerPlugins() {
		ThingMLCompiler thingmlCompiler = generatorFactory.makeGenerator();
		thingmlCompiler.addNetworkPlugin(generatorFactory.makeNetworkPlugin());
		thingmlCompiler.addSerializationPlugin(generatorFactory.makeSerializationPlugin());
		return thingmlCompiler;
	}

}
