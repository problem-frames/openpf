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
import org.w3.namespace.Encoding;
import org.w3.namespace.ExternalObject;
import org.w3.namespace.NamespacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.ExternalObjectImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ExternalObjectImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ExternalObjectImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ExternalObjectImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.w3.namespace.impl.ExternalObjectImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalObjectImpl extends EObjectImpl implements ExternalObject {
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
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final Encoding ENCODING_EDEFAULT = Encoding.BASE64;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected Encoding encoding = ENCODING_EDEFAULT;

	/**
	 * This is true if the Encoding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean encodingESet;

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
	protected ExternalObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.EXTERNAL_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, NamespacePackage.EXTERNAL_OBJECT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(NamespacePackage.Literals.EXTERNAL_OBJECT__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Aggregate> getAggregate() {
		return getGroup().list(NamespacePackage.Literals.EXTERNAL_OBJECT__AGGREGATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encoding getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(Encoding newEncoding) {
		Encoding oldEncoding = encoding;
		encoding = newEncoding == null ? ENCODING_EDEFAULT : newEncoding;
		boolean oldEncodingESet = encodingESet;
		encodingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.EXTERNAL_OBJECT__ENCODING, oldEncoding, encoding, !oldEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEncoding() {
		Encoding oldEncoding = encoding;
		boolean oldEncodingESet = encodingESet;
		encoding = ENCODING_EDEFAULT;
		encodingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NamespacePackage.EXTERNAL_OBJECT__ENCODING, oldEncoding, ENCODING_EDEFAULT, oldEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEncoding() {
		return encodingESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.EXTERNAL_OBJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NamespacePackage.EXTERNAL_OBJECT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case NamespacePackage.EXTERNAL_OBJECT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case NamespacePackage.EXTERNAL_OBJECT__AGGREGATE:
				return ((InternalEList<?>)getAggregate()).basicRemove(otherEnd, msgs);
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
			case NamespacePackage.EXTERNAL_OBJECT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case NamespacePackage.EXTERNAL_OBJECT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case NamespacePackage.EXTERNAL_OBJECT__AGGREGATE:
				return getAggregate();
			case NamespacePackage.EXTERNAL_OBJECT__ENCODING:
				return getEncoding();
			case NamespacePackage.EXTERNAL_OBJECT__ID:
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
			case NamespacePackage.EXTERNAL_OBJECT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case NamespacePackage.EXTERNAL_OBJECT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case NamespacePackage.EXTERNAL_OBJECT__AGGREGATE:
				getAggregate().clear();
				getAggregate().addAll((Collection<? extends Aggregate>)newValue);
				return;
			case NamespacePackage.EXTERNAL_OBJECT__ENCODING:
				setEncoding((Encoding)newValue);
				return;
			case NamespacePackage.EXTERNAL_OBJECT__ID:
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
			case NamespacePackage.EXTERNAL_OBJECT__MIXED:
				getMixed().clear();
				return;
			case NamespacePackage.EXTERNAL_OBJECT__GROUP:
				getGroup().clear();
				return;
			case NamespacePackage.EXTERNAL_OBJECT__AGGREGATE:
				getAggregate().clear();
				return;
			case NamespacePackage.EXTERNAL_OBJECT__ENCODING:
				unsetEncoding();
				return;
			case NamespacePackage.EXTERNAL_OBJECT__ID:
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
			case NamespacePackage.EXTERNAL_OBJECT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case NamespacePackage.EXTERNAL_OBJECT__GROUP:
				return !getGroup().isEmpty();
			case NamespacePackage.EXTERNAL_OBJECT__AGGREGATE:
				return !getAggregate().isEmpty();
			case NamespacePackage.EXTERNAL_OBJECT__ENCODING:
				return isSetEncoding();
			case NamespacePackage.EXTERNAL_OBJECT__ID:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", encoding: ");
		if (encodingESet) result.append(encoding); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ExternalObjectImpl
