/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.rbac.rbac.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.open.rbac.rbac.Model;
import uk.ac.open.rbac.rbac.RbacPackage;
import uk.ac.open.rbac.rbac.Role;
import uk.ac.open.rbac.rbac.RolePermissionAssignment;
import uk.ac.open.rbac.rbac.Session;
import uk.ac.open.rbac.rbac.User;
import uk.ac.open.rbac.rbac.UserRoleAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.rbac.rbac.impl.ModelImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.impl.ModelImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.impl.ModelImpl#getSessions <em>Sessions</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.impl.ModelImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.impl.ModelImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.impl.ModelImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<Role> roles;

  /**
   * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsers()
   * @generated
   * @ordered
   */
  protected EList<User> users;

  /**
   * The cached value of the '{@link #getSessions() <em>Sessions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSessions()
   * @generated
   * @ordered
   */
  protected EList<Session> sessions;

  /**
   * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjects()
   * @generated
   * @ordered
   */
  protected EList<uk.ac.open.rbac.rbac.Object> objects;

  /**
   * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermissions()
   * @generated
   * @ordered
   */
  protected EList<RolePermissionAssignment> permissions;

  /**
   * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignments()
   * @generated
   * @ordered
   */
  protected EList<UserRoleAssignment> assignments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return RbacPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Role> getRoles()
  {
    if (roles == null)
    {
      roles = new EObjectContainmentEList<Role>(Role.class, this, RbacPackage.MODEL__ROLES);
    }
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<User> getUsers()
  {
    if (users == null)
    {
      users = new EObjectContainmentEList<User>(User.class, this, RbacPackage.MODEL__USERS);
    }
    return users;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Session> getSessions()
  {
    if (sessions == null)
    {
      sessions = new EObjectContainmentEList<Session>(Session.class, this, RbacPackage.MODEL__SESSIONS);
    }
    return sessions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<uk.ac.open.rbac.rbac.Object> getObjects()
  {
    if (objects == null)
    {
      objects = new EObjectContainmentEList<uk.ac.open.rbac.rbac.Object>(uk.ac.open.rbac.rbac.Object.class, this, RbacPackage.MODEL__OBJECTS);
    }
    return objects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RolePermissionAssignment> getPermissions()
  {
    if (permissions == null)
    {
      permissions = new EObjectContainmentEList<RolePermissionAssignment>(RolePermissionAssignment.class, this, RbacPackage.MODEL__PERMISSIONS);
    }
    return permissions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UserRoleAssignment> getAssignments()
  {
    if (assignments == null)
    {
      assignments = new EObjectContainmentEList<UserRoleAssignment>(UserRoleAssignment.class, this, RbacPackage.MODEL__ASSIGNMENTS);
    }
    return assignments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RbacPackage.MODEL__ROLES:
        return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
      case RbacPackage.MODEL__USERS:
        return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
      case RbacPackage.MODEL__SESSIONS:
        return ((InternalEList<?>)getSessions()).basicRemove(otherEnd, msgs);
      case RbacPackage.MODEL__OBJECTS:
        return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
      case RbacPackage.MODEL__PERMISSIONS:
        return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
      case RbacPackage.MODEL__ASSIGNMENTS:
        return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RbacPackage.MODEL__ROLES:
        return getRoles();
      case RbacPackage.MODEL__USERS:
        return getUsers();
      case RbacPackage.MODEL__SESSIONS:
        return getSessions();
      case RbacPackage.MODEL__OBJECTS:
        return getObjects();
      case RbacPackage.MODEL__PERMISSIONS:
        return getPermissions();
      case RbacPackage.MODEL__ASSIGNMENTS:
        return getAssignments();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RbacPackage.MODEL__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends Role>)newValue);
        return;
      case RbacPackage.MODEL__USERS:
        getUsers().clear();
        getUsers().addAll((Collection<? extends User>)newValue);
        return;
      case RbacPackage.MODEL__SESSIONS:
        getSessions().clear();
        getSessions().addAll((Collection<? extends Session>)newValue);
        return;
      case RbacPackage.MODEL__OBJECTS:
        getObjects().clear();
        getObjects().addAll((Collection<? extends uk.ac.open.rbac.rbac.Object>)newValue);
        return;
      case RbacPackage.MODEL__PERMISSIONS:
        getPermissions().clear();
        getPermissions().addAll((Collection<? extends RolePermissionAssignment>)newValue);
        return;
      case RbacPackage.MODEL__ASSIGNMENTS:
        getAssignments().clear();
        getAssignments().addAll((Collection<? extends UserRoleAssignment>)newValue);
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
      case RbacPackage.MODEL__ROLES:
        getRoles().clear();
        return;
      case RbacPackage.MODEL__USERS:
        getUsers().clear();
        return;
      case RbacPackage.MODEL__SESSIONS:
        getSessions().clear();
        return;
      case RbacPackage.MODEL__OBJECTS:
        getObjects().clear();
        return;
      case RbacPackage.MODEL__PERMISSIONS:
        getPermissions().clear();
        return;
      case RbacPackage.MODEL__ASSIGNMENTS:
        getAssignments().clear();
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
      case RbacPackage.MODEL__ROLES:
        return roles != null && !roles.isEmpty();
      case RbacPackage.MODEL__USERS:
        return users != null && !users.isEmpty();
      case RbacPackage.MODEL__SESSIONS:
        return sessions != null && !sessions.isEmpty();
      case RbacPackage.MODEL__OBJECTS:
        return objects != null && !objects.isEmpty();
      case RbacPackage.MODEL__PERMISSIONS:
        return permissions != null && !permissions.isEmpty();
      case RbacPackage.MODEL__ASSIGNMENTS:
        return assignments != null && !assignments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
