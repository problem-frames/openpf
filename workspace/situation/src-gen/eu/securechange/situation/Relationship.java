/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.situation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.situation.Relationship#getType <em>Type</em>}</li>
 *   <li>{@link eu.securechange.situation.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link eu.securechange.situation.Relationship#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.situation.SituationPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends Thing
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link eu.securechange.situation.RelationshipType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see eu.securechange.situation.RelationshipType
   * @see #setType(RelationshipType)
   * @see eu.securechange.situation.SituationPackage#getRelationship_Type()
   * @model
   * @generated
   */
  RelationshipType getType();

  /**
   * Sets the value of the '{@link eu.securechange.situation.Relationship#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see eu.securechange.situation.RelationshipType
   * @see #getType()
   * @generated
   */
  void setType(RelationshipType value);

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
   * @see eu.securechange.situation.SituationPackage#getRelationship_Source()
   * @model
   * @generated
   */
  Thing getSource();

  /**
   * Sets the value of the '{@link eu.securechange.situation.Relationship#getSource <em>Source</em>}' reference.
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
   * @see eu.securechange.situation.SituationPackage#getRelationship_Target()
   * @model
   * @generated
   */
  Thing getTarget();

  /**
   * Sets the value of the '{@link eu.securechange.situation.Relationship#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Thing value);

} // Relationship
