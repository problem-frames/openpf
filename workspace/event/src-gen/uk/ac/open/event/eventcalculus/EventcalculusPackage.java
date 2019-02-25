/**
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
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.ModelImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DECLARATIONS = 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STATEMENTS = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.ImportImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.AnnotationImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.DeclarationImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__ANNOTATIONS = 0;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.DefinesImpl <em>Defines</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.DefinesImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefines()
   * @generated
   */
  int DEFINES = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINES__NAME = 0;

  /**
   * The number of structural features of the '<em>Defines</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.DefSortImpl <em>Def Sort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.DefSortImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefSort()
   * @generated
   */
  int DEF_SORT = 5;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_SORT__ANNOTATIONS = DECLARATION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_SORT__NAME = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Reified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_SORT__REIFIED = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_SORT__TYPE = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Def Sort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_SORT_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.DefRangeImpl <em>Def Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.DefRangeImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefRange()
   * @generated
   */
  int DEF_RANGE = 6;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_RANGE__ANNOTATIONS = DECLARATION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_RANGE__NAME = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_RANGE__MIN = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_RANGE__MAX = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Def Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_RANGE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.DefOptionImpl <em>Def Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.DefOptionImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefOption()
   * @generated
   */
  int DEF_OPTION = 7;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_OPTION__ANNOTATIONS = DECLARATION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_OPTION__NAME = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_OPTION__VALUE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_OPTION__VALUE2 = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Def Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_OPTION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.DefCompletionImpl <em>Def Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.DefCompletionImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefCompletion()
   * @generated
   */
  int DEF_COMPLETION = 8;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_COMPLETION__ANNOTATIONS = DECLARATION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_COMPLETION__TYPE = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_COMPLETION__LABEL = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Def Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_COMPLETION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.DefNonInertiaImpl <em>Def Non Inertia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.DefNonInertiaImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefNonInertia()
   * @generated
   */
  int DEF_NON_INERTIA = 9;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_NON_INERTIA__ANNOTATIONS = DECLARATION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Names</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_NON_INERTIA__NAMES = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Def Non Inertia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_NON_INERTIA_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.DefXorImpl <em>Def Xor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.DefXorImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefXor()
   * @generated
   */
  int DEF_XOR = 10;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_XOR__ANNOTATIONS = DECLARATION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Names</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_XOR__NAMES = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Def Xor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_XOR_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.DefMutexImpl <em>Def Mutex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.DefMutexImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefMutex()
   * @generated
   */
  int DEF_MUTEX = 11;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_MUTEX__ANNOTATIONS = DECLARATION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Names</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_MUTEX__NAMES = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Def Mutex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_MUTEX_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.StatementImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 12;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__ANNOTATIONS = 0;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.LabeledExpressionImpl <em>Labeled Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.LabeledExpressionImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getLabeledExpression()
   * @generated
   */
  int LABELED_EXPRESSION = 13;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_EXPRESSION__ANNOTATIONS = STATEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_EXPRESSION__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_EXPRESSION__EXPR = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Labeled Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.SortDefinitionImpl <em>Sort Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.SortDefinitionImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getSortDefinition()
   * @generated
   */
  int SORT_DEFINITION = 14;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_DEFINITION__ANNOTATIONS = STATEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Sort</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_DEFINITION__SORT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_DEFINITION__DEFINITIONS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sort Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_DEFINITION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.DefinitionImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__NAME = DEFINES__NAME;

  /**
   * The feature id for the '<em><b>Args</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__ARGS = DEFINES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Return</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__RETURN = DEFINES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = DEFINES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.ExpressionImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPR = 0;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__QUALIFIERS = 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OP = 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = 3;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__N = 4;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__DEFINE = 5;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.QualifierImpl <em>Qualifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.QualifierImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getQualifier()
   * @generated
   */
  int QUALIFIER = 17;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIER__OP = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIER__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Qualifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.ParametersImpl <em>Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.ParametersImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getParameters()
   * @generated
   */
  int PARAMETERS = 18;

  /**
   * The feature id for the '<em><b>Names</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS__NAMES = 0;

  /**
   * The number of structural features of the '<em>Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.TerminalExpressionImpl <em>Terminal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.TerminalExpressionImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getTerminalExpression()
   * @generated
   */
  int TERMINAL_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__DEFINE = EXPRESSION__DEFINE;

  /**
   * The number of structural features of the '<em>Terminal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.AssignPlusImpl <em>Assign Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.AssignPlusImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getAssignPlus()
   * @generated
   */
  int ASSIGN_PLUS = 20;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Q</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS__Q = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assign Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.AssignMinImpl <em>Assign Min</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.AssignMinImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getAssignMin()
   * @generated
   */
  int ASSIGN_MIN = 21;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Q</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN__Q = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assign Min</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.OrImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getOr()
   * @generated
   */
  int OR = 22;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Q</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__Q = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.AndImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getAnd()
   * @generated
   */
  int AND = 23;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Q</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__Q = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.RelNotEqImpl <em>Rel Not Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.RelNotEqImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRelNotEq()
   * @generated
   */
  int REL_NOT_EQ = 24;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rel Not Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.RelEqEqImpl <em>Rel Eq Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.RelEqEqImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRelEqEq()
   * @generated
   */
  int REL_EQ_EQ = 25;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rel Eq Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.RelLtEqImpl <em>Rel Lt Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.RelLtEqImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRelLtEq()
   * @generated
   */
  int REL_LT_EQ = 26;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rel Lt Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.RelGtEqImpl <em>Rel Gt Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.RelGtEqImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRelGtEq()
   * @generated
   */
  int REL_GT_EQ = 27;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rel Gt Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.RelEqImpl <em>Rel Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.RelEqImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRelEq()
   * @generated
   */
  int REL_EQ = 28;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rel Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.RelLtImpl <em>Rel Lt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.RelLtImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRelLt()
   * @generated
   */
  int REL_LT = 29;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rel Lt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.RelGtImpl <em>Rel Gt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.RelGtImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRelGt()
   * @generated
   */
  int REL_GT = 30;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rel Gt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.PlusImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 31;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.MinusImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 32;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.MultiImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getMulti()
   * @generated
   */
  int MULTI = 33;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.DivImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDiv()
   * @generated
   */
  int DIV = 34;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.PowImpl <em>Pow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.PowImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getPow()
   * @generated
   */
  int POW = 35;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.FunctionRefImpl <em>Function Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.FunctionRefImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getFunctionRef()
   * @generated
   */
  int FUNCTION_REF = 36;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REF__EXPR = EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REF__QUALIFIERS = EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REF__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REF__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REF__N = EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REF__DEFINE = EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REF__FUNC = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REF__ARGS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.IntLiteralImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 37;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__EXPR = TERMINAL_EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__QUALIFIERS = TERMINAL_EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__OP = TERMINAL_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__RIGHT = TERMINAL_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__N = TERMINAL_EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__DEFINE = TERMINAL_EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = TERMINAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = TERMINAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.StringLiteralImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 38;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__EXPR = TERMINAL_EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__QUALIFIERS = TERMINAL_EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__OP = TERMINAL_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__RIGHT = TERMINAL_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__N = TERMINAL_EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__DEFINE = TERMINAL_EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = TERMINAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = TERMINAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.impl.BooleanLiteralImpl
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 39;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__EXPR = TERMINAL_EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__QUALIFIERS = TERMINAL_EXPRESSION__QUALIFIERS;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__OP = TERMINAL_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__RIGHT = TERMINAL_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__N = TERMINAL_EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Define</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__DEFINE = TERMINAL_EXPRESSION__DEFINE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = TERMINAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = TERMINAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.ANNOTATION_TYPE <em>ANNOTATION TYPE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.ANNOTATION_TYPE
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getANNOTATION_TYPE()
   * @generated
   */
  int ANNOTATION_TYPE = 40;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.LabelType <em>Label Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.LabelType
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getLabelType()
   * @generated
   */
  int LABEL_TYPE = 41;

  /**
   * The meta object id for the '{@link uk.ac.open.event.eventcalculus.UnaryOp <em>Unary Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.event.eventcalculus.UnaryOp
   * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getUnaryOp()
   * @generated
   */
  int UNARY_OP = 42;


  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see uk.ac.open.event.eventcalculus.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see uk.ac.open.event.eventcalculus.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.Model#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see uk.ac.open.event.eventcalculus.Model#getDeclarations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Declarations();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.Model#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see uk.ac.open.event.eventcalculus.Model#getStatements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Statements();

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
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see uk.ac.open.event.eventcalculus.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see uk.ac.open.event.eventcalculus.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.Annotation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.open.event.eventcalculus.Annotation#getType()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Type();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.Annotation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.open.event.eventcalculus.Annotation#getValue()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see uk.ac.open.event.eventcalculus.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.Declaration#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see uk.ac.open.event.eventcalculus.Declaration#getAnnotations()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Annotations();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Defines <em>Defines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Defines</em>'.
   * @see uk.ac.open.event.eventcalculus.Defines
   * @generated
   */
  EClass getDefines();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.Defines#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.event.eventcalculus.Defines#getName()
   * @see #getDefines()
   * @generated
   */
  EAttribute getDefines_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.DefSort <em>Def Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Sort</em>'.
   * @see uk.ac.open.event.eventcalculus.DefSort
   * @generated
   */
  EClass getDefSort();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.DefSort#getReified <em>Reified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reified</em>'.
   * @see uk.ac.open.event.eventcalculus.DefSort#getReified()
   * @see #getDefSort()
   * @generated
   */
  EAttribute getDefSort_Reified();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.DefSort#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.open.event.eventcalculus.DefSort#getType()
   * @see #getDefSort()
   * @generated
   */
  EAttribute getDefSort_Type();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.DefRange <em>Def Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Range</em>'.
   * @see uk.ac.open.event.eventcalculus.DefRange
   * @generated
   */
  EClass getDefRange();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.event.eventcalculus.DefRange#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see uk.ac.open.event.eventcalculus.DefRange#getName()
   * @see #getDefRange()
   * @generated
   */
  EReference getDefRange_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.DefRange#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see uk.ac.open.event.eventcalculus.DefRange#getMin()
   * @see #getDefRange()
   * @generated
   */
  EAttribute getDefRange_Min();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.DefRange#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see uk.ac.open.event.eventcalculus.DefRange#getMax()
   * @see #getDefRange()
   * @generated
   */
  EAttribute getDefRange_Max();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.DefOption <em>Def Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Option</em>'.
   * @see uk.ac.open.event.eventcalculus.DefOption
   * @generated
   */
  EClass getDefOption();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.DefOption#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.event.eventcalculus.DefOption#getName()
   * @see #getDefOption()
   * @generated
   */
  EAttribute getDefOption_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.DefOption#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.open.event.eventcalculus.DefOption#getValue()
   * @see #getDefOption()
   * @generated
   */
  EAttribute getDefOption_Value();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.DefOption#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value2</em>'.
   * @see uk.ac.open.event.eventcalculus.DefOption#getValue2()
   * @see #getDefOption()
   * @generated
   */
  EAttribute getDefOption_Value2();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.DefCompletion <em>Def Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Completion</em>'.
   * @see uk.ac.open.event.eventcalculus.DefCompletion
   * @generated
   */
  EClass getDefCompletion();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.DefCompletion#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.open.event.eventcalculus.DefCompletion#getType()
   * @see #getDefCompletion()
   * @generated
   */
  EAttribute getDefCompletion_Type();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.event.eventcalculus.DefCompletion#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Label</em>'.
   * @see uk.ac.open.event.eventcalculus.DefCompletion#getLabel()
   * @see #getDefCompletion()
   * @generated
   */
  EReference getDefCompletion_Label();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.DefNonInertia <em>Def Non Inertia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Non Inertia</em>'.
   * @see uk.ac.open.event.eventcalculus.DefNonInertia
   * @generated
   */
  EClass getDefNonInertia();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.event.eventcalculus.DefNonInertia#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Names</em>'.
   * @see uk.ac.open.event.eventcalculus.DefNonInertia#getNames()
   * @see #getDefNonInertia()
   * @generated
   */
  EReference getDefNonInertia_Names();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.DefXor <em>Def Xor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Xor</em>'.
   * @see uk.ac.open.event.eventcalculus.DefXor
   * @generated
   */
  EClass getDefXor();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.event.eventcalculus.DefXor#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Names</em>'.
   * @see uk.ac.open.event.eventcalculus.DefXor#getNames()
   * @see #getDefXor()
   * @generated
   */
  EReference getDefXor_Names();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.DefMutex <em>Def Mutex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Mutex</em>'.
   * @see uk.ac.open.event.eventcalculus.DefMutex
   * @generated
   */
  EClass getDefMutex();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.event.eventcalculus.DefMutex#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Names</em>'.
   * @see uk.ac.open.event.eventcalculus.DefMutex#getNames()
   * @see #getDefMutex()
   * @generated
   */
  EReference getDefMutex_Names();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see uk.ac.open.event.eventcalculus.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.Statement#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see uk.ac.open.event.eventcalculus.Statement#getAnnotations()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Annotations();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.LabeledExpression <em>Labeled Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Labeled Expression</em>'.
   * @see uk.ac.open.event.eventcalculus.LabeledExpression
   * @generated
   */
  EClass getLabeledExpression();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.LabeledExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.event.eventcalculus.LabeledExpression#getName()
   * @see #getLabeledExpression()
   * @generated
   */
  EAttribute getLabeledExpression_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.LabeledExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see uk.ac.open.event.eventcalculus.LabeledExpression#getExpr()
   * @see #getLabeledExpression()
   * @generated
   */
  EReference getLabeledExpression_Expr();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.SortDefinition <em>Sort Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort Definition</em>'.
   * @see uk.ac.open.event.eventcalculus.SortDefinition
   * @generated
   */
  EClass getSortDefinition();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.event.eventcalculus.SortDefinition#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sort</em>'.
   * @see uk.ac.open.event.eventcalculus.SortDefinition#getSort()
   * @see #getSortDefinition()
   * @generated
   */
  EReference getSortDefinition_Sort();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.SortDefinition#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see uk.ac.open.event.eventcalculus.SortDefinition#getDefinitions()
   * @see #getSortDefinition()
   * @generated
   */
  EReference getSortDefinition_Definitions();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see uk.ac.open.event.eventcalculus.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.event.eventcalculus.Definition#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Args</em>'.
   * @see uk.ac.open.event.eventcalculus.Definition#getArgs()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Args();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.event.eventcalculus.Definition#getReturn <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Return</em>'.
   * @see uk.ac.open.event.eventcalculus.Definition#getReturn()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Return();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see uk.ac.open.event.eventcalculus.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Expression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see uk.ac.open.event.eventcalculus.Expression#getExpr()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Expr();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Expression#getQualifiers <em>Qualifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualifiers</em>'.
   * @see uk.ac.open.event.eventcalculus.Expression#getQualifiers()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Qualifiers();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.Expression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see uk.ac.open.event.eventcalculus.Expression#getOp()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see uk.ac.open.event.eventcalculus.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.Expression#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see uk.ac.open.event.eventcalculus.Expression#getN()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_N();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.event.eventcalculus.Expression#getDefine <em>Define</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Define</em>'.
   * @see uk.ac.open.event.eventcalculus.Expression#getDefine()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Define();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Qualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualifier</em>'.
   * @see uk.ac.open.event.eventcalculus.Qualifier
   * @generated
   */
  EClass getQualifier();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.Qualifier#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see uk.ac.open.event.eventcalculus.Qualifier#getOp()
   * @see #getQualifier()
   * @generated
   */
  EAttribute getQualifier_Op();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Qualifier#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see uk.ac.open.event.eventcalculus.Qualifier#getParameters()
   * @see #getQualifier()
   * @generated
   */
  EReference getQualifier_Parameters();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Parameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameters</em>'.
   * @see uk.ac.open.event.eventcalculus.Parameters
   * @generated
   */
  EClass getParameters();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.event.eventcalculus.Parameters#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Names</em>'.
   * @see uk.ac.open.event.eventcalculus.Parameters#getNames()
   * @see #getParameters()
   * @generated
   */
  EReference getParameters_Names();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.TerminalExpression <em>Terminal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminal Expression</em>'.
   * @see uk.ac.open.event.eventcalculus.TerminalExpression
   * @generated
   */
  EClass getTerminalExpression();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.AssignPlus <em>Assign Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign Plus</em>'.
   * @see uk.ac.open.event.eventcalculus.AssignPlus
   * @generated
   */
  EClass getAssignPlus();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.AssignPlus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.AssignPlus#getLeft()
   * @see #getAssignPlus()
   * @generated
   */
  EReference getAssignPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.AssignPlus#getQ <em>Q</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Q</em>'.
   * @see uk.ac.open.event.eventcalculus.AssignPlus#getQ()
   * @see #getAssignPlus()
   * @generated
   */
  EReference getAssignPlus_Q();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.AssignMin <em>Assign Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign Min</em>'.
   * @see uk.ac.open.event.eventcalculus.AssignMin
   * @generated
   */
  EClass getAssignMin();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.AssignMin#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.AssignMin#getLeft()
   * @see #getAssignMin()
   * @generated
   */
  EReference getAssignMin_Left();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.AssignMin#getQ <em>Q</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Q</em>'.
   * @see uk.ac.open.event.eventcalculus.AssignMin#getQ()
   * @see #getAssignMin()
   * @generated
   */
  EReference getAssignMin_Q();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see uk.ac.open.event.eventcalculus.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.Or#getLeft()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Or#getQ <em>Q</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Q</em>'.
   * @see uk.ac.open.event.eventcalculus.Or#getQ()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Q();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see uk.ac.open.event.eventcalculus.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.And#getLeft()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.And#getQ <em>Q</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Q</em>'.
   * @see uk.ac.open.event.eventcalculus.And#getQ()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Q();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.RelNotEq <em>Rel Not Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Not Eq</em>'.
   * @see uk.ac.open.event.eventcalculus.RelNotEq
   * @generated
   */
  EClass getRelNotEq();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.RelNotEq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.RelNotEq#getLeft()
   * @see #getRelNotEq()
   * @generated
   */
  EReference getRelNotEq_Left();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.RelEqEq <em>Rel Eq Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Eq Eq</em>'.
   * @see uk.ac.open.event.eventcalculus.RelEqEq
   * @generated
   */
  EClass getRelEqEq();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.RelEqEq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.RelEqEq#getLeft()
   * @see #getRelEqEq()
   * @generated
   */
  EReference getRelEqEq_Left();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.RelLtEq <em>Rel Lt Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Lt Eq</em>'.
   * @see uk.ac.open.event.eventcalculus.RelLtEq
   * @generated
   */
  EClass getRelLtEq();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.RelLtEq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.RelLtEq#getLeft()
   * @see #getRelLtEq()
   * @generated
   */
  EReference getRelLtEq_Left();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.RelGtEq <em>Rel Gt Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Gt Eq</em>'.
   * @see uk.ac.open.event.eventcalculus.RelGtEq
   * @generated
   */
  EClass getRelGtEq();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.RelGtEq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.RelGtEq#getLeft()
   * @see #getRelGtEq()
   * @generated
   */
  EReference getRelGtEq_Left();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.RelEq <em>Rel Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Eq</em>'.
   * @see uk.ac.open.event.eventcalculus.RelEq
   * @generated
   */
  EClass getRelEq();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.RelEq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.RelEq#getLeft()
   * @see #getRelEq()
   * @generated
   */
  EReference getRelEq_Left();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.RelLt <em>Rel Lt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Lt</em>'.
   * @see uk.ac.open.event.eventcalculus.RelLt
   * @generated
   */
  EClass getRelLt();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.RelLt#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.RelLt#getLeft()
   * @see #getRelLt()
   * @generated
   */
  EReference getRelLt_Left();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.RelGt <em>Rel Gt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Gt</em>'.
   * @see uk.ac.open.event.eventcalculus.RelGt
   * @generated
   */
  EClass getRelGt();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.RelGt#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.RelGt#getLeft()
   * @see #getRelGt()
   * @generated
   */
  EReference getRelGt_Left();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see uk.ac.open.event.eventcalculus.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see uk.ac.open.event.eventcalculus.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see uk.ac.open.event.eventcalculus.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Multi#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.Multi#getLeft()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Left();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see uk.ac.open.event.eventcalculus.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.Pow <em>Pow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pow</em>'.
   * @see uk.ac.open.event.eventcalculus.Pow
   * @generated
   */
  EClass getPow();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.Pow#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.event.eventcalculus.Pow#getLeft()
   * @see #getPow()
   * @generated
   */
  EReference getPow_Left();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.FunctionRef <em>Function Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Ref</em>'.
   * @see uk.ac.open.event.eventcalculus.FunctionRef
   * @generated
   */
  EClass getFunctionRef();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.event.eventcalculus.FunctionRef#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Func</em>'.
   * @see uk.ac.open.event.eventcalculus.FunctionRef#getFunc()
   * @see #getFunctionRef()
   * @generated
   */
  EReference getFunctionRef_Func();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.event.eventcalculus.FunctionRef#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see uk.ac.open.event.eventcalculus.FunctionRef#getArgs()
   * @see #getFunctionRef()
   * @generated
   */
  EReference getFunctionRef_Args();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see uk.ac.open.event.eventcalculus.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.open.event.eventcalculus.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see uk.ac.open.event.eventcalculus.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.open.event.eventcalculus.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.open.event.eventcalculus.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see uk.ac.open.event.eventcalculus.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.event.eventcalculus.BooleanLiteral#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.open.event.eventcalculus.BooleanLiteral#isValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for enum '{@link uk.ac.open.event.eventcalculus.ANNOTATION_TYPE <em>ANNOTATION TYPE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>ANNOTATION TYPE</em>'.
   * @see uk.ac.open.event.eventcalculus.ANNOTATION_TYPE
   * @generated
   */
  EEnum getANNOTATION_TYPE();

  /**
   * Returns the meta object for enum '{@link uk.ac.open.event.eventcalculus.LabelType <em>Label Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Label Type</em>'.
   * @see uk.ac.open.event.eventcalculus.LabelType
   * @generated
   */
  EEnum getLabelType();

  /**
   * Returns the meta object for enum '{@link uk.ac.open.event.eventcalculus.UnaryOp <em>Unary Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unary Op</em>'.
   * @see uk.ac.open.event.eventcalculus.UnaryOp
   * @generated
   */
  EEnum getUnaryOp();

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
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.ModelImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DECLARATIONS = eINSTANCE.getModel_Declarations();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STATEMENTS = eINSTANCE.getModel_Statements();

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
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.AnnotationImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__TYPE = eINSTANCE.getAnnotation_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.DeclarationImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__ANNOTATIONS = eINSTANCE.getDeclaration_Annotations();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.DefinesImpl <em>Defines</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.DefinesImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefines()
     * @generated
     */
    EClass DEFINES = eINSTANCE.getDefines();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINES__NAME = eINSTANCE.getDefines_Name();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.DefSortImpl <em>Def Sort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.DefSortImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefSort()
     * @generated
     */
    EClass DEF_SORT = eINSTANCE.getDefSort();

    /**
     * The meta object literal for the '<em><b>Reified</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_SORT__REIFIED = eINSTANCE.getDefSort_Reified();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_SORT__TYPE = eINSTANCE.getDefSort_Type();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.DefRangeImpl <em>Def Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.DefRangeImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefRange()
     * @generated
     */
    EClass DEF_RANGE = eINSTANCE.getDefRange();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_RANGE__NAME = eINSTANCE.getDefRange_Name();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_RANGE__MIN = eINSTANCE.getDefRange_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_RANGE__MAX = eINSTANCE.getDefRange_Max();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.DefOptionImpl <em>Def Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.DefOptionImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefOption()
     * @generated
     */
    EClass DEF_OPTION = eINSTANCE.getDefOption();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_OPTION__NAME = eINSTANCE.getDefOption_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_OPTION__VALUE = eINSTANCE.getDefOption_Value();

    /**
     * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_OPTION__VALUE2 = eINSTANCE.getDefOption_Value2();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.DefCompletionImpl <em>Def Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.DefCompletionImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefCompletion()
     * @generated
     */
    EClass DEF_COMPLETION = eINSTANCE.getDefCompletion();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_COMPLETION__TYPE = eINSTANCE.getDefCompletion_Type();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_COMPLETION__LABEL = eINSTANCE.getDefCompletion_Label();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.DefNonInertiaImpl <em>Def Non Inertia</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.DefNonInertiaImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefNonInertia()
     * @generated
     */
    EClass DEF_NON_INERTIA = eINSTANCE.getDefNonInertia();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_NON_INERTIA__NAMES = eINSTANCE.getDefNonInertia_Names();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.DefXorImpl <em>Def Xor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.DefXorImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefXor()
     * @generated
     */
    EClass DEF_XOR = eINSTANCE.getDefXor();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_XOR__NAMES = eINSTANCE.getDefXor_Names();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.DefMutexImpl <em>Def Mutex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.DefMutexImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefMutex()
     * @generated
     */
    EClass DEF_MUTEX = eINSTANCE.getDefMutex();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_MUTEX__NAMES = eINSTANCE.getDefMutex_Names();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.StatementImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__ANNOTATIONS = eINSTANCE.getStatement_Annotations();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.LabeledExpressionImpl <em>Labeled Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.LabeledExpressionImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getLabeledExpression()
     * @generated
     */
    EClass LABELED_EXPRESSION = eINSTANCE.getLabeledExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABELED_EXPRESSION__NAME = eINSTANCE.getLabeledExpression_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELED_EXPRESSION__EXPR = eINSTANCE.getLabeledExpression_Expr();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.SortDefinitionImpl <em>Sort Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.SortDefinitionImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getSortDefinition()
     * @generated
     */
    EClass SORT_DEFINITION = eINSTANCE.getSortDefinition();

    /**
     * The meta object literal for the '<em><b>Sort</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SORT_DEFINITION__SORT = eINSTANCE.getSortDefinition_Sort();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SORT_DEFINITION__DEFINITIONS = eINSTANCE.getSortDefinition_Definitions();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.DefinitionImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__ARGS = eINSTANCE.getDefinition_Args();

    /**
     * The meta object literal for the '<em><b>Return</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__RETURN = eINSTANCE.getDefinition_Return();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.ExpressionImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXPR = eINSTANCE.getExpression_Expr();

    /**
     * The meta object literal for the '<em><b>Qualifiers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__QUALIFIERS = eINSTANCE.getExpression_Qualifiers();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OP = eINSTANCE.getExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__N = eINSTANCE.getExpression_N();

    /**
     * The meta object literal for the '<em><b>Define</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__DEFINE = eINSTANCE.getExpression_Define();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.QualifierImpl <em>Qualifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.QualifierImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getQualifier()
     * @generated
     */
    EClass QUALIFIER = eINSTANCE.getQualifier();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIER__OP = eINSTANCE.getQualifier_Op();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIER__PARAMETERS = eINSTANCE.getQualifier_Parameters();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.ParametersImpl <em>Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.ParametersImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getParameters()
     * @generated
     */
    EClass PARAMETERS = eINSTANCE.getParameters();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERS__NAMES = eINSTANCE.getParameters_Names();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.TerminalExpressionImpl <em>Terminal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.TerminalExpressionImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getTerminalExpression()
     * @generated
     */
    EClass TERMINAL_EXPRESSION = eINSTANCE.getTerminalExpression();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.AssignPlusImpl <em>Assign Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.AssignPlusImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getAssignPlus()
     * @generated
     */
    EClass ASSIGN_PLUS = eINSTANCE.getAssignPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_PLUS__LEFT = eINSTANCE.getAssignPlus_Left();

    /**
     * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_PLUS__Q = eINSTANCE.getAssignPlus_Q();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.AssignMinImpl <em>Assign Min</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.AssignMinImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getAssignMin()
     * @generated
     */
    EClass ASSIGN_MIN = eINSTANCE.getAssignMin();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_MIN__LEFT = eINSTANCE.getAssignMin_Left();

    /**
     * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_MIN__Q = eINSTANCE.getAssignMin_Q();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.OrImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__LEFT = eINSTANCE.getOr_Left();

    /**
     * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__Q = eINSTANCE.getOr_Q();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.AndImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__LEFT = eINSTANCE.getAnd_Left();

    /**
     * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__Q = eINSTANCE.getAnd_Q();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.RelNotEqImpl <em>Rel Not Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.RelNotEqImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRelNotEq()
     * @generated
     */
    EClass REL_NOT_EQ = eINSTANCE.getRelNotEq();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_NOT_EQ__LEFT = eINSTANCE.getRelNotEq_Left();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.RelEqEqImpl <em>Rel Eq Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.RelEqEqImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRelEqEq()
     * @generated
     */
    EClass REL_EQ_EQ = eINSTANCE.getRelEqEq();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_EQ_EQ__LEFT = eINSTANCE.getRelEqEq_Left();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.RelLtEqImpl <em>Rel Lt Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.RelLtEqImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRelLtEq()
     * @generated
     */
    EClass REL_LT_EQ = eINSTANCE.getRelLtEq();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_LT_EQ__LEFT = eINSTANCE.getRelLtEq_Left();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.RelGtEqImpl <em>Rel Gt Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.RelGtEqImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRelGtEq()
     * @generated
     */
    EClass REL_GT_EQ = eINSTANCE.getRelGtEq();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_GT_EQ__LEFT = eINSTANCE.getRelGtEq_Left();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.RelEqImpl <em>Rel Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.RelEqImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRelEq()
     * @generated
     */
    EClass REL_EQ = eINSTANCE.getRelEq();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_EQ__LEFT = eINSTANCE.getRelEq_Left();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.RelLtImpl <em>Rel Lt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.RelLtImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRelLt()
     * @generated
     */
    EClass REL_LT = eINSTANCE.getRelLt();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_LT__LEFT = eINSTANCE.getRelLt_Left();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.RelGtImpl <em>Rel Gt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.RelGtImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getRelGt()
     * @generated
     */
    EClass REL_GT = eINSTANCE.getRelGt();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_GT__LEFT = eINSTANCE.getRelGt_Left();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.PlusImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.MinusImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.MultiImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getMulti()
     * @generated
     */
    EClass MULTI = eINSTANCE.getMulti();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__LEFT = eINSTANCE.getMulti_Left();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.DivImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__LEFT = eINSTANCE.getDiv_Left();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.PowImpl <em>Pow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.PowImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getPow()
     * @generated
     */
    EClass POW = eINSTANCE.getPow();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POW__LEFT = eINSTANCE.getPow_Left();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.FunctionRefImpl <em>Function Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.FunctionRefImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getFunctionRef()
     * @generated
     */
    EClass FUNCTION_REF = eINSTANCE.getFunctionRef();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_REF__FUNC = eINSTANCE.getFunctionRef_Func();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_REF__ARGS = eINSTANCE.getFunctionRef_Args();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.IntLiteralImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getIntLiteral()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getIntLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.StringLiteralImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.impl.BooleanLiteralImpl
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.ANNOTATION_TYPE <em>ANNOTATION TYPE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.ANNOTATION_TYPE
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getANNOTATION_TYPE()
     * @generated
     */
    EEnum ANNOTATION_TYPE = eINSTANCE.getANNOTATION_TYPE();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.LabelType <em>Label Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.LabelType
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getLabelType()
     * @generated
     */
    EEnum LABEL_TYPE = eINSTANCE.getLabelType();

    /**
     * The meta object literal for the '{@link uk.ac.open.event.eventcalculus.UnaryOp <em>Unary Op</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.event.eventcalculus.UnaryOp
     * @see uk.ac.open.event.eventcalculus.impl.EventcalculusPackageImpl#getUnaryOp()
     * @generated
     */
    EEnum UNARY_OP = eINSTANCE.getUnaryOp();

  }

} //EventcalculusPackage
