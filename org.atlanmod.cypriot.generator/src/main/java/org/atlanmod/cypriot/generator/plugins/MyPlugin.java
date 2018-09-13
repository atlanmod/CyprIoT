package org.atlanmod.cypriot.generator.plugins;

import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.main.App;

public class MyPlugin implements Plugin {

	@Override
	public void attach(App app) {
		System.out.println("Hello from MyPlugin!");
	}

	@Override
	public CyprIoTModel initiliaze(CyprIoTModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CyprIoTModel loadModel(CyprIoTModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CyprIoTModel validate(CyprIoTModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CyprIoTModel transform(CyprIoTModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void generate(CyprIoTModel model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifiy(CyprIoTModel model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deploy(CyprIoTModel model) {
		// TODO Auto-generated method stub
		
	}

}
