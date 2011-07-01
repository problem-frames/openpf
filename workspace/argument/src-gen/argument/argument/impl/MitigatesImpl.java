/**
 * <copyright>
 * </copyright>
 *
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
 * <ul>
 *   <li>{@link argument.argument.impl.MitigatesImpl#getRebuttal <em>Rebuttal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MitigatesImpl extends LinkImpl implements Mitigates
{
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
  public Argument getRebuttal()
  {
		if (rebuttal != null && rebuttal.eIsProxy()) {
			InternalEObject oldRebuttal = (InternalEObject)rebuttal;
			rebuttal = (Argument)eResolveProxy(oldRebuttal);
			if (rebuttal != oldRebuttal) {
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
		switch (featureID) {
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
		switch (featureID) {
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
		switch (featureID) {
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
		switch (featureID) {
			case ArgumentPackage.MITIGATES__REBUTTAL:
				return rebuttal != null;
		}
		return super.eIsSet(featureID);
	}

} //MitigatesImpl
