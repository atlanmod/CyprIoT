package org.atlanmod.cypriot.generator.plugins;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.atlanmod.cypriot.cyprIoT.BindPubSub;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.generator.main.App;
import org.eclipse.emf.common.util.EList;

public class ACPlugin implements Plugin {

	@Override
	public void attach(App app) {
		System.out.println("Hello from MyPlugin!");
	}

	@Override
	public CyprIoTModel initiliaze(CyprIoTModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CyprIoTModel loadModel(CyprIoTModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CyprIoTModel validate(CyprIoTModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CyprIoTModel transform(CyprIoTModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void generate(CyprIoTModel model, File outputDirectory) {
		EList<Network> allNetworks = model.getNetworks();
		String mosquittoAcl = "user <USERNAME>\n" + "topic <PERMISSION> <TOPICS>\n \n";
		for (Network network : allNetworks) {
			EList<BindPubSub> allBindsPubSub = network.getBindsPubsub();
			for (BindPubSub bindPubSub : allBindsPubSub) {
				String filename = outputDirectory.getParentFile().getAbsolutePath() + "/output/"
						+ bindPubSub.getPubSubInstance().getName()+".acl";
				File fileMosquittoAcl = new File(filename);
				if (fileMosquittoAcl.exists()) {
					try
					{
					    FileWriter fw = new FileWriter(filename,true);
					    fw.write(mosquittoAcl);
					    fw.close();
					}
					catch(IOException ioe)
					{
					    System.err.println("IOException: " + ioe.getMessage());
					}
				} else {
					try {
						FileUtils.writeStringToFile(fileMosquittoAcl, mosquittoAcl);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	@Override
	public void verifiy(CyprIoTModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deploy(CyprIoTModel model) {
		// TODO Auto-generated method stub

	}

}
