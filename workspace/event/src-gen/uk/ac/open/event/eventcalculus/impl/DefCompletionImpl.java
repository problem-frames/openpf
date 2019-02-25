/**
 */
package uk.ac.open.event.eventcalculus.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.open.event.eventcalculus.DefCompletion;
import uk.ac.open.event.eventcalculus.Definition;
import uk.ac.open.event.eventcalculus.EventcalculusPackage;
import uk.ac.open.event.eventcalculus.LabelType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Def Completion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.DefCompletionImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.DefCompletionImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefCompletionImpl extends DeclarationImpl implements DefCompletion
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final LabelType TYPE_EDEFAULT = LabelType.T;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected LabelType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected Definition label;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefCompletionImpl()
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
    return EventcalculusPackage.Literals.DEF_COMPLETION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LabelType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(LabelType newType)
  {
    LabelType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.DEF_COMPLETION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Definition getLabel()
  {
    if (label != null && label.eIsProxy())
    {
      InternalEObject oldLabel = (InternalEObject)label;
      label = (Definition)eResolveProxy(oldLabel);
      if (label != oldLabel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventcalculusPackage.DEF_COMPLETION__LABEL, oldLabel, label));
      }
    }
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition basicGetLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLabel(Definition newLabel)
  {
    Definition oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.DEF_COMPLETION__LABEL, oldLabel, label));
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
      case EventcalculusPackage.DEF_COMPLETION__TYPE:
        return getType();
      case EventcalculusPackage.DEF_COMPLETION__LABEL:
        if (resolve) return getLabel();
        return basicGetLabel();
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
      case EventcalculusPackage.DEF_COMPLETION__TYPE:
        setType((LabelType)newValue);
        return;
      case EventcalculusPackage.DEF_COMPLETION__LABEL:
        setLabel((Definition)newValue);
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
      case EventcalculusPackage.DEF_COMPLETION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case EventcalculusPackage.DEF_COMPLETION__LABEL:
        setLabel((Definition)null);
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
      case EventcalculusPackage.DEF_COMPLETION__TYPE:
        return type != TYPE_EDEFAULT;
      case EventcalculusPackage.DEF_COMPLETION__LABEL:
        return label != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //DefCompletionImpl
