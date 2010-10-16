/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.dependency.dependency.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.open.dependency.dependency.Dependency;
import uk.ac.open.dependency.dependency.DependencyPackage;
import uk.ac.open.dependency.dependency.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.dependency.dependency.impl.DependencyImpl#getFrom <em>From</em>}</li>
 *   <li>{@link uk.ac.open.dependency.dependency.impl.DependencyImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends MinimalEObjectImpl.Container implements Dependency
{
  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected Node from;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected Node to;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependencyImpl()
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
    return DependencyPackage.Literals.DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getFrom()
  {
    if (from != null && from.eIsProxy())
    {
      InternalEObject oldFrom = (InternalEObject)from;
      from = (Node)eResolveProxy(oldFrom);
      if (from != oldFrom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependencyPackage.DEPENDENCY__FROM, oldFrom, from));
      }
    }
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(Node newFrom)
  {
    Node oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.DEPENDENCY__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getTo()
  {
    if (to != null && to.eIsProxy())
    {
      InternalEObject oldTo = (InternalEObject)to;
      to = (Node)eResolveProxy(oldTo);
      if (to != oldTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependencyPackage.DEPENDENCY__TO, oldTo, to));
      }
    }
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(Node newTo)
  {
    Node oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.DEPENDENCY__TO, oldTo, to));
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
      case DependencyPackage.DEPENDENCY__FROM:
        if (resolve) return getFrom();
        return basicGetFrom();
      case DependencyPackage.DEPENDENCY__TO:
        if (resolve) return getTo();
        return basicGetTo();
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
      case DependencyPackage.DEPENDENCY__FROM:
        setFrom((Node)newValue);
        return;
      case DependencyPackage.DEPENDENCY__TO:
        setTo((Node)newValue);
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
      case DependencyPackage.DEPENDENCY__FROM:
        setFrom((Node)null);
        return;
      case DependencyPackage.DEPENDENCY__TO:
        setTo((Node)null);
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
      case DependencyPackage.DEPENDENCY__FROM:
        return from != null;
      case DependencyPackage.DEPENDENCY__TO:
        return to != null;
    }
    return super.eIsSet(featureID);
  }

} //DependencyImpl
