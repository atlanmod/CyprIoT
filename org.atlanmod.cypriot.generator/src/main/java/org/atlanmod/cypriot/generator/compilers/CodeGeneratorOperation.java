package org.atlanmod.cypriot.generator.compilers;

import org.thingml.compilers.c.posix.PosixCompiler;
import org.thingml.compilers.java.JavaCompiler;

public interface CodeGeneratorOperation {
	public void visitCPosix(PosixCompiler posix);
	public void visitJava(JavaCompiler java);

}
