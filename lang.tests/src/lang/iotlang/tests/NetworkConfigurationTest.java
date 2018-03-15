/**
 * generated by Xtext 2.13.0
 */
package lang.iotlang.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import lang.iotlang.IotlangFactory;
import lang.iotlang.NetworkConfiguration;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Network Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkConfigurationTest extends TestCase {

	/**
	 * The fixture for this Network Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkConfiguration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NetworkConfigurationTest.class);
	}

	/**
	 * Constructs a new Network Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkConfigurationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Network Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NetworkConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Network Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkConfiguration getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IotlangFactory.eINSTANCE.createNetworkConfiguration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //NetworkConfigurationTest
