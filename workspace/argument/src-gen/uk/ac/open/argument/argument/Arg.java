/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.Arg#getGroundstatements <em>Groundstatements</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Arg#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.argument.argument.ArgumentPackage#getArg()
 * @model
 * @generated
 */
public interface Arg extends EObject
{
  /**
   * Returns the value of the '<em><b>Groundstatements</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.argument.argument.gStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groundstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groundstatements</em>' containment reference list.
   * @see uk.ac.open.argument.argument.ArgumentPackage#getArg_Groundstatements()
   * @model containment="true"
   * @generated
   */
  EList<gStatement> getGroundstatements();

  /**
   * Returns the value of the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inner</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner</em>' containment reference.
   * @see #setInner(RecArg)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getArg_Inner()
   * @model containment="true"
   * @generated
   */
  RecArg getInner();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Arg#getInner <em>Inner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inner</em>' containment reference.
   * @see #getInner()
   * @generated
   */
  void setInner(RecArg value);

} // Arg
