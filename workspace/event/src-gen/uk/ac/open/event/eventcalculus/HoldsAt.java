/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Holds At</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.HoldsAt#getFluent <em>Fluent</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getHoldsAt()
 * @model
 * @generated
 */
public interface HoldsAt extends TemporalPredicate
{
  /**
   * Returns the value of the '<em><b>Fluent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fluent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fluent</em>' reference.
   * @see #setFluent(Term)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getHoldsAt_Fluent()
   * @model
   * @generated
   */
  Term getFluent();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.HoldsAt#getFluent <em>Fluent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fluent</em>' reference.
   * @see #getFluent()
   * @generated
   */
  void setFluent(Term value);

} // HoldsAt
