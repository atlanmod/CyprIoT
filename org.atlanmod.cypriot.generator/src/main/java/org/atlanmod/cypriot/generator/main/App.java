package org.atlanmod.cypriot.generator.main;

import java.io.File;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.generator.utilities.Helpers;
import org.atlanmod.cypriot.generator.utilities.NetworkHelper;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "cypriot", mixinStandardHelpOptions = true)
public class App implements Runnable {
	
	static final Logger log = LogManager.getLogger(App.class.getName());
	@Option(names = { "-i", "--input" }, required = false, paramLabel = "INPUT", description = "The input file for the code generator")
	File cypriotInputFile;

	@Option(names = { "-it", "--inputTh" }, required = false, paramLabel = "INPUT", description = "The input file for the code generator")
	File thingMLInputFile;
	
	@Option(names = { "-o", "--output" }, required = false, paramLabel = "OUTPUT", description = "The output directory")
	File cypriotOutputDirectory;

	@Option(names = { "-c", "--config" }, required = false, paramLabel = "CONFIG", description = "The configuration file")
	File cypriotConfigFile;
	
	@Option(names = { "-d", "--disable-plugins" }, description = "The configuration file")
    boolean disablePlugin;

	public void run() {
		NetworkHelper.showProjectVersioInConsole();
		
//		String log4jConfigFile = System.getProperty("user.dir")
//	            + File.separator + "log4j.properties";
//		PropertyConfigurator.configure(log4jConfigFile);
		
		if(cypriotOutputDirectory==null) {
			cypriotOutputDirectory = new File (cypriotInputFile.getParent()+File.separator+"output.xmi");
			log.debug("cypriotOutputDirectory : "+cypriotOutputDirectory);
		}
			
		log.debug("thingMLInputFile.getPath() : "+ thingMLInputFile.getPath());

		log.debug("cypriotInputFile.getPath() : "+ cypriotInputFile.getPath());
		log.debug("thingMLInputFile.getPath() : "+ thingMLInputFile.getPath());
		log.debug("cypriotOutputDirectory.getPath() : "+ cypriotOutputDirectory.getPath());
		
		Helpers.transform(cypriotInputFile.getPath(), thingMLInputFile.getPath(), cypriotOutputDirectory.getPath());
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
