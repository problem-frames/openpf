/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.rbac.rbac.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.open.rbac.rbac.Permission;
import uk.ac.open.rbac.rbac.RbacPackage;
import uk.ac.open.rbac.rbac.Role;
import uk.ac.open.rbac.rbac.RolePermissionAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Permission Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.rbac.rbac.impl.RolePermissionAssignmentImpl#getRole <em>Role</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.impl.RolePermissionAssignmentImpl#getPermission <em>Permission</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RolePermissionAssignmentImpl extends MinimalEObjectImpl.Container implements RolePermissionAssignment
{
  /**
   * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected Role role;

  /**
   * The cached value of the '{@link #getPermission() <em>Permission</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermission()
   * @generated
   * @ordered
   */
  protected Permission permission;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RolePermissionAssignmentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RbacPackage.Literals.ROLE_PERMISSION_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getRole()
  {
    if (role != null && role.eIsProxy())
    {
      InternalEObject oldRole = (InternalEObject)role;
      role = (Role)eResolveProxy(oldRole);
      if (role != oldRole)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RbacPackage.ROLE_PERMISSION_ASSIGNMENT__ROLE, oldRole, role));
      }
    }
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetRole()
  {
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRole(Role newRole)
  {
    Role oldRole = role;
    role = newRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RbacPackage.ROLE_PERMISSION_ASSIGNMENT__ROLE, oldRole, role));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Permission getPermission()
  {
    if (permission != null && permission.eIsProxy())
    {
      InternalEObject oldPermission = (InternalEObject)permission;
      permission = (Permission)eResolveProxy(oldPermission);
      if (permission != oldPermission)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RbacPackage.ROLE_PERMISSION_ASSIGNMENT__PERMISSION, oldPermission, permission));
      }
    }
    return permission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Permission basicGetPermission()
  {
    return permission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPermission(Permission newPermission)
  {
    Permission oldPermission = permission;
    permission = newPermission;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RbacPackage.ROLE_PERMISSION_ASSIGNMENT__PERMISSION, oldPermission, permission));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__ROLE:
        if (resolve) return getRole();
        return basicGetRole();
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__PERMISSION:
        if (resolve) return getPermission();
        return basicGetPermission();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__ROLE:
        setRole((Role)newValue);
        return;
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__PERMISSION:
        setPermission((Permission)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__ROLE:
        setRole((Role)null);
        return;
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__PERMISSION:
        setPermission((Permission)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__ROLE:
        return role != null;
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__PERMISSION:
        return permission != null;
    }
    return super.eIsSet(featureID);
  }

} //RolePermissionAssignmentImpl
