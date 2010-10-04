/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.arguments;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rec Arg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.arguments.RecArg#getGroundstatements <em>Groundstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getRecArg()
 * @model
 * @generated
 */
public interface RecArg extends EObject
{
  /**
   * Returns the value of the '<em><b>Groundstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.arguments.gStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groundstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groundstatements</em>' containment reference list.
   * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getRecArg_Groundstatements()
   * @model containment="true"
   * @generated
   */
  EList<gStatement> getGroundstatements();

} // RecArg
