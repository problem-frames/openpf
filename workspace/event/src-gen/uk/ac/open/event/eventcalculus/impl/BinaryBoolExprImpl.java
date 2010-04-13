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

import uk.ac.open.event.eventcalculus.BinaryBoolExpr;
import uk.ac.open.event.eventcalculus.BinaryBoolOp;
import uk.ac.open.event.eventcalculus.BoolExpr;
import uk.ac.open.event.eventcalculus.EventcalculusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Bool Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.BinaryBoolExprImpl#getOpr <em>Opr</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.BinaryBoolExprImpl#getBinaryop <em>Binaryop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryBoolExprImpl extends BoolExprImpl implements BinaryBoolExpr
{
  /**
   * The cached value of the '{@link #getOpr() <em>Opr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpr()
   * @generated
   * @ordered
   */
  protected EList<BoolExpr> opr;

  /**
   * The default value of the '{@link #getBinaryop() <em>Binaryop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinaryop()
   * @generated
   * @ordered
   */
  protected static final BinaryBoolOp BINARYOP_EDEFAULT = BinaryBoolOp.IMPLICATION;

  /**
   * The cached value of the '{@link #getBinaryop() <em>Binaryop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinaryop()
   * @generated
   * @ordered
   */
  protected BinaryBoolOp binaryop = BINARYOP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BinaryBoolExprImpl()
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
    return EventcalculusPackage.Literals.BINARY_BOOL_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BoolExpr> getOpr()
  {
    if (opr == null)
    {
      opr = new EObjectContainmentEList<BoolExpr>(BoolExpr.class, this, EventcalculusPackage.BINARY_BOOL_EXPR__OPR);
    }
    return opr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryBoolOp getBinaryop()
  {
    return binaryop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinaryop(BinaryBoolOp newBinaryop)
  {
    BinaryBoolOp oldBinaryop = binaryop;
    binaryop = newBinaryop == null ? BINARYOP_EDEFAULT : newBinaryop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.BINARY_BOOL_EXPR__BINARYOP, oldBinaryop, binaryop));
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
      case EventcalculusPackage.BINARY_BOOL_EXPR__OPR:
        return ((InternalEList<?>)getOpr()).basicRemove(otherEnd, msgs);
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
      case EventcalculusPackage.BINARY_BOOL_EXPR__OPR:
        return getOpr();
      case EventcalculusPackage.BINARY_BOOL_EXPR__BINARYOP:
        return getBinaryop();
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
      case EventcalculusPackage.BINARY_BOOL_EXPR__OPR:
        getOpr().clear();
        getOpr().addAll((Collection<? extends BoolExpr>)newValue);
        return;
      case EventcalculusPackage.BINARY_BOOL_EXPR__BINARYOP:
        setBinaryop((BinaryBoolOp)newValue);
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
      case EventcalculusPackage.BINARY_BOOL_EXPR__OPR:
        getOpr().clear();
        return;
      case EventcalculusPackage.BINARY_BOOL_EXPR__BINARYOP:
        setBinaryop(BINARYOP_EDEFAULT);
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
      case EventcalculusPackage.BINARY_BOOL_EXPR__OPR:
        return opr != null && !opr.isEmpty();
      case EventcalculusPackage.BINARY_BOOL_EXPR__BINARYOP:
        return binaryop != BINARYOP_EDEFAULT;
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
    result.append(" (binaryop: ");
    result.append(binaryop);
    result.append(')');
    return result.toString();
  }

} //BinaryBoolExprImpl
