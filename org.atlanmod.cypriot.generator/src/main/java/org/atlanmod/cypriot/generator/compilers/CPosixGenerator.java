package org.atlanmod.cypriot.generator.compilers;

import org.thingml.compilers.ThingMLCompiler;
import org.thingml.compilers.c.posix.PosixCompiler;
import org.thingml.compilers.spi.NetworkPlugin;
import org.thingml.compilers.spi.SerializationPlugin;
import org.thingml.networkplugins.c.CByteArraySerializerPlugin;
import org.thingml.networkplugins.c.posix.PosixMQTTPlugin;

public class CPosixGenerator implements GeneratorFactory {

	@Override
	public ThingMLCompiler makeGenerator() {
		return new PosixCompiler();
	}

	@Override
	public NetworkPlugin makeNetworkPlugin() {
		return new PosixMQTTPlugin();
	}

	@Override
	public SerializationPlugin makeSerializationPlugin() {
		return new CByteArraySerializerPlugin();
	}

}
