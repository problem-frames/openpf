/**
 * <copyright>
 * </copyright>
 *
 * $Id: ActorImpl.java,v 1.1.1.1 2007/06/13 20:26:48 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos.impl;

import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.EActorType;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.TroposPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.impl.ActorImpl#getActorType <em>Actor Type</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.impl.ActorImpl#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorImpl extends GraphicalObjectImpl implements Actor {
	/**
	 * The default value of the '{@link #getActorType() <em>Actor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorType()
	 * @generated
	 * @ordered
	 */
	protected static final EActorType ACTOR_TYPE_EDEFAULT = EActorType.AGENT_LITERAL;

	/**
	 * The cached value of the '{@link #getActorType() <em>Actor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorType()
	 * @generated
	 * @ordered
	 */
	protected EActorType actorType = ACTOR_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList services = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TroposPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EActorType getActorType() {
		return actorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorType(EActorType newActorType) {
		EActorType oldActorType = actorType;
		actorType = newActorType == null ? ACTOR_TYPE_EDEFAULT : newActorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposPackage.ACTOR__ACTOR_TYPE, oldActorType, actorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getServices() {
		if (services == null) {
			services = new EObjectContainmentEList(Service.class, this, TroposPackage.ACTOR__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TroposPackage.ACTOR__SERVICES:
				return ((InternalEList)getServices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TroposPackage.ACTOR__ACTOR_TYPE:
				return getActorType();
			case TroposPackage.ACTOR__SERVICES:
				return getServices();
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
			case TroposPackage.ACTOR__ACTOR_TYPE:
				setActorType((EActorType)newValue);
				return;
			case TroposPackage.ACTOR__SERVICES:
				getServices().clear();
				getServices().addAll((Collection)newValue);
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
			case TroposPackage.ACTOR__ACTOR_TYPE:
				setActorType(ACTOR_TYPE_EDEFAULT);
				return;
			case TroposPackage.ACTOR__SERVICES:
				getServices().clear();
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
			case TroposPackage.ACTOR__ACTOR_TYPE:
				return actorType != null;
			case TroposPackage.ACTOR__SERVICES:
				return services != null && !services.isEmpty();
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
		result.append(" (actorType: ");
		result.append(actorType);
		result.append(')');
		return result.toString();
	}

} //ActorImpl