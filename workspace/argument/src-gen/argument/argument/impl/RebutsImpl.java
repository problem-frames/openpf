/**
 * <copyright>
 * </copyright>
 *
 */
package argument.argument.impl;

import argument.argument.Argument;
import argument.argument.ArgumentPackage;
import argument.argument.Rebuts;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rebuts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link argument.argument.impl.RebutsImpl#getDenies <em>Denies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RebutsImpl extends LinkImpl implements Rebuts
{
  /**
	 * The cached value of the '{@link #getDenies() <em>Denies</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDenies()
	 * @generated
	 * @ordered
	 */
  protected Argument denies;

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
  public Argument getDenies()
  {
		if (denies != null && denies.eIsProxy()) {
			InternalEObject oldDenies = (InternalEObject)denies;
			denies = (Argument)eResolveProxy(oldDenies);
			if (denies != oldDenies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentPackage.REBUTS__DENIES, oldDenies, denies));
			}
		}
		return denies;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Argument basicGetDenies()
  {
		return denies;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDenies(Argument newDenies)
  {
		Argument oldDenies = denies;
		denies = newDenies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.REBUTS__DENIES, oldDenies, denies));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ArgumentPackage.REBUTS__DENIES:
				if (resolve) return getDenies();
				return basicGetDenies();
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
		switch (featureID) {
			case ArgumentPackage.REBUTS__DENIES:
				setDenies((Argument)newValue);
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
		switch (featureID) {
			case ArgumentPackage.REBUTS__DENIES:
				setDenies((Argument)null);
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
		switch (featureID) {
			case ArgumentPackage.REBUTS__DENIES:
				return denies != null;
		}
		return super.eIsSet(featureID);
	}

} //RebutsImpl
