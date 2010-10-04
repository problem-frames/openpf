/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.arguments;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>rStatement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.arguments.rStatement#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.rStatement#getGroundstr <em>Groundstr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getrStatement()
 * @model
 * @generated
 */
public interface rStatement extends EObject
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
   * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getrStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.arguments.rStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Groundstr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groundstr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groundstr</em>' attribute.
   * @see #setGroundstr(String)
   * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getrStatement_Groundstr()
   * @model
   * @generated
   */
  String getGroundstr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.arguments.rStatement#getGroundstr <em>Groundstr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Groundstr</em>' attribute.
   * @see #getGroundstr()
   * @generated
   */
  void setGroundstr(String value);

} // rStatement
