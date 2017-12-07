/**
 * generated by Xtext 2.13.0
 */
package lang.iotlang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lang.iotlang.Channel#getName <em>Name</em>}</li>
 *   <li>{@link lang.iotlang.Channel#getChannelId <em>Channel Id</em>}</li>
 * </ul>
 *
 * @see lang.iotlang.IotlangPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see lang.iotlang.IotlangPackage#getChannel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link lang.iotlang.Channel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Channel Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Channel Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Channel Id</em>' attribute.
   * @see #setChannelId(String)
   * @see lang.iotlang.IotlangPackage#getChannel_ChannelId()
   * @model
   * @generated
   */
  String getChannelId();

  /**
   * Sets the value of the '{@link lang.iotlang.Channel#getChannelId <em>Channel Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Channel Id</em>' attribute.
   * @see #getChannelId()
   * @generated
   */
  void setChannelId(String value);

} // Channel
