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
  String eNS_URI = "http://www.ac.uk/open/argument/Argument";

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
   * The feature id for the '<em><b>Highlight</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DIAGRAM__HIGHLIGHT = 1;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DIAGRAM__NODES = 2;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DIAGRAM__LINKS = 3;

  /**
   * The number of structural features of the '<em>Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DIAGRAM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.NodeImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getNode()
   * @generated
   */
  int NODE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.LinkImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getLink()
   * @generated
   */
  int LINK = 2;

  /**
   * The feature id for the '<em><b>Afrom</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__AFROM = 0;

  /**
   * The feature id for the '<em><b>Link</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__LINK = 1;

  /**
   * The feature id for the '<em><b>To Node1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TO_NODE1 = 2;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.ExpressionImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.NodeLiteralImpl <em>Node Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.NodeLiteralImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getNodeLiteral()
   * @generated
   */
  int NODE_LITERAL = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Node Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.SplitCommasImpl <em>Split Commas</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.SplitCommasImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getSplitCommas()
   * @generated
   */
  int SPLIT_COMMAS = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_COMMAS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_COMMAS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Split Commas</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_COMMAS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.SplitConnectiveImpl <em>Split Connective</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.SplitConnectiveImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getSplitConnective()
   * @generated
   */
  int SPLIT_CONNECTIVE = 6;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_CONNECTIVE__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Connective</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_CONNECTIVE__CONNECTIVE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_CONNECTIVE__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Split Connective</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_CONNECTIVE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.NodeType <em>Node Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.NodeType
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getNodeType()
   * @generated
   */
  int NODE_TYPE = 7;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.ConnectiveType <em>Connective Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.ConnectiveType
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getConnectiveType()
   * @generated
   */
  int CONNECTIVE_TYPE = 8;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.LinkType <em>Link Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.LinkType
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getLinkType()
   * @generated
   */
  int LINK_TYPE = 9;


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
   * Returns the meta object for the reference '{@link uk.ac.open.argument.argument.ArgumentDiagram#getHighlight <em>Highlight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Highlight</em>'.
   * @see uk.ac.open.argument.argument.ArgumentDiagram#getHighlight()
   * @see #getArgumentDiagram()
   * @generated
   */
  EReference getArgumentDiagram_Highlight();

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
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see uk.ac.open.argument.argument.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.argument.argument.Node#getName()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Node#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.open.argument.argument.Node#getType()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Type();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Node#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see uk.ac.open.argument.argument.Node#getDescription()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Description();

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
   * Returns the meta object for the reference '{@link uk.ac.open.argument.argument.Link#getAfrom <em>Afrom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Afrom</em>'.
   * @see uk.ac.open.argument.argument.Link#getAfrom()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Afrom();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Link#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Link</em>'.
   * @see uk.ac.open.argument.argument.Link#getLink()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Link();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.Link#getToNode1 <em>To Node1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Node1</em>'.
   * @see uk.ac.open.argument.argument.Link#getToNode1()
   * @see #getLink()
   * @generated
   */
  EReference getLink_ToNode1();

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
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.NodeLiteral <em>Node Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Literal</em>'.
   * @see uk.ac.open.argument.argument.NodeLiteral
   * @generated
   */
  EClass getNodeLiteral();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.argument.argument.NodeLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see uk.ac.open.argument.argument.NodeLiteral#getValue()
   * @see #getNodeLiteral()
   * @generated
   */
  EReference getNodeLiteral_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.SplitCommas <em>Split Commas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Split Commas</em>'.
   * @see uk.ac.open.argument.argument.SplitCommas
   * @generated
   */
  EClass getSplitCommas();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.SplitCommas#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.SplitCommas#getLeft()
   * @see #getSplitCommas()
   * @generated
   */
  EReference getSplitCommas_Left();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.SplitCommas#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see uk.ac.open.argument.argument.SplitCommas#getRight()
   * @see #getSplitCommas()
   * @generated
   */
  EReference getSplitCommas_Right();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.SplitConnective <em>Split Connective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Split Connective</em>'.
   * @see uk.ac.open.argument.argument.SplitConnective
   * @generated
   */
  EClass getSplitConnective();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.SplitConnective#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.open.argument.argument.SplitConnective#getLeft()
   * @see #getSplitConnective()
   * @generated
   */
  EReference getSplitConnective_Left();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.SplitConnective#getConnective <em>Connective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connective</em>'.
   * @see uk.ac.open.argument.argument.SplitConnective#getConnective()
   * @see #getSplitConnective()
   * @generated
   */
  EAttribute getSplitConnective_Connective();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.argument.argument.SplitConnective#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see uk.ac.open.argument.argument.SplitConnective#getRight()
   * @see #getSplitConnective()
   * @generated
   */
  EReference getSplitConnective_Right();

  /**
   * Returns the meta object for enum '{@link uk.ac.open.argument.argument.NodeType <em>Node Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Node Type</em>'.
   * @see uk.ac.open.argument.argument.NodeType
   * @generated
   */
  EEnum getNodeType();

  /**
   * Returns the meta object for enum '{@link uk.ac.open.argument.argument.ConnectiveType <em>Connective Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Connective Type</em>'.
   * @see uk.ac.open.argument.argument.ConnectiveType
   * @generated
   */
  EEnum getConnectiveType();

  /**
   * Returns the meta object for enum '{@link uk.ac.open.argument.argument.LinkType <em>Link Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Link Type</em>'.
   * @see uk.ac.open.argument.argument.LinkType
   * @generated
   */
  EEnum getLinkType();

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
     * The meta object literal for the '<em><b>Highlight</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT_DIAGRAM__HIGHLIGHT = eINSTANCE.getArgumentDiagram_Highlight();

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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.NodeImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__NAME = eINSTANCE.getNode_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__DESCRIPTION = eINSTANCE.getNode_Description();

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
     * The meta object literal for the '<em><b>Afrom</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__AFROM = eINSTANCE.getLink_Afrom();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__LINK = eINSTANCE.getLink_Link();

    /**
     * The meta object literal for the '<em><b>To Node1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__TO_NODE1 = eINSTANCE.getLink_ToNode1();

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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.NodeLiteralImpl <em>Node Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.NodeLiteralImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getNodeLiteral()
     * @generated
     */
    EClass NODE_LITERAL = eINSTANCE.getNodeLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LITERAL__VALUE = eINSTANCE.getNodeLiteral_Value();

    /**
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.SplitCommasImpl <em>Split Commas</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.SplitCommasImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getSplitCommas()
     * @generated
     */
    EClass SPLIT_COMMAS = eINSTANCE.getSplitCommas();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPLIT_COMMAS__LEFT = eINSTANCE.getSplitCommas_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPLIT_COMMAS__RIGHT = eINSTANCE.getSplitCommas_Right();

    /**
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.SplitConnectiveImpl <em>Split Connective</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.SplitConnectiveImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getSplitConnective()
     * @generated
     */
    EClass SPLIT_CONNECTIVE = eINSTANCE.getSplitConnective();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPLIT_CONNECTIVE__LEFT = eINSTANCE.getSplitConnective_Left();

    /**
     * The meta object literal for the '<em><b>Connective</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPLIT_CONNECTIVE__CONNECTIVE = eINSTANCE.getSplitConnective_Connective();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPLIT_CONNECTIVE__RIGHT = eINSTANCE.getSplitConnective_Right();

    /**
     * The meta object literal for the '{@link uk.ac.open.argument.argument.NodeType <em>Node Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.NodeType
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getNodeType()
     * @generated
     */
    EEnum NODE_TYPE = eINSTANCE.getNodeType();

    /**
     * The meta object literal for the '{@link uk.ac.open.argument.argument.ConnectiveType <em>Connective Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.ConnectiveType
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getConnectiveType()
     * @generated
     */
    EEnum CONNECTIVE_TYPE = eINSTANCE.getConnectiveType();

    /**
     * The meta object literal for the '{@link uk.ac.open.argument.argument.LinkType <em>Link Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.LinkType
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getLinkType()
     * @generated
     */
    EEnum LINK_TYPE = eINSTANCE.getLinkType();

  }

} //ArgumentPackage
