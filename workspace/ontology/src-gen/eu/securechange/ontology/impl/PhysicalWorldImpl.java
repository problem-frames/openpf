/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.impl;

import eu.securechange.ontology.Entity;
import eu.securechange.ontology.OntologyPackage;
import eu.securechange.ontology.PhysicalWorld;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical World</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.securechange.ontology.impl.PhysicalWorldImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalWorldImpl extends MinimalEObjectImpl.Container implements PhysicalWorld
{
  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<Entity> entities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PhysicalWorldImpl()
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
    return OntologyPackage.Literals.PHYSICAL_WORLD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<Entity>(Entity.class, this, OntologyPackage.PHYSICAL_WORLD__ENTITIES);
    }
    return entities;
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
      case OntologyPackage.PHYSICAL_WORLD__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
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
      case OntologyPackage.PHYSICAL_WORLD__ENTITIES:
        return getEntities();
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
      case OntologyPackage.PHYSICAL_WORLD__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entity>)newValue);
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
      case OntologyPackage.PHYSICAL_WORLD__ENTITIES:
        getEntities().clear();
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
      case OntologyPackage.PHYSICAL_WORLD__ENTITIES:
        return entities != null && !entities.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PhysicalWorldImpl
