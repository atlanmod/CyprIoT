package framework;

import fr.imta.naomod.Context;
import lang.iotlang.Configuration;

public class CfgBuildCompiler {
	public void generateBuildScript(Configuration cfg, Context ctx) {
        throw (new UnsupportedOperationException("Project structure and build scripts are platform-specific."));
    }
	public void generateDockerFile(Configuration cfg, Context ctx) {}

}
