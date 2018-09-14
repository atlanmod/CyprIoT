package org.atlanmod.cypriot.generator.plugins;

import java.io.File;

import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.main.App;

public interface Plugin {
	void attach(App app);
	CyprIoTModel initiliaze(CyprIoTModel model);
	CyprIoTModel loadModel(CyprIoTModel model);
	CyprIoTModel validate(CyprIoTModel model);
	CyprIoTModel transform(CyprIoTModel model);
	void generate(CyprIoTModel model, File outputDirectory);
	void verifiy(CyprIoTModel model);
	void deploy(CyprIoTModel model);
}
