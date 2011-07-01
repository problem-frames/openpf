/**
 * <copyright>
 * </copyright>
 *
 */
package argument.argument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link argument.argument.Expression#getAssign <em>Assign</em>}</li>
 * </ul>
 * </p>
 *
 * @see argument.argument.ArgumentPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends PrePrimaryExpr
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
	 * @see #setAssign(AssignmentOp)
	 * @see argument.argument.ArgumentPackage#getExpression_Assign()
	 * @model containment="true"
	 * @generated
	 */
  AssignmentOp getAssign();

  /**
	 * Sets the value of the '{@link argument.argument.Expression#getAssign <em>Assign</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign</em>' containment reference.
	 * @see #getAssign()
	 * @generated
	 */
  void setAssign(AssignmentOp value);

} // Expression
