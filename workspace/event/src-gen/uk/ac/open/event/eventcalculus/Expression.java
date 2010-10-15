/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.Expression#getExpr <em>Expr</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.Expression#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.Expression#getOp <em>Op</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.Expression#getRight <em>Right</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.Expression#getN <em>N</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.Expression#getDefine <em>Define</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
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
   * Returns the value of the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifiers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifiers</em>' containment reference.
   * @see #setQualifiers(Qualifier)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getExpression_Qualifiers()
   * @model containment="true"
   * @generated
   */
  Qualifier getQualifiers();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.Expression#getQualifiers <em>Qualifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifiers</em>' containment reference.
   * @see #getQualifiers()
   * @generated
   */
  void setQualifiers(Qualifier value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.open.event.eventcalculus.UnaryOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see uk.ac.open.event.eventcalculus.UnaryOp
   * @see #setOp(UnaryOp)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getExpression_Op()
   * @model
   * @generated
   */
  UnaryOp getOp();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.Expression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see uk.ac.open.event.eventcalculus.UnaryOp
   * @see #getOp()
   * @generated
   */
  void setOp(UnaryOp value);

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

  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(int)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getExpression_N()
   * @model
   * @generated
   */
  int getN();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.Expression#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(int value);

  /**
   * Returns the value of the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Define</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Define</em>' reference.
   * @see #setDefine(Defines)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getExpression_Define()
   * @model
   * @generated
   */
  Defines getDefine();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.Expression#getDefine <em>Define</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Define</em>' reference.
   * @see #getDefine()
   * @generated
   */
  void setDefine(Defines value);

} // Expression
