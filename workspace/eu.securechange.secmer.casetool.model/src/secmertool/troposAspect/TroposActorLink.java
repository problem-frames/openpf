/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool.troposAspect;

import eu.securechange.ontology.ontology.Actor;

import secmertool.NamedReferenceLink;
import secmertool.ReferenceLink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tropos Actor Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link secmertool.troposAspect.TroposActorLink#getSecmer <em>Secmer</em>}</li>
 *   <li>{@link secmertool.troposAspect.TroposActorLink#getTropos <em>Tropos</em>}</li>
 * </ul>
 * </p>
 *
 * @see secmertool.troposAspect.TroposAspectPackage#getTroposActorLink()
 * @model
 * @generated
 */
public interface TroposActorLink extends NamedReferenceLink {
	/**
	 * Returns the value of the '<em><b>Secmer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secmer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secmer</em>' reference.
	 * @see #setSecmer(Actor)
	 * @see secmertool.troposAspect.TroposAspectPackage#getTroposActorLink_Secmer()
	 * @model
	 * @generated
	 */
	Actor getSecmer();

	/**
	 * Sets the value of the '{@link secmertool.troposAspect.TroposActorLink#getSecmer <em>Secmer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secmer</em>' reference.
	 * @see #getSecmer()
	 * @generated
	 */
	void setSecmer(Actor value);

	/**
	 * Returns the value of the '<em><b>Tropos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tropos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tropos</em>' reference.
	 * @see #setTropos(it.unitn.disi.sistar.modeling.tropos.Actor)
	 * @see secmertool.troposAspect.TroposAspectPackage#getTroposActorLink_Tropos()
	 * @model
	 * @generated
	 */
	it.unitn.disi.sistar.modeling.tropos.Actor getTropos();

	/**
	 * Sets the value of the '{@link secmertool.troposAspect.TroposActorLink#getTropos <em>Tropos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tropos</em>' reference.
	 * @see #getTropos()
	 * @generated
	 */
	void setTropos(it.unitn.disi.sistar.modeling.tropos.Actor value);

} // TroposActorLink
