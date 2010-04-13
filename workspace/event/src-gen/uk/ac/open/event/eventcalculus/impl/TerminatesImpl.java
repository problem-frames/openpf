/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.open.event.eventcalculus.EventcalculusPackage;
import uk.ac.open.event.eventcalculus.Term;
import uk.ac.open.event.eventcalculus.Terminates;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.TerminatesImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.TerminatesImpl#getFluent <em>Fluent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminatesImpl extends TemporalPredicateImpl implements Terminates
{
  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected Term event;

  /**
   * The cached value of the '{@link #getFluent() <em>Fluent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFluent()
   * @generated
   * @ordered
   */
  protected Term fluent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TerminatesImpl()
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
    return EventcalculusPackage.Literals.TERMINATES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term getEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvent(Term newEvent, NotificationChain msgs)
  {
    Term oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventcalculusPackage.TERMINATES__EVENT, oldEvent, newEvent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(Term newEvent)
  {
    if (newEvent != event)
    {
      NotificationChain msgs = null;
      if (event != null)
        msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventcalculusPackage.TERMINATES__EVENT, null, msgs);
      if (newEvent != null)
        msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventcalculusPackage.TERMINATES__EVENT, null, msgs);
      msgs = basicSetEvent(newEvent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.TERMINATES__EVENT, newEvent, newEvent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term getFluent()
  {
    return fluent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFluent(Term newFluent, NotificationChain msgs)
  {
    Term oldFluent = fluent;
    fluent = newFluent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventcalculusPackage.TERMINATES__FLUENT, oldFluent, newFluent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFluent(Term newFluent)
  {
    if (newFluent != fluent)
    {
      NotificationChain msgs = null;
      if (fluent != null)
        msgs = ((InternalEObject)fluent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventcalculusPackage.TERMINATES__FLUENT, null, msgs);
      if (newFluent != null)
        msgs = ((InternalEObject)newFluent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventcalculusPackage.TERMINATES__FLUENT, null, msgs);
      msgs = basicSetFluent(newFluent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.TERMINATES__FLUENT, newFluent, newFluent));
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
      case EventcalculusPackage.TERMINATES__EVENT:
        return basicSetEvent(null, msgs);
      case EventcalculusPackage.TERMINATES__FLUENT:
        return basicSetFluent(null, msgs);
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
      case EventcalculusPackage.TERMINATES__EVENT:
        return getEvent();
      case EventcalculusPackage.TERMINATES__FLUENT:
        return getFluent();
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
      case EventcalculusPackage.TERMINATES__EVENT:
        setEvent((Term)newValue);
        return;
      case EventcalculusPackage.TERMINATES__FLUENT:
        setFluent((Term)newValue);
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
      case EventcalculusPackage.TERMINATES__EVENT:
        setEvent((Term)null);
        return;
      case EventcalculusPackage.TERMINATES__FLUENT:
        setFluent((Term)null);
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
      case EventcalculusPackage.TERMINATES__EVENT:
        return event != null;
      case EventcalculusPackage.TERMINATES__FLUENT:
        return fluent != null;
    }
    return super.eIsSet(featureID);
  }

} //TerminatesImpl
