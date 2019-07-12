package org.atlanmod.cypriot.tests

import com.google.inject.Inject
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel
import org.atlanmod.cypriot.cyprIoT.CyprIoTPackage
import org.atlanmod.cypriot.validation.CypriotValidator
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(typeof(CypriotWithThingMLInjectorProvider))
class CypriotPolicyParsingTest {

	@Inject
	ParseHelper<CyprIoTModel> parseHelper
	@Inject
	extension ValidationTestHelper

	/*******************************
	 * POLICY TESTS                 *
	 *******************************/
	@Test
	def void policyDeclaration() {
		val result = parseHelper.parse('''
			policy anyname {
			}
		''')
		result.assertNoErrors
		Assert.assertNotNull(result)
		Assert.assertTrue(result.specifyPolicies.get(0).name.equals("anyname"))
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void DuplicatePolicyDeclaration() {
		val result = parseHelper.parse('''
			policy anyname {}
			policy anyname {}
		''')
		val policy = result.specifyPolicies.get(0)
		result.assertError(CyprIoTPackage::eINSTANCE.cyprIoTModel, CypriotValidator.POLICY_UNIQUENESS)
		Assert.assertNotNull(policy)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
