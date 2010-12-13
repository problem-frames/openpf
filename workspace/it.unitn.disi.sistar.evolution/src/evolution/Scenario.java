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
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link evolution.Scenario#getMainDiagram <em>Main Diagram</em>}</li>
 *   <li>{@link evolution.Scenario#getRules <em>Rules</em>}</li>
 *   <li>{@link evolution.Scenario#getRepository <em>Repository</em>}</li>
 *   <li>{@link evolution.Scenario#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see evolution.EvolutionPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Diagram</em>' reference.
	 * @see #setMainDiagram(File)
	 * @see evolution.EvolutionPackage#getScenario_MainDiagram()
	 * @model
	 * @generated
	 */
	File getMainDiagram();

	/**
	 * Sets the value of the '{@link evolution.Scenario#getMainDiagram <em>Main Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Diagram</em>' reference.
	 * @see #getMainDiagram()
	 * @generated
	 */
	void setMainDiagram(File value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link evolution.EvolutionRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see evolution.EvolutionPackage#getScenario_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<EvolutionRule> getRules();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference.
	 * @see #setRepository(FileRepository)
	 * @see evolution.EvolutionPackage#getScenario_Repository()
	 * @model containment="true"
	 * @generated
	 */
	FileRepository getRepository();

	/**
	 * Sets the value of the '{@link evolution.Scenario#getRepository <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' containment reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(FileRepository value);

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
	 * @see evolution.EvolutionPackage#getScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link evolution.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Scenario
