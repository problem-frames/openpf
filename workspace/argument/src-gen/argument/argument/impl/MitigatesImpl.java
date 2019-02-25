/**
 */
package argument.argument.impl;

import argument.argument.Argument;
import argument.argument.ArgumentPackage;
import argument.argument.Mitigates;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mitigates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link argument.argument.impl.MitigatesImpl#getRestores <em>Restores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MitigatesImpl extends LinkImpl implements Mitigates
{
  /**
   * The cached value of the '{@link #getRestores() <em>Restores</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestores()
   * @generated
   * @ordered
   */
  protected Argument restores;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MitigatesImpl()
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
    return ArgumentPackage.Literals.MITIGATES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Argument getRestores()
  {
    if (restores != null && restores.eIsProxy())
    {
      InternalEObject oldRestores = (InternalEObject)restores;
      restores = (Argument)eResolveProxy(oldRestores);
      if (restores != oldRestores)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentPackage.MITIGATES__RESTORES, oldRestores, restores));
      }
    }
    return restores;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument basicGetRestores()
  {
    return restores;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRestores(Argument newRestores)
  {
    Argument oldRestores = restores;
    restores = newRestores;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.MITIGATES__RESTORES, oldRestores, restores));
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
      case ArgumentPackage.MITIGATES__RESTORES:
        if (resolve) return getRestores();
        return basicGetRestores();
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
      case ArgumentPackage.MITIGATES__RESTORES:
        setRestores((Argument)newValue);
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
      case ArgumentPackage.MITIGATES__RESTORES:
        setRestores((Argument)null);
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
      case ArgumentPackage.MITIGATES__RESTORES:
        return restores != null;
    }
    return super.eIsSet(featureID);
  }

} //MitigatesImpl
