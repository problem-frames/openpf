/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.open.event.eventcalculus.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventcalculusFactoryImpl extends EFactoryImpl implements EventcalculusFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EventcalculusFactory init()
  {
    try
    {
      EventcalculusFactory theEventcalculusFactory = (EventcalculusFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ac.uk/open/EventCalculus"); 
      if (theEventcalculusFactory != null)
      {
        return theEventcalculusFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EventcalculusFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventcalculusFactoryImpl()
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
      case EventcalculusPackage.MODEL: return createModel();
      case EventcalculusPackage.IMPORT: return createImport();
      case EventcalculusPackage.ANNOTATION: return createAnnotation();
      case EventcalculusPackage.DECLARATION: return createDeclaration();
      case EventcalculusPackage.DEFINES: return createDefines();
      case EventcalculusPackage.DEF_SORT: return createDefSort();
      case EventcalculusPackage.DEF_RANGE: return createDefRange();
      case EventcalculusPackage.DEF_OPTION: return createDefOption();
      case EventcalculusPackage.DEF_COMPLETION: return createDefCompletion();
      case EventcalculusPackage.DEF_NON_INERTIA: return createDefNonInertia();
      case EventcalculusPackage.DEF_XOR: return createDefXor();
      case EventcalculusPackage.DEF_MUTEX: return createDefMutex();
      case EventcalculusPackage.STATEMENT: return createStatement();
      case EventcalculusPackage.LABELED_EXPRESSION: return createLabeledExpression();
      case EventcalculusPackage.SORT_DEFINITION: return createSortDefinition();
      case EventcalculusPackage.DEFINITION: return createDefinition();
      case EventcalculusPackage.EXPRESSION: return createExpression();
      case EventcalculusPackage.QUALIFIER: return createQualifier();
      case EventcalculusPackage.PARAMETERS: return createParameters();
      case EventcalculusPackage.TERMINAL_EXPRESSION: return createTerminalExpression();
      case EventcalculusPackage.ASSIGN_PLUS: return createAssignPlus();
      case EventcalculusPackage.ASSIGN_MIN: return createAssignMin();
      case EventcalculusPackage.OR: return createOr();
      case EventcalculusPackage.AND: return createAnd();
      case EventcalculusPackage.REL_NOT_EQ: return createRelNotEq();
      case EventcalculusPackage.REL_EQ_EQ: return createRelEqEq();
      case EventcalculusPackage.REL_LT_EQ: return createRelLtEq();
      case EventcalculusPackage.REL_GT_EQ: return createRelGtEq();
      case EventcalculusPackage.REL_EQ: return createRelEq();
      case EventcalculusPackage.REL_LT: return createRelLt();
      case EventcalculusPackage.REL_GT: return createRelGt();
      case EventcalculusPackage.PLUS: return createPlus();
      case EventcalculusPackage.MINUS: return createMinus();
      case EventcalculusPackage.MULTI: return createMulti();
      case EventcalculusPackage.DIV: return createDiv();
      case EventcalculusPackage.POW: return createPow();
      case EventcalculusPackage.FUNCTION_REF: return createFunctionRef();
      case EventcalculusPackage.INT_LITERAL: return createIntLiteral();
      case EventcalculusPackage.STRING_LITERAL: return createStringLiteral();
      case EventcalculusPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
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
      case EventcalculusPackage.ANNOTATION_TYPE:
        return createANNOTATION_TYPEFromString(eDataType, initialValue);
      case EventcalculusPackage.LABEL_TYPE:
        return createLabelTypeFromString(eDataType, initialValue);
      case EventcalculusPackage.UNARY_OP:
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
      case EventcalculusPackage.ANNOTATION_TYPE:
        return convertANNOTATION_TYPEToString(eDataType, instanceValue);
      case EventcalculusPackage.LABEL_TYPE:
        return convertLabelTypeToString(eDataType, instanceValue);
      case EventcalculusPackage.UNARY_OP:
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
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Defines createDefines()
  {
    DefinesImpl defines = new DefinesImpl();
    return defines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefSort createDefSort()
  {
    DefSortImpl defSort = new DefSortImpl();
    return defSort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefRange createDefRange()
  {
    DefRangeImpl defRange = new DefRangeImpl();
    return defRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefOption createDefOption()
  {
    DefOptionImpl defOption = new DefOptionImpl();
    return defOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefCompletion createDefCompletion()
  {
    DefCompletionImpl defCompletion = new DefCompletionImpl();
    return defCompletion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefNonInertia createDefNonInertia()
  {
    DefNonInertiaImpl defNonInertia = new DefNonInertiaImpl();
    return defNonInertia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefXor createDefXor()
  {
    DefXorImpl defXor = new DefXorImpl();
    return defXor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefMutex createDefMutex()
  {
    DefMutexImpl defMutex = new DefMutexImpl();
    return defMutex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabeledExpression createLabeledExpression()
  {
    LabeledExpressionImpl labeledExpression = new LabeledExpressionImpl();
    return labeledExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortDefinition createSortDefinition()
  {
    SortDefinitionImpl sortDefinition = new SortDefinitionImpl();
    return sortDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
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
  public Qualifier createQualifier()
  {
    QualifierImpl qualifier = new QualifierImpl();
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameters createParameters()
  {
    ParametersImpl parameters = new ParametersImpl();
    return parameters;
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
  public FunctionRef createFunctionRef()
  {
    FunctionRefImpl functionRef = new FunctionRefImpl();
    return functionRef;
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
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
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
  public ANNOTATION_TYPE createANNOTATION_TYPEFromString(EDataType eDataType, String initialValue)
  {
    ANNOTATION_TYPE result = ANNOTATION_TYPE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertANNOTATION_TYPEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelType createLabelTypeFromString(EDataType eDataType, String initialValue)
  {
    LabelType result = LabelType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLabelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
  public EventcalculusPackage getEventcalculusPackage()
  {
    return (EventcalculusPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EventcalculusPackage getPackage()
  {
    return EventcalculusPackage.eINSTANCE;
  }

} //EventcalculusFactoryImpl
