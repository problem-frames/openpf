/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.ontology.ontology.World#getGoals <em>Goals</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.World#getDomains <em>Domains</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.World#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.ontology.ontology.OntologyPackage#getWorld()
 * @model
 * @generated
 */
public interface World extends EObject
{
  /**
   * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
   * The list contents are of type {@link eu.securechange.ontology.ontology.Goal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goals</em>' containment reference list.
   * @see eu.securechange.ontology.ontology.OntologyPackage#getWorld_Goals()
   * @model containment="true"
   * @generated
   */
  EList<Goal> getGoals();

  /**
   * Returns the value of the '<em><b>Domains</b></em>' containment reference list.
   * The list contents are of type {@link eu.securechange.ontology.ontology.Domain}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domains</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domains</em>' containment reference list.
   * @see eu.securechange.ontology.ontology.OntologyPackage#getWorld_Domains()
   * @model containment="true"
   * @generated
   */
  EList<Domain> getDomains();

  /**
   * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
   * The list contents are of type {@link eu.securechange.ontology.ontology.Relationship}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationships</em>' containment reference list.
   * @see eu.securechange.ontology.ontology.OntologyPackage#getWorld_Relationships()
   * @model containment="true"
   * @generated
   */
  EList<Relationship> getRelationships();

} // World
