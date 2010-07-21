/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.Terminates#getEvent <em>Event</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.Terminates#getFluent <em>Fluent</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.Terminates#getArgs2 <em>Args2</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getTerminates()
 * @model
 * @generated
 */
public interface Terminates extends TemporalPredicate
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(Term)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getTerminates_Event()
   * @model
   * @generated
   */
  Term getEvent();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.Terminates#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Term value);

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
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getTerminates_Fluent()
   * @model
   * @generated
   */
  Term getFluent();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.Terminates#getFluent <em>Fluent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fluent</em>' reference.
   * @see #getFluent()
   * @generated
   */
  void setFluent(Term value);

  /**
   * Returns the value of the '<em><b>Args2</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args2</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args2</em>' attribute list.
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getTerminates_Args2()
   * @model unique="false"
   * @generated
   */
  EList<String> getArgs2();

} // Terminates
