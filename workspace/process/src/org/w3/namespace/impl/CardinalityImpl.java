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

import org.w3.namespace.Cardinality;
import org.w3.namespace.ControlParameter;
import org.w3.namespace.NamespacePackage;
import org.w3.namespace.PredicateExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.CardinalityImpl#getControlParameter <em>Control Parameter</em>}</li>
 *   <li>{@link org.w3.namespace.impl.CardinalityImpl#getPredicateExpression <em>Predicate Expression</em>}</li>
 *   <li>{@link org.w3.namespace.impl.CardinalityImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3.namespace.impl.CardinalityImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.w3.namespace.impl.CardinalityImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardinalityImpl extends EObjectImpl implements Cardinality {
	/**
	 * The cached value of the '{@link #getControlParameter() <em>Control Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlParameter()
	 * @generated
	 * @ordered
	 */
	protected ControlParameter controlParameter;

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
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected String lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected String upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardinalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.CARDINALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlParameter getControlParameter() {
		return controlParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlParameter(ControlParameter newControlParameter, NotificationChain msgs) {
		ControlParameter oldControlParameter = controlParameter;
		controlParameter = newControlParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.CARDINALITY__CONTROL_PARAMETER, oldControlParameter, newControlParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlParameter(ControlParameter newControlParameter) {
		if (newControlParameter != controlParameter) {
			NotificationChain msgs = null;
			if (controlParameter != null)
				msgs = ((InternalEObject)controlParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CARDINALITY__CONTROL_PARAMETER, null, msgs);
			if (newControlParameter != null)
				msgs = ((InternalEObject)newControlParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CARDINALITY__CONTROL_PARAMETER, null, msgs);
			msgs = basicSetControlParameter(newControlParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.CARDINALITY__CONTROL_PARAMETER, newControlParameter, newControlParameter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.CARDINALITY__PREDICATE_EXPRESSION, oldPredicateExpression, newPredicateExpression);
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
				msgs = ((InternalEObject)predicateExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CARDINALITY__PREDICATE_EXPRESSION, null, msgs);
			if (newPredicateExpression != null)
				msgs = ((InternalEObject)newPredicateExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CARDINALITY__PREDICATE_EXPRESSION, null, msgs);
			msgs = basicSetPredicateExpression(newPredicateExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.CARDINALITY__PREDICATE_EXPRESSION, newPredicateExpression, newPredicateExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.CARDINALITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(String newLowerBound) {
		String oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.CARDINALITY__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(String newUpperBound) {
		String oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.CARDINALITY__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NamespacePackage.CARDINALITY__CONTROL_PARAMETER:
				return basicSetControlParameter(null, msgs);
			case NamespacePackage.CARDINALITY__PREDICATE_EXPRESSION:
				return basicSetPredicateExpression(null, msgs);
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
			case NamespacePackage.CARDINALITY__CONTROL_PARAMETER:
				return getControlParameter();
			case NamespacePackage.CARDINALITY__PREDICATE_EXPRESSION:
				return getPredicateExpression();
			case NamespacePackage.CARDINALITY__ID:
				return getId();
			case NamespacePackage.CARDINALITY__LOWER_BOUND:
				return getLowerBound();
			case NamespacePackage.CARDINALITY__UPPER_BOUND:
				return getUpperBound();
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
			case NamespacePackage.CARDINALITY__CONTROL_PARAMETER:
				setControlParameter((ControlParameter)newValue);
				return;
			case NamespacePackage.CARDINALITY__PREDICATE_EXPRESSION:
				setPredicateExpression((PredicateExpression)newValue);
				return;
			case NamespacePackage.CARDINALITY__ID:
				setId((String)newValue);
				return;
			case NamespacePackage.CARDINALITY__LOWER_BOUND:
				setLowerBound((String)newValue);
				return;
			case NamespacePackage.CARDINALITY__UPPER_BOUND:
				setUpperBound((String)newValue);
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
			case NamespacePackage.CARDINALITY__CONTROL_PARAMETER:
				setControlParameter((ControlParameter)null);
				return;
			case NamespacePackage.CARDINALITY__PREDICATE_EXPRESSION:
				setPredicateExpression((PredicateExpression)null);
				return;
			case NamespacePackage.CARDINALITY__ID:
				setId(ID_EDEFAULT);
				return;
			case NamespacePackage.CARDINALITY__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case NamespacePackage.CARDINALITY__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
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
			case NamespacePackage.CARDINALITY__CONTROL_PARAMETER:
				return controlParameter != null;
			case NamespacePackage.CARDINALITY__PREDICATE_EXPRESSION:
				return predicateExpression != null;
			case NamespacePackage.CARDINALITY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NamespacePackage.CARDINALITY__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
			case NamespacePackage.CARDINALITY__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}

} //CardinalityImpl
