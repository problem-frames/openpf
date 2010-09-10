/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.namespace.Binding;
import org.w3.namespace.Connector;
import org.w3.namespace.HandlerConnector;
import org.w3.namespace.NamespacePackage;
import org.w3.namespace.ReactionConnector;
import org.w3.namespace.RequisiteConnector;
import org.w3.namespace.SimpleRequisiteConnector;
import org.w3.namespace.StepDeclaration;
import org.w3.namespace.StepReference;
import org.w3.namespace.SubstepConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.ConnectorImpl#getRequisiteConnector <em>Requisite Connector</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ConnectorImpl#getSimpleRequisiteConnector <em>Simple Requisite Connector</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ConnectorImpl#getSubstepConnector <em>Substep Connector</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ConnectorImpl#getReactionConnector <em>Reaction Connector</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ConnectorImpl#getHandlerConnector <em>Handler Connector</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ConnectorImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ConnectorImpl#getStepDeclaration <em>Step Declaration</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ConnectorImpl#getStepReference <em>Step Reference</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ConnectorImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends EObjectImpl implements Connector {
	/**
	 * The cached value of the '{@link #getRequisiteConnector() <em>Requisite Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequisiteConnector()
	 * @generated
	 * @ordered
	 */
	protected RequisiteConnector requisiteConnector;

	/**
	 * The cached value of the '{@link #getSimpleRequisiteConnector() <em>Simple Requisite Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleRequisiteConnector()
	 * @generated
	 * @ordered
	 */
	protected SimpleRequisiteConnector simpleRequisiteConnector;

	/**
	 * The cached value of the '{@link #getSubstepConnector() <em>Substep Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstepConnector()
	 * @generated
	 * @ordered
	 */
	protected SubstepConnector substepConnector;

	/**
	 * The cached value of the '{@link #getReactionConnector() <em>Reaction Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionConnector()
	 * @generated
	 * @ordered
	 */
	protected ReactionConnector reactionConnector;

	/**
	 * The cached value of the '{@link #getHandlerConnector() <em>Handler Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerConnector()
	 * @generated
	 * @ordered
	 */
	protected HandlerConnector handlerConnector;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> binding;

	/**
	 * The cached value of the '{@link #getStepDeclaration() <em>Step Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepDeclaration()
	 * @generated
	 * @ordered
	 */
	protected StepDeclaration stepDeclaration;

	/**
	 * The cached value of the '{@link #getStepReference() <em>Step Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepReference()
	 * @generated
	 * @ordered
	 */
	protected StepReference stepReference;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequisiteConnector getRequisiteConnector() {
		return requisiteConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequisiteConnector(RequisiteConnector newRequisiteConnector, NotificationChain msgs) {
		RequisiteConnector oldRequisiteConnector = requisiteConnector;
		requisiteConnector = newRequisiteConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.CONNECTOR__REQUISITE_CONNECTOR, oldRequisiteConnector, newRequisiteConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequisiteConnector(RequisiteConnector newRequisiteConnector) {
		if (newRequisiteConnector != requisiteConnector) {
			NotificationChain msgs = null;
			if (requisiteConnector != null)
				msgs = ((InternalEObject)requisiteConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONNECTOR__REQUISITE_CONNECTOR, null, msgs);
			if (newRequisiteConnector != null)
				msgs = ((InternalEObject)newRequisiteConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONNECTOR__REQUISITE_CONNECTOR, null, msgs);
			msgs = basicSetRequisiteConnector(newRequisiteConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.CONNECTOR__REQUISITE_CONNECTOR, newRequisiteConnector, newRequisiteConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRequisiteConnector getSimpleRequisiteConnector() {
		return simpleRequisiteConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleRequisiteConnector(SimpleRequisiteConnector newSimpleRequisiteConnector, NotificationChain msgs) {
		SimpleRequisiteConnector oldSimpleRequisiteConnector = simpleRequisiteConnector;
		simpleRequisiteConnector = newSimpleRequisiteConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.CONNECTOR__SIMPLE_REQUISITE_CONNECTOR, oldSimpleRequisiteConnector, newSimpleRequisiteConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleRequisiteConnector(SimpleRequisiteConnector newSimpleRequisiteConnector) {
		if (newSimpleRequisiteConnector != simpleRequisiteConnector) {
			NotificationChain msgs = null;
			if (simpleRequisiteConnector != null)
				msgs = ((InternalEObject)simpleRequisiteConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONNECTOR__SIMPLE_REQUISITE_CONNECTOR, null, msgs);
			if (newSimpleRequisiteConnector != null)
				msgs = ((InternalEObject)newSimpleRequisiteConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONNECTOR__SIMPLE_REQUISITE_CONNECTOR, null, msgs);
			msgs = basicSetSimpleRequisiteConnector(newSimpleRequisiteConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.CONNECTOR__SIMPLE_REQUISITE_CONNECTOR, newSimpleRequisiteConnector, newSimpleRequisiteConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstepConnector getSubstepConnector() {
		return substepConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstepConnector(SubstepConnector newSubstepConnector, NotificationChain msgs) {
		SubstepConnector oldSubstepConnector = substepConnector;
		substepConnector = newSubstepConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.CONNECTOR__SUBSTEP_CONNECTOR, oldSubstepConnector, newSubstepConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstepConnector(SubstepConnector newSubstepConnector) {
		if (newSubstepConnector != substepConnector) {
			NotificationChain msgs = null;
			if (substepConnector != null)
				msgs = ((InternalEObject)substepConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONNECTOR__SUBSTEP_CONNECTOR, null, msgs);
			if (newSubstepConnector != null)
				msgs = ((InternalEObject)newSubstepConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONNECTOR__SUBSTEP_CONNECTOR, null, msgs);
			msgs = basicSetSubstepConnector(newSubstepConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.CONNECTOR__SUBSTEP_CONNECTOR, newSubstepConnector, newSubstepConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionConnector getReactionConnector() {
		return reactionConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReactionConnector(ReactionConnector newReactionConnector, NotificationChain msgs) {
		ReactionConnector oldReactionConnector = reactionConnector;
		reactionConnector = newReactionConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.CONNECTOR__REACTION_CONNECTOR, oldReactionConnector, newReactionConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactionConnector(ReactionConnector newReactionConnector) {
		if (newReactionConnector != reactionConnector) {
			NotificationChain msgs = null;
			if (reactionConnector != null)
				msgs = ((InternalEObject)reactionConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONNECTOR__REACTION_CONNECTOR, null, msgs);
			if (newReactionConnector != null)
				msgs = ((InternalEObject)newReactionConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONNECTOR__REACTION_CONNECTOR, null, msgs);
			msgs = basicSetReactionConnector(newReactionConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.CONNECTOR__REACTION_CONNECTOR, newReactionConnector, newReactionConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlerConnector getHandlerConnector() {
		return handlerConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandlerConnector(HandlerConnector newHandlerConnector, NotificationChain msgs) {
		HandlerConnector oldHandlerConnector = handlerConnector;
		handlerConnector = newHandlerConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.CONNECTOR__HANDLER_CONNECTOR, oldHandlerConnector, newHandlerConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerConnector(HandlerConnector newHandlerConnector) {
		if (newHandlerConnector != handlerConnector) {
			NotificationChain msgs = null;
			if (handlerConnector != null)
				msgs = ((InternalEObject)handlerConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONNECTOR__HANDLER_CONNECTOR, null, msgs);
			if (newHandlerConnector != null)
				msgs = ((InternalEObject)newHandlerConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONNECTOR__HANDLER_CONNECTOR, null, msgs);
			msgs = basicSetHandlerConnector(newHandlerConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.CONNECTOR__HANDLER_CONNECTOR, newHandlerConnector, newHandlerConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<Binding>(Binding.class, this, NamespacePackage.CONNECTOR__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepDeclaration getStepDeclaration() {
		return stepDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStepDeclaration(StepDeclaration newStepDeclaration, NotificationChain msgs) {
		StepDeclaration oldStepDeclaration = stepDeclaration;
		stepDeclaration = newStepDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.CONNECTOR__STEP_DECLARATION, oldStepDeclaration, newStepDeclaration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepDeclaration(StepDeclaration newStepDeclaration) {
		if (newStepDeclaration != stepDeclaration) {
			NotificationChain msgs = null;
			if (stepDeclaration != null)
				msgs = ((InternalEObject)stepDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONNECTOR__STEP_DECLARATION, null, msgs);
			if (newStepDeclaration != null)
				msgs = ((InternalEObject)newStepDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONNECTOR__STEP_DECLARATION, null, msgs);
			msgs = basicSetStepDeclaration(newStepDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.CONNECTOR__STEP_DECLARATION, newStepDeclaration, newStepDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepReference getStepReference() {
		return stepReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStepReference(StepReference newStepReference, NotificationChain msgs) {
		StepReference oldStepReference = stepReference;
		stepReference = newStepReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.CONNECTOR__STEP_REFERENCE, oldStepReference, newStepReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepReference(StepReference newStepReference) {
		if (newStepReference != stepReference) {
			NotificationChain msgs = null;
			if (stepReference != null)
				msgs = ((InternalEObject)stepReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONNECTOR__STEP_REFERENCE, null, msgs);
			if (newStepReference != null)
				msgs = ((InternalEObject)newStepReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.CONNECTOR__STEP_REFERENCE, null, msgs);
			msgs = basicSetStepReference(newStepReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.CONNECTOR__STEP_REFERENCE, newStepReference, newStepReference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.CONNECTOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NamespacePackage.CONNECTOR__REQUISITE_CONNECTOR:
				return basicSetRequisiteConnector(null, msgs);
			case NamespacePackage.CONNECTOR__SIMPLE_REQUISITE_CONNECTOR:
				return basicSetSimpleRequisiteConnector(null, msgs);
			case NamespacePackage.CONNECTOR__SUBSTEP_CONNECTOR:
				return basicSetSubstepConnector(null, msgs);
			case NamespacePackage.CONNECTOR__REACTION_CONNECTOR:
				return basicSetReactionConnector(null, msgs);
			case NamespacePackage.CONNECTOR__HANDLER_CONNECTOR:
				return basicSetHandlerConnector(null, msgs);
			case NamespacePackage.CONNECTOR__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
			case NamespacePackage.CONNECTOR__STEP_DECLARATION:
				return basicSetStepDeclaration(null, msgs);
			case NamespacePackage.CONNECTOR__STEP_REFERENCE:
				return basicSetStepReference(null, msgs);
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
			case NamespacePackage.CONNECTOR__REQUISITE_CONNECTOR:
				return getRequisiteConnector();
			case NamespacePackage.CONNECTOR__SIMPLE_REQUISITE_CONNECTOR:
				return getSimpleRequisiteConnector();
			case NamespacePackage.CONNECTOR__SUBSTEP_CONNECTOR:
				return getSubstepConnector();
			case NamespacePackage.CONNECTOR__REACTION_CONNECTOR:
				return getReactionConnector();
			case NamespacePackage.CONNECTOR__HANDLER_CONNECTOR:
				return getHandlerConnector();
			case NamespacePackage.CONNECTOR__BINDING:
				return getBinding();
			case NamespacePackage.CONNECTOR__STEP_DECLARATION:
				return getStepDeclaration();
			case NamespacePackage.CONNECTOR__STEP_REFERENCE:
				return getStepReference();
			case NamespacePackage.CONNECTOR__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NamespacePackage.CONNECTOR__REQUISITE_CONNECTOR:
				setRequisiteConnector((RequisiteConnector)newValue);
				return;
			case NamespacePackage.CONNECTOR__SIMPLE_REQUISITE_CONNECTOR:
				setSimpleRequisiteConnector((SimpleRequisiteConnector)newValue);
				return;
			case NamespacePackage.CONNECTOR__SUBSTEP_CONNECTOR:
				setSubstepConnector((SubstepConnector)newValue);
				return;
			case NamespacePackage.CONNECTOR__REACTION_CONNECTOR:
				setReactionConnector((ReactionConnector)newValue);
				return;
			case NamespacePackage.CONNECTOR__HANDLER_CONNECTOR:
				setHandlerConnector((HandlerConnector)newValue);
				return;
			case NamespacePackage.CONNECTOR__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends Binding>)newValue);
				return;
			case NamespacePackage.CONNECTOR__STEP_DECLARATION:
				setStepDeclaration((StepDeclaration)newValue);
				return;
			case NamespacePackage.CONNECTOR__STEP_REFERENCE:
				setStepReference((StepReference)newValue);
				return;
			case NamespacePackage.CONNECTOR__ID:
				setId((String)newValue);
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
			case NamespacePackage.CONNECTOR__REQUISITE_CONNECTOR:
				setRequisiteConnector((RequisiteConnector)null);
				return;
			case NamespacePackage.CONNECTOR__SIMPLE_REQUISITE_CONNECTOR:
				setSimpleRequisiteConnector((SimpleRequisiteConnector)null);
				return;
			case NamespacePackage.CONNECTOR__SUBSTEP_CONNECTOR:
				setSubstepConnector((SubstepConnector)null);
				return;
			case NamespacePackage.CONNECTOR__REACTION_CONNECTOR:
				setReactionConnector((ReactionConnector)null);
				return;
			case NamespacePackage.CONNECTOR__HANDLER_CONNECTOR:
				setHandlerConnector((HandlerConnector)null);
				return;
			case NamespacePackage.CONNECTOR__BINDING:
				getBinding().clear();
				return;
			case NamespacePackage.CONNECTOR__STEP_DECLARATION:
				setStepDeclaration((StepDeclaration)null);
				return;
			case NamespacePackage.CONNECTOR__STEP_REFERENCE:
				setStepReference((StepReference)null);
				return;
			case NamespacePackage.CONNECTOR__ID:
				setId(ID_EDEFAULT);
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
			case NamespacePackage.CONNECTOR__REQUISITE_CONNECTOR:
				return requisiteConnector != null;
			case NamespacePackage.CONNECTOR__SIMPLE_REQUISITE_CONNECTOR:
				return simpleRequisiteConnector != null;
			case NamespacePackage.CONNECTOR__SUBSTEP_CONNECTOR:
				return substepConnector != null;
			case NamespacePackage.CONNECTOR__REACTION_CONNECTOR:
				return reactionConnector != null;
			case NamespacePackage.CONNECTOR__HANDLER_CONNECTOR:
				return handlerConnector != null;
			case NamespacePackage.CONNECTOR__BINDING:
				return binding != null && !binding.isEmpty();
			case NamespacePackage.CONNECTOR__STEP_DECLARATION:
				return stepDeclaration != null;
			case NamespacePackage.CONNECTOR__STEP_REFERENCE:
				return stepReference != null;
			case NamespacePackage.CONNECTOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
