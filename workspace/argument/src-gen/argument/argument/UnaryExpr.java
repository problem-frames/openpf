/**
 */
package argument.argument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argument.argument.UnaryExpr#getUop <em>Uop</em>}</li>
 *   <li>{@link argument.argument.UnaryExpr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see argument.argument.ArgumentPackage#getUnaryExpr()
 * @model
 * @generated
 */
public interface UnaryExpr extends Power
{
  /**
   * Returns the value of the '<em><b>Uop</b></em>' attribute.
   * The literals are from the enumeration {@link argument.argument.UnaryOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uop</em>' attribute.
   * @see argument.argument.UnaryOp
   * @see #setUop(UnaryOp)
   * @see argument.argument.ArgumentPackage#getUnaryExpr_Uop()
   * @model
   * @generated
   */
  UnaryOp getUop();

  /**
   * Sets the value of the '{@link argument.argument.UnaryExpr#getUop <em>Uop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uop</em>' attribute.
   * @see argument.argument.UnaryOp
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
   * @see #setRight(PrePrimaryExpr)
   * @see argument.argument.ArgumentPackage#getUnaryExpr_Right()
   * @model containment="true"
   * @generated
   */
  PrePrimaryExpr getRight();

  /**
   * Sets the value of the '{@link argument.argument.UnaryExpr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(PrePrimaryExpr value);

} // UnaryExpr
