/**
 */
package uk.ac.open.event.eventcalculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.DefRange#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.DefRange#getMin <em>Min</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.DefRange#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefRange()
 * @model
 * @generated
 */
public interface DefRange extends Declaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(DefSort)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefRange_Name()
   * @model
   * @generated
   */
  DefSort getName();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.DefRange#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(DefSort value);

  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(int)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefRange_Min()
   * @model
   * @generated
   */
  int getMin();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.DefRange#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(int value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(int)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefRange_Max()
   * @model
   * @generated
   */
  int getMax();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.DefRange#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(int value);

} // DefRange
