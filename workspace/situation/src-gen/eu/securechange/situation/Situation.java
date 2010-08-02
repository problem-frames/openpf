/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.situation;

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
 *   <li>{@link eu.securechange.situation.Situation#getWorld <em>World</em>}</li>
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
	 * Returns the value of the '<em><b>World</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>World</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>World</em>' containment reference.
	 * @see #setWorld(World)
	 * @see eu.securechange.situation.SituationPackage#getSituation_World()
	 * @model containment="true"
	 * @generated
	 */
  World getWorld();

  /**
	 * Sets the value of the '{@link eu.securechange.situation.Situation#getWorld <em>World</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World</em>' containment reference.
	 * @see #getWorld()
	 * @generated
	 */
  void setWorld(World value);

} // Situation
