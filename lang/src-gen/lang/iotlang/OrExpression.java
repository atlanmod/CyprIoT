/**
 * generated by Xtext 2.13.0
 */
package lang.iotlang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lang.iotlang.OrExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link lang.iotlang.OrExpression#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see lang.iotlang.IotlangPackage#getOrExpression()
 * @model
 * @generated
 */
public interface OrExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(Expression)
   * @see lang.iotlang.IotlangPackage#getOrExpression_Lhs()
   * @model containment="true"
   * @generated
   */
  Expression getLhs();

  /**
   * Sets the value of the '{@link lang.iotlang.OrExpression#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Expression value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(Expression)
   * @see lang.iotlang.IotlangPackage#getOrExpression_Rhs()
   * @model containment="true"
   * @generated
   */
  Expression getRhs();

  /**
   * Sets the value of the '{@link lang.iotlang.OrExpression#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Expression value);

} // OrExpression
