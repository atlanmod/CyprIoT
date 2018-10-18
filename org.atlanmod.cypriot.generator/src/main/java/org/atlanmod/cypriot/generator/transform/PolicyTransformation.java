package org.atlanmod.cypriot.generator.transform;

import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.generator.utilities.NetworkHelper;
import org.eclipse.emf.common.util.EList;
import org.thingml.xtext.thingML.State;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLModel;
import org.thingml.xtext.thingML.Transition;

public class PolicyTransformation implements Transformation {

	@Override
	public ThingMLModel transform(CyprIoTModel networkModel, InstanceThing instanceThing) {
		ThingMLModel thingModel = NetworkHelper.getThingmlModelFromInstanceThing(instanceThing);
		EList<State> allStates = NetworkHelper.getAllStateInThingMLModel(thingModel);
		
		for (State state : allStates) {
			if(!state.equals(allStates.get(1))) {
				Transition transition = ThingMLFactory.eINSTANCE.createTransition();
				transition.setTarget(allStates.get(1));
				state.getOutgoing().add(transition);
			}
		}
		return thingModel;
	}
}