/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.DefCompletion#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.DefCompletion#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefCompletion()
 * @model
 * @generated
 */
public interface DefCompletion extends Declaration
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.open.event.eventcalculus.LabelType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see uk.ac.open.event.eventcalculus.LabelType
   * @see #setType(LabelType)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefCompletion_Type()
   * @model
   * @generated
   */
  LabelType getType();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.DefCompletion#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see uk.ac.open.event.eventcalculus.LabelType
   * @see #getType()
   * @generated
   */
  void setType(LabelType value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' reference.
   * @see #setLabel(Definition)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefCompletion_Label()
   * @model
   * @generated
   */
  Definition getLabel();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.DefCompletion#getLabel <em>Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(Definition value);

} // DefCompletion
