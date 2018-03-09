package framework;

import fr.imta.naomod.Context;
import lang.iotlang.Thing;

public class ImplCompiler {
	public void generateImplementation(Thing thing, Context ctx) {
        throw (new UnsupportedOperationException("Implementations are platform-specific. Cannot generateMainAndInit API for Thing " + thing.getName()));
    }
}
