/**
 * generated by Xtext 2.13.0
 */
package lang.iotlang.impl;

import java.util.Collection;

import lang.iotlang.Channel;
import lang.iotlang.IoTLangModel;
import lang.iotlang.IotlangPackage;
import lang.iotlang.Message;
import lang.iotlang.NetworkConfiguration;
import lang.iotlang.Policy;
import lang.iotlang.Protocol;
import lang.iotlang.Thing;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io TLang Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lang.iotlang.impl.IoTLangModelImpl#getThings <em>Things</em>}</li>
 *   <li>{@link lang.iotlang.impl.IoTLangModelImpl#getPolicies <em>Policies</em>}</li>
 *   <li>{@link lang.iotlang.impl.IoTLangModelImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link lang.iotlang.impl.IoTLangModelImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link lang.iotlang.impl.IoTLangModelImpl#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link lang.iotlang.impl.IoTLangModelImpl#getConfigs <em>Configs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoTLangModelImpl extends MinimalEObjectImpl.Container implements IoTLangModel
{
  /**
   * The cached value of the '{@link #getThings() <em>Things</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThings()
   * @generated
   * @ordered
   */
  protected EList<Thing> things;

  /**
   * The cached value of the '{@link #getPolicies() <em>Policies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicies()
   * @generated
   * @ordered
   */
  protected EList<Policy> policies;

  /**
   * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessages()
   * @generated
   * @ordered
   */
  protected EList<Message> messages;

  /**
   * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannels()
   * @generated
   * @ordered
   */
  protected EList<Channel> channels;

  /**
   * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocols()
   * @generated
   * @ordered
   */
  protected EList<Protocol> protocols;

  /**
   * The cached value of the '{@link #getConfigs() <em>Configs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigs()
   * @generated
   * @ordered
   */
  protected EList<NetworkConfiguration> configs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IoTLangModelImpl()
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
    return IotlangPackage.Literals.IO_TLANG_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Thing> getThings()
  {
    if (things == null)
    {
      things = new EObjectContainmentEList<Thing>(Thing.class, this, IotlangPackage.IO_TLANG_MODEL__THINGS);
    }
    return things;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Policy> getPolicies()
  {
    if (policies == null)
    {
      policies = new EObjectContainmentEList<Policy>(Policy.class, this, IotlangPackage.IO_TLANG_MODEL__POLICIES);
    }
    return policies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Message> getMessages()
  {
    if (messages == null)
    {
      messages = new EObjectContainmentEList<Message>(Message.class, this, IotlangPackage.IO_TLANG_MODEL__MESSAGES);
    }
    return messages;
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
      channels = new EObjectContainmentEList<Channel>(Channel.class, this, IotlangPackage.IO_TLANG_MODEL__CHANNELS);
    }
    return channels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Protocol> getProtocols()
  {
    if (protocols == null)
    {
      protocols = new EObjectContainmentEList<Protocol>(Protocol.class, this, IotlangPackage.IO_TLANG_MODEL__PROTOCOLS);
    }
    return protocols;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NetworkConfiguration> getConfigs()
  {
    if (configs == null)
    {
      configs = new EObjectContainmentEList<NetworkConfiguration>(NetworkConfiguration.class, this, IotlangPackage.IO_TLANG_MODEL__CONFIGS);
    }
    return configs;
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
      case IotlangPackage.IO_TLANG_MODEL__THINGS:
        return ((InternalEList<?>)getThings()).basicRemove(otherEnd, msgs);
      case IotlangPackage.IO_TLANG_MODEL__POLICIES:
        return ((InternalEList<?>)getPolicies()).basicRemove(otherEnd, msgs);
      case IotlangPackage.IO_TLANG_MODEL__MESSAGES:
        return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
      case IotlangPackage.IO_TLANG_MODEL__CHANNELS:
        return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
      case IotlangPackage.IO_TLANG_MODEL__PROTOCOLS:
        return ((InternalEList<?>)getProtocols()).basicRemove(otherEnd, msgs);
      case IotlangPackage.IO_TLANG_MODEL__CONFIGS:
        return ((InternalEList<?>)getConfigs()).basicRemove(otherEnd, msgs);
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
      case IotlangPackage.IO_TLANG_MODEL__THINGS:
        return getThings();
      case IotlangPackage.IO_TLANG_MODEL__POLICIES:
        return getPolicies();
      case IotlangPackage.IO_TLANG_MODEL__MESSAGES:
        return getMessages();
      case IotlangPackage.IO_TLANG_MODEL__CHANNELS:
        return getChannels();
      case IotlangPackage.IO_TLANG_MODEL__PROTOCOLS:
        return getProtocols();
      case IotlangPackage.IO_TLANG_MODEL__CONFIGS:
        return getConfigs();
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
      case IotlangPackage.IO_TLANG_MODEL__THINGS:
        getThings().clear();
        getThings().addAll((Collection<? extends Thing>)newValue);
        return;
      case IotlangPackage.IO_TLANG_MODEL__POLICIES:
        getPolicies().clear();
        getPolicies().addAll((Collection<? extends Policy>)newValue);
        return;
      case IotlangPackage.IO_TLANG_MODEL__MESSAGES:
        getMessages().clear();
        getMessages().addAll((Collection<? extends Message>)newValue);
        return;
      case IotlangPackage.IO_TLANG_MODEL__CHANNELS:
        getChannels().clear();
        getChannels().addAll((Collection<? extends Channel>)newValue);
        return;
      case IotlangPackage.IO_TLANG_MODEL__PROTOCOLS:
        getProtocols().clear();
        getProtocols().addAll((Collection<? extends Protocol>)newValue);
        return;
      case IotlangPackage.IO_TLANG_MODEL__CONFIGS:
        getConfigs().clear();
        getConfigs().addAll((Collection<? extends NetworkConfiguration>)newValue);
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
      case IotlangPackage.IO_TLANG_MODEL__THINGS:
        getThings().clear();
        return;
      case IotlangPackage.IO_TLANG_MODEL__POLICIES:
        getPolicies().clear();
        return;
      case IotlangPackage.IO_TLANG_MODEL__MESSAGES:
        getMessages().clear();
        return;
      case IotlangPackage.IO_TLANG_MODEL__CHANNELS:
        getChannels().clear();
        return;
      case IotlangPackage.IO_TLANG_MODEL__PROTOCOLS:
        getProtocols().clear();
        return;
      case IotlangPackage.IO_TLANG_MODEL__CONFIGS:
        getConfigs().clear();
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
      case IotlangPackage.IO_TLANG_MODEL__THINGS:
        return things != null && !things.isEmpty();
      case IotlangPackage.IO_TLANG_MODEL__POLICIES:
        return policies != null && !policies.isEmpty();
      case IotlangPackage.IO_TLANG_MODEL__MESSAGES:
        return messages != null && !messages.isEmpty();
      case IotlangPackage.IO_TLANG_MODEL__CHANNELS:
        return channels != null && !channels.isEmpty();
      case IotlangPackage.IO_TLANG_MODEL__PROTOCOLS:
        return protocols != null && !protocols.isEmpty();
      case IotlangPackage.IO_TLANG_MODEL__CONFIGS:
        return configs != null && !configs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IoTLangModelImpl
