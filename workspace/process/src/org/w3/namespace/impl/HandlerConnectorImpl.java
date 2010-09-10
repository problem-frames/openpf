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

import org.w3.namespace.ContinuationAction;
import org.w3.namespace.ExternalObject;
import org.w3.namespace.HandlerConnector;
import org.w3.namespace.NamespacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handler Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.HandlerConnectorImpl#getExternalObject <em>External Object</em>}</li>
 *   <li>{@link org.w3.namespace.impl.HandlerConnectorImpl#getContinuationAction <em>Continuation Action</em>}</li>
 *   <li>{@link org.w3.namespace.impl.HandlerConnectorImpl#getParameterName <em>Parameter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandlerConnectorImpl extends EObjectImpl implements HandlerConnector {
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
	 * The default value of the '{@link #getContinuationAction() <em>Continuation Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuationAction()
	 * @generated
	 * @ordered
	 */
	protected static final ContinuationAction CONTINUATION_ACTION_EDEFAULT = ContinuationAction.COMPLETE;

	/**
	 * The cached value of the '{@link #getContinuationAction() <em>Continuation Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuationAction()
	 * @generated
	 * @ordered
	 */
	protected ContinuationAction continuationAction = CONTINUATION_ACTION_EDEFAULT;

	/**
	 * This is true if the Continuation Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean continuationActionESet;

	/**
	 * The default value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected String parameterName = PARAMETER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandlerConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.HANDLER_CONNECTOR;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.HANDLER_CONNECTOR__EXTERNAL_OBJECT, oldExternalObject, newExternalObject);
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
				msgs = ((InternalEObject)externalObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.HANDLER_CONNECTOR__EXTERNAL_OBJECT, null, msgs);
			if (newExternalObject != null)
				msgs = ((InternalEObject)newExternalObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.HANDLER_CONNECTOR__EXTERNAL_OBJECT, null, msgs);
			msgs = basicSetExternalObject(newExternalObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.HANDLER_CONNECTOR__EXTERNAL_OBJECT, newExternalObject, newExternalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationAction getContinuationAction() {
		return continuationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuationAction(ContinuationAction newContinuationAction) {
		ContinuationAction oldContinuationAction = continuationAction;
		continuationAction = newContinuationAction == null ? CONTINUATION_ACTION_EDEFAULT : newContinuationAction;
		boolean oldContinuationActionESet = continuationActionESet;
		continuationActionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.HANDLER_CONNECTOR__CONTINUATION_ACTION, oldContinuationAction, continuationAction, !oldContinuationActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContinuationAction() {
		ContinuationAction oldContinuationAction = continuationAction;
		boolean oldContinuationActionESet = continuationActionESet;
		continuationAction = CONTINUATION_ACTION_EDEFAULT;
		continuationActionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NamespacePackage.HANDLER_CONNECTOR__CONTINUATION_ACTION, oldContinuationAction, CONTINUATION_ACTION_EDEFAULT, oldContinuationActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContinuationAction() {
		return continuationActionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterName(String newParameterName) {
		String oldParameterName = parameterName;
		parameterName = newParameterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.HANDLER_CONNECTOR__PARAMETER_NAME, oldParameterName, parameterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NamespacePackage.HANDLER_CONNECTOR__EXTERNAL_OBJECT:
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
			case NamespacePackage.HANDLER_CONNECTOR__EXTERNAL_OBJECT:
				return getExternalObject();
			case NamespacePackage.HANDLER_CONNECTOR__CONTINUATION_ACTION:
				return getContinuationAction();
			case NamespacePackage.HANDLER_CONNECTOR__PARAMETER_NAME:
				return getParameterName();
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
			case NamespacePackage.HANDLER_CONNECTOR__EXTERNAL_OBJECT:
				setExternalObject((ExternalObject)newValue);
				return;
			case NamespacePackage.HANDLER_CONNECTOR__CONTINUATION_ACTION:
				setContinuationAction((ContinuationAction)newValue);
				return;
			case NamespacePackage.HANDLER_CONNECTOR__PARAMETER_NAME:
				setParameterName((String)newValue);
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
			case NamespacePackage.HANDLER_CONNECTOR__EXTERNAL_OBJECT:
				setExternalObject((ExternalObject)null);
				return;
			case NamespacePackage.HANDLER_CONNECTOR__CONTINUATION_ACTION:
				unsetContinuationAction();
				return;
			case NamespacePackage.HANDLER_CONNECTOR__PARAMETER_NAME:
				setParameterName(PARAMETER_NAME_EDEFAULT);
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
			case NamespacePackage.HANDLER_CONNECTOR__EXTERNAL_OBJECT:
				return externalObject != null;
			case NamespacePackage.HANDLER_CONNECTOR__CONTINUATION_ACTION:
				return isSetContinuationAction();
			case NamespacePackage.HANDLER_CONNECTOR__PARAMETER_NAME:
				return PARAMETER_NAME_EDEFAULT == null ? parameterName != null : !PARAMETER_NAME_EDEFAULT.equals(parameterName);
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
		result.append(" (continuationAction: ");
		if (continuationActionESet) result.append(continuationAction); else result.append("<unset>");
		result.append(", parameterName: ");
		result.append(parameterName);
		result.append(')');
		return result.toString();
	}

} //HandlerConnectorImpl
