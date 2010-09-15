/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology.impl;

import eu.securechange.ontology.ontology.Action;
import eu.securechange.ontology.ontology.Activity;
import eu.securechange.ontology.ontology.Actor;
import eu.securechange.ontology.ontology.AntiRequirement;
import eu.securechange.ontology.ontology.Argues;
import eu.securechange.ontology.ontology.Argument;
import eu.securechange.ontology.ontology.Asset;
import eu.securechange.ontology.ontology.Attacker;
import eu.securechange.ontology.ontology.Attacks;
import eu.securechange.ontology.ontology.Consumes;
import eu.securechange.ontology.ontology.Contributes;
import eu.securechange.ontology.ontology.ContributesType;
import eu.securechange.ontology.ontology.Damages;
import eu.securechange.ontology.ontology.Decomposes;
import eu.securechange.ontology.ontology.DecomposesType;
import eu.securechange.ontology.ontology.Delegates;
import eu.securechange.ontology.ontology.Does;
import eu.securechange.ontology.ontology.Domain;
import eu.securechange.ontology.ontology.DomainAssumption;
import eu.securechange.ontology.ontology.DomainType;
import eu.securechange.ontology.ontology.Entity;
import eu.securechange.ontology.ontology.Event;
import eu.securechange.ontology.ontology.Exploits;
import eu.securechange.ontology.ontology.Fulfils;
import eu.securechange.ontology.ontology.FulfilsType;
import eu.securechange.ontology.ontology.FunctionalRequirement;
import eu.securechange.ontology.ontology.HumanActivity;
import eu.securechange.ontology.ontology.NaturalProcess;
import eu.securechange.ontology.ontology.OntologyFactory;
import eu.securechange.ontology.ontology.OntologyPackage;
import eu.securechange.ontology.ontology.Proposition;
import eu.securechange.ontology.ontology.Provides;
import eu.securechange.ontology.ontology.QualityRequirement;
import eu.securechange.ontology.ontology.Relationship;
import eu.securechange.ontology.ontology.Requirement;
import eu.securechange.ontology.ontology.Resource;
import eu.securechange.ontology.ontology.SecurityRequirement;
import eu.securechange.ontology.ontology.Situation;
import eu.securechange.ontology.ontology.Stakeholder;
import eu.securechange.ontology.ontology.Thing;
import eu.securechange.ontology.ontology.Trusts;
import eu.securechange.ontology.ontology.Wants;
import eu.securechange.ontology.ontology.World;

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
public class OntologyFactoryImpl extends EFactoryImpl implements OntologyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static OntologyFactory init()
  {
		try {
			OntologyFactory theOntologyFactory = (OntologyFactory)EPackage.Registry.INSTANCE.getEFactory("http://securechange.eu/ontology"); 
			if (theOntologyFactory != null) {
				return theOntologyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OntologyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OntologyFactoryImpl()
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
			case OntologyPackage.SITUATION: return createSituation();
			case OntologyPackage.WORLD: return createWorld();
			case OntologyPackage.THING: return createThing();
			case OntologyPackage.EVENT: return createEvent();
			case OntologyPackage.OBJECT: return createObject();
			case OntologyPackage.DOMAIN: return createDomain();
			case OntologyPackage.PROPOSITION: return createProposition();
			case OntologyPackage.REQUIREMENT: return createRequirement();
			case OntologyPackage.DOMAIN_ASSUMPTION: return createDomainAssumption();
			case OntologyPackage.FUNCTIONAL_REQUIREMENT: return createFunctionalRequirement();
			case OntologyPackage.SECURITY_REQUIREMENT: return createSecurityRequirement();
			case OntologyPackage.ANTI_REQUIREMENT: return createAntiRequirement();
			case OntologyPackage.QUALITY_REQUIREMENT: return createQualityRequirement();
			case OntologyPackage.ARGUMENT: return createArgument();
			case OntologyPackage.ENTITY: return createEntity();
			case OntologyPackage.ACTOR: return createActor();
			case OntologyPackage.STAKEHOLDER: return createStakeholder();
			case OntologyPackage.ATTACKER: return createAttacker();
			case OntologyPackage.PROCESS: return createProcess();
			case OntologyPackage.NATURAL_PROCESS: return createNaturalProcess();
			case OntologyPackage.HUMAN_ACTIVITY: return createHumanActivity();
			case OntologyPackage.ACTION: return createAction();
			case OntologyPackage.RESOURCE: return createResource();
			case OntologyPackage.ASSET: return createAsset();
			case OntologyPackage.RELATIONSHIP: return createRelationship();
			case OntologyPackage.WANTS: return createWants();
			case OntologyPackage.DOES: return createDoes();
			case OntologyPackage.DECOMPOSES: return createDecomposes();
			case OntologyPackage.TRUSTS: return createTrusts();
			case OntologyPackage.DELEGATES: return createDelegates();
			case OntologyPackage.CONTRIBUTES: return createContributes();
			case OntologyPackage.FULFILS: return createFulfils();
			case OntologyPackage.PROVIDES: return createProvides();
			case OntologyPackage.CONSUMES: return createConsumes();
			case OntologyPackage.EXPLOITS: return createExploits();
			case OntologyPackage.DAMAGES: return createDamages();
			case OntologyPackage.ATTACKS: return createAttacks();
			case OntologyPackage.ARGUES: return createArgues();
			case OntologyPackage.ACTIVITY: return createActivity();
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
			case OntologyPackage.DOMAIN_TYPE:
				return createDomainTypeFromString(eDataType, initialValue);
			case OntologyPackage.DECOMPOSES_TYPE:
				return createDecomposesTypeFromString(eDataType, initialValue);
			case OntologyPackage.CONTRIBUTES_TYPE:
				return createContributesTypeFromString(eDataType, initialValue);
			case OntologyPackage.FULFILS_TYPE:
				return createFulfilsTypeFromString(eDataType, initialValue);
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
			case OntologyPackage.DOMAIN_TYPE:
				return convertDomainTypeToString(eDataType, instanceValue);
			case OntologyPackage.DECOMPOSES_TYPE:
				return convertDecomposesTypeToString(eDataType, instanceValue);
			case OntologyPackage.CONTRIBUTES_TYPE:
				return convertContributesTypeToString(eDataType, instanceValue);
			case OntologyPackage.FULFILS_TYPE:
				return convertFulfilsTypeToString(eDataType, instanceValue);
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
  public eu.securechange.ontology.ontology.Object createObject()
  {
		ObjectImpl object = new ObjectImpl();
		return object;
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
  public Requirement createRequirement()
  {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DomainAssumption createDomainAssumption()
  {
		DomainAssumptionImpl domainAssumption = new DomainAssumptionImpl();
		return domainAssumption;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FunctionalRequirement createFunctionalRequirement()
  {
		FunctionalRequirementImpl functionalRequirement = new FunctionalRequirementImpl();
		return functionalRequirement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SecurityRequirement createSecurityRequirement()
  {
		SecurityRequirementImpl securityRequirement = new SecurityRequirementImpl();
		return securityRequirement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AntiRequirement createAntiRequirement()
  {
		AntiRequirementImpl antiRequirement = new AntiRequirementImpl();
		return antiRequirement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public QualityRequirement createQualityRequirement()
  {
		QualityRequirementImpl qualityRequirement = new QualityRequirementImpl();
		return qualityRequirement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Argument createArgument()
  {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
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
  public eu.securechange.ontology.ontology.Process createProcess()
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
  public Trusts createTrusts()
  {
		TrustsImpl trusts = new TrustsImpl();
		return trusts;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Delegates createDelegates()
  {
		DelegatesImpl delegates = new DelegatesImpl();
		return delegates;
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
  public Attacks createAttacks()
  {
		AttacksImpl attacks = new AttacksImpl();
		return attacks;
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
  public DecomposesType createDecomposesTypeFromString(EDataType eDataType, String initialValue)
  {
		DecomposesType result = DecomposesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertDecomposesTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ContributesType createContributesTypeFromString(EDataType eDataType, String initialValue)
  {
		ContributesType result = ContributesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertContributesTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FulfilsType createFulfilsTypeFromString(EDataType eDataType, String initialValue)
  {
		FulfilsType result = FulfilsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertFulfilsTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OntologyPackage getOntologyPackage()
  {
		return (OntologyPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static OntologyPackage getPackage()
  {
		return OntologyPackage.eINSTANCE;
	}

} //OntologyFactoryImpl
