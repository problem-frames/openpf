/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.situation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.situation.Domain#getType <em>Type</em>}</li>
 *   <li>{@link eu.securechange.situation.Domain#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.situation.SituationPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject
{
  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.securechange.situation.DomainType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.securechange.situation.DomainType
	 * @see #setType(DomainType)
	 * @see eu.securechange.situation.SituationPackage#getDomain_Type()
	 * @model
	 * @generated
	 */
  DomainType getType();

  /**
	 * Sets the value of the '{@link eu.securechange.situation.Domain#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.securechange.situation.DomainType
	 * @see #getType()
	 * @generated
	 */
  void setType(DomainType value);

  /**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link eu.securechange.situation.Proposition}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see eu.securechange.situation.SituationPackage#getDomain_Properties()
	 * @model containment="true"
	 * @generated
	 */
  EList<Proposition> getProperties();

} // Domain
