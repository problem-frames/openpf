/**
 */
package uk.ac.open.event.eventcalculus.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.open.event.eventcalculus.AssignMin;
import uk.ac.open.event.eventcalculus.EventcalculusPackage;
import uk.ac.open.event.eventcalculus.Expression;
import uk.ac.open.event.eventcalculus.Qualifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign Min</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.AssignMinImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.AssignMinImpl#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignMinImpl extends ExpressionImpl implements AssignMin
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expression left;

  /**
   * The cached value of the '{@link #getQ() <em>Q</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQ()
   * @generated
   * @ordered
   */
  protected Qualifier q;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignMinImpl()
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
    return EventcalculusPackage.Literals.ASSIGN_MIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs)
  {
    Expression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventcalculusPackage.ASSIGN_MIN__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeft(Expression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventcalculusPackage.ASSIGN_MIN__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventcalculusPackage.ASSIGN_MIN__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.ASSIGN_MIN__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Qualifier getQ()
  {
    return q;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQ(Qualifier newQ, NotificationChain msgs)
  {
    Qualifier oldQ = q;
    q = newQ;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventcalculusPackage.ASSIGN_MIN__Q, oldQ, newQ);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQ(Qualifier newQ)
  {
    if (newQ != q)
    {
      NotificationChain msgs = null;
      if (q != null)
        msgs = ((InternalEObject)q).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventcalculusPackage.ASSIGN_MIN__Q, null, msgs);
      if (newQ != null)
        msgs = ((InternalEObject)newQ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventcalculusPackage.ASSIGN_MIN__Q, null, msgs);
      msgs = basicSetQ(newQ, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.ASSIGN_MIN__Q, newQ, newQ));
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
      case EventcalculusPackage.ASSIGN_MIN__LEFT:
        return basicSetLeft(null, msgs);
      case EventcalculusPackage.ASSIGN_MIN__Q:
        return basicSetQ(null, msgs);
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
      case EventcalculusPackage.ASSIGN_MIN__LEFT:
        return getLeft();
      case EventcalculusPackage.ASSIGN_MIN__Q:
        return getQ();
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
      case EventcalculusPackage.ASSIGN_MIN__LEFT:
        setLeft((Expression)newValue);
        return;
      case EventcalculusPackage.ASSIGN_MIN__Q:
        setQ((Qualifier)newValue);
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
      case EventcalculusPackage.ASSIGN_MIN__LEFT:
        setLeft((Expression)null);
        return;
      case EventcalculusPackage.ASSIGN_MIN__Q:
        setQ((Qualifier)null);
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
      case EventcalculusPackage.ASSIGN_MIN__LEFT:
        return left != null;
      case EventcalculusPackage.ASSIGN_MIN__Q:
        return q != null;
    }
    return super.eIsSet(featureID);
  }

} //AssignMinImpl
