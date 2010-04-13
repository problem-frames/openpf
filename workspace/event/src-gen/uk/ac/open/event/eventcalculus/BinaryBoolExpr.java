/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Bool Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.BinaryBoolExpr#getOpr <em>Opr</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.BinaryBoolExpr#getBinaryop <em>Binaryop</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getBinaryBoolExpr()
 * @model
 * @generated
 */
public interface BinaryBoolExpr extends BoolExpr
{
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
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getBinaryBoolExpr_Opr()
   * @model containment="true"
   * @generated
   */
  EList<BoolExpr> getOpr();

  /**
   * Returns the value of the '<em><b>Binaryop</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.open.event.eventcalculus.BinaryBoolOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binaryop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binaryop</em>' attribute.
   * @see uk.ac.open.event.eventcalculus.BinaryBoolOp
   * @see #setBinaryop(BinaryBoolOp)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getBinaryBoolExpr_Binaryop()
   * @model
   * @generated
   */
  BinaryBoolOp getBinaryop();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.BinaryBoolExpr#getBinaryop <em>Binaryop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binaryop</em>' attribute.
   * @see uk.ac.open.event.eventcalculus.BinaryBoolOp
   * @see #getBinaryop()
   * @generated
   */
  void setBinaryop(BinaryBoolOp value);

} // BinaryBoolExpr
