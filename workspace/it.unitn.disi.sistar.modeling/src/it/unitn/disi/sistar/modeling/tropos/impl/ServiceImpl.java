/**
 * <copyright>
 * </copyright>
 *
 * $Id: ServiceImpl.java,v 1.1.1.1 2007/06/13 20:26:47 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos.impl;

import it.unitn.disi.sistar.modeling.tropos.EServiceType;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.TroposPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.impl.ServiceImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.impl.ServiceImpl#getServiceProperties <em>Service Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends GraphicalObjectImpl implements Service {
	/**
	 * The default value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected static final EServiceType SERVICE_TYPE_EDEFAULT = EServiceType.GOAL_LITERAL;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected EServiceType serviceType = SERVICE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceProperties() <em>Service Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProperties()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_PROPERTIES_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getServiceProperties() <em>Service Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProperties()
	 * @generated
	 * @ordered
	 */
	protected String serviceProperties = SERVICE_PROPERTIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TroposPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EServiceType getServiceType() {
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceType(EServiceType newServiceType) {
		EServiceType oldServiceType = serviceType;
		serviceType = newServiceType == null ? SERVICE_TYPE_EDEFAULT : newServiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposPackage.SERVICE__SERVICE_TYPE, oldServiceType, serviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceProperties() {
		return serviceProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceProperties(String newServiceProperties) {
		String oldServiceProperties = serviceProperties;
		serviceProperties = newServiceProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposPackage.SERVICE__SERVICE_PROPERTIES, oldServiceProperties, serviceProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TroposPackage.SERVICE__SERVICE_TYPE:
				return getServiceType();
			case TroposPackage.SERVICE__SERVICE_PROPERTIES:
				return getServiceProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TroposPackage.SERVICE__SERVICE_TYPE:
				setServiceType((EServiceType)newValue);
				return;
			case TroposPackage.SERVICE__SERVICE_PROPERTIES:
				setServiceProperties((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case TroposPackage.SERVICE__SERVICE_TYPE:
				setServiceType(SERVICE_TYPE_EDEFAULT);
				return;
			case TroposPackage.SERVICE__SERVICE_PROPERTIES:
				setServiceProperties(SERVICE_PROPERTIES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

							/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TroposPackage.SERVICE__SERVICE_TYPE:
				return serviceType != null;
			case TroposPackage.SERVICE__SERVICE_PROPERTIES:
				return serviceProperties != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (serviceType: ");
		result.append(serviceType);
		result.append(", serviceProperties: ");
		result.append(serviceProperties);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl