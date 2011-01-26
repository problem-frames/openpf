/**
 * <copyright>
 * </copyright>
 *

 */
package uk.ac.open.argument.argument.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.open.argument.argument.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentFactoryImpl extends EFactoryImpl implements ArgumentFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ArgumentFactory init()
  {
    try
    {
      ArgumentFactory theArgumentFactory = (ArgumentFactory)EPackage.Registry.INSTANCE.getEFactory("http://sead1.open.ac.uk/argument/Argument"); 
      if (theArgumentFactory != null)
      {
        return theArgumentFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ArgumentFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentFactoryImpl()
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
      case ArgumentPackage.ARGUMENT_DIAGRAM: return createArgumentDiagram();
      case ArgumentPackage.LINK: return createLink();
      case ArgumentPackage.REBUTS: return createRebuts();
      case ArgumentPackage.MITIGATES: return createMitigates();
      case ArgumentPackage.ARGUMENT: return createArgument();
      case ArgumentPackage.EXPRESSION: return createExpression();
      case ArgumentPackage.TERMINAL_EXPRESSION: return createTerminalExpression();
      case ArgumentPackage.ASSIGN_PLUS: return createAssignPlus();
      case ArgumentPackage.ASSIGN_MIN: return createAssignMin();
      case ArgumentPackage.OR: return createOr();
      case ArgumentPackage.AND: return createAnd();
      case ArgumentPackage.REL_NOT_EQ: return createRelNotEq();
      case ArgumentPackage.REL_EQ_EQ: return createRelEqEq();
      case ArgumentPackage.REL_LT_EQ: return createRelLtEq();
      case ArgumentPackage.REL_GT_EQ: return createRelGtEq();
      case ArgumentPackage.REL_EQ: return createRelEq();
      case ArgumentPackage.REL_LT: return createRelLt();
      case ArgumentPackage.REL_GT: return createRelGt();
      case ArgumentPackage.PLUS: return createPlus();
      case ArgumentPackage.MINUS: return createMinus();
      case ArgumentPackage.MULTI: return createMulti();
      case ArgumentPackage.DIV: return createDiv();
      case ArgumentPackage.POW: return createPow();
      case ArgumentPackage.INT_LITERAL: return createIntLiteral();
      case ArgumentPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
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
      case ArgumentPackage.UNARY_OP:
        return createUnaryOpFromString(eDataType, initialValue);
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
      case ArgumentPackage.UNARY_OP:
        return convertUnaryOpToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentDiagram createArgumentDiagram()
  {
    ArgumentDiagramImpl argumentDiagram = new ArgumentDiagramImpl();
    return argumentDiagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link createLink()
  {
    LinkImpl link = new LinkImpl();
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rebuts createRebuts()
  {
    RebutsImpl rebuts = new RebutsImpl();
    return rebuts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mitigates createMitigates()
  {
    MitigatesImpl mitigates = new MitigatesImpl();
    return mitigates;
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
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalExpression createTerminalExpression()
  {
    TerminalExpressionImpl terminalExpression = new TerminalExpressionImpl();
    return terminalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignPlus createAssignPlus()
  {
    AssignPlusImpl assignPlus = new AssignPlusImpl();
    return assignPlus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignMin createAssignMin()
  {
    AssignMinImpl assignMin = new AssignMinImpl();
    return assignMin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelNotEq createRelNotEq()
  {
    RelNotEqImpl relNotEq = new RelNotEqImpl();
    return relNotEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelEqEq createRelEqEq()
  {
    RelEqEqImpl relEqEq = new RelEqEqImpl();
    return relEqEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelLtEq createRelLtEq()
  {
    RelLtEqImpl relLtEq = new RelLtEqImpl();
    return relLtEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelGtEq createRelGtEq()
  {
    RelGtEqImpl relGtEq = new RelGtEqImpl();
    return relGtEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelEq createRelEq()
  {
    RelEqImpl relEq = new RelEqImpl();
    return relEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelLt createRelLt()
  {
    RelLtImpl relLt = new RelLtImpl();
    return relLt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelGt createRelGt()
  {
    RelGtImpl relGt = new RelGtImpl();
    return relGt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pow createPow()
  {
    PowImpl pow = new PowImpl();
    return pow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOp createUnaryOpFromString(EDataType eDataType, String initialValue)
  {
    UnaryOp result = UnaryOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentPackage getArgumentPackage()
  {
    return (ArgumentPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ArgumentPackage getPackage()
  {
    return ArgumentPackage.eINSTANCE;
  }

} //ArgumentFactoryImpl
