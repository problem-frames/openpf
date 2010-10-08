/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Connective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.SplitConnective#getLeft <em>Left</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.SplitConnective#getConnective <em>Connective</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.SplitConnective#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.argument.argument.ArgumentPackage#getSplitConnective()
 * @model
 * @generated
 */
public interface SplitConnective extends Expression
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
   * @see uk.ac.open.argument.argument.ArgumentPackage#getSplitConnective_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.SplitConnective#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Connective</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.open.argument.argument.ConnectiveType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connective</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connective</em>' attribute.
   * @see uk.ac.open.argument.argument.ConnectiveType
   * @see #setConnective(ConnectiveType)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getSplitConnective_Connective()
   * @model
   * @generated
   */
  ConnectiveType getConnective();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.SplitConnective#getConnective <em>Connective</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connective</em>' attribute.
   * @see uk.ac.open.argument.argument.ConnectiveType
   * @see #getConnective()
   * @generated
   */
  void setConnective(ConnectiveType value);

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
   * @see uk.ac.open.argument.argument.ArgumentPackage#getSplitConnective_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.SplitConnective#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // SplitConnective
