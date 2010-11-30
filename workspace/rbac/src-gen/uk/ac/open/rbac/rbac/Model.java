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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbac.rbac.Model#getRoles <em>Roles</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.Model#getUsers <em>Users</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.Model#getSessions <em>Sessions</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.Model#getObjects <em>Objects</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.Model#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.rbac.rbac.RbacPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbac.rbac.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see uk.ac.open.rbac.rbac.RbacPackage#getModel_Roles()
   * @model containment="true"
   * @generated
   */
  EList<Role> getRoles();

  /**
   * Returns the value of the '<em><b>Users</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbac.rbac.User}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Users</em>' containment reference list.
   * @see uk.ac.open.rbac.rbac.RbacPackage#getModel_Users()
   * @model containment="true"
   * @generated
   */
  EList<User> getUsers();

  /**
   * Returns the value of the '<em><b>Sessions</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbac.rbac.Session}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sessions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sessions</em>' containment reference list.
   * @see uk.ac.open.rbac.rbac.RbacPackage#getModel_Sessions()
   * @model containment="true"
   * @generated
   */
  EList<Session> getSessions();

  /**
   * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbac.rbac.Object}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objects</em>' containment reference list.
   * @see uk.ac.open.rbac.rbac.RbacPackage#getModel_Objects()
   * @model containment="true"
   * @generated
   */
  EList<uk.ac.open.rbac.rbac.Object> getObjects();

  /**
   * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbac.rbac.Permission}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Permissions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permissions</em>' containment reference list.
   * @see uk.ac.open.rbac.rbac.RbacPackage#getModel_Permissions()
   * @model containment="true"
   * @generated
   */
  EList<Permission> getPermissions();

} // Model
