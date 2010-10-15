/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.DefSort#getReified <em>Reified</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.DefSort#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefSort()
 * @model
 * @generated
 */
public interface DefSort extends Declaration, Defines
{
  /**
   * Returns the value of the '<em><b>Reified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reified</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reified</em>' attribute.
   * @see #setReified(String)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefSort_Reified()
   * @model
   * @generated
   */
  String getReified();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.DefSort#getReified <em>Reified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reified</em>' attribute.
   * @see #getReified()
   * @generated
   */
  void setReified(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefSort_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.DefSort#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // DefSort
