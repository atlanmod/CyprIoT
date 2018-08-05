package org.atlanmod.cypriot.generator.main;

import java.io.File;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.generator.commons.Helpers;
import org.atlanmod.cypriot.generator.network.SimpleNetworkGenerator;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "cypriot", mixinStandardHelpOptions = true)
public class App implements Runnable {

	static final Logger log = Logger.getLogger(App.class.getName());

	@Option(names = { "-v", "--verbose" }, description = "Verbose mode. Helpful for troubleshooting. "
			+ "Multiple -v options increase the verbosity.")
	private boolean[] verbose = new boolean[0];

	@Option(names = { "-i", "--input" }, paramLabel = "INPUT", description = "The input file for the code generator")
	File cypriotInputFile;
	
	@Option(names = { "-o", "--output" }, paramLabel = "OUTPUT", description = "The output directory")
	File cypriotOutputDirectory;

	public void run() {
		System.out.println("CyprIoT v" + Helpers.getProjectVersionFromMaven());
		if (verbose.length > 0) {
			log.info("Verbose mode enabled");
			log.debug("Processing " + cypriotInputFile.getName() + " file...");
		}
		if (verbose.length > 1) {
			log.debug("File absolute path : "+cypriotInputFile.getAbsolutePath());
		}
		SimpleNetworkGenerator networkGenerator = new SimpleNetworkGenerator();
		networkGenerator.setCypriotFile(cypriotInputFile);
		
		if(cypriotOutputDirectory!=null) {
			networkGenerator.setCypriotOutputDirectory(cypriotOutputDirectory);
		} else {
			cypriotOutputDirectory = new File(cypriotInputFile.getParentFile().getAbsolutePath()+"/gen");
			networkGenerator.setCypriotOutputDirectory(cypriotOutputDirectory);
		}
		
		log.debug("Generation folder : " +cypriotOutputDirectory);
		networkGenerator.generate();

	}

	public static void main(String[] args) {
		ExecutionContext.pre(App.class.getName(), "main");
		CommandLine.run(new App(), System.out, args);
		ExecutionContext.post();
	}

}
