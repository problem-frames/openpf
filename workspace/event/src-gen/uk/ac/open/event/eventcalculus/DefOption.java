/**
 */
package uk.ac.open.event.eventcalculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.DefOption#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.DefOption#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.DefOption#getValue2 <em>Value2</em>}</li>
 * </ul>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefOption()
 * @model
 * @generated
 */
public interface DefOption extends Declaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefOption_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.DefOption#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefOption_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.DefOption#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Value2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value2</em>' attribute.
   * @see #setValue2(String)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefOption_Value2()
   * @model
   * @generated
   */
  String getValue2();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.DefOption#getValue2 <em>Value2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value2</em>' attribute.
   * @see #getValue2()
   * @generated
   */
  void setValue2(String value);

} // DefOption
