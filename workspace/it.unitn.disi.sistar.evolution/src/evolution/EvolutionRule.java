/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package evolution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link evolution.EvolutionRule#getModel <em>Model</em>}</li>
 *   <li>{@link evolution.EvolutionRule#getProbabilities <em>Probabilities</em>}</li>
 *   <li>{@link evolution.EvolutionRule#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see evolution.EvolutionPackage#getEvolutionRule()
 * @model
 * @generated
 */
public interface EvolutionRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(File)
	 * @see evolution.EvolutionPackage#getEvolutionRule_Model()
	 * @model
	 * @generated
	 */
	File getModel();

	/**
	 * Sets the value of the '{@link evolution.EvolutionRule#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(File value);

	/**
	 * Returns the value of the '<em><b>Probabilities</b></em>' containment reference list.
	 * The list contents are of type {@link evolution.Possibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probabilities</em>' containment reference list.
	 * @see evolution.EvolutionPackage#getEvolutionRule_Probabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Possibility> getProbabilities();

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
	 * @see evolution.EvolutionPackage#getEvolutionRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link evolution.EvolutionRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EvolutionRule
