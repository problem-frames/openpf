/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.StepDeclaration#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3.namespace.StepDeclaration#getInterfaceDecl <em>Interface Decl</em>}</li>
 *   <li>{@link org.w3.namespace.StepDeclaration#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.w3.namespace.StepDeclaration#getAborter <em>Aborter</em>}</li>
 *   <li>{@link org.w3.namespace.StepDeclaration#getId <em>Id</em>}</li>
 *   <li>{@link org.w3.namespace.StepDeclaration#getKind <em>Kind</em>}</li>
 *   <li>{@link org.w3.namespace.StepDeclaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getStepDeclaration()
 * @model extendedMetaData="name='step-declaration_._type' kind='elementOnly'"
 * @generated
 */
public interface StepDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3.namespace.NamespacePackage#getStepDeclaration_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Interface Decl</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.namespace.InterfaceDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Decl</em>' containment reference list.
	 * @see org.w3.namespace.NamespacePackage#getStepDeclaration_InterfaceDecl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interface-decl' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<InterfaceDecl> getInterfaceDecl();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.namespace.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see org.w3.namespace.NamespacePackage#getStepDeclaration_Connector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connector' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Connector> getConnector();

	/**
	 * Returns the value of the '<em><b>Aborter</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.namespace.Aborter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aborter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aborter</em>' containment reference list.
	 * @see org.w3.namespace.NamespacePackage#getStepDeclaration_Aborter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aborter' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Aborter> getAborter();

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
	 * @see org.w3.namespace.NamespacePackage#getStepDeclaration_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3.namespace.StepDeclaration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.namespace.Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.w3.namespace.Kind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(Kind)
	 * @see org.w3.namespace.NamespacePackage#getStepDeclaration_Kind()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	Kind getKind();

	/**
	 * Sets the value of the '{@link org.w3.namespace.StepDeclaration#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.w3.namespace.Kind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Kind value);

	/**
	 * Unsets the value of the '{@link org.w3.namespace.StepDeclaration#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(Kind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link org.w3.namespace.StepDeclaration#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(Kind)
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
	 * @see org.w3.namespace.NamespacePackage#getStepDeclaration_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.w3.namespace.StepDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // StepDeclaration
