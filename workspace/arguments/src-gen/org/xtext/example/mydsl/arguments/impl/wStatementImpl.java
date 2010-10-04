/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.arguments.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.arguments.ArgumentsPackage;
import org.xtext.example.mydsl.arguments.wStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>wStatement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.arguments.impl.wStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.impl.wStatementImpl#getGroundstr <em>Groundstr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class wStatementImpl extends MinimalEObjectImpl.Container implements wStatement
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
   * The default value of the '{@link #getGroundstr() <em>Groundstr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroundstr()
   * @generated
   * @ordered
   */
  protected static final String GROUNDSTR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroundstr() <em>Groundstr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroundstr()
   * @generated
   * @ordered
   */
  protected String groundstr = GROUNDSTR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected wStatementImpl()
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
    return ArgumentsPackage.Literals.WSTATEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.WSTATEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroundstr()
  {
    return groundstr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroundstr(String newGroundstr)
  {
    String oldGroundstr = groundstr;
    groundstr = newGroundstr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.WSTATEMENT__GROUNDSTR, oldGroundstr, groundstr));
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
      case ArgumentsPackage.WSTATEMENT__NAME:
        return getName();
      case ArgumentsPackage.WSTATEMENT__GROUNDSTR:
        return getGroundstr();
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
      case ArgumentsPackage.WSTATEMENT__NAME:
        setName((String)newValue);
        return;
      case ArgumentsPackage.WSTATEMENT__GROUNDSTR:
        setGroundstr((String)newValue);
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
      case ArgumentsPackage.WSTATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ArgumentsPackage.WSTATEMENT__GROUNDSTR:
        setGroundstr(GROUNDSTR_EDEFAULT);
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
      case ArgumentsPackage.WSTATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ArgumentsPackage.WSTATEMENT__GROUNDSTR:
        return GROUNDSTR_EDEFAULT == null ? groundstr != null : !GROUNDSTR_EDEFAULT.equals(groundstr);
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
    result.append(", groundstr: ");
    result.append(groundstr);
    result.append(')');
    return result.toString();
  }

} //wStatementImpl
