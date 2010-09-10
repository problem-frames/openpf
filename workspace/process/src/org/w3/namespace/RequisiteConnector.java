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
 * A representation of the model object '<em><b>Requisite Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.RequisiteConnector#getPreOrPost <em>Pre Or Post</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getRequisiteConnector()
 * @model extendedMetaData="name='requisite-connector_._type' kind='empty'"
 * @generated
 */
public interface RequisiteConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Pre Or Post</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.namespace.PreOrPost1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Or Post</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Or Post</em>' attribute.
	 * @see org.w3.namespace.PreOrPost1
	 * @see #isSetPreOrPost()
	 * @see #unsetPreOrPost()
	 * @see #setPreOrPost(PreOrPost1)
	 * @see org.w3.namespace.NamespacePackage#getRequisiteConnector_PreOrPost()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='pre-or-post'"
	 * @generated
	 */
	PreOrPost1 getPreOrPost();

	/**
	 * Sets the value of the '{@link org.w3.namespace.RequisiteConnector#getPreOrPost <em>Pre Or Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Or Post</em>' attribute.
	 * @see org.w3.namespace.PreOrPost1
	 * @see #isSetPreOrPost()
	 * @see #unsetPreOrPost()
	 * @see #getPreOrPost()
	 * @generated
	 */
	void setPreOrPost(PreOrPost1 value);

	/**
	 * Unsets the value of the '{@link org.w3.namespace.RequisiteConnector#getPreOrPost <em>Pre Or Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreOrPost()
	 * @see #getPreOrPost()
	 * @see #setPreOrPost(PreOrPost1)
	 * @generated
	 */
	void unsetPreOrPost();

	/**
	 * Returns whether the value of the '{@link org.w3.namespace.RequisiteConnector#getPreOrPost <em>Pre Or Post</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pre Or Post</em>' attribute is set.
	 * @see #unsetPreOrPost()
	 * @see #getPreOrPost()
	 * @see #setPreOrPost(PreOrPost1)
	 * @generated
	 */
	boolean isSetPreOrPost();

} // RequisiteConnector
