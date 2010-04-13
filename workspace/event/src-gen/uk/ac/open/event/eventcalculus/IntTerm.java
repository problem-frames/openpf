/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.IntTerm#getConst <em>Const</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.IntTerm#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getIntTerm()
 * @model
 * @generated
 */
public interface IntTerm extends IntExpr
{
  /**
   * Returns the value of the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' attribute.
   * @see #setConst(int)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getIntTerm_Const()
   * @model
   * @generated
   */
  int getConst();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.IntTerm#getConst <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' attribute.
   * @see #getConst()
   * @generated
   */
  void setConst(int value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(Var)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getIntTerm_Var()
   * @model
   * @generated
   */
  Var getVar();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.IntTerm#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Var value);

} // IntTerm
