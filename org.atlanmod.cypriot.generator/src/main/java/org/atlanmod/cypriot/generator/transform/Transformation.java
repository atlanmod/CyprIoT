package org.atlanmod.cypriot.generator.transform;

import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.thingml.xtext.thingML.ThingMLModel;

public interface Transformation {
	public ThingMLModel transform(CyprIoTModel networkModel, ThingMLModel model);
}
