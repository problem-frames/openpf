/**
 */
package uk.ac.open.problem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phenomenon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.open.problem.Phenomenon#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.open.problem.Phenomenon#isIsControlled <em>Is Controlled</em>}</li>
 * </ul>
 *
 * @see uk.ac.open.problem.ProblemPackage#getPhenomenon()
 * @model
 * @generated
 */
public interface Phenomenon extends Clock
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.open.problem.PhenomenonType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see uk.ac.open.problem.PhenomenonType
   * @see #setType(PhenomenonType)
   * @see uk.ac.open.problem.ProblemPackage#getPhenomenon_Type()
   * @model
   * @generated
   */
  PhenomenonType getType();

  /**
   * Sets the value of the '{@link uk.ac.open.problem.Phenomenon#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see uk.ac.open.problem.PhenomenonType
   * @see #getType()
   * @generated
   */
  void setType(PhenomenonType value);

  /**
   * Returns the value of the '<em><b>Is Controlled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Controlled</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Controlled</em>' attribute.
   * @see #setIsControlled(boolean)
   * @see uk.ac.open.problem.ProblemPackage#getPhenomenon_IsControlled()
   * @model
   * @generated
   */
  boolean isIsControlled();

  /**
   * Sets the value of the '{@link uk.ac.open.problem.Phenomenon#isIsControlled <em>Is Controlled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Controlled</em>' attribute.
   * @see #isIsControlled()
   * @generated
   */
  void setIsControlled(boolean value);

} // Phenomenon
