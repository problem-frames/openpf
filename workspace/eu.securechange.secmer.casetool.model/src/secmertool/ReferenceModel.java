/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link secmertool.ReferenceModel#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see secmertool.SecMERToolPackage#getReferenceModel()
 * @model
 * @generated
 */
public interface ReferenceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link secmertool.ReferenceLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see secmertool.SecMERToolPackage#getReferenceModel_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferenceLink> getLinks();

} // ReferenceModel
