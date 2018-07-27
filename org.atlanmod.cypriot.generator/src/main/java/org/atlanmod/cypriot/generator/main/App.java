package org.atlanmod.cypriot.generator.main;

import java.io.File;

import org.atlanmod.cypriot.generator.commons.Utilities;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "example", mixinStandardHelpOptions = true, version = "Picocli example 3.0")
public class App implements Runnable{
	@Option(names = { "-v", "--verbose" }, description = "Verbose mode. Helpful for troubleshooting. " +
            "Multiple -v options increase the verbosity.")
	private boolean[] verbose = new boolean[0];
	
	@Option(names = { "-i", "--input" }, paramLabel = "INPUT", description = "The input file for the code generator")
    File cypriotInputFile;
	
	public void run() {
		System.out.println("CyprIoT v"+Utilities.getProjectVersion());
        if (verbose.length > 0) {
            System.out.println("Processing "+ cypriotInputFile.getName() + " file...");
        }
        if (verbose.length > 1) {
        	cypriotInputFile.getAbsolutePath();
        }
    }
	
	public static void main(String[] args) {
		CommandLine.run(new App(), System.out, args);
	}
}
