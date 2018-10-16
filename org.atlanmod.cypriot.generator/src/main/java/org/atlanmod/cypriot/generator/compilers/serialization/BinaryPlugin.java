package org.atlanmod.cypriot.generator.compilers.serialization;

import org.atlanmod.cypriot.generator.compilers.CodeGeneratorOperation;
import org.thingml.compilers.c.posix.PosixCompiler;
import org.thingml.compilers.java.JavaCompiler;
import org.thingml.networkplugins.c.CByteArraySerializerPlugin;
import org.thingml.networkplugins.java.JavaByteArraySerializerPlugin;

public class BinaryPlugin implements CodeGeneratorOperation {

	@Override
	public void visitCPosix(PosixCompiler posix) {
		CByteArraySerializerPlugin binary = new CByteArraySerializerPlugin();
		posix.addSerializationPlugin(binary);
	}

	@Override
	public void visitJava(JavaCompiler java) {
		JavaByteArraySerializerPlugin binary = new JavaByteArraySerializerPlugin();
		java.addSerializationPlugin(binary);
	}

}
