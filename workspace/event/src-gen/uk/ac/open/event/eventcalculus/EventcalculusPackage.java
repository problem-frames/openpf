/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus;

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
 * @see uk.ac.open.event.eventcalculus.EventcalculusFactory
 * @model kind="package"
 * @generated
 */
public interface EventcalculusPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "eventcalculus";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/open/EventCalculus";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "eventcalculus";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EventcalculusPackage eINSTANCE = uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.KnowledgeImpl <em>Knowledge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.KnowledgeImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getKnowledge()
   * @generated
   */
  int KNOWLEDGE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNOWLEDGE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNOWLEDGE__ENTITIES = 1;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNOWLEDGE__RULES = 2;

  /**
   * The feature id for the '<em><b>Vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNOWLEDGE__VARS = 3;

  /**
   * The number of structural features of the '<em>Knowledge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNOWLEDGE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.RuleImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRule()
   * @generated
   */
  int RULE = 1;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__DECL = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__EXPR = 1;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.VarDeclImpl <em>Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.VarDeclImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getVarDecl()
   * @generated
   */
  int VAR_DECL = 2;

  /**
   * The feature id for the '<em><b>Vars</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__VARS = 0;

  /**
   * The number of structural features of the '<em>Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.IntExprImpl <em>Int Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.IntExprImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getIntExpr()
   * @generated
   */
  int INT_EXPR = 4;

  /**
   * The number of structural features of the '<em>Int Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.IntTermImpl <em>Int Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.IntTermImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getIntTerm()
   * @generated
   */
  int INT_TERM = 3;

  /**
   * The feature id for the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TERM__CONST = INT_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TERM__VAR = INT_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Int Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TERM_FEATURE_COUNT = INT_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.BinaryIntExprImpl <em>Binary Int Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.BinaryIntExprImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getBinaryIntExpr()
   * @generated
   */
  int BINARY_INT_EXPR = 5;

  /**
   * The feature id for the '<em><b>Opr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_INT_EXPR__OPR = INT_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Binaryop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_INT_EXPR__BINARYOP = INT_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Binary Int Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_INT_EXPR_FEATURE_COUNT = INT_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.BoolExprImpl <em>Bool Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.BoolExprImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getBoolExpr()
   * @generated
   */
  int BOOL_EXPR = 7;

  /**
   * The number of structural features of the '<em>Bool Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.TemporalPredicateImpl <em>Temporal Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.TemporalPredicateImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getTemporalPredicate()
   * @generated
   */
  int TEMPORAL_PREDICATE = 6;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPORAL_PREDICATE__ARGS = BOOL_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPORAL_PREDICATE__TIME = BOOL_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Temporal Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPORAL_PREDICATE_FEATURE_COUNT = BOOL_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.UnaryBoolExprImpl <em>Unary Bool Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.UnaryBoolExprImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getUnaryBoolExpr()
   * @generated
   */
  int UNARY_BOOL_EXPR = 8;

  /**
   * The feature id for the '<em><b>Unaryop lhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_BOOL_EXPR__UNARYOP_LHS = BOOL_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Opr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_BOOL_EXPR__OPR = BOOL_EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_BOOL_EXPR__OPS = BOOL_EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Unary Bool Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_BOOL_EXPR_FEATURE_COUNT = BOOL_EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.BinaryBoolExprImpl <em>Binary Bool Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.BinaryBoolExprImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getBinaryBoolExpr()
   * @generated
   */
  int BINARY_BOOL_EXPR = 9;

  /**
   * The feature id for the '<em><b>Opr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_BOOL_EXPR__OPR = BOOL_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Binaryop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_BOOL_EXPR__BINARYOP = BOOL_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Binary Bool Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_BOOL_EXPR_FEATURE_COUNT = BOOL_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.EntityImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 10;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.SortImpl <em>Sort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.SortImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getSort()
   * @generated
   */
  int SORT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT__NAME = ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.ImportImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 12;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__PATH = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.VarImpl <em>Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.VarImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getVar()
   * @generated
   */
  int VAR = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__NAME = 0;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__MIN = 1;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__MAX = 2;

  /**
   * The number of structural features of the '<em>Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.FluentImpl <em>Fluent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.FluentImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getFluent()
   * @generated
   */
  int FLUENT = 14;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT__TERM = ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fluent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.EventImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 15;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__TERM = ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.TermImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getTerm()
   * @generated
   */
  int TERM = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__NAME = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__ARGS = 1;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.HoldsAtImpl <em>Holds At</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.HoldsAtImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getHoldsAt()
   * @generated
   */
  int HOLDS_AT = 17;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOLDS_AT__ARGS = TEMPORAL_PREDICATE__ARGS;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOLDS_AT__TIME = TEMPORAL_PREDICATE__TIME;

  /**
   * The feature id for the '<em><b>Fluent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOLDS_AT__FLUENT = TEMPORAL_PREDICATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Holds At</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOLDS_AT_FEATURE_COUNT = TEMPORAL_PREDICATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.HappensImpl <em>Happens</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.HappensImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getHappens()
   * @generated
   */
  int HAPPENS = 18;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAPPENS__ARGS = TEMPORAL_PREDICATE__ARGS;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAPPENS__TIME = TEMPORAL_PREDICATE__TIME;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAPPENS__EVENT = TEMPORAL_PREDICATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Happens</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAPPENS_FEATURE_COUNT = TEMPORAL_PREDICATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.InitiatesImpl <em>Initiates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.InitiatesImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getInitiates()
   * @generated
   */
  int INITIATES = 19;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIATES__ARGS = TEMPORAL_PREDICATE__ARGS;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIATES__TIME = TEMPORAL_PREDICATE__TIME;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIATES__EVENT = TEMPORAL_PREDICATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fluent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIATES__FLUENT = TEMPORAL_PREDICATE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Args2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIATES__ARGS2 = TEMPORAL_PREDICATE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Initiates</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIATES_FEATURE_COUNT = TEMPORAL_PREDICATE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.TerminatesImpl <em>Terminates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.TerminatesImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getTerminates()
   * @generated
   */
  int TERMINATES = 20;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINATES__ARGS = TEMPORAL_PREDICATE__ARGS;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINATES__TIME = TEMPORAL_PREDICATE__TIME;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINATES__EVENT = TEMPORAL_PREDICATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fluent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINATES__FLUENT = TEMPORAL_PREDICATE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Args2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINATES__ARGS2 = TEMPORAL_PREDICATE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Terminates</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINATES_FEATURE_COUNT = TEMPORAL_PREDICATE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.PathImpl <em>Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.PathImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getPath()
   * @generated
   */
  int PATH = 21;

  /**
   * The feature id for the '<em><b>Files</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH__FILES = 0;

  /**
   * The number of structural features of the '<em>Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.FileImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getFile()
   * @generated
   */
  int FILE = 22;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__NAMES = 0;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.BinaryIntOp <em>Binary Int Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.BinaryIntOp
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getBinaryIntOp()
   * @generated
   */
  int BINARY_INT_OP = 23;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.UnaryBoolOp <em>Unary Bool Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.UnaryBoolOp
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getUnaryBoolOp()
   * @generated
   */
  int UNARY_BOOL_OP = 24;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.BinaryBoolOp <em>Binary Bool Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.BinaryBoolOp
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getBinaryBoolOp()
   * @generated
   */
  int BINARY_BOOL_OP = 25;


  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Knowledge <em>Knowledge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Knowledge</em>'.
   * @see uk.ac.open.event.eventcalculus.Knowledge
   * @generated
   */
  EClass getKnowledge();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.Knowledge#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see uk.ac.open.event.eventcalculus.Knowledge#getImports()
   * @see #getKnowledge()
   * @generated
   */
  EReference getKnowledge_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.Knowledge#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see uk.ac.open.event.eventcalculus.Knowledge#getEntities()
   * @see #getKnowledge()
   * @generated
   */
  EReference getKnowledge_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.Knowledge#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see uk.ac.open.event.eventcalculus.Knowledge#getRules()
   * @see #getKnowledge()
   * @generated
   */
  EReference getKnowledge_Rules();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.Knowledge#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vars</em>'.
   * @see uk.ac.open.event.eventcalculus.Knowledge#getVars()
   * @see #getKnowledge()
   * @generated
   */
  EReference getKnowledge_Vars();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see uk.ac.open.event.eventcalculus.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Rule#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Decl</em>'.
   * @see uk.ac.open.event.eventcalculus.Rule#getDecl()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Decl();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Rule#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see uk.ac.open.event.eventcalculus.Rule#getExpr()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Expr();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.VarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decl</em>'.
   * @see uk.ac.open.event.eventcalculus.VarDecl
   * @generated
   */
  EClass getVarDecl();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.event.eventcalculus.VarDecl#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Vars</em>'.
   * @see uk.ac.open.event.eventcalculus.VarDecl#getVars()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Vars();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.IntTerm <em>Int Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Term</em>'.
   * @see uk.ac.open.event.eventcalculus.IntTerm
   * @generated
   */
  EClass getIntTerm();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.IntTerm#getConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const</em>'.
   * @see uk.ac.open.event.eventcalculus.IntTerm#getConst()
   * @see #getIntTerm()
   * @generated
   */
  EAttribute getIntTerm_Const();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.event.eventcalculus.IntTerm#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see uk.ac.open.event.eventcalculus.IntTerm#getVar()
   * @see #getIntTerm()
   * @generated
   */
  EReference getIntTerm_Var();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.IntExpr <em>Int Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Expr</em>'.
   * @see uk.ac.open.event.eventcalculus.IntExpr
   * @generated
   */
  EClass getIntExpr();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.BinaryIntExpr <em>Binary Int Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Int Expr</em>'.
   * @see uk.ac.open.event.eventcalculus.BinaryIntExpr
   * @generated
   */
  EClass getBinaryIntExpr();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.BinaryIntExpr#getOpr <em>Opr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Opr</em>'.
   * @see uk.ac.open.event.eventcalculus.BinaryIntExpr#getOpr()
   * @see #getBinaryIntExpr()
   * @generated
   */
  EReference getBinaryIntExpr_Opr();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.BinaryIntExpr#getBinaryop <em>Binaryop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Binaryop</em>'.
   * @see uk.ac.open.event.eventcalculus.BinaryIntExpr#getBinaryop()
   * @see #getBinaryIntExpr()
   * @generated
   */
  EAttribute getBinaryIntExpr_Binaryop();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.TemporalPredicate <em>Temporal Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Temporal Predicate</em>'.
   * @see uk.ac.open.event.eventcalculus.TemporalPredicate
   * @generated
   */
  EClass getTemporalPredicate();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.open.event.eventcalculus.TemporalPredicate#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args</em>'.
   * @see uk.ac.open.event.eventcalculus.TemporalPredicate#getArgs()
   * @see #getTemporalPredicate()
   * @generated
   */
  EAttribute getTemporalPredicate_Args();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.TemporalPredicate#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Time</em>'.
   * @see uk.ac.open.event.eventcalculus.TemporalPredicate#getTime()
   * @see #getTemporalPredicate()
   * @generated
   */
  EReference getTemporalPredicate_Time();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.BoolExpr <em>Bool Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Expr</em>'.
   * @see uk.ac.open.event.eventcalculus.BoolExpr
   * @generated
   */
  EClass getBoolExpr();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.UnaryBoolExpr <em>Unary Bool Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Bool Expr</em>'.
   * @see uk.ac.open.event.eventcalculus.UnaryBoolExpr
   * @generated
   */
  EClass getUnaryBoolExpr();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.UnaryBoolExpr#getUnaryop_lhs <em>Unaryop lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unaryop lhs</em>'.
   * @see uk.ac.open.event.eventcalculus.UnaryBoolExpr#getUnaryop_lhs()
   * @see #getUnaryBoolExpr()
   * @generated
   */
  EAttribute getUnaryBoolExpr_Unaryop_lhs();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.UnaryBoolExpr#getOpr <em>Opr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Opr</em>'.
   * @see uk.ac.open.event.eventcalculus.UnaryBoolExpr#getOpr()
   * @see #getUnaryBoolExpr()
   * @generated
   */
  EReference getUnaryBoolExpr_Opr();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.UnaryBoolExpr#getOps <em>Ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ops</em>'.
   * @see uk.ac.open.event.eventcalculus.UnaryBoolExpr#getOps()
   * @see #getUnaryBoolExpr()
   * @generated
   */
  EReference getUnaryBoolExpr_Ops();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.BinaryBoolExpr <em>Binary Bool Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Bool Expr</em>'.
   * @see uk.ac.open.event.eventcalculus.BinaryBoolExpr
   * @generated
   */
  EClass getBinaryBoolExpr();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.BinaryBoolExpr#getOpr <em>Opr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Opr</em>'.
   * @see uk.ac.open.event.eventcalculus.BinaryBoolExpr#getOpr()
   * @see #getBinaryBoolExpr()
   * @generated
   */
  EReference getBinaryBoolExpr_Opr();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.BinaryBoolExpr#getBinaryop <em>Binaryop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Binaryop</em>'.
   * @see uk.ac.open.event.eventcalculus.BinaryBoolExpr#getBinaryop()
   * @see #getBinaryBoolExpr()
   * @generated
   */
  EAttribute getBinaryBoolExpr_Binaryop();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see uk.ac.open.event.eventcalculus.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Sort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort</em>'.
   * @see uk.ac.open.event.eventcalculus.Sort
   * @generated
   */
  EClass getSort();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.Sort#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.event.eventcalculus.Sort#getName()
   * @see #getSort()
   * @generated
   */
  EAttribute getSort_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see uk.ac.open.event.eventcalculus.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Import#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see uk.ac.open.event.eventcalculus.Import#getPath()
   * @see #getImport()
   * @generated
   */
  EReference getImport_Path();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var</em>'.
   * @see uk.ac.open.event.eventcalculus.Var
   * @generated
   */
  EClass getVar();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.Var#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.event.eventcalculus.Var#getName()
   * @see #getVar()
   * @generated
   */
  EAttribute getVar_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.Var#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see uk.ac.open.event.eventcalculus.Var#getMin()
   * @see #getVar()
   * @generated
   */
  EAttribute getVar_Min();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.Var#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see uk.ac.open.event.eventcalculus.Var#getMax()
   * @see #getVar()
   * @generated
   */
  EAttribute getVar_Max();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Fluent <em>Fluent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fluent</em>'.
   * @see uk.ac.open.event.eventcalculus.Fluent
   * @generated
   */
  EClass getFluent();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Fluent#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see uk.ac.open.event.eventcalculus.Fluent#getTerm()
   * @see #getFluent()
   * @generated
   */
  EReference getFluent_Term();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see uk.ac.open.event.eventcalculus.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Event#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see uk.ac.open.event.eventcalculus.Event#getTerm()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Term();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see uk.ac.open.event.eventcalculus.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.Term#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.event.eventcalculus.Term#getName()
   * @see #getTerm()
   * @generated
   */
  EAttribute getTerm_Name();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.open.event.eventcalculus.Term#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args</em>'.
   * @see uk.ac.open.event.eventcalculus.Term#getArgs()
   * @see #getTerm()
   * @generated
   */
  EAttribute getTerm_Args();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.HoldsAt <em>Holds At</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Holds At</em>'.
   * @see uk.ac.open.event.eventcalculus.HoldsAt
   * @generated
   */
  EClass getHoldsAt();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.event.eventcalculus.HoldsAt#getFluent <em>Fluent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Fluent</em>'.
   * @see uk.ac.open.event.eventcalculus.HoldsAt#getFluent()
   * @see #getHoldsAt()
   * @generated
   */
  EReference getHoldsAt_Fluent();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Happens <em>Happens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Happens</em>'.
   * @see uk.ac.open.event.eventcalculus.Happens
   * @generated
   */
  EClass getHappens();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.event.eventcalculus.Happens#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see uk.ac.open.event.eventcalculus.Happens#getEvent()
   * @see #getHappens()
   * @generated
   */
  EReference getHappens_Event();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Initiates <em>Initiates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initiates</em>'.
   * @see uk.ac.open.event.eventcalculus.Initiates
   * @generated
   */
  EClass getInitiates();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.event.eventcalculus.Initiates#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see uk.ac.open.event.eventcalculus.Initiates#getEvent()
   * @see #getInitiates()
   * @generated
   */
  EReference getInitiates_Event();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.event.eventcalculus.Initiates#getFluent <em>Fluent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Fluent</em>'.
   * @see uk.ac.open.event.eventcalculus.Initiates#getFluent()
   * @see #getInitiates()
   * @generated
   */
  EReference getInitiates_Fluent();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.open.event.eventcalculus.Initiates#getArgs2 <em>Args2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args2</em>'.
   * @see uk.ac.open.event.eventcalculus.Initiates#getArgs2()
   * @see #getInitiates()
   * @generated
   */
  EAttribute getInitiates_Args2();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Terminates <em>Terminates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminates</em>'.
   * @see uk.ac.open.event.eventcalculus.Terminates
   * @generated
   */
  EClass getTerminates();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.event.eventcalculus.Terminates#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see uk.ac.open.event.eventcalculus.Terminates#getEvent()
   * @see #getTerminates()
   * @generated
   */
  EReference getTerminates_Event();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.event.eventcalculus.Terminates#getFluent <em>Fluent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Fluent</em>'.
   * @see uk.ac.open.event.eventcalculus.Terminates#getFluent()
   * @see #getTerminates()
   * @generated
   */
  EReference getTerminates_Fluent();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.open.event.eventcalculus.Terminates#getArgs2 <em>Args2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args2</em>'.
   * @see uk.ac.open.event.eventcalculus.Terminates#getArgs2()
   * @see #getTerminates()
   * @generated
   */
  EAttribute getTerminates_Args2();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path</em>'.
   * @see uk.ac.open.event.eventcalculus.Path
   * @generated
   */
  EClass getPath();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.Path#getFiles <em>Files</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Files</em>'.
   * @see uk.ac.open.event.eventcalculus.Path#getFiles()
   * @see #getPath()
   * @generated
   */
  EReference getPath_Files();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see uk.ac.open.event.eventcalculus.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.open.event.eventcalculus.File#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see uk.ac.open.event.eventcalculus.File#getNames()
   * @see #getFile()
   * @generated
   */
  EAttribute getFile_Names();

  /**
   * Returns the meta object for enum '{@link uk.ac.open.event.eventcalculus.BinaryIntOp <em>Binary Int Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Binary Int Op</em>'.
   * @see uk.ac.open.event.eventcalculus.BinaryIntOp
   * @generated
   */
  EEnum getBinaryIntOp();

  /**
   * Returns the meta object for enum '{@link uk.ac.open.event.eventcalculus.UnaryBoolOp <em>Unary Bool Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unary Bool Op</em>'.
   * @see uk.ac.open.event.eventcalculus.UnaryBoolOp
   * @generated
   */
  EEnum getUnaryBoolOp();

  /**
   * Returns the meta object for enum '{@link uk.ac.open.event.eventcalculus.BinaryBoolOp <em>Binary Bool Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Binary Bool Op</em>'.
   * @see uk.ac.open.event.eventcalculus.BinaryBoolOp
   * @generated
   */
  EEnum getBinaryBoolOp();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EventcalculusFactory getEventcalculusFactory();

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
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.KnowledgeImpl <em>Knowledge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.KnowledgeImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getKnowledge()
     * @generated
     */
    EClass KNOWLEDGE = eINSTANCE.getKnowledge();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KNOWLEDGE__IMPORTS = eINSTANCE.getKnowledge_Imports();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KNOWLEDGE__ENTITIES = eINSTANCE.getKnowledge_Entities();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KNOWLEDGE__RULES = eINSTANCE.getKnowledge_Rules();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KNOWLEDGE__VARS = eINSTANCE.getKnowledge_Vars();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.RuleImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__DECL = eINSTANCE.getRule_Decl();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__EXPR = eINSTANCE.getRule_Expr();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.VarDeclImpl <em>Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.VarDeclImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getVarDecl()
     * @generated
     */
    EClass VAR_DECL = eINSTANCE.getVarDecl();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__VARS = eINSTANCE.getVarDecl_Vars();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.IntTermImpl <em>Int Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.IntTermImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getIntTerm()
     * @generated
     */
    EClass INT_TERM = eINSTANCE.getIntTerm();

    /**
     * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_TERM__CONST = eINSTANCE.getIntTerm_Const();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INT_TERM__VAR = eINSTANCE.getIntTerm_Var();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.IntExprImpl <em>Int Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.IntExprImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getIntExpr()
     * @generated
     */
    EClass INT_EXPR = eINSTANCE.getIntExpr();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.BinaryIntExprImpl <em>Binary Int Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.BinaryIntExprImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getBinaryIntExpr()
     * @generated
     */
    EClass BINARY_INT_EXPR = eINSTANCE.getBinaryIntExpr();

    /**
     * The meta object literal for the '<em><b>Opr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_INT_EXPR__OPR = eINSTANCE.getBinaryIntExpr_Opr();

    /**
     * The meta object literal for the '<em><b>Binaryop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_INT_EXPR__BINARYOP = eINSTANCE.getBinaryIntExpr_Binaryop();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.TemporalPredicateImpl <em>Temporal Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.TemporalPredicateImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getTemporalPredicate()
     * @generated
     */
    EClass TEMPORAL_PREDICATE = eINSTANCE.getTemporalPredicate();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPORAL_PREDICATE__ARGS = eINSTANCE.getTemporalPredicate_Args();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPORAL_PREDICATE__TIME = eINSTANCE.getTemporalPredicate_Time();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.BoolExprImpl <em>Bool Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.BoolExprImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getBoolExpr()
     * @generated
     */
    EClass BOOL_EXPR = eINSTANCE.getBoolExpr();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.UnaryBoolExprImpl <em>Unary Bool Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.UnaryBoolExprImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getUnaryBoolExpr()
     * @generated
     */
    EClass UNARY_BOOL_EXPR = eINSTANCE.getUnaryBoolExpr();

    /**
     * The meta object literal for the '<em><b>Unaryop lhs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_BOOL_EXPR__UNARYOP_LHS = eINSTANCE.getUnaryBoolExpr_Unaryop_lhs();

    /**
     * The meta object literal for the '<em><b>Opr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_BOOL_EXPR__OPR = eINSTANCE.getUnaryBoolExpr_Opr();

    /**
     * The meta object literal for the '<em><b>Ops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_BOOL_EXPR__OPS = eINSTANCE.getUnaryBoolExpr_Ops();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.BinaryBoolExprImpl <em>Binary Bool Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.BinaryBoolExprImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getBinaryBoolExpr()
     * @generated
     */
    EClass BINARY_BOOL_EXPR = eINSTANCE.getBinaryBoolExpr();

    /**
     * The meta object literal for the '<em><b>Opr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_BOOL_EXPR__OPR = eINSTANCE.getBinaryBoolExpr_Opr();

    /**
     * The meta object literal for the '<em><b>Binaryop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_BOOL_EXPR__BINARYOP = eINSTANCE.getBinaryBoolExpr_Binaryop();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.EntityImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.SortImpl <em>Sort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.SortImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getSort()
     * @generated
     */
    EClass SORT = eINSTANCE.getSort();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SORT__NAME = eINSTANCE.getSort_Name();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.ImportImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__PATH = eINSTANCE.getImport_Path();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.VarImpl <em>Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.VarImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getVar()
     * @generated
     */
    EClass VAR = eINSTANCE.getVar();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR__NAME = eINSTANCE.getVar_Name();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR__MIN = eINSTANCE.getVar_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR__MAX = eINSTANCE.getVar_Max();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.FluentImpl <em>Fluent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.FluentImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getFluent()
     * @generated
     */
    EClass FLUENT = eINSTANCE.getFluent();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLUENT__TERM = eINSTANCE.getFluent_Term();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.EventImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__TERM = eINSTANCE.getEvent_Term();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.TermImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__NAME = eINSTANCE.getTerm_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__ARGS = eINSTANCE.getTerm_Args();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.HoldsAtImpl <em>Holds At</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.HoldsAtImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getHoldsAt()
     * @generated
     */
    EClass HOLDS_AT = eINSTANCE.getHoldsAt();

    /**
     * The meta object literal for the '<em><b>Fluent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HOLDS_AT__FLUENT = eINSTANCE.getHoldsAt_Fluent();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.HappensImpl <em>Happens</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.HappensImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getHappens()
     * @generated
     */
    EClass HAPPENS = eINSTANCE.getHappens();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAPPENS__EVENT = eINSTANCE.getHappens_Event();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.InitiatesImpl <em>Initiates</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.InitiatesImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getInitiates()
     * @generated
     */
    EClass INITIATES = eINSTANCE.getInitiates();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIATES__EVENT = eINSTANCE.getInitiates_Event();

    /**
     * The meta object literal for the '<em><b>Fluent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIATES__FLUENT = eINSTANCE.getInitiates_Fluent();

    /**
     * The meta object literal for the '<em><b>Args2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INITIATES__ARGS2 = eINSTANCE.getInitiates_Args2();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.TerminatesImpl <em>Terminates</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.TerminatesImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getTerminates()
     * @generated
     */
    EClass TERMINATES = eINSTANCE.getTerminates();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINATES__EVENT = eINSTANCE.getTerminates_Event();

    /**
     * The meta object literal for the '<em><b>Fluent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINATES__FLUENT = eINSTANCE.getTerminates_Fluent();

    /**
     * The meta object literal for the '<em><b>Args2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERMINATES__ARGS2 = eINSTANCE.getTerminates_Args2();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.PathImpl <em>Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.PathImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getPath()
     * @generated
     */
    EClass PATH = eINSTANCE.getPath();

    /**
     * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH__FILES = eINSTANCE.getPath_Files();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.FileImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE__NAMES = eINSTANCE.getFile_Names();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.BinaryIntOp <em>Binary Int Op</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.BinaryIntOp
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getBinaryIntOp()
     * @generated
     */
    EEnum BINARY_INT_OP = eINSTANCE.getBinaryIntOp();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.UnaryBoolOp <em>Unary Bool Op</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.UnaryBoolOp
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getUnaryBoolOp()
     * @generated
     */
    EEnum UNARY_BOOL_OP = eINSTANCE.getUnaryBoolOp();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.BinaryBoolOp <em>Binary Bool Op</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.BinaryBoolOp
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getBinaryBoolOp()
     * @generated
     */
    EEnum BINARY_BOOL_OP = eINSTANCE.getBinaryBoolOp();

  }

} //EventcalculusPackage
