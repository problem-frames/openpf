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
 * A representation of the model object '<em><b>Channel Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.ChannelBinding#getChannelName <em>Channel Name</em>}</li>
 *   <li>{@link org.w3.namespace.ChannelBinding#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getChannelBinding()
 * @model extendedMetaData="name='channel-binding_._type' kind='empty'"
 * @generated
 */
public interface ChannelBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Channel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Name</em>' attribute.
	 * @see #setChannelName(String)
	 * @see org.w3.namespace.NamespacePackage#getChannelBinding_ChannelName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='channel-name'"
	 * @generated
	 */
	String getChannelName();

	/**
	 * Sets the value of the '{@link org.w3.namespace.ChannelBinding#getChannelName <em>Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Name</em>' attribute.
	 * @see #getChannelName()
	 * @generated
	 */
	void setChannelName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.namespace.Kind3}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.w3.namespace.Kind3
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(Kind3)
	 * @see org.w3.namespace.NamespacePackage#getChannelBinding_Kind()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	Kind3 getKind();

	/**
	 * Sets the value of the '{@link org.w3.namespace.ChannelBinding#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.w3.namespace.Kind3
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Kind3 value);

	/**
	 * Unsets the value of the '{@link org.w3.namespace.ChannelBinding#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(Kind3)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link org.w3.namespace.ChannelBinding#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(Kind3)
	 * @generated
	 */
	boolean isSetKind();

} // ChannelBinding
