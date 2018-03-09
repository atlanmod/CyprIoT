package clang;


import fr.imta.naomod.Context;
import lang.iotlang.Thing;

public class ClangContext extends Context{
	protected Thing concreteThing = null;
	public ClangContext() {}
	
	public void setConcreteThing(Thing t) {
        concreteThing = t;
    }
	public void clearConcreteThing() {
        concreteThing = null;
    }
}
