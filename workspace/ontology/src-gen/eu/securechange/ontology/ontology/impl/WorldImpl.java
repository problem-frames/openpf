/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology.impl;

import eu.securechange.ontology.ontology.Domain;
import eu.securechange.ontology.ontology.Goal;
import eu.securechange.ontology.ontology.OntologyPackage;
import eu.securechange.ontology.ontology.Relationship;
import eu.securechange.ontology.ontology.World;

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
 * An implementation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.securechange.ontology.ontology.impl.WorldImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.impl.WorldImpl#getDomains <em>Domains</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.impl.WorldImpl#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorldImpl extends MinimalEObjectImpl.Container implements World
{
  /**
   * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoals()
   * @generated
   * @ordered
   */
  protected EList<Goal> goals;

  /**
   * The cached value of the '{@link #getDomains() <em>Domains</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomains()
   * @generated
   * @ordered
   */
  protected EList<Domain> domains;

  /**
   * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationships()
   * @generated
   * @ordered
   */
  protected EList<Relationship> relationships;

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
  public EList<Goal> getGoals()
  {
    if (goals == null)
    {
      goals = new EObjectContainmentEList<Goal>(Goal.class, this, OntologyPackage.WORLD__GOALS);
    }
    return goals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Domain> getDomains()
  {
    if (domains == null)
    {
      domains = new EObjectContainmentEList<Domain>(Domain.class, this, OntologyPackage.WORLD__DOMAINS);
    }
    return domains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relationship> getRelationships()
  {
    if (relationships == null)
    {
      relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, OntologyPackage.WORLD__RELATIONSHIPS);
    }
    return relationships;
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
      case OntologyPackage.WORLD__GOALS:
        return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
      case OntologyPackage.WORLD__DOMAINS:
        return ((InternalEList<?>)getDomains()).basicRemove(otherEnd, msgs);
      case OntologyPackage.WORLD__RELATIONSHIPS:
        return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
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
      case OntologyPackage.WORLD__GOALS:
        return getGoals();
      case OntologyPackage.WORLD__DOMAINS:
        return getDomains();
      case OntologyPackage.WORLD__RELATIONSHIPS:
        return getRelationships();
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
      case OntologyPackage.WORLD__GOALS:
        getGoals().clear();
        getGoals().addAll((Collection<? extends Goal>)newValue);
        return;
      case OntologyPackage.WORLD__DOMAINS:
        getDomains().clear();
        getDomains().addAll((Collection<? extends Domain>)newValue);
        return;
      case OntologyPackage.WORLD__RELATIONSHIPS:
        getRelationships().clear();
        getRelationships().addAll((Collection<? extends Relationship>)newValue);
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
      case OntologyPackage.WORLD__GOALS:
        getGoals().clear();
        return;
      case OntologyPackage.WORLD__DOMAINS:
        getDomains().clear();
        return;
      case OntologyPackage.WORLD__RELATIONSHIPS:
        getRelationships().clear();
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
      case OntologyPackage.WORLD__GOALS:
        return goals != null && !goals.isEmpty();
      case OntologyPackage.WORLD__DOMAINS:
        return domains != null && !domains.isEmpty();
      case OntologyPackage.WORLD__RELATIONSHIPS:
        return relationships != null && !relationships.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WorldImpl
