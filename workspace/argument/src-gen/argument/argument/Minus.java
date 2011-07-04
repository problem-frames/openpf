/**
 * <copyright>
 * </copyright>
 *
 */
package argument.argument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link argument.argument.Minus#getLeft <em>Left</em>}</li>
 *   <li>{@link argument.argument.Minus#getAdd_op <em>Add op</em>}</li>
 *   <li>{@link argument.argument.Minus#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see argument.argument.ArgumentPackage#getMinus()
 * @model
 * @generated
 */
public interface Minus extends Addition
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
   * @see #setLeft(Multiplication)
   * @see argument.argument.ArgumentPackage#getMinus_Left()
   * @model containment="true"
   * @generated
   */
  Multiplication getLeft();

  /**
   * Sets the value of the '{@link argument.argument.Minus#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Multiplication value);

  /**
   * Returns the value of the '<em><b>Add op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add op</em>' attribute.
   * @see #setAdd_op(String)
   * @see argument.argument.ArgumentPackage#getMinus_Add_op()
   * @model
   * @generated
   */
  String getAdd_op();

  /**
   * Sets the value of the '{@link argument.argument.Minus#getAdd_op <em>Add op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Add op</em>' attribute.
   * @see #getAdd_op()
   * @generated
   */
  void setAdd_op(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Multiplication)
   * @see argument.argument.ArgumentPackage#getMinus_Right()
   * @model containment="true"
   * @generated
   */
  Multiplication getRight();

  /**
   * Sets the value of the '{@link argument.argument.Minus#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Multiplication value);

} // Minus
