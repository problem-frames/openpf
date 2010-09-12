/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Belief World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.ontology.BeliefWorld#getDomains <em>Domains</em>}</li>
 *   <li>{@link eu.securechange.ontology.BeliefWorld#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.ontology.OntologyPackage#getBeliefWorld()
 * @model
 * @generated
 */
public interface BeliefWorld extends EObject
{
  /**
   * Returns the value of the '<em><b>Domains</b></em>' containment reference list.
   * The list contents are of type {@link eu.securechange.ontology.Domain}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domains</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domains</em>' containment reference list.
   * @see eu.securechange.ontology.OntologyPackage#getBeliefWorld_Domains()
   * @model containment="true"
   * @generated
   */
  EList<Domain> getDomains();

  /**
   * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
   * The list contents are of type {@link eu.securechange.ontology.Relationship}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationships</em>' containment reference list.
   * @see eu.securechange.ontology.OntologyPackage#getBeliefWorld_Relationships()
   * @model containment="true"
   * @generated
   */
  EList<Relationship> getRelationships();

} // BeliefWorld
