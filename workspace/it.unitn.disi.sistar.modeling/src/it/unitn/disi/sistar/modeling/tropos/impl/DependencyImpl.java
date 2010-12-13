/**
 * <copyright>
 * </copyright>
 *
 * $Id: DependencyImpl.java,v 1.3 2007/07/24 09:08:24 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos.impl;

import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.TroposPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.impl.DependencyImpl#getDependencyType <em>Dependency Type</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.impl.DependencyImpl#getDependencyProperties <em>Dependency Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends RelationImpl implements Dependency {
	/**
	 * The default value of the '{@link #getDependencyType() <em>Dependency Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyType()
	 * @generated
	 * @ordered
	 */
	protected static final EDependencyType DEPENDENCY_TYPE_EDEFAULT = EDependencyType.DELEGATION_EXECUTION_LITERAL;

	/**
	 * The cached value of the '{@link #getDependencyType() <em>Dependency Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyType()
	 * @generated
	 * @ordered
	 */
	protected EDependencyType dependencyType = DEPENDENCY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependencyProperties() <em>Dependency Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyProperties()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDENCY_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependencyProperties() <em>Dependency Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyProperties()
	 * @generated
	 * @ordered
	 */
	protected String dependencyProperties = DEPENDENCY_PROPERTIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TroposPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDependencyType getDependencyType() {
		return dependencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyType(EDependencyType newDependencyType) {
		EDependencyType oldDependencyType = dependencyType;
		dependencyType = newDependencyType == null ? DEPENDENCY_TYPE_EDEFAULT : newDependencyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposPackage.DEPENDENCY__DEPENDENCY_TYPE, oldDependencyType, dependencyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependencyProperties() {
		return dependencyProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyProperties(String newDependencyProperties) {
		String oldDependencyProperties = dependencyProperties;
		dependencyProperties = newDependencyProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposPackage.DEPENDENCY__DEPENDENCY_PROPERTIES, oldDependencyProperties, dependencyProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TroposPackage.DEPENDENCY__DEPENDENCY_TYPE:
				return getDependencyType();
			case TroposPackage.DEPENDENCY__DEPENDENCY_PROPERTIES:
				return getDependencyProperties();
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
			case TroposPackage.DEPENDENCY__DEPENDENCY_TYPE:
				setDependencyType((EDependencyType)newValue);
				return;
			case TroposPackage.DEPENDENCY__DEPENDENCY_PROPERTIES:
				setDependencyProperties((String)newValue);
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
			case TroposPackage.DEPENDENCY__DEPENDENCY_TYPE:
				setDependencyType(DEPENDENCY_TYPE_EDEFAULT);
				return;
			case TroposPackage.DEPENDENCY__DEPENDENCY_PROPERTIES:
				setDependencyProperties(DEPENDENCY_PROPERTIES_EDEFAULT);
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
			case TroposPackage.DEPENDENCY__DEPENDENCY_TYPE:
				return dependencyType != null;
			case TroposPackage.DEPENDENCY__DEPENDENCY_PROPERTIES:
				return dependencyProperties != null;
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
		result.append(" (dependencyType: ");
		result.append(dependencyType);
		result.append(", dependencyProperties: ");
		result.append(dependencyProperties);
		result.append(')');
		return result.toString();
	}

} //DependencyImpl