/**
 */
package uk.ac.open.problem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.open.problem.Constraint#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.open.problem.Constraint#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see uk.ac.open.problem.ProblemPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.open.problem.ConstraintType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see uk.ac.open.problem.ConstraintType
   * @see #setType(ConstraintType)
   * @see uk.ac.open.problem.ProblemPackage#getConstraint_Type()
   * @model
   * @generated
   */
  ConstraintType getType();

  /**
   * Sets the value of the '{@link uk.ac.open.problem.Constraint#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see uk.ac.open.problem.ConstraintType
   * @see #getType()
   * @generated
   */
  void setType(ConstraintType value);

  /**
   * Returns the value of the '<em><b>Operand</b></em>' reference list.
   * The list contents are of type {@link uk.ac.open.problem.Clock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand</em>' reference list.
   * @see uk.ac.open.problem.ProblemPackage#getConstraint_Operand()
   * @model
   * @generated
   */
  EList<Clock> getOperand();

} // Constraint
