/**
 * generated by Xtext 2.13.0
 */
package lang.iotlang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lang.iotlang.ErrorAction#getMsg <em>Msg</em>}</li>
 * </ul>
 *
 * @see lang.iotlang.IotlangPackage#getErrorAction()
 * @model
 * @generated
 */
public interface ErrorAction extends Action
{
  /**
   * Returns the value of the '<em><b>Msg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msg</em>' containment reference.
   * @see #setMsg(Expression)
   * @see lang.iotlang.IotlangPackage#getErrorAction_Msg()
   * @model containment="true"
   * @generated
   */
  Expression getMsg();

  /**
   * Sets the value of the '{@link lang.iotlang.ErrorAction#getMsg <em>Msg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Msg</em>' containment reference.
   * @see #getMsg()
   * @generated
   */
  void setMsg(Expression value);

} // ErrorAction
