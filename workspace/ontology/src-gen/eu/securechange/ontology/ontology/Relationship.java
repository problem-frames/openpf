/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology;

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
 *   <li>{@link eu.securechange.ontology.ontology.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.Relationship#getTarget <em>Target</em>}</li>
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
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(World)
   * @see eu.securechange.ontology.ontology.OntologyPackage#getRelationship_Source()
   * @model
   * @generated
   */
  World getSource();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.ontology.Relationship#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(World value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(World)
   * @see eu.securechange.ontology.ontology.OntologyPackage#getRelationship_Target()
   * @model
   * @generated
   */
  World getTarget();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.ontology.Relationship#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(World value);

} // Relationship
