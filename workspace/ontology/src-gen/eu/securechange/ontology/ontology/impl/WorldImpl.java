/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology.impl;

import eu.securechange.ontology.ontology.BeliefWorld;
import eu.securechange.ontology.ontology.OntologyPackage;
import eu.securechange.ontology.ontology.PhysicalWorld;
import eu.securechange.ontology.ontology.World;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.securechange.ontology.ontology.impl.WorldImpl#getPhysical <em>Physical</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.impl.WorldImpl#getBelief <em>Belief</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorldImpl extends MinimalEObjectImpl.Container implements World
{
  /**
   * The cached value of the '{@link #getPhysical() <em>Physical</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhysical()
   * @generated
   * @ordered
   */
  protected PhysicalWorld physical;

  /**
   * The cached value of the '{@link #getBelief() <em>Belief</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBelief()
   * @generated
   * @ordered
   */
  protected BeliefWorld belief;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorldImpl()
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
    return OntologyPackage.Literals.WORLD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhysicalWorld getPhysical()
  {
    return physical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPhysical(PhysicalWorld newPhysical, NotificationChain msgs)
  {
    PhysicalWorld oldPhysical = physical;
    physical = newPhysical;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntologyPackage.WORLD__PHYSICAL, oldPhysical, newPhysical);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPhysical(PhysicalWorld newPhysical)
  {
    if (newPhysical != physical)
    {
      NotificationChain msgs = null;
      if (physical != null)
        msgs = ((InternalEObject)physical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntologyPackage.WORLD__PHYSICAL, null, msgs);
      if (newPhysical != null)
        msgs = ((InternalEObject)newPhysical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntologyPackage.WORLD__PHYSICAL, null, msgs);
      msgs = basicSetPhysical(newPhysical, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.WORLD__PHYSICAL, newPhysical, newPhysical));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeliefWorld getBelief()
  {
    return belief;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBelief(BeliefWorld newBelief, NotificationChain msgs)
  {
    BeliefWorld oldBelief = belief;
    belief = newBelief;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntologyPackage.WORLD__BELIEF, oldBelief, newBelief);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBelief(BeliefWorld newBelief)
  {
    if (newBelief != belief)
    {
      NotificationChain msgs = null;
      if (belief != null)
        msgs = ((InternalEObject)belief).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntologyPackage.WORLD__BELIEF, null, msgs);
      if (newBelief != null)
        msgs = ((InternalEObject)newBelief).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntologyPackage.WORLD__BELIEF, null, msgs);
      msgs = basicSetBelief(newBelief, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.WORLD__BELIEF, newBelief, newBelief));
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
      case OntologyPackage.WORLD__PHYSICAL:
        return basicSetPhysical(null, msgs);
      case OntologyPackage.WORLD__BELIEF:
        return basicSetBelief(null, msgs);
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
      case OntologyPackage.WORLD__PHYSICAL:
        return getPhysical();
      case OntologyPackage.WORLD__BELIEF:
        return getBelief();
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
      case OntologyPackage.WORLD__PHYSICAL:
        setPhysical((PhysicalWorld)newValue);
        return;
      case OntologyPackage.WORLD__BELIEF:
        setBelief((BeliefWorld)newValue);
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
      case OntologyPackage.WORLD__PHYSICAL:
        setPhysical((PhysicalWorld)null);
        return;
      case OntologyPackage.WORLD__BELIEF:
        setBelief((BeliefWorld)null);
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
      case OntologyPackage.WORLD__PHYSICAL:
        return physical != null;
      case OntologyPackage.WORLD__BELIEF:
        return belief != null;
    }
    return super.eIsSet(featureID);
  }

} //WorldImpl
