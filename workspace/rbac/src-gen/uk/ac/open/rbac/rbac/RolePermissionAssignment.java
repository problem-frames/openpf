/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.rbac.rbac;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Permission Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbac.rbac.RolePermissionAssignment#getRole <em>Role</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.RolePermissionAssignment#getPermission <em>Permission</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.rbac.rbac.RbacPackage#getRolePermissionAssignment()
 * @model
 * @generated
 */
public interface RolePermissionAssignment extends EObject
{
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
   * @see uk.ac.open.rbac.rbac.RbacPackage#getRolePermissionAssignment_Role()
   * @model
   * @generated
   */
  Role getRole();

  /**
   * Sets the value of the '{@link uk.ac.open.rbac.rbac.RolePermissionAssignment#getRole <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' reference.
   * @see #getRole()
   * @generated
   */
  void setRole(Role value);

  /**
   * Returns the value of the '<em><b>Permission</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Permission</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permission</em>' reference.
   * @see #setPermission(Permission)
   * @see uk.ac.open.rbac.rbac.RbacPackage#getRolePermissionAssignment_Permission()
   * @model
   * @generated
   */
  Permission getPermission();

  /**
   * Sets the value of the '{@link uk.ac.open.rbac.rbac.RolePermissionAssignment#getPermission <em>Permission</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Permission</em>' reference.
   * @see #getPermission()
   * @generated
   */
  void setPermission(Permission value);

} // RolePermissionAssignment
