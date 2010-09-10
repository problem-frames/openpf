/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.w3.namespace.NamespaceFactory
 * @model kind="package"
 * @generated
 */
public interface NamespacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "namespace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/namespace/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "namespace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NamespacePackage eINSTANCE = org.w3.namespace.impl.NamespacePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.AborterImpl <em>Aborter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.AborterImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getAborter()
	 * @generated
	 */
	int ABORTER = 0;

	/**
	 * The feature id for the '<em><b>External Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORTER__EXTERNAL_OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Aborter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORTER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.AggregateImpl <em>Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.AggregateImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getAggregate()
	 * @generated
	 */
	int AGGREGATE = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__FIELD = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.AnnotationImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>External Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__EXTERNAL_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__KEY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.BindingImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 3;

	/**
	 * The feature id for the '<em><b>Scope Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SCOPE_BINDING = 0;

	/**
	 * The feature id for the '<em><b>Channel Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__CHANNEL_BINDING = 1;

	/**
	 * The feature id for the '<em><b>Constant Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__CONSTANT_BINDING = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__ID = 3;

	/**
	 * The feature id for the '<em><b>Name In Child</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__NAME_IN_CHILD = 4;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.CardinalityImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 4;

	/**
	 * The feature id for the '<em><b>Control Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__CONTROL_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Predicate Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__PREDICATE_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__ID = 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__LOWER_BOUND = 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__UPPER_BOUND = 4;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.ChannelBindingImpl <em>Channel Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.ChannelBindingImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getChannelBinding()
	 * @generated
	 */
	int CHANNEL_BINDING = 5;

	/**
	 * The feature id for the '<em><b>Channel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BINDING__CHANNEL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BINDING__KIND = 1;

	/**
	 * The number of structural features of the '<em>Channel Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_BINDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.ConnectorImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 6;

	/**
	 * The feature id for the '<em><b>Requisite Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__REQUISITE_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Simple Requisite Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SIMPLE_REQUISITE_CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Substep Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SUBSTEP_CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Reaction Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__REACTION_CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Handler Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__HANDLER_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BINDING = 5;

	/**
	 * The feature id for the '<em><b>Step Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__STEP_DECLARATION = 6;

	/**
	 * The feature id for the '<em><b>Step Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__STEP_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ID = 8;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.ConstantBindingImpl <em>Constant Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.ConstantBindingImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getConstantBinding()
	 * @generated
	 */
	int CONSTANT_BINDING = 7;

	/**
	 * The feature id for the '<em><b>External Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_BINDING__EXTERNAL_OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Constant Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_BINDING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.ControlParameterImpl <em>Control Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.ControlParameterImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getControlParameter()
	 * @generated
	 */
	int CONTROL_PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PARAMETER__PARAMETER_NAME = 0;

	/**
	 * The number of structural features of the '<em>Control Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.DiagramImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 9;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Post It</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__POST_IT = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Tagged Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__TAGGED_LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = 5;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.DocumentRootImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 10;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Aborter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABORTER = 3;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AGGREGATE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINDING = 6;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CARDINALITY = 7;

	/**
	 * The feature id for the '<em><b>Channel Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANNEL_BINDING = 8;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONNECTOR = 9;

	/**
	 * The feature id for the '<em><b>Constant Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONSTANT_BINDING = 10;

	/**
	 * The feature id for the '<em><b>Control Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTROL_PARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIAGRAM = 12;

	/**
	 * The feature id for the '<em><b>Export</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPORT = 13;

	/**
	 * The feature id for the '<em><b>External Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTERNAL_OBJECT = 14;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIELD = 15;

	/**
	 * The feature id for the '<em><b>Handler Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDLER_CONNECTOR = 16;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPORT = 17;

	/**
	 * The feature id for the '<em><b>Interface Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERFACE_DECL = 18;

	/**
	 * The feature id for the '<em><b>Littlejil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LITTLEJIL = 19;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION = 20;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METADATA = 21;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODULE = 22;

	/**
	 * The feature id for the '<em><b>Null Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NULL_AGGREGATE = 23;

	/**
	 * The feature id for the '<em><b>Post It</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POST_IT = 24;

	/**
	 * The feature id for the '<em><b>Predicate Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREDICATE_EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Reaction Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REACTION_CONNECTOR = 26;

	/**
	 * The feature id for the '<em><b>Requisite Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUISITE_CONNECTOR = 27;

	/**
	 * The feature id for the '<em><b>Scope Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCOPE_BINDING = 28;

	/**
	 * The feature id for the '<em><b>Simple Requisite Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIMPLE_REQUISITE_CONNECTOR = 29;

	/**
	 * The feature id for the '<em><b>Step Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STEP_DECLARATION = 30;

	/**
	 * The feature id for the '<em><b>Step Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STEP_REFERENCE = 31;

	/**
	 * The feature id for the '<em><b>Substep Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBSTEP_CONNECTOR = 32;

	/**
	 * The feature id for the '<em><b>Tagged Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAGGED_LOCATION = 33;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 34;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.ExportImpl <em>Export</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.ExportImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getExport()
	 * @generated
	 */
	int EXPORT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__ID = 0;

	/**
	 * The feature id for the '<em><b>Step Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__STEP_NAME = 1;

	/**
	 * The number of structural features of the '<em>Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.ExternalObjectImpl <em>External Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.ExternalObjectImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getExternalObject()
	 * @generated
	 */
	int EXTERNAL_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBJECT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBJECT__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBJECT__AGGREGATE = 2;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBJECT__ENCODING = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBJECT__ID = 4;

	/**
	 * The number of structural features of the '<em>External Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBJECT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.FieldImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getField()
	 * @generated
	 */
	int FIELD = 13;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__AGGREGATE = 2;

	/**
	 * The feature id for the '<em><b>Null Aggregate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NULL_AGGREGATE = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__KIND = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 5;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.HandlerConnectorImpl <em>Handler Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.HandlerConnectorImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getHandlerConnector()
	 * @generated
	 */
	int HANDLER_CONNECTOR = 14;

	/**
	 * The feature id for the '<em><b>External Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_CONNECTOR__EXTERNAL_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Continuation Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_CONNECTOR__CONTINUATION_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_CONNECTOR__PARAMETER_NAME = 2;

	/**
	 * The number of structural features of the '<em>Handler Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_CONNECTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.ImportImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ID = 0;

	/**
	 * The feature id for the '<em><b>Step Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__STEP_NAME = 1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.InterfaceDeclImpl <em>Interface Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.InterfaceDeclImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getInterfaceDecl()
	 * @generated
	 */
	int INTERFACE_DECL = 16;

	/**
	 * The feature id for the '<em><b>External Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECL__EXTERNAL_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECL__ID = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECL__KIND = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECL__NAME = 3;

	/**
	 * The number of structural features of the '<em>Interface Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.LittlejilImpl <em>Littlejil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.LittlejilImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getLittlejil()
	 * @generated
	 */
	int LITTLEJIL = 17;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITTLEJIL__MODULE = 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITTLEJIL__METADATA = 1;

	/**
	 * The number of structural features of the '<em>Littlejil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITTLEJIL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.LocationImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__KEY = 1;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__XPOSITION = 2;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__YPOSITION = 3;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.MetadataImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 19;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__DIAGRAM = 2;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.ModuleImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 20;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Export</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__EXPORT = 2;

	/**
	 * The feature id for the '<em><b>Step Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__STEP_DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Step Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__STEP_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ID = 5;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.NullAggregateImpl <em>Null Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.NullAggregateImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getNullAggregate()
	 * @generated
	 */
	int NULL_AGGREGATE = 21;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_AGGREGATE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Null Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_AGGREGATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.PostItImpl <em>Post It</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.PostItImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getPostIt()
	 * @generated
	 */
	int POST_IT = 22;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_IT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_IT__ID = 1;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_IT__XPOSITION = 2;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_IT__YPOSITION = 3;

	/**
	 * The number of structural features of the '<em>Post It</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_IT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.PredicateExpressionImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getPredicateExpression()
	 * @generated
	 */
	int PREDICATE_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPRESSION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Predicate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.ReactionConnectorImpl <em>Reaction Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.ReactionConnectorImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getReactionConnector()
	 * @generated
	 */
	int REACTION_CONNECTOR = 24;

	/**
	 * The feature id for the '<em><b>External Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONNECTOR__EXTERNAL_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONNECTOR__PARAMETER_NAME = 1;

	/**
	 * The number of structural features of the '<em>Reaction Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.RequisiteConnectorImpl <em>Requisite Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.RequisiteConnectorImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getRequisiteConnector()
	 * @generated
	 */
	int REQUISITE_CONNECTOR = 25;

	/**
	 * The feature id for the '<em><b>Pre Or Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUISITE_CONNECTOR__PRE_OR_POST = 0;

	/**
	 * The number of structural features of the '<em>Requisite Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUISITE_CONNECTOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.ScopeBindingImpl <em>Scope Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.ScopeBindingImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getScopeBinding()
	 * @generated
	 */
	int SCOPE_BINDING = 26;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_BINDING__KIND = 0;

	/**
	 * The feature id for the '<em><b>Name In Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_BINDING__NAME_IN_PARENT = 1;

	/**
	 * The number of structural features of the '<em>Scope Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_BINDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.SimpleRequisiteConnectorImpl <em>Simple Requisite Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.SimpleRequisiteConnectorImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getSimpleRequisiteConnector()
	 * @generated
	 */
	int SIMPLE_REQUISITE_CONNECTOR = 27;

	/**
	 * The feature id for the '<em><b>Predicate Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REQUISITE_CONNECTOR__PREDICATE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>External Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REQUISITE_CONNECTOR__EXTERNAL_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Pre Or Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REQUISITE_CONNECTOR__PRE_OR_POST = 2;

	/**
	 * The number of structural features of the '<em>Simple Requisite Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REQUISITE_CONNECTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.StepDeclarationImpl <em>Step Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.StepDeclarationImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getStepDeclaration()
	 * @generated
	 */
	int STEP_DECLARATION = 28;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DECLARATION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Interface Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DECLARATION__INTERFACE_DECL = 1;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DECLARATION__CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Aborter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DECLARATION__ABORTER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DECLARATION__ID = 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DECLARATION__KIND = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DECLARATION__NAME = 6;

	/**
	 * The number of structural features of the '<em>Step Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_DECLARATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.StepReferenceImpl <em>Step Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.StepReferenceImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getStepReference()
	 * @generated
	 */
	int STEP_REFERENCE = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Step Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.SubstepConnectorImpl <em>Substep Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.SubstepConnectorImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getSubstepConnector()
	 * @generated
	 */
	int SUBSTEP_CONNECTOR = 30;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTEP_CONNECTOR__CARDINALITY = 0;

	/**
	 * The number of structural features of the '<em>Substep Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTEP_CONNECTOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.w3.namespace.impl.TaggedLocationImpl <em>Tagged Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.impl.TaggedLocationImpl
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getTaggedLocation()
	 * @generated
	 */
	int TAGGED_LOCATION = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_LOCATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_LOCATION__KEY = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_LOCATION__TAG = 2;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_LOCATION__XPOSITION = 3;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_LOCATION__YPOSITION = 4;

	/**
	 * The number of structural features of the '<em>Tagged Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_LOCATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.w3.namespace.ContinuationAction <em>Continuation Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.ContinuationAction
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getContinuationAction()
	 * @generated
	 */
	int CONTINUATION_ACTION = 32;

	/**
	 * The meta object id for the '{@link org.w3.namespace.Encoding <em>Encoding</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.Encoding
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getEncoding()
	 * @generated
	 */
	int ENCODING = 33;

	/**
	 * The meta object id for the '{@link org.w3.namespace.KindType <em>Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.KindType
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindType()
	 * @generated
	 */
	int KIND_TYPE = 34;

	/**
	 * The meta object id for the '{@link org.w3.namespace.KindType1 <em>Kind Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.KindType1
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindType1()
	 * @generated
	 */
	int KIND_TYPE1 = 35;

	/**
	 * The meta object id for the '{@link org.w3.namespace.KindType2 <em>Kind Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.KindType2
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindType2()
	 * @generated
	 */
	int KIND_TYPE2 = 36;

	/**
	 * The meta object id for the '{@link org.w3.namespace.KindType3 <em>Kind Type3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.KindType3
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindType3()
	 * @generated
	 */
	int KIND_TYPE3 = 37;

	/**
	 * The meta object id for the '{@link org.w3.namespace.KindType4 <em>Kind Type4</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.KindType4
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindType4()
	 * @generated
	 */
	int KIND_TYPE4 = 38;

	/**
	 * The meta object id for the '{@link org.w3.namespace.PreOrPost <em>Pre Or Post</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.PreOrPost
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getPreOrPost()
	 * @generated
	 */
	int PRE_OR_POST = 39;

	/**
	 * The meta object id for the '{@link org.w3.namespace.PreOrPost1 <em>Pre Or Post1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.namespace.PreOrPost1
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getPreOrPost1()
	 * @generated
	 */
	int PRE_OR_POST1 = 40;

	/**
	 * The meta object id for the '<em>Continuation Action Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getContinuationActionObject()
	 * @generated
	 */
	int CONTINUATION_ACTION_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Encoding Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getEncodingObject()
	 * @generated
	 */
	int ENCODING_OBJECT = 42;

	/**
	 * The meta object id for the '<em>Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindTypeObject()
	 * @generated
	 */
	int KIND_TYPE_OBJECT = 43;

	/**
	 * The meta object id for the '<em>Kind Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindTypeObject1()
	 * @generated
	 */
	int KIND_TYPE_OBJECT1 = 44;

	/**
	 * The meta object id for the '<em>Kind Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindTypeObject2()
	 * @generated
	 */
	int KIND_TYPE_OBJECT2 = 45;

	/**
	 * The meta object id for the '<em>Kind Type Object3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindTypeObject3()
	 * @generated
	 */
	int KIND_TYPE_OBJECT3 = 46;

	/**
	 * The meta object id for the '<em>Kind Type Object4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindTypeObject4()
	 * @generated
	 */
	int KIND_TYPE_OBJECT4 = 47;

	/**
	 * The meta object id for the '<em>Pre Or Post Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getPreOrPostTypeObject()
	 * @generated
	 */
	int PRE_OR_POST_TYPE_OBJECT = 48;

	/**
	 * The meta object id for the '<em>Pre Or Post Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.w3.namespace.impl.NamespacePackageImpl#getPreOrPostTypeObject1()
	 * @generated
	 */
	int PRE_OR_POST_TYPE_OBJECT1 = 49;


	/**
	 * Returns the meta object for class '{@link org.w3.namespace.Aborter <em>Aborter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aborter</em>'.
	 * @see org.w3.namespace.Aborter
	 * @generated
	 */
	EClass getAborter();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Aborter#getExternalObject <em>External Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Object</em>'.
	 * @see org.w3.namespace.Aborter#getExternalObject()
	 * @see #getAborter()
	 * @generated
	 */
	EReference getAborter_ExternalObject();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.Aggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate</em>'.
	 * @see org.w3.namespace.Aggregate
	 * @generated
	 */
	EClass getAggregate();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.namespace.Aggregate#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3.namespace.Aggregate#getGroup()
	 * @see #getAggregate()
	 * @generated
	 */
	EAttribute getAggregate_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.Aggregate#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see org.w3.namespace.Aggregate#getField()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_Field();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Aggregate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3.namespace.Aggregate#getType()
	 * @see #getAggregate()
	 * @generated
	 */
	EAttribute getAggregate_Type();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.w3.namespace.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Annotation#getExternalObject <em>External Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Object</em>'.
	 * @see org.w3.namespace.Annotation#getExternalObject()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_ExternalObject();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Annotation#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.w3.namespace.Annotation#getKey()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Annotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3.namespace.Annotation#getName()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Name();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see org.w3.namespace.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Binding#getScopeBinding <em>Scope Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope Binding</em>'.
	 * @see org.w3.namespace.Binding#getScopeBinding()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_ScopeBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Binding#getChannelBinding <em>Channel Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channel Binding</em>'.
	 * @see org.w3.namespace.Binding#getChannelBinding()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_ChannelBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Binding#getConstantBinding <em>Constant Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant Binding</em>'.
	 * @see org.w3.namespace.Binding#getConstantBinding()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_ConstantBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Binding#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3.namespace.Binding#getId()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Binding#getNameInChild <em>Name In Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name In Child</em>'.
	 * @see org.w3.namespace.Binding#getNameInChild()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_NameInChild();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see org.w3.namespace.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Cardinality#getControlParameter <em>Control Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control Parameter</em>'.
	 * @see org.w3.namespace.Cardinality#getControlParameter()
	 * @see #getCardinality()
	 * @generated
	 */
	EReference getCardinality_ControlParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Cardinality#getPredicateExpression <em>Predicate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate Expression</em>'.
	 * @see org.w3.namespace.Cardinality#getPredicateExpression()
	 * @see #getCardinality()
	 * @generated
	 */
	EReference getCardinality_PredicateExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Cardinality#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3.namespace.Cardinality#getId()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Cardinality#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.w3.namespace.Cardinality#getLowerBound()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Cardinality#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.w3.namespace.Cardinality#getUpperBound()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.ChannelBinding <em>Channel Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Binding</em>'.
	 * @see org.w3.namespace.ChannelBinding
	 * @generated
	 */
	EClass getChannelBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.ChannelBinding#getChannelName <em>Channel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Name</em>'.
	 * @see org.w3.namespace.ChannelBinding#getChannelName()
	 * @see #getChannelBinding()
	 * @generated
	 */
	EAttribute getChannelBinding_ChannelName();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.ChannelBinding#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.w3.namespace.ChannelBinding#getKind()
	 * @see #getChannelBinding()
	 * @generated
	 */
	EAttribute getChannelBinding_Kind();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.w3.namespace.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Connector#getRequisiteConnector <em>Requisite Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requisite Connector</em>'.
	 * @see org.w3.namespace.Connector#getRequisiteConnector()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_RequisiteConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Connector#getSimpleRequisiteConnector <em>Simple Requisite Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Requisite Connector</em>'.
	 * @see org.w3.namespace.Connector#getSimpleRequisiteConnector()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_SimpleRequisiteConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Connector#getSubstepConnector <em>Substep Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substep Connector</em>'.
	 * @see org.w3.namespace.Connector#getSubstepConnector()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_SubstepConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Connector#getReactionConnector <em>Reaction Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reaction Connector</em>'.
	 * @see org.w3.namespace.Connector#getReactionConnector()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_ReactionConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Connector#getHandlerConnector <em>Handler Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler Connector</em>'.
	 * @see org.w3.namespace.Connector#getHandlerConnector()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_HandlerConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.Connector#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see org.w3.namespace.Connector#getBinding()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Binding();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Connector#getStepDeclaration <em>Step Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step Declaration</em>'.
	 * @see org.w3.namespace.Connector#getStepDeclaration()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_StepDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Connector#getStepReference <em>Step Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step Reference</em>'.
	 * @see org.w3.namespace.Connector#getStepReference()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_StepReference();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Connector#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3.namespace.Connector#getId()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Id();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.ConstantBinding <em>Constant Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Binding</em>'.
	 * @see org.w3.namespace.ConstantBinding
	 * @generated
	 */
	EClass getConstantBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.ConstantBinding#getExternalObject <em>External Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Object</em>'.
	 * @see org.w3.namespace.ConstantBinding#getExternalObject()
	 * @see #getConstantBinding()
	 * @generated
	 */
	EReference getConstantBinding_ExternalObject();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.ControlParameter <em>Control Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Parameter</em>'.
	 * @see org.w3.namespace.ControlParameter
	 * @generated
	 */
	EClass getControlParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.ControlParameter#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see org.w3.namespace.ControlParameter#getParameterName()
	 * @see #getControlParameter()
	 * @generated
	 */
	EAttribute getControlParameter_ParameterName();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see org.w3.namespace.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.namespace.Diagram#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3.namespace.Diagram#getGroup()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.Diagram#getPostIt <em>Post It</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post It</em>'.
	 * @see org.w3.namespace.Diagram#getPostIt()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_PostIt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.Diagram#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see org.w3.namespace.Diagram#getLocation()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.Diagram#getTaggedLocation <em>Tagged Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Location</em>'.
	 * @see org.w3.namespace.Diagram#getTaggedLocation()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_TaggedLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Diagram#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3.namespace.Diagram#getId()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3.namespace.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.w3.namespace.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.namespace.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3.namespace.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.w3.namespace.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.w3.namespace.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.w3.namespace.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.w3.namespace.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getAborter <em>Aborter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aborter</em>'.
	 * @see org.w3.namespace.DocumentRoot#getAborter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Aborter();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aggregate</em>'.
	 * @see org.w3.namespace.DocumentRoot#getAggregate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Aggregate();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see org.w3.namespace.DocumentRoot#getAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding</em>'.
	 * @see org.w3.namespace.DocumentRoot#getBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Binding();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see org.w3.namespace.DocumentRoot#getCardinality()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Cardinality();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getChannelBinding <em>Channel Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channel Binding</em>'.
	 * @see org.w3.namespace.DocumentRoot#getChannelBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChannelBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector</em>'.
	 * @see org.w3.namespace.DocumentRoot#getConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Connector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getConstantBinding <em>Constant Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant Binding</em>'.
	 * @see org.w3.namespace.DocumentRoot#getConstantBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConstantBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getControlParameter <em>Control Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control Parameter</em>'.
	 * @see org.w3.namespace.DocumentRoot#getControlParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ControlParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diagram</em>'.
	 * @see org.w3.namespace.DocumentRoot#getDiagram()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Diagram();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getExport <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Export</em>'.
	 * @see org.w3.namespace.DocumentRoot#getExport()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Export();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getExternalObject <em>External Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Object</em>'.
	 * @see org.w3.namespace.DocumentRoot#getExternalObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExternalObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field</em>'.
	 * @see org.w3.namespace.DocumentRoot#getField()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Field();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getHandlerConnector <em>Handler Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler Connector</em>'.
	 * @see org.w3.namespace.DocumentRoot#getHandlerConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HandlerConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import</em>'.
	 * @see org.w3.namespace.DocumentRoot#getImport()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Import();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getInterfaceDecl <em>Interface Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Decl</em>'.
	 * @see org.w3.namespace.DocumentRoot#getInterfaceDecl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InterfaceDecl();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getLittlejil <em>Littlejil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Littlejil</em>'.
	 * @see org.w3.namespace.DocumentRoot#getLittlejil()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Littlejil();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.w3.namespace.DocumentRoot#getLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.w3.namespace.DocumentRoot#getMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module</em>'.
	 * @see org.w3.namespace.DocumentRoot#getModule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Module();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getNullAggregate <em>Null Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null Aggregate</em>'.
	 * @see org.w3.namespace.DocumentRoot#getNullAggregate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NullAggregate();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getPostIt <em>Post It</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post It</em>'.
	 * @see org.w3.namespace.DocumentRoot#getPostIt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PostIt();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getPredicateExpression <em>Predicate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate Expression</em>'.
	 * @see org.w3.namespace.DocumentRoot#getPredicateExpression()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PredicateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getReactionConnector <em>Reaction Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reaction Connector</em>'.
	 * @see org.w3.namespace.DocumentRoot#getReactionConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReactionConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getRequisiteConnector <em>Requisite Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requisite Connector</em>'.
	 * @see org.w3.namespace.DocumentRoot#getRequisiteConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequisiteConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getScopeBinding <em>Scope Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope Binding</em>'.
	 * @see org.w3.namespace.DocumentRoot#getScopeBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ScopeBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getSimpleRequisiteConnector <em>Simple Requisite Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Requisite Connector</em>'.
	 * @see org.w3.namespace.DocumentRoot#getSimpleRequisiteConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SimpleRequisiteConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getStepDeclaration <em>Step Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step Declaration</em>'.
	 * @see org.w3.namespace.DocumentRoot#getStepDeclaration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StepDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getStepReference <em>Step Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step Reference</em>'.
	 * @see org.w3.namespace.DocumentRoot#getStepReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StepReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getSubstepConnector <em>Substep Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substep Connector</em>'.
	 * @see org.w3.namespace.DocumentRoot#getSubstepConnector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubstepConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.DocumentRoot#getTaggedLocation <em>Tagged Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tagged Location</em>'.
	 * @see org.w3.namespace.DocumentRoot#getTaggedLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TaggedLocation();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export</em>'.
	 * @see org.w3.namespace.Export
	 * @generated
	 */
	EClass getExport();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Export#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3.namespace.Export#getId()
	 * @see #getExport()
	 * @generated
	 */
	EAttribute getExport_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Export#getStepName <em>Step Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Name</em>'.
	 * @see org.w3.namespace.Export#getStepName()
	 * @see #getExport()
	 * @generated
	 */
	EAttribute getExport_StepName();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.ExternalObject <em>External Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Object</em>'.
	 * @see org.w3.namespace.ExternalObject
	 * @generated
	 */
	EClass getExternalObject();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.namespace.ExternalObject#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3.namespace.ExternalObject#getMixed()
	 * @see #getExternalObject()
	 * @generated
	 */
	EAttribute getExternalObject_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.namespace.ExternalObject#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3.namespace.ExternalObject#getGroup()
	 * @see #getExternalObject()
	 * @generated
	 */
	EAttribute getExternalObject_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.ExternalObject#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregate</em>'.
	 * @see org.w3.namespace.ExternalObject#getAggregate()
	 * @see #getExternalObject()
	 * @generated
	 */
	EReference getExternalObject_Aggregate();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.ExternalObject#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.w3.namespace.ExternalObject#getEncoding()
	 * @see #getExternalObject()
	 * @generated
	 */
	EAttribute getExternalObject_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.ExternalObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3.namespace.ExternalObject#getId()
	 * @see #getExternalObject()
	 * @generated
	 */
	EAttribute getExternalObject_Id();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.w3.namespace.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.namespace.Field#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3.namespace.Field#getMixed()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.namespace.Field#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3.namespace.Field#getGroup()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.Field#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregate</em>'.
	 * @see org.w3.namespace.Field#getAggregate()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Aggregate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.Field#getNullAggregate <em>Null Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null Aggregate</em>'.
	 * @see org.w3.namespace.Field#getNullAggregate()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_NullAggregate();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Field#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.w3.namespace.Field#getKind()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3.namespace.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.HandlerConnector <em>Handler Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler Connector</em>'.
	 * @see org.w3.namespace.HandlerConnector
	 * @generated
	 */
	EClass getHandlerConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.HandlerConnector#getExternalObject <em>External Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Object</em>'.
	 * @see org.w3.namespace.HandlerConnector#getExternalObject()
	 * @see #getHandlerConnector()
	 * @generated
	 */
	EReference getHandlerConnector_ExternalObject();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.HandlerConnector#getContinuationAction <em>Continuation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continuation Action</em>'.
	 * @see org.w3.namespace.HandlerConnector#getContinuationAction()
	 * @see #getHandlerConnector()
	 * @generated
	 */
	EAttribute getHandlerConnector_ContinuationAction();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.HandlerConnector#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see org.w3.namespace.HandlerConnector#getParameterName()
	 * @see #getHandlerConnector()
	 * @generated
	 */
	EAttribute getHandlerConnector_ParameterName();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.w3.namespace.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Import#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3.namespace.Import#getId()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Import#getStepName <em>Step Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Name</em>'.
	 * @see org.w3.namespace.Import#getStepName()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_StepName();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.InterfaceDecl <em>Interface Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Decl</em>'.
	 * @see org.w3.namespace.InterfaceDecl
	 * @generated
	 */
	EClass getInterfaceDecl();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.InterfaceDecl#getExternalObject <em>External Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Object</em>'.
	 * @see org.w3.namespace.InterfaceDecl#getExternalObject()
	 * @see #getInterfaceDecl()
	 * @generated
	 */
	EReference getInterfaceDecl_ExternalObject();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.InterfaceDecl#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3.namespace.InterfaceDecl#getId()
	 * @see #getInterfaceDecl()
	 * @generated
	 */
	EAttribute getInterfaceDecl_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.InterfaceDecl#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.w3.namespace.InterfaceDecl#getKind()
	 * @see #getInterfaceDecl()
	 * @generated
	 */
	EAttribute getInterfaceDecl_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.InterfaceDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3.namespace.InterfaceDecl#getName()
	 * @see #getInterfaceDecl()
	 * @generated
	 */
	EAttribute getInterfaceDecl_Name();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.Littlejil <em>Littlejil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Littlejil</em>'.
	 * @see org.w3.namespace.Littlejil
	 * @generated
	 */
	EClass getLittlejil();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Littlejil#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module</em>'.
	 * @see org.w3.namespace.Littlejil#getModule()
	 * @see #getLittlejil()
	 * @generated
	 */
	EReference getLittlejil_Module();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.Littlejil#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.w3.namespace.Littlejil#getMetadata()
	 * @see #getLittlejil()
	 * @generated
	 */
	EReference getLittlejil_Metadata();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.w3.namespace.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Location#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3.namespace.Location#getId()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Location#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.w3.namespace.Location#getKey()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Location#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see org.w3.namespace.Location#getXPosition()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Location#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see org.w3.namespace.Location#getYPosition()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_YPosition();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see org.w3.namespace.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.namespace.Metadata#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3.namespace.Metadata#getGroup()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.Metadata#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.w3.namespace.Metadata#getAnnotation()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.Metadata#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram</em>'.
	 * @see org.w3.namespace.Metadata#getDiagram()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Diagram();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.w3.namespace.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.namespace.Module#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3.namespace.Module#getGroup()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.Module#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see org.w3.namespace.Module#getImport()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.Module#getExport <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Export</em>'.
	 * @see org.w3.namespace.Module#getExport()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Export();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.Module#getStepDeclaration <em>Step Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step Declaration</em>'.
	 * @see org.w3.namespace.Module#getStepDeclaration()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_StepDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.Module#getStepReference <em>Step Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step Reference</em>'.
	 * @see org.w3.namespace.Module#getStepReference()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_StepReference();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.Module#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3.namespace.Module#getId()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Id();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.NullAggregate <em>Null Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Aggregate</em>'.
	 * @see org.w3.namespace.NullAggregate
	 * @generated
	 */
	EClass getNullAggregate();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.NullAggregate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3.namespace.NullAggregate#getType()
	 * @see #getNullAggregate()
	 * @generated
	 */
	EAttribute getNullAggregate_Type();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.PostIt <em>Post It</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post It</em>'.
	 * @see org.w3.namespace.PostIt
	 * @generated
	 */
	EClass getPostIt();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.namespace.PostIt#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3.namespace.PostIt#getMixed()
	 * @see #getPostIt()
	 * @generated
	 */
	EAttribute getPostIt_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.PostIt#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3.namespace.PostIt#getId()
	 * @see #getPostIt()
	 * @generated
	 */
	EAttribute getPostIt_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.PostIt#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see org.w3.namespace.PostIt#getXPosition()
	 * @see #getPostIt()
	 * @generated
	 */
	EAttribute getPostIt_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.PostIt#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see org.w3.namespace.PostIt#getYPosition()
	 * @see #getPostIt()
	 * @generated
	 */
	EAttribute getPostIt_YPosition();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.PredicateExpression <em>Predicate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Expression</em>'.
	 * @see org.w3.namespace.PredicateExpression
	 * @generated
	 */
	EClass getPredicateExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.PredicateExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.w3.namespace.PredicateExpression#getExpression()
	 * @see #getPredicateExpression()
	 * @generated
	 */
	EAttribute getPredicateExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.ReactionConnector <em>Reaction Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaction Connector</em>'.
	 * @see org.w3.namespace.ReactionConnector
	 * @generated
	 */
	EClass getReactionConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.ReactionConnector#getExternalObject <em>External Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Object</em>'.
	 * @see org.w3.namespace.ReactionConnector#getExternalObject()
	 * @see #getReactionConnector()
	 * @generated
	 */
	EReference getReactionConnector_ExternalObject();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.ReactionConnector#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see org.w3.namespace.ReactionConnector#getParameterName()
	 * @see #getReactionConnector()
	 * @generated
	 */
	EAttribute getReactionConnector_ParameterName();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.RequisiteConnector <em>Requisite Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requisite Connector</em>'.
	 * @see org.w3.namespace.RequisiteConnector
	 * @generated
	 */
	EClass getRequisiteConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.RequisiteConnector#getPreOrPost <em>Pre Or Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Or Post</em>'.
	 * @see org.w3.namespace.RequisiteConnector#getPreOrPost()
	 * @see #getRequisiteConnector()
	 * @generated
	 */
	EAttribute getRequisiteConnector_PreOrPost();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.ScopeBinding <em>Scope Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Binding</em>'.
	 * @see org.w3.namespace.ScopeBinding
	 * @generated
	 */
	EClass getScopeBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.ScopeBinding#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.w3.namespace.ScopeBinding#getKind()
	 * @see #getScopeBinding()
	 * @generated
	 */
	EAttribute getScopeBinding_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.ScopeBinding#getNameInParent <em>Name In Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name In Parent</em>'.
	 * @see org.w3.namespace.ScopeBinding#getNameInParent()
	 * @see #getScopeBinding()
	 * @generated
	 */
	EAttribute getScopeBinding_NameInParent();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.SimpleRequisiteConnector <em>Simple Requisite Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Requisite Connector</em>'.
	 * @see org.w3.namespace.SimpleRequisiteConnector
	 * @generated
	 */
	EClass getSimpleRequisiteConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.SimpleRequisiteConnector#getPredicateExpression <em>Predicate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate Expression</em>'.
	 * @see org.w3.namespace.SimpleRequisiteConnector#getPredicateExpression()
	 * @see #getSimpleRequisiteConnector()
	 * @generated
	 */
	EReference getSimpleRequisiteConnector_PredicateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.SimpleRequisiteConnector#getExternalObject <em>External Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Object</em>'.
	 * @see org.w3.namespace.SimpleRequisiteConnector#getExternalObject()
	 * @see #getSimpleRequisiteConnector()
	 * @generated
	 */
	EReference getSimpleRequisiteConnector_ExternalObject();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.SimpleRequisiteConnector#getPreOrPost <em>Pre Or Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Or Post</em>'.
	 * @see org.w3.namespace.SimpleRequisiteConnector#getPreOrPost()
	 * @see #getSimpleRequisiteConnector()
	 * @generated
	 */
	EAttribute getSimpleRequisiteConnector_PreOrPost();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.StepDeclaration <em>Step Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Declaration</em>'.
	 * @see org.w3.namespace.StepDeclaration
	 * @generated
	 */
	EClass getStepDeclaration();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.namespace.StepDeclaration#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3.namespace.StepDeclaration#getGroup()
	 * @see #getStepDeclaration()
	 * @generated
	 */
	EAttribute getStepDeclaration_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.StepDeclaration#getInterfaceDecl <em>Interface Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Decl</em>'.
	 * @see org.w3.namespace.StepDeclaration#getInterfaceDecl()
	 * @see #getStepDeclaration()
	 * @generated
	 */
	EReference getStepDeclaration_InterfaceDecl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.StepDeclaration#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see org.w3.namespace.StepDeclaration#getConnector()
	 * @see #getStepDeclaration()
	 * @generated
	 */
	EReference getStepDeclaration_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3.namespace.StepDeclaration#getAborter <em>Aborter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aborter</em>'.
	 * @see org.w3.namespace.StepDeclaration#getAborter()
	 * @see #getStepDeclaration()
	 * @generated
	 */
	EReference getStepDeclaration_Aborter();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.StepDeclaration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3.namespace.StepDeclaration#getId()
	 * @see #getStepDeclaration()
	 * @generated
	 */
	EAttribute getStepDeclaration_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.StepDeclaration#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.w3.namespace.StepDeclaration#getKind()
	 * @see #getStepDeclaration()
	 * @generated
	 */
	EAttribute getStepDeclaration_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.StepDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.w3.namespace.StepDeclaration#getName()
	 * @see #getStepDeclaration()
	 * @generated
	 */
	EAttribute getStepDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.StepReference <em>Step Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Reference</em>'.
	 * @see org.w3.namespace.StepReference
	 * @generated
	 */
	EClass getStepReference();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.StepReference#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3.namespace.StepReference#getId()
	 * @see #getStepReference()
	 * @generated
	 */
	EAttribute getStepReference_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.StepReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.w3.namespace.StepReference#getTarget()
	 * @see #getStepReference()
	 * @generated
	 */
	EAttribute getStepReference_Target();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.SubstepConnector <em>Substep Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substep Connector</em>'.
	 * @see org.w3.namespace.SubstepConnector
	 * @generated
	 */
	EClass getSubstepConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.namespace.SubstepConnector#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see org.w3.namespace.SubstepConnector#getCardinality()
	 * @see #getSubstepConnector()
	 * @generated
	 */
	EReference getSubstepConnector_Cardinality();

	/**
	 * Returns the meta object for class '{@link org.w3.namespace.TaggedLocation <em>Tagged Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Location</em>'.
	 * @see org.w3.namespace.TaggedLocation
	 * @generated
	 */
	EClass getTaggedLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.TaggedLocation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.w3.namespace.TaggedLocation#getId()
	 * @see #getTaggedLocation()
	 * @generated
	 */
	EAttribute getTaggedLocation_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.TaggedLocation#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.w3.namespace.TaggedLocation#getKey()
	 * @see #getTaggedLocation()
	 * @generated
	 */
	EAttribute getTaggedLocation_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.TaggedLocation#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see org.w3.namespace.TaggedLocation#getTag()
	 * @see #getTaggedLocation()
	 * @generated
	 */
	EAttribute getTaggedLocation_Tag();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.TaggedLocation#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see org.w3.namespace.TaggedLocation#getXPosition()
	 * @see #getTaggedLocation()
	 * @generated
	 */
	EAttribute getTaggedLocation_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.namespace.TaggedLocation#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see org.w3.namespace.TaggedLocation#getYPosition()
	 * @see #getTaggedLocation()
	 * @generated
	 */
	EAttribute getTaggedLocation_YPosition();

	/**
	 * Returns the meta object for enum '{@link org.w3.namespace.ContinuationAction <em>Continuation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Continuation Action</em>'.
	 * @see org.w3.namespace.ContinuationAction
	 * @generated
	 */
	EEnum getContinuationAction();

	/**
	 * Returns the meta object for enum '{@link org.w3.namespace.Encoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encoding</em>'.
	 * @see org.w3.namespace.Encoding
	 * @generated
	 */
	EEnum getEncoding();

	/**
	 * Returns the meta object for enum '{@link org.w3.namespace.KindType <em>Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind Type</em>'.
	 * @see org.w3.namespace.KindType
	 * @generated
	 */
	EEnum getKindType();

	/**
	 * Returns the meta object for enum '{@link org.w3.namespace.KindType1 <em>Kind Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind Type1</em>'.
	 * @see org.w3.namespace.KindType1
	 * @generated
	 */
	EEnum getKindType1();

	/**
	 * Returns the meta object for enum '{@link org.w3.namespace.KindType2 <em>Kind Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind Type2</em>'.
	 * @see org.w3.namespace.KindType2
	 * @generated
	 */
	EEnum getKindType2();

	/**
	 * Returns the meta object for enum '{@link org.w3.namespace.KindType3 <em>Kind Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind Type3</em>'.
	 * @see org.w3.namespace.KindType3
	 * @generated
	 */
	EEnum getKindType3();

	/**
	 * Returns the meta object for enum '{@link org.w3.namespace.KindType4 <em>Kind Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind Type4</em>'.
	 * @see org.w3.namespace.KindType4
	 * @generated
	 */
	EEnum getKindType4();

	/**
	 * Returns the meta object for enum '{@link org.w3.namespace.PreOrPost <em>Pre Or Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pre Or Post</em>'.
	 * @see org.w3.namespace.PreOrPost
	 * @generated
	 */
	EEnum getPreOrPost();

	/**
	 * Returns the meta object for enum '{@link org.w3.namespace.PreOrPost1 <em>Pre Or Post1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pre Or Post1</em>'.
	 * @see org.w3.namespace.PreOrPost1
	 * @generated
	 */
	EEnum getPreOrPost1();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Continuation Action Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Continuation Action Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="name='continuation-action_._type:Object' base='continuation-action_._type'"
	 * @generated
	 */
	EDataType getContinuationActionObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Encoding Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Encoding Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="name='encoding_._type:Object' base='encoding_._type'"
	 * @generated
	 */
	EDataType getEncodingObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kind Type Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="name='kind_._3_._type:Object' base='kind_._3_._type'"
	 * @generated
	 */
	EDataType getKindTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Kind Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kind Type Object1</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="name='kind_._1_._type:Object' base='kind_._1_._type'"
	 * @generated
	 */
	EDataType getKindTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Kind Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kind Type Object2</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="name='kind_._2_._type:Object' base='kind_._2_._type'"
	 * @generated
	 */
	EDataType getKindTypeObject2();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Kind Type Object3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kind Type Object3</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="name='kind_._4_._type:Object' base='kind_._4_._type'"
	 * @generated
	 */
	EDataType getKindTypeObject3();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Kind Type Object4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kind Type Object4</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="name='kind_._type:Object' base='kind_._type'"
	 * @generated
	 */
	EDataType getKindTypeObject4();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Pre Or Post Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pre Or Post Type Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="name='pre-or-post_._type:Object' base='pre-or-post_._type'"
	 * @generated
	 */
	EDataType getPreOrPostTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Pre Or Post Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pre Or Post Type Object1</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="name='pre-or-post_._1_._type:Object' base='pre-or-post_._1_._type'"
	 * @generated
	 */
	EDataType getPreOrPostTypeObject1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NamespaceFactory getNamespaceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.AborterImpl <em>Aborter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.AborterImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getAborter()
		 * @generated
		 */
		EClass ABORTER = eINSTANCE.getAborter();

		/**
		 * The meta object literal for the '<em><b>External Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABORTER__EXTERNAL_OBJECT = eINSTANCE.getAborter_ExternalObject();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.AggregateImpl <em>Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.AggregateImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getAggregate()
		 * @generated
		 */
		EClass AGGREGATE = eINSTANCE.getAggregate();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE__GROUP = eINSTANCE.getAggregate_Group();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__FIELD = eINSTANCE.getAggregate_Field();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE__TYPE = eINSTANCE.getAggregate_Type();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.AnnotationImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>External Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__EXTERNAL_OBJECT = eINSTANCE.getAnnotation_ExternalObject();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__KEY = eINSTANCE.getAnnotation_Key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__NAME = eINSTANCE.getAnnotation_Name();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.BindingImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Scope Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__SCOPE_BINDING = eINSTANCE.getBinding_ScopeBinding();

		/**
		 * The meta object literal for the '<em><b>Channel Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__CHANNEL_BINDING = eINSTANCE.getBinding_ChannelBinding();

		/**
		 * The meta object literal for the '<em><b>Constant Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__CONSTANT_BINDING = eINSTANCE.getBinding_ConstantBinding();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__ID = eINSTANCE.getBinding_Id();

		/**
		 * The meta object literal for the '<em><b>Name In Child</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__NAME_IN_CHILD = eINSTANCE.getBinding_NameInChild();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.CardinalityImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>Control Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALITY__CONTROL_PARAMETER = eINSTANCE.getCardinality_ControlParameter();

		/**
		 * The meta object literal for the '<em><b>Predicate Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALITY__PREDICATE_EXPRESSION = eINSTANCE.getCardinality_PredicateExpression();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__ID = eINSTANCE.getCardinality_Id();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__LOWER_BOUND = eINSTANCE.getCardinality_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__UPPER_BOUND = eINSTANCE.getCardinality_UpperBound();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.ChannelBindingImpl <em>Channel Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.ChannelBindingImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getChannelBinding()
		 * @generated
		 */
		EClass CHANNEL_BINDING = eINSTANCE.getChannelBinding();

		/**
		 * The meta object literal for the '<em><b>Channel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_BINDING__CHANNEL_NAME = eINSTANCE.getChannelBinding_ChannelName();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_BINDING__KIND = eINSTANCE.getChannelBinding_Kind();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.ConnectorImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Requisite Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__REQUISITE_CONNECTOR = eINSTANCE.getConnector_RequisiteConnector();

		/**
		 * The meta object literal for the '<em><b>Simple Requisite Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SIMPLE_REQUISITE_CONNECTOR = eINSTANCE.getConnector_SimpleRequisiteConnector();

		/**
		 * The meta object literal for the '<em><b>Substep Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SUBSTEP_CONNECTOR = eINSTANCE.getConnector_SubstepConnector();

		/**
		 * The meta object literal for the '<em><b>Reaction Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__REACTION_CONNECTOR = eINSTANCE.getConnector_ReactionConnector();

		/**
		 * The meta object literal for the '<em><b>Handler Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__HANDLER_CONNECTOR = eINSTANCE.getConnector_HandlerConnector();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__BINDING = eINSTANCE.getConnector_Binding();

		/**
		 * The meta object literal for the '<em><b>Step Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__STEP_DECLARATION = eINSTANCE.getConnector_StepDeclaration();

		/**
		 * The meta object literal for the '<em><b>Step Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__STEP_REFERENCE = eINSTANCE.getConnector_StepReference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__ID = eINSTANCE.getConnector_Id();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.ConstantBindingImpl <em>Constant Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.ConstantBindingImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getConstantBinding()
		 * @generated
		 */
		EClass CONSTANT_BINDING = eINSTANCE.getConstantBinding();

		/**
		 * The meta object literal for the '<em><b>External Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_BINDING__EXTERNAL_OBJECT = eINSTANCE.getConstantBinding_ExternalObject();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.ControlParameterImpl <em>Control Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.ControlParameterImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getControlParameter()
		 * @generated
		 */
		EClass CONTROL_PARAMETER = eINSTANCE.getControlParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_PARAMETER__PARAMETER_NAME = eINSTANCE.getControlParameter_ParameterName();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.DiagramImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__GROUP = eINSTANCE.getDiagram_Group();

		/**
		 * The meta object literal for the '<em><b>Post It</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__POST_IT = eINSTANCE.getDiagram_PostIt();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__LOCATION = eINSTANCE.getDiagram_Location();

		/**
		 * The meta object literal for the '<em><b>Tagged Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__TAGGED_LOCATION = eINSTANCE.getDiagram_TaggedLocation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__ID = eINSTANCE.getDiagram_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.DocumentRootImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Aborter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABORTER = eINSTANCE.getDocumentRoot_Aborter();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AGGREGATE = eINSTANCE.getDocumentRoot_Aggregate();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ANNOTATION = eINSTANCE.getDocumentRoot_Annotation();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BINDING = eINSTANCE.getDocumentRoot_Binding();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CARDINALITY = eINSTANCE.getDocumentRoot_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Channel Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANNEL_BINDING = eINSTANCE.getDocumentRoot_ChannelBinding();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONNECTOR = eINSTANCE.getDocumentRoot_Connector();

		/**
		 * The meta object literal for the '<em><b>Constant Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONSTANT_BINDING = eINSTANCE.getDocumentRoot_ConstantBinding();

		/**
		 * The meta object literal for the '<em><b>Control Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTROL_PARAMETER = eINSTANCE.getDocumentRoot_ControlParameter();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIAGRAM = eINSTANCE.getDocumentRoot_Diagram();

		/**
		 * The meta object literal for the '<em><b>Export</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXPORT = eINSTANCE.getDocumentRoot_Export();

		/**
		 * The meta object literal for the '<em><b>External Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTERNAL_OBJECT = eINSTANCE.getDocumentRoot_ExternalObject();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FIELD = eINSTANCE.getDocumentRoot_Field();

		/**
		 * The meta object literal for the '<em><b>Handler Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HANDLER_CONNECTOR = eINSTANCE.getDocumentRoot_HandlerConnector();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMPORT = eINSTANCE.getDocumentRoot_Import();

		/**
		 * The meta object literal for the '<em><b>Interface Decl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTERFACE_DECL = eINSTANCE.getDocumentRoot_InterfaceDecl();

		/**
		 * The meta object literal for the '<em><b>Littlejil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LITTLEJIL = eINSTANCE.getDocumentRoot_Littlejil();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCATION = eINSTANCE.getDocumentRoot_Location();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__METADATA = eINSTANCE.getDocumentRoot_Metadata();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODULE = eINSTANCE.getDocumentRoot_Module();

		/**
		 * The meta object literal for the '<em><b>Null Aggregate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NULL_AGGREGATE = eINSTANCE.getDocumentRoot_NullAggregate();

		/**
		 * The meta object literal for the '<em><b>Post It</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POST_IT = eINSTANCE.getDocumentRoot_PostIt();

		/**
		 * The meta object literal for the '<em><b>Predicate Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PREDICATE_EXPRESSION = eINSTANCE.getDocumentRoot_PredicateExpression();

		/**
		 * The meta object literal for the '<em><b>Reaction Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REACTION_CONNECTOR = eINSTANCE.getDocumentRoot_ReactionConnector();

		/**
		 * The meta object literal for the '<em><b>Requisite Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUISITE_CONNECTOR = eINSTANCE.getDocumentRoot_RequisiteConnector();

		/**
		 * The meta object literal for the '<em><b>Scope Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCOPE_BINDING = eINSTANCE.getDocumentRoot_ScopeBinding();

		/**
		 * The meta object literal for the '<em><b>Simple Requisite Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIMPLE_REQUISITE_CONNECTOR = eINSTANCE.getDocumentRoot_SimpleRequisiteConnector();

		/**
		 * The meta object literal for the '<em><b>Step Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STEP_DECLARATION = eINSTANCE.getDocumentRoot_StepDeclaration();

		/**
		 * The meta object literal for the '<em><b>Step Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STEP_REFERENCE = eINSTANCE.getDocumentRoot_StepReference();

		/**
		 * The meta object literal for the '<em><b>Substep Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUBSTEP_CONNECTOR = eINSTANCE.getDocumentRoot_SubstepConnector();

		/**
		 * The meta object literal for the '<em><b>Tagged Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TAGGED_LOCATION = eINSTANCE.getDocumentRoot_TaggedLocation();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.ExportImpl <em>Export</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.ExportImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getExport()
		 * @generated
		 */
		EClass EXPORT = eINSTANCE.getExport();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT__ID = eINSTANCE.getExport_Id();

		/**
		 * The meta object literal for the '<em><b>Step Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT__STEP_NAME = eINSTANCE.getExport_StepName();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.ExternalObjectImpl <em>External Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.ExternalObjectImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getExternalObject()
		 * @generated
		 */
		EClass EXTERNAL_OBJECT = eINSTANCE.getExternalObject();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_OBJECT__MIXED = eINSTANCE.getExternalObject_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_OBJECT__GROUP = eINSTANCE.getExternalObject_Group();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_OBJECT__AGGREGATE = eINSTANCE.getExternalObject_Aggregate();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_OBJECT__ENCODING = eINSTANCE.getExternalObject_Encoding();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_OBJECT__ID = eINSTANCE.getExternalObject_Id();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.FieldImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__MIXED = eINSTANCE.getField_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__GROUP = eINSTANCE.getField_Group();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__AGGREGATE = eINSTANCE.getField_Aggregate();

		/**
		 * The meta object literal for the '<em><b>Null Aggregate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__NULL_AGGREGATE = eINSTANCE.getField_NullAggregate();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__KIND = eINSTANCE.getField_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.HandlerConnectorImpl <em>Handler Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.HandlerConnectorImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getHandlerConnector()
		 * @generated
		 */
		EClass HANDLER_CONNECTOR = eINSTANCE.getHandlerConnector();

		/**
		 * The meta object literal for the '<em><b>External Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLER_CONNECTOR__EXTERNAL_OBJECT = eINSTANCE.getHandlerConnector_ExternalObject();

		/**
		 * The meta object literal for the '<em><b>Continuation Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER_CONNECTOR__CONTINUATION_ACTION = eINSTANCE.getHandlerConnector_ContinuationAction();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER_CONNECTOR__PARAMETER_NAME = eINSTANCE.getHandlerConnector_ParameterName();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.ImportImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__ID = eINSTANCE.getImport_Id();

		/**
		 * The meta object literal for the '<em><b>Step Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__STEP_NAME = eINSTANCE.getImport_StepName();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.InterfaceDeclImpl <em>Interface Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.InterfaceDeclImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getInterfaceDecl()
		 * @generated
		 */
		EClass INTERFACE_DECL = eINSTANCE.getInterfaceDecl();

		/**
		 * The meta object literal for the '<em><b>External Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DECL__EXTERNAL_OBJECT = eINSTANCE.getInterfaceDecl_ExternalObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DECL__ID = eINSTANCE.getInterfaceDecl_Id();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DECL__KIND = eINSTANCE.getInterfaceDecl_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DECL__NAME = eINSTANCE.getInterfaceDecl_Name();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.LittlejilImpl <em>Littlejil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.LittlejilImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getLittlejil()
		 * @generated
		 */
		EClass LITTLEJIL = eINSTANCE.getLittlejil();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITTLEJIL__MODULE = eINSTANCE.getLittlejil_Module();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITTLEJIL__METADATA = eINSTANCE.getLittlejil_Metadata();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.LocationImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ID = eINSTANCE.getLocation_Id();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__KEY = eINSTANCE.getLocation_Key();

		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__XPOSITION = eINSTANCE.getLocation_XPosition();

		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__YPOSITION = eINSTANCE.getLocation_YPosition();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.MetadataImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__GROUP = eINSTANCE.getMetadata_Group();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__ANNOTATION = eINSTANCE.getMetadata_Annotation();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__DIAGRAM = eINSTANCE.getMetadata_Diagram();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.ModuleImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__GROUP = eINSTANCE.getModule_Group();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__IMPORT = eINSTANCE.getModule_Import();

		/**
		 * The meta object literal for the '<em><b>Export</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__EXPORT = eINSTANCE.getModule_Export();

		/**
		 * The meta object literal for the '<em><b>Step Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__STEP_DECLARATION = eINSTANCE.getModule_StepDeclaration();

		/**
		 * The meta object literal for the '<em><b>Step Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__STEP_REFERENCE = eINSTANCE.getModule_StepReference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__ID = eINSTANCE.getModule_Id();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.NullAggregateImpl <em>Null Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.NullAggregateImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getNullAggregate()
		 * @generated
		 */
		EClass NULL_AGGREGATE = eINSTANCE.getNullAggregate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NULL_AGGREGATE__TYPE = eINSTANCE.getNullAggregate_Type();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.PostItImpl <em>Post It</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.PostItImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getPostIt()
		 * @generated
		 */
		EClass POST_IT = eINSTANCE.getPostIt();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_IT__MIXED = eINSTANCE.getPostIt_Mixed();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_IT__ID = eINSTANCE.getPostIt_Id();

		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_IT__XPOSITION = eINSTANCE.getPostIt_XPosition();

		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_IT__YPOSITION = eINSTANCE.getPostIt_YPosition();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.PredicateExpressionImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getPredicateExpression()
		 * @generated
		 */
		EClass PREDICATE_EXPRESSION = eINSTANCE.getPredicateExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE_EXPRESSION__EXPRESSION = eINSTANCE.getPredicateExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.ReactionConnectorImpl <em>Reaction Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.ReactionConnectorImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getReactionConnector()
		 * @generated
		 */
		EClass REACTION_CONNECTOR = eINSTANCE.getReactionConnector();

		/**
		 * The meta object literal for the '<em><b>External Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION_CONNECTOR__EXTERNAL_OBJECT = eINSTANCE.getReactionConnector_ExternalObject();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACTION_CONNECTOR__PARAMETER_NAME = eINSTANCE.getReactionConnector_ParameterName();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.RequisiteConnectorImpl <em>Requisite Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.RequisiteConnectorImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getRequisiteConnector()
		 * @generated
		 */
		EClass REQUISITE_CONNECTOR = eINSTANCE.getRequisiteConnector();

		/**
		 * The meta object literal for the '<em><b>Pre Or Post</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUISITE_CONNECTOR__PRE_OR_POST = eINSTANCE.getRequisiteConnector_PreOrPost();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.ScopeBindingImpl <em>Scope Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.ScopeBindingImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getScopeBinding()
		 * @generated
		 */
		EClass SCOPE_BINDING = eINSTANCE.getScopeBinding();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE_BINDING__KIND = eINSTANCE.getScopeBinding_Kind();

		/**
		 * The meta object literal for the '<em><b>Name In Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE_BINDING__NAME_IN_PARENT = eINSTANCE.getScopeBinding_NameInParent();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.SimpleRequisiteConnectorImpl <em>Simple Requisite Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.SimpleRequisiteConnectorImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getSimpleRequisiteConnector()
		 * @generated
		 */
		EClass SIMPLE_REQUISITE_CONNECTOR = eINSTANCE.getSimpleRequisiteConnector();

		/**
		 * The meta object literal for the '<em><b>Predicate Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_REQUISITE_CONNECTOR__PREDICATE_EXPRESSION = eINSTANCE.getSimpleRequisiteConnector_PredicateExpression();

		/**
		 * The meta object literal for the '<em><b>External Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_REQUISITE_CONNECTOR__EXTERNAL_OBJECT = eINSTANCE.getSimpleRequisiteConnector_ExternalObject();

		/**
		 * The meta object literal for the '<em><b>Pre Or Post</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_REQUISITE_CONNECTOR__PRE_OR_POST = eINSTANCE.getSimpleRequisiteConnector_PreOrPost();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.StepDeclarationImpl <em>Step Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.StepDeclarationImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getStepDeclaration()
		 * @generated
		 */
		EClass STEP_DECLARATION = eINSTANCE.getStepDeclaration();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_DECLARATION__GROUP = eINSTANCE.getStepDeclaration_Group();

		/**
		 * The meta object literal for the '<em><b>Interface Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_DECLARATION__INTERFACE_DECL = eINSTANCE.getStepDeclaration_InterfaceDecl();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_DECLARATION__CONNECTOR = eINSTANCE.getStepDeclaration_Connector();

		/**
		 * The meta object literal for the '<em><b>Aborter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_DECLARATION__ABORTER = eINSTANCE.getStepDeclaration_Aborter();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_DECLARATION__ID = eINSTANCE.getStepDeclaration_Id();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_DECLARATION__KIND = eINSTANCE.getStepDeclaration_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_DECLARATION__NAME = eINSTANCE.getStepDeclaration_Name();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.StepReferenceImpl <em>Step Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.StepReferenceImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getStepReference()
		 * @generated
		 */
		EClass STEP_REFERENCE = eINSTANCE.getStepReference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_REFERENCE__ID = eINSTANCE.getStepReference_Id();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_REFERENCE__TARGET = eINSTANCE.getStepReference_Target();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.SubstepConnectorImpl <em>Substep Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.SubstepConnectorImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getSubstepConnector()
		 * @generated
		 */
		EClass SUBSTEP_CONNECTOR = eINSTANCE.getSubstepConnector();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTEP_CONNECTOR__CARDINALITY = eINSTANCE.getSubstepConnector_Cardinality();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.impl.TaggedLocationImpl <em>Tagged Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.impl.TaggedLocationImpl
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getTaggedLocation()
		 * @generated
		 */
		EClass TAGGED_LOCATION = eINSTANCE.getTaggedLocation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_LOCATION__ID = eINSTANCE.getTaggedLocation_Id();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_LOCATION__KEY = eINSTANCE.getTaggedLocation_Key();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_LOCATION__TAG = eINSTANCE.getTaggedLocation_Tag();

		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_LOCATION__XPOSITION = eINSTANCE.getTaggedLocation_XPosition();

		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_LOCATION__YPOSITION = eINSTANCE.getTaggedLocation_YPosition();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.ContinuationAction <em>Continuation Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.ContinuationAction
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getContinuationAction()
		 * @generated
		 */
		EEnum CONTINUATION_ACTION = eINSTANCE.getContinuationAction();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.Encoding <em>Encoding</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.Encoding
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getEncoding()
		 * @generated
		 */
		EEnum ENCODING = eINSTANCE.getEncoding();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.KindType <em>Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.KindType
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindType()
		 * @generated
		 */
		EEnum KIND_TYPE = eINSTANCE.getKindType();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.KindType1 <em>Kind Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.KindType1
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindType1()
		 * @generated
		 */
		EEnum KIND_TYPE1 = eINSTANCE.getKindType1();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.KindType2 <em>Kind Type2</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.KindType2
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindType2()
		 * @generated
		 */
		EEnum KIND_TYPE2 = eINSTANCE.getKindType2();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.KindType3 <em>Kind Type3</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.KindType3
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindType3()
		 * @generated
		 */
		EEnum KIND_TYPE3 = eINSTANCE.getKindType3();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.KindType4 <em>Kind Type4</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.KindType4
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindType4()
		 * @generated
		 */
		EEnum KIND_TYPE4 = eINSTANCE.getKindType4();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.PreOrPost <em>Pre Or Post</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.PreOrPost
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getPreOrPost()
		 * @generated
		 */
		EEnum PRE_OR_POST = eINSTANCE.getPreOrPost();

		/**
		 * The meta object literal for the '{@link org.w3.namespace.PreOrPost1 <em>Pre Or Post1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.namespace.PreOrPost1
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getPreOrPost1()
		 * @generated
		 */
		EEnum PRE_OR_POST1 = eINSTANCE.getPreOrPost1();

		/**
		 * The meta object literal for the '<em>Continuation Action Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getContinuationActionObject()
		 * @generated
		 */
		EDataType CONTINUATION_ACTION_OBJECT = eINSTANCE.getContinuationActionObject();

		/**
		 * The meta object literal for the '<em>Encoding Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getEncodingObject()
		 * @generated
		 */
		EDataType ENCODING_OBJECT = eINSTANCE.getEncodingObject();

		/**
		 * The meta object literal for the '<em>Kind Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindTypeObject()
		 * @generated
		 */
		EDataType KIND_TYPE_OBJECT = eINSTANCE.getKindTypeObject();

		/**
		 * The meta object literal for the '<em>Kind Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindTypeObject1()
		 * @generated
		 */
		EDataType KIND_TYPE_OBJECT1 = eINSTANCE.getKindTypeObject1();

		/**
		 * The meta object literal for the '<em>Kind Type Object2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindTypeObject2()
		 * @generated
		 */
		EDataType KIND_TYPE_OBJECT2 = eINSTANCE.getKindTypeObject2();

		/**
		 * The meta object literal for the '<em>Kind Type Object3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindTypeObject3()
		 * @generated
		 */
		EDataType KIND_TYPE_OBJECT3 = eINSTANCE.getKindTypeObject3();

		/**
		 * The meta object literal for the '<em>Kind Type Object4</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getKindTypeObject4()
		 * @generated
		 */
		EDataType KIND_TYPE_OBJECT4 = eINSTANCE.getKindTypeObject4();

		/**
		 * The meta object literal for the '<em>Pre Or Post Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getPreOrPostTypeObject()
		 * @generated
		 */
		EDataType PRE_OR_POST_TYPE_OBJECT = eINSTANCE.getPreOrPostTypeObject();

		/**
		 * The meta object literal for the '<em>Pre Or Post Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.w3.namespace.impl.NamespacePackageImpl#getPreOrPostTypeObject1()
		 * @generated
		 */
		EDataType PRE_OR_POST_TYPE_OBJECT1 = eINSTANCE.getPreOrPostTypeObject1();

	}

} //NamespacePackage
