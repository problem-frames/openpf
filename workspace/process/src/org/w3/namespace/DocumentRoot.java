/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getAborter <em>Aborter</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getChannelBinding <em>Channel Binding</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getConstantBinding <em>Constant Binding</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getControlParameter <em>Control Parameter</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getExport <em>Export</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getExternalObject <em>External Object</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getField <em>Field</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getHandlerConnector <em>Handler Connector</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getImport <em>Import</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getInterfaceDecl <em>Interface Decl</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getLittlejil <em>Littlejil</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getLocation <em>Location</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getModule <em>Module</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getNullAggregate <em>Null Aggregate</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getPostIt <em>Post It</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getPredicateExpression <em>Predicate Expression</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getReactionConnector <em>Reaction Connector</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getRequisiteConnector <em>Requisite Connector</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getScopeBinding <em>Scope Binding</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getSimpleRequisiteConnector <em>Simple Requisite Connector</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getStepDeclaration <em>Step Declaration</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getStepReference <em>Step Reference</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getSubstepConnector <em>Substep Connector</em>}</li>
 *   <li>{@link org.w3.namespace.DocumentRoot#getTaggedLocation <em>Tagged Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Aborter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aborter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aborter</em>' containment reference.
	 * @see #setAborter(Aborter)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_Aborter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aborter' namespace='##targetNamespace'"
	 * @generated
	 */
	Aborter getAborter();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getAborter <em>Aborter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aborter</em>' containment reference.
	 * @see #getAborter()
	 * @generated
	 */
	void setAborter(Aborter value);

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' containment reference.
	 * @see #setAggregate(Aggregate)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_Aggregate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aggregate' namespace='##targetNamespace'"
	 * @generated
	 */
	Aggregate getAggregate();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getAggregate <em>Aggregate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' containment reference.
	 * @see #getAggregate()
	 * @generated
	 */
	void setAggregate(Aggregate value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_Annotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(Binding)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_Binding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binding' namespace='##targetNamespace'"
	 * @generated
	 */
	Binding getBinding();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(Binding value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_Cardinality()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cardinality' namespace='##targetNamespace'"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Channel Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Binding</em>' containment reference.
	 * @see #setChannelBinding(ChannelBinding)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_ChannelBinding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='channel-binding' namespace='##targetNamespace'"
	 * @generated
	 */
	ChannelBinding getChannelBinding();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getChannelBinding <em>Channel Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Binding</em>' containment reference.
	 * @see #getChannelBinding()
	 * @generated
	 */
	void setChannelBinding(ChannelBinding value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference.
	 * @see #setConnector(Connector)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_Connector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connector' namespace='##targetNamespace'"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getConnector <em>Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' containment reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>Constant Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Binding</em>' containment reference.
	 * @see #setConstantBinding(ConstantBinding)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_ConstantBinding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='constant-binding' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstantBinding getConstantBinding();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getConstantBinding <em>Constant Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Binding</em>' containment reference.
	 * @see #getConstantBinding()
	 * @generated
	 */
	void setConstantBinding(ConstantBinding value);

	/**
	 * Returns the value of the '<em><b>Control Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Parameter</em>' containment reference.
	 * @see #setControlParameter(ControlParameter)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_ControlParameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='control-parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlParameter getControlParameter();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getControlParameter <em>Control Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameter</em>' containment reference.
	 * @see #getControlParameter()
	 * @generated
	 */
	void setControlParameter(ControlParameter value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' containment reference.
	 * @see #setDiagram(Diagram)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_Diagram()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='diagram' namespace='##targetNamespace'"
	 * @generated
	 */
	Diagram getDiagram();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getDiagram <em>Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' containment reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(Diagram value);

	/**
	 * Returns the value of the '<em><b>Export</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export</em>' containment reference.
	 * @see #setExport(Export)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_Export()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='export' namespace='##targetNamespace'"
	 * @generated
	 */
	Export getExport();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getExport <em>Export</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export</em>' containment reference.
	 * @see #getExport()
	 * @generated
	 */
	void setExport(Export value);

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
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_ExternalObject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='external-object' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalObject getExternalObject();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getExternalObject <em>External Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Object</em>' containment reference.
	 * @see #getExternalObject()
	 * @generated
	 */
	void setExternalObject(ExternalObject value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference.
	 * @see #setField(Field)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_Field()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='field' namespace='##targetNamespace'"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getField <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' containment reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

	/**
	 * Returns the value of the '<em><b>Handler Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler Connector</em>' containment reference.
	 * @see #setHandlerConnector(HandlerConnector)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_HandlerConnector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='handler-connector' namespace='##targetNamespace'"
	 * @generated
	 */
	HandlerConnector getHandlerConnector();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getHandlerConnector <em>Handler Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Connector</em>' containment reference.
	 * @see #getHandlerConnector()
	 * @generated
	 */
	void setHandlerConnector(HandlerConnector value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference.
	 * @see #setImport(Import)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_Import()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace'"
	 * @generated
	 */
	Import getImport();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getImport <em>Import</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' containment reference.
	 * @see #getImport()
	 * @generated
	 */
	void setImport(Import value);

	/**
	 * Returns the value of the '<em><b>Interface Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Decl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Decl</em>' containment reference.
	 * @see #setInterfaceDecl(InterfaceDecl)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_InterfaceDecl()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interface-decl' namespace='##targetNamespace'"
	 * @generated
	 */
	InterfaceDecl getInterfaceDecl();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getInterfaceDecl <em>Interface Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Decl</em>' containment reference.
	 * @see #getInterfaceDecl()
	 * @generated
	 */
	void setInterfaceDecl(InterfaceDecl value);

	/**
	 * Returns the value of the '<em><b>Littlejil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Littlejil</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Littlejil</em>' containment reference.
	 * @see #setLittlejil(Littlejil)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_Littlejil()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='littlejil' namespace='##targetNamespace'"
	 * @generated
	 */
	Littlejil getLittlejil();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getLittlejil <em>Littlejil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Littlejil</em>' containment reference.
	 * @see #getLittlejil()
	 * @generated
	 */
	void setLittlejil(Littlejil value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_Location()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_Metadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference.
	 * @see #setModule(Module)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_Module()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='module' namespace='##targetNamespace'"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getModule <em>Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' containment reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

	/**
	 * Returns the value of the '<em><b>Null Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Aggregate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Aggregate</em>' containment reference.
	 * @see #setNullAggregate(NullAggregate)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_NullAggregate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='null-aggregate' namespace='##targetNamespace'"
	 * @generated
	 */
	NullAggregate getNullAggregate();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getNullAggregate <em>Null Aggregate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Aggregate</em>' containment reference.
	 * @see #getNullAggregate()
	 * @generated
	 */
	void setNullAggregate(NullAggregate value);

	/**
	 * Returns the value of the '<em><b>Post It</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post It</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post It</em>' containment reference.
	 * @see #setPostIt(PostIt)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_PostIt()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='post-it' namespace='##targetNamespace'"
	 * @generated
	 */
	PostIt getPostIt();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getPostIt <em>Post It</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post It</em>' containment reference.
	 * @see #getPostIt()
	 * @generated
	 */
	void setPostIt(PostIt value);

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
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_PredicateExpression()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='predicate-expression' namespace='##targetNamespace'"
	 * @generated
	 */
	PredicateExpression getPredicateExpression();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getPredicateExpression <em>Predicate Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate Expression</em>' containment reference.
	 * @see #getPredicateExpression()
	 * @generated
	 */
	void setPredicateExpression(PredicateExpression value);

	/**
	 * Returns the value of the '<em><b>Reaction Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reaction Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reaction Connector</em>' containment reference.
	 * @see #setReactionConnector(ReactionConnector)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_ReactionConnector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reaction-connector' namespace='##targetNamespace'"
	 * @generated
	 */
	ReactionConnector getReactionConnector();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getReactionConnector <em>Reaction Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reaction Connector</em>' containment reference.
	 * @see #getReactionConnector()
	 * @generated
	 */
	void setReactionConnector(ReactionConnector value);

	/**
	 * Returns the value of the '<em><b>Requisite Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requisite Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requisite Connector</em>' containment reference.
	 * @see #setRequisiteConnector(RequisiteConnector)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_RequisiteConnector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='requisite-connector' namespace='##targetNamespace'"
	 * @generated
	 */
	RequisiteConnector getRequisiteConnector();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getRequisiteConnector <em>Requisite Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requisite Connector</em>' containment reference.
	 * @see #getRequisiteConnector()
	 * @generated
	 */
	void setRequisiteConnector(RequisiteConnector value);

	/**
	 * Returns the value of the '<em><b>Scope Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Binding</em>' containment reference.
	 * @see #setScopeBinding(ScopeBinding)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_ScopeBinding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scope-binding' namespace='##targetNamespace'"
	 * @generated
	 */
	ScopeBinding getScopeBinding();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getScopeBinding <em>Scope Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Binding</em>' containment reference.
	 * @see #getScopeBinding()
	 * @generated
	 */
	void setScopeBinding(ScopeBinding value);

	/**
	 * Returns the value of the '<em><b>Simple Requisite Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Requisite Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Requisite Connector</em>' containment reference.
	 * @see #setSimpleRequisiteConnector(SimpleRequisiteConnector)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_SimpleRequisiteConnector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simple-requisite-connector' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleRequisiteConnector getSimpleRequisiteConnector();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getSimpleRequisiteConnector <em>Simple Requisite Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Requisite Connector</em>' containment reference.
	 * @see #getSimpleRequisiteConnector()
	 * @generated
	 */
	void setSimpleRequisiteConnector(SimpleRequisiteConnector value);

	/**
	 * Returns the value of the '<em><b>Step Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Declaration</em>' containment reference.
	 * @see #setStepDeclaration(StepDeclaration)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_StepDeclaration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='step-declaration' namespace='##targetNamespace'"
	 * @generated
	 */
	StepDeclaration getStepDeclaration();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getStepDeclaration <em>Step Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Declaration</em>' containment reference.
	 * @see #getStepDeclaration()
	 * @generated
	 */
	void setStepDeclaration(StepDeclaration value);

	/**
	 * Returns the value of the '<em><b>Step Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Reference</em>' containment reference.
	 * @see #setStepReference(StepReference)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_StepReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='step-reference' namespace='##targetNamespace'"
	 * @generated
	 */
	StepReference getStepReference();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getStepReference <em>Step Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Reference</em>' containment reference.
	 * @see #getStepReference()
	 * @generated
	 */
	void setStepReference(StepReference value);

	/**
	 * Returns the value of the '<em><b>Substep Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substep Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substep Connector</em>' containment reference.
	 * @see #setSubstepConnector(SubstepConnector)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_SubstepConnector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='substep-connector' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstepConnector getSubstepConnector();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getSubstepConnector <em>Substep Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substep Connector</em>' containment reference.
	 * @see #getSubstepConnector()
	 * @generated
	 */
	void setSubstepConnector(SubstepConnector value);

	/**
	 * Returns the value of the '<em><b>Tagged Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Location</em>' containment reference.
	 * @see #setTaggedLocation(TaggedLocation)
	 * @see org.w3.namespace.NamespacePackage#getDocumentRoot_TaggedLocation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tagged-location' namespace='##targetNamespace'"
	 * @generated
	 */
	TaggedLocation getTaggedLocation();

	/**
	 * Sets the value of the '{@link org.w3.namespace.DocumentRoot#getTaggedLocation <em>Tagged Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tagged Location</em>' containment reference.
	 * @see #getTaggedLocation()
	 * @generated
	 */
	void setTaggedLocation(TaggedLocation value);

} // DocumentRoot
