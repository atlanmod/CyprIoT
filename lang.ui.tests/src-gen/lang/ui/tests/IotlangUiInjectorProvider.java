/*
 * generated by Xtext 2.13.0
 */
package lang.ui.tests;

import com.google.inject.Injector;
import lang.ui.internal.LangActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class IotlangUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return LangActivator.getInstance().getInjector("lang.Iotlang");
	}

}
