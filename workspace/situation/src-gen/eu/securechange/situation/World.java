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
 * A representation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.situation.World#getEntities <em>Entities</em>}</li>
 *   <li>{@link eu.securechange.situation.World#getDomains <em>Domains</em>}</li>
 *   <li>{@link eu.securechange.situation.World#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.situation.SituationPackage#getWorld()
 * @model
 * @generated
 */
public interface World extends EObject
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
	 * @see eu.securechange.situation.SituationPackage#getWorld_Entities()
	 * @model containment="true"
	 * @generated
	 */
  EList<Entity> getEntities();

  /**
	 * Returns the value of the '<em><b>Domains</b></em>' containment reference list.
	 * The list contents are of type {@link eu.securechange.situation.Domain}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domains</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Domains</em>' containment reference list.
	 * @see eu.securechange.situation.SituationPackage#getWorld_Domains()
	 * @model containment="true"
	 * @generated
	 */
  EList<Domain> getDomains();

  /**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link eu.securechange.situation.Relationship}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see eu.securechange.situation.SituationPackage#getWorld_Relationships()
	 * @model containment="true"
	 * @generated
	 */
  EList<Relationship> getRelationships();

} // World
