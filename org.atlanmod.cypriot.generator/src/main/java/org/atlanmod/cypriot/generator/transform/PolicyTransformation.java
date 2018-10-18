package org.atlanmod.cypriot.generator.transform;

import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.cyprIoT.Policy;
import org.atlanmod.cypriot.generator.utilities.NetworkHelper;
import org.thingml.xtext.thingML.ThingMLModel;

public class PolicyTransformation implements Transformation {

	@Override
	public ThingMLModel transform(CyprIoTModel networkModel, InstanceThing instanceThing) {
		for (Network network : NetworkHelper.getAllNetworksInModel(networkModel)) {
			for (Policy policy : NetworkHelper.getEnforcedPolicies(network)) {
				
			}
		}
		return NetworkHelper.getThingmlModelFromInstanceThing(instanceThing);
	}

}