/**
 * <copyright>
 * </copyright>
 *
 */
package argument.argument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link argument.argument.And#getLeft <em>Left</em>}</li>
 *   <li>{@link argument.argument.And#getAnd_op <em>And op</em>}</li>
 *   <li>{@link argument.argument.And#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see argument.argument.ArgumentPackage#getAnd()
 * @model
 * @generated
 */
public interface And extends AndExp
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
   * @see #setLeft(Relational)
   * @see argument.argument.ArgumentPackage#getAnd_Left()
   * @model containment="true"
   * @generated
   */
  Relational getLeft();

  /**
   * Sets the value of the '{@link argument.argument.And#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Relational value);

  /**
   * Returns the value of the '<em><b>And op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>And op</em>' attribute.
   * @see #setAnd_op(String)
   * @see argument.argument.ArgumentPackage#getAnd_And_op()
   * @model
   * @generated
   */
  String getAnd_op();

  /**
   * Sets the value of the '{@link argument.argument.And#getAnd_op <em>And op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>And op</em>' attribute.
   * @see #getAnd_op()
   * @generated
   */
  void setAnd_op(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Relational)
   * @see argument.argument.ArgumentPackage#getAnd_Right()
   * @model containment="true"
   * @generated
   */
  Relational getRight();

  /**
   * Sets the value of the '{@link argument.argument.And#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Relational value);

} // And
