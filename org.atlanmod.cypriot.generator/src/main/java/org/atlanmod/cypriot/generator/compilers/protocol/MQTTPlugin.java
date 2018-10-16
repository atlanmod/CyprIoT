package org.atlanmod.cypriot.generator.compilers.protocol;

import org.atlanmod.cypriot.generator.compilers.CodeGeneratorOperation;
import org.thingml.compilers.c.posix.PosixCompiler;
import org.thingml.compilers.java.JavaCompiler;
import org.thingml.networkplugins.c.posix.PosixMQTTPlugin;
import org.thingml.networkplugins.java.JavaMQTTPlugin;

public class MQTTPlugin implements CodeGeneratorOperation {

	@Override
	public void visitCPosix(PosixCompiler posix) {
		PosixMQTTPlugin mqtt = new PosixMQTTPlugin();
		posix.addNetworkPlugin(mqtt);
	}

	@Override
	public void visitJava(JavaCompiler java) {
		JavaMQTTPlugin mqtt = new JavaMQTTPlugin();
		java.addNetworkPlugin(mqtt);
	}

}
