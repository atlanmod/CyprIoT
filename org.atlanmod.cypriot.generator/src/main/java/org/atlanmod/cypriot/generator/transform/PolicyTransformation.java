package org.atlanmod.cypriot.generator.transform;

import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.cyprIoT.Policy;
import org.eclipse.emf.common.util.EList;
import org.thingml.xtext.thingML.ThingMLModel;

public class PolicyTransformation implements Transformation {

	@Override
	public ThingMLModel transform(CyprIoTModel networkModel, ThingMLModel model) {
		EList<Network> allNetworks = networkModel.getSpecifyNetworks();
		for (Network network : allNetworks) {
			if (isPolicyEnforced(network)) {
				EList<Policy> policies = network.getHasPolicyEnforcement().getPolicyName();
				for (Policy policy : policies) {
					
				}
			}
		}
		return model;
	}

	private boolean isPolicyEnforced(Network network) {
		if (network.getHasPolicyEnforcement() != null) {
			return true;
		}
		return false;
	}

}
