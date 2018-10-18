package org.atlanmod.cypriot.generator.load;

import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.thingml.xtext.thingML.ThingMLModel;

public interface ModelLoader {
	public ThingMLModel loadThingBehavior(InstanceThing instanceThing);
}
