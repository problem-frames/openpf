/**
 * <copyright>
 * </copyright>
 *
 * $Id: CoreLocationImpl.java,v 1.1.1.1 2007/06/13 20:26:42 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.styles.customStyle.impl;

import it.unitn.disi.sistar.modeling.styles.customStyle.CoreLocation;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.CoreLocationImpl#getCoreWidth <em>Core Width</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.CoreLocationImpl#getCoreHeight <em>Core Height</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.CoreLocationImpl#getCoreX <em>Core X</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.CoreLocationImpl#getCoreY <em>Core Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoreLocationImpl extends EObjectImpl implements CoreLocation {
	/**
	 * The default value of the '{@link #getCoreWidth() <em>Core Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int CORE_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoreWidth() <em>Core Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreWidth()
	 * @generated
	 * @ordered
	 */
	protected int coreWidth = CORE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreHeight() <em>Core Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int CORE_HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoreHeight() <em>Core Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreHeight()
	 * @generated
	 * @ordered
	 */
	protected int coreHeight = CORE_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreX() <em>Core X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreX()
	 * @generated
	 * @ordered
	 */
	protected static final int CORE_X_EDEFAULT= 0;

	/**
	 * The cached value of the '{@link #getCoreX() <em>Core X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreX()
	 * @generated
	 * @ordered
	 */
	protected int coreX = CORE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreY() <em>Core Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreY()
	 * @generated
	 * @ordered
	 */
	protected static final int CORE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoreY() <em>Core Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreY()
	 * @generated
	 * @ordered
	 */
	protected int coreY = CORE_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CustomStylePackage.Literals.CORE_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoreX() {
		return coreX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreX(int newCoreX) {
		int oldCoreX = coreX;
		coreX = newCoreX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.CORE_LOCATION__CORE_X, oldCoreX, coreX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoreY() {
		return coreY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreY(int newCoreY) {
		int oldCoreY = coreY;
		coreY = newCoreY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.CORE_LOCATION__CORE_Y, oldCoreY, coreY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoreHeight() {
		return coreHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreHeight(int newCoreHeight) {
		int oldCoreHeight = coreHeight;
		coreHeight = newCoreHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.CORE_LOCATION__CORE_HEIGHT, oldCoreHeight, coreHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoreWidth() {
		return coreWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreWidth(int newCoreWidth) {
		int oldCoreWidth = coreWidth;
		coreWidth = newCoreWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.CORE_LOCATION__CORE_WIDTH, oldCoreWidth, coreWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CustomStylePackage.CORE_LOCATION__CORE_WIDTH:
				return new Integer(getCoreWidth());
			case CustomStylePackage.CORE_LOCATION__CORE_HEIGHT:
				return new Integer(getCoreHeight());
			case CustomStylePackage.CORE_LOCATION__CORE_X:
				return new Integer(getCoreX());
			case CustomStylePackage.CORE_LOCATION__CORE_Y:
				return new Integer(getCoreY());
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
			case CustomStylePackage.CORE_LOCATION__CORE_WIDTH:
				setCoreWidth(((Integer)newValue).intValue());
				return;
			case CustomStylePackage.CORE_LOCATION__CORE_HEIGHT:
				setCoreHeight(((Integer)newValue).intValue());
				return;
			case CustomStylePackage.CORE_LOCATION__CORE_X:
				setCoreX(((Integer)newValue).intValue());
				return;
			case CustomStylePackage.CORE_LOCATION__CORE_Y:
				setCoreY(((Integer)newValue).intValue());
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
			case CustomStylePackage.CORE_LOCATION__CORE_WIDTH:
				setCoreWidth(CORE_WIDTH_EDEFAULT);
				return;
			case CustomStylePackage.CORE_LOCATION__CORE_HEIGHT:
				setCoreHeight(CORE_HEIGHT_EDEFAULT);
				return;
			case CustomStylePackage.CORE_LOCATION__CORE_X:
				setCoreX(CORE_X_EDEFAULT);
				return;
			case CustomStylePackage.CORE_LOCATION__CORE_Y:
				setCoreY(CORE_Y_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CustomStylePackage.CORE_LOCATION__CORE_WIDTH:
				return coreWidth != CORE_WIDTH_EDEFAULT;
			case CustomStylePackage.CORE_LOCATION__CORE_HEIGHT:
				return coreHeight != CORE_HEIGHT_EDEFAULT;
			case CustomStylePackage.CORE_LOCATION__CORE_X:
				return coreX != CORE_X_EDEFAULT;
			case CustomStylePackage.CORE_LOCATION__CORE_Y:
				return coreY != CORE_Y_EDEFAULT;
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
		result.append(" (coreWidth: ");
		result.append(coreWidth);
		result.append(", coreHeight: ");
		result.append(coreHeight);
		result.append(", coreX: ");
		result.append(coreX);
		result.append(", coreY: ");
		result.append(coreY);
		result.append(')');
		return result.toString();
	}

} //CoreLocationImpl