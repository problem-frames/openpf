/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.open.event.eventcalculus.BinaryBoolExpr;
import uk.ac.open.event.eventcalculus.BinaryBoolOp;
import uk.ac.open.event.eventcalculus.BinaryIntExpr;
import uk.ac.open.event.eventcalculus.BinaryIntOp;
import uk.ac.open.event.eventcalculus.BoolExpr;
import uk.ac.open.event.eventcalculus.Entity;
import uk.ac.open.event.eventcalculus.Event;
import uk.ac.open.event.eventcalculus.EventcalculusFactory;
import uk.ac.open.event.eventcalculus.EventcalculusPackage;
import uk.ac.open.event.eventcalculus.File;
import uk.ac.open.event.eventcalculus.Fluent;
import uk.ac.open.event.eventcalculus.Happens;
import uk.ac.open.event.eventcalculus.HoldsAt;
import uk.ac.open.event.eventcalculus.Import;
import uk.ac.open.event.eventcalculus.Initiates;
import uk.ac.open.event.eventcalculus.IntExpr;
import uk.ac.open.event.eventcalculus.IntTerm;
import uk.ac.open.event.eventcalculus.Knowledge;
import uk.ac.open.event.eventcalculus.Path;
import uk.ac.open.event.eventcalculus.Rule;
import uk.ac.open.event.eventcalculus.Sort;
import uk.ac.open.event.eventcalculus.TemporalPredicate;
import uk.ac.open.event.eventcalculus.Term;
import uk.ac.open.event.eventcalculus.Terminates;
import uk.ac.open.event.eventcalculus.UnaryBoolExpr;
import uk.ac.open.event.eventcalculus.UnaryBoolOp;
import uk.ac.open.event.eventcalculus.Var;
import uk.ac.open.event.eventcalculus.VarDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventcalculusPackageImpl extends EPackageImpl implements EventcalculusPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass knowledgeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryIntExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass temporalPredicateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryBoolExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryBoolExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fluentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass holdsAtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass happensEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initiatesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass terminatesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum binaryIntOpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum unaryBoolOpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum binaryBoolOpEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EventcalculusPackageImpl()
  {
    super(eNS_URI, EventcalculusFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EventcalculusPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EventcalculusPackage init()
  {
    if (isInited) return (EventcalculusPackage)EPackage.Registry.INSTANCE.getEPackage(EventcalculusPackage.eNS_URI);

    // Obtain or create and register package
    EventcalculusPackageImpl theEventcalculusPackage = (EventcalculusPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EventcalculusPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EventcalculusPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEventcalculusPackage.createPackageContents();

    // Initialize created meta-data
    theEventcalculusPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEventcalculusPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EventcalculusPackage.eNS_URI, theEventcalculusPackage);
    return theEventcalculusPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKnowledge()
  {
    return knowledgeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKnowledge_Imports()
  {
    return (EReference)knowledgeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKnowledge_Entities()
  {
    return (EReference)knowledgeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKnowledge_Rules()
  {
    return (EReference)knowledgeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKnowledge_Vars()
  {
    return (EReference)knowledgeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Decl()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Expr()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarDecl()
  {
    return varDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarDecl_Vars()
  {
    return (EReference)varDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntTerm()
  {
    return intTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntTerm_Const()
  {
    return (EAttribute)intTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntTerm_Var()
  {
    return (EReference)intTermEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntExpr()
  {
    return intExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryIntExpr()
  {
    return binaryIntExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryIntExpr_Opr()
  {
    return (EReference)binaryIntExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryIntExpr_Binaryop()
  {
    return (EAttribute)binaryIntExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemporalPredicate()
  {
    return temporalPredicateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTemporalPredicate_Args()
  {
    return (EAttribute)temporalPredicateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemporalPredicate_Time()
  {
    return (EReference)temporalPredicateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolExpr()
  {
    return boolExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryBoolExpr()
  {
    return unaryBoolExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryBoolExpr_Unaryop_lhs()
  {
    return (EAttribute)unaryBoolExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryBoolExpr_Opr()
  {
    return (EReference)unaryBoolExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryBoolExpr_Ops()
  {
    return (EReference)unaryBoolExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryBoolExpr()
  {
    return binaryBoolExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryBoolExpr_Opr()
  {
    return (EReference)binaryBoolExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryBoolExpr_Binaryop()
  {
    return (EAttribute)binaryBoolExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSort()
  {
    return sortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSort_Name()
  {
    return (EAttribute)sortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImport_Path()
  {
    return (EReference)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVar()
  {
    return varEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVar_Name()
  {
    return (EAttribute)varEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVar_Min()
  {
    return (EAttribute)varEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVar_Max()
  {
    return (EAttribute)varEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFluent()
  {
    return fluentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFluent_Term()
  {
    return (EReference)fluentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Term()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerm()
  {
    return termEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTerm_Name()
  {
    return (EAttribute)termEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTerm_Args()
  {
    return (EAttribute)termEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHoldsAt()
  {
    return holdsAtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHoldsAt_Fluent()
  {
    return (EReference)holdsAtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHappens()
  {
    return happensEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHappens_Event()
  {
    return (EReference)happensEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitiates()
  {
    return initiatesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitiates_Event()
  {
    return (EReference)initiatesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitiates_Fluent()
  {
    return (EReference)initiatesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInitiates_Args2()
  {
    return (EAttribute)initiatesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerminates()
  {
    return terminatesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminates_Event()
  {
    return (EReference)terminatesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminates_Fluent()
  {
    return (EReference)terminatesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTerminates_Args2()
  {
    return (EAttribute)terminatesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPath()
  {
    return pathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPath_Files()
  {
    return (EReference)pathEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFile()
  {
    return fileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFile_Names()
  {
    return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBinaryIntOp()
  {
    return binaryIntOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUnaryBoolOp()
  {
    return unaryBoolOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBinaryBoolOp()
  {
    return binaryBoolOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventcalculusFactory getEventcalculusFactory()
  {
    return (EventcalculusFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    knowledgeEClass = createEClass(KNOWLEDGE);
    createEReference(knowledgeEClass, KNOWLEDGE__IMPORTS);
    createEReference(knowledgeEClass, KNOWLEDGE__ENTITIES);
    createEReference(knowledgeEClass, KNOWLEDGE__RULES);
    createEReference(knowledgeEClass, KNOWLEDGE__VARS);

    ruleEClass = createEClass(RULE);
    createEReference(ruleEClass, RULE__DECL);
    createEReference(ruleEClass, RULE__EXPR);

    varDeclEClass = createEClass(VAR_DECL);
    createEReference(varDeclEClass, VAR_DECL__VARS);

    intTermEClass = createEClass(INT_TERM);
    createEAttribute(intTermEClass, INT_TERM__CONST);
    createEReference(intTermEClass, INT_TERM__VAR);

    intExprEClass = createEClass(INT_EXPR);

    binaryIntExprEClass = createEClass(BINARY_INT_EXPR);
    createEReference(binaryIntExprEClass, BINARY_INT_EXPR__OPR);
    createEAttribute(binaryIntExprEClass, BINARY_INT_EXPR__BINARYOP);

    temporalPredicateEClass = createEClass(TEMPORAL_PREDICATE);
    createEAttribute(temporalPredicateEClass, TEMPORAL_PREDICATE__ARGS);
    createEReference(temporalPredicateEClass, TEMPORAL_PREDICATE__TIME);

    boolExprEClass = createEClass(BOOL_EXPR);

    unaryBoolExprEClass = createEClass(UNARY_BOOL_EXPR);
    createEAttribute(unaryBoolExprEClass, UNARY_BOOL_EXPR__UNARYOP_LHS);
    createEReference(unaryBoolExprEClass, UNARY_BOOL_EXPR__OPR);
    createEReference(unaryBoolExprEClass, UNARY_BOOL_EXPR__OPS);

    binaryBoolExprEClass = createEClass(BINARY_BOOL_EXPR);
    createEReference(binaryBoolExprEClass, BINARY_BOOL_EXPR__OPR);
    createEAttribute(binaryBoolExprEClass, BINARY_BOOL_EXPR__BINARYOP);

    entityEClass = createEClass(ENTITY);

    sortEClass = createEClass(SORT);
    createEAttribute(sortEClass, SORT__NAME);

    importEClass = createEClass(IMPORT);
    createEReference(importEClass, IMPORT__PATH);

    varEClass = createEClass(VAR);
    createEAttribute(varEClass, VAR__NAME);
    createEAttribute(varEClass, VAR__MIN);
    createEAttribute(varEClass, VAR__MAX);

    fluentEClass = createEClass(FLUENT);
    createEReference(fluentEClass, FLUENT__TERM);

    eventEClass = createEClass(EVENT);
    createEReference(eventEClass, EVENT__TERM);

    termEClass = createEClass(TERM);
    createEAttribute(termEClass, TERM__NAME);
    createEAttribute(termEClass, TERM__ARGS);

    holdsAtEClass = createEClass(HOLDS_AT);
    createEReference(holdsAtEClass, HOLDS_AT__FLUENT);

    happensEClass = createEClass(HAPPENS);
    createEReference(happensEClass, HAPPENS__EVENT);

    initiatesEClass = createEClass(INITIATES);
    createEReference(initiatesEClass, INITIATES__EVENT);
    createEReference(initiatesEClass, INITIATES__FLUENT);
    createEAttribute(initiatesEClass, INITIATES__ARGS2);

    terminatesEClass = createEClass(TERMINATES);
    createEReference(terminatesEClass, TERMINATES__EVENT);
    createEReference(terminatesEClass, TERMINATES__FLUENT);
    createEAttribute(terminatesEClass, TERMINATES__ARGS2);

    pathEClass = createEClass(PATH);
    createEReference(pathEClass, PATH__FILES);

    fileEClass = createEClass(FILE);
    createEAttribute(fileEClass, FILE__NAMES);

    // Create enums
    binaryIntOpEEnum = createEEnum(BINARY_INT_OP);
    unaryBoolOpEEnum = createEEnum(UNARY_BOOL_OP);
    binaryBoolOpEEnum = createEEnum(BINARY_BOOL_OP);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    intTermEClass.getESuperTypes().add(this.getIntExpr());
    binaryIntExprEClass.getESuperTypes().add(this.getIntExpr());
    temporalPredicateEClass.getESuperTypes().add(this.getBoolExpr());
    unaryBoolExprEClass.getESuperTypes().add(this.getBoolExpr());
    binaryBoolExprEClass.getESuperTypes().add(this.getBoolExpr());
    sortEClass.getESuperTypes().add(this.getEntity());
    fluentEClass.getESuperTypes().add(this.getEntity());
    eventEClass.getESuperTypes().add(this.getEntity());
    holdsAtEClass.getESuperTypes().add(this.getTemporalPredicate());
    happensEClass.getESuperTypes().add(this.getTemporalPredicate());
    initiatesEClass.getESuperTypes().add(this.getTemporalPredicate());
    terminatesEClass.getESuperTypes().add(this.getTemporalPredicate());

    // Initialize classes and features; add operations and parameters
    initEClass(knowledgeEClass, Knowledge.class, "Knowledge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKnowledge_Imports(), this.getImport(), null, "imports", null, 0, -1, Knowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKnowledge_Entities(), this.getEntity(), null, "entities", null, 0, -1, Knowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKnowledge_Rules(), this.getRule(), null, "rules", null, 0, -1, Knowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKnowledge_Vars(), this.getVar(), null, "vars", null, 0, -1, Knowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRule_Decl(), this.getVarDecl(), null, "decl", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Expr(), this.getBoolExpr(), null, "expr", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varDeclEClass, VarDecl.class, "VarDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVarDecl_Vars(), this.getVar(), null, "vars", null, 0, -1, VarDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intTermEClass, IntTerm.class, "IntTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntTerm_Const(), ecorePackage.getEInt(), "const", null, 0, 1, IntTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntTerm_Var(), this.getVar(), null, "var", null, 0, 1, IntTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intExprEClass, IntExpr.class, "IntExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(binaryIntExprEClass, BinaryIntExpr.class, "BinaryIntExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryIntExpr_Opr(), this.getIntTerm(), null, "opr", null, 0, -1, BinaryIntExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryIntExpr_Binaryop(), this.getBinaryIntOp(), "binaryop", null, 0, 1, BinaryIntExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(temporalPredicateEClass, TemporalPredicate.class, "TemporalPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTemporalPredicate_Args(), ecorePackage.getEString(), "args", null, 0, -1, TemporalPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemporalPredicate_Time(), this.getIntExpr(), null, "time", null, 0, 1, TemporalPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolExprEClass, BoolExpr.class, "BoolExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unaryBoolExprEClass, UnaryBoolExpr.class, "UnaryBoolExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryBoolExpr_Unaryop_lhs(), this.getUnaryBoolOp(), "unaryop_lhs", null, 0, 1, UnaryBoolExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryBoolExpr_Opr(), this.getBoolExpr(), null, "opr", null, 0, -1, UnaryBoolExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryBoolExpr_Ops(), this.getBoolExpr(), null, "ops", null, 0, -1, UnaryBoolExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryBoolExprEClass, BinaryBoolExpr.class, "BinaryBoolExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryBoolExpr_Opr(), this.getBoolExpr(), null, "opr", null, 0, -1, BinaryBoolExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryBoolExpr_Binaryop(), this.getBinaryBoolOp(), "binaryop", null, 0, 1, BinaryBoolExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sortEClass, Sort.class, "Sort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Sort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImport_Path(), this.getPath(), null, "path", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varEClass, Var.class, "Var", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVar_Name(), ecorePackage.getEString(), "name", null, 0, 1, Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVar_Min(), ecorePackage.getEInt(), "min", null, 0, 1, Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVar_Max(), ecorePackage.getEInt(), "max", null, 0, 1, Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fluentEClass, Fluent.class, "Fluent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFluent_Term(), this.getTerm(), null, "term", null, 0, 1, Fluent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvent_Term(), this.getTerm(), null, "term", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTerm_Name(), ecorePackage.getEString(), "name", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTerm_Args(), ecorePackage.getEString(), "args", null, 0, -1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(holdsAtEClass, HoldsAt.class, "HoldsAt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHoldsAt_Fluent(), this.getTerm(), null, "fluent", null, 0, 1, HoldsAt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(happensEClass, Happens.class, "Happens", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHappens_Event(), this.getTerm(), null, "event", null, 0, 1, Happens.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initiatesEClass, Initiates.class, "Initiates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInitiates_Event(), this.getTerm(), null, "event", null, 0, 1, Initiates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInitiates_Fluent(), this.getTerm(), null, "fluent", null, 0, 1, Initiates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInitiates_Args2(), ecorePackage.getEString(), "args2", null, 0, -1, Initiates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(terminatesEClass, Terminates.class, "Terminates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTerminates_Event(), this.getTerm(), null, "event", null, 0, 1, Terminates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTerminates_Fluent(), this.getTerm(), null, "fluent", null, 0, 1, Terminates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTerminates_Args2(), ecorePackage.getEString(), "args2", null, 0, -1, Terminates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPath_Files(), this.getFile(), null, "files", null, 0, -1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFile_Names(), ecorePackage.getEString(), "names", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(binaryIntOpEEnum, BinaryIntOp.class, "BinaryIntOp");
    addEEnumLiteral(binaryIntOpEEnum, BinaryIntOp.PLUS);
    addEEnumLiteral(binaryIntOpEEnum, BinaryIntOp.MINUS);

    initEEnum(unaryBoolOpEEnum, UnaryBoolOp.class, "UnaryBoolOp");
    addEEnumLiteral(unaryBoolOpEEnum, UnaryBoolOp.NEGATION);

    initEEnum(binaryBoolOpEEnum, BinaryBoolOp.class, "BinaryBoolOp");
    addEEnumLiteral(binaryBoolOpEEnum, BinaryBoolOp.IMPLICATION);
    addEEnumLiteral(binaryBoolOpEEnum, BinaryBoolOp.EQUIVALENCE);
    addEEnumLiteral(binaryBoolOpEEnum, BinaryBoolOp.AND);
    addEEnumLiteral(binaryBoolOpEEnum, BinaryBoolOp.OR);

    // Create resource
    createResource(eNS_URI);
  }

} //EventcalculusPackageImpl
