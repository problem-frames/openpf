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
import org.xtext.example.mydsl.arguments.Rebuttal;
import org.xtext.example.mydsl.arguments.rStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rebuttal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.arguments.impl.RebuttalImpl#getAname <em>Aname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.impl.RebuttalImpl#getRname <em>Rname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.arguments.impl.RebuttalImpl#getRebuttalstatements <em>Rebuttalstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RebuttalImpl extends MinimalEObjectImpl.Container implements Rebuttal
{
  /**
   * The cached value of the '{@link #getAname() <em>Aname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAname()
   * @generated
   * @ordered
   */
  protected Argument aname;

  /**
   * The default value of the '{@link #getRname() <em>Rname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRname()
   * @generated
   * @ordered
   */
  protected static final String RNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRname() <em>Rname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRname()
   * @generated
   * @ordered
   */
  protected String rname = RNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRebuttalstatements() <em>Rebuttalstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRebuttalstatements()
   * @generated
   * @ordered
   */
  protected EList<rStatement> rebuttalstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RebuttalImpl()
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
    return ArgumentsPackage.Literals.REBUTTAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument getAname()
  {
    return aname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAname(Argument newAname, NotificationChain msgs)
  {
    Argument oldAname = aname;
    aname = newAname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArgumentsPackage.REBUTTAL__ANAME, oldAname, newAname);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAname(Argument newAname)
  {
    if (newAname != aname)
    {
      NotificationChain msgs = null;
      if (aname != null)
        msgs = ((InternalEObject)aname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArgumentsPackage.REBUTTAL__ANAME, null, msgs);
      if (newAname != null)
        msgs = ((InternalEObject)newAname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArgumentsPackage.REBUTTAL__ANAME, null, msgs);
      msgs = basicSetAname(newAname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.REBUTTAL__ANAME, newAname, newAname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRname()
  {
    return rname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRname(String newRname)
  {
    String oldRname = rname;
    rname = newRname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentsPackage.REBUTTAL__RNAME, oldRname, rname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<rStatement> getRebuttalstatements()
  {
    if (rebuttalstatements == null)
    {
      rebuttalstatements = new EObjectContainmentEList<rStatement>(rStatement.class, this, ArgumentsPackage.REBUTTAL__REBUTTALSTATEMENTS);
    }
    return rebuttalstatements;
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
      case ArgumentsPackage.REBUTTAL__ANAME:
        return basicSetAname(null, msgs);
      case ArgumentsPackage.REBUTTAL__REBUTTALSTATEMENTS:
        return ((InternalEList<?>)getRebuttalstatements()).basicRemove(otherEnd, msgs);
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
      case ArgumentsPackage.REBUTTAL__ANAME:
        return getAname();
      case ArgumentsPackage.REBUTTAL__RNAME:
        return getRname();
      case ArgumentsPackage.REBUTTAL__REBUTTALSTATEMENTS:
        return getRebuttalstatements();
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
      case ArgumentsPackage.REBUTTAL__ANAME:
        setAname((Argument)newValue);
        return;
      case ArgumentsPackage.REBUTTAL__RNAME:
        setRname((String)newValue);
        return;
      case ArgumentsPackage.REBUTTAL__REBUTTALSTATEMENTS:
        getRebuttalstatements().clear();
        getRebuttalstatements().addAll((Collection<? extends rStatement>)newValue);
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
      case ArgumentsPackage.REBUTTAL__ANAME:
        setAname((Argument)null);
        return;
      case ArgumentsPackage.REBUTTAL__RNAME:
        setRname(RNAME_EDEFAULT);
        return;
      case ArgumentsPackage.REBUTTAL__REBUTTALSTATEMENTS:
        getRebuttalstatements().clear();
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
      case ArgumentsPackage.REBUTTAL__ANAME:
        return aname != null;
      case ArgumentsPackage.REBUTTAL__RNAME:
        return RNAME_EDEFAULT == null ? rname != null : !RNAME_EDEFAULT.equals(rname);
      case ArgumentsPackage.REBUTTAL__REBUTTALSTATEMENTS:
        return rebuttalstatements != null && !rebuttalstatements.isEmpty();
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
    result.append(" (rname: ");
    result.append(rname);
    result.append(')');
    return result.toString();
  }

} //RebuttalImpl
