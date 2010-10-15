/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.LabeledExpression#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.LabeledExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getLabeledExpression()
 * @model
 * @generated
 */
public interface LabeledExpression extends Statement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.open.event.eventcalculus.LabelType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see uk.ac.open.event.eventcalculus.LabelType
   * @see #setName(LabelType)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getLabeledExpression_Name()
   * @model
   * @generated
   */
  LabelType getName();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.LabeledExpression#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see uk.ac.open.event.eventcalculus.LabelType
   * @see #getName()
   * @generated
   */
  void setName(LabelType value);

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
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getLabeledExpression_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.LabeledExpression#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

} // LabeledExpression
