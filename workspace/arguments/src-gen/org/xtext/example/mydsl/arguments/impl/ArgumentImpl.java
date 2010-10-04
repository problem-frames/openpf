/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.arguments.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.arguments.Argument;
import org.xtext.example.mydsl.arguments.ArgumentsPackage;
import org.xtext.example.mydsl.arguments.gStatement;
import org.xtext.example.mydsl.arguments.wStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.arguments.impl.ArgumentImpl#getCname <em>Cname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.impl.ArgumentImpl#getClaimstr <em>Claimstr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.impl.ArgumentImpl#getGname <em>Gname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.impl.ArgumentImpl#getGroundstatements <em>Groundstatements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.impl.ArgumentImpl#getWname <em>Wname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.impl.ArgumentImpl#getWarrantstatements <em>Warrantstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends MinimalEObjectImpl.Container implements Argument
{
  /**
   * The default value of the '{@link #getCname() <em>Cname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCname()
   * @generated
   * @ordered
   */
  protected static final String CNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCname() <em>Cname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCname()
   * @generated
   * @ordered
   */
  protected String cname = CNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getClaimstr() <em>Claimstr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClaimstr()
   * @generated
   * @ordered
   */
  protected static final String CLAIMSTR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClaimstr() <em>Claimstr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClaimstr()
   * @generated
   * @ordered
   */
  protected String claimstr = CLAIMSTR_EDEFAULT;

  /**
   * The default value of the '{@link #getGname() <em>Gname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGname()
   * @generated
   * @ordered
   */
  protected static final String GNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGname() <em>Gname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGname()
   * @generated
   * @ordered
   */
  protected String gname = GNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getGroundstatements() <em>Groundstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroundstatements()
   * @generated
   * @ordered
   */
  protected EList<gStatement> groundstatements;

  /**
   * The default value of the '{@link #getWname() <em>Wname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWname()
   * @generated
   * @ordered
   */
  protected static final String WNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWname() <em>Wname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWname()
   * @generated
   * @ordered
   */
  protected String wname = WNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getWarrantstatements() <em>Warrantstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWarrantstatements()
   * @generated
   * @ordered
   */
  protected EList<wStatement> warrantstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArgumentImpl()
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
    return ArgumentsPackage.Literals.ARGUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCname()
  {
    return cname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCname(String newCname)
  {
    String oldCname = cname;
    cname = newCname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.ARGUMENT__CNAME, oldCname, cname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClaimstr()
  {
    return claimstr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClaimstr(String newClaimstr)
  {
    String oldClaimstr = claimstr;
    claimstr = newClaimstr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.ARGUMENT__CLAIMSTR, oldClaimstr, claimstr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGname()
  {
    return gname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGname(String newGname)
  {
    String oldGname = gname;
    gname = newGname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.ARGUMENT__GNAME, oldGname, gname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<gStatement> getGroundstatements()
  {
    if (groundstatements == null)
    {
      groundstatements = new EObjectContainmentEList<gStatement>(gStatement.class, this, ArgumentsPackage.ARGUMENT__GROUNDSTATEMENTS);
    }
    return groundstatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWname()
  {
    return wname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWname(String newWname)
  {
    String oldWname = wname;
    wname = newWname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.ARGUMENT__WNAME, oldWname, wname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<wStatement> getWarrantstatements()
  {
    if (warrantstatements == null)
    {
      warrantstatements = new EObjectContainmentEList<wStatement>(wStatement.class, this, ArgumentsPackage.ARGUMENT__WARRANTSTATEMENTS);
    }
    return warrantstatements;
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
      case ArgumentsPackage.ARGUMENT__GROUNDSTATEMENTS:
        return ((InternalEList<?>)getGroundstatements()).basicRemove(otherEnd, msgs);
      case ArgumentsPackage.ARGUMENT__WARRANTSTATEMENTS:
        return ((InternalEList<?>)getWarrantstatements()).basicRemove(otherEnd, msgs);
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
      case ArgumentsPackage.ARGUMENT__CNAME:
        return getCname();
      case ArgumentsPackage.ARGUMENT__CLAIMSTR:
        return getClaimstr();
      case ArgumentsPackage.ARGUMENT__GNAME:
        return getGname();
      case ArgumentsPackage.ARGUMENT__GROUNDSTATEMENTS:
        return getGroundstatements();
      case ArgumentsPackage.ARGUMENT__WNAME:
        return getWname();
      case ArgumentsPackage.ARGUMENT__WARRANTSTATEMENTS:
        return getWarrantstatements();
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
      case ArgumentsPackage.ARGUMENT__CNAME:
        setCname((String)newValue);
        return;
      case ArgumentsPackage.ARGUMENT__CLAIMSTR:
        setClaimstr((String)newValue);
        return;
      case ArgumentsPackage.ARGUMENT__GNAME:
        setGname((String)newValue);
        return;
      case ArgumentsPackage.ARGUMENT__GROUNDSTATEMENTS:
        getGroundstatements().clear();
        getGroundstatements().addAll((Collection<? extends gStatement>)newValue);
        return;
      case ArgumentsPackage.ARGUMENT__WNAME:
        setWname((String)newValue);
        return;
      case ArgumentsPackage.ARGUMENT__WARRANTSTATEMENTS:
        getWarrantstatements().clear();
        getWarrantstatements().addAll((Collection<? extends wStatement>)newValue);
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
      case ArgumentsPackage.ARGUMENT__CNAME:
        setCname(CNAME_EDEFAULT);
        return;
      case ArgumentsPackage.ARGUMENT__CLAIMSTR:
        setClaimstr(CLAIMSTR_EDEFAULT);
        return;
      case ArgumentsPackage.ARGUMENT__GNAME:
        setGname(GNAME_EDEFAULT);
        return;
      case ArgumentsPackage.ARGUMENT__GROUNDSTATEMENTS:
        getGroundstatements().clear();
        return;
      case ArgumentsPackage.ARGUMENT__WNAME:
        setWname(WNAME_EDEFAULT);
        return;
      case ArgumentsPackage.ARGUMENT__WARRANTSTATEMENTS:
        getWarrantstatements().clear();
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
      case ArgumentsPackage.ARGUMENT__CNAME:
        return CNAME_EDEFAULT == null ? cname != null : !CNAME_EDEFAULT.equals(cname);
      case ArgumentsPackage.ARGUMENT__CLAIMSTR:
        return CLAIMSTR_EDEFAULT == null ? claimstr != null : !CLAIMSTR_EDEFAULT.equals(claimstr);
      case ArgumentsPackage.ARGUMENT__GNAME:
        return GNAME_EDEFAULT == null ? gname != null : !GNAME_EDEFAULT.equals(gname);
      case ArgumentsPackage.ARGUMENT__GROUNDSTATEMENTS:
        return groundstatements != null && !groundstatements.isEmpty();
      case ArgumentsPackage.ARGUMENT__WNAME:
        return WNAME_EDEFAULT == null ? wname != null : !WNAME_EDEFAULT.equals(wname);
      case ArgumentsPackage.ARGUMENT__WARRANTSTATEMENTS:
        return warrantstatements != null && !warrantstatements.isEmpty();
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
    result.append(" (cname: ");
    result.append(cname);
    result.append(", claimstr: ");
    result.append(claimstr);
    result.append(", gname: ");
    result.append(gname);
    result.append(", wname: ");
    result.append(wname);
    result.append(')');
    return result.toString();
  }

} //ArgumentImpl
