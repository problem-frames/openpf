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
 * A representation of the model object '<em><b>Reaction Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.ReactionConnector#getExternalObject <em>External Object</em>}</li>
 *   <li>{@link org.w3.namespace.ReactionConnector#getParameterName <em>Parameter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getReactionConnector()
 * @model extendedMetaData="name='reaction-connector_._type' kind='elementOnly'"
 * @generated
 */
public interface ReactionConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>External Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Object</em>' containment reference.
	 * @see #setExternalObject(ExternalObject)
	 * @see org.w3.namespace.NamespacePackage#getReactionConnector_ExternalObject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='external-object' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalObject getExternalObject();

	/**
	 * Sets the value of the '{@link org.w3.namespace.ReactionConnector#getExternalObject <em>External Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Object</em>' containment reference.
	 * @see #getExternalObject()
	 * @generated
	 */
	void setExternalObject(ExternalObject value);

	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Name</em>' attribute.
	 * @see #setParameterName(String)
	 * @see org.w3.namespace.NamespacePackage#getReactionConnector_ParameterName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='parameter-name'"
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link org.w3.namespace.ReactionConnector#getParameterName <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Name</em>' attribute.
	 * @see #getParameterName()
	 * @generated
	 */
	void setParameterName(String value);

} // ReactionConnector
