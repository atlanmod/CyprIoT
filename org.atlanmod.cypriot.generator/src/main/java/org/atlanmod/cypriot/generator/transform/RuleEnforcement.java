package org.atlanmod.cypriot.generator.transform;

import org.atlanmod.cypriot.cyprIoT.Rule;
import org.thingml.xtext.thingML.ThingMLModel;

public interface RuleEnforcement {
	public ThingMLModel enforce(Rule rule, ThingMLModel thingModel);
}
