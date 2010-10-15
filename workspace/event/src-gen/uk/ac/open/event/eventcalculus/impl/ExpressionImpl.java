/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.open.event.eventcalculus.Defines;
import uk.ac.open.event.eventcalculus.EventcalculusPackage;
import uk.ac.open.event.eventcalculus.Expression;
import uk.ac.open.event.eventcalculus.Qualifier;
import uk.ac.open.event.eventcalculus.UnaryOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.ExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.ExpressionImpl#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.ExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.ExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.ExpressionImpl#getN <em>N</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.impl.ExpressionImpl#getDefine <em>Define</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

  /**
   * The cached value of the '{@link #getQualifiers() <em>Qualifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiers()
   * @generated
   * @ordered
   */
  protected Qualifier qualifiers;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final UnaryOp OP_EDEFAULT = UnaryOp.NOT;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected UnaryOp op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Expression right;

  /**
   * The default value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected static final int N_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected int n = N_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefine() <em>Define</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefine()
   * @generated
   * @ordered
   */
  protected Defines define;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return EventcalculusPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventcalculusPackage.EXPRESSION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventcalculusPackage.EXPRESSION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventcalculusPackage.EXPRESSION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.EXPRESSION__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Qualifier getQualifiers()
  {
    return qualifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQualifiers(Qualifier newQualifiers, NotificationChain msgs)
  {
    Qualifier oldQualifiers = qualifiers;
    qualifiers = newQualifiers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventcalculusPackage.EXPRESSION__QUALIFIERS, oldQualifiers, newQualifiers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifiers(Qualifier newQualifiers)
  {
    if (newQualifiers != qualifiers)
    {
      NotificationChain msgs = null;
      if (qualifiers != null)
        msgs = ((InternalEObject)qualifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventcalculusPackage.EXPRESSION__QUALIFIERS, null, msgs);
      if (newQualifiers != null)
        msgs = ((InternalEObject)newQualifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventcalculusPackage.EXPRESSION__QUALIFIERS, null, msgs);
      msgs = basicSetQualifiers(newQualifiers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.EXPRESSION__QUALIFIERS, newQualifiers, newQualifiers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOp getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(UnaryOp newOp)
  {
    UnaryOp oldOp = op;
    op = newOp == null ? OP_EDEFAULT : newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs)
  {
    Expression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventcalculusPackage.EXPRESSION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Expression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventcalculusPackage.EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventcalculusPackage.EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.EXPRESSION__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN(int newN)
  {
    int oldN = n;
    n = newN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.EXPRESSION__N, oldN, n));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Defines getDefine()
  {
    if (define != null && define.eIsProxy())
    {
      InternalEObject oldDefine = (InternalEObject)define;
      define = (Defines)eResolveProxy(oldDefine);
      if (define != oldDefine)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventcalculusPackage.EXPRESSION__DEFINE, oldDefine, define));
      }
    }
    return define;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Defines basicGetDefine()
  {
    return define;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefine(Defines newDefine)
  {
    Defines oldDefine = define;
    define = newDefine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventcalculusPackage.EXPRESSION__DEFINE, oldDefine, define));
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
      case EventcalculusPackage.EXPRESSION__EXPR:
        return basicSetExpr(null, msgs);
      case EventcalculusPackage.EXPRESSION__QUALIFIERS:
        return basicSetQualifiers(null, msgs);
      case EventcalculusPackage.EXPRESSION__RIGHT:
        return basicSetRight(null, msgs);
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
      case EventcalculusPackage.EXPRESSION__EXPR:
        return getExpr();
      case EventcalculusPackage.EXPRESSION__QUALIFIERS:
        return getQualifiers();
      case EventcalculusPackage.EXPRESSION__OP:
        return getOp();
      case EventcalculusPackage.EXPRESSION__RIGHT:
        return getRight();
      case EventcalculusPackage.EXPRESSION__N:
        return getN();
      case EventcalculusPackage.EXPRESSION__DEFINE:
        if (resolve) return getDefine();
        return basicGetDefine();
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
      case EventcalculusPackage.EXPRESSION__EXPR:
        setExpr((Expression)newValue);
        return;
      case EventcalculusPackage.EXPRESSION__QUALIFIERS:
        setQualifiers((Qualifier)newValue);
        return;
      case EventcalculusPackage.EXPRESSION__OP:
        setOp((UnaryOp)newValue);
        return;
      case EventcalculusPackage.EXPRESSION__RIGHT:
        setRight((Expression)newValue);
        return;
      case EventcalculusPackage.EXPRESSION__N:
        setN((Integer)newValue);
        return;
      case EventcalculusPackage.EXPRESSION__DEFINE:
        setDefine((Defines)newValue);
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
      case EventcalculusPackage.EXPRESSION__EXPR:
        setExpr((Expression)null);
        return;
      case EventcalculusPackage.EXPRESSION__QUALIFIERS:
        setQualifiers((Qualifier)null);
        return;
      case EventcalculusPackage.EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
      case EventcalculusPackage.EXPRESSION__RIGHT:
        setRight((Expression)null);
        return;
      case EventcalculusPackage.EXPRESSION__N:
        setN(N_EDEFAULT);
        return;
      case EventcalculusPackage.EXPRESSION__DEFINE:
        setDefine((Defines)null);
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
      case EventcalculusPackage.EXPRESSION__EXPR:
        return expr != null;
      case EventcalculusPackage.EXPRESSION__QUALIFIERS:
        return qualifiers != null;
      case EventcalculusPackage.EXPRESSION__OP:
        return op != OP_EDEFAULT;
      case EventcalculusPackage.EXPRESSION__RIGHT:
        return right != null;
      case EventcalculusPackage.EXPRESSION__N:
        return n != N_EDEFAULT;
      case EventcalculusPackage.EXPRESSION__DEFINE:
        return define != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(", n: ");
    result.append(n);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
