/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wants</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.ontology.ontology.Wants#getType <em>Type</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.Wants#getSource <em>Source</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.Wants#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.ontology.ontology.OntologyPackage#getWants()
 * @model
 * @generated
 */
public interface Wants extends Relationship
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see eu.securechange.ontology.ontology.OntologyPackage#getWants_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.ontology.Wants#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Actor)
   * @see eu.securechange.ontology.ontology.OntologyPackage#getWants_Source()
   * @model
   * @generated
   */
  Actor getSource();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.ontology.Wants#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Actor value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Requirement)
   * @see eu.securechange.ontology.ontology.OntologyPackage#getWants_Target()
   * @model
   * @generated
   */
  Requirement getTarget();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.ontology.Wants#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Requirement value);

} // Wants
