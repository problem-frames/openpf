/**
 * <copyright>
 * </copyright>
 *
 */
package argument.argument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link argument.argument.AssignPlus#getLeft <em>Left</em>}</li>
 *   <li>{@link argument.argument.AssignPlus#getAop <em>Aop</em>}</li>
 *   <li>{@link argument.argument.AssignPlus#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see argument.argument.ArgumentPackage#getAssignPlus()
 * @model
 * @generated
 */
public interface AssignPlus extends AssignmentOp
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
   * @see #setLeft(OrExp)
   * @see argument.argument.ArgumentPackage#getAssignPlus_Left()
   * @model containment="true"
   * @generated
   */
  OrExp getLeft();

  /**
   * Sets the value of the '{@link argument.argument.AssignPlus#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(OrExp value);

  /**
   * Returns the value of the '<em><b>Aop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aop</em>' attribute.
   * @see #setAop(String)
   * @see argument.argument.ArgumentPackage#getAssignPlus_Aop()
   * @model
   * @generated
   */
  String getAop();

  /**
   * Sets the value of the '{@link argument.argument.AssignPlus#getAop <em>Aop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aop</em>' attribute.
   * @see #getAop()
   * @generated
   */
  void setAop(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(OrExp)
   * @see argument.argument.ArgumentPackage#getAssignPlus_Right()
   * @model containment="true"
   * @generated
   */
  OrExp getRight();

  /**
   * Sets the value of the '{@link argument.argument.AssignPlus#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(OrExp value);

} // AssignPlus
