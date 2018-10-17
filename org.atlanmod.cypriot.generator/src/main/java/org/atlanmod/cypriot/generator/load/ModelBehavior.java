package org.atlanmod.cypriot.generator.load;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.generator.utilities.Helpers;
import org.atlanmod.cypriot.generator.utilities.NetworkHelper;
import org.thingml.xtext.thingML.ThingMLModel;

public class ModelBehavior implements ModelLoader {
	Map<String, ThingMLModel> thingModels = new HashMap<String, ThingMLModel>();

	public Map<String, ThingMLModel> loadBehaviorModels(CyprIoTModel networkModel) {
		for (Network network : networkModel.getSpecifyNetworks()) {
			for (InstanceThing instanceThing : Helpers.allEObjectContainedIn(network, InstanceThing.class)) {
				thingModels.put(instanceThing.getName(), getThingmlModelFromInstanceThing(instanceThing));
			}
		}
		return thingModels;
	}

	/**
	 * Get the ThingML model imported by an InstanceThing
	 * 
	 * @param instanceThing
	 * @return The imported ThingML model
	 */
	private ThingMLModel getThingmlModelFromInstanceThing(InstanceThing instanceThing) {
		String parentThingPath = getImportedThingPath(instanceThing);
		File thingMLFile;
		ThingMLModel thingmlModel = null;
		try {
			String thingPath = instanceThing.getThingToInstantiate().getImportPath();
			thingPath = thingPath.replace("\"", "");
			thingMLFile = NetworkHelper.getFileFromPath(parentThingPath + File.separator + thingPath);
			thingmlModel = Helpers.loadModelFromFile(thingMLFile, ThingMLModel.class);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return thingmlModel;
	}

	/**
	 * Get the full path of the imported thing model
	 * 
	 * @param instance
	 * @return The full path
	 */
	private String getImportedThingPath(InstanceThing instanceThing) {
		File file = new File(instanceThing.eContainer().eResource().getURI().toFileString());
		file = file.getParentFile();
		return file.getAbsolutePath();
	}
}
