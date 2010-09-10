/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.w3.namespace.NamespacePackage;
import org.w3.namespace.PreOrPost1;
import org.w3.namespace.RequisiteConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requisite Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.RequisiteConnectorImpl#getPreOrPost <em>Pre Or Post</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequisiteConnectorImpl extends EObjectImpl implements RequisiteConnector {
	/**
	 * The default value of the '{@link #getPreOrPost() <em>Pre Or Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreOrPost()
	 * @generated
	 * @ordered
	 */
	protected static final PreOrPost1 PRE_OR_POST_EDEFAULT = PreOrPost1.PRE;

	/**
	 * The cached value of the '{@link #getPreOrPost() <em>Pre Or Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreOrPost()
	 * @generated
	 * @ordered
	 */
	protected PreOrPost1 preOrPost = PRE_OR_POST_EDEFAULT;

	/**
	 * This is true if the Pre Or Post attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preOrPostESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequisiteConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.REQUISITE_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreOrPost1 getPreOrPost() {
		return preOrPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreOrPost(PreOrPost1 newPreOrPost) {
		PreOrPost1 oldPreOrPost = preOrPost;
		preOrPost = newPreOrPost == null ? PRE_OR_POST_EDEFAULT : newPreOrPost;
		boolean oldPreOrPostESet = preOrPostESet;
		preOrPostESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.REQUISITE_CONNECTOR__PRE_OR_POST, oldPreOrPost, preOrPost, !oldPreOrPostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreOrPost() {
		PreOrPost1 oldPreOrPost = preOrPost;
		boolean oldPreOrPostESet = preOrPostESet;
		preOrPost = PRE_OR_POST_EDEFAULT;
		preOrPostESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NamespacePackage.REQUISITE_CONNECTOR__PRE_OR_POST, oldPreOrPost, PRE_OR_POST_EDEFAULT, oldPreOrPostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPreOrPost() {
		return preOrPostESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NamespacePackage.REQUISITE_CONNECTOR__PRE_OR_POST:
				return getPreOrPost();
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
			case NamespacePackage.REQUISITE_CONNECTOR__PRE_OR_POST:
				setPreOrPost((PreOrPost1)newValue);
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
			case NamespacePackage.REQUISITE_CONNECTOR__PRE_OR_POST:
				unsetPreOrPost();
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
			case NamespacePackage.REQUISITE_CONNECTOR__PRE_OR_POST:
				return isSetPreOrPost();
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
		result.append(" (preOrPost: ");
		if (preOrPostESet) result.append(preOrPost); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RequisiteConnectorImpl
