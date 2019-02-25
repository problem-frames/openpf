/**
 */
package uk.ac.open.event.eventcalculus.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.open.event.eventcalculus.DefNonInertia;
import uk.ac.open.event.eventcalculus.Definition;
import uk.ac.open.event.eventcalculus.EventcalculusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Def Non Inertia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.DefNonInertiaImpl#getNames <em>Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefNonInertiaImpl extends DeclarationImpl implements DefNonInertia
{
  /**
   * The cached value of the '{@link #getNames() <em>Names</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNames()
   * @generated
   * @ordered
   */
  protected EList<Definition> names;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefNonInertiaImpl()
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
    return EventcalculusPackage.Literals.DEF_NON_INERTIA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Definition> getNames()
  {
    if (names == null)
    {
      names = new EObjectResolvingEList<Definition>(Definition.class, this, EventcalculusPackage.DEF_NON_INERTIA__NAMES);
    }
    return names;
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
      case EventcalculusPackage.DEF_NON_INERTIA__NAMES:
        return getNames();
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
      case EventcalculusPackage.DEF_NON_INERTIA__NAMES:
        getNames().clear();
        getNames().addAll((Collection<? extends Definition>)newValue);
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
      case EventcalculusPackage.DEF_NON_INERTIA__NAMES:
        getNames().clear();
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
      case EventcalculusPackage.DEF_NON_INERTIA__NAMES:
        return names != null && !names.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DefNonInertiaImpl
