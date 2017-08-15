/**
 */
package uk.ac.open.problem.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.open.problem.Clock;
import uk.ac.open.problem.Constraint;
import uk.ac.open.problem.ConstraintType;
import uk.ac.open.problem.Link;
import uk.ac.open.problem.LinkType;
import uk.ac.open.problem.Node;
import uk.ac.open.problem.NodeType;
import uk.ac.open.problem.Phenomenon;
import uk.ac.open.problem.PhenomenonType;
import uk.ac.open.problem.ProblemDiagram;
import uk.ac.open.problem.ProblemFactory;
import uk.ac.open.problem.ProblemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProblemPackageImpl extends EPackageImpl implements ProblemPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass problemDiagramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass phenomenonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum nodeTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum phenomenonTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum constraintTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum linkTypeEEnum = null;

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
   * @see uk.ac.open.problem.ProblemPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ProblemPackageImpl()
  {
    super(eNS_URI, ProblemFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ProblemPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ProblemPackage init()
  {
    if (isInited) return (ProblemPackage)EPackage.Registry.INSTANCE.getEPackage(ProblemPackage.eNS_URI);

    // Obtain or create and register package
    ProblemPackageImpl theProblemPackage = (ProblemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProblemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProblemPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theProblemPackage.createPackageContents();

    // Initialize created meta-data
    theProblemPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theProblemPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ProblemPackage.eNS_URI, theProblemPackage);
    return theProblemPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProblemDiagram()
  {
    return problemDiagramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProblemDiagram_Name()
  {
    return (EAttribute)problemDiagramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProblemDiagram_Highlight()
  {
    return (EReference)problemDiagramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProblemDiagram_Nodes()
  {
    return (EReference)problemDiagramEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProblemDiagram_Links()
  {
    return (EReference)problemDiagramEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClock()
  {
    return clockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClock_Name()
  {
    return (EAttribute)clockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClock_Description()
  {
    return (EAttribute)clockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNode()
  {
    return nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNode_Type()
  {
    return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_HiddenPhenomena()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_TimingConstraint()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Subproblem()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_ProblemNodeRef()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_ProblemRef()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNode_Href()
  {
    return (EAttribute)nodeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPhenomenon()
  {
    return phenomenonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPhenomenon_Type()
  {
    return (EAttribute)phenomenonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPhenomenon_IsControlled()
  {
    return (EAttribute)phenomenonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraint_Type()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraint_Operand()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLink()
  {
    return linkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_From()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_Type()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_To()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Phenomena()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Timing()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_Description()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNodeType()
  {
    return nodeTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPhenomenonType()
  {
    return phenomenonTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConstraintType()
  {
    return constraintTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLinkType()
  {
    return linkTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProblemFactory getProblemFactory()
  {
    return (ProblemFactory)getEFactoryInstance();
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
    problemDiagramEClass = createEClass(PROBLEM_DIAGRAM);
    createEAttribute(problemDiagramEClass, PROBLEM_DIAGRAM__NAME);
    createEReference(problemDiagramEClass, PROBLEM_DIAGRAM__HIGHLIGHT);
    createEReference(problemDiagramEClass, PROBLEM_DIAGRAM__NODES);
    createEReference(problemDiagramEClass, PROBLEM_DIAGRAM__LINKS);

    clockEClass = createEClass(CLOCK);
    createEAttribute(clockEClass, CLOCK__NAME);
    createEAttribute(clockEClass, CLOCK__DESCRIPTION);

    nodeEClass = createEClass(NODE);
    createEAttribute(nodeEClass, NODE__TYPE);
    createEReference(nodeEClass, NODE__HIDDEN_PHENOMENA);
    createEReference(nodeEClass, NODE__TIMING_CONSTRAINT);
    createEReference(nodeEClass, NODE__SUBPROBLEM);
    createEReference(nodeEClass, NODE__PROBLEM_NODE_REF);
    createEReference(nodeEClass, NODE__PROBLEM_REF);
    createEAttribute(nodeEClass, NODE__HREF);

    phenomenonEClass = createEClass(PHENOMENON);
    createEAttribute(phenomenonEClass, PHENOMENON__TYPE);
    createEAttribute(phenomenonEClass, PHENOMENON__IS_CONTROLLED);

    constraintEClass = createEClass(CONSTRAINT);
    createEAttribute(constraintEClass, CONSTRAINT__TYPE);
    createEReference(constraintEClass, CONSTRAINT__OPERAND);

    linkEClass = createEClass(LINK);
    createEReference(linkEClass, LINK__FROM);
    createEAttribute(linkEClass, LINK__TYPE);
    createEReference(linkEClass, LINK__TO);
    createEReference(linkEClass, LINK__PHENOMENA);
    createEReference(linkEClass, LINK__TIMING);
    createEAttribute(linkEClass, LINK__DESCRIPTION);

    // Create enums
    nodeTypeEEnum = createEEnum(NODE_TYPE);
    phenomenonTypeEEnum = createEEnum(PHENOMENON_TYPE);
    constraintTypeEEnum = createEEnum(CONSTRAINT_TYPE);
    linkTypeEEnum = createEEnum(LINK_TYPE);
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
    nodeEClass.getESuperTypes().add(this.getClock());
    phenomenonEClass.getESuperTypes().add(this.getClock());

    // Initialize classes and features; add operations and parameters
    initEClass(problemDiagramEClass, ProblemDiagram.class, "ProblemDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProblemDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProblemDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProblemDiagram_Highlight(), this.getNode(), null, "highlight", null, 0, 1, ProblemDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProblemDiagram_Nodes(), this.getNode(), null, "nodes", null, 0, -1, ProblemDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProblemDiagram_Links(), this.getLink(), null, "links", null, 0, -1, ProblemDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clockEClass, Clock.class, "Clock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClock_Name(), ecorePackage.getEString(), "name", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClock_Description(), ecorePackage.getEString(), "description", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNode_Type(), this.getNodeType(), "type", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_HiddenPhenomena(), this.getPhenomenon(), null, "hiddenPhenomena", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_TimingConstraint(), this.getConstraint(), null, "timingConstraint", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Subproblem(), this.getProblemDiagram(), null, "subproblem", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_ProblemNodeRef(), this.getNode(), null, "problemNodeRef", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_ProblemRef(), this.getProblemDiagram(), null, "problemRef", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNode_Href(), ecorePackage.getEString(), "href", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(phenomenonEClass, Phenomenon.class, "Phenomenon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPhenomenon_Type(), this.getPhenomenonType(), "type", null, 0, 1, Phenomenon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPhenomenon_IsControlled(), ecorePackage.getEBoolean(), "isControlled", null, 0, 1, Phenomenon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstraint_Type(), this.getConstraintType(), "type", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraint_Operand(), this.getClock(), null, "operand", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLink_From(), this.getNode(), null, "from", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLink_Type(), this.getLinkType(), "type", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_To(), this.getNode(), null, "to", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Phenomena(), this.getPhenomenon(), null, "phenomena", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Timing(), this.getConstraint(), null, "timing", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLink_Description(), ecorePackage.getEString(), "description", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
    addEEnumLiteral(nodeTypeEEnum, NodeType.REQUIREMENT);
    addEEnumLiteral(nodeTypeEEnum, NodeType.MACHINE);
    addEEnumLiteral(nodeTypeEEnum, NodeType.BIDDABLE);
    addEEnumLiteral(nodeTypeEEnum, NodeType.LEXICAL);
    addEEnumLiteral(nodeTypeEEnum, NodeType.CAUSAL);
    addEEnumLiteral(nodeTypeEEnum, NodeType.DESIGNED);
    addEEnumLiteral(nodeTypeEEnum, NodeType.PHYSICAL);
    addEEnumLiteral(nodeTypeEEnum, NodeType.CONCERN);

    initEEnum(phenomenonTypeEEnum, PhenomenonType.class, "PhenomenonType");
    addEEnumLiteral(phenomenonTypeEEnum, PhenomenonType.UNSPECIFIED);
    addEEnumLiteral(phenomenonTypeEEnum, PhenomenonType.EVENT);
    addEEnumLiteral(phenomenonTypeEEnum, PhenomenonType.STATE);

    initEEnum(constraintTypeEEnum, ConstraintType.class, "ConstraintType");
    addEEnumLiteral(constraintTypeEEnum, ConstraintType.STRICT_PRE);
    addEEnumLiteral(constraintTypeEEnum, ConstraintType.CAUSE);
    addEEnumLiteral(constraintTypeEEnum, ConstraintType.ALTERNATE);

    initEEnum(linkTypeEEnum, LinkType.class, "LinkType");
    addEEnumLiteral(linkTypeEEnum, LinkType.INTERFACE);
    addEEnumLiteral(linkTypeEEnum, LinkType.REFERENCE);
    addEEnumLiteral(linkTypeEEnum, LinkType.CONSTRAINT);
    addEEnumLiteral(linkTypeEEnum, LinkType.CONCERN);
    addEEnumLiteral(linkTypeEEnum, LinkType.INV_CONSTRAINT);

    // Create resource
    createResource(eNS_URI);
  }

} //ProblemPackageImpl
