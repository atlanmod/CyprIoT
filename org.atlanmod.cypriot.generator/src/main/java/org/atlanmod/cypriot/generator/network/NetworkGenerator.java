package org.atlanmod.cypriot.generator.network;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.generator.load.ModelBehavior;
import org.atlanmod.cypriot.generator.load.ModelLoader;
import org.atlanmod.cypriot.generator.transform.BindingTransformation;
import org.atlanmod.cypriot.generator.transform.PolicyTransformation;
import org.atlanmod.cypriot.generator.transform.Transformation;
import org.atlanmod.cypriot.generator.utilities.NetworkDebug;
import org.atlanmod.cypriot.generator.utilities.NetworkHelper;
import org.thingml.xtext.thingML.ThingMLModel;

/**
 * A simple generator that generates a description of the network in human
 * readable format
 * 
 * @author imberium
 *
 */

public class NetworkGenerator {

	static final Logger log = LogManager.getLogger(NetworkGenerator.class.getName());

	CyprIoTModel networkModel;
	File cypriotOutputDirectory;
	ModelLoader modelLoader = new ModelBehavior();
	Transformation binding = new BindingTransformation();
	Transformation enfocePolicy = new PolicyTransformation();
	Map<InstanceThing, ThingMLModel> transformedThingModel = new HashMap<InstanceThing, ThingMLModel>();

	/**
	 * @param model the model to set
	 */
	public NetworkGenerator(CyprIoTModel model, File cypriotOutputDirectory) {
		this.networkModel = model;
		this.cypriotOutputDirectory = cypriotOutputDirectory;
	}

	/**
	 * @param enfocePolicy the enfocePolicy to set
	 */
	public void setEnfocePolicy(Transformation enfocePolicy) {
		this.enfocePolicy = enfocePolicy;
	}

	/**
	 * Process code generation for the whole cypriot file
	 */
	public void generate() {
		transformsThingModels();
		saveArtifacts();
	}

	/**
	 * 
	 */
	public void saveArtifacts() {
		for (Map.Entry<InstanceThing, ThingMLModel> thingModel : transformedThingModel.entrySet()) {
			NetworkHelper.saveAsThingML(thingModel.getValue(),
					cypriotOutputDirectory + File.separator + thingModel.getKey().getName() + "_transformed.thingml");
		}
	}

	/**
	 * Process code generation for the whole network
	 */
	private void transformsThingModels() {

		for (Network network : NetworkHelper.getAllNetworksInModel(networkModel)) {
			for (InstanceThing instanceThing : NetworkHelper.getAllInstanceThingBehaviorInNetwork(network)) {
				 ThingMLModel thingModel = binding.transform(networkModel, instanceThing);
				// thingModel = enfocePolicy.transform(networkModel, thingModel);
				transformedThingModel.put(instanceThing, thingModel);
			}
			new NetworkDebug(log, network);
		}
	}

}
