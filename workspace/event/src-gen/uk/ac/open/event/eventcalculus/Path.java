/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.Path#getFiles <em>Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getPath()
 * @model
 * @generated
 */
public interface Path extends EObject
{
  /**
   * Returns the value of the '<em><b>Files</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.event.eventcalculus.File}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Files</em>' containment reference list.
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getPath_Files()
   * @model containment="true"
   * @generated
   */
  EList<File> getFiles();

} // Path
