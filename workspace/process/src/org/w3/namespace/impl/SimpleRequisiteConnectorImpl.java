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

import org.w3.namespace.ExternalObject;
import org.w3.namespace.NamespacePackage;
import org.w3.namespace.PreOrPost;
import org.w3.namespace.PredicateExpression;
import org.w3.namespace.SimpleRequisiteConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Requisite Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.SimpleRequisiteConnectorImpl#getPredicateExpression <em>Predicate Expression</em>}</li>
 *   <li>{@link org.w3.namespace.impl.SimpleRequisiteConnectorImpl#getExternalObject <em>External Object</em>}</li>
 *   <li>{@link org.w3.namespace.impl.SimpleRequisiteConnectorImpl#getPreOrPost <em>Pre Or Post</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleRequisiteConnectorImpl extends EObjectImpl implements SimpleRequisiteConnector {
	/**
	 * The cached value of the '{@link #getPredicateExpression() <em>Predicate Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicateExpression()
	 * @generated
	 * @ordered
	 */
	protected PredicateExpression predicateExpression;

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
	 * The default value of the '{@link #getPreOrPost() <em>Pre Or Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreOrPost()
	 * @generated
	 * @ordered
	 */
	protected static final PreOrPost PRE_OR_POST_EDEFAULT = PreOrPost.PRE;

	/**
	 * The cached value of the '{@link #getPreOrPost() <em>Pre Or Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreOrPost()
	 * @generated
	 * @ordered
	 */
	protected PreOrPost preOrPost = PRE_OR_POST_EDEFAULT;

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
	protected SimpleRequisiteConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.SIMPLE_REQUISITE_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateExpression getPredicateExpression() {
		return predicateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicateExpression(PredicateExpression newPredicateExpression, NotificationChain msgs) {
		PredicateExpression oldPredicateExpression = predicateExpression;
		predicateExpression = newPredicateExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__PREDICATE_EXPRESSION, oldPredicateExpression, newPredicateExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicateExpression(PredicateExpression newPredicateExpression) {
		if (newPredicateExpression != predicateExpression) {
			NotificationChain msgs = null;
			if (predicateExpression != null)
				msgs = ((InternalEObject)predicateExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__PREDICATE_EXPRESSION, null, msgs);
			if (newPredicateExpression != null)
				msgs = ((InternalEObject)newPredicateExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__PREDICATE_EXPRESSION, null, msgs);
			msgs = basicSetPredicateExpression(newPredicateExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__PREDICATE_EXPRESSION, newPredicateExpression, newPredicateExpression));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__EXTERNAL_OBJECT, oldExternalObject, newExternalObject);
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
				msgs = ((InternalEObject)externalObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__EXTERNAL_OBJECT, null, msgs);
			if (newExternalObject != null)
				msgs = ((InternalEObject)newExternalObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__EXTERNAL_OBJECT, null, msgs);
			msgs = basicSetExternalObject(newExternalObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__EXTERNAL_OBJECT, newExternalObject, newExternalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreOrPost getPreOrPost() {
		return preOrPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreOrPost(PreOrPost newPreOrPost) {
		PreOrPost oldPreOrPost = preOrPost;
		preOrPost = newPreOrPost == null ? PRE_OR_POST_EDEFAULT : newPreOrPost;
		boolean oldPreOrPostESet = preOrPostESet;
		preOrPostESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__PRE_OR_POST, oldPreOrPost, preOrPost, !oldPreOrPostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreOrPost() {
		PreOrPost oldPreOrPost = preOrPost;
		boolean oldPreOrPostESet = preOrPostESet;
		preOrPost = PRE_OR_POST_EDEFAULT;
		preOrPostESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__PRE_OR_POST, oldPreOrPost, PRE_OR_POST_EDEFAULT, oldPreOrPostESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__PREDICATE_EXPRESSION:
				return basicSetPredicateExpression(null, msgs);
			case NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__EXTERNAL_OBJECT:
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
			case NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__PREDICATE_EXPRESSION:
				return getPredicateExpression();
			case NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__EXTERNAL_OBJECT:
				return getExternalObject();
			case NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__PRE_OR_POST:
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
			case NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__PREDICATE_EXPRESSION:
				setPredicateExpression((PredicateExpression)newValue);
				return;
			case NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__EXTERNAL_OBJECT:
				setExternalObject((ExternalObject)newValue);
				return;
			case NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__PRE_OR_POST:
				setPreOrPost((PreOrPost)newValue);
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
			case NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__PREDICATE_EXPRESSION:
				setPredicateExpression((PredicateExpression)null);
				return;
			case NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__EXTERNAL_OBJECT:
				setExternalObject((ExternalObject)null);
				return;
			case NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__PRE_OR_POST:
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
			case NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__PREDICATE_EXPRESSION:
				return predicateExpression != null;
			case NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__EXTERNAL_OBJECT:
				return externalObject != null;
			case NamespacePackage.SIMPLE_REQUISITE_CONNECTOR__PRE_OR_POST:
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

} //SimpleRequisiteConnectorImpl
