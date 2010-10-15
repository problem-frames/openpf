/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.Parameters#getNames <em>Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getParameters()
 * @model
 * @generated
 */
public interface Parameters extends EObject
{
  /**
   * Returns the value of the '<em><b>Names</b></em>' reference list.
   * The list contents are of type {@link uk.ac.open.event.eventcalculus.Defines}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' reference list.
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getParameters_Names()
   * @model
   * @generated
   */
  EList<Defines> getNames();

} // Parameters
