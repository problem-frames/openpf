/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.rbac.rbac;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.open.rbac.rbac.RbacFactory
 * @model kind="package"
 * @generated
 */
public interface RbacPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rbac";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk.open/rbac/RBAC";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rbac";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RbacPackage eINSTANCE = uk.ac.open.rbac.rbac.impl.RbacPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.open.rbac.rbac.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbac.rbac.impl.ModelImpl
   * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Roles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ROLES = 0;

  /**
   * The feature id for the '<em><b>Users</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__USERS = 1;

  /**
   * The feature id for the '<em><b>Sessions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SESSIONS = 2;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__OBJECTS = 3;

  /**
   * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PERMISSIONS = 4;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link uk.ac.open.rbac.rbac.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbac.rbac.impl.RoleImpl
   * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getRole()
   * @generated
   */
  int ROLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__PERMISSIONS = 1;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.rbac.rbac.impl.UserImpl <em>User</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbac.rbac.impl.UserImpl
   * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getUser()
   * @generated
   */
  int USER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__NAME = 0;

  /**
   * The number of structural features of the '<em>User</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.open.rbac.rbac.impl.PermissionImpl <em>Permission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbac.rbac.impl.PermissionImpl
   * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getPermission()
   * @generated
   */
  int PERMISSION = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION__ROLE = 1;

  /**
   * The feature id for the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION__OBJECT = 2;

  /**
   * The number of structural features of the '<em>Permission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERMISSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.open.rbac.rbac.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbac.rbac.impl.ObjectImpl
   * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__NAME = 0;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.open.rbac.rbac.impl.SessionImpl <em>Session</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbac.rbac.impl.SessionImpl
   * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getSession()
   * @generated
   */
  int SESSION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__ASSIGNMENTS = 1;

  /**
   * The number of structural features of the '<em>Session</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.rbac.rbac.impl.UserRoleAssignmentImpl <em>User Role Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbac.rbac.impl.UserRoleAssignmentImpl
   * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getUserRoleAssignment()
   * @generated
   */
  int USER_ROLE_ASSIGNMENT = 6;

  /**
   * The feature id for the '<em><b>User</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_ROLE_ASSIGNMENT__USER = 0;

  /**
   * The feature id for the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_ROLE_ASSIGNMENT__ROLE = 1;

  /**
   * The number of structural features of the '<em>User Role Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_ROLE_ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.rbac.rbac.impl.RolePermissionAssignmentImpl <em>Role Permission Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.rbac.rbac.impl.RolePermissionAssignmentImpl
   * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getRolePermissionAssignment()
   * @generated
   */
  int ROLE_PERMISSION_ASSIGNMENT = 7;

  /**
   * The feature id for the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PERMISSION_ASSIGNMENT__ROLE = 0;

  /**
   * The feature id for the '<em><b>Permission</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PERMISSION_ASSIGNMENT__PERMISSION = 1;

  /**
   * The number of structural features of the '<em>Role Permission Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PERMISSION_ASSIGNMENT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link uk.ac.open.rbac.rbac.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see uk.ac.open.rbac.rbac.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbac.rbac.Model#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roles</em>'.
   * @see uk.ac.open.rbac.rbac.Model#getRoles()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Roles();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbac.rbac.Model#getUsers <em>Users</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Users</em>'.
   * @see uk.ac.open.rbac.rbac.Model#getUsers()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Users();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbac.rbac.Model#getSessions <em>Sessions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sessions</em>'.
   * @see uk.ac.open.rbac.rbac.Model#getSessions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Sessions();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbac.rbac.Model#getObjects <em>Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objects</em>'.
   * @see uk.ac.open.rbac.rbac.Model#getObjects()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Objects();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbac.rbac.Model#getPermissions <em>Permissions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Permissions</em>'.
   * @see uk.ac.open.rbac.rbac.Model#getPermissions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Permissions();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbac.rbac.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see uk.ac.open.rbac.rbac.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.rbac.rbac.Role#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.rbac.rbac.Role#getName()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbac.rbac.Role#getPermissions <em>Permissions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Permissions</em>'.
   * @see uk.ac.open.rbac.rbac.Role#getPermissions()
   * @see #getRole()
   * @generated
   */
  EReference getRole_Permissions();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbac.rbac.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User</em>'.
   * @see uk.ac.open.rbac.rbac.User
   * @generated
   */
  EClass getUser();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.rbac.rbac.User#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.rbac.rbac.User#getName()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbac.rbac.Permission <em>Permission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Permission</em>'.
   * @see uk.ac.open.rbac.rbac.Permission
   * @generated
   */
  EClass getPermission();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.rbac.rbac.Permission#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.open.rbac.rbac.Permission#getType()
   * @see #getPermission()
   * @generated
   */
  EAttribute getPermission_Type();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.rbac.rbac.Permission#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Role</em>'.
   * @see uk.ac.open.rbac.rbac.Permission#getRole()
   * @see #getPermission()
   * @generated
   */
  EReference getPermission_Role();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.rbac.rbac.Permission#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Object</em>'.
   * @see uk.ac.open.rbac.rbac.Permission#getObject()
   * @see #getPermission()
   * @generated
   */
  EReference getPermission_Object();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbac.rbac.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see uk.ac.open.rbac.rbac.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.rbac.rbac.Object#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.rbac.rbac.Object#getName()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbac.rbac.Session <em>Session</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Session</em>'.
   * @see uk.ac.open.rbac.rbac.Session
   * @generated
   */
  EClass getSession();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.rbac.rbac.Session#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.rbac.rbac.Session#getName()
   * @see #getSession()
   * @generated
   */
  EAttribute getSession_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.rbac.rbac.Session#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignments</em>'.
   * @see uk.ac.open.rbac.rbac.Session#getAssignments()
   * @see #getSession()
   * @generated
   */
  EReference getSession_Assignments();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbac.rbac.UserRoleAssignment <em>User Role Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Role Assignment</em>'.
   * @see uk.ac.open.rbac.rbac.UserRoleAssignment
   * @generated
   */
  EClass getUserRoleAssignment();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.rbac.rbac.UserRoleAssignment#getUser <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>User</em>'.
   * @see uk.ac.open.rbac.rbac.UserRoleAssignment#getUser()
   * @see #getUserRoleAssignment()
   * @generated
   */
  EReference getUserRoleAssignment_User();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.rbac.rbac.UserRoleAssignment#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Role</em>'.
   * @see uk.ac.open.rbac.rbac.UserRoleAssignment#getRole()
   * @see #getUserRoleAssignment()
   * @generated
   */
  EReference getUserRoleAssignment_Role();

  /**
   * Returns the meta object for class '{@link uk.ac.open.rbac.rbac.RolePermissionAssignment <em>Role Permission Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Permission Assignment</em>'.
   * @see uk.ac.open.rbac.rbac.RolePermissionAssignment
   * @generated
   */
  EClass getRolePermissionAssignment();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.rbac.rbac.RolePermissionAssignment#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Role</em>'.
   * @see uk.ac.open.rbac.rbac.RolePermissionAssignment#getRole()
   * @see #getRolePermissionAssignment()
   * @generated
   */
  EReference getRolePermissionAssignment_Role();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.rbac.rbac.RolePermissionAssignment#getPermission <em>Permission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Permission</em>'.
   * @see uk.ac.open.rbac.rbac.RolePermissionAssignment#getPermission()
   * @see #getRolePermissionAssignment()
   * @generated
   */
  EReference getRolePermissionAssignment_Permission();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RbacFactory getRbacFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.ac.open.rbac.rbac.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbac.rbac.impl.ModelImpl
     * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ROLES = eINSTANCE.getModel_Roles();

    /**
     * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__USERS = eINSTANCE.getModel_Users();

    /**
     * The meta object literal for the '<em><b>Sessions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SESSIONS = eINSTANCE.getModel_Sessions();

    /**
     * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__OBJECTS = eINSTANCE.getModel_Objects();

    /**
     * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PERMISSIONS = eINSTANCE.getModel_Permissions();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbac.rbac.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbac.rbac.impl.RoleImpl
     * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

    /**
     * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE__PERMISSIONS = eINSTANCE.getRole_Permissions();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbac.rbac.impl.UserImpl <em>User</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbac.rbac.impl.UserImpl
     * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getUser()
     * @generated
     */
    EClass USER = eINSTANCE.getUser();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER__NAME = eINSTANCE.getUser_Name();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbac.rbac.impl.PermissionImpl <em>Permission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbac.rbac.impl.PermissionImpl
     * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getPermission()
     * @generated
     */
    EClass PERMISSION = eINSTANCE.getPermission();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERMISSION__TYPE = eINSTANCE.getPermission_Type();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERMISSION__ROLE = eINSTANCE.getPermission_Role();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERMISSION__OBJECT = eINSTANCE.getPermission_Object();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbac.rbac.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbac.rbac.impl.ObjectImpl
     * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbac.rbac.impl.SessionImpl <em>Session</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbac.rbac.impl.SessionImpl
     * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getSession()
     * @generated
     */
    EClass SESSION = eINSTANCE.getSession();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SESSION__NAME = eINSTANCE.getSession_Name();

    /**
     * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SESSION__ASSIGNMENTS = eINSTANCE.getSession_Assignments();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbac.rbac.impl.UserRoleAssignmentImpl <em>User Role Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbac.rbac.impl.UserRoleAssignmentImpl
     * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getUserRoleAssignment()
     * @generated
     */
    EClass USER_ROLE_ASSIGNMENT = eINSTANCE.getUserRoleAssignment();

    /**
     * The meta object literal for the '<em><b>User</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_ROLE_ASSIGNMENT__USER = eINSTANCE.getUserRoleAssignment_User();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_ROLE_ASSIGNMENT__ROLE = eINSTANCE.getUserRoleAssignment_Role();

    /**
     * The meta object literal for the '{@link uk.ac.open.rbac.rbac.impl.RolePermissionAssignmentImpl <em>Role Permission Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.rbac.rbac.impl.RolePermissionAssignmentImpl
     * @see uk.ac.open.rbac.rbac.impl.RbacPackageImpl#getRolePermissionAssignment()
     * @generated
     */
    EClass ROLE_PERMISSION_ASSIGNMENT = eINSTANCE.getRolePermissionAssignment();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_PERMISSION_ASSIGNMENT__ROLE = eINSTANCE.getRolePermissionAssignment_Role();

    /**
     * The meta object literal for the '<em><b>Permission</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_PERMISSION_ASSIGNMENT__PERMISSION = eINSTANCE.getRolePermissionAssignment_Permission();

  }

} //RbacPackage
