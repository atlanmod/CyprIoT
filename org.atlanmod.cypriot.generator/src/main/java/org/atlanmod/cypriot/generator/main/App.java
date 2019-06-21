package org.atlanmod.cypriot.generator.main;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.CypriotStandaloneSetup;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyutil.Helpers;
import org.atlanmod.cypriot.generator.network.NetworkGenerator;
import org.atlanmod.cypriot.generator.plugins.PluginLoader;
import org.atlanmod.cypriot.generator.transform.BindingTransformation;
import org.atlanmod.cypriot.generator.transform.PolicyEnforcementTransformation;
import org.atlanmod.cypriot.generator.utilities.NetworkHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.thingml.xtext.ThingMLStandaloneSetup;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "cypriot", mixinStandardHelpOptions = true)
public class App implements Runnable {

	static final Logger log = LogManager.getLogger(App.class.getName());

	@Option(names = { "-i", "--input" }, required = false, paramLabel = "INPUT", description = "The input file for the code generator")
	File cypriotInputFile;

	@Option(names = { "-o", "--output" }, required = false, paramLabel = "OUTPUT", description = "The output directory")
	File cypriotOutputDirectory;

	@Option(names = { "-c", "--config" }, required = false, paramLabel = "CONFIG", description = "The configuration file")
	File cypriotConfigFile;
	
	@Option(names = { "-d", "--disable-plugins" }, description = "The configuration file")
    boolean disablePlugin;

	public void run() {
			
		NetworkHelper.showProjectVersioInConsole();
		/*
		// Network Model Loading
		CyprIoTModel model = Helpers.loadModelFromFile(cypriotInputFile, CyprIoTModel.class);
		
		// Plugin Loading
		if(!disablePlugin) {
			PluginLoader pluginLoader = new PluginLoader();
			pluginLoader.setConfigFile(cypriotConfigFile);
			pluginLoader.setModel(model);
			pluginLoader.setOutputDirectory(cypriotOutputDirectory);
			pluginLoader.load();

		}
		// Network Generation
		NetworkGenerator networkGenerator = new NetworkGenerator(model, cypriotOutputDirectory);
		networkGenerator.setBinding(new BindingTransformation());
		networkGenerator.setEnfocePolicy(new PolicyEnforcementTransformation());
		networkGenerator.generate();
		*/
	}

	public static void main(String[] args) {
		CommandLine.run(new App(), System.out, args);
	}

}
