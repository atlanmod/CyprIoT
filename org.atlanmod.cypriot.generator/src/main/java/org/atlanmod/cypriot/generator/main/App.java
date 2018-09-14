package org.atlanmod.cypriot.generator.main;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.commons.Helpers;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;
import org.atlanmod.cypriot.generator.network.SimpleNetworkGenerator;
import org.atlanmod.cypriot.generator.plugins.PluginLoader;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "cypriot", mixinStandardHelpOptions = true)
public class App implements Runnable {

	static final Logger log = LogManager.getLogger(App.class.getName());

	@Option(names = { "-v", "--verbose" }, description = "Verbose mode. Helpful for troubleshooting. "
			+ "Multiple -v options increase the verbosity.")
	private boolean[] verbose = new boolean[0];

	@Option(names = { "-i", "--input" }, paramLabel = "INPUT", description = "The input file for the code generator")
	File cypriotInputFile;

	@Option(names = { "-o", "--output" }, paramLabel = "OUTPUT", description = "The output directory")
	File cypriotOutputDirectory;

	@Option(names = { "-c", "--config" }, paramLabel = "CONFIG", description = "The configuration file")
	File cypriotConfigFile;
	
	public void run() {
		showProjectVersioInConsole();
		handleVerbosity();
		
		loadingPluginsFromConfigFile();		
		SimpleNetworkGenerator networkGenerator = new SimpleNetworkGenerator();
		checkInputFile(networkGenerator);
		checkOutputDirectory(networkGenerator);
		networkGenerator.generate();
	}

	/**
	 * 
	 */
	public void loadingPluginsFromConfigFile() {
		ExecutionContext.pre(App.class.getName(), "plugin");
		PluginLoader pluginLoader = new PluginLoader();
		if (cypriotConfigFile != null) {
			if (cypriotConfigFile.exists()) {
				pluginLoader.setApp(this);
				pluginLoader.setConfigFile(cypriotConfigFile);
				CypriotModelLoader cypriotModelLoader = new CypriotModelLoader();
				CyprIoTModel model = cypriotModelLoader.loadFromFile(cypriotInputFile);
				pluginLoader.setModel(model);
				File cypriotOutputDirectory = new File(cypriotInputFile.getParentFile().getAbsolutePath() + "/../output");
				pluginLoader.setOutputDirectory(cypriotOutputDirectory);
				pluginLoader.load();
			} else {
				log.error("Defined configuration file not found");
			}
		} else {
			log.info("No plugin found");
		}
		ExecutionContext.post();
	}

	/**
	 * Show the version of Cypriot in the console
	 */
	public void showProjectVersioInConsole() {
		System.out.println("CyprIoT v" + Helpers.getProjectVersionFromMaven()); 
	}

	/**
	 * Handles the verbosity of the console
	 */
	public void handleVerbosity() {
		if (verbose.length > 0) {
			log.info("Verbose mode enabled");
			log.debug("Processing " + cypriotInputFile.getName() + " file...");
		}
		if (verbose.length > 1) {
			log.debug("File absolute path : " + cypriotInputFile.getAbsolutePath());
		}
	}

	/**
	 * Check whether the output directory is valid before setting it into networkGenerator
	 * @param networkGenerator
	 */
	public void checkOutputDirectory(SimpleNetworkGenerator networkGenerator) {
		if (cypriotOutputDirectory != null) {
			if (cypriotOutputDirectory.exists()) {
				networkGenerator.setCypriotOutputDirectory(cypriotOutputDirectory);
			} else {
				log.error("Defined folder not found");
			}
		} else {
			cypriotOutputDirectory = new File(cypriotInputFile.getParentFile().getAbsolutePath() + "/..");
			networkGenerator.setCypriotOutputDirectory(cypriotOutputDirectory);
		}

		log.debug("Generation folder : " + cypriotOutputDirectory);
	}

	/**
	 * Check whether the input file is valid before setting it into networkGenerator
	 * @param networkGenerator
	 */
	public void checkInputFile(SimpleNetworkGenerator networkGenerator) {
		if (cypriotInputFile != null && cypriotInputFile.exists()) {
				networkGenerator.setCypriotFile(cypriotInputFile);
		} else {
			if (cypriotInputFile != null) {
				log.error("File "+cypriotInputFile.getPath()+" not found");
			} else {
				log.error("File cypriotInputFile is null");
			}
		}
	}

	public static void main(String[] args) {
		ExecutionContext.pre(App.class.getName(), "main");
		CommandLine.run(new App(), System.out, args);
		ExecutionContext.post();

	}

}
