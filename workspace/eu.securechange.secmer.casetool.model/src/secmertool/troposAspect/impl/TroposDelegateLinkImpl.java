/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool.troposAspect.impl;

import eu.securechange.ontology.ontology.Delegates;

import it.unitn.disi.sistar.modeling.tropos.Dependency;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import secmertool.impl.ReferenceLinkImpl;

import secmertool.troposAspect.TroposAspectPackage;
import secmertool.troposAspect.TroposDelegateLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tropos Delegate Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link secmertool.troposAspect.impl.TroposDelegateLinkImpl#getSecmer <em>Secmer</em>}</li>
 *   <li>{@link secmertool.troposAspect.impl.TroposDelegateLinkImpl#getTropos <em>Tropos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TroposDelegateLinkImpl extends ReferenceLinkImpl implements TroposDelegateLink {
	/**
	 * The cached value of the '{@link #getSecmer() <em>Secmer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecmer()
	 * @generated
	 * @ordered
	 */
	protected Delegates secmer;

	/**
	 * The cached value of the '{@link #getTropos() <em>Tropos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTropos()
	 * @generated
	 * @ordered
	 */
	protected Dependency tropos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TroposDelegateLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TroposAspectPackage.Literals.TROPOS_DELEGATE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delegates getSecmer() {
		if (secmer != null && secmer.eIsProxy()) {
			InternalEObject oldSecmer = (InternalEObject)secmer;
			secmer = (Delegates)eResolveProxy(oldSecmer);
			if (secmer != oldSecmer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TroposAspectPackage.TROPOS_DELEGATE_LINK__SECMER, oldSecmer, secmer));
			}
		}
		return secmer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delegates basicGetSecmer() {
		return secmer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecmer(Delegates newSecmer) {
		Delegates oldSecmer = secmer;
		secmer = newSecmer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposAspectPackage.TROPOS_DELEGATE_LINK__SECMER, oldSecmer, secmer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getTropos() {
		if (tropos != null && tropos.eIsProxy()) {
			InternalEObject oldTropos = (InternalEObject)tropos;
			tropos = (Dependency)eResolveProxy(oldTropos);
			if (tropos != oldTropos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TroposAspectPackage.TROPOS_DELEGATE_LINK__TROPOS, oldTropos, tropos));
			}
		}
		return tropos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency basicGetTropos() {
		return tropos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTropos(Dependency newTropos) {
		Dependency oldTropos = tropos;
		tropos = newTropos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposAspectPackage.TROPOS_DELEGATE_LINK__TROPOS, oldTropos, tropos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TroposAspectPackage.TROPOS_DELEGATE_LINK__SECMER:
				if (resolve) return getSecmer();
				return basicGetSecmer();
			case TroposAspectPackage.TROPOS_DELEGATE_LINK__TROPOS:
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
			case TroposAspectPackage.TROPOS_DELEGATE_LINK__SECMER:
				setSecmer((Delegates)newValue);
				return;
			case TroposAspectPackage.TROPOS_DELEGATE_LINK__TROPOS:
				setTropos((Dependency)newValue);
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
			case TroposAspectPackage.TROPOS_DELEGATE_LINK__SECMER:
				setSecmer((Delegates)null);
				return;
			case TroposAspectPackage.TROPOS_DELEGATE_LINK__TROPOS:
				setTropos((Dependency)null);
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
			case TroposAspectPackage.TROPOS_DELEGATE_LINK__SECMER:
				return secmer != null;
			case TroposAspectPackage.TROPOS_DELEGATE_LINK__TROPOS:
				return tropos != null;
		}
		return super.eIsSet(featureID);
	}

} //TroposDelegateLinkImpl
