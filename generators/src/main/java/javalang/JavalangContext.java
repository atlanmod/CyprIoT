package javalang;


import fr.imta.naomod.Context;
import framework.IoTCompiler;
import lang.iotlang.Thing;

public class JavalangContext extends Context{
	public JavalangContext(IoTCompiler compiler) {
		super(compiler);
		// TODO Auto-generated constructor stub
	}
	protected Thing concreteThing = null;
	
	public void setConcreteThing(Thing t) {
        concreteThing = t;
    }
	public void clearConcreteThing() {
        concreteThing = null;
    }
}
