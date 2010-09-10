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
 * A representation of the model object '<em><b>Interface Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.InterfaceDecl#getExternalObject <em>External Object</em>}</li>
 *   <li>{@link org.w3.namespace.InterfaceDecl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3.namespace.InterfaceDecl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.w3.namespace.InterfaceDecl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getInterfaceDecl()
 * @model extendedMetaData="name='interface-decl_._type' kind='elementOnly'"
 * @generated
 */
public interface InterfaceDecl extends EObject {
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
	 * @see org.w3.namespace.NamespacePackage#getInterfaceDecl_ExternalObject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='external-object' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalObject getExternalObject();

	/**
	 * Sets the value of the '{@link org.w3.namespace.InterfaceDecl#getExternalObject <em>External Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Object</em>' containment reference.
	 * @see #getExternalObject()
	 * @generated
	 */
	void setExternalObject(ExternalObject value);

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
	 * @see org.w3.namespace.NamespacePackage#getInterfaceDecl_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3.namespace.InterfaceDecl#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.namespace.Kind2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.w3.namespace.Kind2
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(Kind2)
	 * @see org.w3.namespace.NamespacePackage#getInterfaceDecl_Kind()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	Kind2 getKind();

	/**
	 * Sets the value of the '{@link org.w3.namespace.InterfaceDecl#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.w3.namespace.Kind2
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Kind2 value);

	/**
	 * Unsets the value of the '{@link org.w3.namespace.InterfaceDecl#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(Kind2)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link org.w3.namespace.InterfaceDecl#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(Kind2)
	 * @generated
	 */
	boolean isSetKind();

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
	 * @see org.w3.namespace.NamespacePackage#getInterfaceDecl_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.w3.namespace.InterfaceDecl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // InterfaceDecl
