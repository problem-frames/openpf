/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool.troposAspect;

//import eu.securechange.ontology.ontology.Delegates;

import it.unitn.disi.sistar.modeling.tropos.Dependency;
import secmertool.ReferenceLink;
import eu.securechange.ontology.ontology.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tropos Delegate Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link secmertool.troposAspect.TroposDelegateLink#getSecmer <em>Secmer</em>}</li>
 *   <li>{@link secmertool.troposAspect.TroposDelegateLink#getTropos <em>Tropos</em>}</li>
 * </ul>
 * </p>
 *
 * @see secmertool.troposAspect.TroposAspectPackage#getTroposDelegateLink()
 * @model
 * @generated
 */
public interface TroposDelegateLink extends ReferenceLink {
	/**
	 * Returns the value of the '<em><b>Secmer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secmer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secmer</em>' reference.
	 * @see #setSecmer(Delegates)
	 * @see secmertool.troposAspect.TroposAspectPackage#getTroposDelegateLink_Secmer()
	 * @model
	 * @generated
	 */
	Relationship getSecmer();

	/**
	 * Sets the value of the '{@link secmertool.troposAspect.TroposDelegateLink#getSecmer <em>Secmer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secmer</em>' reference.
	 * @see #getSecmer()
	 * @generated
	 */
	void setSecmer(Relationship value);

	/**
	 * Returns the value of the '<em><b>Tropos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tropos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tropos</em>' reference.
	 * @see #setTropos(Dependency)
	 * @see secmertool.troposAspect.TroposAspectPackage#getTroposDelegateLink_Tropos()
	 * @model
	 * @generated
	 */
	Dependency getTropos();

	/**
	 * Sets the value of the '{@link secmertool.troposAspect.TroposDelegateLink#getTropos <em>Tropos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tropos</em>' reference.
	 * @see #getTropos()
	 * @generated
	 */
	void setTropos(Dependency value);

} // TroposDelegateLink
