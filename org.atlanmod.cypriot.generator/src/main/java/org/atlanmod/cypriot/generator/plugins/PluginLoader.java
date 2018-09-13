package org.atlanmod.cypriot.generator.plugins;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.atlanmod.cypriot.generator.commons.Helpers;
import org.atlanmod.cypriot.generator.main.App;

public class PluginLoader {
	private File configFile;
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
				loadPlugin(pluginClassName);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	private void loadPlugin(String pluginClassName) throws Exception {
		Class<?> pluginClass = getClass().getClassLoader().loadClass(pluginClassName);
		Plugin instance = (Plugin) pluginClass.newInstance();
		instance.attach(app);
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
}
