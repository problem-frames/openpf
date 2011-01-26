/**
 * <copyright>
 * </copyright>
 *

 */
package uk.ac.open.argument.argument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.Expression#getAssign <em>Assign</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Expression#getUop <em>Uop</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Expression#getRight <em>Right</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Expression#getN <em>N</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.argument.argument.ArgumentPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assign</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign</em>' containment reference.
   * @see #setAssign(Expression)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getExpression_Assign()
   * @model containment="true"
   * @generated
   */
  Expression getAssign();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Expression#getAssign <em>Assign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assign</em>' containment reference.
   * @see #getAssign()
   * @generated
   */
  void setAssign(Expression value);

  /**
   * Returns the value of the '<em><b>Uop</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.open.argument.argument.UnaryOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uop</em>' attribute.
   * @see uk.ac.open.argument.argument.UnaryOp
   * @see #setUop(UnaryOp)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getExpression_Uop()
   * @model
   * @generated
   */
  UnaryOp getUop();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Expression#getUop <em>Uop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uop</em>' attribute.
   * @see uk.ac.open.argument.argument.UnaryOp
   * @see #getUop()
   * @generated
   */
  void setUop(UnaryOp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getExpression_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Expression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(int)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getExpression_N()
   * @model
   * @generated
   */
  int getN();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Expression#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(int value);

} // Expression
