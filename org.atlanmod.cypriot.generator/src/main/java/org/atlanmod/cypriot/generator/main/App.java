package org.atlanmod.cypriot.generator.main;

import java.io.File;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.BindPubSub;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstancePubSub;
import org.atlanmod.cypriot.cyprIoT.InstanceReqRep;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Topic;
import org.atlanmod.cypriot.generator.commons.Utilities;
import org.atlanmod.cypriot.generator.models.CypriotModelLoader;

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

	public void run() {
		System.out.println("CyprIoT v" + Utilities.getProjectVersionFromMaven());
		if (verbose.length > 0) {
			log.info("Verbose mode enabled");
			log.debug("Processing " + cypriotInputFile.getName() + " file...");
		}
		if (verbose.length > 1) {
			log.debug(cypriotInputFile.getAbsolutePath());
		}
		String fileContent = Utilities.getContentFromFile(cypriotInputFile);
		CypriotModelLoader cypriotModelLoader = new CypriotModelLoader(fileContent);
		CyprIoTModel model = cypriotModelLoader.loadModel();
		ArrayList<InstanceThing> instanceThings = Utilities.allTypesInNetwork(model, InstanceThing.class);
		for (InstanceThing instanceThing : instanceThings) {
			InstanceThing instance = (InstanceThing) instanceThing;
			log.debug("Thing Name : " + instance.getName()+" Number : "+instance.getNumberOfInstances());
		}

		ArrayList<InstancePubSub> pubSubs = Utilities.allTypesInNetwork(model, InstancePubSub.class);

		for (InstancePubSub pubSub : pubSubs) {
			log.debug("PubSub Name : " + ((InstancePubSub) pubSub).getName());
		}

		ArrayList<InstanceReqRep> reqReps = Utilities.allTypesInNetwork(model, InstanceReqRep.class);

		for (InstanceReqRep reqRep : reqReps) {
			log.debug("ReqRep Name : " + ((InstanceReqRep) reqRep).getName());
		}
		
		ArrayList<BindPubSub> bindPubSubs = Utilities.allTypesInNetwork(model, BindPubSub.class);

		for (BindPubSub reqRep : bindPubSubs) {
			InstanceThing instanceThing = ((BindPubSub) reqRep).getThingInstance();
			String subjectPort = ((BindPubSub) reqRep).getSubjectPort();
			InstancePubSub pubsub = ((BindPubSub) reqRep).getPubSubInstance();
			StringBuilder topics = new StringBuilder();
			for (Topic topic : ((BindPubSub) reqRep).getTopics()) {
				topics.append(topic+",");
			}
			log.debug("Bind ThingInstance : " + instanceThing.getName()+
					" port : "+subjectPort+
					" PubSub : "+pubsub.getName()+
					"Topics : "+topics
					);
		}

	}

	public static void main(String[] args) {
		ExecutionContext.pre(App.class.getName(), "main");
		CommandLine.run(new App(), System.out, args);
		ExecutionContext.post();
	}

}
