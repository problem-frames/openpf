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
      case EventcalculusPackage.KNOWLEDGE: return createKnowledge();
      case EventcalculusPackage.RULE: return createRule();
      case EventcalculusPackage.VAR_DECL: return createVarDecl();
      case EventcalculusPackage.INT_TERM: return createIntTerm();
      case EventcalculusPackage.INT_EXPR: return createIntExpr();
      case EventcalculusPackage.BINARY_INT_EXPR: return createBinaryIntExpr();
      case EventcalculusPackage.TEMPORAL_PREDICATE: return createTemporalPredicate();
      case EventcalculusPackage.BOOL_EXPR: return createBoolExpr();
      case EventcalculusPackage.UNARY_BOOL_EXPR: return createUnaryBoolExpr();
      case EventcalculusPackage.BINARY_BOOL_EXPR: return createBinaryBoolExpr();
      case EventcalculusPackage.ENTITY: return createEntity();
      case EventcalculusPackage.SORT: return createSort();
      case EventcalculusPackage.IMPORT: return createImport();
      case EventcalculusPackage.VAR: return createVar();
      case EventcalculusPackage.FLUENT: return createFluent();
      case EventcalculusPackage.EVENT: return createEvent();
      case EventcalculusPackage.TERM: return createTerm();
      case EventcalculusPackage.HOLDS_AT: return createHoldsAt();
      case EventcalculusPackage.HAPPENS: return createHappens();
      case EventcalculusPackage.INITIATES: return createInitiates();
      case EventcalculusPackage.TERMINATES: return createTerminates();
      case EventcalculusPackage.PATH: return createPath();
      case EventcalculusPackage.FILE: return createFile();
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
      case EventcalculusPackage.BINARY_INT_OP:
        return createBinaryIntOpFromString(eDataType, initialValue);
      case EventcalculusPackage.UNARY_BOOL_OP:
        return createUnaryBoolOpFromString(eDataType, initialValue);
      case EventcalculusPackage.BINARY_BOOL_OP:
        return createBinaryBoolOpFromString(eDataType, initialValue);
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
      case EventcalculusPackage.BINARY_INT_OP:
        return convertBinaryIntOpToString(eDataType, instanceValue);
      case EventcalculusPackage.UNARY_BOOL_OP:
        return convertUnaryBoolOpToString(eDataType, instanceValue);
      case EventcalculusPackage.BINARY_BOOL_OP:
        return convertBinaryBoolOpToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Knowledge createKnowledge()
  {
    KnowledgeImpl knowledge = new KnowledgeImpl();
    return knowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl createVarDecl()
  {
    VarDeclImpl varDecl = new VarDeclImpl();
    return varDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntTerm createIntTerm()
  {
    IntTermImpl intTerm = new IntTermImpl();
    return intTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntExpr createIntExpr()
  {
    IntExprImpl intExpr = new IntExprImpl();
    return intExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryIntExpr createBinaryIntExpr()
  {
    BinaryIntExprImpl binaryIntExpr = new BinaryIntExprImpl();
    return binaryIntExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemporalPredicate createTemporalPredicate()
  {
    TemporalPredicateImpl temporalPredicate = new TemporalPredicateImpl();
    return temporalPredicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolExpr createBoolExpr()
  {
    BoolExprImpl boolExpr = new BoolExprImpl();
    return boolExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryBoolExpr createUnaryBoolExpr()
  {
    UnaryBoolExprImpl unaryBoolExpr = new UnaryBoolExprImpl();
    return unaryBoolExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryBoolExpr createBinaryBoolExpr()
  {
    BinaryBoolExprImpl binaryBoolExpr = new BinaryBoolExprImpl();
    return binaryBoolExpr;
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
  public Sort createSort()
  {
    SortImpl sort = new SortImpl();
    return sort;
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
  public Var createVar()
  {
    VarImpl var = new VarImpl();
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fluent createFluent()
  {
    FluentImpl fluent = new FluentImpl();
    return fluent;
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
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HoldsAt createHoldsAt()
  {
    HoldsAtImpl holdsAt = new HoldsAtImpl();
    return holdsAt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Happens createHappens()
  {
    HappensImpl happens = new HappensImpl();
    return happens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Initiates createInitiates()
  {
    InitiatesImpl initiates = new InitiatesImpl();
    return initiates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Terminates createTerminates()
  {
    TerminatesImpl terminates = new TerminatesImpl();
    return terminates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Path createPath()
  {
    PathImpl path = new PathImpl();
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryIntOp createBinaryIntOpFromString(EDataType eDataType, String initialValue)
  {
    BinaryIntOp result = BinaryIntOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryIntOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryBoolOp createUnaryBoolOpFromString(EDataType eDataType, String initialValue)
  {
    UnaryBoolOp result = UnaryBoolOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryBoolOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryBoolOp createBinaryBoolOpFromString(EDataType eDataType, String initialValue)
  {
    BinaryBoolOp result = BinaryBoolOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryBoolOpToString(EDataType eDataType, Object instanceValue)
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
