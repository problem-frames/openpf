/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool.troposAspect.impl;

import eu.securechange.ontology.ontology.Actor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import secmertool.impl.NamedReferenceLinkImpl;
import secmertool.impl.ReferenceLinkImpl;

import secmertool.troposAspect.TroposActorLink;
import secmertool.troposAspect.TroposAspectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tropos Actor Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link secmertool.troposAspect.impl.TroposActorLinkImpl#getSecmer <em>Secmer</em>}</li>
 *   <li>{@link secmertool.troposAspect.impl.TroposActorLinkImpl#getTropos <em>Tropos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TroposActorLinkImpl extends NamedReferenceLinkImpl implements TroposActorLink {
	/**
	 * The cached value of the '{@link #getSecmer() <em>Secmer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecmer()
	 * @generated
	 * @ordered
	 */
	protected Actor secmer;

	/**
	 * The cached value of the '{@link #getTropos() <em>Tropos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTropos()
	 * @generated
	 * @ordered
	 */
	protected it.unitn.disi.sistar.modeling.tropos.Actor tropos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TroposActorLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TroposAspectPackage.Literals.TROPOS_ACTOR_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getSecmer() {
		if (secmer != null && secmer.eIsProxy()) {
			InternalEObject oldSecmer = (InternalEObject)secmer;
			secmer = (Actor)eResolveProxy(oldSecmer);
			if (secmer != oldSecmer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TroposAspectPackage.TROPOS_ACTOR_LINK__SECMER, oldSecmer, secmer));
			}
		}
		return secmer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetSecmer() {
		return secmer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecmer(Actor newSecmer) {
		Actor oldSecmer = secmer;
		secmer = newSecmer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposAspectPackage.TROPOS_ACTOR_LINK__SECMER, oldSecmer, secmer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.unitn.disi.sistar.modeling.tropos.Actor getTropos() {
		if (tropos != null && tropos.eIsProxy()) {
			InternalEObject oldTropos = (InternalEObject)tropos;
			tropos = (it.unitn.disi.sistar.modeling.tropos.Actor)eResolveProxy(oldTropos);
			if (tropos != oldTropos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TroposAspectPackage.TROPOS_ACTOR_LINK__TROPOS, oldTropos, tropos));
			}
		}
		return tropos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.unitn.disi.sistar.modeling.tropos.Actor basicGetTropos() {
		return tropos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTropos(it.unitn.disi.sistar.modeling.tropos.Actor newTropos) {
		it.unitn.disi.sistar.modeling.tropos.Actor oldTropos = tropos;
		tropos = newTropos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposAspectPackage.TROPOS_ACTOR_LINK__TROPOS, oldTropos, tropos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TroposAspectPackage.TROPOS_ACTOR_LINK__SECMER:
				if (resolve) return getSecmer();
				return basicGetSecmer();
			case TroposAspectPackage.TROPOS_ACTOR_LINK__TROPOS:
				if (resolve) return getTropos();
				return basicGetTropos();
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
			case TroposAspectPackage.TROPOS_ACTOR_LINK__SECMER:
				setSecmer((Actor)newValue);
				return;
			case TroposAspectPackage.TROPOS_ACTOR_LINK__TROPOS:
				setTropos((it.unitn.disi.sistar.modeling.tropos.Actor)newValue);
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
			case TroposAspectPackage.TROPOS_ACTOR_LINK__SECMER:
				setSecmer((Actor)null);
				return;
			case TroposAspectPackage.TROPOS_ACTOR_LINK__TROPOS:
				setTropos((it.unitn.disi.sistar.modeling.tropos.Actor)null);
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
			case TroposAspectPackage.TROPOS_ACTOR_LINK__SECMER:
				return secmer != null;
			case TroposAspectPackage.TROPOS_ACTOR_LINK__TROPOS:
				return tropos != null;
		}
		return super.eIsSet(featureID);
	}

} //TroposActorLinkImpl
