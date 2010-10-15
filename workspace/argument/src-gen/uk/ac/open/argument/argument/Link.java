/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.Link#getFrom <em>From</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Link#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.argument.argument.ArgumentPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(Argument)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getLink_From()
   * @model
   * @generated
   */
  Argument getFrom();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Link#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Argument value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(Argument)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getLink_To()
   * @model
   * @generated
   */
  Argument getTo();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Link#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Argument value);

} // Link
