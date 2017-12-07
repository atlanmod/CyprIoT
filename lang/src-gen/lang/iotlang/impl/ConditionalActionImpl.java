/**
 * generated by Xtext 2.13.0
 */
package lang.iotlang.impl;

import lang.iotlang.Action;
import lang.iotlang.ConditionalAction;
import lang.iotlang.Expression;
import lang.iotlang.IotlangPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lang.iotlang.impl.ConditionalActionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link lang.iotlang.impl.ConditionalActionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link lang.iotlang.impl.ConditionalActionImpl#getElseAction <em>Else Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalActionImpl extends ActionImpl implements ConditionalAction
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expression condition;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

  /**
   * The cached value of the '{@link #getElseAction() <em>Else Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseAction()
   * @generated
   * @ordered
   */
  protected Action elseAction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IotlangPackage.Literals.CONDITIONAL_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs)
  {
    Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IotlangPackage.CONDITIONAL_ACTION__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IotlangPackage.CONDITIONAL_ACTION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IotlangPackage.CONDITIONAL_ACTION__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotlangPackage.CONDITIONAL_ACTION__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(Action newAction, NotificationChain msgs)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IotlangPackage.CONDITIONAL_ACTION__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(Action newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IotlangPackage.CONDITIONAL_ACTION__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IotlangPackage.CONDITIONAL_ACTION__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotlangPackage.CONDITIONAL_ACTION__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getElseAction()
  {
    return elseAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseAction(Action newElseAction, NotificationChain msgs)
  {
    Action oldElseAction = elseAction;
    elseAction = newElseAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IotlangPackage.CONDITIONAL_ACTION__ELSE_ACTION, oldElseAction, newElseAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseAction(Action newElseAction)
  {
    if (newElseAction != elseAction)
    {
      NotificationChain msgs = null;
      if (elseAction != null)
        msgs = ((InternalEObject)elseAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IotlangPackage.CONDITIONAL_ACTION__ELSE_ACTION, null, msgs);
      if (newElseAction != null)
        msgs = ((InternalEObject)newElseAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IotlangPackage.CONDITIONAL_ACTION__ELSE_ACTION, null, msgs);
      msgs = basicSetElseAction(newElseAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotlangPackage.CONDITIONAL_ACTION__ELSE_ACTION, newElseAction, newElseAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IotlangPackage.CONDITIONAL_ACTION__CONDITION:
        return basicSetCondition(null, msgs);
      case IotlangPackage.CONDITIONAL_ACTION__ACTION:
        return basicSetAction(null, msgs);
      case IotlangPackage.CONDITIONAL_ACTION__ELSE_ACTION:
        return basicSetElseAction(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IotlangPackage.CONDITIONAL_ACTION__CONDITION:
        return getCondition();
      case IotlangPackage.CONDITIONAL_ACTION__ACTION:
        return getAction();
      case IotlangPackage.CONDITIONAL_ACTION__ELSE_ACTION:
        return getElseAction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IotlangPackage.CONDITIONAL_ACTION__CONDITION:
        setCondition((Expression)newValue);
        return;
      case IotlangPackage.CONDITIONAL_ACTION__ACTION:
        setAction((Action)newValue);
        return;
      case IotlangPackage.CONDITIONAL_ACTION__ELSE_ACTION:
        setElseAction((Action)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IotlangPackage.CONDITIONAL_ACTION__CONDITION:
        setCondition((Expression)null);
        return;
      case IotlangPackage.CONDITIONAL_ACTION__ACTION:
        setAction((Action)null);
        return;
      case IotlangPackage.CONDITIONAL_ACTION__ELSE_ACTION:
        setElseAction((Action)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IotlangPackage.CONDITIONAL_ACTION__CONDITION:
        return condition != null;
      case IotlangPackage.CONDITIONAL_ACTION__ACTION:
        return action != null;
      case IotlangPackage.CONDITIONAL_ACTION__ELSE_ACTION:
        return elseAction != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionalActionImpl
