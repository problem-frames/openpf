/**
 */
package argument.argument;

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
 * @see argument.argument.ArgumentFactory
 * @model kind="package"
 * @generated
 */
public interface ArgumentPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "argument";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://sead1.open.ac.uk/argument/Argument";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "argument";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArgumentPackage eINSTANCE = argument.argument.impl.ArgumentPackageImpl.init();

  /**
   * The meta object id for the '{@link argument.argument.impl.ArgumentDiagramImpl <em>Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.ArgumentDiagramImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getArgumentDiagram()
   * @generated
   */
  int ARGUMENT_DIAGRAM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DIAGRAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DIAGRAM__NODES = 1;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DIAGRAM__LINKS = 2;

  /**
   * The number of structural features of the '<em>Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DIAGRAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.LinkImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getLink()
   * @generated
   */
  int LINK = 1;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__FROM = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TO = 1;

  /**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__GENERATED = 2;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.RebutsImpl <em>Rebuts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.RebutsImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getRebuts()
   * @generated
   */
  int REBUTS = 2;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REBUTS__FROM = LINK__FROM;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REBUTS__TO = LINK__TO;

  /**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REBUTS__GENERATED = LINK__GENERATED;

  /**
   * The feature id for the '<em><b>Denies</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REBUTS__DENIES = LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rebuts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REBUTS_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link argument.argument.impl.MitigatesImpl <em>Mitigates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.MitigatesImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getMitigates()
   * @generated
   */
  int MITIGATES = 3;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGATES__FROM = LINK__FROM;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGATES__TO = LINK__TO;

  /**
   * The feature id for the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGATES__GENERATED = LINK__GENERATED;

  /**
   * The feature id for the '<em><b>Restores</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGATES__RESTORES = LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mitigates</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGATES_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link argument.argument.impl.PrePrimaryExprImpl <em>Pre Primary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.PrePrimaryExprImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getPrePrimaryExpr()
   * @generated
   */
  int PRE_PRIMARY_EXPR = 14;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_PRIMARY_EXPR__N = 0;

  /**
   * The number of structural features of the '<em>Pre Primary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_PRIMARY_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link argument.argument.impl.TerminalExpressionImpl <em>Terminal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.TerminalExpressionImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getTerminalExpression()
   * @generated
   */
  int TERMINAL_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__N = PRE_PRIMARY_EXPR__N;

  /**
   * The number of structural features of the '<em>Terminal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION_FEATURE_COUNT = PRE_PRIMARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link argument.argument.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.ArgumentImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 4;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__N = TERMINAL_EXPRESSION__N;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__NAME = TERMINAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__DESCRIPTION = TERMINAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Round</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__ROUND = TERMINAL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Replaces</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__REPLACES = TERMINAL_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__EXPR = TERMINAL_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Foreground</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__FOREGROUND = TERMINAL_EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Background</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__BACKGROUND = TERMINAL_EXPRESSION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Shape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__SHAPE = TERMINAL_EXPRESSION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Image</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__IMAGE = TERMINAL_EXPRESSION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Grounds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__GROUNDS = TERMINAL_EXPRESSION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Warrants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__WARRANTS = TERMINAL_EXPRESSION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__VALUE = TERMINAL_EXPRESSION_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = TERMINAL_EXPRESSION_FEATURE_COUNT + 12;

  /**
   * The meta object id for the '{@link argument.argument.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.ExpressionImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__N = PRE_PRIMARY_EXPR__N;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ASSIGN = PRE_PRIMARY_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = PRE_PRIMARY_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link argument.argument.impl.AssignmentOpImpl <em>Assignment Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.AssignmentOpImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getAssignmentOp()
   * @generated
   */
  int ASSIGNMENT_OP = 6;

  /**
   * The number of structural features of the '<em>Assignment Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link argument.argument.impl.OrExpImpl <em>Or Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.OrExpImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getOrExp()
   * @generated
   */
  int OR_EXP = 7;

  /**
   * The number of structural features of the '<em>Or Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXP_FEATURE_COUNT = ASSIGNMENT_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link argument.argument.impl.AndExpImpl <em>And Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.AndExpImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getAndExp()
   * @generated
   */
  int AND_EXP = 8;

  /**
   * The number of structural features of the '<em>And Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXP_FEATURE_COUNT = OR_EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link argument.argument.impl.RelationalImpl <em>Relational</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.RelationalImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getRelational()
   * @generated
   */
  int RELATIONAL = 9;

  /**
   * The number of structural features of the '<em>Relational</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_FEATURE_COUNT = AND_EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link argument.argument.impl.AdditionImpl <em>Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.AdditionImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getAddition()
   * @generated
   */
  int ADDITION = 10;

  /**
   * The number of structural features of the '<em>Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link argument.argument.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.MultiplicationImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 11;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = ADDITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link argument.argument.impl.PowerImpl <em>Power</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.PowerImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getPower()
   * @generated
   */
  int POWER = 12;

  /**
   * The number of structural features of the '<em>Power</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_FEATURE_COUNT = MULTIPLICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link argument.argument.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.UnaryExprImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getUnaryExpr()
   * @generated
   */
  int UNARY_EXPR = 13;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR__UOP = POWER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR__RIGHT = POWER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR_FEATURE_COUNT = POWER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link argument.argument.impl.AssignPlusImpl <em>Assign Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.AssignPlusImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getAssignPlus()
   * @generated
   */
  int ASSIGN_PLUS = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS__LEFT = ASSIGNMENT_OP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS__AOP = ASSIGNMENT_OP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS__RIGHT = ASSIGNMENT_OP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assign Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS_FEATURE_COUNT = ASSIGNMENT_OP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.AssignMinImpl <em>Assign Min</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.AssignMinImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getAssignMin()
   * @generated
   */
  int ASSIGN_MIN = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN__LEFT = ASSIGNMENT_OP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN__AOP = ASSIGNMENT_OP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN__RIGHT = ASSIGNMENT_OP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assign Min</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN_FEATURE_COUNT = ASSIGNMENT_OP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.OrImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getOr()
   * @generated
   */
  int OR = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT = OR_EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Or op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__OR_OP = OR_EXP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT = OR_EXP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = OR_EXP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.AndImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getAnd()
   * @generated
   */
  int AND = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT = AND_EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>And op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__AND_OP = AND_EXP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT = AND_EXP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = AND_EXP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.RelNotEqImpl <em>Rel Not Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.RelNotEqImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getRelNotEq()
   * @generated
   */
  int REL_NOT_EQ = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ__LEFT = RELATIONAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ__REL_OP = RELATIONAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ__RIGHT = RELATIONAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rel Not Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.RelEqEqImpl <em>Rel Eq Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.RelEqEqImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getRelEqEq()
   * @generated
   */
  int REL_EQ_EQ = 21;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ__LEFT = RELATIONAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ__REL_OP = RELATIONAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ__RIGHT = RELATIONAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rel Eq Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.RelLtEqImpl <em>Rel Lt Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.RelLtEqImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getRelLtEq()
   * @generated
   */
  int REL_LT_EQ = 22;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ__LEFT = RELATIONAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ__REL_OP = RELATIONAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ__RIGHT = RELATIONAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rel Lt Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.RelGtEqImpl <em>Rel Gt Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.RelGtEqImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getRelGtEq()
   * @generated
   */
  int REL_GT_EQ = 23;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ__LEFT = RELATIONAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ__REL_OP = RELATIONAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ__RIGHT = RELATIONAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rel Gt Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.RelEqImpl <em>Rel Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.RelEqImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getRelEq()
   * @generated
   */
  int REL_EQ = 24;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ__LEFT = RELATIONAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ__REL_OP = RELATIONAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ__RIGHT = RELATIONAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rel Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.RelLtImpl <em>Rel Lt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.RelLtImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getRelLt()
   * @generated
   */
  int REL_LT = 25;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT__LEFT = RELATIONAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT__REL_OP = RELATIONAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT__RIGHT = RELATIONAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rel Lt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.RelGtImpl <em>Rel Gt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.RelGtImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getRelGt()
   * @generated
   */
  int REL_GT = 26;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT__LEFT = RELATIONAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT__REL_OP = RELATIONAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT__RIGHT = RELATIONAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rel Gt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_FEATURE_COUNT = RELATIONAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.PlusImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = ADDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Add op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__ADD_OP = ADDITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = ADDITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = ADDITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.MinusImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = ADDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Add op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__ADD_OP = ADDITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = ADDITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = ADDITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.MultiImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getMulti()
   * @generated
   */
  int MULTI = 29;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__LEFT = MULTIPLICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mul op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__MUL_OP = MULTIPLICATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__RIGHT = MULTIPLICATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_FEATURE_COUNT = MULTIPLICATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.DivImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getDiv()
   * @generated
   */
  int DIV = 30;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = MULTIPLICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mul op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__MUL_OP = MULTIPLICATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = MULTIPLICATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = MULTIPLICATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.PowImpl <em>Pow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.PowImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getPow()
   * @generated
   */
  int POW = 31;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__LEFT = POWER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pow op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__POW_OP = POWER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__RIGHT = POWER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Pow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_FEATURE_COUNT = POWER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link argument.argument.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.IntLiteralImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 32;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__N = TERMINAL_EXPRESSION__N;

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
   * The meta object id for the '{@link argument.argument.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.impl.BooleanLiteralImpl
   * @see argument.argument.impl.ArgumentPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 33;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__N = TERMINAL_EXPRESSION__N;

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
   * The meta object id for the '{@link argument.argument.UnaryOp <em>Unary Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see argument.argument.UnaryOp
   * @see argument.argument.impl.ArgumentPackageImpl#getUnaryOp()
   * @generated
   */
  int UNARY_OP = 34;


  /**
   * Returns the meta object for class '{@link argument.argument.ArgumentDiagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagram</em>'.
   * @see argument.argument.ArgumentDiagram
   * @generated
   */
  EClass getArgumentDiagram();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.ArgumentDiagram#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see argument.argument.ArgumentDiagram#getName()
   * @see #getArgumentDiagram()
   * @generated
   */
  EAttribute getArgumentDiagram_Name();

  /**
   * Returns the meta object for the containment reference list '{@link argument.argument.ArgumentDiagram#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see argument.argument.ArgumentDiagram#getNodes()
   * @see #getArgumentDiagram()
   * @generated
   */
  EReference getArgumentDiagram_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link argument.argument.ArgumentDiagram#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see argument.argument.ArgumentDiagram#getLinks()
   * @see #getArgumentDiagram()
   * @generated
   */
  EReference getArgumentDiagram_Links();

  /**
   * Returns the meta object for class '{@link argument.argument.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see argument.argument.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the reference '{@link argument.argument.Link#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see argument.argument.Link#getFrom()
   * @see #getLink()
   * @generated
   */
  EReference getLink_From();

  /**
   * Returns the meta object for the reference '{@link argument.argument.Link#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see argument.argument.Link#getTo()
   * @see #getLink()
   * @generated
   */
  EReference getLink_To();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.Link#isGenerated <em>Generated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generated</em>'.
   * @see argument.argument.Link#isGenerated()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Generated();

  /**
   * Returns the meta object for class '{@link argument.argument.Rebuts <em>Rebuts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rebuts</em>'.
   * @see argument.argument.Rebuts
   * @generated
   */
  EClass getRebuts();

  /**
   * Returns the meta object for the reference '{@link argument.argument.Rebuts#getDenies <em>Denies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Denies</em>'.
   * @see argument.argument.Rebuts#getDenies()
   * @see #getRebuts()
   * @generated
   */
  EReference getRebuts_Denies();

  /**
   * Returns the meta object for class '{@link argument.argument.Mitigates <em>Mitigates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mitigates</em>'.
   * @see argument.argument.Mitigates
   * @generated
   */
  EClass getMitigates();

  /**
   * Returns the meta object for the reference '{@link argument.argument.Mitigates#getRestores <em>Restores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Restores</em>'.
   * @see argument.argument.Mitigates#getRestores()
   * @see #getMitigates()
   * @generated
   */
  EReference getMitigates_Restores();

  /**
   * Returns the meta object for class '{@link argument.argument.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see argument.argument.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.Argument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see argument.argument.Argument#getName()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Name();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.Argument#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see argument.argument.Argument#getDescription()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Description();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.Argument#getRound <em>Round</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Round</em>'.
   * @see argument.argument.Argument#getRound()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Round();

  /**
   * Returns the meta object for the reference '{@link argument.argument.Argument#getReplaces <em>Replaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Replaces</em>'.
   * @see argument.argument.Argument#getReplaces()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Replaces();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.Argument#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see argument.argument.Argument#getExpr()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Expr();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.Argument#getForeground <em>Foreground</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Foreground</em>'.
   * @see argument.argument.Argument#getForeground()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Foreground();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.Argument#getBackground <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Background</em>'.
   * @see argument.argument.Argument#getBackground()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Background();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.Argument#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shape</em>'.
   * @see argument.argument.Argument#getShape()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Shape();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.Argument#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image</em>'.
   * @see argument.argument.Argument#getImage()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Image();

  /**
   * Returns the meta object for the containment reference list '{@link argument.argument.Argument#getGrounds <em>Grounds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Grounds</em>'.
   * @see argument.argument.Argument#getGrounds()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Grounds();

  /**
   * Returns the meta object for the containment reference list '{@link argument.argument.Argument#getWarrants <em>Warrants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Warrants</em>'.
   * @see argument.argument.Argument#getWarrants()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Warrants();

  /**
   * Returns the meta object for the reference '{@link argument.argument.Argument#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see argument.argument.Argument#getValue()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Value();

  /**
   * Returns the meta object for class '{@link argument.argument.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see argument.argument.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.Expression#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assign</em>'.
   * @see argument.argument.Expression#getAssign()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Assign();

  /**
   * Returns the meta object for class '{@link argument.argument.AssignmentOp <em>Assignment Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Op</em>'.
   * @see argument.argument.AssignmentOp
   * @generated
   */
  EClass getAssignmentOp();

  /**
   * Returns the meta object for class '{@link argument.argument.OrExp <em>Or Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Exp</em>'.
   * @see argument.argument.OrExp
   * @generated
   */
  EClass getOrExp();

  /**
   * Returns the meta object for class '{@link argument.argument.AndExp <em>And Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Exp</em>'.
   * @see argument.argument.AndExp
   * @generated
   */
  EClass getAndExp();

  /**
   * Returns the meta object for class '{@link argument.argument.Relational <em>Relational</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational</em>'.
   * @see argument.argument.Relational
   * @generated
   */
  EClass getRelational();

  /**
   * Returns the meta object for class '{@link argument.argument.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition</em>'.
   * @see argument.argument.Addition
   * @generated
   */
  EClass getAddition();

  /**
   * Returns the meta object for class '{@link argument.argument.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see argument.argument.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the meta object for class '{@link argument.argument.Power <em>Power</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Power</em>'.
   * @see argument.argument.Power
   * @generated
   */
  EClass getPower();

  /**
   * Returns the meta object for class '{@link argument.argument.UnaryExpr <em>Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expr</em>'.
   * @see argument.argument.UnaryExpr
   * @generated
   */
  EClass getUnaryExpr();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.UnaryExpr#getUop <em>Uop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uop</em>'.
   * @see argument.argument.UnaryExpr#getUop()
   * @see #getUnaryExpr()
   * @generated
   */
  EAttribute getUnaryExpr_Uop();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.UnaryExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.UnaryExpr#getRight()
   * @see #getUnaryExpr()
   * @generated
   */
  EReference getUnaryExpr_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.PrePrimaryExpr <em>Pre Primary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Primary Expr</em>'.
   * @see argument.argument.PrePrimaryExpr
   * @generated
   */
  EClass getPrePrimaryExpr();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.PrePrimaryExpr#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see argument.argument.PrePrimaryExpr#getN()
   * @see #getPrePrimaryExpr()
   * @generated
   */
  EAttribute getPrePrimaryExpr_N();

  /**
   * Returns the meta object for class '{@link argument.argument.TerminalExpression <em>Terminal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminal Expression</em>'.
   * @see argument.argument.TerminalExpression
   * @generated
   */
  EClass getTerminalExpression();

  /**
   * Returns the meta object for class '{@link argument.argument.AssignPlus <em>Assign Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign Plus</em>'.
   * @see argument.argument.AssignPlus
   * @generated
   */
  EClass getAssignPlus();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.AssignPlus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.AssignPlus#getLeft()
   * @see #getAssignPlus()
   * @generated
   */
  EReference getAssignPlus_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.AssignPlus#getAop <em>Aop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aop</em>'.
   * @see argument.argument.AssignPlus#getAop()
   * @see #getAssignPlus()
   * @generated
   */
  EAttribute getAssignPlus_Aop();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.AssignPlus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.AssignPlus#getRight()
   * @see #getAssignPlus()
   * @generated
   */
  EReference getAssignPlus_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.AssignMin <em>Assign Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign Min</em>'.
   * @see argument.argument.AssignMin
   * @generated
   */
  EClass getAssignMin();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.AssignMin#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.AssignMin#getLeft()
   * @see #getAssignMin()
   * @generated
   */
  EReference getAssignMin_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.AssignMin#getAop <em>Aop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aop</em>'.
   * @see argument.argument.AssignMin#getAop()
   * @see #getAssignMin()
   * @generated
   */
  EAttribute getAssignMin_Aop();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.AssignMin#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.AssignMin#getRight()
   * @see #getAssignMin()
   * @generated
   */
  EReference getAssignMin_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see argument.argument.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.Or#getLeft()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.Or#getOr_op <em>Or op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Or op</em>'.
   * @see argument.argument.Or#getOr_op()
   * @see #getOr()
   * @generated
   */
  EAttribute getOr_Or_op();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.Or#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.Or#getRight()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see argument.argument.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.And#getLeft()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.And#getAnd_op <em>And op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>And op</em>'.
   * @see argument.argument.And#getAnd_op()
   * @see #getAnd()
   * @generated
   */
  EAttribute getAnd_And_op();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.And#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.And#getRight()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.RelNotEq <em>Rel Not Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Not Eq</em>'.
   * @see argument.argument.RelNotEq
   * @generated
   */
  EClass getRelNotEq();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.RelNotEq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.RelNotEq#getLeft()
   * @see #getRelNotEq()
   * @generated
   */
  EReference getRelNotEq_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.RelNotEq#getRel_op <em>Rel op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel op</em>'.
   * @see argument.argument.RelNotEq#getRel_op()
   * @see #getRelNotEq()
   * @generated
   */
  EAttribute getRelNotEq_Rel_op();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.RelNotEq#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.RelNotEq#getRight()
   * @see #getRelNotEq()
   * @generated
   */
  EReference getRelNotEq_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.RelEqEq <em>Rel Eq Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Eq Eq</em>'.
   * @see argument.argument.RelEqEq
   * @generated
   */
  EClass getRelEqEq();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.RelEqEq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.RelEqEq#getLeft()
   * @see #getRelEqEq()
   * @generated
   */
  EReference getRelEqEq_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.RelEqEq#getRel_op <em>Rel op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel op</em>'.
   * @see argument.argument.RelEqEq#getRel_op()
   * @see #getRelEqEq()
   * @generated
   */
  EAttribute getRelEqEq_Rel_op();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.RelEqEq#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.RelEqEq#getRight()
   * @see #getRelEqEq()
   * @generated
   */
  EReference getRelEqEq_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.RelLtEq <em>Rel Lt Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Lt Eq</em>'.
   * @see argument.argument.RelLtEq
   * @generated
   */
  EClass getRelLtEq();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.RelLtEq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.RelLtEq#getLeft()
   * @see #getRelLtEq()
   * @generated
   */
  EReference getRelLtEq_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.RelLtEq#getRel_op <em>Rel op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel op</em>'.
   * @see argument.argument.RelLtEq#getRel_op()
   * @see #getRelLtEq()
   * @generated
   */
  EAttribute getRelLtEq_Rel_op();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.RelLtEq#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.RelLtEq#getRight()
   * @see #getRelLtEq()
   * @generated
   */
  EReference getRelLtEq_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.RelGtEq <em>Rel Gt Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Gt Eq</em>'.
   * @see argument.argument.RelGtEq
   * @generated
   */
  EClass getRelGtEq();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.RelGtEq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.RelGtEq#getLeft()
   * @see #getRelGtEq()
   * @generated
   */
  EReference getRelGtEq_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.RelGtEq#getRel_op <em>Rel op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel op</em>'.
   * @see argument.argument.RelGtEq#getRel_op()
   * @see #getRelGtEq()
   * @generated
   */
  EAttribute getRelGtEq_Rel_op();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.RelGtEq#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.RelGtEq#getRight()
   * @see #getRelGtEq()
   * @generated
   */
  EReference getRelGtEq_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.RelEq <em>Rel Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Eq</em>'.
   * @see argument.argument.RelEq
   * @generated
   */
  EClass getRelEq();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.RelEq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.RelEq#getLeft()
   * @see #getRelEq()
   * @generated
   */
  EReference getRelEq_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.RelEq#getRel_op <em>Rel op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel op</em>'.
   * @see argument.argument.RelEq#getRel_op()
   * @see #getRelEq()
   * @generated
   */
  EAttribute getRelEq_Rel_op();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.RelEq#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.RelEq#getRight()
   * @see #getRelEq()
   * @generated
   */
  EReference getRelEq_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.RelLt <em>Rel Lt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Lt</em>'.
   * @see argument.argument.RelLt
   * @generated
   */
  EClass getRelLt();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.RelLt#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.RelLt#getLeft()
   * @see #getRelLt()
   * @generated
   */
  EReference getRelLt_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.RelLt#getRel_op <em>Rel op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel op</em>'.
   * @see argument.argument.RelLt#getRel_op()
   * @see #getRelLt()
   * @generated
   */
  EAttribute getRelLt_Rel_op();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.RelLt#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.RelLt#getRight()
   * @see #getRelLt()
   * @generated
   */
  EReference getRelLt_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.RelGt <em>Rel Gt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Gt</em>'.
   * @see argument.argument.RelGt
   * @generated
   */
  EClass getRelGt();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.RelGt#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.RelGt#getLeft()
   * @see #getRelGt()
   * @generated
   */
  EReference getRelGt_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.RelGt#getRel_op <em>Rel op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel op</em>'.
   * @see argument.argument.RelGt#getRel_op()
   * @see #getRelGt()
   * @generated
   */
  EAttribute getRelGt_Rel_op();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.RelGt#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.RelGt#getRight()
   * @see #getRelGt()
   * @generated
   */
  EReference getRelGt_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see argument.argument.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.Plus#getAdd_op <em>Add op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Add op</em>'.
   * @see argument.argument.Plus#getAdd_op()
   * @see #getPlus()
   * @generated
   */
  EAttribute getPlus_Add_op();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see argument.argument.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.Minus#getAdd_op <em>Add op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Add op</em>'.
   * @see argument.argument.Minus#getAdd_op()
   * @see #getMinus()
   * @generated
   */
  EAttribute getMinus_Add_op();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see argument.argument.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.Multi#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.Multi#getLeft()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.Multi#getMul_op <em>Mul op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mul op</em>'.
   * @see argument.argument.Multi#getMul_op()
   * @see #getMulti()
   * @generated
   */
  EAttribute getMulti_Mul_op();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.Multi#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.Multi#getRight()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see argument.argument.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.Div#getMul_op <em>Mul op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mul op</em>'.
   * @see argument.argument.Div#getMul_op()
   * @see #getDiv()
   * @generated
   */
  EAttribute getDiv_Mul_op();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.Div#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.Div#getRight()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.Pow <em>Pow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pow</em>'.
   * @see argument.argument.Pow
   * @generated
   */
  EClass getPow();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.Pow#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see argument.argument.Pow#getLeft()
   * @see #getPow()
   * @generated
   */
  EReference getPow_Left();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.Pow#getPow_op <em>Pow op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pow op</em>'.
   * @see argument.argument.Pow#getPow_op()
   * @see #getPow()
   * @generated
   */
  EAttribute getPow_Pow_op();

  /**
   * Returns the meta object for the containment reference '{@link argument.argument.Pow#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see argument.argument.Pow#getRight()
   * @see #getPow()
   * @generated
   */
  EReference getPow_Right();

  /**
   * Returns the meta object for class '{@link argument.argument.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see argument.argument.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see argument.argument.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link argument.argument.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see argument.argument.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link argument.argument.BooleanLiteral#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see argument.argument.BooleanLiteral#isValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for enum '{@link argument.argument.UnaryOp <em>Unary Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unary Op</em>'.
   * @see argument.argument.UnaryOp
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
  ArgumentFactory getArgumentFactory();

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
     * The meta object literal for the '{@link argument.argument.impl.ArgumentDiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.ArgumentDiagramImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getArgumentDiagram()
     * @generated
     */
    EClass ARGUMENT_DIAGRAM = eINSTANCE.getArgumentDiagram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT_DIAGRAM__NAME = eINSTANCE.getArgumentDiagram_Name();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT_DIAGRAM__NODES = eINSTANCE.getArgumentDiagram_Nodes();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT_DIAGRAM__LINKS = eINSTANCE.getArgumentDiagram_Links();

    /**
     * The meta object literal for the '{@link argument.argument.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.LinkImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getLink()
     * @generated
     */
    EClass LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__FROM = eINSTANCE.getLink_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__TO = eINSTANCE.getLink_To();

    /**
     * The meta object literal for the '<em><b>Generated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__GENERATED = eINSTANCE.getLink_Generated();

    /**
     * The meta object literal for the '{@link argument.argument.impl.RebutsImpl <em>Rebuts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.RebutsImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getRebuts()
     * @generated
     */
    EClass REBUTS = eINSTANCE.getRebuts();

    /**
     * The meta object literal for the '<em><b>Denies</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REBUTS__DENIES = eINSTANCE.getRebuts_Denies();

    /**
     * The meta object literal for the '{@link argument.argument.impl.MitigatesImpl <em>Mitigates</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.MitigatesImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getMitigates()
     * @generated
     */
    EClass MITIGATES = eINSTANCE.getMitigates();

    /**
     * The meta object literal for the '<em><b>Restores</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MITIGATES__RESTORES = eINSTANCE.getMitigates_Restores();

    /**
     * The meta object literal for the '{@link argument.argument.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.ArgumentImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__DESCRIPTION = eINSTANCE.getArgument_Description();

    /**
     * The meta object literal for the '<em><b>Round</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__ROUND = eINSTANCE.getArgument_Round();

    /**
     * The meta object literal for the '<em><b>Replaces</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__REPLACES = eINSTANCE.getArgument_Replaces();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__EXPR = eINSTANCE.getArgument_Expr();

    /**
     * The meta object literal for the '<em><b>Foreground</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__FOREGROUND = eINSTANCE.getArgument_Foreground();

    /**
     * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__BACKGROUND = eINSTANCE.getArgument_Background();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__SHAPE = eINSTANCE.getArgument_Shape();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__IMAGE = eINSTANCE.getArgument_Image();

    /**
     * The meta object literal for the '<em><b>Grounds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__GROUNDS = eINSTANCE.getArgument_Grounds();

    /**
     * The meta object literal for the '<em><b>Warrants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__WARRANTS = eINSTANCE.getArgument_Warrants();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__VALUE = eINSTANCE.getArgument_Value();

    /**
     * The meta object literal for the '{@link argument.argument.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.ExpressionImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Assign</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__ASSIGN = eINSTANCE.getExpression_Assign();

    /**
     * The meta object literal for the '{@link argument.argument.impl.AssignmentOpImpl <em>Assignment Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.AssignmentOpImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getAssignmentOp()
     * @generated
     */
    EClass ASSIGNMENT_OP = eINSTANCE.getAssignmentOp();

    /**
     * The meta object literal for the '{@link argument.argument.impl.OrExpImpl <em>Or Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.OrExpImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getOrExp()
     * @generated
     */
    EClass OR_EXP = eINSTANCE.getOrExp();

    /**
     * The meta object literal for the '{@link argument.argument.impl.AndExpImpl <em>And Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.AndExpImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getAndExp()
     * @generated
     */
    EClass AND_EXP = eINSTANCE.getAndExp();

    /**
     * The meta object literal for the '{@link argument.argument.impl.RelationalImpl <em>Relational</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.RelationalImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getRelational()
     * @generated
     */
    EClass RELATIONAL = eINSTANCE.getRelational();

    /**
     * The meta object literal for the '{@link argument.argument.impl.AdditionImpl <em>Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.AdditionImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getAddition()
     * @generated
     */
    EClass ADDITION = eINSTANCE.getAddition();

    /**
     * The meta object literal for the '{@link argument.argument.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.MultiplicationImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getMultiplication()
     * @generated
     */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
     * The meta object literal for the '{@link argument.argument.impl.PowerImpl <em>Power</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.PowerImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getPower()
     * @generated
     */
    EClass POWER = eINSTANCE.getPower();

    /**
     * The meta object literal for the '{@link argument.argument.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.UnaryExprImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getUnaryExpr()
     * @generated
     */
    EClass UNARY_EXPR = eINSTANCE.getUnaryExpr();

    /**
     * The meta object literal for the '<em><b>Uop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPR__UOP = eINSTANCE.getUnaryExpr_Uop();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPR__RIGHT = eINSTANCE.getUnaryExpr_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.PrePrimaryExprImpl <em>Pre Primary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.PrePrimaryExprImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getPrePrimaryExpr()
     * @generated
     */
    EClass PRE_PRIMARY_EXPR = eINSTANCE.getPrePrimaryExpr();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRE_PRIMARY_EXPR__N = eINSTANCE.getPrePrimaryExpr_N();

    /**
     * The meta object literal for the '{@link argument.argument.impl.TerminalExpressionImpl <em>Terminal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.TerminalExpressionImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getTerminalExpression()
     * @generated
     */
    EClass TERMINAL_EXPRESSION = eINSTANCE.getTerminalExpression();

    /**
     * The meta object literal for the '{@link argument.argument.impl.AssignPlusImpl <em>Assign Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.AssignPlusImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getAssignPlus()
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
     * The meta object literal for the '<em><b>Aop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGN_PLUS__AOP = eINSTANCE.getAssignPlus_Aop();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_PLUS__RIGHT = eINSTANCE.getAssignPlus_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.AssignMinImpl <em>Assign Min</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.AssignMinImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getAssignMin()
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
     * The meta object literal for the '<em><b>Aop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGN_MIN__AOP = eINSTANCE.getAssignMin_Aop();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_MIN__RIGHT = eINSTANCE.getAssignMin_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.OrImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getOr()
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
     * The meta object literal for the '<em><b>Or op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OR__OR_OP = eINSTANCE.getOr_Or_op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__RIGHT = eINSTANCE.getOr_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.AndImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getAnd()
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
     * The meta object literal for the '<em><b>And op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AND__AND_OP = eINSTANCE.getAnd_And_op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__RIGHT = eINSTANCE.getAnd_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.RelNotEqImpl <em>Rel Not Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.RelNotEqImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getRelNotEq()
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
     * The meta object literal for the '<em><b>Rel op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REL_NOT_EQ__REL_OP = eINSTANCE.getRelNotEq_Rel_op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_NOT_EQ__RIGHT = eINSTANCE.getRelNotEq_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.RelEqEqImpl <em>Rel Eq Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.RelEqEqImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getRelEqEq()
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
     * The meta object literal for the '<em><b>Rel op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REL_EQ_EQ__REL_OP = eINSTANCE.getRelEqEq_Rel_op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_EQ_EQ__RIGHT = eINSTANCE.getRelEqEq_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.RelLtEqImpl <em>Rel Lt Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.RelLtEqImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getRelLtEq()
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
     * The meta object literal for the '<em><b>Rel op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REL_LT_EQ__REL_OP = eINSTANCE.getRelLtEq_Rel_op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_LT_EQ__RIGHT = eINSTANCE.getRelLtEq_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.RelGtEqImpl <em>Rel Gt Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.RelGtEqImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getRelGtEq()
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
     * The meta object literal for the '<em><b>Rel op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REL_GT_EQ__REL_OP = eINSTANCE.getRelGtEq_Rel_op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_GT_EQ__RIGHT = eINSTANCE.getRelGtEq_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.RelEqImpl <em>Rel Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.RelEqImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getRelEq()
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
     * The meta object literal for the '<em><b>Rel op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REL_EQ__REL_OP = eINSTANCE.getRelEq_Rel_op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_EQ__RIGHT = eINSTANCE.getRelEq_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.RelLtImpl <em>Rel Lt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.RelLtImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getRelLt()
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
     * The meta object literal for the '<em><b>Rel op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REL_LT__REL_OP = eINSTANCE.getRelLt_Rel_op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_LT__RIGHT = eINSTANCE.getRelLt_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.RelGtImpl <em>Rel Gt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.RelGtImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getRelGt()
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
     * The meta object literal for the '<em><b>Rel op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REL_GT__REL_OP = eINSTANCE.getRelGt_Rel_op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_GT__RIGHT = eINSTANCE.getRelGt_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.PlusImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getPlus()
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
     * The meta object literal for the '<em><b>Add op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUS__ADD_OP = eINSTANCE.getPlus_Add_op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.MinusImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getMinus()
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
     * The meta object literal for the '<em><b>Add op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MINUS__ADD_OP = eINSTANCE.getMinus_Add_op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.MultiImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getMulti()
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
     * The meta object literal for the '<em><b>Mul op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI__MUL_OP = eINSTANCE.getMulti_Mul_op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__RIGHT = eINSTANCE.getMulti_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.DivImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getDiv()
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
     * The meta object literal for the '<em><b>Mul op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIV__MUL_OP = eINSTANCE.getDiv_Mul_op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__RIGHT = eINSTANCE.getDiv_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.PowImpl <em>Pow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.PowImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getPow()
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
     * The meta object literal for the '<em><b>Pow op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POW__POW_OP = eINSTANCE.getPow_Pow_op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POW__RIGHT = eINSTANCE.getPow_Right();

    /**
     * The meta object literal for the '{@link argument.argument.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.IntLiteralImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getIntLiteral()
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
     * The meta object literal for the '{@link argument.argument.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.impl.BooleanLiteralImpl
     * @see argument.argument.impl.ArgumentPackageImpl#getBooleanLiteral()
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
     * The meta object literal for the '{@link argument.argument.UnaryOp <em>Unary Op</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see argument.argument.UnaryOp
     * @see argument.argument.impl.ArgumentPackageImpl#getUnaryOp()
     * @generated
     */
    EEnum UNARY_OP = eINSTANCE.getUnaryOp();

  }

} //ArgumentPackage
