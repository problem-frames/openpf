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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.open.argument.argument.Argument;
import uk.ac.open.argument.argument.ArgumentPackage;
import uk.ac.open.argument.argument.Claim;
import uk.ac.open.argument.argument.Fact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getGrounds <em>Grounds</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getWarrants <em>Warrants</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends NodeImpl implements Argument
{
  /**
   * The cached value of the '{@link #getClaim() <em>Claim</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClaim()
   * @generated
   * @ordered
   */
  protected Claim claim;

  /**
   * The cached value of the '{@link #getGrounds() <em>Grounds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGrounds()
   * @generated
   * @ordered
   */
  protected EList<Fact> grounds;

  /**
   * The cached value of the '{@link #getWarrants() <em>Warrants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWarrants()
   * @generated
   * @ordered
   */
  protected EList<Argument> warrants;

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
  public Claim getClaim()
  {
    return claim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClaim(Claim newClaim, NotificationChain msgs)
  {
    Claim oldClaim = claim;
    claim = newClaim;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__CLAIM, oldClaim, newClaim);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClaim(Claim newClaim)
  {
    if (newClaim != claim)
    {
      NotificationChain msgs = null;
      if (claim != null)
        msgs = ((InternalEObject)claim).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArgumentPackage.ARGUMENT__CLAIM, null, msgs);
      if (newClaim != null)
        msgs = ((InternalEObject)newClaim).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArgumentPackage.ARGUMENT__CLAIM, null, msgs);
      msgs = basicSetClaim(newClaim, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__CLAIM, newClaim, newClaim));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Fact> getGrounds()
  {
    if (grounds == null)
    {
      grounds = new EObjectContainmentEList<Fact>(Fact.class, this, ArgumentPackage.ARGUMENT__GROUNDS);
    }
    return grounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Argument> getWarrants()
  {
    if (warrants == null)
    {
      warrants = new EObjectContainmentEList<Argument>(Argument.class, this, ArgumentPackage.ARGUMENT__WARRANTS);
    }
    return warrants;
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
      case ArgumentPackage.ARGUMENT__CLAIM:
        return basicSetClaim(null, msgs);
      case ArgumentPackage.ARGUMENT__GROUNDS:
        return ((InternalEList<?>)getGrounds()).basicRemove(otherEnd, msgs);
      case ArgumentPackage.ARGUMENT__WARRANTS:
        return ((InternalEList<?>)getWarrants()).basicRemove(otherEnd, msgs);
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
      case ArgumentPackage.ARGUMENT__CLAIM:
        return getClaim();
      case ArgumentPackage.ARGUMENT__GROUNDS:
        return getGrounds();
      case ArgumentPackage.ARGUMENT__WARRANTS:
        return getWarrants();
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
      case ArgumentPackage.ARGUMENT__CLAIM:
        setClaim((Claim)newValue);
        return;
      case ArgumentPackage.ARGUMENT__GROUNDS:
        getGrounds().clear();
        getGrounds().addAll((Collection<? extends Fact>)newValue);
        return;
      case ArgumentPackage.ARGUMENT__WARRANTS:
        getWarrants().clear();
        getWarrants().addAll((Collection<? extends Argument>)newValue);
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
      case ArgumentPackage.ARGUMENT__CLAIM:
        setClaim((Claim)null);
        return;
      case ArgumentPackage.ARGUMENT__GROUNDS:
        getGrounds().clear();
        return;
      case ArgumentPackage.ARGUMENT__WARRANTS:
        getWarrants().clear();
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
      case ArgumentPackage.ARGUMENT__CLAIM:
        return claim != null;
      case ArgumentPackage.ARGUMENT__GROUNDS:
        return grounds != null && !grounds.isEmpty();
      case ArgumentPackage.ARGUMENT__WARRANTS:
        return warrants != null && !warrants.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArgumentImpl
