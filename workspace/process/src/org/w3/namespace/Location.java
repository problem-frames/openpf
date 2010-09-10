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
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.Location#getId <em>Id</em>}</li>
 *   <li>{@link org.w3.namespace.Location#getKey <em>Key</em>}</li>
 *   <li>{@link org.w3.namespace.Location#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link org.w3.namespace.Location#getYPosition <em>YPosition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getLocation()
 * @model extendedMetaData="name='location_._type' kind='empty'"
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3.namespace.NamespacePackage#getLocation_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Location#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.w3.namespace.NamespacePackage#getLocation_Key()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='key'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Location#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPosition</em>' attribute.
	 * @see #setXPosition(String)
	 * @see org.w3.namespace.NamespacePackage#getLocation_XPosition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='x-position'"
	 * @generated
	 */
	String getXPosition();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Location#getXPosition <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPosition</em>' attribute.
	 * @see #getXPosition()
	 * @generated
	 */
	void setXPosition(String value);

	/**
	 * Returns the value of the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YPosition</em>' attribute.
	 * @see #setYPosition(String)
	 * @see org.w3.namespace.NamespacePackage#getLocation_YPosition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='y-position'"
	 * @generated
	 */
	String getYPosition();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Location#getYPosition <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPosition</em>' attribute.
	 * @see #getYPosition()
	 * @generated
	 */
	void setYPosition(String value);

} // Location
