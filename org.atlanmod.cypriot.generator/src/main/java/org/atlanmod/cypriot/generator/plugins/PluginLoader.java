package org.atlanmod.cypriot.generator.plugins;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.main.App;
import org.atlanmod.cypriot.generator.utilities.Helpers;

public class PluginLoader {
	private File configFile;
	private File outputDirectory;
	private CyprIoTModel model;
	private App app;

	public PluginLoader() {
	}
	
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
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}
	
	private void loadPlugin(String pluginClassName) throws Exception {
		Class<?> pluginClass = getClass().getClassLoader().loadClass(pluginClassName);
		Plugin instance = (Plugin) pluginClass.newInstance();
		instance.attach(app);
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
	 * @return the app
	 */
	public App getApp() {
		return app;
	}

	/**
	 * @param app the app to set
	 */
	public void setApp(App app) {
		this.app = app;
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
