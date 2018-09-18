package org.atlanmod.cypriot.generator.plugins;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.atlanmod.cypriot.cyprIoT.Bind;
import org.atlanmod.cypriot.cyprIoT.ChannelToBind;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.cyprIoT.ReadOrWrite;
import org.atlanmod.cypriot.cyprIoT.ToBindPubSub;
import org.atlanmod.cypriot.cyprIoT.Topic;
import org.atlanmod.cypriot.generator.main.App;
import org.atlanmod.cypriot.generator.network.SimpleNetworkGenerator;
import org.atlanmod.cypriot.generator.network.SimpleNetworkGenerator.TopicTypes;
import org.eclipse.emf.common.util.EList;

public class ACPlugin implements Plugin {

	@Override
	public void attach(App app) {
		System.out.println("Loading Access Control plugin...");
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
		for (Network network : allNetworks) {
			EList<Bind> allBinds = network.getBinds();
			for (Bind bindPubSub : allBinds) {
					ChannelToBind channelBinding = bindPubSub.getChannelToBind();
					if(channelBinding instanceof ToBindPubSub) {
						
						String pubSubChannelName = ((ToBindPubSub) channelBinding).getPubSubInstance().getName();
						InstanceThing instanceThing = bindPubSub.getThingInstance();
						
						ArrayList<Bind> pubSubBindsContainingThingInstances = SimpleNetworkGenerator.pubSubBindsContainingThingInstances(instanceThing, network);

						ArrayList<Topic> pubTopics = SimpleNetworkGenerator.getAllTopicsOfType(instanceThing, pubSubBindsContainingThingInstances, TopicTypes.PUBTOPIC);
						ArrayList<Topic> subTopics = SimpleNetworkGenerator.getAllTopicsOfType(instanceThing, pubSubBindsContainingThingInstances, TopicTypes.SUBTOPIC);
						
						for (Topic pubTopic : pubTopics) {
							String mosquittoAcl = "user " +instanceThing.getName()+"\n" + "topic write "+pubTopic.getName()+" \n \n";
							writeToACLFile(outputDirectory, pubSubChannelName, mosquittoAcl);	
						}
						
						for (Topic subTopic : subTopics) {
							String mosquittoAcl = "user " +instanceThing.getName()+"\n" + "topic read "+subTopic.getName()+" \n \n";
							writeToACLFile(outputDirectory, pubSubChannelName, mosquittoAcl);
						}
						
						
					}
			}
		}
	}

	/**
	 * @param outputDirectory
	 * @param pubSubChannelName
	 * @param mosquittoAcl
	 */
	public void writeToACLFile(File outputDirectory, String pubSubChannelName, String mosquittoAcl) {
		String filename = outputDirectory.getParentFile().getAbsolutePath() + "/output/"
				+ pubSubChannelName+"_mosquitto.acl";
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

	@Override
	public void verifiy(CyprIoTModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deploy(CyprIoTModel model) {
		// TODO Auto-generated method stub

	}

}
