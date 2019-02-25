/**
 */
package argument.argument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rel Eq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argument.argument.RelEq#getLeft <em>Left</em>}</li>
 *   <li>{@link argument.argument.RelEq#getRel_op <em>Rel op</em>}</li>
 *   <li>{@link argument.argument.RelEq#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see argument.argument.ArgumentPackage#getRelEq()
 * @model
 * @generated
 */
public interface RelEq extends Relational
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
   * @see #setLeft(Addition)
   * @see argument.argument.ArgumentPackage#getRelEq_Left()
   * @model containment="true"
   * @generated
   */
  Addition getLeft();

  /**
   * Sets the value of the '{@link argument.argument.RelEq#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Addition value);

  /**
   * Returns the value of the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel op</em>' attribute.
   * @see #setRel_op(String)
   * @see argument.argument.ArgumentPackage#getRelEq_Rel_op()
   * @model
   * @generated
   */
  String getRel_op();

  /**
   * Sets the value of the '{@link argument.argument.RelEq#getRel_op <em>Rel op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rel op</em>' attribute.
   * @see #getRel_op()
   * @generated
   */
  void setRel_op(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Addition)
   * @see argument.argument.ArgumentPackage#getRelEq_Right()
   * @model containment="true"
   * @generated
   */
  Addition getRight();

  /**
   * Sets the value of the '{@link argument.argument.RelEq#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Addition value);

} // RelEq
