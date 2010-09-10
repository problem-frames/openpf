/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.namespace.NamespacePackage;
import org.w3.namespace.PostIt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post It</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.PostItImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3.namespace.impl.PostItImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3.namespace.impl.PostItImpl#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link org.w3.namespace.impl.PostItImpl#getYPosition <em>YPosition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostItImpl extends EObjectImpl implements PostIt {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String XPOSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected String xPosition = XPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String YPOSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected String yPosition = YPOSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostItImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.POST_IT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, NamespacePackage.POST_IT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.POST_IT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXPosition() {
		return xPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPosition(String newXPosition) {
		String oldXPosition = xPosition;
		xPosition = newXPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.POST_IT__XPOSITION, oldXPosition, xPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYPosition() {
		return yPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYPosition(String newYPosition) {
		String oldYPosition = yPosition;
		yPosition = newYPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.POST_IT__YPOSITION, oldYPosition, yPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NamespacePackage.POST_IT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NamespacePackage.POST_IT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case NamespacePackage.POST_IT__ID:
				return getId();
			case NamespacePackage.POST_IT__XPOSITION:
				return getXPosition();
			case NamespacePackage.POST_IT__YPOSITION:
				return getYPosition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NamespacePackage.POST_IT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case NamespacePackage.POST_IT__ID:
				setId((String)newValue);
				return;
			case NamespacePackage.POST_IT__XPOSITION:
				setXPosition((String)newValue);
				return;
			case NamespacePackage.POST_IT__YPOSITION:
				setYPosition((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case NamespacePackage.POST_IT__MIXED:
				getMixed().clear();
				return;
			case NamespacePackage.POST_IT__ID:
				setId(ID_EDEFAULT);
				return;
			case NamespacePackage.POST_IT__XPOSITION:
				setXPosition(XPOSITION_EDEFAULT);
				return;
			case NamespacePackage.POST_IT__YPOSITION:
				setYPosition(YPOSITION_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NamespacePackage.POST_IT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case NamespacePackage.POST_IT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NamespacePackage.POST_IT__XPOSITION:
				return XPOSITION_EDEFAULT == null ? xPosition != null : !XPOSITION_EDEFAULT.equals(xPosition);
			case NamespacePackage.POST_IT__YPOSITION:
				return YPOSITION_EDEFAULT == null ? yPosition != null : !YPOSITION_EDEFAULT.equals(yPosition);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", id: ");
		result.append(id);
		result.append(", xPosition: ");
		result.append(xPosition);
		result.append(", yPosition: ");
		result.append(yPosition);
		result.append(')');
		return result.toString();
	}

} //PostItImpl
