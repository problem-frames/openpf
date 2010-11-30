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
import uk.ac.open.rbac.rbac.RolePermissionAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Permission Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.rbac.rbac.impl.RolePermissionAssignmentImpl#getRole <em>Role</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.impl.RolePermissionAssignmentImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.open.rbac.rbac.impl.RolePermissionAssignmentImpl#getObject <em>Object</em>}</li>
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected uk.ac.open.rbac.rbac.Object object;

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
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RbacPackage.ROLE_PERMISSION_ASSIGNMENT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uk.ac.open.rbac.rbac.Object getObject()
  {
    if (object != null && object.eIsProxy())
    {
      InternalEObject oldObject = (InternalEObject)object;
      object = (uk.ac.open.rbac.rbac.Object)eResolveProxy(oldObject);
      if (object != oldObject)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RbacPackage.ROLE_PERMISSION_ASSIGNMENT__OBJECT, oldObject, object));
      }
    }
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uk.ac.open.rbac.rbac.Object basicGetObject()
  {
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject(uk.ac.open.rbac.rbac.Object newObject)
  {
    uk.ac.open.rbac.rbac.Object oldObject = object;
    object = newObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RbacPackage.ROLE_PERMISSION_ASSIGNMENT__OBJECT, oldObject, object));
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
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__TYPE:
        return getType();
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__OBJECT:
        if (resolve) return getObject();
        return basicGetObject();
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
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__TYPE:
        setType((String)newValue);
        return;
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__OBJECT:
        setObject((uk.ac.open.rbac.rbac.Object)newValue);
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
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__OBJECT:
        setObject((uk.ac.open.rbac.rbac.Object)null);
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
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RbacPackage.ROLE_PERMISSION_ASSIGNMENT__OBJECT:
        return object != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //RolePermissionAssignmentImpl
