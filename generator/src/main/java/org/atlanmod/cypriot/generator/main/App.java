package org.atlanmod.cypriot.generator.main;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyutil.Helpers;
import org.atlanmod.cypriot.generator.plugins.PluginLoader;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "cypriot", mixinStandardHelpOptions = true)
public class App implements Runnable {
	
    public static final String CYPRIOT_FILE ="../generator/src/test/resources/1_Platform_1Topic_Scenarios/0_HelloWorld/main.cy" ; 
    public static final boolean enforcing = false;
    public static final boolean compiling = true;
    public static final String CONFIG_FILE ="../generator/config.cfg" ;   
    public static final boolean experimentMode = true;
    
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
			cypriotOutputDirectory = new File (cypriotInputFile.getParent() + File.separator + "network-gen" + File.separator);
			log.debug("Output Directory : "+cypriotOutputDirectory);
		}

		if(experimentMode) {
			Experiment.make();
		} else {
			log.debug("CyprIoT Input File Path : "+ cypriotInputFile.getPath());
			TransformationHelper transformationHelper = new TransformationHelper();
			transformationHelper.transform(cypriotInputFile,cypriotOutputDirectory,enforcing, compiling);
			
			CyprIoTModel model = Helpers.loadModelFromFile(cypriotInputFile, CyprIoTModel.class);
			
			// Plugin Loading
			if(!disablePlugin) {
				PluginLoader pluginLoader = new PluginLoader();
				pluginLoader.setConfigFile(cypriotConfigFile);
				pluginLoader.setModel(model);
				pluginLoader.setOutputDirectory(cypriotOutputDirectory);
				pluginLoader.load();
			}
		}
		
	}

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		CommandLine.run(new App(), System.out, args);
		long endTime = System.nanoTime();
		long durationInNano = (endTime - startTime);
		long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);
		double executionTime = durationInMillis / 1000.0;
		log.info("Execution time : "+executionTime+"s");
	}
}
