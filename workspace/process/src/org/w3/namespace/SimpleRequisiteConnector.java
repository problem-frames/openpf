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
 * A representation of the model object '<em><b>Simple Requisite Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.SimpleRequisiteConnector#getPredicateExpression <em>Predicate Expression</em>}</li>
 *   <li>{@link org.w3.namespace.SimpleRequisiteConnector#getExternalObject <em>External Object</em>}</li>
 *   <li>{@link org.w3.namespace.SimpleRequisiteConnector#getPreOrPost <em>Pre Or Post</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getSimpleRequisiteConnector()
 * @model extendedMetaData="name='simple-requisite-connector_._type' kind='elementOnly'"
 * @generated
 */
public interface SimpleRequisiteConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Predicate Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate Expression</em>' containment reference.
	 * @see #setPredicateExpression(PredicateExpression)
	 * @see org.w3.namespace.NamespacePackage#getSimpleRequisiteConnector_PredicateExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='predicate-expression' namespace='##targetNamespace'"
	 * @generated
	 */
	PredicateExpression getPredicateExpression();

	/**
	 * Sets the value of the '{@link org.w3.namespace.SimpleRequisiteConnector#getPredicateExpression <em>Predicate Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate Expression</em>' containment reference.
	 * @see #getPredicateExpression()
	 * @generated
	 */
	void setPredicateExpression(PredicateExpression value);

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
	 * @see org.w3.namespace.NamespacePackage#getSimpleRequisiteConnector_ExternalObject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='external-object' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalObject getExternalObject();

	/**
	 * Sets the value of the '{@link org.w3.namespace.SimpleRequisiteConnector#getExternalObject <em>External Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Object</em>' containment reference.
	 * @see #getExternalObject()
	 * @generated
	 */
	void setExternalObject(ExternalObject value);

	/**
	 * Returns the value of the '<em><b>Pre Or Post</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.namespace.PreOrPost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Or Post</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Or Post</em>' attribute.
	 * @see org.w3.namespace.PreOrPost
	 * @see #isSetPreOrPost()
	 * @see #unsetPreOrPost()
	 * @see #setPreOrPost(PreOrPost)
	 * @see org.w3.namespace.NamespacePackage#getSimpleRequisiteConnector_PreOrPost()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='pre-or-post'"
	 * @generated
	 */
	PreOrPost getPreOrPost();

	/**
	 * Sets the value of the '{@link org.w3.namespace.SimpleRequisiteConnector#getPreOrPost <em>Pre Or Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Or Post</em>' attribute.
	 * @see org.w3.namespace.PreOrPost
	 * @see #isSetPreOrPost()
	 * @see #unsetPreOrPost()
	 * @see #getPreOrPost()
	 * @generated
	 */
	void setPreOrPost(PreOrPost value);

	/**
	 * Unsets the value of the '{@link org.w3.namespace.SimpleRequisiteConnector#getPreOrPost <em>Pre Or Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreOrPost()
	 * @see #getPreOrPost()
	 * @see #setPreOrPost(PreOrPost)
	 * @generated
	 */
	void unsetPreOrPost();

	/**
	 * Returns whether the value of the '{@link org.w3.namespace.SimpleRequisiteConnector#getPreOrPost <em>Pre Or Post</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pre Or Post</em>' attribute is set.
	 * @see #unsetPreOrPost()
	 * @see #getPreOrPost()
	 * @see #setPreOrPost(PreOrPost)
	 * @generated
	 */
	boolean isSetPreOrPost();

} // SimpleRequisiteConnector
