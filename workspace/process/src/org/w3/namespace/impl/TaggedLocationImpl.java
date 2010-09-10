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

import org.w3.namespace.NamespacePackage;
import org.w3.namespace.TaggedLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tagged Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.TaggedLocationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3.namespace.impl.TaggedLocationImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.w3.namespace.impl.TaggedLocationImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.w3.namespace.impl.TaggedLocationImpl#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link org.w3.namespace.impl.TaggedLocationImpl#getYPosition <em>YPosition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaggedLocationImpl extends EObjectImpl implements TaggedLocation {
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
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String XPOSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected String xPosition = XPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String YPOSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected String yPosition = YPOSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaggedLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.TAGGED_LOCATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.TAGGED_LOCATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.TAGGED_LOCATION__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.TAGGED_LOCATION__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXPosition() {
		return xPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPosition(String newXPosition) {
		String oldXPosition = xPosition;
		xPosition = newXPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.TAGGED_LOCATION__XPOSITION, oldXPosition, xPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYPosition() {
		return yPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYPosition(String newYPosition) {
		String oldYPosition = yPosition;
		yPosition = newYPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NamespacePackage.TAGGED_LOCATION__YPOSITION, oldYPosition, yPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NamespacePackage.TAGGED_LOCATION__ID:
				return getId();
			case NamespacePackage.TAGGED_LOCATION__KEY:
				return getKey();
			case NamespacePackage.TAGGED_LOCATION__TAG:
				return getTag();
			case NamespacePackage.TAGGED_LOCATION__XPOSITION:
				return getXPosition();
			case NamespacePackage.TAGGED_LOCATION__YPOSITION:
				return getYPosition();
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
			case NamespacePackage.TAGGED_LOCATION__ID:
				setId((String)newValue);
				return;
			case NamespacePackage.TAGGED_LOCATION__KEY:
				setKey((String)newValue);
				return;
			case NamespacePackage.TAGGED_LOCATION__TAG:
				setTag((String)newValue);
				return;
			case NamespacePackage.TAGGED_LOCATION__XPOSITION:
				setXPosition((String)newValue);
				return;
			case NamespacePackage.TAGGED_LOCATION__YPOSITION:
				setYPosition((String)newValue);
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
			case NamespacePackage.TAGGED_LOCATION__ID:
				setId(ID_EDEFAULT);
				return;
			case NamespacePackage.TAGGED_LOCATION__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case NamespacePackage.TAGGED_LOCATION__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case NamespacePackage.TAGGED_LOCATION__XPOSITION:
				setXPosition(XPOSITION_EDEFAULT);
				return;
			case NamespacePackage.TAGGED_LOCATION__YPOSITION:
				setYPosition(YPOSITION_EDEFAULT);
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
			case NamespacePackage.TAGGED_LOCATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NamespacePackage.TAGGED_LOCATION__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case NamespacePackage.TAGGED_LOCATION__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case NamespacePackage.TAGGED_LOCATION__XPOSITION:
				return XPOSITION_EDEFAULT == null ? xPosition != null : !XPOSITION_EDEFAULT.equals(xPosition);
			case NamespacePackage.TAGGED_LOCATION__YPOSITION:
				return YPOSITION_EDEFAULT == null ? yPosition != null : !YPOSITION_EDEFAULT.equals(yPosition);
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
		result.append(", key: ");
		result.append(key);
		result.append(", tag: ");
		result.append(tag);
		result.append(", xPosition: ");
		result.append(xPosition);
		result.append(", yPosition: ");
		result.append(yPosition);
		result.append(')');
		return result.toString();
	}

} //TaggedLocationImpl
