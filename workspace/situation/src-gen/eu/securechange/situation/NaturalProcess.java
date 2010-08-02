/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.situation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Natural Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.situation.NaturalProcess#getName <em>Name</em>}</li>
 *   <li>{@link eu.securechange.situation.NaturalProcess#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.situation.SituationPackage#getNaturalProcess()
 * @model
 * @generated
 */
public interface NaturalProcess extends eu.securechange.situation.Process
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.securechange.situation.SituationPackage#getNaturalProcess_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link eu.securechange.situation.NaturalProcess#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link eu.securechange.situation.Process}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activities</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see eu.securechange.situation.SituationPackage#getNaturalProcess_Activities()
	 * @model
	 * @generated
	 */
  EList<eu.securechange.situation.Process> getActivities();

} // NaturalProcess
