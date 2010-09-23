/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rel Gt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.RelGt#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getRelGt()
 * @model
 * @generated
 */
public interface RelGt extends Expression
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
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getRelGt_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.RelGt#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

} // RelGt
