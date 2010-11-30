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

import uk.ac.open.rbac.rbac.RbacPackage;
import uk.ac.open.rbac.rbac.Role;
import uk.ac.open.rbac.rbac.User;
import uk.ac.open.rbac.rbac.UserRoleAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Role Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.rbac.rbac.impl.UserRoleAssignmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.impl.UserRoleAssignmentImpl#getUser <em>User</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.impl.UserRoleAssignmentImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserRoleAssignmentImpl extends MinimalEObjectImpl.Container implements UserRoleAssignment
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getUser() <em>User</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUser()
   * @generated
   * @ordered
   */
  protected User user;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UserRoleAssignmentImpl()
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
    return RbacPackage.Literals.USER_ROLE_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RbacPackage.USER_ROLE_ASSIGNMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User getUser()
  {
    if (user != null && user.eIsProxy())
    {
      InternalEObject oldUser = (InternalEObject)user;
      user = (User)eResolveProxy(oldUser);
      if (user != oldUser)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RbacPackage.USER_ROLE_ASSIGNMENT__USER, oldUser, user));
      }
    }
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User basicGetUser()
  {
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUser(User newUser)
  {
    User oldUser = user;
    user = newUser;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RbacPackage.USER_ROLE_ASSIGNMENT__USER, oldUser, user));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RbacPackage.USER_ROLE_ASSIGNMENT__ROLE, oldRole, role));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RbacPackage.USER_ROLE_ASSIGNMENT__ROLE, oldRole, role));
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
      case RbacPackage.USER_ROLE_ASSIGNMENT__NAME:
        return getName();
      case RbacPackage.USER_ROLE_ASSIGNMENT__USER:
        if (resolve) return getUser();
        return basicGetUser();
      case RbacPackage.USER_ROLE_ASSIGNMENT__ROLE:
        if (resolve) return getRole();
        return basicGetRole();
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
      case RbacPackage.USER_ROLE_ASSIGNMENT__NAME:
        setName((String)newValue);
        return;
      case RbacPackage.USER_ROLE_ASSIGNMENT__USER:
        setUser((User)newValue);
        return;
      case RbacPackage.USER_ROLE_ASSIGNMENT__ROLE:
        setRole((Role)newValue);
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
      case RbacPackage.USER_ROLE_ASSIGNMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RbacPackage.USER_ROLE_ASSIGNMENT__USER:
        setUser((User)null);
        return;
      case RbacPackage.USER_ROLE_ASSIGNMENT__ROLE:
        setRole((Role)null);
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
      case RbacPackage.USER_ROLE_ASSIGNMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RbacPackage.USER_ROLE_ASSIGNMENT__USER:
        return user != null;
      case RbacPackage.USER_ROLE_ASSIGNMENT__ROLE:
        return role != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //UserRoleAssignmentImpl
