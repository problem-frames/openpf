/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.ontology.Proposition#getType <em>Type</em>}</li>
 *   <li>{@link eu.securechange.ontology.Proposition#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.ontology.OntologyPackage#getProposition()
 * @model
 * @generated
 */
public interface Proposition extends eu.securechange.ontology.Object
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link eu.securechange.ontology.PropositionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see eu.securechange.ontology.PropositionType
   * @see #setType(PropositionType)
   * @see eu.securechange.ontology.OntologyPackage#getProposition_Type()
   * @model
   * @generated
   */
  PropositionType getType();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.Proposition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see eu.securechange.ontology.PropositionType
   * @see #getType()
   * @generated
   */
  void setType(PropositionType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see eu.securechange.ontology.OntologyPackage#getProposition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.Proposition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Proposition
