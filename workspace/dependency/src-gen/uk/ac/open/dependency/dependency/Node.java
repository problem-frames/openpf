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
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.dependency.dependency.Node#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.dependency.dependency.Node#getReferrence <em>Referrence</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.dependency.dependency.DependencyPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject
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
	 * @see uk.ac.open.dependency.dependency.DependencyPackage#getNode_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link uk.ac.open.dependency.dependency.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Referrence</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referrence</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Referrence</em>' attribute list.
	 * @see uk.ac.open.dependency.dependency.DependencyPackage#getNode_Referrence()
	 * @model unique="false"
	 * @generated
	 */
  EList<String> getReferrence();

} // Node
