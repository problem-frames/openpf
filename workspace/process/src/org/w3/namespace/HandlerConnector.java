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
 * A representation of the model object '<em><b>Handler Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.HandlerConnector#getExternalObject <em>External Object</em>}</li>
 *   <li>{@link org.w3.namespace.HandlerConnector#getContinuationAction <em>Continuation Action</em>}</li>
 *   <li>{@link org.w3.namespace.HandlerConnector#getParameterName <em>Parameter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getHandlerConnector()
 * @model extendedMetaData="name='handler-connector_._type' kind='elementOnly'"
 * @generated
 */
public interface HandlerConnector extends EObject {
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
	 * @see org.w3.namespace.NamespacePackage#getHandlerConnector_ExternalObject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='external-object' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalObject getExternalObject();

	/**
	 * Sets the value of the '{@link org.w3.namespace.HandlerConnector#getExternalObject <em>External Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Object</em>' containment reference.
	 * @see #getExternalObject()
	 * @generated
	 */
	void setExternalObject(ExternalObject value);

	/**
	 * Returns the value of the '<em><b>Continuation Action</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.namespace.ContinuationAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continuation Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuation Action</em>' attribute.
	 * @see org.w3.namespace.ContinuationAction
	 * @see #isSetContinuationAction()
	 * @see #unsetContinuationAction()
	 * @see #setContinuationAction(ContinuationAction)
	 * @see org.w3.namespace.NamespacePackage#getHandlerConnector_ContinuationAction()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='continuation-action'"
	 * @generated
	 */
	ContinuationAction getContinuationAction();

	/**
	 * Sets the value of the '{@link org.w3.namespace.HandlerConnector#getContinuationAction <em>Continuation Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuation Action</em>' attribute.
	 * @see org.w3.namespace.ContinuationAction
	 * @see #isSetContinuationAction()
	 * @see #unsetContinuationAction()
	 * @see #getContinuationAction()
	 * @generated
	 */
	void setContinuationAction(ContinuationAction value);

	/**
	 * Unsets the value of the '{@link org.w3.namespace.HandlerConnector#getContinuationAction <em>Continuation Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContinuationAction()
	 * @see #getContinuationAction()
	 * @see #setContinuationAction(ContinuationAction)
	 * @generated
	 */
	void unsetContinuationAction();

	/**
	 * Returns whether the value of the '{@link org.w3.namespace.HandlerConnector#getContinuationAction <em>Continuation Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Continuation Action</em>' attribute is set.
	 * @see #unsetContinuationAction()
	 * @see #getContinuationAction()
	 * @see #setContinuationAction(ContinuationAction)
	 * @generated
	 */
	boolean isSetContinuationAction();

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
	 * @see org.w3.namespace.NamespacePackage#getHandlerConnector_ParameterName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='parameter-name'"
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link org.w3.namespace.HandlerConnector#getParameterName <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Name</em>' attribute.
	 * @see #getParameterName()
	 * @generated
	 */
	void setParameterName(String value);

} // HandlerConnector
