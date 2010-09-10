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

import org.w3.namespace.Diagram;
import org.w3.namespace.Location;
import org.w3.namespace.NamespacePackage;
import org.w3.namespace.PostIt;
import org.w3.namespace.TaggedLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.DiagramImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DiagramImpl#getPostIt <em>Post It</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DiagramImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DiagramImpl#getTaggedLocation <em>Tagged Location</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DiagramImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DiagramImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramImpl extends EObjectImpl implements Diagram {
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
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, NamespacePackage.DIAGRAM__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PostIt> getPostIt() {
		return getGroup().list(NamespacePackage.Literals.DIAGRAM__POST_IT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocation() {
		return getGroup().list(NamespacePackage.Literals.DIAGRAM__LOCATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaggedLocation> getTaggedLocation() {
		return getGroup().list(NamespacePackage.Literals.DIAGRAM__TAGGED_LOCATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.DIAGRAM__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NamespacePackage.DIAGRAM__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case NamespacePackage.DIAGRAM__POST_IT:
				return ((InternalEList<?>)getPostIt()).basicRemove(otherEnd, msgs);
			case NamespacePackage.DIAGRAM__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case NamespacePackage.DIAGRAM__TAGGED_LOCATION:
				return ((InternalEList<?>)getTaggedLocation()).basicRemove(otherEnd, msgs);
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
			case NamespacePackage.DIAGRAM__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case NamespacePackage.DIAGRAM__POST_IT:
				return getPostIt();
			case NamespacePackage.DIAGRAM__LOCATION:
				return getLocation();
			case NamespacePackage.DIAGRAM__TAGGED_LOCATION:
				return getTaggedLocation();
			case NamespacePackage.DIAGRAM__ID:
				return getId();
			case NamespacePackage.DIAGRAM__NAME:
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
			case NamespacePackage.DIAGRAM__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case NamespacePackage.DIAGRAM__POST_IT:
				getPostIt().clear();
				getPostIt().addAll((Collection<? extends PostIt>)newValue);
				return;
			case NamespacePackage.DIAGRAM__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Location>)newValue);
				return;
			case NamespacePackage.DIAGRAM__TAGGED_LOCATION:
				getTaggedLocation().clear();
				getTaggedLocation().addAll((Collection<? extends TaggedLocation>)newValue);
				return;
			case NamespacePackage.DIAGRAM__ID:
				setId((String)newValue);
				return;
			case NamespacePackage.DIAGRAM__NAME:
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
			case NamespacePackage.DIAGRAM__GROUP:
				getGroup().clear();
				return;
			case NamespacePackage.DIAGRAM__POST_IT:
				getPostIt().clear();
				return;
			case NamespacePackage.DIAGRAM__LOCATION:
				getLocation().clear();
				return;
			case NamespacePackage.DIAGRAM__TAGGED_LOCATION:
				getTaggedLocation().clear();
				return;
			case NamespacePackage.DIAGRAM__ID:
				setId(ID_EDEFAULT);
				return;
			case NamespacePackage.DIAGRAM__NAME:
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
			case NamespacePackage.DIAGRAM__GROUP:
				return group != null && !group.isEmpty();
			case NamespacePackage.DIAGRAM__POST_IT:
				return !getPostIt().isEmpty();
			case NamespacePackage.DIAGRAM__LOCATION:
				return !getLocation().isEmpty();
			case NamespacePackage.DIAGRAM__TAGGED_LOCATION:
				return !getTaggedLocation().isEmpty();
			case NamespacePackage.DIAGRAM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NamespacePackage.DIAGRAM__NAME:
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DiagramImpl
