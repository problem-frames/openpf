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

import org.w3.namespace.Binding;
import org.w3.namespace.ChannelBinding;
import org.w3.namespace.ConstantBinding;
import org.w3.namespace.NamespacePackage;
import org.w3.namespace.ScopeBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.BindingImpl#getScopeBinding <em>Scope Binding</em>}</li>
 *   <li>{@link org.w3.namespace.impl.BindingImpl#getChannelBinding <em>Channel Binding</em>}</li>
 *   <li>{@link org.w3.namespace.impl.BindingImpl#getConstantBinding <em>Constant Binding</em>}</li>
 *   <li>{@link org.w3.namespace.impl.BindingImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3.namespace.impl.BindingImpl#getNameInChild <em>Name In Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends EObjectImpl implements Binding {
	/**
	 * The cached value of the '{@link #getScopeBinding() <em>Scope Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeBinding()
	 * @generated
	 * @ordered
	 */
	protected ScopeBinding scopeBinding;

	/**
	 * The cached value of the '{@link #getChannelBinding() <em>Channel Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelBinding()
	 * @generated
	 * @ordered
	 */
	protected ChannelBinding channelBinding;

	/**
	 * The cached value of the '{@link #getConstantBinding() <em>Constant Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantBinding()
	 * @generated
	 * @ordered
	 */
	protected ConstantBinding constantBinding;

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
	 * The default value of the '{@link #getNameInChild() <em>Name In Child</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameInChild()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_IN_CHILD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameInChild() <em>Name In Child</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameInChild()
	 * @generated
	 * @ordered
	 */
	protected String nameInChild = NAME_IN_CHILD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeBinding getScopeBinding() {
		return scopeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScopeBinding(ScopeBinding newScopeBinding, NotificationChain msgs) {
		ScopeBinding oldScopeBinding = scopeBinding;
		scopeBinding = newScopeBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.BINDING__SCOPE_BINDING, oldScopeBinding, newScopeBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeBinding(ScopeBinding newScopeBinding) {
		if (newScopeBinding != scopeBinding) {
			NotificationChain msgs = null;
			if (scopeBinding != null)
				msgs = ((InternalEObject)scopeBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.BINDING__SCOPE_BINDING, null, msgs);
			if (newScopeBinding != null)
				msgs = ((InternalEObject)newScopeBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.BINDING__SCOPE_BINDING, null, msgs);
			msgs = basicSetScopeBinding(newScopeBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.BINDING__SCOPE_BINDING, newScopeBinding, newScopeBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelBinding getChannelBinding() {
		return channelBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannelBinding(ChannelBinding newChannelBinding, NotificationChain msgs) {
		ChannelBinding oldChannelBinding = channelBinding;
		channelBinding = newChannelBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.BINDING__CHANNEL_BINDING, oldChannelBinding, newChannelBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelBinding(ChannelBinding newChannelBinding) {
		if (newChannelBinding != channelBinding) {
			NotificationChain msgs = null;
			if (channelBinding != null)
				msgs = ((InternalEObject)channelBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.BINDING__CHANNEL_BINDING, null, msgs);
			if (newChannelBinding != null)
				msgs = ((InternalEObject)newChannelBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.BINDING__CHANNEL_BINDING, null, msgs);
			msgs = basicSetChannelBinding(newChannelBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.BINDING__CHANNEL_BINDING, newChannelBinding, newChannelBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantBinding getConstantBinding() {
		return constantBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantBinding(ConstantBinding newConstantBinding, NotificationChain msgs) {
		ConstantBinding oldConstantBinding = constantBinding;
		constantBinding = newConstantBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NamespacePackage.BINDING__CONSTANT_BINDING, oldConstantBinding, newConstantBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantBinding(ConstantBinding newConstantBinding) {
		if (newConstantBinding != constantBinding) {
			NotificationChain msgs = null;
			if (constantBinding != null)
				msgs = ((InternalEObject)constantBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.BINDING__CONSTANT_BINDING, null, msgs);
			if (newConstantBinding != null)
				msgs = ((InternalEObject)newConstantBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NamespacePackage.BINDING__CONSTANT_BINDING, null, msgs);
			msgs = basicSetConstantBinding(newConstantBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.BINDING__CONSTANT_BINDING, newConstantBinding, newConstantBinding));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.BINDING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameInChild() {
		return nameInChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameInChild(String newNameInChild) {
		String oldNameInChild = nameInChild;
		nameInChild = newNameInChild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.BINDING__NAME_IN_CHILD, oldNameInChild, nameInChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NamespacePackage.BINDING__SCOPE_BINDING:
				return basicSetScopeBinding(null, msgs);
			case NamespacePackage.BINDING__CHANNEL_BINDING:
				return basicSetChannelBinding(null, msgs);
			case NamespacePackage.BINDING__CONSTANT_BINDING:
				return basicSetConstantBinding(null, msgs);
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
			case NamespacePackage.BINDING__SCOPE_BINDING:
				return getScopeBinding();
			case NamespacePackage.BINDING__CHANNEL_BINDING:
				return getChannelBinding();
			case NamespacePackage.BINDING__CONSTANT_BINDING:
				return getConstantBinding();
			case NamespacePackage.BINDING__ID:
				return getId();
			case NamespacePackage.BINDING__NAME_IN_CHILD:
				return getNameInChild();
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
			case NamespacePackage.BINDING__SCOPE_BINDING:
				setScopeBinding((ScopeBinding)newValue);
				return;
			case NamespacePackage.BINDING__CHANNEL_BINDING:
				setChannelBinding((ChannelBinding)newValue);
				return;
			case NamespacePackage.BINDING__CONSTANT_BINDING:
				setConstantBinding((ConstantBinding)newValue);
				return;
			case NamespacePackage.BINDING__ID:
				setId((String)newValue);
				return;
			case NamespacePackage.BINDING__NAME_IN_CHILD:
				setNameInChild((String)newValue);
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
			case NamespacePackage.BINDING__SCOPE_BINDING:
				setScopeBinding((ScopeBinding)null);
				return;
			case NamespacePackage.BINDING__CHANNEL_BINDING:
				setChannelBinding((ChannelBinding)null);
				return;
			case NamespacePackage.BINDING__CONSTANT_BINDING:
				setConstantBinding((ConstantBinding)null);
				return;
			case NamespacePackage.BINDING__ID:
				setId(ID_EDEFAULT);
				return;
			case NamespacePackage.BINDING__NAME_IN_CHILD:
				setNameInChild(NAME_IN_CHILD_EDEFAULT);
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
			case NamespacePackage.BINDING__SCOPE_BINDING:
				return scopeBinding != null;
			case NamespacePackage.BINDING__CHANNEL_BINDING:
				return channelBinding != null;
			case NamespacePackage.BINDING__CONSTANT_BINDING:
				return constantBinding != null;
			case NamespacePackage.BINDING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NamespacePackage.BINDING__NAME_IN_CHILD:
				return NAME_IN_CHILD_EDEFAULT == null ? nameInChild != null : !NAME_IN_CHILD_EDEFAULT.equals(nameInChild);
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
		result.append(", nameInChild: ");
		result.append(nameInChild);
		result.append(')');
		return result.toString();
	}

} //BindingImpl
