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
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.arguments.Argument#getCname <em>Cname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.Argument#getClaimstr <em>Claimstr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.Argument#getGname <em>Gname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.Argument#getGroundstatements <em>Groundstatements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.Argument#getWname <em>Wname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.Argument#getWarrantstatements <em>Warrantstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends EObject
{
  /**
   * Returns the value of the '<em><b>Cname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cname</em>' attribute.
   * @see #setCname(String)
   * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getArgument_Cname()
   * @model
   * @generated
   */
  String getCname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.arguments.Argument#getCname <em>Cname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cname</em>' attribute.
   * @see #getCname()
   * @generated
   */
  void setCname(String value);

  /**
   * Returns the value of the '<em><b>Claimstr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Claimstr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Claimstr</em>' attribute.
   * @see #setClaimstr(String)
   * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getArgument_Claimstr()
   * @model
   * @generated
   */
  String getClaimstr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.arguments.Argument#getClaimstr <em>Claimstr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Claimstr</em>' attribute.
   * @see #getClaimstr()
   * @generated
   */
  void setClaimstr(String value);

  /**
   * Returns the value of the '<em><b>Gname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gname</em>' attribute.
   * @see #setGname(String)
   * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getArgument_Gname()
   * @model
   * @generated
   */
  String getGname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.arguments.Argument#getGname <em>Gname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gname</em>' attribute.
   * @see #getGname()
   * @generated
   */
  void setGname(String value);

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
   * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getArgument_Groundstatements()
   * @model containment="true"
   * @generated
   */
  EList<gStatement> getGroundstatements();

  /**
   * Returns the value of the '<em><b>Wname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wname</em>' attribute.
   * @see #setWname(String)
   * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getArgument_Wname()
   * @model
   * @generated
   */
  String getWname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.arguments.Argument#getWname <em>Wname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wname</em>' attribute.
   * @see #getWname()
   * @generated
   */
  void setWname(String value);

  /**
   * Returns the value of the '<em><b>Warrantstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.arguments.wStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Warrantstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Warrantstatements</em>' containment reference list.
   * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#getArgument_Warrantstatements()
   * @model containment="true"
   * @generated
   */
  EList<wStatement> getWarrantstatements();

} // Argument
