/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.ontology.Contributes#getType <em>Type</em>}</li>
 *   <li>{@link eu.securechange.ontology.Contributes#getSource <em>Source</em>}</li>
 *   <li>{@link eu.securechange.ontology.Contributes#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.ontology.OntologyPackage#getContributes()
 * @model
 * @generated
 */
public interface Contributes extends Relationship
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link eu.securechange.ontology.ContributesType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see eu.securechange.ontology.ContributesType
   * @see #setType(ContributesType)
   * @see eu.securechange.ontology.OntologyPackage#getContributes_Type()
   * @model
   * @generated
   */
  ContributesType getType();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.Contributes#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see eu.securechange.ontology.ContributesType
   * @see #getType()
   * @generated
   */
  void setType(ContributesType value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Thing)
   * @see eu.securechange.ontology.OntologyPackage#getContributes_Source()
   * @model
   * @generated
   */
  Thing getSource();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.Contributes#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Thing value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Thing)
   * @see eu.securechange.ontology.OntologyPackage#getContributes_Target()
   * @model
   * @generated
   */
  Thing getTarget();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.Contributes#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Thing value);

} // Contributes
