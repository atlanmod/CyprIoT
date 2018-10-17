package org.atlanmod.cypriot.generator.load;

import java.util.Map;

import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.thingml.xtext.thingML.ThingMLModel;

public interface ModelLoader {
	public Map<String, ThingMLModel> loadBehaviorModels(CyprIoTModel networkModel);
}
