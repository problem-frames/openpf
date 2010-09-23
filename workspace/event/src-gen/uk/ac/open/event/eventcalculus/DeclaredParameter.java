/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.DeclaredParameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDeclaredParameter()
 * @model
 * @generated
 */
public interface DeclaredParameter extends Expression
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
   * @see #setName(EObject)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDeclaredParameter_Name()
   * @model
   * @generated
   */
  EObject getName();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.DeclaredParameter#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(EObject value);

} // DeclaredParameter
