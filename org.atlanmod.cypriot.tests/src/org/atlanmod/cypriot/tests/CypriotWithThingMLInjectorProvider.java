package org.atlanmod.cypriot.tests;

import org.thingml.xtext.ThingMLStandaloneSetup;

import com.google.inject.Injector;

public class CypriotWithThingMLInjectorProvider extends CypriotInjectorProvider {
	@Override
	protected Injector internalCreateInjector() {
		ThingMLStandaloneSetup.doSetup();
		return super.internalCreateInjector();
	}
}
