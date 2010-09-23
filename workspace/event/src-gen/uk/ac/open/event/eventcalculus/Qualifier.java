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
 * A representation of the model object '<em><b>Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.Qualifier#getNames <em>Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getQualifier()
 * @model
 * @generated
 */
public interface Qualifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Names</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.event.eventcalculus.DeclaredParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' containment reference list.
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getQualifier_Names()
   * @model containment="true"
   * @generated
   */
  EList<DeclaredParameter> getNames();

} // Qualifier
