/**
 */
package uk.ac.open.problem;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link uk.ac.open.problem.Phenomenon#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.problem.Phenomenon#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see uk.ac.open.problem.ProblemPackage#getPhenomenon()
 * @model
 * @generated
 */
public interface Phenomenon extends EObject
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
   * @see uk.ac.open.problem.ProblemPackage#getPhenomenon_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.open.problem.Phenomenon#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see uk.ac.open.problem.ProblemPackage#getPhenomenon_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link uk.ac.open.problem.Phenomenon#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Phenomenon
