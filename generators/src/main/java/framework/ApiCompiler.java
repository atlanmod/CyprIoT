package framework;

import fr.imta.naomod.Context;
import lang.iotlang.Thing;

public class ApiCompiler {
	public void generatePublicAPI(Thing thing, Context ctx) {
        throw (new UnsupportedOperationException("APIs are platform-specific. Cannot generateMainAndInit API for Thing " + thing.getName()));
    }
}
