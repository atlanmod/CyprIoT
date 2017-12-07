/**
 * generated by Xtext 2.13.0
 */
package lang.iotlang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lang.iotlang.InstanceGateway#getTypeGate <em>Type Gate</em>}</li>
 * </ul>
 *
 * @see lang.iotlang.IotlangPackage#getInstanceGateway()
 * @model
 * @generated
 */
public interface InstanceGateway extends NamedElement, AnnotatedElement
{
  /**
   * Returns the value of the '<em><b>Type Gate</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Gate</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Gate</em>' reference.
   * @see #setTypeGate(Gateway)
   * @see lang.iotlang.IotlangPackage#getInstanceGateway_TypeGate()
   * @model
   * @generated
   */
  Gateway getTypeGate();

  /**
   * Sets the value of the '{@link lang.iotlang.InstanceGateway#getTypeGate <em>Type Gate</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Gate</em>' reference.
   * @see #getTypeGate()
   * @generated
   */
  void setTypeGate(Gateway value);

} // InstanceGateway
