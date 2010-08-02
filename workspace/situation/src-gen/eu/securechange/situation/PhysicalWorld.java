/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.situation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.situation.PhysicalWorld#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.situation.SituationPackage#getPhysicalWorld()
 * @model
 * @generated
 */
public interface PhysicalWorld extends EObject
{
  /**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link eu.securechange.situation.Entity}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see eu.securechange.situation.SituationPackage#getPhysicalWorld_Entities()
	 * @model containment="true"
	 * @generated
	 */
  EList<Entity> getEntities();

} // PhysicalWorld
