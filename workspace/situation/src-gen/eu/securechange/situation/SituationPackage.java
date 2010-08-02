/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.situation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see eu.securechange.situation.SituationFactory
 * @model kind="package"
 * @generated
 */
public interface SituationPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "situation";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://securechange.eu/situation";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "situation";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SituationPackage eINSTANCE = eu.securechange.situation.impl.SituationPackageImpl.init();

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.SituationImpl <em>Situation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.SituationImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getSituation()
	 * @generated
	 */
  int SITUATION = 0;

  /**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SITUATION__TIME = 0;

  /**
	 * The feature id for the '<em><b>World</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SITUATION__WORLD = 1;

  /**
	 * The number of structural features of the '<em>Situation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SITUATION_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.WorldImpl <em>World</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.WorldImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getWorld()
	 * @generated
	 */
  int WORLD = 1;

  /**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORLD__ENTITIES = 0;

  /**
	 * The feature id for the '<em><b>Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORLD__DOMAINS = 1;

  /**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORLD__RELATIONSHIPS = 2;

  /**
	 * The number of structural features of the '<em>World</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORLD_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.ThingImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getThing()
	 * @generated
	 */
  int THING = 2;

  /**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THING_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.EventImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getEvent()
	 * @generated
	 */
  int EVENT = 3;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT__NAME = THING_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_FEATURE_COUNT = THING_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.ObjectImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getObject()
	 * @generated
	 */
  int OBJECT = 4;

  /**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_FEATURE_COUNT = THING_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.PhysicalWorldImpl <em>Physical World</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.PhysicalWorldImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getPhysicalWorld()
	 * @generated
	 */
  int PHYSICAL_WORLD = 5;

  /**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WORLD__ENTITIES = 0;

  /**
	 * The number of structural features of the '<em>Physical World</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WORLD_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.BeliefWorldImpl <em>Belief World</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.BeliefWorldImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getBeliefWorld()
	 * @generated
	 */
  int BELIEF_WORLD = 6;

  /**
	 * The feature id for the '<em><b>Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BELIEF_WORLD__DOMAINS = 0;

  /**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BELIEF_WORLD__RELATIONSHIPS = 1;

  /**
	 * The number of structural features of the '<em>Belief World</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BELIEF_WORLD_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.PropositionImpl <em>Proposition</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.PropositionImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getProposition()
	 * @generated
	 */
  int PROPOSITION = 7;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPOSITION__TYPE = OBJECT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPOSITION__NAME = OBJECT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Proposition</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPOSITION_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.EntityImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getEntity()
	 * @generated
	 */
  int ENTITY = 8;

  /**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENTITY_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.DomainImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getDomain()
	 * @generated
	 */
  int DOMAIN = 9;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOMAIN__TYPE = 0;

  /**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOMAIN__PROPERTIES = 1;

  /**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOMAIN_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.ActorImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getActor()
	 * @generated
	 */
  int ACTOR = 10;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTOR__NAME = ENTITY_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTOR_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.StakeholderImpl <em>Stakeholder</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.StakeholderImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getStakeholder()
	 * @generated
	 */
  int STAKEHOLDER = 11;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAKEHOLDER__NAME = ACTOR__NAME;

  /**
	 * The number of structural features of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAKEHOLDER_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.AttackerImpl <em>Attacker</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.AttackerImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getAttacker()
	 * @generated
	 */
  int ATTACKER = 12;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTACKER__NAME = ACTOR__NAME;

  /**
	 * The number of structural features of the '<em>Attacker</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTACKER_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.ProcessImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getProcess()
	 * @generated
	 */
  int PROCESS = 13;

  /**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCESS_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.NaturalProcessImpl <em>Natural Process</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.NaturalProcessImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getNaturalProcess()
	 * @generated
	 */
  int NATURAL_PROCESS = 14;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NATURAL_PROCESS__NAME = PROCESS_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NATURAL_PROCESS__ACTIVITIES = PROCESS_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Natural Process</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NATURAL_PROCESS_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.HumanActivityImpl <em>Human Activity</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.HumanActivityImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getHumanActivity()
	 * @generated
	 */
  int HUMAN_ACTIVITY = 15;

  /**
	 * The number of structural features of the '<em>Human Activity</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HUMAN_ACTIVITY_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.ActionImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getAction()
	 * @generated
	 */
  int ACTION = 16;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTION__NAME = 0;

  /**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTION_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.ResourceImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getResource()
	 * @generated
	 */
  int RESOURCE = 17;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESOURCE__NAME = ENTITY_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESOURCE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.AssetImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getAsset()
	 * @generated
	 */
  int ASSET = 18;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSET__NAME = RESOURCE__NAME;

  /**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSET_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.RelationshipImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getRelationship()
	 * @generated
	 */
  int RELATIONSHIP = 19;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONSHIP__NAME = OBJECT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONSHIP__THINGS = OBJECT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONSHIP_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.WantsImpl <em>Wants</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.WantsImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getWants()
	 * @generated
	 */
  int WANTS = 20;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WANTS__NAME = RELATIONSHIP__NAME;

  /**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WANTS__THINGS = RELATIONSHIP__THINGS;

  /**
	 * The number of structural features of the '<em>Wants</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WANTS_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.DoesImpl <em>Does</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.DoesImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getDoes()
	 * @generated
	 */
  int DOES = 21;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOES__NAME = RELATIONSHIP__NAME;

  /**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOES__THINGS = RELATIONSHIP__THINGS;

  /**
	 * The number of structural features of the '<em>Does</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.DecomposesImpl <em>Decomposes</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.DecomposesImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getDecomposes()
	 * @generated
	 */
  int DECOMPOSES = 22;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSES__NAME = RELATIONSHIP__NAME;

  /**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSES__THINGS = RELATIONSHIP__THINGS;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSES__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Decomposes</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.ContributesImpl <em>Contributes</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.ContributesImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getContributes()
	 * @generated
	 */
  int CONTRIBUTES = 23;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRIBUTES__NAME = RELATIONSHIP__NAME;

  /**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRIBUTES__THINGS = RELATIONSHIP__THINGS;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRIBUTES__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Contributes</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRIBUTES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.FulfilsImpl <em>Fulfils</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.FulfilsImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getFulfils()
	 * @generated
	 */
  int FULFILS = 24;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FULFILS__NAME = RELATIONSHIP__NAME;

  /**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FULFILS__THINGS = RELATIONSHIP__THINGS;

  /**
	 * The number of structural features of the '<em>Fulfils</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FULFILS_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.DependsImpl <em>Depends</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.DependsImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getDepends()
	 * @generated
	 */
  int DEPENDS = 25;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDS__NAME = RELATIONSHIP__NAME;

  /**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDS__THINGS = RELATIONSHIP__THINGS;

  /**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDS__KIND = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Depends</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDS_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.ProvidesImpl <em>Provides</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.ProvidesImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getProvides()
	 * @generated
	 */
  int PROVIDES = 26;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROVIDES__NAME = RELATIONSHIP__NAME;

  /**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROVIDES__THINGS = RELATIONSHIP__THINGS;

  /**
	 * The number of structural features of the '<em>Provides</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROVIDES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.ConsumesImpl <em>Consumes</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.ConsumesImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getConsumes()
	 * @generated
	 */
  int CONSUMES = 27;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONSUMES__NAME = RELATIONSHIP__NAME;

  /**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONSUMES__THINGS = RELATIONSHIP__THINGS;

  /**
	 * The number of structural features of the '<em>Consumes</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONSUMES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.ExploitsImpl <em>Exploits</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.ExploitsImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getExploits()
	 * @generated
	 */
  int EXPLOITS = 28;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPLOITS__NAME = RELATIONSHIP__NAME;

  /**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPLOITS__THINGS = RELATIONSHIP__THINGS;

  /**
	 * The number of structural features of the '<em>Exploits</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPLOITS_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.DamagesImpl <em>Damages</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.DamagesImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getDamages()
	 * @generated
	 */
  int DAMAGES = 29;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DAMAGES__NAME = RELATIONSHIP__NAME;

  /**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DAMAGES__THINGS = RELATIONSHIP__THINGS;

  /**
	 * The number of structural features of the '<em>Damages</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DAMAGES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.AttackImpl <em>Attack</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.AttackImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getAttack()
	 * @generated
	 */
  int ATTACK = 30;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTACK__NAME = RELATIONSHIP__NAME;

  /**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTACK__THINGS = RELATIONSHIP__THINGS;

  /**
	 * The number of structural features of the '<em>Attack</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTACK_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.ArguesImpl <em>Argues</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.ArguesImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getArgues()
	 * @generated
	 */
  int ARGUES = 31;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARGUES__NAME = RELATIONSHIP__NAME;

  /**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARGUES__THINGS = RELATIONSHIP__THINGS;

  /**
	 * The number of structural features of the '<em>Argues</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARGUES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.impl.ActivityImpl
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getActivity()
	 * @generated
	 */
  int ACTIVITY = 32;

  /**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY__ACTIONS = HUMAN_ACTIVITY_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTIVITY_FEATURE_COUNT = HUMAN_ACTIVITY_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.PropositionType <em>Proposition Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.PropositionType
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getPropositionType()
	 * @generated
	 */
  int PROPOSITION_TYPE = 33;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.DomainType <em>Domain Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.DomainType
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getDomainType()
	 * @generated
	 */
  int DOMAIN_TYPE = 34;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.DecompositionLabel <em>Decomposition Label</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.DecompositionLabel
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getDecompositionLabel()
	 * @generated
	 */
  int DECOMPOSITION_LABEL = 35;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.ContributionLabel <em>Contribution Label</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.ContributionLabel
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getContributionLabel()
	 * @generated
	 */
  int CONTRIBUTION_LABEL = 36;

  /**
	 * The meta object id for the '{@link eu.securechange.situation.DependencyType <em>Dependency Type</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eu.securechange.situation.DependencyType
	 * @see eu.securechange.situation.impl.SituationPackageImpl#getDependencyType()
	 * @generated
	 */
  int DEPENDENCY_TYPE = 37;


  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Situation <em>Situation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Situation</em>'.
	 * @see eu.securechange.situation.Situation
	 * @generated
	 */
  EClass getSituation();

  /**
	 * Returns the meta object for the attribute '{@link eu.securechange.situation.Situation#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see eu.securechange.situation.Situation#getTime()
	 * @see #getSituation()
	 * @generated
	 */
  EAttribute getSituation_Time();

  /**
	 * Returns the meta object for the containment reference '{@link eu.securechange.situation.Situation#getWorld <em>World</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>World</em>'.
	 * @see eu.securechange.situation.Situation#getWorld()
	 * @see #getSituation()
	 * @generated
	 */
  EReference getSituation_World();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.World <em>World</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World</em>'.
	 * @see eu.securechange.situation.World
	 * @generated
	 */
  EClass getWorld();

  /**
	 * Returns the meta object for the containment reference list '{@link eu.securechange.situation.World#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see eu.securechange.situation.World#getEntities()
	 * @see #getWorld()
	 * @generated
	 */
  EReference getWorld_Entities();

  /**
	 * Returns the meta object for the containment reference list '{@link eu.securechange.situation.World#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domains</em>'.
	 * @see eu.securechange.situation.World#getDomains()
	 * @see #getWorld()
	 * @generated
	 */
  EReference getWorld_Domains();

  /**
	 * Returns the meta object for the containment reference list '{@link eu.securechange.situation.World#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see eu.securechange.situation.World#getRelationships()
	 * @see #getWorld()
	 * @generated
	 */
  EReference getWorld_Relationships();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see eu.securechange.situation.Thing
	 * @generated
	 */
  EClass getThing();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see eu.securechange.situation.Event
	 * @generated
	 */
  EClass getEvent();

  /**
	 * Returns the meta object for the attribute '{@link eu.securechange.situation.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.securechange.situation.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
  EAttribute getEvent_Name();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see eu.securechange.situation.Object
	 * @generated
	 */
  EClass getObject();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.PhysicalWorld <em>Physical World</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical World</em>'.
	 * @see eu.securechange.situation.PhysicalWorld
	 * @generated
	 */
  EClass getPhysicalWorld();

  /**
	 * Returns the meta object for the containment reference list '{@link eu.securechange.situation.PhysicalWorld#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see eu.securechange.situation.PhysicalWorld#getEntities()
	 * @see #getPhysicalWorld()
	 * @generated
	 */
  EReference getPhysicalWorld_Entities();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.BeliefWorld <em>Belief World</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Belief World</em>'.
	 * @see eu.securechange.situation.BeliefWorld
	 * @generated
	 */
  EClass getBeliefWorld();

  /**
	 * Returns the meta object for the containment reference list '{@link eu.securechange.situation.BeliefWorld#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domains</em>'.
	 * @see eu.securechange.situation.BeliefWorld#getDomains()
	 * @see #getBeliefWorld()
	 * @generated
	 */
  EReference getBeliefWorld_Domains();

  /**
	 * Returns the meta object for the containment reference list '{@link eu.securechange.situation.BeliefWorld#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see eu.securechange.situation.BeliefWorld#getRelationships()
	 * @see #getBeliefWorld()
	 * @generated
	 */
  EReference getBeliefWorld_Relationships();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Proposition <em>Proposition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposition</em>'.
	 * @see eu.securechange.situation.Proposition
	 * @generated
	 */
  EClass getProposition();

  /**
	 * Returns the meta object for the attribute '{@link eu.securechange.situation.Proposition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.securechange.situation.Proposition#getType()
	 * @see #getProposition()
	 * @generated
	 */
  EAttribute getProposition_Type();

  /**
	 * Returns the meta object for the attribute '{@link eu.securechange.situation.Proposition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.securechange.situation.Proposition#getName()
	 * @see #getProposition()
	 * @generated
	 */
  EAttribute getProposition_Name();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see eu.securechange.situation.Entity
	 * @generated
	 */
  EClass getEntity();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see eu.securechange.situation.Domain
	 * @generated
	 */
  EClass getDomain();

  /**
	 * Returns the meta object for the attribute '{@link eu.securechange.situation.Domain#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.securechange.situation.Domain#getType()
	 * @see #getDomain()
	 * @generated
	 */
  EAttribute getDomain_Type();

  /**
	 * Returns the meta object for the containment reference list '{@link eu.securechange.situation.Domain#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see eu.securechange.situation.Domain#getProperties()
	 * @see #getDomain()
	 * @generated
	 */
  EReference getDomain_Properties();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see eu.securechange.situation.Actor
	 * @generated
	 */
  EClass getActor();

  /**
	 * Returns the meta object for the attribute '{@link eu.securechange.situation.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.securechange.situation.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
  EAttribute getActor_Name();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stakeholder</em>'.
	 * @see eu.securechange.situation.Stakeholder
	 * @generated
	 */
  EClass getStakeholder();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Attacker <em>Attacker</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attacker</em>'.
	 * @see eu.securechange.situation.Attacker
	 * @generated
	 */
  EClass getAttacker();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see eu.securechange.situation.Process
	 * @generated
	 */
  EClass getProcess();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.NaturalProcess <em>Natural Process</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Process</em>'.
	 * @see eu.securechange.situation.NaturalProcess
	 * @generated
	 */
  EClass getNaturalProcess();

  /**
	 * Returns the meta object for the attribute '{@link eu.securechange.situation.NaturalProcess#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.securechange.situation.NaturalProcess#getName()
	 * @see #getNaturalProcess()
	 * @generated
	 */
  EAttribute getNaturalProcess_Name();

  /**
	 * Returns the meta object for the reference list '{@link eu.securechange.situation.NaturalProcess#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities</em>'.
	 * @see eu.securechange.situation.NaturalProcess#getActivities()
	 * @see #getNaturalProcess()
	 * @generated
	 */
  EReference getNaturalProcess_Activities();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.HumanActivity <em>Human Activity</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Activity</em>'.
	 * @see eu.securechange.situation.HumanActivity
	 * @generated
	 */
  EClass getHumanActivity();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see eu.securechange.situation.Action
	 * @generated
	 */
  EClass getAction();

  /**
	 * Returns the meta object for the attribute '{@link eu.securechange.situation.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.securechange.situation.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
  EAttribute getAction_Name();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see eu.securechange.situation.Resource
	 * @generated
	 */
  EClass getResource();

  /**
	 * Returns the meta object for the attribute '{@link eu.securechange.situation.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.securechange.situation.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
  EAttribute getResource_Name();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see eu.securechange.situation.Asset
	 * @generated
	 */
  EClass getAsset();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see eu.securechange.situation.Relationship
	 * @generated
	 */
  EClass getRelationship();

  /**
	 * Returns the meta object for the attribute '{@link eu.securechange.situation.Relationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.securechange.situation.Relationship#getName()
	 * @see #getRelationship()
	 * @generated
	 */
  EAttribute getRelationship_Name();

  /**
	 * Returns the meta object for the reference list '{@link eu.securechange.situation.Relationship#getThings <em>Things</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Things</em>'.
	 * @see eu.securechange.situation.Relationship#getThings()
	 * @see #getRelationship()
	 * @generated
	 */
  EReference getRelationship_Things();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Wants <em>Wants</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wants</em>'.
	 * @see eu.securechange.situation.Wants
	 * @generated
	 */
  EClass getWants();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Does <em>Does</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Does</em>'.
	 * @see eu.securechange.situation.Does
	 * @generated
	 */
  EClass getDoes();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Decomposes <em>Decomposes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposes</em>'.
	 * @see eu.securechange.situation.Decomposes
	 * @generated
	 */
  EClass getDecomposes();

  /**
	 * Returns the meta object for the attribute '{@link eu.securechange.situation.Decomposes#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.securechange.situation.Decomposes#getType()
	 * @see #getDecomposes()
	 * @generated
	 */
  EAttribute getDecomposes_Type();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Contributes <em>Contributes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributes</em>'.
	 * @see eu.securechange.situation.Contributes
	 * @generated
	 */
  EClass getContributes();

  /**
	 * Returns the meta object for the attribute '{@link eu.securechange.situation.Contributes#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.securechange.situation.Contributes#getType()
	 * @see #getContributes()
	 * @generated
	 */
  EAttribute getContributes_Type();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Fulfils <em>Fulfils</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fulfils</em>'.
	 * @see eu.securechange.situation.Fulfils
	 * @generated
	 */
  EClass getFulfils();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Depends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depends</em>'.
	 * @see eu.securechange.situation.Depends
	 * @generated
	 */
  EClass getDepends();

  /**
	 * Returns the meta object for the attribute '{@link eu.securechange.situation.Depends#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see eu.securechange.situation.Depends#getKind()
	 * @see #getDepends()
	 * @generated
	 */
  EAttribute getDepends_Kind();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Provides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides</em>'.
	 * @see eu.securechange.situation.Provides
	 * @generated
	 */
  EClass getProvides();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Consumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumes</em>'.
	 * @see eu.securechange.situation.Consumes
	 * @generated
	 */
  EClass getConsumes();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Exploits <em>Exploits</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exploits</em>'.
	 * @see eu.securechange.situation.Exploits
	 * @generated
	 */
  EClass getExploits();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Damages <em>Damages</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Damages</em>'.
	 * @see eu.securechange.situation.Damages
	 * @generated
	 */
  EClass getDamages();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Attack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attack</em>'.
	 * @see eu.securechange.situation.Attack
	 * @generated
	 */
  EClass getAttack();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Argues <em>Argues</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argues</em>'.
	 * @see eu.securechange.situation.Argues
	 * @generated
	 */
  EClass getArgues();

  /**
	 * Returns the meta object for class '{@link eu.securechange.situation.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see eu.securechange.situation.Activity
	 * @generated
	 */
  EClass getActivity();

  /**
	 * Returns the meta object for the containment reference list '{@link eu.securechange.situation.Activity#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see eu.securechange.situation.Activity#getActions()
	 * @see #getActivity()
	 * @generated
	 */
  EReference getActivity_Actions();

  /**
	 * Returns the meta object for enum '{@link eu.securechange.situation.PropositionType <em>Proposition Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Proposition Type</em>'.
	 * @see eu.securechange.situation.PropositionType
	 * @generated
	 */
  EEnum getPropositionType();

  /**
	 * Returns the meta object for enum '{@link eu.securechange.situation.DomainType <em>Domain Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Domain Type</em>'.
	 * @see eu.securechange.situation.DomainType
	 * @generated
	 */
  EEnum getDomainType();

  /**
	 * Returns the meta object for enum '{@link eu.securechange.situation.DecompositionLabel <em>Decomposition Label</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decomposition Label</em>'.
	 * @see eu.securechange.situation.DecompositionLabel
	 * @generated
	 */
  EEnum getDecompositionLabel();

  /**
	 * Returns the meta object for enum '{@link eu.securechange.situation.ContributionLabel <em>Contribution Label</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contribution Label</em>'.
	 * @see eu.securechange.situation.ContributionLabel
	 * @generated
	 */
  EEnum getContributionLabel();

  /**
	 * Returns the meta object for enum '{@link eu.securechange.situation.DependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependency Type</em>'.
	 * @see eu.securechange.situation.DependencyType
	 * @generated
	 */
  EEnum getDependencyType();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  SituationFactory getSituationFactory();

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
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.SituationImpl <em>Situation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.SituationImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getSituation()
		 * @generated
		 */
    EClass SITUATION = eINSTANCE.getSituation();

    /**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SITUATION__TIME = eINSTANCE.getSituation_Time();

    /**
		 * The meta object literal for the '<em><b>World</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SITUATION__WORLD = eINSTANCE.getSituation_World();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.WorldImpl <em>World</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.WorldImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getWorld()
		 * @generated
		 */
    EClass WORLD = eINSTANCE.getWorld();

    /**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WORLD__ENTITIES = eINSTANCE.getWorld_Entities();

    /**
		 * The meta object literal for the '<em><b>Domains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WORLD__DOMAINS = eINSTANCE.getWorld_Domains();

    /**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WORLD__RELATIONSHIPS = eINSTANCE.getWorld_Relationships();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.ThingImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getThing()
		 * @generated
		 */
    EClass THING = eINSTANCE.getThing();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.EventImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getEvent()
		 * @generated
		 */
    EClass EVENT = eINSTANCE.getEvent();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.ObjectImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getObject()
		 * @generated
		 */
    EClass OBJECT = eINSTANCE.getObject();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.PhysicalWorldImpl <em>Physical World</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.PhysicalWorldImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getPhysicalWorld()
		 * @generated
		 */
    EClass PHYSICAL_WORLD = eINSTANCE.getPhysicalWorld();

    /**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PHYSICAL_WORLD__ENTITIES = eINSTANCE.getPhysicalWorld_Entities();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.BeliefWorldImpl <em>Belief World</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.BeliefWorldImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getBeliefWorld()
		 * @generated
		 */
    EClass BELIEF_WORLD = eINSTANCE.getBeliefWorld();

    /**
		 * The meta object literal for the '<em><b>Domains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference BELIEF_WORLD__DOMAINS = eINSTANCE.getBeliefWorld_Domains();

    /**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference BELIEF_WORLD__RELATIONSHIPS = eINSTANCE.getBeliefWorld_Relationships();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.PropositionImpl <em>Proposition</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.PropositionImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getProposition()
		 * @generated
		 */
    EClass PROPOSITION = eINSTANCE.getProposition();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PROPOSITION__TYPE = eINSTANCE.getProposition_Type();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PROPOSITION__NAME = eINSTANCE.getProposition_Name();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.EntityImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getEntity()
		 * @generated
		 */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.DomainImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getDomain()
		 * @generated
		 */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DOMAIN__TYPE = eINSTANCE.getDomain_Type();

    /**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOMAIN__PROPERTIES = eINSTANCE.getDomain_Properties();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.ActorImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getActor()
		 * @generated
		 */
    EClass ACTOR = eINSTANCE.getActor();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.StakeholderImpl <em>Stakeholder</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.StakeholderImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getStakeholder()
		 * @generated
		 */
    EClass STAKEHOLDER = eINSTANCE.getStakeholder();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.AttackerImpl <em>Attacker</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.AttackerImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getAttacker()
		 * @generated
		 */
    EClass ATTACKER = eINSTANCE.getAttacker();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.ProcessImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getProcess()
		 * @generated
		 */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.NaturalProcessImpl <em>Natural Process</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.NaturalProcessImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getNaturalProcess()
		 * @generated
		 */
    EClass NATURAL_PROCESS = eINSTANCE.getNaturalProcess();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NATURAL_PROCESS__NAME = eINSTANCE.getNaturalProcess_Name();

    /**
		 * The meta object literal for the '<em><b>Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference NATURAL_PROCESS__ACTIVITIES = eINSTANCE.getNaturalProcess_Activities();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.HumanActivityImpl <em>Human Activity</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.HumanActivityImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getHumanActivity()
		 * @generated
		 */
    EClass HUMAN_ACTIVITY = eINSTANCE.getHumanActivity();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.ActionImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getAction()
		 * @generated
		 */
    EClass ACTION = eINSTANCE.getAction();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.ResourceImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getResource()
		 * @generated
		 */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.AssetImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getAsset()
		 * @generated
		 */
    EClass ASSET = eINSTANCE.getAsset();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.RelationshipImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getRelationship()
		 * @generated
		 */
    EClass RELATIONSHIP = eINSTANCE.getRelationship();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RELATIONSHIP__NAME = eINSTANCE.getRelationship_Name();

    /**
		 * The meta object literal for the '<em><b>Things</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RELATIONSHIP__THINGS = eINSTANCE.getRelationship_Things();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.WantsImpl <em>Wants</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.WantsImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getWants()
		 * @generated
		 */
    EClass WANTS = eINSTANCE.getWants();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.DoesImpl <em>Does</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.DoesImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getDoes()
		 * @generated
		 */
    EClass DOES = eINSTANCE.getDoes();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.DecomposesImpl <em>Decomposes</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.DecomposesImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getDecomposes()
		 * @generated
		 */
    EClass DECOMPOSES = eINSTANCE.getDecomposes();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DECOMPOSES__TYPE = eINSTANCE.getDecomposes_Type();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.ContributesImpl <em>Contributes</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.ContributesImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getContributes()
		 * @generated
		 */
    EClass CONTRIBUTES = eINSTANCE.getContributes();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CONTRIBUTES__TYPE = eINSTANCE.getContributes_Type();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.FulfilsImpl <em>Fulfils</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.FulfilsImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getFulfils()
		 * @generated
		 */
    EClass FULFILS = eINSTANCE.getFulfils();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.DependsImpl <em>Depends</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.DependsImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getDepends()
		 * @generated
		 */
    EClass DEPENDS = eINSTANCE.getDepends();

    /**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DEPENDS__KIND = eINSTANCE.getDepends_Kind();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.ProvidesImpl <em>Provides</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.ProvidesImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getProvides()
		 * @generated
		 */
    EClass PROVIDES = eINSTANCE.getProvides();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.ConsumesImpl <em>Consumes</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.ConsumesImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getConsumes()
		 * @generated
		 */
    EClass CONSUMES = eINSTANCE.getConsumes();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.ExploitsImpl <em>Exploits</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.ExploitsImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getExploits()
		 * @generated
		 */
    EClass EXPLOITS = eINSTANCE.getExploits();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.DamagesImpl <em>Damages</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.DamagesImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getDamages()
		 * @generated
		 */
    EClass DAMAGES = eINSTANCE.getDamages();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.AttackImpl <em>Attack</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.AttackImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getAttack()
		 * @generated
		 */
    EClass ATTACK = eINSTANCE.getAttack();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.ArguesImpl <em>Argues</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.ArguesImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getArgues()
		 * @generated
		 */
    EClass ARGUES = eINSTANCE.getArgues();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.impl.ActivityImpl
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getActivity()
		 * @generated
		 */
    EClass ACTIVITY = eINSTANCE.getActivity();

    /**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTIVITY__ACTIONS = eINSTANCE.getActivity_Actions();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.PropositionType <em>Proposition Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.PropositionType
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getPropositionType()
		 * @generated
		 */
    EEnum PROPOSITION_TYPE = eINSTANCE.getPropositionType();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.DomainType <em>Domain Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.DomainType
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getDomainType()
		 * @generated
		 */
    EEnum DOMAIN_TYPE = eINSTANCE.getDomainType();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.DecompositionLabel <em>Decomposition Label</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.DecompositionLabel
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getDecompositionLabel()
		 * @generated
		 */
    EEnum DECOMPOSITION_LABEL = eINSTANCE.getDecompositionLabel();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.ContributionLabel <em>Contribution Label</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.ContributionLabel
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getContributionLabel()
		 * @generated
		 */
    EEnum CONTRIBUTION_LABEL = eINSTANCE.getContributionLabel();

    /**
		 * The meta object literal for the '{@link eu.securechange.situation.DependencyType <em>Dependency Type</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eu.securechange.situation.DependencyType
		 * @see eu.securechange.situation.impl.SituationPackageImpl#getDependencyType()
		 * @generated
		 */
    EEnum DEPENDENCY_TYPE = eINSTANCE.getDependencyType();

  }

} //SituationPackage
