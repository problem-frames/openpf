/**
 * <copyright>
 * </copyright>
 *

 */
package uk.ac.open.argument.argument;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.ArgumentDiagram#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.ArgumentDiagram#getNodes <em>Nodes</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.ArgumentDiagram#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.argument.argument.ArgumentPackage#getArgumentDiagram()
 * @model
 * @generated
 */
public interface ArgumentDiagram extends EObject
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
   * @see uk.ac.open.argument.argument.ArgumentPackage#getArgumentDiagram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.ArgumentDiagram#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.argument.argument.Argument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see uk.ac.open.argument.argument.ArgumentPackage#getArgumentDiagram_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<Argument> getNodes();

  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.argument.argument.Link}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference list.
   * @see uk.ac.open.argument.argument.ArgumentPackage#getArgumentDiagram_Links()
   * @model containment="true"
   * @generated
   */
  EList<Link> getLinks();

} // ArgumentDiagram
