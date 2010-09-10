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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.namespace.Aggregate;
import org.w3.namespace.Field;
import org.w3.namespace.Kind4;
import org.w3.namespace.NamespacePackage;
import org.w3.namespace.NullAggregate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.FieldImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3.namespace.impl.FieldImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3.namespace.impl.FieldImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.w3.namespace.impl.FieldImpl#getNullAggregate <em>Null Aggregate</em>}</li>
 *   <li>{@link org.w3.namespace.impl.FieldImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.w3.namespace.impl.FieldImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends EObjectImpl implements Field {
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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final Kind4 KIND_EDEFAULT = Kind4.AGGREGATE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Kind4 kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, NamespacePackage.FIELD__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(NamespacePackage.Literals.FIELD__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Aggregate> getAggregate() {
		return getGroup().list(NamespacePackage.Literals.FIELD__AGGREGATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NullAggregate> getNullAggregate() {
		return getGroup().list(NamespacePackage.Literals.FIELD__NULL_AGGREGATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind4 getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(Kind4 newKind) {
		Kind4 oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		boolean oldKindESet = kindESet;
		kindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.FIELD__KIND, oldKind, kind, !oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKind() {
		Kind4 oldKind = kind;
		boolean oldKindESet = kindESet;
		kind = KIND_EDEFAULT;
		kindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NamespacePackage.FIELD__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NamespacePackage.FIELD__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case NamespacePackage.FIELD__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case NamespacePackage.FIELD__AGGREGATE:
				return ((InternalEList<?>)getAggregate()).basicRemove(otherEnd, msgs);
			case NamespacePackage.FIELD__NULL_AGGREGATE:
				return ((InternalEList<?>)getNullAggregate()).basicRemove(otherEnd, msgs);
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
			case NamespacePackage.FIELD__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case NamespacePackage.FIELD__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case NamespacePackage.FIELD__AGGREGATE:
				return getAggregate();
			case NamespacePackage.FIELD__NULL_AGGREGATE:
				return getNullAggregate();
			case NamespacePackage.FIELD__KIND:
				return getKind();
			case NamespacePackage.FIELD__NAME:
				return getName();
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
			case NamespacePackage.FIELD__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case NamespacePackage.FIELD__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case NamespacePackage.FIELD__AGGREGATE:
				getAggregate().clear();
				getAggregate().addAll((Collection<? extends Aggregate>)newValue);
				return;
			case NamespacePackage.FIELD__NULL_AGGREGATE:
				getNullAggregate().clear();
				getNullAggregate().addAll((Collection<? extends NullAggregate>)newValue);
				return;
			case NamespacePackage.FIELD__KIND:
				setKind((Kind4)newValue);
				return;
			case NamespacePackage.FIELD__NAME:
				setName((String)newValue);
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
			case NamespacePackage.FIELD__MIXED:
				getMixed().clear();
				return;
			case NamespacePackage.FIELD__GROUP:
				getGroup().clear();
				return;
			case NamespacePackage.FIELD__AGGREGATE:
				getAggregate().clear();
				return;
			case NamespacePackage.FIELD__NULL_AGGREGATE:
				getNullAggregate().clear();
				return;
			case NamespacePackage.FIELD__KIND:
				unsetKind();
				return;
			case NamespacePackage.FIELD__NAME:
				setName(NAME_EDEFAULT);
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
			case NamespacePackage.FIELD__MIXED:
				return mixed != null && !mixed.isEmpty();
			case NamespacePackage.FIELD__GROUP:
				return !getGroup().isEmpty();
			case NamespacePackage.FIELD__AGGREGATE:
				return !getAggregate().isEmpty();
			case NamespacePackage.FIELD__NULL_AGGREGATE:
				return !getNullAggregate().isEmpty();
			case NamespacePackage.FIELD__KIND:
				return isSetKind();
			case NamespacePackage.FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
