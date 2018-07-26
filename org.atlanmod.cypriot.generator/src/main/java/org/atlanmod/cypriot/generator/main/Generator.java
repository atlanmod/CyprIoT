package org.atlanmod.cypriot.generator.main;

import java.io.File;
import java.io.IOException;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class Generator {
	@Parameter(names = { "--source", "-s" }, description = "A .cy file containing a network model")
	String source;

	public static void showHelp(JCommander jcom) {

		System.out.println("CyprIoT v" + Utils.getProjectVersion());

		jcom.usage();
	}

	public static void main(String[] args) {
		Generator gen = new Generator();
		JCommander jcom = new JCommander(gen, args);
		if (gen.source == null) {
			showHelp(jcom);
			return;
		}
		
		File input = null;
		if (gen.source != null) {
			input = new File(gen.source);
			try {
				String content = Files.toString(input, Charsets.UTF_8);
				//Utils.loadCypriotModel(content);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Error in source file");
			return;
		}
		System.out.println("File : "+input.getAbsoluteFile().getParentFile());
	}
}
