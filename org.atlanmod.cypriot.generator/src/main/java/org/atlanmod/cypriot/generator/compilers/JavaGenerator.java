package org.atlanmod.cypriot.generator.compilers;

import org.thingml.compilers.ThingMLCompiler;
import org.thingml.compilers.java.JavaCompiler;
import org.thingml.compilers.spi.NetworkPlugin;
import org.thingml.compilers.spi.SerializationPlugin;
import org.thingml.networkplugins.java.JavaByteArraySerializerPlugin;
import org.thingml.networkplugins.java.JavaMQTTPlugin;

public class JavaGenerator implements GeneratorFactory {

	@Override
	public ThingMLCompiler makeGenerator() {
		return new JavaCompiler();
	}

	@Override
	public NetworkPlugin makeNetworkPlugin() {
		return new JavaMQTTPlugin();
	}

	@Override
	public SerializationPlugin makeSerializationPlugin() {
		return new JavaByteArraySerializerPlugin();
	}

}
