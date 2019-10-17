package org.atlanmod.cypriot.generator.plugins.installed;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.Bind;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.generator.plugins.Plugin;

public class SetupScriptPlugin implements Plugin {

	@Override
	public void attach(Logger log) {
		log.info("Loading "+getID()+" plugin...");
	}

	@Override
	public String getID() {
		return "setupScript";
	}

	@Override
	public CyprIoTModel initiliaze() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CyprIoTModel transform(CyprIoTModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void generate(CyprIoTModel cyprIoTmodel, File outputDirectory) {
		try {
			String filename = outputDirectory+ File.separator + "setup.sh";
			new File(filename);
			FileWriter fw = new FileWriter(filename, true);
			fw.write("#!/bin/bash \n");
			fw.write("mkdir execs\n");
			for (Bind bind : cyprIoTmodel.getSpecifyNetworks().get(0).getHasBinds()) {
				InstanceThing instance = bind.getBindsInstanceThing();
				String instanceName = instance.getName();
				String targetPlatform = instance.getTypeThing().getTargetedPlatform().getLiteral().toLowerCase();
				String outputMakeDirectory = outputDirectory.getAbsolutePath()+ File.separator +"devices"+ File.separator
						+ instanceName + File.separator + targetPlatform;

				try {
					if(targetPlatform.equals("posix") || targetPlatform.equals("posixmt")) {
						fw.write("make -C " + outputMakeDirectory+"\n");
						fw.write("cp " + outputMakeDirectory+File.separator+instanceName+"_Cfg execs\n");
					} else if (targetPlatform.equals("java")) {
						fw.write("mvn -f " + outputMakeDirectory+" clean install\n");
						fw.write("cp " + outputMakeDirectory+File.separator+"target"+File.separator+instanceName+"_Cfg-1.0.0-jar-with-dependencies.jar execs\n");
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fw.write("gnome-terminal -x ."+File.separator+"execs"+File.separator+instanceName+"_Cfg\n");
			}
			fw.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
		
	}

	@Override
	public void verify(CyprIoTModel model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deploy(CyprIoTModel model) {
		// TODO Auto-generated method stub
		
	}

}
