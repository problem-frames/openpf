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
 * A representation of the model object '<em><b>Scope Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.ScopeBinding#getKind <em>Kind</em>}</li>
 *   <li>{@link org.w3.namespace.ScopeBinding#getNameInParent <em>Name In Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getScopeBinding()
 * @model extendedMetaData="name='scope-binding_._type' kind='empty'"
 * @generated
 */
public interface ScopeBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.namespace.Kind1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.w3.namespace.Kind1
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(Kind1)
	 * @see org.w3.namespace.NamespacePackage#getScopeBinding_Kind()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	Kind1 getKind();

	/**
	 * Sets the value of the '{@link org.w3.namespace.ScopeBinding#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.w3.namespace.Kind1
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Kind1 value);

	/**
	 * Unsets the value of the '{@link org.w3.namespace.ScopeBinding#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(Kind1)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link org.w3.namespace.ScopeBinding#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(Kind1)
	 * @generated
	 */
	boolean isSetKind();

	/**
	 * Returns the value of the '<em><b>Name In Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name In Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name In Parent</em>' attribute.
	 * @see #setNameInParent(String)
	 * @see org.w3.namespace.NamespacePackage#getScopeBinding_NameInParent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name-in-parent'"
	 * @generated
	 */
	String getNameInParent();

	/**
	 * Sets the value of the '{@link org.w3.namespace.ScopeBinding#getNameInParent <em>Name In Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name In Parent</em>' attribute.
	 * @see #getNameInParent()
	 * @generated
	 */
	void setNameInParent(String value);

} // ScopeBinding
