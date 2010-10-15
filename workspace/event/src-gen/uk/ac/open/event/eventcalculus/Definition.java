/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.Definition#getArgs <em>Args</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.Definition#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends Defines
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' reference list.
   * The list contents are of type {@link uk.ac.open.event.eventcalculus.Defines}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' reference list.
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefinition_Args()
   * @model
   * @generated
   */
  EList<Defines> getArgs();

  /**
   * Returns the value of the '<em><b>Return</b></em>' reference list.
   * The list contents are of type {@link uk.ac.open.event.eventcalculus.Defines}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' reference list.
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefinition_Return()
   * @model
   * @generated
   */
  EList<Defines> getReturn();

} // Definition
