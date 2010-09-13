/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.ontology.ontology.Provides#getType <em>Type</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.Provides#getSource <em>Source</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.Provides#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.ontology.ontology.OntologyPackage#getProvides()
 * @model
 * @generated
 */
public interface Provides extends Relationship
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
   * @see eu.securechange.ontology.ontology.OntologyPackage#getProvides_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.ontology.Provides#getType <em>Type</em>}' attribute.
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
   * @see #setSource(eu.securechange.ontology.ontology.Process)
   * @see eu.securechange.ontology.ontology.OntologyPackage#getProvides_Source()
   * @model
   * @generated
   */
  eu.securechange.ontology.ontology.Process getSource();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.ontology.Provides#getSource <em>Source</em>}' reference.
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
   * @see #setTarget(Resource)
   * @see eu.securechange.ontology.ontology.OntologyPackage#getProvides_Target()
   * @model
   * @generated
   */
  Resource getTarget();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.ontology.Provides#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Resource value);

} // Provides
