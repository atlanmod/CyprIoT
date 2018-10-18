package org.atlanmod.cypriot.generator.load;

import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.generator.utilities.NetworkHelper;
import org.thingml.xtext.thingML.ThingMLModel;

public class ModelBehavior implements ModelLoader {

	public ThingMLModel loadThingBehavior(InstanceThing instanceThing) {
		return NetworkHelper.getThingmlModelFromInstanceThing(instanceThing);
	}

}
