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

import uk.ac.open.event.eventcalculus.BoolExpr;
import uk.ac.open.event.eventcalculus.EventcalculusPackage;
import uk.ac.open.event.eventcalculus.UnaryBoolExpr;
import uk.ac.open.event.eventcalculus.UnaryBoolOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Bool Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.UnaryBoolExprImpl#getUnaryop_lhs <em>Unaryop lhs</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.UnaryBoolExprImpl#getOpr <em>Opr</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.UnaryBoolExprImpl#getOps <em>Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnaryBoolExprImpl extends BoolExprImpl implements UnaryBoolExpr
{
  /**
   * The default value of the '{@link #getUnaryop_lhs() <em>Unaryop lhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryop_lhs()
   * @generated
   * @ordered
   */
  protected static final UnaryBoolOp UNARYOP_LHS_EDEFAULT = UnaryBoolOp.NEGATION;

  /**
   * The cached value of the '{@link #getUnaryop_lhs() <em>Unaryop lhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryop_lhs()
   * @generated
   * @ordered
   */
  protected UnaryBoolOp unaryop_lhs = UNARYOP_LHS_EDEFAULT;

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
   * The cached value of the '{@link #getOps() <em>Ops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOps()
   * @generated
   * @ordered
   */
  protected EList<BoolExpr> ops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnaryBoolExprImpl()
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
    return EventcalculusPackage.Literals.UNARY_BOOL_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryBoolOp getUnaryop_lhs()
  {
    return unaryop_lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryop_lhs(UnaryBoolOp newUnaryop_lhs)
  {
    UnaryBoolOp oldUnaryop_lhs = unaryop_lhs;
    unaryop_lhs = newUnaryop_lhs == null ? UNARYOP_LHS_EDEFAULT : newUnaryop_lhs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.UNARY_BOOL_EXPR__UNARYOP_LHS, oldUnaryop_lhs, unaryop_lhs));
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
      opr = new EObjectContainmentEList<BoolExpr>(BoolExpr.class, this, EventcalculusPackage.UNARY_BOOL_EXPR__OPR);
    }
    return opr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BoolExpr> getOps()
  {
    if (ops == null)
    {
      ops = new EObjectContainmentEList<BoolExpr>(BoolExpr.class, this, EventcalculusPackage.UNARY_BOOL_EXPR__OPS);
    }
    return ops;
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
      case EventcalculusPackage.UNARY_BOOL_EXPR__OPR:
        return ((InternalEList<?>)getOpr()).basicRemove(otherEnd, msgs);
      case EventcalculusPackage.UNARY_BOOL_EXPR__OPS:
        return ((InternalEList<?>)getOps()).basicRemove(otherEnd, msgs);
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
      case EventcalculusPackage.UNARY_BOOL_EXPR__UNARYOP_LHS:
        return getUnaryop_lhs();
      case EventcalculusPackage.UNARY_BOOL_EXPR__OPR:
        return getOpr();
      case EventcalculusPackage.UNARY_BOOL_EXPR__OPS:
        return getOps();
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
      case EventcalculusPackage.UNARY_BOOL_EXPR__UNARYOP_LHS:
        setUnaryop_lhs((UnaryBoolOp)newValue);
        return;
      case EventcalculusPackage.UNARY_BOOL_EXPR__OPR:
        getOpr().clear();
        getOpr().addAll((Collection<? extends BoolExpr>)newValue);
        return;
      case EventcalculusPackage.UNARY_BOOL_EXPR__OPS:
        getOps().clear();
        getOps().addAll((Collection<? extends BoolExpr>)newValue);
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
      case EventcalculusPackage.UNARY_BOOL_EXPR__UNARYOP_LHS:
        setUnaryop_lhs(UNARYOP_LHS_EDEFAULT);
        return;
      case EventcalculusPackage.UNARY_BOOL_EXPR__OPR:
        getOpr().clear();
        return;
      case EventcalculusPackage.UNARY_BOOL_EXPR__OPS:
        getOps().clear();
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
      case EventcalculusPackage.UNARY_BOOL_EXPR__UNARYOP_LHS:
        return unaryop_lhs != UNARYOP_LHS_EDEFAULT;
      case EventcalculusPackage.UNARY_BOOL_EXPR__OPR:
        return opr != null && !opr.isEmpty();
      case EventcalculusPackage.UNARY_BOOL_EXPR__OPS:
        return ops != null && !ops.isEmpty();
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
    result.append(" (unaryop_lhs: ");
    result.append(unaryop_lhs);
    result.append(')');
    return result.toString();
  }

} //UnaryBoolExprImpl
