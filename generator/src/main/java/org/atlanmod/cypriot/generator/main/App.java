package org.atlanmod.cypriot.generator.main;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyutil.Helpers;
import org.atlanmod.cypriot.generator.plugins.PluginLoader;
import org.atlanmod.cypriot.generator.utilities.NetworkHelper;
import org.atlanmod.cypriot.generator.utilities.TransformationHelper;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "cypriot", mixinStandardHelpOptions = true)
public class App implements Runnable {
	
    public static final String CYPRIOT_FILE ="../generator/src/test/resources/4_FourThings/main.cy" ;   
    public static final String CONFIG_FILE ="../generator/config.cfg" ;   

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
		if(!CYPRIOT_FILE.equals("")) cypriotInputFile=new File(CYPRIOT_FILE);
		if(!CONFIG_FILE.equals("")) cypriotConfigFile=new File(CONFIG_FILE);
		
		if(cypriotOutputDirectory==null) {
			cypriotOutputDirectory = new File (cypriotInputFile.getParent()+File.separator+"network-gen"+File.separator+"tr_thin.thingml");
			log.debug("Output Directory : "+cypriotOutputDirectory);
		}
			
		log.debug("CyprIoT Input File Path : "+ cypriotInputFile.getPath());
		
		TransformationHelper transformationHelper = new TransformationHelper();
		transformationHelper.transform(cypriotInputFile);
		
		CyprIoTModel model = Helpers.loadModelFromFile(cypriotInputFile, CyprIoTModel.class);
		
		// Plugin Loading
		if(!disablePlugin) {
			PluginLoader pluginLoader = new PluginLoader();
			pluginLoader.setConfigFile(cypriotConfigFile);
			pluginLoader.setModel(model);
			pluginLoader.setOutputDirectory(new File(cypriotOutputDirectory.getParent()+File.separator+"network-gen"));
			pluginLoader.load();
		}
		/*
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
