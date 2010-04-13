/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Bool Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.UnaryBoolExpr#getUnaryop_lhs <em>Unaryop lhs</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.UnaryBoolExpr#getOpr <em>Opr</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.UnaryBoolExpr#getOps <em>Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getUnaryBoolExpr()
 * @model
 * @generated
 */
public interface UnaryBoolExpr extends BoolExpr
{
  /**
   * Returns the value of the '<em><b>Unaryop lhs</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.open.event.eventcalculus.UnaryBoolOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unaryop lhs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unaryop lhs</em>' attribute.
   * @see uk.ac.open.event.eventcalculus.UnaryBoolOp
   * @see #setUnaryop_lhs(UnaryBoolOp)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getUnaryBoolExpr_Unaryop_lhs()
   * @model
   * @generated
   */
  UnaryBoolOp getUnaryop_lhs();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.UnaryBoolExpr#getUnaryop_lhs <em>Unaryop lhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unaryop lhs</em>' attribute.
   * @see uk.ac.open.event.eventcalculus.UnaryBoolOp
   * @see #getUnaryop_lhs()
   * @generated
   */
  void setUnaryop_lhs(UnaryBoolOp value);

  /**
   * Returns the value of the '<em><b>Opr</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.event.eventcalculus.BoolExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opr</em>' containment reference list.
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getUnaryBoolExpr_Opr()
   * @model containment="true"
   * @generated
   */
  EList<BoolExpr> getOpr();

  /**
   * Returns the value of the '<em><b>Ops</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.event.eventcalculus.BoolExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ops</em>' containment reference list.
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getUnaryBoolExpr_Ops()
   * @model containment="true"
   * @generated
   */
  EList<BoolExpr> getOps();

} // UnaryBoolExpr
