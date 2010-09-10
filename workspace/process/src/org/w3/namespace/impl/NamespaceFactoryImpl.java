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
			case NamespacePackage.KIND:
				return createKindFromString(eDataType, initialValue);
			case NamespacePackage.KIND1:
				return createKind1FromString(eDataType, initialValue);
			case NamespacePackage.KIND2:
				return createKind2FromString(eDataType, initialValue);
			case NamespacePackage.KIND3:
				return createKind3FromString(eDataType, initialValue);
			case NamespacePackage.KIND4:
				return createKind4FromString(eDataType, initialValue);
			case NamespacePackage.PRE_OR_POST:
				return createPreOrPostFromString(eDataType, initialValue);
			case NamespacePackage.PRE_OR_POST1:
				return createPreOrPost1FromString(eDataType, initialValue);
			case NamespacePackage.CONTINUATION_ACTION_OBJECT:
				return createContinuationActionObjectFromString(eDataType, initialValue);
			case NamespacePackage.ENCODING_OBJECT:
				return createEncodingObjectFromString(eDataType, initialValue);
			case NamespacePackage.KIND_OBJECT:
				return createKindObjectFromString(eDataType, initialValue);
			case NamespacePackage.KIND_OBJECT1:
				return createKindObject1FromString(eDataType, initialValue);
			case NamespacePackage.KIND_OBJECT2:
				return createKindObject2FromString(eDataType, initialValue);
			case NamespacePackage.KIND_OBJECT3:
				return createKindObject3FromString(eDataType, initialValue);
			case NamespacePackage.KIND_OBJECT4:
				return createKindObject4FromString(eDataType, initialValue);
			case NamespacePackage.PRE_OR_POST_OBJECT:
				return createPreOrPostObjectFromString(eDataType, initialValue);
			case NamespacePackage.PRE_OR_POST_OBJECT1:
				return createPreOrPostObject1FromString(eDataType, initialValue);
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
			case NamespacePackage.KIND:
				return convertKindToString(eDataType, instanceValue);
			case NamespacePackage.KIND1:
				return convertKind1ToString(eDataType, instanceValue);
			case NamespacePackage.KIND2:
				return convertKind2ToString(eDataType, instanceValue);
			case NamespacePackage.KIND3:
				return convertKind3ToString(eDataType, instanceValue);
			case NamespacePackage.KIND4:
				return convertKind4ToString(eDataType, instanceValue);
			case NamespacePackage.PRE_OR_POST:
				return convertPreOrPostToString(eDataType, instanceValue);
			case NamespacePackage.PRE_OR_POST1:
				return convertPreOrPost1ToString(eDataType, instanceValue);
			case NamespacePackage.CONTINUATION_ACTION_OBJECT:
				return convertContinuationActionObjectToString(eDataType, instanceValue);
			case NamespacePackage.ENCODING_OBJECT:
				return convertEncodingObjectToString(eDataType, instanceValue);
			case NamespacePackage.KIND_OBJECT:
				return convertKindObjectToString(eDataType, instanceValue);
			case NamespacePackage.KIND_OBJECT1:
				return convertKindObject1ToString(eDataType, instanceValue);
			case NamespacePackage.KIND_OBJECT2:
				return convertKindObject2ToString(eDataType, instanceValue);
			case NamespacePackage.KIND_OBJECT3:
				return convertKindObject3ToString(eDataType, instanceValue);
			case NamespacePackage.KIND_OBJECT4:
				return convertKindObject4ToString(eDataType, instanceValue);
			case NamespacePackage.PRE_OR_POST_OBJECT:
				return convertPreOrPostObjectToString(eDataType, instanceValue);
			case NamespacePackage.PRE_OR_POST_OBJECT1:
				return convertPreOrPostObject1ToString(eDataType, instanceValue);
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
	public Kind createKindFromString(EDataType eDataType, String initialValue) {
		Kind result = Kind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind1 createKind1FromString(EDataType eDataType, String initialValue) {
		Kind1 result = Kind1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKind1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind2 createKind2FromString(EDataType eDataType, String initialValue) {
		Kind2 result = Kind2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKind2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind3 createKind3FromString(EDataType eDataType, String initialValue) {
		Kind3 result = Kind3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKind3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind4 createKind4FromString(EDataType eDataType, String initialValue) {
		Kind4 result = Kind4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKind4ToString(EDataType eDataType, Object instanceValue) {
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
	public Enumerator createKindObjectFromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createKindObject1FromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindObject1ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createKindObject2FromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindObject2ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createKindObject3FromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindObject3ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createKindObject4FromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindObject4ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createPreOrPostObjectFromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreOrPostObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createPreOrPostObject1FromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreOrPostObject1ToString(EDataType eDataType, Object instanceValue) {
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
