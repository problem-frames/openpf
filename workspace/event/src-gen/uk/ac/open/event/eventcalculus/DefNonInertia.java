/**
 */
package uk.ac.open.event.eventcalculus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Non Inertia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.DefNonInertia#getNames <em>Names</em>}</li>
 * </ul>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefNonInertia()
 * @model
 * @generated
 */
public interface DefNonInertia extends Declaration
{
  /**
   * Returns the value of the '<em><b>Names</b></em>' reference list.
   * The list contents are of type {@link uk.ac.open.event.eventcalculus.Definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' reference list.
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefNonInertia_Names()
   * @model
   * @generated
   */
  EList<Definition> getNames();

} // DefNonInertia
