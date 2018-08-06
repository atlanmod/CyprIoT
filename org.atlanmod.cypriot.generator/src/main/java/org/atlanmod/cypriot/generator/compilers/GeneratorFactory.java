package org.atlanmod.cypriot.generator.compilers;

import org.thingml.compilers.ThingMLCompiler;
import org.thingml.compilers.spi.NetworkPlugin;
import org.thingml.compilers.spi.SerializationPlugin;

public interface GeneratorFactory {
	public ThingMLCompiler makeGenerator();
	public NetworkPlugin makeNetworkPlugin();
	public SerializationPlugin makeSerializationPlugin();
}
