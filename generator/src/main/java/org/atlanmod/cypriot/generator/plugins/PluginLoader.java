package org.atlanmod.cypriot.generator.plugins;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyutil.Helpers;

public class PluginLoader {
	private File configFile;
	private File outputDirectory;
	private CyprIoTModel model;
	HashSet<Plugin> loaderPlugins = new HashSet<Plugin>();
	static final Logger log = LogManager.getLogger(PluginLoader.class.getName());

	public void load() {
		Properties properties = new Properties();
		String pluginClassName;
		
		try {
			properties.load(new StringReader(Helpers.getContentFromFile(configFile)));
			pluginClassName = properties.getProperty("classes");
			List<String> classesList = Arrays.asList(pluginClassName.split(","));
			for (String className : classesList) {
				loadPlugin(className);
			}
			StringBuilder loadedPlugins = new StringBuilder();
			for (Plugin plugin : loaderPlugins) {
				loadedPlugins.append(plugin.getID()+",");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		log.info("All plugins loaded.");
	}
	
	private void loadPlugin(String pluginClassName) throws Exception {
		Class<?> pluginClass = getClass().getClassLoader().loadClass(pluginClassName);
		Plugin instance = (Plugin) pluginClass.newInstance();
		loaderPlugins.add(instance);
		instance.attach(log);
		instance.generate(model, outputDirectory);
	}

	/**
	 * @return the configFile
	 */
	public File getConfigFile() {
		return configFile;
	}

	/**
	 * @param configFile the configFile to set
	 */
	public void setConfigFile(File configFile) {
		this.configFile = configFile;
	}

	/**
	 * @return the model
	 */
	public CyprIoTModel getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(CyprIoTModel model) {
		this.model = model;
	}

	/**
	 * @return the outputDirectory
	 */
	public File getOutputDirectory() {
		return outputDirectory;
	}

	/**
	 * @param outputDirectory the outputDirectory to set
	 */
	public void setOutputDirectory(File outputDirectory) {
		this.outputDirectory = outputDirectory;
	}
}
