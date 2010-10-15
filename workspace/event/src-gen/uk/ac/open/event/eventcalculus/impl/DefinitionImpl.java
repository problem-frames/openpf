/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.open.event.eventcalculus.Defines;
import uk.ac.open.event.eventcalculus.Definition;
import uk.ac.open.event.eventcalculus.EventcalculusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.DefinitionImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.DefinitionImpl#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionImpl extends DefinesImpl implements Definition
{
  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<Defines> args;

  /**
   * The cached value of the '{@link #getReturn() <em>Return</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected EList<Defines> return_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionImpl()
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
    return EventcalculusPackage.Literals.DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Defines> getArgs()
  {
    if (args == null)
    {
      args = new EObjectResolvingEList<Defines>(Defines.class, this, EventcalculusPackage.DEFINITION__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Defines> getReturn()
  {
    if (return_ == null)
    {
      return_ = new EObjectResolvingEList<Defines>(Defines.class, this, EventcalculusPackage.DEFINITION__RETURN);
    }
    return return_;
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
      case EventcalculusPackage.DEFINITION__ARGS:
        return getArgs();
      case EventcalculusPackage.DEFINITION__RETURN:
        return getReturn();
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
      case EventcalculusPackage.DEFINITION__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends Defines>)newValue);
        return;
      case EventcalculusPackage.DEFINITION__RETURN:
        getReturn().clear();
        getReturn().addAll((Collection<? extends Defines>)newValue);
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
      case EventcalculusPackage.DEFINITION__ARGS:
        getArgs().clear();
        return;
      case EventcalculusPackage.DEFINITION__RETURN:
        getReturn().clear();
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
      case EventcalculusPackage.DEFINITION__ARGS:
        return args != null && !args.isEmpty();
      case EventcalculusPackage.DEFINITION__RETURN:
        return return_ != null && !return_.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DefinitionImpl
