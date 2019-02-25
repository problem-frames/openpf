/**
 */
package uk.ac.open.problem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.open.problem.Phenomenon;
import uk.ac.open.problem.PhenomenonType;
import uk.ac.open.problem.ProblemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phenomenon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.open.problem.impl.PhenomenonImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.open.problem.impl.PhenomenonImpl#isIsControlled <em>Is Controlled</em>}</li>
 *   <li>{@link uk.ac.open.problem.impl.PhenomenonImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.problem.impl.PhenomenonImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhenomenonImpl extends MinimalEObjectImpl.Container implements Phenomenon
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final PhenomenonType TYPE_EDEFAULT = PhenomenonType.UNSPECIFIED;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected PhenomenonType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsControlled() <em>Is Controlled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsControlled()
   * @generated
   * @ordered
   */
  protected static final boolean IS_CONTROLLED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsControlled() <em>Is Controlled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsControlled()
   * @generated
   * @ordered
   */
  protected boolean isControlled = IS_CONTROLLED_EDEFAULT;

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
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PhenomenonImpl()
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
    return ProblemPackage.Literals.PHENOMENON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhenomenonType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(PhenomenonType newType)
  {
    PhenomenonType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.PHENOMENON__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsControlled()
  {
    return isControlled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsControlled(boolean newIsControlled)
  {
    boolean oldIsControlled = isControlled;
    isControlled = newIsControlled;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.PHENOMENON__IS_CONTROLLED, oldIsControlled, isControlled));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.PHENOMENON__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.PHENOMENON__DESCRIPTION, oldDescription, description));
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
      case ProblemPackage.PHENOMENON__TYPE:
        return getType();
      case ProblemPackage.PHENOMENON__IS_CONTROLLED:
        return isIsControlled();
      case ProblemPackage.PHENOMENON__NAME:
        return getName();
      case ProblemPackage.PHENOMENON__DESCRIPTION:
        return getDescription();
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
      case ProblemPackage.PHENOMENON__TYPE:
        setType((PhenomenonType)newValue);
        return;
      case ProblemPackage.PHENOMENON__IS_CONTROLLED:
        setIsControlled((Boolean)newValue);
        return;
      case ProblemPackage.PHENOMENON__NAME:
        setName((String)newValue);
        return;
      case ProblemPackage.PHENOMENON__DESCRIPTION:
        setDescription((String)newValue);
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
      case ProblemPackage.PHENOMENON__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ProblemPackage.PHENOMENON__IS_CONTROLLED:
        setIsControlled(IS_CONTROLLED_EDEFAULT);
        return;
      case ProblemPackage.PHENOMENON__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProblemPackage.PHENOMENON__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
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
      case ProblemPackage.PHENOMENON__TYPE:
        return type != TYPE_EDEFAULT;
      case ProblemPackage.PHENOMENON__IS_CONTROLLED:
        return isControlled != IS_CONTROLLED_EDEFAULT;
      case ProblemPackage.PHENOMENON__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProblemPackage.PHENOMENON__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
    result.append(", isControlled: ");
    result.append(isControlled);
    result.append(", name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //PhenomenonImpl
