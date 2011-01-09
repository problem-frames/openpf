/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument;

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
 * @see uk.ac.open.argument.argument.ArgumentFactory
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
  ArgumentPackage eINSTANCE = uk.ac.open.argument.argument.impl.ArgumentPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.ArgumentDiagramImpl <em>Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.ArgumentDiagramImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getArgumentDiagram()
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
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.LinkImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getLink()
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
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.RebutsImpl <em>Rebuts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.RebutsImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRebuts()
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
   * The number of structural features of the '<em>Rebuts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REBUTS_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.MitigatesImpl <em>Mitigates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.MitigatesImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getMitigates()
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
   * The feature id for the '<em><b>Rebuttal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGATES__REBUTTAL = LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mitigates</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGATES_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.ExpressionImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ASSIGN = 0;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__UOP = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = 2;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__N = 3;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.TerminalExpressionImpl <em>Terminal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.TerminalExpressionImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getTerminalExpression()
   * @generated
   */
  int TERMINAL_EXPRESSION = 6;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__UOP = EXPRESSION__UOP;

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
   * The number of structural features of the '<em>Terminal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.ArgumentImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 4;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__ASSIGN = TERMINAL_EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__UOP = TERMINAL_EXPRESSION__UOP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__RIGHT = TERMINAL_EXPRESSION__RIGHT;

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
   * The feature id for the '<em><b>Origin</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__ORIGIN = TERMINAL_EXPRESSION_FEATURE_COUNT + 3;

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
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.AssignPlusImpl <em>Assign Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.AssignPlusImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getAssignPlus()
   * @generated
   */
  int ASSIGN_PLUS = 7;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS__AOP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assign Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.AssignMinImpl <em>Assign Min</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.AssignMinImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getAssignMin()
   * @generated
   */
  int ASSIGN_MIN = 8;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN__AOP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assign Min</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_MIN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.OrImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getOr()
   * @generated
   */
  int OR = 9;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Or op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__OR_OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.AndImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getAnd()
   * @generated
   */
  int AND = 10;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>And op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__AND_OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.RelNotEqImpl <em>Rel Not Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.RelNotEqImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRelNotEq()
   * @generated
   */
  int REL_NOT_EQ = 11;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ__REL_OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rel Not Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_NOT_EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.RelEqEqImpl <em>Rel Eq Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.RelEqEqImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRelEqEq()
   * @generated
   */
  int REL_EQ_EQ = 12;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ__REL_OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rel Eq Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.RelLtEqImpl <em>Rel Lt Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.RelLtEqImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRelLtEq()
   * @generated
   */
  int REL_LT_EQ = 13;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ__REL_OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rel Lt Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.RelGtEqImpl <em>Rel Gt Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.RelGtEqImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRelGtEq()
   * @generated
   */
  int REL_GT_EQ = 14;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ__REL_OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rel Gt Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.RelEqImpl <em>Rel Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.RelEqImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRelEq()
   * @generated
   */
  int REL_EQ = 15;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ__REL_OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rel Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.RelLtImpl <em>Rel Lt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.RelLtImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRelLt()
   * @generated
   */
  int REL_LT = 16;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT__REL_OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rel Lt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.RelGtImpl <em>Rel Gt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.RelGtImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRelGt()
   * @generated
   */
  int REL_GT = 17;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT__REL_OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rel Gt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_GT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.PlusImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 18;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Add op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__ADD_OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.MinusImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 19;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Add op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__ADD_OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.MultiImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getMulti()
   * @generated
   */
  int MULTI = 20;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mul op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__MUL_OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.DivImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getDiv()
   * @generated
   */
  int DIV = 21;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mul op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__MUL_OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.PowImpl <em>Pow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.PowImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getPow()
   * @generated
   */
  int POW = 22;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__ASSIGN = EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__UOP = EXPRESSION__UOP;

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
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pow op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__POW_OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.IntLiteralImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 23;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__ASSIGN = TERMINAL_EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__UOP = TERMINAL_EXPRESSION__UOP;

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
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.BooleanLiteralImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 24;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__ASSIGN = TERMINAL_EXPRESSION__ASSIGN;

  /**
   * The feature id for the '<em><b>Uop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__UOP = TERMINAL_EXPRESSION__UOP;

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
   * The meta object id for the '{@link uk.ac.open.argument.argument.UnaryOp <em>Unary Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.UnaryOp
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getUnaryOp()
   * @generated
   */
  int UNARY_OP = 25;


  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.ArgumentDiagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagram</em>'.
   * @see uk.ac.open.argument.argument.ArgumentDiagram
   * @generated
   */
  EClass getArgumentDiagram();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.ArgumentDiagram#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.argument.argument.ArgumentDiagram#getName()
   * @see #getArgumentDiagram()
   * @generated
   */
  EAttribute getArgumentDiagram_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.argument.argument.ArgumentDiagram#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see uk.ac.open.argument.argument.ArgumentDiagram#getNodes()
   * @see #getArgumentDiagram()
   * @generated
   */
  EReference getArgumentDiagram_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.argument.argument.ArgumentDiagram#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see uk.ac.open.argument.argument.ArgumentDiagram#getLinks()
   * @see #getArgumentDiagram()
   * @generated
   */
  EReference getArgumentDiagram_Links();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see uk.ac.open.argument.argument.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.argument.argument.Link#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see uk.ac.open.argument.argument.Link#getFrom()
   * @see #getLink()
   * @generated
   */
  EReference getLink_From();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.argument.argument.Link#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see uk.ac.open.argument.argument.Link#getTo()
   * @see #getLink()
   * @generated
   */
  EReference getLink_To();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Rebuts <em>Rebuts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rebuts</em>'.
   * @see uk.ac.open.argument.argument.Rebuts
   * @generated
   */
  EClass getRebuts();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Mitigates <em>Mitigates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mitigates</em>'.
   * @see uk.ac.open.argument.argument.Mitigates
   * @generated
   */
  EClass getMitigates();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.argument.argument.Mitigates#getRebuttal <em>Rebuttal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rebuttal</em>'.
   * @see uk.ac.open.argument.argument.Mitigates#getRebuttal()
   * @see #getMitigates()
   * @generated
   */
  EReference getMitigates_Rebuttal();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see uk.ac.open.argument.argument.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Argument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.argument.argument.Argument#getName()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Argument#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see uk.ac.open.argument.argument.Argument#getDescription()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Description();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Argument#getRound <em>Round</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Round</em>'.
   * @see uk.ac.open.argument.argument.Argument#getRound()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Round();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.argument.argument.Argument#getOrigin <em>Origin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Origin</em>'.
   * @see uk.ac.open.argument.argument.Argument#getOrigin()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Origin();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.Argument#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see uk.ac.open.argument.argument.Argument#getExpr()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Expr();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Argument#getForeground <em>Foreground</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Foreground</em>'.
   * @see uk.ac.open.argument.argument.Argument#getForeground()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Foreground();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Argument#getBackground <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Background</em>'.
   * @see uk.ac.open.argument.argument.Argument#getBackground()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Background();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Argument#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shape</em>'.
   * @see uk.ac.open.argument.argument.Argument#getShape()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Shape();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Argument#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image</em>'.
   * @see uk.ac.open.argument.argument.Argument#getImage()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Image();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.argument.argument.Argument#getGrounds <em>Grounds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Grounds</em>'.
   * @see uk.ac.open.argument.argument.Argument#getGrounds()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Grounds();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.argument.argument.Argument#getWarrants <em>Warrants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Warrants</em>'.
   * @see uk.ac.open.argument.argument.Argument#getWarrants()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Warrants();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.argument.argument.Argument#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see uk.ac.open.argument.argument.Argument#getValue()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see uk.ac.open.argument.argument.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.Expression#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assign</em>'.
   * @see uk.ac.open.argument.argument.Expression#getAssign()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Assign();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Expression#getUop <em>Uop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uop</em>'.
   * @see uk.ac.open.argument.argument.Expression#getUop()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Uop();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see uk.ac.open.argument.argument.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Expression#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see uk.ac.open.argument.argument.Expression#getN()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_N();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.TerminalExpression <em>Terminal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminal Expression</em>'.
   * @see uk.ac.open.argument.argument.TerminalExpression
   * @generated
   */
  EClass getTerminalExpression();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.AssignPlus <em>Assign Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign Plus</em>'.
   * @see uk.ac.open.argument.argument.AssignPlus
   * @generated
   */
  EClass getAssignPlus();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.AssignPlus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.AssignPlus#getLeft()
   * @see #getAssignPlus()
   * @generated
   */
  EReference getAssignPlus_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.AssignPlus#getAop <em>Aop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aop</em>'.
   * @see uk.ac.open.argument.argument.AssignPlus#getAop()
   * @see #getAssignPlus()
   * @generated
   */
  EAttribute getAssignPlus_Aop();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.AssignMin <em>Assign Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign Min</em>'.
   * @see uk.ac.open.argument.argument.AssignMin
   * @generated
   */
  EClass getAssignMin();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.AssignMin#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.AssignMin#getLeft()
   * @see #getAssignMin()
   * @generated
   */
  EReference getAssignMin_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.AssignMin#getAop <em>Aop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aop</em>'.
   * @see uk.ac.open.argument.argument.AssignMin#getAop()
   * @see #getAssignMin()
   * @generated
   */
  EAttribute getAssignMin_Aop();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see uk.ac.open.argument.argument.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.Or#getLeft()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Or#getOr_op <em>Or op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Or op</em>'.
   * @see uk.ac.open.argument.argument.Or#getOr_op()
   * @see #getOr()
   * @generated
   */
  EAttribute getOr_Or_op();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see uk.ac.open.argument.argument.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.And#getLeft()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.And#getAnd_op <em>And op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>And op</em>'.
   * @see uk.ac.open.argument.argument.And#getAnd_op()
   * @see #getAnd()
   * @generated
   */
  EAttribute getAnd_And_op();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.RelNotEq <em>Rel Not Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Not Eq</em>'.
   * @see uk.ac.open.argument.argument.RelNotEq
   * @generated
   */
  EClass getRelNotEq();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.RelNotEq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.RelNotEq#getLeft()
   * @see #getRelNotEq()
   * @generated
   */
  EReference getRelNotEq_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.RelNotEq#getRel_op <em>Rel op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel op</em>'.
   * @see uk.ac.open.argument.argument.RelNotEq#getRel_op()
   * @see #getRelNotEq()
   * @generated
   */
  EAttribute getRelNotEq_Rel_op();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.RelEqEq <em>Rel Eq Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Eq Eq</em>'.
   * @see uk.ac.open.argument.argument.RelEqEq
   * @generated
   */
  EClass getRelEqEq();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.RelEqEq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.RelEqEq#getLeft()
   * @see #getRelEqEq()
   * @generated
   */
  EReference getRelEqEq_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.RelEqEq#getRel_op <em>Rel op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel op</em>'.
   * @see uk.ac.open.argument.argument.RelEqEq#getRel_op()
   * @see #getRelEqEq()
   * @generated
   */
  EAttribute getRelEqEq_Rel_op();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.RelLtEq <em>Rel Lt Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Lt Eq</em>'.
   * @see uk.ac.open.argument.argument.RelLtEq
   * @generated
   */
  EClass getRelLtEq();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.RelLtEq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.RelLtEq#getLeft()
   * @see #getRelLtEq()
   * @generated
   */
  EReference getRelLtEq_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.RelLtEq#getRel_op <em>Rel op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel op</em>'.
   * @see uk.ac.open.argument.argument.RelLtEq#getRel_op()
   * @see #getRelLtEq()
   * @generated
   */
  EAttribute getRelLtEq_Rel_op();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.RelGtEq <em>Rel Gt Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Gt Eq</em>'.
   * @see uk.ac.open.argument.argument.RelGtEq
   * @generated
   */
  EClass getRelGtEq();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.RelGtEq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.RelGtEq#getLeft()
   * @see #getRelGtEq()
   * @generated
   */
  EReference getRelGtEq_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.RelGtEq#getRel_op <em>Rel op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel op</em>'.
   * @see uk.ac.open.argument.argument.RelGtEq#getRel_op()
   * @see #getRelGtEq()
   * @generated
   */
  EAttribute getRelGtEq_Rel_op();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.RelEq <em>Rel Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Eq</em>'.
   * @see uk.ac.open.argument.argument.RelEq
   * @generated
   */
  EClass getRelEq();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.RelEq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.RelEq#getLeft()
   * @see #getRelEq()
   * @generated
   */
  EReference getRelEq_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.RelEq#getRel_op <em>Rel op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel op</em>'.
   * @see uk.ac.open.argument.argument.RelEq#getRel_op()
   * @see #getRelEq()
   * @generated
   */
  EAttribute getRelEq_Rel_op();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.RelLt <em>Rel Lt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Lt</em>'.
   * @see uk.ac.open.argument.argument.RelLt
   * @generated
   */
  EClass getRelLt();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.RelLt#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.RelLt#getLeft()
   * @see #getRelLt()
   * @generated
   */
  EReference getRelLt_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.RelLt#getRel_op <em>Rel op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel op</em>'.
   * @see uk.ac.open.argument.argument.RelLt#getRel_op()
   * @see #getRelLt()
   * @generated
   */
  EAttribute getRelLt_Rel_op();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.RelGt <em>Rel Gt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Gt</em>'.
   * @see uk.ac.open.argument.argument.RelGt
   * @generated
   */
  EClass getRelGt();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.RelGt#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.RelGt#getLeft()
   * @see #getRelGt()
   * @generated
   */
  EReference getRelGt_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.RelGt#getRel_op <em>Rel op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel op</em>'.
   * @see uk.ac.open.argument.argument.RelGt#getRel_op()
   * @see #getRelGt()
   * @generated
   */
  EAttribute getRelGt_Rel_op();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see uk.ac.open.argument.argument.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Plus#getAdd_op <em>Add op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Add op</em>'.
   * @see uk.ac.open.argument.argument.Plus#getAdd_op()
   * @see #getPlus()
   * @generated
   */
  EAttribute getPlus_Add_op();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see uk.ac.open.argument.argument.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Minus#getAdd_op <em>Add op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Add op</em>'.
   * @see uk.ac.open.argument.argument.Minus#getAdd_op()
   * @see #getMinus()
   * @generated
   */
  EAttribute getMinus_Add_op();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see uk.ac.open.argument.argument.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.Multi#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.Multi#getLeft()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Multi#getMul_op <em>Mul op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mul op</em>'.
   * @see uk.ac.open.argument.argument.Multi#getMul_op()
   * @see #getMulti()
   * @generated
   */
  EAttribute getMulti_Mul_op();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see uk.ac.open.argument.argument.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Div#getMul_op <em>Mul op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mul op</em>'.
   * @see uk.ac.open.argument.argument.Div#getMul_op()
   * @see #getDiv()
   * @generated
   */
  EAttribute getDiv_Mul_op();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Pow <em>Pow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pow</em>'.
   * @see uk.ac.open.argument.argument.Pow
   * @generated
   */
  EClass getPow();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.Pow#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.Pow#getLeft()
   * @see #getPow()
   * @generated
   */
  EReference getPow_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Pow#getPow_op <em>Pow op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pow op</em>'.
   * @see uk.ac.open.argument.argument.Pow#getPow_op()
   * @see #getPow()
   * @generated
   */
  EAttribute getPow_Pow_op();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see uk.ac.open.argument.argument.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.open.argument.argument.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see uk.ac.open.argument.argument.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.BooleanLiteral#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.open.argument.argument.BooleanLiteral#isValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for enum '{@link uk.ac.open.argument.argument.UnaryOp <em>Unary Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unary Op</em>'.
   * @see uk.ac.open.argument.argument.UnaryOp
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.ArgumentDiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.ArgumentDiagramImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getArgumentDiagram()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.LinkImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getLink()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.RebutsImpl <em>Rebuts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.RebutsImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRebuts()
     * @generated
     */
    EClass REBUTS = eINSTANCE.getRebuts();

    /**
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.MitigatesImpl <em>Mitigates</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.MitigatesImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getMitigates()
     * @generated
     */
    EClass MITIGATES = eINSTANCE.getMitigates();

    /**
     * The meta object literal for the '<em><b>Rebuttal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MITIGATES__REBUTTAL = eINSTANCE.getMitigates_Rebuttal();

    /**
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.ArgumentImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getArgument()
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
     * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__ORIGIN = eINSTANCE.getArgument_Origin();

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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.ExpressionImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getExpression()
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
     * The meta object literal for the '<em><b>Uop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__UOP = eINSTANCE.getExpression_Uop();

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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.TerminalExpressionImpl <em>Terminal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.TerminalExpressionImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getTerminalExpression()
     * @generated
     */
    EClass TERMINAL_EXPRESSION = eINSTANCE.getTerminalExpression();

    /**
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.AssignPlusImpl <em>Assign Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.AssignPlusImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getAssignPlus()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.AssignMinImpl <em>Assign Min</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.AssignMinImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getAssignMin()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.OrImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getOr()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.AndImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getAnd()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.RelNotEqImpl <em>Rel Not Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.RelNotEqImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRelNotEq()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.RelEqEqImpl <em>Rel Eq Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.RelEqEqImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRelEqEq()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.RelLtEqImpl <em>Rel Lt Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.RelLtEqImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRelLtEq()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.RelGtEqImpl <em>Rel Gt Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.RelGtEqImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRelGtEq()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.RelEqImpl <em>Rel Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.RelEqImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRelEq()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.RelLtImpl <em>Rel Lt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.RelLtImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRelLt()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.RelGtImpl <em>Rel Gt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.RelGtImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRelGt()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.PlusImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getPlus()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.MinusImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getMinus()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.MultiImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getMulti()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.DivImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getDiv()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.PowImpl <em>Pow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.PowImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getPow()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.IntLiteralImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getIntLiteral()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.BooleanLiteralImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getBooleanLiteral()
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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.UnaryOp <em>Unary Op</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.UnaryOp
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getUnaryOp()
     * @generated
     */
    EEnum UNARY_OP = eINSTANCE.getUnaryOp();

  }

} //ArgumentPackage
