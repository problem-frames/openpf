/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.TemporalPredicate#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getTemporalPredicate()
 * @model
 * @generated
 */
public interface TemporalPredicate extends BoolExpr
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(IntExpr)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getTemporalPredicate_Time()
   * @model containment="true"
   * @generated
   */
  IntExpr getTime();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.TemporalPredicate#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(IntExpr value);

} // TemporalPredicate
