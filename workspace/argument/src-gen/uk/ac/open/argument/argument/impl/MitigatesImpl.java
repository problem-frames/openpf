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
import uk.ac.open.argument.argument.Mitigates;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mitigates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.impl.MitigatesImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.MitigatesImpl#getRebuttal <em>Rebuttal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MitigatesImpl extends LinkImpl implements Mitigates
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
   * The cached value of the '{@link #getRebuttal() <em>Rebuttal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRebuttal()
   * @generated
   * @ordered
   */
  protected Argument rebuttal;

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
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.MITIGATES__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument getRebuttal()
  {
    if (rebuttal != null && rebuttal.eIsProxy())
    {
      InternalEObject oldRebuttal = (InternalEObject)rebuttal;
      rebuttal = (Argument)eResolveProxy(oldRebuttal);
      if (rebuttal != oldRebuttal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentPackage.MITIGATES__REBUTTAL, oldRebuttal, rebuttal));
      }
    }
    return rebuttal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument basicGetRebuttal()
  {
    return rebuttal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRebuttal(Argument newRebuttal)
  {
    Argument oldRebuttal = rebuttal;
    rebuttal = newRebuttal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.MITIGATES__REBUTTAL, oldRebuttal, rebuttal));
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
      case ArgumentPackage.MITIGATES__NAME:
        return getName();
      case ArgumentPackage.MITIGATES__REBUTTAL:
        if (resolve) return getRebuttal();
        return basicGetRebuttal();
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
      case ArgumentPackage.MITIGATES__NAME:
        setName((String)newValue);
        return;
      case ArgumentPackage.MITIGATES__REBUTTAL:
        setRebuttal((Argument)newValue);
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
      case ArgumentPackage.MITIGATES__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ArgumentPackage.MITIGATES__REBUTTAL:
        setRebuttal((Argument)null);
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
      case ArgumentPackage.MITIGATES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ArgumentPackage.MITIGATES__REBUTTAL:
        return rebuttal != null;
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
    result.append(')');
    return result.toString();
  }

} //MitigatesImpl
