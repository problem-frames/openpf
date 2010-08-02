/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.situation.impl;

import eu.securechange.situation.Action;
import eu.securechange.situation.Activity;
import eu.securechange.situation.Actor;
import eu.securechange.situation.Argues;
import eu.securechange.situation.Asset;
import eu.securechange.situation.Attack;
import eu.securechange.situation.Attacker;
import eu.securechange.situation.BeliefWorld;
import eu.securechange.situation.Consumes;
import eu.securechange.situation.Contributes;
import eu.securechange.situation.ContributionLabel;
import eu.securechange.situation.Damages;
import eu.securechange.situation.Decomposes;
import eu.securechange.situation.DecompositionLabel;
import eu.securechange.situation.DependencyType;
import eu.securechange.situation.Depends;
import eu.securechange.situation.Does;
import eu.securechange.situation.Domain;
import eu.securechange.situation.DomainType;
import eu.securechange.situation.Entity;
import eu.securechange.situation.Event;
import eu.securechange.situation.Exploits;
import eu.securechange.situation.Fulfils;
import eu.securechange.situation.HumanActivity;
import eu.securechange.situation.NaturalProcess;
import eu.securechange.situation.PhysicalWorld;
import eu.securechange.situation.Proposition;
import eu.securechange.situation.PropositionType;
import eu.securechange.situation.Provides;
import eu.securechange.situation.Relationship;
import eu.securechange.situation.Resource;
import eu.securechange.situation.Situation;
import eu.securechange.situation.SituationFactory;
import eu.securechange.situation.SituationPackage;
import eu.securechange.situation.Stakeholder;
import eu.securechange.situation.Thing;
import eu.securechange.situation.Wants;
import eu.securechange.situation.World;

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
public class SituationFactoryImpl extends EFactoryImpl implements SituationFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static SituationFactory init()
  {
		try {
			SituationFactory theSituationFactory = (SituationFactory)EPackage.Registry.INSTANCE.getEFactory("http://securechange.eu/situation"); 
			if (theSituationFactory != null) {
				return theSituationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SituationFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SituationFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case SituationPackage.SITUATION: return createSituation();
			case SituationPackage.WORLD: return createWorld();
			case SituationPackage.THING: return createThing();
			case SituationPackage.EVENT: return createEvent();
			case SituationPackage.OBJECT: return createObject();
			case SituationPackage.PHYSICAL_WORLD: return createPhysicalWorld();
			case SituationPackage.BELIEF_WORLD: return createBeliefWorld();
			case SituationPackage.PROPOSITION: return createProposition();
			case SituationPackage.ENTITY: return createEntity();
			case SituationPackage.DOMAIN: return createDomain();
			case SituationPackage.ACTOR: return createActor();
			case SituationPackage.STAKEHOLDER: return createStakeholder();
			case SituationPackage.ATTACKER: return createAttacker();
			case SituationPackage.PROCESS: return createProcess();
			case SituationPackage.NATURAL_PROCESS: return createNaturalProcess();
			case SituationPackage.HUMAN_ACTIVITY: return createHumanActivity();
			case SituationPackage.ACTION: return createAction();
			case SituationPackage.RESOURCE: return createResource();
			case SituationPackage.ASSET: return createAsset();
			case SituationPackage.RELATIONSHIP: return createRelationship();
			case SituationPackage.WANTS: return createWants();
			case SituationPackage.DOES: return createDoes();
			case SituationPackage.DECOMPOSES: return createDecomposes();
			case SituationPackage.CONTRIBUTES: return createContributes();
			case SituationPackage.FULFILS: return createFulfils();
			case SituationPackage.DEPENDS: return createDepends();
			case SituationPackage.PROVIDES: return createProvides();
			case SituationPackage.CONSUMES: return createConsumes();
			case SituationPackage.EXPLOITS: return createExploits();
			case SituationPackage.DAMAGES: return createDamages();
			case SituationPackage.ATTACK: return createAttack();
			case SituationPackage.ARGUES: return createArgues();
			case SituationPackage.ACTIVITY: return createActivity();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case SituationPackage.PROPOSITION_TYPE:
				return createPropositionTypeFromString(eDataType, initialValue);
			case SituationPackage.DOMAIN_TYPE:
				return createDomainTypeFromString(eDataType, initialValue);
			case SituationPackage.DECOMPOSITION_LABEL:
				return createDecompositionLabelFromString(eDataType, initialValue);
			case SituationPackage.CONTRIBUTION_LABEL:
				return createContributionLabelFromString(eDataType, initialValue);
			case SituationPackage.DEPENDENCY_TYPE:
				return createDependencyTypeFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case SituationPackage.PROPOSITION_TYPE:
				return convertPropositionTypeToString(eDataType, instanceValue);
			case SituationPackage.DOMAIN_TYPE:
				return convertDomainTypeToString(eDataType, instanceValue);
			case SituationPackage.DECOMPOSITION_LABEL:
				return convertDecompositionLabelToString(eDataType, instanceValue);
			case SituationPackage.CONTRIBUTION_LABEL:
				return convertContributionLabelToString(eDataType, instanceValue);
			case SituationPackage.DEPENDENCY_TYPE:
				return convertDependencyTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Situation createSituation()
  {
		SituationImpl situation = new SituationImpl();
		return situation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public World createWorld()
  {
		WorldImpl world = new WorldImpl();
		return world;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Thing createThing()
  {
		ThingImpl thing = new ThingImpl();
		return thing;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Event createEvent()
  {
		EventImpl event = new EventImpl();
		return event;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public eu.securechange.situation.Object createObject()
  {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PhysicalWorld createPhysicalWorld()
  {
		PhysicalWorldImpl physicalWorld = new PhysicalWorldImpl();
		return physicalWorld;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BeliefWorld createBeliefWorld()
  {
		BeliefWorldImpl beliefWorld = new BeliefWorldImpl();
		return beliefWorld;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Proposition createProposition()
  {
		PropositionImpl proposition = new PropositionImpl();
		return proposition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Entity createEntity()
  {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Domain createDomain()
  {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Actor createActor()
  {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Stakeholder createStakeholder()
  {
		StakeholderImpl stakeholder = new StakeholderImpl();
		return stakeholder;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Attacker createAttacker()
  {
		AttackerImpl attacker = new AttackerImpl();
		return attacker;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public eu.securechange.situation.Process createProcess()
  {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NaturalProcess createNaturalProcess()
  {
		NaturalProcessImpl naturalProcess = new NaturalProcessImpl();
		return naturalProcess;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HumanActivity createHumanActivity()
  {
		HumanActivityImpl humanActivity = new HumanActivityImpl();
		return humanActivity;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Action createAction()
  {
		ActionImpl action = new ActionImpl();
		return action;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Resource createResource()
  {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Asset createAsset()
  {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Relationship createRelationship()
  {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Wants createWants()
  {
		WantsImpl wants = new WantsImpl();
		return wants;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Does createDoes()
  {
		DoesImpl does = new DoesImpl();
		return does;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Decomposes createDecomposes()
  {
		DecomposesImpl decomposes = new DecomposesImpl();
		return decomposes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Contributes createContributes()
  {
		ContributesImpl contributes = new ContributesImpl();
		return contributes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Fulfils createFulfils()
  {
		FulfilsImpl fulfils = new FulfilsImpl();
		return fulfils;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Depends createDepends()
  {
		DependsImpl depends = new DependsImpl();
		return depends;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Provides createProvides()
  {
		ProvidesImpl provides = new ProvidesImpl();
		return provides;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Consumes createConsumes()
  {
		ConsumesImpl consumes = new ConsumesImpl();
		return consumes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Exploits createExploits()
  {
		ExploitsImpl exploits = new ExploitsImpl();
		return exploits;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Damages createDamages()
  {
		DamagesImpl damages = new DamagesImpl();
		return damages;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Attack createAttack()
  {
		AttackImpl attack = new AttackImpl();
		return attack;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Argues createArgues()
  {
		ArguesImpl argues = new ArguesImpl();
		return argues;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Activity createActivity()
  {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PropositionType createPropositionTypeFromString(EDataType eDataType, String initialValue)
  {
		PropositionType result = PropositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertPropositionTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DomainType createDomainTypeFromString(EDataType eDataType, String initialValue)
  {
		DomainType result = DomainType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertDomainTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DecompositionLabel createDecompositionLabelFromString(EDataType eDataType, String initialValue)
  {
		DecompositionLabel result = DecompositionLabel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertDecompositionLabelToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ContributionLabel createContributionLabelFromString(EDataType eDataType, String initialValue)
  {
		ContributionLabel result = ContributionLabel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertContributionLabelToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DependencyType createDependencyTypeFromString(EDataType eDataType, String initialValue)
  {
		DependencyType result = DependencyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertDependencyTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SituationPackage getSituationPackage()
  {
		return (SituationPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static SituationPackage getPackage()
  {
		return SituationPackage.eINSTANCE;
	}

} //SituationFactoryImpl
