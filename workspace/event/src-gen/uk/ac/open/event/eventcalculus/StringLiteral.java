/**
 */
package uk.ac.open.event.eventcalculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.StringLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getStringLiteral()
 * @model
 * @generated
 */
public interface StringLiteral extends TerminalExpression
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
   * @see #setValue(String)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getStringLiteral_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.StringLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // StringLiteral
