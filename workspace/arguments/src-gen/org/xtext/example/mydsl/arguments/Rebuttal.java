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
 * A representation of the model object '<em><b>Rebuttal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.arguments.Rebuttal#getAname <em>Aname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.Rebuttal#getRname <em>Rname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.Rebuttal#getRebuttalstatements <em>Rebuttalstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getRebuttal()
 * @model
 * @generated
 */
public interface Rebuttal extends EObject
{
  /**
   * Returns the value of the '<em><b>Aname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aname</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aname</em>' containment reference.
   * @see #setAname(Argument)
   * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getRebuttal_Aname()
   * @model containment="true"
   * @generated
   */
  Argument getAname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.arguments.Rebuttal#getAname <em>Aname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aname</em>' containment reference.
   * @see #getAname()
   * @generated
   */
  void setAname(Argument value);

  /**
   * Returns the value of the '<em><b>Rname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rname</em>' attribute.
   * @see #setRname(String)
   * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getRebuttal_Rname()
   * @model
   * @generated
   */
  String getRname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.arguments.Rebuttal#getRname <em>Rname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rname</em>' attribute.
   * @see #getRname()
   * @generated
   */
  void setRname(String value);

  /**
   * Returns the value of the '<em><b>Rebuttalstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.arguments.rStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rebuttalstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rebuttalstatements</em>' containment reference list.
   * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getRebuttal_Rebuttalstatements()
   * @model containment="true"
   * @generated
   */
  EList<rStatement> getRebuttalstatements();

} // Rebuttal
