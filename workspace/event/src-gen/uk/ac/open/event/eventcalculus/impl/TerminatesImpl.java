/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

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
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.TerminatesImpl#getArgs2 <em>Args2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminatesImpl extends TemporalPredicateImpl implements Terminates
{
  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected Term event;

  /**
   * The cached value of the '{@link #getFluent() <em>Fluent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFluent()
   * @generated
   * @ordered
   */
  protected Term fluent;

  /**
   * The cached value of the '{@link #getArgs2() <em>Args2</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs2()
   * @generated
   * @ordered
   */
  protected EList<String> args2;

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
    if (event != null && event.eIsProxy())
    {
      InternalEObject oldEvent = (InternalEObject)event;
      event = (Term)eResolveProxy(oldEvent);
      if (event != oldEvent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventcalculusPackage.TERMINATES__EVENT, oldEvent, event));
      }
    }
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term basicGetEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(Term newEvent)
  {
    Term oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.TERMINATES__EVENT, oldEvent, event));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term getFluent()
  {
    if (fluent != null && fluent.eIsProxy())
    {
      InternalEObject oldFluent = (InternalEObject)fluent;
      fluent = (Term)eResolveProxy(oldFluent);
      if (fluent != oldFluent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventcalculusPackage.TERMINATES__FLUENT, oldFluent, fluent));
      }
    }
    return fluent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term basicGetFluent()
  {
    return fluent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFluent(Term newFluent)
  {
    Term oldFluent = fluent;
    fluent = newFluent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.TERMINATES__FLUENT, oldFluent, fluent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getArgs2()
  {
    if (args2 == null)
    {
      args2 = new EDataTypeEList<String>(String.class, this, EventcalculusPackage.TERMINATES__ARGS2);
    }
    return args2;
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
        if (resolve) return getEvent();
        return basicGetEvent();
      case EventcalculusPackage.TERMINATES__FLUENT:
        if (resolve) return getFluent();
        return basicGetFluent();
      case EventcalculusPackage.TERMINATES__ARGS2:
        return getArgs2();
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
      case EventcalculusPackage.TERMINATES__EVENT:
        setEvent((Term)newValue);
        return;
      case EventcalculusPackage.TERMINATES__FLUENT:
        setFluent((Term)newValue);
        return;
      case EventcalculusPackage.TERMINATES__ARGS2:
        getArgs2().clear();
        getArgs2().addAll((Collection<? extends String>)newValue);
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
      case EventcalculusPackage.TERMINATES__ARGS2:
        getArgs2().clear();
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
      case EventcalculusPackage.TERMINATES__ARGS2:
        return args2 != null && !args2.isEmpty();
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
    result.append(" (args2: ");
    result.append(args2);
    result.append(')');
    return result.toString();
  }

} //TerminatesImpl
