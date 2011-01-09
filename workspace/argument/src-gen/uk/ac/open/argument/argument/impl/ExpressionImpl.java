/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.open.argument.argument.ArgumentPackage;
import uk.ac.open.argument.argument.Expression;
import uk.ac.open.argument.argument.UnaryOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.impl.ExpressionImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ExpressionImpl#getUop <em>Uop</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ExpressionImpl#getN <em>N</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getAssign() <em>Assign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign()
   * @generated
   * @ordered
   */
  protected Expression assign;

  /**
   * The default value of the '{@link #getUop() <em>Uop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUop()
   * @generated
   * @ordered
   */
  protected static final UnaryOp UOP_EDEFAULT = UnaryOp.DEFAULT;

  /**
   * The cached value of the '{@link #getUop() <em>Uop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUop()
   * @generated
   * @ordered
   */
  protected UnaryOp uop = UOP_EDEFAULT;

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
    return ArgumentPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getAssign()
  {
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssign(Expression newAssign, NotificationChain msgs)
  {
    Expression oldAssign = assign;
    assign = newAssign;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArgumentPackage.EXPRESSION__ASSIGN, oldAssign, newAssign);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssign(Expression newAssign)
  {
    if (newAssign != assign)
    {
      NotificationChain msgs = null;
      if (assign != null)
        msgs = ((InternalEObject)assign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArgumentPackage.EXPRESSION__ASSIGN, null, msgs);
      if (newAssign != null)
        msgs = ((InternalEObject)newAssign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArgumentPackage.EXPRESSION__ASSIGN, null, msgs);
      msgs = basicSetAssign(newAssign, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.EXPRESSION__ASSIGN, newAssign, newAssign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOp getUop()
  {
    return uop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUop(UnaryOp newUop)
  {
    UnaryOp oldUop = uop;
    uop = newUop == null ? UOP_EDEFAULT : newUop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.EXPRESSION__UOP, oldUop, uop));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArgumentPackage.EXPRESSION__RIGHT, oldRight, newRight);
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
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArgumentPackage.EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArgumentPackage.EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.EXPRESSION__RIGHT, newRight, newRight));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.EXPRESSION__N, oldN, n));
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
      case ArgumentPackage.EXPRESSION__ASSIGN:
        return basicSetAssign(null, msgs);
      case ArgumentPackage.EXPRESSION__RIGHT:
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
      case ArgumentPackage.EXPRESSION__ASSIGN:
        return getAssign();
      case ArgumentPackage.EXPRESSION__UOP:
        return getUop();
      case ArgumentPackage.EXPRESSION__RIGHT:
        return getRight();
      case ArgumentPackage.EXPRESSION__N:
        return getN();
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
      case ArgumentPackage.EXPRESSION__ASSIGN:
        setAssign((Expression)newValue);
        return;
      case ArgumentPackage.EXPRESSION__UOP:
        setUop((UnaryOp)newValue);
        return;
      case ArgumentPackage.EXPRESSION__RIGHT:
        setRight((Expression)newValue);
        return;
      case ArgumentPackage.EXPRESSION__N:
        setN((Integer)newValue);
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
      case ArgumentPackage.EXPRESSION__ASSIGN:
        setAssign((Expression)null);
        return;
      case ArgumentPackage.EXPRESSION__UOP:
        setUop(UOP_EDEFAULT);
        return;
      case ArgumentPackage.EXPRESSION__RIGHT:
        setRight((Expression)null);
        return;
      case ArgumentPackage.EXPRESSION__N:
        setN(N_EDEFAULT);
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
      case ArgumentPackage.EXPRESSION__ASSIGN:
        return assign != null;
      case ArgumentPackage.EXPRESSION__UOP:
        return uop != UOP_EDEFAULT;
      case ArgumentPackage.EXPRESSION__RIGHT:
        return right != null;
      case ArgumentPackage.EXPRESSION__N:
        return n != N_EDEFAULT;
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
    result.append(" (uop: ");
    result.append(uop);
    result.append(", n: ");
    result.append(n);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
