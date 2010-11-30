/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.rbac.rbac;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.open.rbac.rbac.RbacPackage
 * @generated
 */
public interface RbacFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RbacFactory eINSTANCE = uk.ac.open.rbac.rbac.impl.RbacFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role</em>'.
   * @generated
   */
  Role createRole();

  /**
   * Returns a new object of class '<em>User</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User</em>'.
   * @generated
   */
  User createUser();

  /**
   * Returns a new object of class '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object</em>'.
   * @generated
   */
  Object createObject();

  /**
   * Returns a new object of class '<em>Session</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Session</em>'.
   * @generated
   */
  Session createSession();

  /**
   * Returns a new object of class '<em>User Role Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Role Assignment</em>'.
   * @generated
   */
  UserRoleAssignment createUserRoleAssignment();

  /**
   * Returns a new object of class '<em>Role Permission Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role Permission Assignment</em>'.
   * @generated
   */
  RolePermissionAssignment createRolePermissionAssignment();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RbacPackage getRbacPackage();

} //RbacFactory
