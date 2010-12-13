/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool.troposAspect;

import eu.securechange.ontology.ontology.Resource;

import it.unitn.disi.sistar.modeling.tropos.Service;

import secmertool.NamedReferenceLink;
import secmertool.ReferenceLink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tropos Resource Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link secmertool.troposAspect.TroposResourceLink#getSecmer <em>Secmer</em>}</li>
 *   <li>{@link secmertool.troposAspect.TroposResourceLink#getTropos <em>Tropos</em>}</li>
 * </ul>
 * </p>
 *
 * @see secmertool.troposAspect.TroposAspectPackage#getTroposResourceLink()
 * @model
 * @generated
 */
public interface TroposResourceLink extends NamedReferenceLink {
	/**
	 * Returns the value of the '<em><b>Secmer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secmer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secmer</em>' reference.
	 * @see #setSecmer(Resource)
	 * @see secmertool.troposAspect.TroposAspectPackage#getTroposResourceLink_Secmer()
	 * @model
	 * @generated
	 */
	Resource getSecmer();

	/**
	 * Sets the value of the '{@link secmertool.troposAspect.TroposResourceLink#getSecmer <em>Secmer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secmer</em>' reference.
	 * @see #getSecmer()
	 * @generated
	 */
	void setSecmer(Resource value);

	/**
	 * Returns the value of the '<em><b>Tropos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tropos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tropos</em>' reference.
	 * @see #setTropos(Service)
	 * @see secmertool.troposAspect.TroposAspectPackage#getTroposResourceLink_Tropos()
	 * @model
	 * @generated
	 */
	Service getTropos();

	/**
	 * Sets the value of the '{@link secmertool.troposAspect.TroposResourceLink#getTropos <em>Tropos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tropos</em>' reference.
	 * @see #getTropos()
	 * @generated
	 */
	void setTropos(Service value);

} // TroposResourceLink
