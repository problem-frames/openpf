/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.rbac.rbac;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Role Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbac.rbac.UserRoleAssignment#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.UserRoleAssignment#getUser <em>User</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.UserRoleAssignment#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.rbac.rbac.RbacPackage#getUserRoleAssignment()
 * @model
 * @generated
 */
public interface UserRoleAssignment extends EObject
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
   * @see uk.ac.open.rbac.rbac.RbacPackage#getUserRoleAssignment_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.open.rbac.rbac.UserRoleAssignment#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>User</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User</em>' reference.
   * @see #setUser(User)
   * @see uk.ac.open.rbac.rbac.RbacPackage#getUserRoleAssignment_User()
   * @model
   * @generated
   */
  User getUser();

  /**
   * Sets the value of the '{@link uk.ac.open.rbac.rbac.UserRoleAssignment#getUser <em>User</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User</em>' reference.
   * @see #getUser()
   * @generated
   */
  void setUser(User value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' reference.
   * @see #setRole(Role)
   * @see uk.ac.open.rbac.rbac.RbacPackage#getUserRoleAssignment_Role()
   * @model
   * @generated
   */
  Role getRole();

  /**
   * Sets the value of the '{@link uk.ac.open.rbac.rbac.UserRoleAssignment#getRole <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' reference.
   * @see #getRole()
   * @generated
   */
  void setRole(Role value);

} // UserRoleAssignment
