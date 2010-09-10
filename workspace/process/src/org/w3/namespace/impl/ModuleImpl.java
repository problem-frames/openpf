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

import org.w3.namespace.Export;
import org.w3.namespace.Import;
import org.w3.namespace.Module;
import org.w3.namespace.NamespacePackage;
import org.w3.namespace.StepDeclaration;
import org.w3.namespace.StepReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.ModuleImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ModuleImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ModuleImpl#getExport <em>Export</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ModuleImpl#getStepDeclaration <em>Step Declaration</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ModuleImpl#getStepReference <em>Step Reference</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ModuleImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends EObjectImpl implements Module {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, NamespacePackage.MODULE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImport() {
		return getGroup().list(NamespacePackage.Literals.MODULE__IMPORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Export> getExport() {
		return getGroup().list(NamespacePackage.Literals.MODULE__EXPORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepDeclaration> getStepDeclaration() {
		return getGroup().list(NamespacePackage.Literals.MODULE__STEP_DECLARATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepReference> getStepReference() {
		return getGroup().list(NamespacePackage.Literals.MODULE__STEP_REFERENCE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.MODULE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NamespacePackage.MODULE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case NamespacePackage.MODULE__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case NamespacePackage.MODULE__EXPORT:
				return ((InternalEList<?>)getExport()).basicRemove(otherEnd, msgs);
			case NamespacePackage.MODULE__STEP_DECLARATION:
				return ((InternalEList<?>)getStepDeclaration()).basicRemove(otherEnd, msgs);
			case NamespacePackage.MODULE__STEP_REFERENCE:
				return ((InternalEList<?>)getStepReference()).basicRemove(otherEnd, msgs);
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
			case NamespacePackage.MODULE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case NamespacePackage.MODULE__IMPORT:
				return getImport();
			case NamespacePackage.MODULE__EXPORT:
				return getExport();
			case NamespacePackage.MODULE__STEP_DECLARATION:
				return getStepDeclaration();
			case NamespacePackage.MODULE__STEP_REFERENCE:
				return getStepReference();
			case NamespacePackage.MODULE__ID:
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
			case NamespacePackage.MODULE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case NamespacePackage.MODULE__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends Import>)newValue);
				return;
			case NamespacePackage.MODULE__EXPORT:
				getExport().clear();
				getExport().addAll((Collection<? extends Export>)newValue);
				return;
			case NamespacePackage.MODULE__STEP_DECLARATION:
				getStepDeclaration().clear();
				getStepDeclaration().addAll((Collection<? extends StepDeclaration>)newValue);
				return;
			case NamespacePackage.MODULE__STEP_REFERENCE:
				getStepReference().clear();
				getStepReference().addAll((Collection<? extends StepReference>)newValue);
				return;
			case NamespacePackage.MODULE__ID:
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
			case NamespacePackage.MODULE__GROUP:
				getGroup().clear();
				return;
			case NamespacePackage.MODULE__IMPORT:
				getImport().clear();
				return;
			case NamespacePackage.MODULE__EXPORT:
				getExport().clear();
				return;
			case NamespacePackage.MODULE__STEP_DECLARATION:
				getStepDeclaration().clear();
				return;
			case NamespacePackage.MODULE__STEP_REFERENCE:
				getStepReference().clear();
				return;
			case NamespacePackage.MODULE__ID:
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
			case NamespacePackage.MODULE__GROUP:
				return group != null && !group.isEmpty();
			case NamespacePackage.MODULE__IMPORT:
				return !getImport().isEmpty();
			case NamespacePackage.MODULE__EXPORT:
				return !getExport().isEmpty();
			case NamespacePackage.MODULE__STEP_DECLARATION:
				return !getStepDeclaration().isEmpty();
			case NamespacePackage.MODULE__STEP_REFERENCE:
				return !getStepReference().isEmpty();
			case NamespacePackage.MODULE__ID:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
