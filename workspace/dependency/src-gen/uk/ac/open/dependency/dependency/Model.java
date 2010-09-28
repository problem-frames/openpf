/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.dependency.dependency;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.dependency.dependency.Model#getNodes <em>Nodes</em>}</li>
 *   <li>{@link uk.ac.open.dependency.dependency.Model#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.dependency.dependency.DependencyPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.open.dependency.dependency.Node}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see uk.ac.open.dependency.dependency.DependencyPackage#getModel_Nodes()
	 * @model containment="true"
	 * @generated
	 */
  EList<Node> getNodes();

  /**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.open.dependency.dependency.Dependency}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see uk.ac.open.dependency.dependency.DependencyPackage#getModel_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
  EList<Dependency> getDependencies();

} // Model
