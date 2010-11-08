/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fulfils</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.ontology.ontology.Fulfils#getType <em>Type</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.Fulfils#getSource <em>Source</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.Fulfils#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.ontology.ontology.OntologyPackage#getFulfils()
 * @model
 * @generated
 */
public interface Fulfils extends Relationship
{
  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.securechange.ontology.ontology.FulfilsType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.securechange.ontology.ontology.FulfilsType
	 * @see #setType(FulfilsType)
	 * @see eu.securechange.ontology.ontology.OntologyPackage#getFulfils_Type()
	 * @model
	 * @generated
	 */
  FulfilsType getType();

  /**
	 * Sets the value of the '{@link eu.securechange.ontology.ontology.Fulfils#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.securechange.ontology.ontology.FulfilsType
	 * @see #getType()
	 * @generated
	 */
  void setType(FulfilsType value);

  /**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(eu.securechange.ontology.ontology.Process)
	 * @see eu.securechange.ontology.ontology.OntologyPackage#getFulfils_Source()
	 * @model
	 * @generated
	 */
  eu.securechange.ontology.ontology.Process getSource();

  /**
	 * Sets the value of the '{@link eu.securechange.ontology.ontology.Fulfils#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
  void setSource(eu.securechange.ontology.ontology.Process value);

  /**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Proposition)
	 * @see eu.securechange.ontology.ontology.OntologyPackage#getFulfils_Target()
	 * @model
	 * @generated
	 */
  Proposition getTarget();

  /**
	 * Sets the value of the '{@link eu.securechange.ontology.ontology.Fulfils#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
  void setTarget(Proposition value);

} // Fulfils
