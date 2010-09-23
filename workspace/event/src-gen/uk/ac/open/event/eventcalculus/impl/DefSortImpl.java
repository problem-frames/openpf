/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.open.event.eventcalculus.DefSort;
import uk.ac.open.event.eventcalculus.EventcalculusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Def Sort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.DefSortImpl#getReified <em>Reified</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.DefSortImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.DefSortImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefSortImpl extends DeclarationImpl implements DefSort
{
  /**
   * The default value of the '{@link #getReified() <em>Reified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReified()
   * @generated
   * @ordered
   */
  protected static final String REIFIED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReified() <em>Reified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReified()
   * @generated
   * @ordered
   */
  protected String reified = REIFIED_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefSortImpl()
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
    return EventcalculusPackage.Literals.DEF_SORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReified()
  {
    return reified;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReified(String newReified)
  {
    String oldReified = reified;
    reified = newReified;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.DEF_SORT__REIFIED, oldReified, reified));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.DEF_SORT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.DEF_SORT__TYPE, oldType, type));
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
      case EventcalculusPackage.DEF_SORT__REIFIED:
        return getReified();
      case EventcalculusPackage.DEF_SORT__NAME:
        return getName();
      case EventcalculusPackage.DEF_SORT__TYPE:
        return getType();
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
      case EventcalculusPackage.DEF_SORT__REIFIED:
        setReified((String)newValue);
        return;
      case EventcalculusPackage.DEF_SORT__NAME:
        setName((String)newValue);
        return;
      case EventcalculusPackage.DEF_SORT__TYPE:
        setType((String)newValue);
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
      case EventcalculusPackage.DEF_SORT__REIFIED:
        setReified(REIFIED_EDEFAULT);
        return;
      case EventcalculusPackage.DEF_SORT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EventcalculusPackage.DEF_SORT__TYPE:
        setType(TYPE_EDEFAULT);
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
      case EventcalculusPackage.DEF_SORT__REIFIED:
        return REIFIED_EDEFAULT == null ? reified != null : !REIFIED_EDEFAULT.equals(reified);
      case EventcalculusPackage.DEF_SORT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EventcalculusPackage.DEF_SORT__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (reified: ");
    result.append(reified);
    result.append(", name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //DefSortImpl
