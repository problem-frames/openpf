/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompositionImpl.java,v 1.1.1.1 2007/02/25 22:46:39 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos.impl;

import it.unitn.disi.sistar.modeling.tropos.Composition;
import it.unitn.disi.sistar.modeling.tropos.ECompositionType;
import it.unitn.disi.sistar.modeling.tropos.TroposPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.impl.CompositionImpl#getCompositionType <em>Composition Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositionImpl extends RelationImpl implements Composition {
	/**
	 * The default value of the '{@link #getCompositionType() <em>Composition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionType()
	 * @generated
	 * @ordered
	 */
	protected static final ECompositionType COMPOSITION_TYPE_EDEFAULT = ECompositionType.AND_LITERAL;

	/**
	 * The cached value of the '{@link #getCompositionType() <em>Composition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionType()
	 * @generated
	 * @ordered
	 */
	protected ECompositionType compositionType = COMPOSITION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TroposPackage.Literals.COMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECompositionType getCompositionType() {
		return compositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositionType(ECompositionType newCompositionType) {
		ECompositionType oldCompositionType = compositionType;
		compositionType = newCompositionType == null ? COMPOSITION_TYPE_EDEFAULT : newCompositionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposPackage.COMPOSITION__COMPOSITION_TYPE, oldCompositionType, compositionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TroposPackage.COMPOSITION__COMPOSITION_TYPE:
				return getCompositionType();
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
			case TroposPackage.COMPOSITION__COMPOSITION_TYPE:
				setCompositionType((ECompositionType)newValue);
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
			case TroposPackage.COMPOSITION__COMPOSITION_TYPE:
				setCompositionType(COMPOSITION_TYPE_EDEFAULT);
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
			case TroposPackage.COMPOSITION__COMPOSITION_TYPE:
				return compositionType != null;
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
		result.append(" (compositionType: ");
		result.append(compositionType);
		result.append(')');
		return result.toString();
	}

} //CompositionImpl