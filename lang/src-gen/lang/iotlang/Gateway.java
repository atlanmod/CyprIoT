/**
 * generated by Xtext 2.13.0
 */
package lang.iotlang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lang.iotlang.Gateway#getBuses <em>Buses</em>}</li>
 * </ul>
 *
 * @see lang.iotlang.IotlangPackage#getGateway()
 * @model
 * @generated
 */
public interface Gateway extends Type
{
  /**
   * Returns the value of the '<em><b>Buses</b></em>' containment reference list.
   * The list contents are of type {@link lang.iotlang.Bus}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Buses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buses</em>' containment reference list.
   * @see lang.iotlang.IotlangPackage#getGateway_Buses()
   * @model containment="true"
   * @generated
   */
  EList<Bus> getBuses();

} // Gateway
