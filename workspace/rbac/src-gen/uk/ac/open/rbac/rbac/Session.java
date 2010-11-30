/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.rbac.rbac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbac.rbac.Session#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.Session#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.rbac.rbac.RbacPackage#getSession()
 * @model
 * @generated
 */
public interface Session extends EObject
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
   * @see uk.ac.open.rbac.rbac.RbacPackage#getSession_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.open.rbac.rbac.Session#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbac.rbac.UserRoleAssignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignments</em>' containment reference list.
   * @see uk.ac.open.rbac.rbac.RbacPackage#getSession_Assignments()
   * @model containment="true"
   * @generated
   */
  EList<UserRoleAssignment> getAssignments();

} // Session
