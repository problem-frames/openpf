/**
 * <copyright>
 * </copyright>
 *
 * $Id: OwnershipImpl.java,v 1.3 2007/07/24 09:08:24 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos.impl;

import it.unitn.disi.sistar.modeling.tropos.EInstantiationType;
import it.unitn.disi.sistar.modeling.tropos.EOwnershipType;
import it.unitn.disi.sistar.modeling.tropos.Ownership;
import it.unitn.disi.sistar.modeling.tropos.TroposPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ownership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.impl.OwnershipImpl#getOwnershipType <em>Ownership Type</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.impl.OwnershipImpl#getInstantiation <em>Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwnershipImpl extends RelationImpl implements Ownership {
	/**
	 * The default value of the '{@link #getOwnershipType() <em>Ownership Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnershipType()
	 * @generated
	 * @ordered
	 */
	protected static final EOwnershipType OWNERSHIP_TYPE_EDEFAULT = EOwnershipType.OWN_LITERAL;

	/**
	 * The cached value of the '{@link #getOwnershipType() <em>Ownership Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnershipType()
	 * @generated
	 * @ordered
	 */
	protected EOwnershipType ownershipType = OWNERSHIP_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstantiation() <em>Instantiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiation()
	 * @generated
	 * @ordered
	 */
	protected static final EInstantiationType INSTANTIATION_EDEFAULT = EInstantiationType.EXISTENTIAL_LITERAL;

	/**
	 * The cached value of the '{@link #getInstantiation() <em>Instantiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiation()
	 * @generated
	 * @ordered
	 */
	protected EInstantiationType instantiation = INSTANTIATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwnershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TroposPackage.Literals.OWNERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOwnershipType getOwnershipType() {
		return ownershipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnershipType(EOwnershipType newOwnershipType) {
		EOwnershipType oldOwnershipType = ownershipType;
		ownershipType = newOwnershipType == null ? OWNERSHIP_TYPE_EDEFAULT : newOwnershipType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposPackage.OWNERSHIP__OWNERSHIP_TYPE, oldOwnershipType, ownershipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EInstantiationType getInstantiation() {
		return instantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiation(EInstantiationType newInstantiation) {
		EInstantiationType oldInstantiation = instantiation;
		instantiation = newInstantiation == null ? INSTANTIATION_EDEFAULT : newInstantiation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposPackage.OWNERSHIP__INSTANTIATION, oldInstantiation, instantiation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TroposPackage.OWNERSHIP__OWNERSHIP_TYPE:
				return getOwnershipType();
			case TroposPackage.OWNERSHIP__INSTANTIATION:
				return getInstantiation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TroposPackage.OWNERSHIP__OWNERSHIP_TYPE:
				setOwnershipType((EOwnershipType)newValue);
				return;
			case TroposPackage.OWNERSHIP__INSTANTIATION:
				setInstantiation((EInstantiationType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case TroposPackage.OWNERSHIP__OWNERSHIP_TYPE:
				setOwnershipType(OWNERSHIP_TYPE_EDEFAULT);
				return;
			case TroposPackage.OWNERSHIP__INSTANTIATION:
				setInstantiation(INSTANTIATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TroposPackage.OWNERSHIP__OWNERSHIP_TYPE:
				return ownershipType != null;
			case TroposPackage.OWNERSHIP__INSTANTIATION:
				return instantiation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ownershipType: ");
		result.append(ownershipType);
		result.append(", instantiation: ");
		result.append(instantiation);
		result.append(')');
		return result.toString();
	}

} //OwnershipImpl