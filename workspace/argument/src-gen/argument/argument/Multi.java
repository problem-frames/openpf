/**
 * <copyright>
 * </copyright>
 *
 */
package argument.argument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link argument.argument.Multi#getLeft <em>Left</em>}</li>
 *   <li>{@link argument.argument.Multi#getMul_op <em>Mul op</em>}</li>
 *   <li>{@link argument.argument.Multi#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see argument.argument.ArgumentPackage#getMulti()
 * @model
 * @generated
 */
public interface Multi extends Multiplication
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
   * @see #setLeft(Power)
   * @see argument.argument.ArgumentPackage#getMulti_Left()
   * @model containment="true"
   * @generated
   */
  Power getLeft();

  /**
   * Sets the value of the '{@link argument.argument.Multi#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Power value);

  /**
   * Returns the value of the '<em><b>Mul op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mul op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mul op</em>' attribute.
   * @see #setMul_op(String)
   * @see argument.argument.ArgumentPackage#getMulti_Mul_op()
   * @model
   * @generated
   */
  String getMul_op();

  /**
   * Sets the value of the '{@link argument.argument.Multi#getMul_op <em>Mul op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mul op</em>' attribute.
   * @see #getMul_op()
   * @generated
   */
  void setMul_op(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Power)
   * @see argument.argument.ArgumentPackage#getMulti_Right()
   * @model containment="true"
   * @generated
   */
  Power getRight();

  /**
   * Sets the value of the '{@link argument.argument.Multi#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Power value);

} // Multi
