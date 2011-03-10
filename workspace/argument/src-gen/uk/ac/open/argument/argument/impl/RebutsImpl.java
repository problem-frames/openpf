/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.open.argument.argument.Argument;
import uk.ac.open.argument.argument.ArgumentPackage;
import uk.ac.open.argument.argument.Rebuts;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rebuts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.impl.RebutsImpl#getOrigin <em>Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RebutsImpl extends LinkImpl implements Rebuts
{
  /**
   * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrigin()
   * @generated
   * @ordered
   */
  protected Argument origin;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RebutsImpl()
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
    return ArgumentPackage.Literals.REBUTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument getOrigin()
  {
    if (origin != null && origin.eIsProxy())
    {
      InternalEObject oldOrigin = (InternalEObject)origin;
      origin = (Argument)eResolveProxy(oldOrigin);
      if (origin != oldOrigin)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentPackage.REBUTS__ORIGIN, oldOrigin, origin));
      }
    }
    return origin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument basicGetOrigin()
  {
    return origin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrigin(Argument newOrigin)
  {
    Argument oldOrigin = origin;
    origin = newOrigin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.REBUTS__ORIGIN, oldOrigin, origin));
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
      case ArgumentPackage.REBUTS__ORIGIN:
        if (resolve) return getOrigin();
        return basicGetOrigin();
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
      case ArgumentPackage.REBUTS__ORIGIN:
        setOrigin((Argument)newValue);
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
      case ArgumentPackage.REBUTS__ORIGIN:
        setOrigin((Argument)null);
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
      case ArgumentPackage.REBUTS__ORIGIN:
        return origin != null;
    }
    return super.eIsSet(featureID);
  }

} //RebutsImpl
