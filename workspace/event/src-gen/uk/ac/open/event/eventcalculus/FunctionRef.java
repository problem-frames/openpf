/**
 */
package uk.ac.open.event.eventcalculus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.FunctionRef#getFunc <em>Func</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.FunctionRef#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getFunctionRef()
 * @model
 * @generated
 */
public interface FunctionRef extends Expression
{
  /**
   * Returns the value of the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' containment reference.
   * @see #setFunc(Expression)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getFunctionRef_Func()
   * @model containment="true"
   * @generated
   */
  Expression getFunc();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.FunctionRef#getFunc <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' containment reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(Expression value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.event.eventcalculus.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getFunctionRef_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

} // FunctionRef
