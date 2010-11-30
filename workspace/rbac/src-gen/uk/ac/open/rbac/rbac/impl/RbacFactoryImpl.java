/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.rbac.rbac.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.open.rbac.rbac.Model;
import uk.ac.open.rbac.rbac.Permission;
import uk.ac.open.rbac.rbac.RbacFactory;
import uk.ac.open.rbac.rbac.RbacPackage;
import uk.ac.open.rbac.rbac.Role;
import uk.ac.open.rbac.rbac.RolePermissionAssignment;
import uk.ac.open.rbac.rbac.Session;
import uk.ac.open.rbac.rbac.User;
import uk.ac.open.rbac.rbac.UserRoleAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RbacFactoryImpl extends EFactoryImpl implements RbacFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RbacFactory init()
  {
    try
    {
      RbacFactory theRbacFactory = (RbacFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ac.uk.open/rbac/RBAC"); 
      if (theRbacFactory != null)
      {
        return theRbacFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RbacFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RbacFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RbacPackage.MODEL: return createModel();
      case RbacPackage.ROLE: return createRole();
      case RbacPackage.USER: return createUser();
      case RbacPackage.PERMISSION: return createPermission();
      case RbacPackage.OBJECT: return createObject();
      case RbacPackage.SESSION: return createSession();
      case RbacPackage.USER_ROLE_ASSIGNMENT: return createUserRoleAssignment();
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT: return createRolePermissionAssignment();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User createUser()
  {
    UserImpl user = new UserImpl();
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Permission createPermission()
  {
    PermissionImpl permission = new PermissionImpl();
    return permission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uk.ac.open.rbac.rbac.Object createObject()
  {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Session createSession()
  {
    SessionImpl session = new SessionImpl();
    return session;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserRoleAssignment createUserRoleAssignment()
  {
    UserRoleAssignmentImpl userRoleAssignment = new UserRoleAssignmentImpl();
    return userRoleAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RolePermissionAssignment createRolePermissionAssignment()
  {
    RolePermissionAssignmentImpl rolePermissionAssignment = new RolePermissionAssignmentImpl();
    return rolePermissionAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RbacPackage getRbacPackage()
  {
    return (RbacPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RbacPackage getPackage()
  {
    return RbacPackage.eINSTANCE;
  }

} //RbacFactoryImpl
