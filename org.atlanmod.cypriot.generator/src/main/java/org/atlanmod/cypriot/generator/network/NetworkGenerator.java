package org.atlanmod.cypriot.generator.network;

import java.io.File;
import java.util.Map;

import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.load.ModelLoader;
import org.atlanmod.cypriot.generator.load.ModelBehavior;
import org.atlanmod.cypriot.generator.transform.BindingTransformation;
import org.atlanmod.cypriot.generator.transform.PolicyTransformation;
import org.atlanmod.cypriot.generator.transform.Transformation;
import org.atlanmod.cypriot.generator.utilities.Helpers;
import org.thingml.xtext.thingML.ThingMLModel;

/**
 * A simple generator that generates a description of the network in human
 * readable format
 * 
 * @author imberium
 *
 */

public class NetworkGenerator {

	CyprIoTModel networkModel;
	File cypriotOutputDirectory;
	ModelLoader modelLoader = new ModelBehavior();
	Transformation binding = new BindingTransformation();
	Transformation enfocePolicy = new PolicyTransformation();
	
	/**
	 * @param model the model to set
	 */
	public NetworkGenerator(CyprIoTModel model, File cypriotOutputDirectory) {
		this.networkModel = model;
		this.cypriotOutputDirectory= cypriotOutputDirectory;
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
		for (Map.Entry<String, ThingMLModel> thingModel : modelLoader.loadBehaviorModels(networkModel).entrySet()) {
			Helpers.saveAsThingML(thingModel.getValue(), cypriotOutputDirectory+File.separator+thingModel.getKey()+"_transformed.thingml");
		}
	}

	/**
	 * Process code generation for the whole network
	 */
	private void transformsThingModels() {
		for (ThingMLModel thingModel : modelLoader.loadBehaviorModels(networkModel).values()) {
			binding.transform(networkModel, thingModel);
			enfocePolicy.transform(networkModel, thingModel);
		}
	}
}
