/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.Expression#getLabel <em>Label</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.Expression#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.Expression#getExpr <em>Expr</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.Expression#getOp <em>Op</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.Expression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends Statement
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getExpression_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.Expression#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Qualifiers</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.event.eventcalculus.Qualifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifiers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifiers</em>' containment reference list.
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getExpression_Qualifiers()
   * @model containment="true"
   * @generated
   */
  EList<Qualifier> getQualifiers();

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getExpression_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.Expression#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.open.event.eventcalculus.UnarOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see uk.ac.open.event.eventcalculus.UnarOp
   * @see #setOp(UnarOp)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getExpression_Op()
   * @model
   * @generated
   */
  UnarOp getOp();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.Expression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see uk.ac.open.event.eventcalculus.UnarOp
   * @see #getOp()
   * @generated
   */
  void setOp(UnarOp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getExpression_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.Expression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // Expression
