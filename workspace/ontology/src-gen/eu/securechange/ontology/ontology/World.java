/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.ontology.ontology.World#getPhysical <em>Physical</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.World#getBelief <em>Belief</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.ontology.ontology.OntologyPackage#getWorld()
 * @model
 * @generated
 */
public interface World extends EObject
{
  /**
   * Returns the value of the '<em><b>Physical</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Physical</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Physical</em>' containment reference.
   * @see #setPhysical(PhysicalWorld)
   * @see eu.securechange.ontology.ontology.OntologyPackage#getWorld_Physical()
   * @model containment="true"
   * @generated
   */
  PhysicalWorld getPhysical();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.ontology.World#getPhysical <em>Physical</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Physical</em>' containment reference.
   * @see #getPhysical()
   * @generated
   */
  void setPhysical(PhysicalWorld value);

  /**
   * Returns the value of the '<em><b>Belief</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Belief</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Belief</em>' containment reference.
   * @see #setBelief(BeliefWorld)
   * @see eu.securechange.ontology.ontology.OntologyPackage#getWorld_Belief()
   * @model containment="true"
   * @generated
   */
  BeliefWorld getBelief();

  /**
   * Sets the value of the '{@link eu.securechange.ontology.ontology.World#getBelief <em>Belief</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Belief</em>' containment reference.
   * @see #getBelief()
   * @generated
   */
  void setBelief(BeliefWorld value);

} // World
