package org.atlanmod.cypriot.generator.plugins;

import java.io.File;

import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;

public interface Plugin {
	void attach(Logger log);
	String getID();
	CyprIoTModel initiliaze();
	CyprIoTModel transform(CyprIoTModel model);
	void generate(CyprIoTModel model, File outputDirectory);
	void verify(CyprIoTModel model);
	void deploy(CyprIoTModel model);
}
