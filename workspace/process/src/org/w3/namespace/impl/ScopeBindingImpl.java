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

import org.w3.namespace.KindType1;
import org.w3.namespace.NamespacePackage;
import org.w3.namespace.ScopeBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.ScopeBindingImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ScopeBindingImpl#getNameInParent <em>Name In Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeBindingImpl extends EObjectImpl implements ScopeBinding {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final KindType1 KIND_EDEFAULT = KindType1.COPY_IN;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected KindType1 kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #getNameInParent() <em>Name In Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameInParent()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_IN_PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameInParent() <em>Name In Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameInParent()
	 * @generated
	 * @ordered
	 */
	protected String nameInParent = NAME_IN_PARENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.SCOPE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindType1 getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(KindType1 newKind) {
		KindType1 oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		boolean oldKindESet = kindESet;
		kindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.SCOPE_BINDING__KIND, oldKind, kind, !oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKind() {
		KindType1 oldKind = kind;
		boolean oldKindESet = kindESet;
		kind = KIND_EDEFAULT;
		kindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NamespacePackage.SCOPE_BINDING__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameInParent() {
		return nameInParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameInParent(String newNameInParent) {
		String oldNameInParent = nameInParent;
		nameInParent = newNameInParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.SCOPE_BINDING__NAME_IN_PARENT, oldNameInParent, nameInParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NamespacePackage.SCOPE_BINDING__KIND:
				return getKind();
			case NamespacePackage.SCOPE_BINDING__NAME_IN_PARENT:
				return getNameInParent();
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
			case NamespacePackage.SCOPE_BINDING__KIND:
				setKind((KindType1)newValue);
				return;
			case NamespacePackage.SCOPE_BINDING__NAME_IN_PARENT:
				setNameInParent((String)newValue);
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
			case NamespacePackage.SCOPE_BINDING__KIND:
				unsetKind();
				return;
			case NamespacePackage.SCOPE_BINDING__NAME_IN_PARENT:
				setNameInParent(NAME_IN_PARENT_EDEFAULT);
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
			case NamespacePackage.SCOPE_BINDING__KIND:
				return isSetKind();
			case NamespacePackage.SCOPE_BINDING__NAME_IN_PARENT:
				return NAME_IN_PARENT_EDEFAULT == null ? nameInParent != null : !NAME_IN_PARENT_EDEFAULT.equals(nameInParent);
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
		result.append(" (kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", nameInParent: ");
		result.append(nameInParent);
		result.append(')');
		return result.toString();
	}

} //ScopeBindingImpl
