/**
 * <copyright>
 * </copyright>
 *
 */
package argument.argument;

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
 *   <li>{@link argument.argument.ArgumentDiagram#getName <em>Name</em>}</li>
 *   <li>{@link argument.argument.ArgumentDiagram#getNodes <em>Nodes</em>}</li>
 *   <li>{@link argument.argument.ArgumentDiagram#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see argument.argument.ArgumentPackage#getArgumentDiagram()
 * @model annotation="gmf.diagram foo='bar'"
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
	 * @see argument.argument.ArgumentPackage#getArgumentDiagram_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link argument.argument.ArgumentDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link argument.argument.Argument}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see argument.argument.ArgumentPackage#getArgumentDiagram_Nodes()
	 * @model containment="true"
	 * @generated
	 */
  EList<Argument> getNodes();

  /**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link argument.argument.Link}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see argument.argument.ArgumentPackage#getArgumentDiagram_Links()
	 * @model containment="true"
	 * @generated
	 */
  EList<Link> getLinks();

} // ArgumentDiagram
