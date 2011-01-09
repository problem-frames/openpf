/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.Or#getLeft <em>Left</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Or#getOr_op <em>Or op</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.argument.argument.ArgumentPackage#getOr()
 * @model
 * @generated
 */
public interface Or extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getOr_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Or#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Or op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Or op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Or op</em>' attribute.
   * @see #setOr_op(String)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getOr_Or_op()
   * @model
   * @generated
   */
  String getOr_op();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Or#getOr_op <em>Or op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Or op</em>' attribute.
   * @see #getOr_op()
   * @generated
   */
  void setOr_op(String value);

} // Or
