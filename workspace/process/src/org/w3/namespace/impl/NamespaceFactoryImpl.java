/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace.impl;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.w3.namespace.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamespaceFactoryImpl extends EFactoryImpl implements NamespaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NamespaceFactory init() {
		try {
			NamespaceFactory theNamespaceFactory = (NamespaceFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.w3.org/namespace/"); 
			if (theNamespaceFactory != null) {
				return theNamespaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NamespaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NamespacePackage.ABORTER: return createAborter();
			case NamespacePackage.AGGREGATE: return createAggregate();
			case NamespacePackage.ANNOTATION: return createAnnotation();
			case NamespacePackage.BINDING: return createBinding();
			case NamespacePackage.CARDINALITY: return createCardinality();
			case NamespacePackage.CHANNEL_BINDING: return createChannelBinding();
			case NamespacePackage.CONNECTOR: return createConnector();
			case NamespacePackage.CONSTANT_BINDING: return createConstantBinding();
			case NamespacePackage.CONTROL_PARAMETER: return createControlParameter();
			case NamespacePackage.DIAGRAM: return createDiagram();
			case NamespacePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case NamespacePackage.EXPORT: return createExport();
			case NamespacePackage.EXTERNAL_OBJECT: return createExternalObject();
			case NamespacePackage.FIELD: return createField();
			case NamespacePackage.HANDLER_CONNECTOR: return createHandlerConnector();
			case NamespacePackage.IMPORT: return createImport();
			case NamespacePackage.INTERFACE_DECL: return createInterfaceDecl();
			case NamespacePackage.LITTLEJIL: return createLittlejil();
			case NamespacePackage.LOCATION: return createLocation();
			case NamespacePackage.METADATA: return createMetadata();
			case NamespacePackage.MODULE: return createModule();
			case NamespacePackage.NULL_AGGREGATE: return createNullAggregate();
			case NamespacePackage.POST_IT: return createPostIt();
			case NamespacePackage.PREDICATE_EXPRESSION: return createPredicateExpression();
			case NamespacePackage.REACTION_CONNECTOR: return createReactionConnector();
			case NamespacePackage.REQUISITE_CONNECTOR: return createRequisiteConnector();
			case NamespacePackage.SCOPE_BINDING: return createScopeBinding();
			case NamespacePackage.SIMPLE_REQUISITE_CONNECTOR: return createSimpleRequisiteConnector();
			case NamespacePackage.STEP_DECLARATION: return createStepDeclaration();
			case NamespacePackage.STEP_REFERENCE: return createStepReference();
			case NamespacePackage.SUBSTEP_CONNECTOR: return createSubstepConnector();
			case NamespacePackage.TAGGED_LOCATION: return createTaggedLocation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case NamespacePackage.CONTINUATION_ACTION:
				return createContinuationActionFromString(eDataType, initialValue);
			case NamespacePackage.ENCODING:
				return createEncodingFromString(eDataType, initialValue);
			case NamespacePackage.KIND_TYPE:
				return createKindTypeFromString(eDataType, initialValue);
			case NamespacePackage.KIND_TYPE1:
				return createKindType1FromString(eDataType, initialValue);
			case NamespacePackage.KIND_TYPE2:
				return createKindType2FromString(eDataType, initialValue);
			case NamespacePackage.KIND_TYPE3:
				return createKindType3FromString(eDataType, initialValue);
			case NamespacePackage.KIND_TYPE4:
				return createKindType4FromString(eDataType, initialValue);
			case NamespacePackage.PRE_OR_POST:
				return createPreOrPostFromString(eDataType, initialValue);
			case NamespacePackage.PRE_OR_POST1:
				return createPreOrPost1FromString(eDataType, initialValue);
			case NamespacePackage.CONTINUATION_ACTION_OBJECT:
				return createContinuationActionObjectFromString(eDataType, initialValue);
			case NamespacePackage.ENCODING_OBJECT:
				return createEncodingObjectFromString(eDataType, initialValue);
			case NamespacePackage.KIND_TYPE_OBJECT:
				return createKindTypeObjectFromString(eDataType, initialValue);
			case NamespacePackage.KIND_TYPE_OBJECT1:
				return createKindTypeObject1FromString(eDataType, initialValue);
			case NamespacePackage.KIND_TYPE_OBJECT2:
				return createKindTypeObject2FromString(eDataType, initialValue);
			case NamespacePackage.KIND_TYPE_OBJECT3:
				return createKindTypeObject3FromString(eDataType, initialValue);
			case NamespacePackage.KIND_TYPE_OBJECT4:
				return createKindTypeObject4FromString(eDataType, initialValue);
			case NamespacePackage.PRE_OR_POST_TYPE_OBJECT:
				return createPreOrPostTypeObjectFromString(eDataType, initialValue);
			case NamespacePackage.PRE_OR_POST_TYPE_OBJECT1:
				return createPreOrPostTypeObject1FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case NamespacePackage.CONTINUATION_ACTION:
				return convertContinuationActionToString(eDataType, instanceValue);
			case NamespacePackage.ENCODING:
				return convertEncodingToString(eDataType, instanceValue);
			case NamespacePackage.KIND_TYPE:
				return convertKindTypeToString(eDataType, instanceValue);
			case NamespacePackage.KIND_TYPE1:
				return convertKindType1ToString(eDataType, instanceValue);
			case NamespacePackage.KIND_TYPE2:
				return convertKindType2ToString(eDataType, instanceValue);
			case NamespacePackage.KIND_TYPE3:
				return convertKindType3ToString(eDataType, instanceValue);
			case NamespacePackage.KIND_TYPE4:
				return convertKindType4ToString(eDataType, instanceValue);
			case NamespacePackage.PRE_OR_POST:
				return convertPreOrPostToString(eDataType, instanceValue);
			case NamespacePackage.PRE_OR_POST1:
				return convertPreOrPost1ToString(eDataType, instanceValue);
			case NamespacePackage.CONTINUATION_ACTION_OBJECT:
				return convertContinuationActionObjectToString(eDataType, instanceValue);
			case NamespacePackage.ENCODING_OBJECT:
				return convertEncodingObjectToString(eDataType, instanceValue);
			case NamespacePackage.KIND_TYPE_OBJECT:
				return convertKindTypeObjectToString(eDataType, instanceValue);
			case NamespacePackage.KIND_TYPE_OBJECT1:
				return convertKindTypeObject1ToString(eDataType, instanceValue);
			case NamespacePackage.KIND_TYPE_OBJECT2:
				return convertKindTypeObject2ToString(eDataType, instanceValue);
			case NamespacePackage.KIND_TYPE_OBJECT3:
				return convertKindTypeObject3ToString(eDataType, instanceValue);
			case NamespacePackage.KIND_TYPE_OBJECT4:
				return convertKindTypeObject4ToString(eDataType, instanceValue);
			case NamespacePackage.PRE_OR_POST_TYPE_OBJECT:
				return convertPreOrPostTypeObjectToString(eDataType, instanceValue);
			case NamespacePackage.PRE_OR_POST_TYPE_OBJECT1:
				return convertPreOrPostTypeObject1ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aborter createAborter() {
		AborterImpl aborter = new AborterImpl();
		return aborter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregate createAggregate() {
		AggregateImpl aggregate = new AggregateImpl();
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinality() {
		CardinalityImpl cardinality = new CardinalityImpl();
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelBinding createChannelBinding() {
		ChannelBindingImpl channelBinding = new ChannelBindingImpl();
		return channelBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantBinding createConstantBinding() {
		ConstantBindingImpl constantBinding = new ConstantBindingImpl();
		return constantBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlParameter createControlParameter() {
		ControlParameterImpl controlParameter = new ControlParameterImpl();
		return controlParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Export createExport() {
		ExportImpl export = new ExportImpl();
		return export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalObject createExternalObject() {
		ExternalObjectImpl externalObject = new ExternalObjectImpl();
		return externalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlerConnector createHandlerConnector() {
		HandlerConnectorImpl handlerConnector = new HandlerConnectorImpl();
		return handlerConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDecl createInterfaceDecl() {
		InterfaceDeclImpl interfaceDecl = new InterfaceDeclImpl();
		return interfaceDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Littlejil createLittlejil() {
		LittlejilImpl littlejil = new LittlejilImpl();
		return littlejil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullAggregate createNullAggregate() {
		NullAggregateImpl nullAggregate = new NullAggregateImpl();
		return nullAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostIt createPostIt() {
		PostItImpl postIt = new PostItImpl();
		return postIt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateExpression createPredicateExpression() {
		PredicateExpressionImpl predicateExpression = new PredicateExpressionImpl();
		return predicateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionConnector createReactionConnector() {
		ReactionConnectorImpl reactionConnector = new ReactionConnectorImpl();
		return reactionConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequisiteConnector createRequisiteConnector() {
		RequisiteConnectorImpl requisiteConnector = new RequisiteConnectorImpl();
		return requisiteConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeBinding createScopeBinding() {
		ScopeBindingImpl scopeBinding = new ScopeBindingImpl();
		return scopeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRequisiteConnector createSimpleRequisiteConnector() {
		SimpleRequisiteConnectorImpl simpleRequisiteConnector = new SimpleRequisiteConnectorImpl();
		return simpleRequisiteConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepDeclaration createStepDeclaration() {
		StepDeclarationImpl stepDeclaration = new StepDeclarationImpl();
		return stepDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepReference createStepReference() {
		StepReferenceImpl stepReference = new StepReferenceImpl();
		return stepReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstepConnector createSubstepConnector() {
		SubstepConnectorImpl substepConnector = new SubstepConnectorImpl();
		return substepConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaggedLocation createTaggedLocation() {
		TaggedLocationImpl taggedLocation = new TaggedLocationImpl();
		return taggedLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationAction createContinuationActionFromString(EDataType eDataType, String initialValue) {
		ContinuationAction result = ContinuationAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encoding createEncodingFromString(EDataType eDataType, String initialValue) {
		Encoding result = Encoding.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindType createKindTypeFromString(EDataType eDataType, String initialValue) {
		KindType result = KindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindType1 createKindType1FromString(EDataType eDataType, String initialValue) {
		KindType1 result = KindType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindType2 createKindType2FromString(EDataType eDataType, String initialValue) {
		KindType2 result = KindType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindType3 createKindType3FromString(EDataType eDataType, String initialValue) {
		KindType3 result = KindType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindType4 createKindType4FromString(EDataType eDataType, String initialValue) {
		KindType4 result = KindType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreOrPost createPreOrPostFromString(EDataType eDataType, String initialValue) {
		PreOrPost result = PreOrPost.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreOrPostToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreOrPost1 createPreOrPost1FromString(EDataType eDataType, String initialValue) {
		PreOrPost1 result = PreOrPost1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreOrPost1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createContinuationActionObjectFromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContinuationActionObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createEncodingObjectFromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodingObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createKindTypeObject1FromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createKindTypeObject2FromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createKindTypeObject3FromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createKindTypeObject4FromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createPreOrPostTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreOrPostTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createPreOrPostTypeObject1FromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreOrPostTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacePackage getNamespacePackage() {
		return (NamespacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NamespacePackage getPackage() {
		return NamespacePackage.eINSTANCE;
	}

} //NamespaceFactoryImpl
