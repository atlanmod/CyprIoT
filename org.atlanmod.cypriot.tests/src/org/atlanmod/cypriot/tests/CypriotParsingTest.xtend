package org.atlanmod.cypriot.tests

import com.google.inject.Inject
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(typeof(CypriotInjectorProvider))
class CypriotParsingTest {
	@Inject
	ParseHelper<CyprIoTModel> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			role:sensor
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
}
}
