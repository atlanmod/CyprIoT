package org.atlanmod.iotlang.utilities.logs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lang.iotlang.InstanceThing;
import lang.iotlang.IoTLangModel;
import lang.iotlang.NetworkConfiguration;
import lang.iotlang.Thing;

public class ModelHelpers {
	
	public static List<Thing> allThingsRoot(IoTLangModel self) {
		List<Thing> result = new ArrayList<Thing>();
		for(Thing i : self.getThings()) {
				result.add(i);
		}
		return result;
	}
	
	public static List<Thing> allThings(NetworkConfiguration self) {
		List<Thing> result = new ArrayList<Thing>();
		for(InstanceThing i : allInstances(self)) {
			if (!result.contains(i.getTypeThing()))  //TODO: maybe we should return a set instead?
				result.add(i.getTypeThing());
		}
		return result;
	}
	
	public static Set<InstanceThing> allInstances(NetworkConfiguration self) {
		Set<InstanceThing> result = new HashSet<InstanceThing>();
		//result.addAll(merge(self).getInstances());
		result.addAll(self.getThingInstances());
		return result;
	}
	
}
