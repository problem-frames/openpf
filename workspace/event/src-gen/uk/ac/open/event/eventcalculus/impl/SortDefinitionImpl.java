/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.open.event.eventcalculus.DefSort;
import uk.ac.open.event.eventcalculus.Definition;
import uk.ac.open.event.eventcalculus.EventcalculusPackage;
import uk.ac.open.event.eventcalculus.SortDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.SortDefinitionImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.SortDefinitionImpl#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortDefinitionImpl extends StatementImpl implements SortDefinition
{
  /**
   * The cached value of the '{@link #getSort() <em>Sort</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSort()
   * @generated
   * @ordered
   */
  protected DefSort sort;

  /**
   * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitions()
   * @generated
   * @ordered
   */
  protected EList<Definition> definitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SortDefinitionImpl()
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
    return EventcalculusPackage.Literals.SORT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefSort getSort()
  {
    if (sort != null && sort.eIsProxy())
    {
      InternalEObject oldSort = (InternalEObject)sort;
      sort = (DefSort)eResolveProxy(oldSort);
      if (sort != oldSort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventcalculusPackage.SORT_DEFINITION__SORT, oldSort, sort));
      }
    }
    return sort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefSort basicGetSort()
  {
    return sort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSort(DefSort newSort)
  {
    DefSort oldSort = sort;
    sort = newSort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.SORT_DEFINITION__SORT, oldSort, sort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Definition> getDefinitions()
  {
    if (definitions == null)
    {
      definitions = new EObjectContainmentEList<Definition>(Definition.class, this, EventcalculusPackage.SORT_DEFINITION__DEFINITIONS);
    }
    return definitions;
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
      case EventcalculusPackage.SORT_DEFINITION__DEFINITIONS:
        return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
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
      case EventcalculusPackage.SORT_DEFINITION__SORT:
        if (resolve) return getSort();
        return basicGetSort();
      case EventcalculusPackage.SORT_DEFINITION__DEFINITIONS:
        return getDefinitions();
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
      case EventcalculusPackage.SORT_DEFINITION__SORT:
        setSort((DefSort)newValue);
        return;
      case EventcalculusPackage.SORT_DEFINITION__DEFINITIONS:
        getDefinitions().clear();
        getDefinitions().addAll((Collection<? extends Definition>)newValue);
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
      case EventcalculusPackage.SORT_DEFINITION__SORT:
        setSort((DefSort)null);
        return;
      case EventcalculusPackage.SORT_DEFINITION__DEFINITIONS:
        getDefinitions().clear();
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
      case EventcalculusPackage.SORT_DEFINITION__SORT:
        return sort != null;
      case EventcalculusPackage.SORT_DEFINITION__DEFINITIONS:
        return definitions != null && !definitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SortDefinitionImpl
