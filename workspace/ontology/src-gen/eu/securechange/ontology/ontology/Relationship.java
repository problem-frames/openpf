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
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.ontology.ontology.Relationship#getType <em>Type</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.Relationship#getEntities <em>Entities</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.Relationship#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.ontology.ontology.OntologyPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link eu.securechange.ontology.ontology.RelType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see eu.securechange.ontology.ontology.RelType
   * @see #setType(RelType)
   * @see eu.securechange.ontology.ontology.OntologyPackage#getRelationship_Type()
   * @model
   * @generated
   */
  RelType getType();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.ontology.Relationship#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see eu.securechange.ontology.ontology.RelType
   * @see #getType()
   * @generated
   */
  void setType(RelType value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' reference list.
   * The list contents are of type {@link eu.securechange.ontology.ontology.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' reference list.
   * @see eu.securechange.ontology.ontology.OntologyPackage#getRelationship_Entities()
   * @model
   * @generated
   */
  EList<Entity> getEntities();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link eu.securechange.ontology.ontology.Proposition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see eu.securechange.ontology.ontology.OntologyPackage#getRelationship_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Proposition> getProperties();

} // Relationship
