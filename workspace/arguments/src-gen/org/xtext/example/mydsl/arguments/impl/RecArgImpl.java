/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.arguments.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.arguments.ArgumentsPackage;
import org.xtext.example.mydsl.arguments.RecArg;
import org.xtext.example.mydsl.arguments.gStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rec Arg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.arguments.impl.RecArgImpl#getGroundstatements <em>Groundstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecArgImpl extends MinimalEObjectImpl.Container implements RecArg
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecArgImpl()
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
    return ArgumentsPackage.Literals.REC_ARG;
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
      groundstatements = new EObjectContainmentEList<gStatement>(gStatement.class, this, ArgumentsPackage.REC_ARG__GROUNDSTATEMENTS);
    }
    return groundstatements;
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
      case ArgumentsPackage.REC_ARG__GROUNDSTATEMENTS:
        return ((InternalEList<?>)getGroundstatements()).basicRemove(otherEnd, msgs);
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
      case ArgumentsPackage.REC_ARG__GROUNDSTATEMENTS:
        return getGroundstatements();
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
      case ArgumentsPackage.REC_ARG__GROUNDSTATEMENTS:
        getGroundstatements().clear();
        getGroundstatements().addAll((Collection<? extends gStatement>)newValue);
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
      case ArgumentsPackage.REC_ARG__GROUNDSTATEMENTS:
        getGroundstatements().clear();
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
      case ArgumentsPackage.REC_ARG__GROUNDSTATEMENTS:
        return groundstatements != null && !groundstatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RecArgImpl
