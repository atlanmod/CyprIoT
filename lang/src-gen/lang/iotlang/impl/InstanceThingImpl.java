/**
 * generated by Xtext 2.13.0
 */
package lang.iotlang.impl;

import java.util.Collection;

import lang.iotlang.InstanceThing;
import lang.iotlang.IotlangPackage;
import lang.iotlang.PlatformAnnotation;
import lang.iotlang.Thing;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lang.iotlang.impl.InstanceThingImpl#getName <em>Name</em>}</li>
 *   <li>{@link lang.iotlang.impl.InstanceThingImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link lang.iotlang.impl.InstanceThingImpl#getTypeThing <em>Type Thing</em>}</li>
 *   <li>{@link lang.iotlang.impl.InstanceThingImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceThingImpl extends MinimalEObjectImpl.Container implements InstanceThing
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected EList<Integer> number;

  /**
   * The cached value of the '{@link #getTypeThing() <em>Type Thing</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeThing()
   * @generated
   * @ordered
   */
  protected Thing typeThing;

  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList<PlatformAnnotation> annotations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstanceThingImpl()
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
    return IotlangPackage.Literals.INSTANCE_THING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotlangPackage.INSTANCE_THING__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getNumber()
  {
    if (number == null)
    {
      number = new EDataTypeEList<Integer>(Integer.class, this, IotlangPackage.INSTANCE_THING__NUMBER);
    }
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Thing getTypeThing()
  {
    if (typeThing != null && typeThing.eIsProxy())
    {
      InternalEObject oldTypeThing = (InternalEObject)typeThing;
      typeThing = (Thing)eResolveProxy(oldTypeThing);
      if (typeThing != oldTypeThing)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotlangPackage.INSTANCE_THING__TYPE_THING, oldTypeThing, typeThing));
      }
    }
    return typeThing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Thing basicGetTypeThing()
  {
    return typeThing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeThing(Thing newTypeThing)
  {
    Thing oldTypeThing = typeThing;
    typeThing = newTypeThing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotlangPackage.INSTANCE_THING__TYPE_THING, oldTypeThing, typeThing));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PlatformAnnotation> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectContainmentEList<PlatformAnnotation>(PlatformAnnotation.class, this, IotlangPackage.INSTANCE_THING__ANNOTATIONS);
    }
    return annotations;
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
      case IotlangPackage.INSTANCE_THING__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
      case IotlangPackage.INSTANCE_THING__NAME:
        return getName();
      case IotlangPackage.INSTANCE_THING__NUMBER:
        return getNumber();
      case IotlangPackage.INSTANCE_THING__TYPE_THING:
        if (resolve) return getTypeThing();
        return basicGetTypeThing();
      case IotlangPackage.INSTANCE_THING__ANNOTATIONS:
        return getAnnotations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IotlangPackage.INSTANCE_THING__NAME:
        setName((String)newValue);
        return;
      case IotlangPackage.INSTANCE_THING__NUMBER:
        getNumber().clear();
        getNumber().addAll((Collection<? extends Integer>)newValue);
        return;
      case IotlangPackage.INSTANCE_THING__TYPE_THING:
        setTypeThing((Thing)newValue);
        return;
      case IotlangPackage.INSTANCE_THING__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends PlatformAnnotation>)newValue);
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
      case IotlangPackage.INSTANCE_THING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IotlangPackage.INSTANCE_THING__NUMBER:
        getNumber().clear();
        return;
      case IotlangPackage.INSTANCE_THING__TYPE_THING:
        setTypeThing((Thing)null);
        return;
      case IotlangPackage.INSTANCE_THING__ANNOTATIONS:
        getAnnotations().clear();
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
      case IotlangPackage.INSTANCE_THING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IotlangPackage.INSTANCE_THING__NUMBER:
        return number != null && !number.isEmpty();
      case IotlangPackage.INSTANCE_THING__TYPE_THING:
        return typeThing != null;
      case IotlangPackage.INSTANCE_THING__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", number: ");
    result.append(number);
    result.append(')');
    return result.toString();
  }

} //InstanceThingImpl
