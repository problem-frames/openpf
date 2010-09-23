/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.IntLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getIntLiteral()
 * @model
 * @generated
 */
public interface IntLiteral extends TerminalExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getIntLiteral_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.IntLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // IntLiteral
