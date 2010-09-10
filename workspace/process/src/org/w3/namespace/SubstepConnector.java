/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substep Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.SubstepConnector#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getSubstepConnector()
 * @model extendedMetaData="name='substep-connector_._type' kind='elementOnly'"
 * @generated
 */
public interface SubstepConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see org.w3.namespace.NamespacePackage#getSubstepConnector_Cardinality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cardinality' namespace='##targetNamespace'"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.w3.namespace.SubstepConnector#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

} // SubstepConnector
