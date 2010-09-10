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

import org.w3.namespace.ConstantBinding;
import org.w3.namespace.ExternalObject;
import org.w3.namespace.NamespacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.ConstantBindingImpl#getExternalObject <em>External Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantBindingImpl extends EObjectImpl implements ConstantBinding {
	/**
	 * The cached value of the '{@link #getExternalObject() <em>External Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalObject()
	 * @generated
	 * @ordered
	 */
	protected ExternalObject externalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.CONSTANT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalObject getExternalObject() {
		return externalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalObject(ExternalObject newExternalObject, NotificationChain msgs) {
		ExternalObject oldExternalObject = externalObject;
		externalObject = newExternalObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.CONSTANT_BINDING__EXTERNAL_OBJECT, oldExternalObject, newExternalObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalObject(ExternalObject newExternalObject) {
		if (newExternalObject != externalObject) {
			NotificationChain msgs = null;
			if (externalObject != null)
				msgs = ((InternalEObject)externalObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONSTANT_BINDING__EXTERNAL_OBJECT, null, msgs);
			if (newExternalObject != null)
				msgs = ((InternalEObject)newExternalObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONSTANT_BINDING__EXTERNAL_OBJECT, null, msgs);
			msgs = basicSetExternalObject(newExternalObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.CONSTANT_BINDING__EXTERNAL_OBJECT, newExternalObject, newExternalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NamespacePackage.CONSTANT_BINDING__EXTERNAL_OBJECT:
				return basicSetExternalObject(null, msgs);
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
			case NamespacePackage.CONSTANT_BINDING__EXTERNAL_OBJECT:
				return getExternalObject();
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
			case NamespacePackage.CONSTANT_BINDING__EXTERNAL_OBJECT:
				setExternalObject((ExternalObject)newValue);
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
			case NamespacePackage.CONSTANT_BINDING__EXTERNAL_OBJECT:
				setExternalObject((ExternalObject)null);
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
			case NamespacePackage.CONSTANT_BINDING__EXTERNAL_OBJECT:
				return externalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstantBindingImpl
