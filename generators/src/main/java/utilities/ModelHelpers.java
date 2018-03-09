package utilities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lang.iotlang.Configuration;
import lang.iotlang.InstanceThing;
import lang.iotlang.Thing;

public class ModelHelpers {
	public static List<Thing> allThings(Configuration self) {
		List<Thing> result = new ArrayList<Thing>();
		for(InstanceThing i : allInstances(self)) {
			if (!result.contains(i.getTypeThing()))  //TODO: maybe we should return a set instead?
				result.add(i.getTypeThing());
		}
		return result;
	}
	
	public static Set<InstanceThing> allInstances(Configuration self) {
		Set<InstanceThing> result = new HashSet<InstanceThing>();
		//result.addAll(merge(self).getInstances());
		result.addAll(self.getInstanceThing());
		return result;
	}
}
