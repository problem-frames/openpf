/**
 */
package uk.ac.open.event.eventcalculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Min</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.AssignMin#getLeft <em>Left</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.AssignMin#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getAssignMin()
 * @model
 * @generated
 */
public interface AssignMin extends Expression
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
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getAssignMin_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.AssignMin#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Q</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Q</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Q</em>' containment reference.
   * @see #setQ(Qualifier)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getAssignMin_Q()
   * @model containment="true"
   * @generated
   */
  Qualifier getQ();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.AssignMin#getQ <em>Q</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Q</em>' containment reference.
   * @see #getQ()
   * @generated
   */
  void setQ(Qualifier value);

} // AssignMin
