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

import org.w3.namespace.Aborter;
import org.w3.namespace.Connector;
import org.w3.namespace.InterfaceDecl;
import org.w3.namespace.KindType;
import org.w3.namespace.NamespacePackage;
import org.w3.namespace.StepDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.StepDeclarationImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3.namespace.impl.StepDeclarationImpl#getInterfaceDecl <em>Interface Decl</em>}</li>
 *   <li>{@link org.w3.namespace.impl.StepDeclarationImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.w3.namespace.impl.StepDeclarationImpl#getAborter <em>Aborter</em>}</li>
 *   <li>{@link org.w3.namespace.impl.StepDeclarationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3.namespace.impl.StepDeclarationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.w3.namespace.impl.StepDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepDeclarationImpl extends EObjectImpl implements StepDeclaration {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final KindType KIND_EDEFAULT = KindType.SEQUENTIAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected KindType kind = KIND_EDEFAULT;

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
	protected StepDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.STEP_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, NamespacePackage.STEP_DECLARATION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceDecl> getInterfaceDecl() {
		return getGroup().list(NamespacePackage.Literals.STEP_DECLARATION__INTERFACE_DECL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnector() {
		return getGroup().list(NamespacePackage.Literals.STEP_DECLARATION__CONNECTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Aborter> getAborter() {
		return getGroup().list(NamespacePackage.Literals.STEP_DECLARATION__ABORTER);
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
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.STEP_DECLARATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindType getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(KindType newKind) {
		KindType oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		boolean oldKindESet = kindESet;
		kindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.STEP_DECLARATION__KIND, oldKind, kind, !oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKind() {
		KindType oldKind = kind;
		boolean oldKindESet = kindESet;
		kind = KIND_EDEFAULT;
		kindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NamespacePackage.STEP_DECLARATION__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.STEP_DECLARATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NamespacePackage.STEP_DECLARATION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case NamespacePackage.STEP_DECLARATION__INTERFACE_DECL:
				return ((InternalEList<?>)getInterfaceDecl()).basicRemove(otherEnd, msgs);
			case NamespacePackage.STEP_DECLARATION__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case NamespacePackage.STEP_DECLARATION__ABORTER:
				return ((InternalEList<?>)getAborter()).basicRemove(otherEnd, msgs);
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
			case NamespacePackage.STEP_DECLARATION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case NamespacePackage.STEP_DECLARATION__INTERFACE_DECL:
				return getInterfaceDecl();
			case NamespacePackage.STEP_DECLARATION__CONNECTOR:
				return getConnector();
			case NamespacePackage.STEP_DECLARATION__ABORTER:
				return getAborter();
			case NamespacePackage.STEP_DECLARATION__ID:
				return getId();
			case NamespacePackage.STEP_DECLARATION__KIND:
				return getKind();
			case NamespacePackage.STEP_DECLARATION__NAME:
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
			case NamespacePackage.STEP_DECLARATION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case NamespacePackage.STEP_DECLARATION__INTERFACE_DECL:
				getInterfaceDecl().clear();
				getInterfaceDecl().addAll((Collection<? extends InterfaceDecl>)newValue);
				return;
			case NamespacePackage.STEP_DECLARATION__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case NamespacePackage.STEP_DECLARATION__ABORTER:
				getAborter().clear();
				getAborter().addAll((Collection<? extends Aborter>)newValue);
				return;
			case NamespacePackage.STEP_DECLARATION__ID:
				setId((String)newValue);
				return;
			case NamespacePackage.STEP_DECLARATION__KIND:
				setKind((KindType)newValue);
				return;
			case NamespacePackage.STEP_DECLARATION__NAME:
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
			case NamespacePackage.STEP_DECLARATION__GROUP:
				getGroup().clear();
				return;
			case NamespacePackage.STEP_DECLARATION__INTERFACE_DECL:
				getInterfaceDecl().clear();
				return;
			case NamespacePackage.STEP_DECLARATION__CONNECTOR:
				getConnector().clear();
				return;
			case NamespacePackage.STEP_DECLARATION__ABORTER:
				getAborter().clear();
				return;
			case NamespacePackage.STEP_DECLARATION__ID:
				setId(ID_EDEFAULT);
				return;
			case NamespacePackage.STEP_DECLARATION__KIND:
				unsetKind();
				return;
			case NamespacePackage.STEP_DECLARATION__NAME:
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
			case NamespacePackage.STEP_DECLARATION__GROUP:
				return group != null && !group.isEmpty();
			case NamespacePackage.STEP_DECLARATION__INTERFACE_DECL:
				return !getInterfaceDecl().isEmpty();
			case NamespacePackage.STEP_DECLARATION__CONNECTOR:
				return !getConnector().isEmpty();
			case NamespacePackage.STEP_DECLARATION__ABORTER:
				return !getAborter().isEmpty();
			case NamespacePackage.STEP_DECLARATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NamespacePackage.STEP_DECLARATION__KIND:
				return isSetKind();
			case NamespacePackage.STEP_DECLARATION__NAME:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", id: ");
		result.append(id);
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StepDeclarationImpl
