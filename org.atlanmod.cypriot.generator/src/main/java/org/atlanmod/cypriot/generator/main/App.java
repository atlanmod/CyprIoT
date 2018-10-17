package org.atlanmod.cypriot.generator.main;

import java.io.File;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;
import org.atlanmod.cypriot.generator.models.ModelLoader;
import org.atlanmod.cypriot.generator.network.NetworkGenerator;
import org.atlanmod.cypriot.generator.plugins.PluginLoader;
import org.atlanmod.cypriot.generator.utilities.Helpers;
import org.thingml.xtext.thingML.ThingMLModel;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "cypriot", mixinStandardHelpOptions = true)
public class App implements Runnable {

	static final Logger log = LogManager.getLogger(App.class.getName());

	@Option(names = { "-i", "--input" }, required = true, paramLabel = "INPUT", description = "The input file for the code generator")
	File cypriotInputFile;

	@Option(names = { "-o", "--output" }, required = true, paramLabel = "OUTPUT", description = "The output directory")
	File cypriotOutputDirectory;

	@Option(names = { "-c", "--config" }, required = true, paramLabel = "CONFIG", description = "The configuration file")
	File cypriotConfigFile;

	public void run() {
		Helpers.showProjectVersioInConsole();
		
		// Network Model Loading
		ModelLoader cypriotModelLoader = new CypriotModelLoader();
		CyprIoTModel model = cypriotModelLoader.loadModel(cypriotInputFile);
		
		// Plugin Loading
		PluginLoader pluginLoader = new PluginLoader();
		pluginLoader.setConfigFile(cypriotConfigFile);
		pluginLoader.setModel(model);
		pluginLoader.setOutputDirectory(cypriotOutputDirectory);
		pluginLoader.load();

		// Network Generation
		NetworkGenerator networkGenerator = new NetworkGenerator(model,cypriotOutputDirectory);
		networkGenerator.generate();
		for (Map.Entry<String, ThingMLModel> transformedThingML : networkGenerator.getTransformedModels().entrySet()) {
			Helpers.saveAsThingML(transformedThingML.getValue(), cypriotOutputDirectory+File.separator+transformedThingML.getKey()+"_transformed.thingml");
		}

	}

	public static void main(String[] args) {
		CommandLine.run(new App(), System.out, args);
	}

}
