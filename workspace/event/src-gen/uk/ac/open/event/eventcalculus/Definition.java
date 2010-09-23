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
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.Definition#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.Definition#getArgs <em>Args</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.Definition#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends EObject
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
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.Definition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.event.eventcalculus.DeclaredParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefinition_Args()
   * @model containment="true"
   * @generated
   */
  EList<DeclaredParameter> getArgs();

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.event.eventcalculus.DeclaredParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference list.
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getDefinition_Return()
   * @model containment="true"
   * @generated
   */
  EList<DeclaredParameter> getReturn();

} // Definition
