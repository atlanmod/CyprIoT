package org.atlanmod.cypriot.generator.transform;

import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.thingml.xtext.thingML.ThingMLModel;

public interface Transformation {
	public ThingMLModel transform(InstanceThing instanceThing, ThingMLModel modelToTransform);
}
