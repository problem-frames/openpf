/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.open.argument.argument.ArgumentDiagram;
import uk.ac.open.argument.argument.ArgumentFactory;
import uk.ac.open.argument.argument.ArgumentPackage;
import uk.ac.open.argument.argument.ConnectiveType;
import uk.ac.open.argument.argument.Expression;
import uk.ac.open.argument.argument.Link;
import uk.ac.open.argument.argument.LinkType;
import uk.ac.open.argument.argument.Node;
import uk.ac.open.argument.argument.NodeLiteral;
import uk.ac.open.argument.argument.NodeType;
import uk.ac.open.argument.argument.SplitCommas;
import uk.ac.open.argument.argument.SplitConnective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentPackageImpl extends EPackageImpl implements ArgumentPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentDiagramEClass = null;

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
  private EClass linkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass splitCommasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass splitConnectiveEClass = null;

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
  private EEnum connectiveTypeEEnum = null;

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
   * @see uk.ac.open.argument.argument.ArgumentPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ArgumentPackageImpl()
  {
    super(eNS_URI, ArgumentFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ArgumentPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ArgumentPackage init()
  {
    if (isInited) return (ArgumentPackage)EPackage.Registry.INSTANCE.getEPackage(ArgumentPackage.eNS_URI);

    // Obtain or create and register package
    ArgumentPackageImpl theArgumentPackage = (ArgumentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArgumentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArgumentPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theArgumentPackage.createPackageContents();

    // Initialize created meta-data
    theArgumentPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theArgumentPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ArgumentPackage.eNS_URI, theArgumentPackage);
    return theArgumentPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgumentDiagram()
  {
    return argumentDiagramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgumentDiagram_Name()
  {
    return (EAttribute)argumentDiagramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgumentDiagram_Highlight()
  {
    return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgumentDiagram_Nodes()
  {
    return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgumentDiagram_Links()
  {
    return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getNode_Name()
  {
    return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNode_Type()
  {
    return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNode_Description()
  {
    return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
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
  public EReference getLink_Afrom()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_Link()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_ToNode1()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeLiteral()
  {
    return nodeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeLiteral_Value()
  {
    return (EReference)nodeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSplitCommas()
  {
    return splitCommasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSplitCommas_Left()
  {
    return (EReference)splitCommasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSplitCommas_Right()
  {
    return (EReference)splitCommasEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSplitConnective()
  {
    return splitConnectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSplitConnective_Left()
  {
    return (EReference)splitConnectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSplitConnective_Connective()
  {
    return (EAttribute)splitConnectiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSplitConnective_Right()
  {
    return (EReference)splitConnectiveEClass.getEStructuralFeatures().get(2);
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
  public EEnum getConnectiveType()
  {
    return connectiveTypeEEnum;
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
  public ArgumentFactory getArgumentFactory()
  {
    return (ArgumentFactory)getEFactoryInstance();
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
    argumentDiagramEClass = createEClass(ARGUMENT_DIAGRAM);
    createEAttribute(argumentDiagramEClass, ARGUMENT_DIAGRAM__NAME);
    createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__HIGHLIGHT);
    createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__NODES);
    createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__LINKS);

    nodeEClass = createEClass(NODE);
    createEAttribute(nodeEClass, NODE__NAME);
    createEAttribute(nodeEClass, NODE__TYPE);
    createEAttribute(nodeEClass, NODE__DESCRIPTION);

    linkEClass = createEClass(LINK);
    createEReference(linkEClass, LINK__AFROM);
    createEAttribute(linkEClass, LINK__LINK);
    createEReference(linkEClass, LINK__TO_NODE1);

    expressionEClass = createEClass(EXPRESSION);

    nodeLiteralEClass = createEClass(NODE_LITERAL);
    createEReference(nodeLiteralEClass, NODE_LITERAL__VALUE);

    splitCommasEClass = createEClass(SPLIT_COMMAS);
    createEReference(splitCommasEClass, SPLIT_COMMAS__LEFT);
    createEReference(splitCommasEClass, SPLIT_COMMAS__RIGHT);

    splitConnectiveEClass = createEClass(SPLIT_CONNECTIVE);
    createEReference(splitConnectiveEClass, SPLIT_CONNECTIVE__LEFT);
    createEAttribute(splitConnectiveEClass, SPLIT_CONNECTIVE__CONNECTIVE);
    createEReference(splitConnectiveEClass, SPLIT_CONNECTIVE__RIGHT);

    // Create enums
    nodeTypeEEnum = createEEnum(NODE_TYPE);
    connectiveTypeEEnum = createEEnum(CONNECTIVE_TYPE);
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
    nodeLiteralEClass.getESuperTypes().add(this.getExpression());
    splitCommasEClass.getESuperTypes().add(this.getExpression());
    splitConnectiveEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(argumentDiagramEClass, ArgumentDiagram.class, "ArgumentDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArgumentDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArgumentDiagram_Highlight(), this.getNode(), null, "highlight", null, 0, 1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArgumentDiagram_Nodes(), this.getNode(), null, "nodes", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArgumentDiagram_Links(), this.getLink(), null, "links", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNode_Type(), this.getNodeType(), "type", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNode_Description(), ecorePackage.getEString(), "description", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLink_Afrom(), this.getNode(), null, "afrom", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLink_Link(), this.getLinkType(), "link", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_ToNode1(), this.getExpression(), null, "toNode1", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nodeLiteralEClass, NodeLiteral.class, "NodeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeLiteral_Value(), this.getNode(), null, "value", null, 0, 1, NodeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(splitCommasEClass, SplitCommas.class, "SplitCommas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSplitCommas_Left(), this.getExpression(), null, "left", null, 0, 1, SplitCommas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSplitCommas_Right(), this.getExpression(), null, "right", null, 0, 1, SplitCommas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(splitConnectiveEClass, SplitConnective.class, "SplitConnective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSplitConnective_Left(), this.getExpression(), null, "left", null, 0, 1, SplitConnective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSplitConnective_Connective(), this.getConnectiveType(), "connective", null, 0, 1, SplitConnective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSplitConnective_Right(), this.getExpression(), null, "right", null, 0, 1, SplitConnective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
    addEEnumLiteral(nodeTypeEEnum, NodeType.CLAIM);
    addEEnumLiteral(nodeTypeEEnum, NodeType.WARRANT);
    addEEnumLiteral(nodeTypeEEnum, NodeType.GROUND);
    addEEnumLiteral(nodeTypeEEnum, NodeType.REBUTTAL);
    addEEnumLiteral(nodeTypeEEnum, NodeType.MITIGATION);
    addEEnumLiteral(nodeTypeEEnum, NodeType.ARGUMENT);

    initEEnum(connectiveTypeEEnum, ConnectiveType.class, "ConnectiveType");
    addEEnumLiteral(connectiveTypeEEnum, ConnectiveType.AND);
    addEEnumLiteral(connectiveTypeEEnum, ConnectiveType.OR);

    initEEnum(linkTypeEEnum, LinkType.class, "LinkType");
    addEEnumLiteral(linkTypeEEnum, LinkType.ARGUES);
    addEEnumLiteral(linkTypeEEnum, LinkType.REBUTS);
    addEEnumLiteral(linkTypeEEnum, LinkType.MITIGATES);

    // Create resource
    createResource(eNS_URI);
  }

} //ArgumentPackageImpl
