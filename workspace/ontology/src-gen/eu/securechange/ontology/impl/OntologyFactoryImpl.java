/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.impl;

import eu.securechange.ontology.Action;
import eu.securechange.ontology.Activity;
import eu.securechange.ontology.Actor;
import eu.securechange.ontology.Argues;
import eu.securechange.ontology.Asset;
import eu.securechange.ontology.Attacker;
import eu.securechange.ontology.Attacks;
import eu.securechange.ontology.BeliefWorld;
import eu.securechange.ontology.Consumes;
import eu.securechange.ontology.Contributes;
import eu.securechange.ontology.ContributesType;
import eu.securechange.ontology.Damages;
import eu.securechange.ontology.Decomposes;
import eu.securechange.ontology.DecomposesType;
import eu.securechange.ontology.Delegates;
import eu.securechange.ontology.Does;
import eu.securechange.ontology.Domain;
import eu.securechange.ontology.DomainType;
import eu.securechange.ontology.Entity;
import eu.securechange.ontology.Event;
import eu.securechange.ontology.Exploits;
import eu.securechange.ontology.Fulfils;
import eu.securechange.ontology.FulfilsType;
import eu.securechange.ontology.HumanActivity;
import eu.securechange.ontology.NaturalProcess;
import eu.securechange.ontology.OntologyFactory;
import eu.securechange.ontology.OntologyPackage;
import eu.securechange.ontology.PhysicalWorld;
import eu.securechange.ontology.Proposition;
import eu.securechange.ontology.PropositionType;
import eu.securechange.ontology.Provides;
import eu.securechange.ontology.Relationship;
import eu.securechange.ontology.Resource;
import eu.securechange.ontology.Situation;
import eu.securechange.ontology.Stakeholder;
import eu.securechange.ontology.Thing;
import eu.securechange.ontology.Trusts;
import eu.securechange.ontology.Wants;
import eu.securechange.ontology.World;

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
    try
    {
      OntologyFactory theOntologyFactory = (OntologyFactory)EPackage.Registry.INSTANCE.getEFactory("http://securechange.eu/ontology"); 
      if (theOntologyFactory != null)
      {
        return theOntologyFactory;
      }
    }
    catch (Exception exception)
    {
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
    switch (eClass.getClassifierID())
    {
      case OntologyPackage.SITUATION: return createSituation();
      case OntologyPackage.WORLD: return createWorld();
      case OntologyPackage.THING: return createThing();
      case OntologyPackage.EVENT: return createEvent();
      case OntologyPackage.OBJECT: return createObject();
      case OntologyPackage.PHYSICAL_WORLD: return createPhysicalWorld();
      case OntologyPackage.BELIEF_WORLD: return createBeliefWorld();
      case OntologyPackage.DOMAIN: return createDomain();
      case OntologyPackage.PROPOSITION: return createProposition();
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
    switch (eDataType.getClassifierID())
    {
      case OntologyPackage.DOMAIN_TYPE:
        return createDomainTypeFromString(eDataType, initialValue);
      case OntologyPackage.PROPOSITION_TYPE:
        return createPropositionTypeFromString(eDataType, initialValue);
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
    switch (eDataType.getClassifierID())
    {
      case OntologyPackage.DOMAIN_TYPE:
        return convertDomainTypeToString(eDataType, instanceValue);
      case OntologyPackage.PROPOSITION_TYPE:
        return convertPropositionTypeToString(eDataType, instanceValue);
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
  public eu.securechange.ontology.Object createObject()
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
  public eu.securechange.ontology.Process createProcess()
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
