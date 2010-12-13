/**
 * <copyright>
 * </copyright>
 *
 * $Id: Diagram.java,v 1.1.1.1 2007/02/25 22:46:39 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;

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
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Diagram#getTitle <em>Title</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Diagram#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The default value is <code>"TroposDiagram"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getDiagram_Title()
	 * @model default="TroposDiagram" required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Diagram#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link it.unitn.disi.sistar.modeling.tropos.GraphicalObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getDiagram_Object()
	 * @model type="it.unitn.disi.sistar.modeling.tropos.GraphicalObject" containment="true"
	 * @generated
	 */
	EList getObject();

} // Diagram