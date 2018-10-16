package org.atlanmod.cypriot.generator.compilers;

import org.thingml.compilers.ThingMLCompiler;

public interface CodeGenerator {

	public ThingMLCompiler make(CodeGeneratorOperation operation);

}
