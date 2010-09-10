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
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.Module#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3.namespace.Module#getImport <em>Import</em>}</li>
 *   <li>{@link org.w3.namespace.Module#getExport <em>Export</em>}</li>
 *   <li>{@link org.w3.namespace.Module#getStepDeclaration <em>Step Declaration</em>}</li>
 *   <li>{@link org.w3.namespace.Module#getStepReference <em>Step Reference</em>}</li>
 *   <li>{@link org.w3.namespace.Module#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getModule()
 * @model extendedMetaData="name='module_._type' kind='elementOnly'"
 * @generated
 */
public interface Module extends EObject {
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
	 * @see org.w3.namespace.NamespacePackage#getModule_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.namespace.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference list.
	 * @see org.w3.namespace.NamespacePackage#getModule_Import()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Import> getImport();

	/**
	 * Returns the value of the '<em><b>Export</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.namespace.Export}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export</em>' containment reference list.
	 * @see org.w3.namespace.NamespacePackage#getModule_Export()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='export' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Export> getExport();

	/**
	 * Returns the value of the '<em><b>Step Declaration</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.namespace.StepDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Declaration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Declaration</em>' containment reference list.
	 * @see org.w3.namespace.NamespacePackage#getModule_StepDeclaration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='step-declaration' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<StepDeclaration> getStepDeclaration();

	/**
	 * Returns the value of the '<em><b>Step Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.namespace.StepReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Reference</em>' containment reference list.
	 * @see org.w3.namespace.NamespacePackage#getModule_StepReference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='step-reference' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<StepReference> getStepReference();

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
	 * @see org.w3.namespace.NamespacePackage#getModule_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Module#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Module
