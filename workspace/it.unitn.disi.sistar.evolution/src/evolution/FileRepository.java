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
 * A representation of the model object '<em><b>File Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link evolution.FileRepository#getFiles <em>Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see evolution.EvolutionPackage#getFileRepository()
 * @model
 * @generated
 */
public interface FileRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link evolution.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see evolution.EvolutionPackage#getFileRepository_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

} // FileRepository
