/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.Qualifier#getOp <em>Op</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.Qualifier#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getQualifier()
 * @model
 * @generated
 */
public interface Qualifier extends EObject
{
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
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getQualifier_Op()
   * @model
   * @generated
   */
  UnaryOp getOp();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.Qualifier#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see uk.ac.open.event.eventcalculus.UnaryOp
   * @see #getOp()
   * @generated
   */
  void setOp(UnaryOp value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(Parameters)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getQualifier_Parameters()
   * @model containment="true"
   * @generated
   */
  Parameters getParameters();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.Qualifier#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(Parameters value);

} // Qualifier
