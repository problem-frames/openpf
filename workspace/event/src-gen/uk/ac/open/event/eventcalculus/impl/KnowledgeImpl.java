/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.open.event.eventcalculus.Entity;
import uk.ac.open.event.eventcalculus.EventcalculusPackage;
import uk.ac.open.event.eventcalculus.Import;
import uk.ac.open.event.eventcalculus.Knowledge;
import uk.ac.open.event.eventcalculus.Rule;
import uk.ac.open.event.eventcalculus.Var;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.KnowledgeImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.KnowledgeImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.KnowledgeImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.KnowledgeImpl#getVars <em>Vars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KnowledgeImpl extends MinimalEObjectImpl.Container implements Knowledge
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

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
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<Rule> rules;

  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<Var> vars;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KnowledgeImpl()
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
    return EventcalculusPackage.Literals.KNOWLEDGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, EventcalculusPackage.KNOWLEDGE__IMPORTS);
    }
    return imports;
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
      entities = new EObjectContainmentEList<Entity>(Entity.class, this, EventcalculusPackage.KNOWLEDGE__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<Rule>(Rule.class, this, EventcalculusPackage.KNOWLEDGE__RULES);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Var> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectContainmentEList<Var>(Var.class, this, EventcalculusPackage.KNOWLEDGE__VARS);
    }
    return vars;
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
      case EventcalculusPackage.KNOWLEDGE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case EventcalculusPackage.KNOWLEDGE__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
      case EventcalculusPackage.KNOWLEDGE__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
      case EventcalculusPackage.KNOWLEDGE__VARS:
        return ((InternalEList<?>)getVars()).basicRemove(otherEnd, msgs);
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
      case EventcalculusPackage.KNOWLEDGE__IMPORTS:
        return getImports();
      case EventcalculusPackage.KNOWLEDGE__ENTITIES:
        return getEntities();
      case EventcalculusPackage.KNOWLEDGE__RULES:
        return getRules();
      case EventcalculusPackage.KNOWLEDGE__VARS:
        return getVars();
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
      case EventcalculusPackage.KNOWLEDGE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case EventcalculusPackage.KNOWLEDGE__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entity>)newValue);
        return;
      case EventcalculusPackage.KNOWLEDGE__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends Rule>)newValue);
        return;
      case EventcalculusPackage.KNOWLEDGE__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends Var>)newValue);
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
      case EventcalculusPackage.KNOWLEDGE__IMPORTS:
        getImports().clear();
        return;
      case EventcalculusPackage.KNOWLEDGE__ENTITIES:
        getEntities().clear();
        return;
      case EventcalculusPackage.KNOWLEDGE__RULES:
        getRules().clear();
        return;
      case EventcalculusPackage.KNOWLEDGE__VARS:
        getVars().clear();
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
      case EventcalculusPackage.KNOWLEDGE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case EventcalculusPackage.KNOWLEDGE__ENTITIES:
        return entities != null && !entities.isEmpty();
      case EventcalculusPackage.KNOWLEDGE__RULES:
        return rules != null && !rules.isEmpty();
      case EventcalculusPackage.KNOWLEDGE__VARS:
        return vars != null && !vars.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //KnowledgeImpl
