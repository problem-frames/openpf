/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trusts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.ontology.ontology.Trusts#getType <em>Type</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.Trusts#getSource <em>Source</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.Trusts#getTarget <em>Target</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.Trusts#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.ontology.ontology.OntologyPackage#getTrusts()
 * @model
 * @generated
 */
public interface Trusts extends Relationship
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
   * @see eu.securechange.ontology.ontology.OntologyPackage#getTrusts_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.ontology.Trusts#getType <em>Type</em>}' attribute.
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
   * @see eu.securechange.ontology.ontology.OntologyPackage#getTrusts_Source()
   * @model
   * @generated
   */
  Actor getSource();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.ontology.Trusts#getSource <em>Source</em>}' reference.
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
   * @see #setTarget(Actor)
   * @see eu.securechange.ontology.ontology.OntologyPackage#getTrusts_Target()
   * @model
   * @generated
   */
  Actor getTarget();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.ontology.Trusts#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Actor value);

  /**
   * Returns the value of the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' reference.
   * @see #setEntity(Thing)
   * @see eu.securechange.ontology.ontology.OntologyPackage#getTrusts_Entity()
   * @model
   * @generated
   */
  Thing getEntity();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.ontology.Trusts#getEntity <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Thing value);

} // Trusts
