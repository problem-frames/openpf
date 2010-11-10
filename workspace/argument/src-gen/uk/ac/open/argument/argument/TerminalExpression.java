/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.TerminalExpression#getFact <em>Fact</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.argument.argument.ArgumentPackage#getTerminalExpression()
 * @model
 * @generated
 */
public interface TerminalExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Fact</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fact</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fact</em>' reference.
   * @see #setFact(Node)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getTerminalExpression_Fact()
   * @model
   * @generated
   */
  Node getFact();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.TerminalExpression#getFact <em>Fact</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fact</em>' reference.
   * @see #getFact()
   * @generated
   */
  void setFact(Node value);

} // TerminalExpression
