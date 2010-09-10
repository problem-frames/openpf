/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.namespace.Annotation;
import org.w3.namespace.Diagram;
import org.w3.namespace.Metadata;
import org.w3.namespace.NamespacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.MetadataImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3.namespace.impl.MetadataImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.w3.namespace.impl.MetadataImpl#getDiagram <em>Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetadataImpl extends EObjectImpl implements Metadata {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.METADATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, NamespacePackage.METADATA__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		return getGroup().list(NamespacePackage.Literals.METADATA__ANNOTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Diagram> getDiagram() {
		return getGroup().list(NamespacePackage.Literals.METADATA__DIAGRAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NamespacePackage.METADATA__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case NamespacePackage.METADATA__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case NamespacePackage.METADATA__DIAGRAM:
				return ((InternalEList<?>)getDiagram()).basicRemove(otherEnd, msgs);
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
			case NamespacePackage.METADATA__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case NamespacePackage.METADATA__ANNOTATION:
				return getAnnotation();
			case NamespacePackage.METADATA__DIAGRAM:
				return getDiagram();
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
			case NamespacePackage.METADATA__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case NamespacePackage.METADATA__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case NamespacePackage.METADATA__DIAGRAM:
				getDiagram().clear();
				getDiagram().addAll((Collection<? extends Diagram>)newValue);
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
			case NamespacePackage.METADATA__GROUP:
				getGroup().clear();
				return;
			case NamespacePackage.METADATA__ANNOTATION:
				getAnnotation().clear();
				return;
			case NamespacePackage.METADATA__DIAGRAM:
				getDiagram().clear();
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
			case NamespacePackage.METADATA__GROUP:
				return group != null && !group.isEmpty();
			case NamespacePackage.METADATA__ANNOTATION:
				return !getAnnotation().isEmpty();
			case NamespacePackage.METADATA__DIAGRAM:
				return !getDiagram().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //MetadataImpl
