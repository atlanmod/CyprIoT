/**
 * generated by Xtext 2.13.0
 */
package lang.iotlang.impl;

import java.util.Collection;

import lang.iotlang.Bus;
import lang.iotlang.Channel;
import lang.iotlang.Channeling;
import lang.iotlang.Instance;
import lang.iotlang.InstanceGateway;
import lang.iotlang.IotlangPackage;
import lang.iotlang.PlatformAnnotation;
import lang.iotlang.Port;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channeling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lang.iotlang.impl.ChannelingImpl#getName <em>Name</em>}</li>
 *   <li>{@link lang.iotlang.impl.ChannelingImpl#getThinginst <em>Thinginst</em>}</li>
 *   <li>{@link lang.iotlang.impl.ChannelingImpl#getPort <em>Port</em>}</li>
 *   <li>{@link lang.iotlang.impl.ChannelingImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link lang.iotlang.impl.ChannelingImpl#getSrv <em>Srv</em>}</li>
 *   <li>{@link lang.iotlang.impl.ChannelingImpl#getBuses <em>Buses</em>}</li>
 *   <li>{@link lang.iotlang.impl.ChannelingImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link lang.iotlang.impl.ChannelingImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelingImpl extends MinimalEObjectImpl.Container implements Channeling
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
   * The cached value of the '{@link #getThinginst() <em>Thinginst</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThinginst()
   * @generated
   * @ordered
   */
  protected Instance thinginst;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected Port port;

  /**
   * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected static final String DIRECTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected String direction = DIRECTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getSrv() <em>Srv</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrv()
   * @generated
   * @ordered
   */
  protected InstanceGateway srv;

  /**
   * The cached value of the '{@link #getBuses() <em>Buses</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuses()
   * @generated
   * @ordered
   */
  protected Bus buses;

  /**
   * The cached value of the '{@link #getChannels() <em>Channels</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannels()
   * @generated
   * @ordered
   */
  protected EList<Channel> channels;

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
  protected ChannelingImpl()
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
    return IotlangPackage.Literals.CHANNELING;
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
      eNotify(new ENotificationImpl(this, Notification.SET, IotlangPackage.CHANNELING__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance getThinginst()
  {
    if (thinginst != null && thinginst.eIsProxy())
    {
      InternalEObject oldThinginst = (InternalEObject)thinginst;
      thinginst = (Instance)eResolveProxy(oldThinginst);
      if (thinginst != oldThinginst)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotlangPackage.CHANNELING__THINGINST, oldThinginst, thinginst));
      }
    }
    return thinginst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance basicGetThinginst()
  {
    return thinginst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThinginst(Instance newThinginst)
  {
    Instance oldThinginst = thinginst;
    thinginst = newThinginst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotlangPackage.CHANNELING__THINGINST, oldThinginst, thinginst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port getPort()
  {
    if (port != null && port.eIsProxy())
    {
      InternalEObject oldPort = (InternalEObject)port;
      port = (Port)eResolveProxy(oldPort);
      if (port != oldPort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotlangPackage.CHANNELING__PORT, oldPort, port));
      }
    }
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port basicGetPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(Port newPort)
  {
    Port oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotlangPackage.CHANNELING__PORT, oldPort, port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(String newDirection)
  {
    String oldDirection = direction;
    direction = newDirection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotlangPackage.CHANNELING__DIRECTION, oldDirection, direction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceGateway getSrv()
  {
    if (srv != null && srv.eIsProxy())
    {
      InternalEObject oldSrv = (InternalEObject)srv;
      srv = (InstanceGateway)eResolveProxy(oldSrv);
      if (srv != oldSrv)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotlangPackage.CHANNELING__SRV, oldSrv, srv));
      }
    }
    return srv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceGateway basicGetSrv()
  {
    return srv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrv(InstanceGateway newSrv)
  {
    InstanceGateway oldSrv = srv;
    srv = newSrv;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotlangPackage.CHANNELING__SRV, oldSrv, srv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bus getBuses()
  {
    if (buses != null && buses.eIsProxy())
    {
      InternalEObject oldBuses = (InternalEObject)buses;
      buses = (Bus)eResolveProxy(oldBuses);
      if (buses != oldBuses)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotlangPackage.CHANNELING__BUSES, oldBuses, buses));
      }
    }
    return buses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bus basicGetBuses()
  {
    return buses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuses(Bus newBuses)
  {
    Bus oldBuses = buses;
    buses = newBuses;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotlangPackage.CHANNELING__BUSES, oldBuses, buses));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Channel> getChannels()
  {
    if (channels == null)
    {
      channels = new EObjectResolvingEList<Channel>(Channel.class, this, IotlangPackage.CHANNELING__CHANNELS);
    }
    return channels;
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
      annotations = new EObjectContainmentEList<PlatformAnnotation>(PlatformAnnotation.class, this, IotlangPackage.CHANNELING__ANNOTATIONS);
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
      case IotlangPackage.CHANNELING__ANNOTATIONS:
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
      case IotlangPackage.CHANNELING__NAME:
        return getName();
      case IotlangPackage.CHANNELING__THINGINST:
        if (resolve) return getThinginst();
        return basicGetThinginst();
      case IotlangPackage.CHANNELING__PORT:
        if (resolve) return getPort();
        return basicGetPort();
      case IotlangPackage.CHANNELING__DIRECTION:
        return getDirection();
      case IotlangPackage.CHANNELING__SRV:
        if (resolve) return getSrv();
        return basicGetSrv();
      case IotlangPackage.CHANNELING__BUSES:
        if (resolve) return getBuses();
        return basicGetBuses();
      case IotlangPackage.CHANNELING__CHANNELS:
        return getChannels();
      case IotlangPackage.CHANNELING__ANNOTATIONS:
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
      case IotlangPackage.CHANNELING__NAME:
        setName((String)newValue);
        return;
      case IotlangPackage.CHANNELING__THINGINST:
        setThinginst((Instance)newValue);
        return;
      case IotlangPackage.CHANNELING__PORT:
        setPort((Port)newValue);
        return;
      case IotlangPackage.CHANNELING__DIRECTION:
        setDirection((String)newValue);
        return;
      case IotlangPackage.CHANNELING__SRV:
        setSrv((InstanceGateway)newValue);
        return;
      case IotlangPackage.CHANNELING__BUSES:
        setBuses((Bus)newValue);
        return;
      case IotlangPackage.CHANNELING__CHANNELS:
        getChannels().clear();
        getChannels().addAll((Collection<? extends Channel>)newValue);
        return;
      case IotlangPackage.CHANNELING__ANNOTATIONS:
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
      case IotlangPackage.CHANNELING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IotlangPackage.CHANNELING__THINGINST:
        setThinginst((Instance)null);
        return;
      case IotlangPackage.CHANNELING__PORT:
        setPort((Port)null);
        return;
      case IotlangPackage.CHANNELING__DIRECTION:
        setDirection(DIRECTION_EDEFAULT);
        return;
      case IotlangPackage.CHANNELING__SRV:
        setSrv((InstanceGateway)null);
        return;
      case IotlangPackage.CHANNELING__BUSES:
        setBuses((Bus)null);
        return;
      case IotlangPackage.CHANNELING__CHANNELS:
        getChannels().clear();
        return;
      case IotlangPackage.CHANNELING__ANNOTATIONS:
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
      case IotlangPackage.CHANNELING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IotlangPackage.CHANNELING__THINGINST:
        return thinginst != null;
      case IotlangPackage.CHANNELING__PORT:
        return port != null;
      case IotlangPackage.CHANNELING__DIRECTION:
        return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
      case IotlangPackage.CHANNELING__SRV:
        return srv != null;
      case IotlangPackage.CHANNELING__BUSES:
        return buses != null;
      case IotlangPackage.CHANNELING__CHANNELS:
        return channels != null && !channels.isEmpty();
      case IotlangPackage.CHANNELING__ANNOTATIONS:
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
    result.append(", direction: ");
    result.append(direction);
    result.append(')');
    return result.toString();
  }

} //ChannelingImpl
