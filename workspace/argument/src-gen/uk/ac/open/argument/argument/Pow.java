/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.Pow#getLeft <em>Left</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Pow#getPow_op <em>Pow op</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.argument.argument.ArgumentPackage#getPow()
 * @model
 * @generated
 */
public interface Pow extends Expression
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
   * @see uk.ac.open.argument.argument.ArgumentPackage#getPow_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Pow#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Pow op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pow op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pow op</em>' attribute.
   * @see #setPow_op(String)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getPow_Pow_op()
   * @model
   * @generated
   */
  String getPow_op();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Pow#getPow_op <em>Pow op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pow op</em>' attribute.
   * @see #getPow_op()
   * @generated
   */
  void setPow_op(String value);

} // Pow
