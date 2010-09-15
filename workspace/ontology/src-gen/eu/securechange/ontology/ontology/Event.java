/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.ontology.ontology.Event#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.ontology.ontology.OntologyPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Thing
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
	 * @see eu.securechange.ontology.ontology.OntologyPackage#getEvent_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link eu.securechange.ontology.ontology.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

} // Event
