/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.impl;

import edu.toronto.cs.openome_model.*;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Openome_modelFactoryImpl extends EFactoryImpl implements Openome_modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Openome_modelFactory init() {
		try {
			Openome_modelFactory theopenome_modelFactory = (Openome_modelFactory)EPackage.Registry.INSTANCE.getEFactory("http:///edu/toronto/cs/openome_model.ecore"); 
			if (theopenome_modelFactory != null) {
				return theopenome_modelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Openome_modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Openome_modelFactoryImpl() {
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
			case Openome_modelPackage.ACTOR: return createActor();
			case Openome_modelPackage.AGENT: return createAgent();
			case Openome_modelPackage.AND_DECOMPOSITION: return createAndDecomposition();
			case Openome_modelPackage.CONTRIBUTION: return createContribution();
			case Openome_modelPackage.DECOMPOSITION: return createDecomposition();
			case Openome_modelPackage.DEPENDENCY: return createDependency();
			case Openome_modelPackage.GOAL: return createGoal();
			case Openome_modelPackage.INTENTION: return createIntention();
			case Openome_modelPackage.MODEL: return createModel();
			case Openome_modelPackage.OR_DECOMPOSITION: return createOrDecomposition();
			case Openome_modelPackage.POSITION: return createPosition();
			case Openome_modelPackage.PROPERTY: return createProperty();
			case Openome_modelPackage.RESOURCE: return createResource();
			case Openome_modelPackage.ROLE: return createRole();
			case Openome_modelPackage.SOFTGOAL: return createSoftgoal();
			case Openome_modelPackage.TASK: return createTask();
			case Openome_modelPackage.BELIEF: return createBelief();
			case Openome_modelPackage.CORRELATION: return createCorrelation();
			case Openome_modelPackage.HELP_CONTRIBUTION: return createHelpContribution();
			case Openome_modelPackage.HURT_CONTRIBUTION: return createHurtContribution();
			case Openome_modelPackage.MAKE_CONTRIBUTION: return createMakeContribution();
			case Openome_modelPackage.BREAK_CONTRIBUTION: return createBreakContribution();
			case Openome_modelPackage.SOME_PLUS_CONTRIBUTION: return createSomePlusContribution();
			case Openome_modelPackage.SOME_MINUS_CONTRIBUTION: return createSomeMinusContribution();
			case Openome_modelPackage.UNKNOWN_CONTRIBUTION: return createUnknownContribution();
			case Openome_modelPackage.AND_CONTRIBUTION: return createAndContribution();
			case Openome_modelPackage.OR_CONTRIBUTION: return createOrContribution();
			case Openome_modelPackage.ASSOCIATION: return createAssociation();
			case Openome_modelPackage.IS_AASSOCIATION: return createIsAAssociation();
			case Openome_modelPackage.COVERS_ASSOCIATION: return createCoversAssociation();
			case Openome_modelPackage.IS_PART_OF_ASSOCIATION: return createIsPartOfAssociation();
			case Openome_modelPackage.OCCUPIES_ASSOCIATION: return createOccupiesAssociation();
			case Openome_modelPackage.PLAYS_ASSOCIATION: return createPlaysAssociation();
			case Openome_modelPackage.INS_ASSOCIATION: return createINSAssociation();
			case Openome_modelPackage.ALTERNATIVE: return createAlternative();
			case Openome_modelPackage.INTENTION_TO_EVALUATION_LABEL_MAP: return (EObject)createIntentionToEvaluationLabelMap();
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
			case Openome_modelPackage.EVALUATION_LABEL:
				return createEvaluationLabelFromString(eDataType, initialValue);
			case Openome_modelPackage.GOAL_MODELING_CONTRIBUTION_TYPE:
				return createGoalModelingContributionTypeFromString(eDataType, initialValue);
			case Openome_modelPackage.GOAL_MODELING_CONTRIBUTION_SYMMETRY:
				return createGoalModelingContributionSymmetryFromString(eDataType, initialValue);
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
			case Openome_modelPackage.EVALUATION_LABEL:
				return convertEvaluationLabelToString(eDataType, instanceValue);
			case Openome_modelPackage.GOAL_MODELING_CONTRIBUTION_TYPE:
				return convertGoalModelingContributionTypeToString(eDataType, instanceValue);
			case Openome_modelPackage.GOAL_MODELING_CONTRIBUTION_SYMMETRY:
				return convertGoalModelingContributionSymmetryToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndDecomposition createAndDecomposition() {
		AndDecompositionImpl andDecomposition = new AndDecompositionImpl();
		return andDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contribution createContribution() {
		ContributionImpl contribution = new ContributionImpl();
		return contribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decomposition createDecomposition() {
		DecompositionImpl decomposition = new DecompositionImpl();
		return decomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intention createIntention() {
		IntentionImpl intention = new IntentionImpl();
		return intention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrDecomposition createOrDecomposition() {
		OrDecompositionImpl orDecomposition = new OrDecompositionImpl();
		return orDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Softgoal createSoftgoal() {
		SoftgoalImpl softgoal = new SoftgoalImpl();
		return softgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Belief createBelief() {
		BeliefImpl belief = new BeliefImpl();
		return belief;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correlation createCorrelation() {
		CorrelationImpl correlation = new CorrelationImpl();
		return correlation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpContribution createHelpContribution() {
		HelpContributionImpl helpContribution = new HelpContributionImpl();
		return helpContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HurtContribution createHurtContribution() {
		HurtContributionImpl hurtContribution = new HurtContributionImpl();
		return hurtContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakeContribution createMakeContribution() {
		MakeContributionImpl makeContribution = new MakeContributionImpl();
		return makeContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakContribution createBreakContribution() {
		BreakContributionImpl breakContribution = new BreakContributionImpl();
		return breakContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SomePlusContribution createSomePlusContribution() {
		SomePlusContributionImpl somePlusContribution = new SomePlusContributionImpl();
		return somePlusContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SomeMinusContribution createSomeMinusContribution() {
		SomeMinusContributionImpl someMinusContribution = new SomeMinusContributionImpl();
		return someMinusContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownContribution createUnknownContribution() {
		UnknownContributionImpl unknownContribution = new UnknownContributionImpl();
		return unknownContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndContribution createAndContribution() {
		AndContributionImpl andContribution = new AndContributionImpl();
		return andContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrContribution createOrContribution() {
		OrContributionImpl orContribution = new OrContributionImpl();
		return orContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsAAssociation createIsAAssociation() {
		IsAAssociationImpl isAAssociation = new IsAAssociationImpl();
		return isAAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoversAssociation createCoversAssociation() {
		CoversAssociationImpl coversAssociation = new CoversAssociationImpl();
		return coversAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsPartOfAssociation createIsPartOfAssociation() {
		IsPartOfAssociationImpl isPartOfAssociation = new IsPartOfAssociationImpl();
		return isPartOfAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupiesAssociation createOccupiesAssociation() {
		OccupiesAssociationImpl occupiesAssociation = new OccupiesAssociationImpl();
		return occupiesAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaysAssociation createPlaysAssociation() {
		PlaysAssociationImpl playsAssociation = new PlaysAssociationImpl();
		return playsAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INSAssociation createINSAssociation() {
		INSAssociationImpl insAssociation = new INSAssociationImpl();
		return insAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Intention, EvaluationLabel> createIntentionToEvaluationLabelMap() {
		IntentionToEvaluationLabelMapImpl intentionToEvaluationLabelMap = new IntentionToEvaluationLabelMapImpl();
		return intentionToEvaluationLabelMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationLabel createEvaluationLabelFromString(EDataType eDataType, String initialValue) {
		EvaluationLabel result = EvaluationLabel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvaluationLabelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModelingContributionType createGoalModelingContributionTypeFromString(EDataType eDataType, String initialValue) {
		GoalModelingContributionType result = GoalModelingContributionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalModelingContributionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalModelingContributionSymmetry createGoalModelingContributionSymmetryFromString(EDataType eDataType, String initialValue) {
		GoalModelingContributionSymmetry result = GoalModelingContributionSymmetry.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalModelingContributionSymmetryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Openome_modelPackage getopenome_modelPackage() {
		return (Openome_modelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Openome_modelPackage getPackage() {
		return Openome_modelPackage.eINSTANCE;
	}

} //openome_modelFactoryImpl
