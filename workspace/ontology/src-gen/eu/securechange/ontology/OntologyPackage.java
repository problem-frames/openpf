/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology;

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
 * @see eu.securechange.ontology.OntologyFactory
 * @model kind="package"
 * @generated
 */
public interface OntologyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ontology";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://securechange.eu/ontology";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ontology";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OntologyPackage eINSTANCE = eu.securechange.ontology.impl.OntologyPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.SituationImpl <em>Situation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.SituationImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getSituation()
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
   * The meta object id for the '{@link eu.securechange.ontology.impl.WorldImpl <em>World</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.WorldImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getWorld()
   * @generated
   */
  int WORLD = 1;

  /**
   * The feature id for the '<em><b>Physical</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORLD__PHYSICAL = 0;

  /**
   * The feature id for the '<em><b>Belief</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORLD__BELIEF = 1;

  /**
   * The number of structural features of the '<em>World</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORLD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.ThingImpl <em>Thing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.ThingImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getThing()
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
   * The meta object id for the '{@link eu.securechange.ontology.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.EventImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getEvent()
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
   * The meta object id for the '{@link eu.securechange.ontology.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.ObjectImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getObject()
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
   * The meta object id for the '{@link eu.securechange.ontology.impl.PhysicalWorldImpl <em>Physical World</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.PhysicalWorldImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getPhysicalWorld()
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
   * The meta object id for the '{@link eu.securechange.ontology.impl.BeliefWorldImpl <em>Belief World</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.BeliefWorldImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getBeliefWorld()
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
   * The meta object id for the '{@link eu.securechange.ontology.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.DomainImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__TYPE = 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__PROPERTIES = 2;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.PropositionImpl <em>Proposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.PropositionImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getProposition()
   * @generated
   */
  int PROPOSITION = 8;

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
   * The meta object id for the '{@link eu.securechange.ontology.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.EntityImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 9;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.ActorImpl <em>Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.ActorImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getActor()
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
   * The meta object id for the '{@link eu.securechange.ontology.impl.StakeholderImpl <em>Stakeholder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.StakeholderImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getStakeholder()
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
   * The meta object id for the '{@link eu.securechange.ontology.impl.AttackerImpl <em>Attacker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.AttackerImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getAttacker()
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
   * The meta object id for the '{@link eu.securechange.ontology.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.ProcessImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getProcess()
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
   * The meta object id for the '{@link eu.securechange.ontology.impl.NaturalProcessImpl <em>Natural Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.NaturalProcessImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getNaturalProcess()
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
   * The meta object id for the '{@link eu.securechange.ontology.impl.HumanActivityImpl <em>Human Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.HumanActivityImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getHumanActivity()
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
   * The meta object id for the '{@link eu.securechange.ontology.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.ActionImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getAction()
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
   * The meta object id for the '{@link eu.securechange.ontology.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.ResourceImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getResource()
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
   * The meta object id for the '{@link eu.securechange.ontology.impl.AssetImpl <em>Asset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.AssetImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getAsset()
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
   * The meta object id for the '{@link eu.securechange.ontology.impl.RelationshipImpl <em>Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.RelationshipImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getRelationship()
   * @generated
   */
  int RELATIONSHIP = 19;

  /**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.WantsImpl <em>Wants</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.WantsImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getWants()
   * @generated
   */
  int WANTS = 20;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WANTS__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WANTS__SOURCE = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WANTS__TARGET = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Wants</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WANTS_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.DoesImpl <em>Does</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.DoesImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getDoes()
   * @generated
   */
  int DOES = 21;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOES__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOES__SOURCE = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOES__TARGET = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Does</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.DecomposesImpl <em>Decomposes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.DecomposesImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getDecomposes()
   * @generated
   */
  int DECOMPOSES = 22;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSES__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSES__SOURCE = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSES__TARGET = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Decomposes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.TrustsImpl <em>Trusts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.TrustsImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getTrusts()
   * @generated
   */
  int TRUSTS = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUSTS__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUSTS__SOURCE = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUSTS__TARGET = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Trusts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUSTS_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.DelegatesImpl <em>Delegates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.DelegatesImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getDelegates()
   * @generated
   */
  int DELEGATES = 24;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELEGATES__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELEGATES__SOURCE = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELEGATES__TARGET = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Delegates</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELEGATES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.ContributesImpl <em>Contributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.ContributesImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getContributes()
   * @generated
   */
  int CONTRIBUTES = 25;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTES__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTES__SOURCE = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTES__TARGET = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Contributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.FulfilsImpl <em>Fulfils</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.FulfilsImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getFulfils()
   * @generated
   */
  int FULFILS = 26;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILS__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILS__SOURCE = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILS__TARGET = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Fulfils</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILS_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.ProvidesImpl <em>Provides</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.ProvidesImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getProvides()
   * @generated
   */
  int PROVIDES = 27;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDES__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDES__SOURCE = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDES__TARGET = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Provides</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.ConsumesImpl <em>Consumes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.ConsumesImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getConsumes()
   * @generated
   */
  int CONSUMES = 28;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMES__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMES__SOURCE = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMES__TARGET = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Consumes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSUMES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.ExploitsImpl <em>Exploits</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.ExploitsImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getExploits()
   * @generated
   */
  int EXPLOITS = 29;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLOITS__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLOITS__SOURCE = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLOITS__TARGET = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Exploits</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLOITS_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.DamagesImpl <em>Damages</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.DamagesImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getDamages()
   * @generated
   */
  int DAMAGES = 30;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAMAGES__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAMAGES__SOURCE = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAMAGES__TARGET = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Damages</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAMAGES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.AttacksImpl <em>Attacks</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.AttacksImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getAttacks()
   * @generated
   */
  int ATTACKS = 31;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACKS__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACKS__SOURCE = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACKS__TARGET = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Attacks</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACKS_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.ArguesImpl <em>Argues</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.ArguesImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getArgues()
   * @generated
   */
  int ARGUES = 32;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUES__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUES__SOURCE = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUES__TARGET = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Argues</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUES_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.impl.ActivityImpl <em>Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.impl.ActivityImpl
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getActivity()
   * @generated
   */
  int ACTIVITY = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__NAME = HUMAN_ACTIVITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__ACTIONS = HUMAN_ACTIVITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = HUMAN_ACTIVITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.DomainType <em>Domain Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.DomainType
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getDomainType()
   * @generated
   */
  int DOMAIN_TYPE = 34;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.PropositionType <em>Proposition Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.PropositionType
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getPropositionType()
   * @generated
   */
  int PROPOSITION_TYPE = 35;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.DecomposesType <em>Decomposes Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.DecomposesType
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getDecomposesType()
   * @generated
   */
  int DECOMPOSES_TYPE = 36;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ContributesType <em>Contributes Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ContributesType
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getContributesType()
   * @generated
   */
  int CONTRIBUTES_TYPE = 37;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.FulfilsType <em>Fulfils Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.FulfilsType
   * @see eu.securechange.ontology.impl.OntologyPackageImpl#getFulfilsType()
   * @generated
   */
  int FULFILS_TYPE = 38;


  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Situation <em>Situation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Situation</em>'.
   * @see eu.securechange.ontology.Situation
   * @generated
   */
  EClass getSituation();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Situation#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see eu.securechange.ontology.Situation#getTime()
   * @see #getSituation()
   * @generated
   */
  EAttribute getSituation_Time();

  /**
   * Returns the meta object for the containment reference '{@link eu.securechange.ontology.Situation#getWorld <em>World</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>World</em>'.
   * @see eu.securechange.ontology.Situation#getWorld()
   * @see #getSituation()
   * @generated
   */
  EReference getSituation_World();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.World <em>World</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>World</em>'.
   * @see eu.securechange.ontology.World
   * @generated
   */
  EClass getWorld();

  /**
   * Returns the meta object for the containment reference '{@link eu.securechange.ontology.World#getPhysical <em>Physical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Physical</em>'.
   * @see eu.securechange.ontology.World#getPhysical()
   * @see #getWorld()
   * @generated
   */
  EReference getWorld_Physical();

  /**
   * Returns the meta object for the containment reference '{@link eu.securechange.ontology.World#getBelief <em>Belief</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Belief</em>'.
   * @see eu.securechange.ontology.World#getBelief()
   * @see #getWorld()
   * @generated
   */
  EReference getWorld_Belief();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Thing <em>Thing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Thing</em>'.
   * @see eu.securechange.ontology.Thing
   * @generated
   */
  EClass getThing();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see eu.securechange.ontology.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.securechange.ontology.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see eu.securechange.ontology.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.PhysicalWorld <em>Physical World</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Physical World</em>'.
   * @see eu.securechange.ontology.PhysicalWorld
   * @generated
   */
  EClass getPhysicalWorld();

  /**
   * Returns the meta object for the containment reference list '{@link eu.securechange.ontology.PhysicalWorld#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see eu.securechange.ontology.PhysicalWorld#getEntities()
   * @see #getPhysicalWorld()
   * @generated
   */
  EReference getPhysicalWorld_Entities();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.BeliefWorld <em>Belief World</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Belief World</em>'.
   * @see eu.securechange.ontology.BeliefWorld
   * @generated
   */
  EClass getBeliefWorld();

  /**
   * Returns the meta object for the containment reference list '{@link eu.securechange.ontology.BeliefWorld#getDomains <em>Domains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Domains</em>'.
   * @see eu.securechange.ontology.BeliefWorld#getDomains()
   * @see #getBeliefWorld()
   * @generated
   */
  EReference getBeliefWorld_Domains();

  /**
   * Returns the meta object for the containment reference list '{@link eu.securechange.ontology.BeliefWorld#getRelationships <em>Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relationships</em>'.
   * @see eu.securechange.ontology.BeliefWorld#getRelationships()
   * @see #getBeliefWorld()
   * @generated
   */
  EReference getBeliefWorld_Relationships();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see eu.securechange.ontology.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Domain#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.securechange.ontology.Domain#getName()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_Name();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Domain#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.Domain#getType()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_Type();

  /**
   * Returns the meta object for the containment reference list '{@link eu.securechange.ontology.Domain#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see eu.securechange.ontology.Domain#getProperties()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Properties();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Proposition <em>Proposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proposition</em>'.
   * @see eu.securechange.ontology.Proposition
   * @generated
   */
  EClass getProposition();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Proposition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.Proposition#getType()
   * @see #getProposition()
   * @generated
   */
  EAttribute getProposition_Type();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Proposition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.securechange.ontology.Proposition#getName()
   * @see #getProposition()
   * @generated
   */
  EAttribute getProposition_Name();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see eu.securechange.ontology.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor</em>'.
   * @see eu.securechange.ontology.Actor
   * @generated
   */
  EClass getActor();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Actor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.securechange.ontology.Actor#getName()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Name();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Stakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stakeholder</em>'.
   * @see eu.securechange.ontology.Stakeholder
   * @generated
   */
  EClass getStakeholder();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Attacker <em>Attacker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attacker</em>'.
   * @see eu.securechange.ontology.Attacker
   * @generated
   */
  EClass getAttacker();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see eu.securechange.ontology.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.NaturalProcess <em>Natural Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Natural Process</em>'.
   * @see eu.securechange.ontology.NaturalProcess
   * @generated
   */
  EClass getNaturalProcess();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.NaturalProcess#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.securechange.ontology.NaturalProcess#getName()
   * @see #getNaturalProcess()
   * @generated
   */
  EAttribute getNaturalProcess_Name();

  /**
   * Returns the meta object for the reference list '{@link eu.securechange.ontology.NaturalProcess#getActivities <em>Activities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Activities</em>'.
   * @see eu.securechange.ontology.NaturalProcess#getActivities()
   * @see #getNaturalProcess()
   * @generated
   */
  EReference getNaturalProcess_Activities();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.HumanActivity <em>Human Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Human Activity</em>'.
   * @see eu.securechange.ontology.HumanActivity
   * @generated
   */
  EClass getHumanActivity();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see eu.securechange.ontology.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.securechange.ontology.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see eu.securechange.ontology.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Resource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.securechange.ontology.Resource#getName()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Name();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Asset <em>Asset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asset</em>'.
   * @see eu.securechange.ontology.Asset
   * @generated
   */
  EClass getAsset();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship</em>'.
   * @see eu.securechange.ontology.Relationship
   * @generated
   */
  EClass getRelationship();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Wants <em>Wants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wants</em>'.
   * @see eu.securechange.ontology.Wants
   * @generated
   */
  EClass getWants();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Wants#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.Wants#getType()
   * @see #getWants()
   * @generated
   */
  EAttribute getWants_Type();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Wants#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see eu.securechange.ontology.Wants#getSource()
   * @see #getWants()
   * @generated
   */
  EReference getWants_Source();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Wants#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.securechange.ontology.Wants#getTarget()
   * @see #getWants()
   * @generated
   */
  EReference getWants_Target();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Does <em>Does</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Does</em>'.
   * @see eu.securechange.ontology.Does
   * @generated
   */
  EClass getDoes();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Does#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.Does#getType()
   * @see #getDoes()
   * @generated
   */
  EAttribute getDoes_Type();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Does#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see eu.securechange.ontology.Does#getSource()
   * @see #getDoes()
   * @generated
   */
  EReference getDoes_Source();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Does#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.securechange.ontology.Does#getTarget()
   * @see #getDoes()
   * @generated
   */
  EReference getDoes_Target();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Decomposes <em>Decomposes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decomposes</em>'.
   * @see eu.securechange.ontology.Decomposes
   * @generated
   */
  EClass getDecomposes();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Decomposes#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.Decomposes#getType()
   * @see #getDecomposes()
   * @generated
   */
  EAttribute getDecomposes_Type();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Decomposes#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see eu.securechange.ontology.Decomposes#getSource()
   * @see #getDecomposes()
   * @generated
   */
  EReference getDecomposes_Source();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Decomposes#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.securechange.ontology.Decomposes#getTarget()
   * @see #getDecomposes()
   * @generated
   */
  EReference getDecomposes_Target();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Trusts <em>Trusts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trusts</em>'.
   * @see eu.securechange.ontology.Trusts
   * @generated
   */
  EClass getTrusts();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Trusts#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.Trusts#getType()
   * @see #getTrusts()
   * @generated
   */
  EAttribute getTrusts_Type();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Trusts#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see eu.securechange.ontology.Trusts#getSource()
   * @see #getTrusts()
   * @generated
   */
  EReference getTrusts_Source();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Trusts#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.securechange.ontology.Trusts#getTarget()
   * @see #getTrusts()
   * @generated
   */
  EReference getTrusts_Target();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Delegates <em>Delegates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delegates</em>'.
   * @see eu.securechange.ontology.Delegates
   * @generated
   */
  EClass getDelegates();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Delegates#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.Delegates#getType()
   * @see #getDelegates()
   * @generated
   */
  EAttribute getDelegates_Type();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Delegates#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see eu.securechange.ontology.Delegates#getSource()
   * @see #getDelegates()
   * @generated
   */
  EReference getDelegates_Source();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Delegates#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.securechange.ontology.Delegates#getTarget()
   * @see #getDelegates()
   * @generated
   */
  EReference getDelegates_Target();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Contributes <em>Contributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contributes</em>'.
   * @see eu.securechange.ontology.Contributes
   * @generated
   */
  EClass getContributes();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Contributes#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.Contributes#getType()
   * @see #getContributes()
   * @generated
   */
  EAttribute getContributes_Type();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Contributes#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see eu.securechange.ontology.Contributes#getSource()
   * @see #getContributes()
   * @generated
   */
  EReference getContributes_Source();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Contributes#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.securechange.ontology.Contributes#getTarget()
   * @see #getContributes()
   * @generated
   */
  EReference getContributes_Target();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Fulfils <em>Fulfils</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fulfils</em>'.
   * @see eu.securechange.ontology.Fulfils
   * @generated
   */
  EClass getFulfils();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Fulfils#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.Fulfils#getType()
   * @see #getFulfils()
   * @generated
   */
  EAttribute getFulfils_Type();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Fulfils#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see eu.securechange.ontology.Fulfils#getSource()
   * @see #getFulfils()
   * @generated
   */
  EReference getFulfils_Source();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Fulfils#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.securechange.ontology.Fulfils#getTarget()
   * @see #getFulfils()
   * @generated
   */
  EReference getFulfils_Target();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Provides <em>Provides</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provides</em>'.
   * @see eu.securechange.ontology.Provides
   * @generated
   */
  EClass getProvides();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Provides#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.Provides#getType()
   * @see #getProvides()
   * @generated
   */
  EAttribute getProvides_Type();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Provides#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see eu.securechange.ontology.Provides#getSource()
   * @see #getProvides()
   * @generated
   */
  EReference getProvides_Source();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Provides#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.securechange.ontology.Provides#getTarget()
   * @see #getProvides()
   * @generated
   */
  EReference getProvides_Target();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Consumes <em>Consumes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Consumes</em>'.
   * @see eu.securechange.ontology.Consumes
   * @generated
   */
  EClass getConsumes();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Consumes#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.Consumes#getType()
   * @see #getConsumes()
   * @generated
   */
  EAttribute getConsumes_Type();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Consumes#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see eu.securechange.ontology.Consumes#getSource()
   * @see #getConsumes()
   * @generated
   */
  EReference getConsumes_Source();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Consumes#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.securechange.ontology.Consumes#getTarget()
   * @see #getConsumes()
   * @generated
   */
  EReference getConsumes_Target();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Exploits <em>Exploits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exploits</em>'.
   * @see eu.securechange.ontology.Exploits
   * @generated
   */
  EClass getExploits();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Exploits#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.Exploits#getType()
   * @see #getExploits()
   * @generated
   */
  EAttribute getExploits_Type();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Exploits#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see eu.securechange.ontology.Exploits#getSource()
   * @see #getExploits()
   * @generated
   */
  EReference getExploits_Source();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Exploits#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.securechange.ontology.Exploits#getTarget()
   * @see #getExploits()
   * @generated
   */
  EReference getExploits_Target();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Damages <em>Damages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Damages</em>'.
   * @see eu.securechange.ontology.Damages
   * @generated
   */
  EClass getDamages();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Damages#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.Damages#getType()
   * @see #getDamages()
   * @generated
   */
  EAttribute getDamages_Type();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Damages#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see eu.securechange.ontology.Damages#getSource()
   * @see #getDamages()
   * @generated
   */
  EReference getDamages_Source();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Damages#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.securechange.ontology.Damages#getTarget()
   * @see #getDamages()
   * @generated
   */
  EReference getDamages_Target();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Attacks <em>Attacks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attacks</em>'.
   * @see eu.securechange.ontology.Attacks
   * @generated
   */
  EClass getAttacks();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Attacks#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.Attacks#getType()
   * @see #getAttacks()
   * @generated
   */
  EAttribute getAttacks_Type();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Attacks#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see eu.securechange.ontology.Attacks#getSource()
   * @see #getAttacks()
   * @generated
   */
  EReference getAttacks_Source();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Attacks#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.securechange.ontology.Attacks#getTarget()
   * @see #getAttacks()
   * @generated
   */
  EReference getAttacks_Target();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Argues <em>Argues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argues</em>'.
   * @see eu.securechange.ontology.Argues
   * @generated
   */
  EClass getArgues();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Argues#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.Argues#getType()
   * @see #getArgues()
   * @generated
   */
  EAttribute getArgues_Type();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Argues#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see eu.securechange.ontology.Argues#getSource()
   * @see #getArgues()
   * @generated
   */
  EReference getArgues_Source();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.Argues#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.securechange.ontology.Argues#getTarget()
   * @see #getArgues()
   * @generated
   */
  EReference getArgues_Target();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity</em>'.
   * @see eu.securechange.ontology.Activity
   * @generated
   */
  EClass getActivity();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.Activity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.securechange.ontology.Activity#getName()
   * @see #getActivity()
   * @generated
   */
  EAttribute getActivity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link eu.securechange.ontology.Activity#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see eu.securechange.ontology.Activity#getActions()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Actions();

  /**
   * Returns the meta object for enum '{@link eu.securechange.ontology.DomainType <em>Domain Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Domain Type</em>'.
   * @see eu.securechange.ontology.DomainType
   * @generated
   */
  EEnum getDomainType();

  /**
   * Returns the meta object for enum '{@link eu.securechange.ontology.PropositionType <em>Proposition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Proposition Type</em>'.
   * @see eu.securechange.ontology.PropositionType
   * @generated
   */
  EEnum getPropositionType();

  /**
   * Returns the meta object for enum '{@link eu.securechange.ontology.DecomposesType <em>Decomposes Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Decomposes Type</em>'.
   * @see eu.securechange.ontology.DecomposesType
   * @generated
   */
  EEnum getDecomposesType();

  /**
   * Returns the meta object for enum '{@link eu.securechange.ontology.ContributesType <em>Contributes Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Contributes Type</em>'.
   * @see eu.securechange.ontology.ContributesType
   * @generated
   */
  EEnum getContributesType();

  /**
   * Returns the meta object for enum '{@link eu.securechange.ontology.FulfilsType <em>Fulfils Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Fulfils Type</em>'.
   * @see eu.securechange.ontology.FulfilsType
   * @generated
   */
  EEnum getFulfilsType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OntologyFactory getOntologyFactory();

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
     * The meta object literal for the '{@link eu.securechange.ontology.impl.SituationImpl <em>Situation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.SituationImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getSituation()
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
     * The meta object literal for the '{@link eu.securechange.ontology.impl.WorldImpl <em>World</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.WorldImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getWorld()
     * @generated
     */
    EClass WORLD = eINSTANCE.getWorld();

    /**
     * The meta object literal for the '<em><b>Physical</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORLD__PHYSICAL = eINSTANCE.getWorld_Physical();

    /**
     * The meta object literal for the '<em><b>Belief</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORLD__BELIEF = eINSTANCE.getWorld_Belief();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.ThingImpl <em>Thing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.ThingImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getThing()
     * @generated
     */
    EClass THING = eINSTANCE.getThing();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.EventImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getEvent()
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
     * The meta object literal for the '{@link eu.securechange.ontology.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.ObjectImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.PhysicalWorldImpl <em>Physical World</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.PhysicalWorldImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getPhysicalWorld()
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
     * The meta object literal for the '{@link eu.securechange.ontology.impl.BeliefWorldImpl <em>Belief World</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.BeliefWorldImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getBeliefWorld()
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
     * The meta object literal for the '{@link eu.securechange.ontology.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.DomainImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

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
     * The meta object literal for the '{@link eu.securechange.ontology.impl.PropositionImpl <em>Proposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.PropositionImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getProposition()
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
     * The meta object literal for the '{@link eu.securechange.ontology.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.EntityImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.ActorImpl <em>Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.ActorImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getActor()
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
     * The meta object literal for the '{@link eu.securechange.ontology.impl.StakeholderImpl <em>Stakeholder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.StakeholderImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getStakeholder()
     * @generated
     */
    EClass STAKEHOLDER = eINSTANCE.getStakeholder();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.AttackerImpl <em>Attacker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.AttackerImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getAttacker()
     * @generated
     */
    EClass ATTACKER = eINSTANCE.getAttacker();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.ProcessImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.NaturalProcessImpl <em>Natural Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.NaturalProcessImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getNaturalProcess()
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
     * The meta object literal for the '{@link eu.securechange.ontology.impl.HumanActivityImpl <em>Human Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.HumanActivityImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getHumanActivity()
     * @generated
     */
    EClass HUMAN_ACTIVITY = eINSTANCE.getHumanActivity();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.ActionImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getAction()
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
     * The meta object literal for the '{@link eu.securechange.ontology.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.ResourceImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getResource()
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
     * The meta object literal for the '{@link eu.securechange.ontology.impl.AssetImpl <em>Asset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.AssetImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getAsset()
     * @generated
     */
    EClass ASSET = eINSTANCE.getAsset();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.RelationshipImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getRelationship()
     * @generated
     */
    EClass RELATIONSHIP = eINSTANCE.getRelationship();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.WantsImpl <em>Wants</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.WantsImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getWants()
     * @generated
     */
    EClass WANTS = eINSTANCE.getWants();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WANTS__TYPE = eINSTANCE.getWants_Type();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WANTS__SOURCE = eINSTANCE.getWants_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WANTS__TARGET = eINSTANCE.getWants_Target();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.DoesImpl <em>Does</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.DoesImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getDoes()
     * @generated
     */
    EClass DOES = eINSTANCE.getDoes();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOES__TYPE = eINSTANCE.getDoes_Type();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOES__SOURCE = eINSTANCE.getDoes_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOES__TARGET = eINSTANCE.getDoes_Target();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.DecomposesImpl <em>Decomposes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.DecomposesImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getDecomposes()
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
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECOMPOSES__SOURCE = eINSTANCE.getDecomposes_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECOMPOSES__TARGET = eINSTANCE.getDecomposes_Target();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.TrustsImpl <em>Trusts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.TrustsImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getTrusts()
     * @generated
     */
    EClass TRUSTS = eINSTANCE.getTrusts();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRUSTS__TYPE = eINSTANCE.getTrusts_Type();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUSTS__SOURCE = eINSTANCE.getTrusts_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUSTS__TARGET = eINSTANCE.getTrusts_Target();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.DelegatesImpl <em>Delegates</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.DelegatesImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getDelegates()
     * @generated
     */
    EClass DELEGATES = eINSTANCE.getDelegates();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELEGATES__TYPE = eINSTANCE.getDelegates_Type();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELEGATES__SOURCE = eINSTANCE.getDelegates_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELEGATES__TARGET = eINSTANCE.getDelegates_Target();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.ContributesImpl <em>Contributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.ContributesImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getContributes()
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
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTES__SOURCE = eINSTANCE.getContributes_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTES__TARGET = eINSTANCE.getContributes_Target();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.FulfilsImpl <em>Fulfils</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.FulfilsImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getFulfils()
     * @generated
     */
    EClass FULFILS = eINSTANCE.getFulfils();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FULFILS__TYPE = eINSTANCE.getFulfils_Type();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULFILS__SOURCE = eINSTANCE.getFulfils_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULFILS__TARGET = eINSTANCE.getFulfils_Target();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.ProvidesImpl <em>Provides</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.ProvidesImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getProvides()
     * @generated
     */
    EClass PROVIDES = eINSTANCE.getProvides();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDES__TYPE = eINSTANCE.getProvides_Type();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDES__SOURCE = eINSTANCE.getProvides_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDES__TARGET = eINSTANCE.getProvides_Target();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.ConsumesImpl <em>Consumes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.ConsumesImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getConsumes()
     * @generated
     */
    EClass CONSUMES = eINSTANCE.getConsumes();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSUMES__TYPE = eINSTANCE.getConsumes_Type();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSUMES__SOURCE = eINSTANCE.getConsumes_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSUMES__TARGET = eINSTANCE.getConsumes_Target();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.ExploitsImpl <em>Exploits</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.ExploitsImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getExploits()
     * @generated
     */
    EClass EXPLOITS = eINSTANCE.getExploits();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPLOITS__TYPE = eINSTANCE.getExploits_Type();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLOITS__SOURCE = eINSTANCE.getExploits_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLOITS__TARGET = eINSTANCE.getExploits_Target();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.DamagesImpl <em>Damages</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.DamagesImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getDamages()
     * @generated
     */
    EClass DAMAGES = eINSTANCE.getDamages();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAMAGES__TYPE = eINSTANCE.getDamages_Type();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAMAGES__SOURCE = eINSTANCE.getDamages_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAMAGES__TARGET = eINSTANCE.getDamages_Target();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.AttacksImpl <em>Attacks</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.AttacksImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getAttacks()
     * @generated
     */
    EClass ATTACKS = eINSTANCE.getAttacks();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTACKS__TYPE = eINSTANCE.getAttacks_Type();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTACKS__SOURCE = eINSTANCE.getAttacks_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTACKS__TARGET = eINSTANCE.getAttacks_Target();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.ArguesImpl <em>Argues</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.ArguesImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getArgues()
     * @generated
     */
    EClass ARGUES = eINSTANCE.getArgues();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUES__TYPE = eINSTANCE.getArgues_Type();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUES__SOURCE = eINSTANCE.getArgues_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUES__TARGET = eINSTANCE.getArgues_Target();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.impl.ActivityImpl
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getActivity()
     * @generated
     */
    EClass ACTIVITY = eINSTANCE.getActivity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__ACTIONS = eINSTANCE.getActivity_Actions();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.DomainType <em>Domain Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.DomainType
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getDomainType()
     * @generated
     */
    EEnum DOMAIN_TYPE = eINSTANCE.getDomainType();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.PropositionType <em>Proposition Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.PropositionType
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getPropositionType()
     * @generated
     */
    EEnum PROPOSITION_TYPE = eINSTANCE.getPropositionType();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.DecomposesType <em>Decomposes Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.DecomposesType
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getDecomposesType()
     * @generated
     */
    EEnum DECOMPOSES_TYPE = eINSTANCE.getDecomposesType();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.ContributesType <em>Contributes Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ContributesType
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getContributesType()
     * @generated
     */
    EEnum CONTRIBUTES_TYPE = eINSTANCE.getContributesType();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.FulfilsType <em>Fulfils Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.FulfilsType
     * @see eu.securechange.ontology.impl.OntologyPackageImpl#getFulfilsType()
     * @generated
     */
    EEnum FULFILS_TYPE = eINSTANCE.getFulfilsType();

  }

} //OntologyPackage
