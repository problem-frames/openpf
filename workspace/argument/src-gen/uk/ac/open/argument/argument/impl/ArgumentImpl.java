/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.open.argument.argument.Argument;
import uk.ac.open.argument.argument.ArgumentPackage;
import uk.ac.open.argument.argument.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getGrounds <em>Grounds</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getWarrants <em>Warrants</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getStr <em>Str</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getRebutts <em>Rebutts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends MinimalEObjectImpl.Container implements Argument
{
  /**
   * The cached value of the '{@link #getGrounds() <em>Grounds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGrounds()
   * @generated
   * @ordered
   */
  protected EList<Statement> grounds;

  /**
   * The cached value of the '{@link #getWarrants() <em>Warrants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWarrants()
   * @generated
   * @ordered
   */
  protected EList<EObject> warrants;

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
   * The default value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected static final String STR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected String str = STR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRebutts() <em>Rebutts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRebutts()
   * @generated
   * @ordered
   */
  protected EList<Statement> rebutts;

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
    return ArgumentPackage.Literals.ARGUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getGrounds()
  {
    if (grounds == null)
    {
      grounds = new EObjectContainmentEList<Statement>(Statement.class, this, ArgumentPackage.ARGUMENT__GROUNDS);
    }
    return grounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getWarrants()
  {
    if (warrants == null)
    {
      warrants = new EObjectContainmentEList<EObject>(EObject.class, this, ArgumentPackage.ARGUMENT__WARRANTS);
    }
    return warrants;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStr()
  {
    return str;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStr(String newStr)
  {
    String oldStr = str;
    str = newStr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__STR, oldStr, str));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getRebutts()
  {
    if (rebutts == null)
    {
      rebutts = new EObjectContainmentEList<Statement>(Statement.class, this, ArgumentPackage.ARGUMENT__REBUTTS);
    }
    return rebutts;
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
      case ArgumentPackage.ARGUMENT__GROUNDS:
        return ((InternalEList<?>)getGrounds()).basicRemove(otherEnd, msgs);
      case ArgumentPackage.ARGUMENT__WARRANTS:
        return ((InternalEList<?>)getWarrants()).basicRemove(otherEnd, msgs);
      case ArgumentPackage.ARGUMENT__REBUTTS:
        return ((InternalEList<?>)getRebutts()).basicRemove(otherEnd, msgs);
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
      case ArgumentPackage.ARGUMENT__GROUNDS:
        return getGrounds();
      case ArgumentPackage.ARGUMENT__WARRANTS:
        return getWarrants();
      case ArgumentPackage.ARGUMENT__NAME:
        return getName();
      case ArgumentPackage.ARGUMENT__STR:
        return getStr();
      case ArgumentPackage.ARGUMENT__REBUTTS:
        return getRebutts();
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
      case ArgumentPackage.ARGUMENT__GROUNDS:
        getGrounds().clear();
        getGrounds().addAll((Collection<? extends Statement>)newValue);
        return;
      case ArgumentPackage.ARGUMENT__WARRANTS:
        getWarrants().clear();
        getWarrants().addAll((Collection<? extends EObject>)newValue);
        return;
      case ArgumentPackage.ARGUMENT__NAME:
        setName((String)newValue);
        return;
      case ArgumentPackage.ARGUMENT__STR:
        setStr((String)newValue);
        return;
      case ArgumentPackage.ARGUMENT__REBUTTS:
        getRebutts().clear();
        getRebutts().addAll((Collection<? extends Statement>)newValue);
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
      case ArgumentPackage.ARGUMENT__GROUNDS:
        getGrounds().clear();
        return;
      case ArgumentPackage.ARGUMENT__WARRANTS:
        getWarrants().clear();
        return;
      case ArgumentPackage.ARGUMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ArgumentPackage.ARGUMENT__STR:
        setStr(STR_EDEFAULT);
        return;
      case ArgumentPackage.ARGUMENT__REBUTTS:
        getRebutts().clear();
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
      case ArgumentPackage.ARGUMENT__GROUNDS:
        return grounds != null && !grounds.isEmpty();
      case ArgumentPackage.ARGUMENT__WARRANTS:
        return warrants != null && !warrants.isEmpty();
      case ArgumentPackage.ARGUMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ArgumentPackage.ARGUMENT__STR:
        return STR_EDEFAULT == null ? str != null : !STR_EDEFAULT.equals(str);
      case ArgumentPackage.ARGUMENT__REBUTTS:
        return rebutts != null && !rebutts.isEmpty();
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
    result.append(", str: ");
    result.append(str);
    result.append(')');
    return result.toString();
  }

} //ArgumentImpl
