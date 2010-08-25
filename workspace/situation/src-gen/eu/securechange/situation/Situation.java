/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.situation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Situation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.situation.Situation#getTime <em>Time</em>}</li>
 *   <li>{@link eu.securechange.situation.Situation#getThings <em>Things</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.situation.SituationPackage#getSituation()
 * @model
 * @generated
 */
public interface Situation extends EObject
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(String)
   * @see eu.securechange.situation.SituationPackage#getSituation_Time()
   * @model
   * @generated
   */
  String getTime();

  /**
   * Sets the value of the '{@link eu.securechange.situation.Situation#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(String value);

  /**
   * Returns the value of the '<em><b>Things</b></em>' containment reference list.
   * The list contents are of type {@link eu.securechange.situation.Thing}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Things</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Things</em>' containment reference list.
   * @see eu.securechange.situation.SituationPackage#getSituation_Things()
   * @model containment="true"
   * @generated
   */
  EList<Thing> getThings();

} // Situation
