package org.atlanmod.cypriot.generator.main;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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
	
	public static final String CYPRIOT_FILE = "../examples/smarthome/main.cy";
	//public static final String CYPRIOT_FILE = "../generator/src/test/resources/1_Platform_1Topic_Scenarios/1_TwoThings/main.cy";
	public static final boolean isTrigger = true;
	public static final boolean isBridge = true;
	public static final String CONFIG_FILE = "../generator/config.cfg";
	public static final boolean experimentMode = false;
	ExecutorService executorService = Executors.newCachedThreadPool();
	static final Logger log = LogManager.getLogger(App.class.getName());
	@Option(names = { "-i",
			"--input" }, required = false, paramLabel = "INPUT", description = "The input file for the code generator")
	File cypriotInputFile;

	@Option(names = { "-o", "--output" }, required = false, paramLabel = "OUTPUT", description = "The output directory")
	File cypriotOutputDirectory;

	@Option(names = { "-c",
			"--config" }, required = false, paramLabel = "CONFIG", description = "The configuration file")
	File cypriotConfigFile;
	
	@Option(names = { "-g", "--generate" }, description = "Generate code")
	boolean isGenerate=false;
	
	@Option(names = { "-e", "--enforce" }, description = "Enforce communication control rules")
	boolean isEnforcing=true;
	
	@Option(names = { "-d", "--disable-plugins" }, description = "Disable plugins")
	boolean isPluginEnabled=true;

	public void run() {
		NetworkHelper.showProjectVersioInConsole();
		if (!CYPRIOT_FILE.equals(""))
			cypriotInputFile = new File(CYPRIOT_FILE);
		if (!CONFIG_FILE.equals(""))
			cypriotConfigFile = new File(CONFIG_FILE);
		CyprIoTModel cyprIoTmodel = Helpers.loadModelFromFile(cypriotInputFile, CyprIoTModel.class);
		String networkName = cyprIoTmodel.getSpecifyNetworks().get(0).getName();
		if (cypriotOutputDirectory == null) {
			cypriotOutputDirectory = new File(
					cypriotInputFile.getParent() + File.separator + networkName + File.separator);
			log.debug("Output Directory : " + cypriotOutputDirectory);
		}

		if (experimentMode) {
			Experiment.make(executorService);
		} else {
			log.debug("CyprIoT Input File Path : " + cypriotInputFile.getPath());
			M2MHelper transformationHelper = new M2MHelper();
			transformationHelper.transform(cypriotInputFile, cypriotOutputDirectory,isEnforcing,isTrigger, isBridge, isGenerate,executorService);

			// Plugin Loading
			if (isPluginEnabled) {
				PluginLoader pluginLoader = new PluginLoader();
				pluginLoader.setConfigFile(cypriotConfigFile);
				pluginLoader.setModel(cyprIoTmodel);
				pluginLoader.setOutputDirectory(cypriotOutputDirectory);
				pluginLoader.load(executorService);
			}
		}
		executorService.shutdown();
		try {
			executorService.awaitTermination(5, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		CommandLine.run(new App(), System.out, args);
		long endTime = System.nanoTime();
		long durationInNano = (endTime - startTime);
		long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);
		double executionTime = durationInMillis / 1000.0;
		log.info("Execution time : " + executionTime + "s");
	}
}