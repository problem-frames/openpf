/**
 */
package uk.ac.open.problem;

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
 * @see uk.ac.open.problem.ProblemFactory
 * @model kind="package"
 * @generated
 */
public interface ProblemPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "problem";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://open.ac.uk/problem";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "problem";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProblemPackage eINSTANCE = uk.ac.open.problem.impl.ProblemPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.open.problem.impl.ProblemDiagramImpl <em>Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.problem.impl.ProblemDiagramImpl
   * @see uk.ac.open.problem.impl.ProblemPackageImpl#getProblemDiagram()
   * @generated
   */
  int PROBLEM_DIAGRAM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBLEM_DIAGRAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Highlight</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBLEM_DIAGRAM__HIGHLIGHT = 1;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBLEM_DIAGRAM__NODES = 2;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBLEM_DIAGRAM__LINKS = 3;

  /**
   * The number of structural features of the '<em>Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBLEM_DIAGRAM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.open.problem.impl.ClockImpl <em>Clock</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.problem.impl.ClockImpl
   * @see uk.ac.open.problem.impl.ProblemPackageImpl#getClock()
   * @generated
   */
  int CLOCK = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Clock</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.problem.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.problem.impl.NodeImpl
   * @see uk.ac.open.problem.impl.ProblemPackageImpl#getNode()
   * @generated
   */
  int NODE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = CLOCK__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__DESCRIPTION = CLOCK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__TYPE = CLOCK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Hidden Phenomena</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__HIDDEN_PHENOMENA = CLOCK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Timing Constraint</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__TIMING_CONSTRAINT = CLOCK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Subproblem</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__SUBPROBLEM = CLOCK_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Problem Node Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__PROBLEM_NODE_REF = CLOCK_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Problem Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__PROBLEM_REF = CLOCK_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Href</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__HREF = CLOCK_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = CLOCK_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link uk.ac.open.problem.impl.PhenomenonImpl <em>Phenomenon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.problem.impl.PhenomenonImpl
   * @see uk.ac.open.problem.impl.ProblemPackageImpl#getPhenomenon()
   * @generated
   */
  int PHENOMENON = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHENOMENON__NAME = CLOCK__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHENOMENON__DESCRIPTION = CLOCK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHENOMENON__TYPE = CLOCK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Controlled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHENOMENON__IS_CONTROLLED = CLOCK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Phenomenon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHENOMENON_FEATURE_COUNT = CLOCK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.open.problem.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.problem.impl.ConstraintImpl
   * @see uk.ac.open.problem.impl.ProblemPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Operand</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__OPERAND = 1;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.problem.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.problem.impl.LinkImpl
   * @see uk.ac.open.problem.impl.ProblemPackageImpl#getLink()
   * @generated
   */
  int LINK = 5;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__FROM = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TYPE = 1;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TO = 2;

  /**
   * The feature id for the '<em><b>Phenomena</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__PHENOMENA = 3;

  /**
   * The feature id for the '<em><b>Timing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TIMING = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__DESCRIPTION = 5;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link uk.ac.open.problem.NodeType <em>Node Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.problem.NodeType
   * @see uk.ac.open.problem.impl.ProblemPackageImpl#getNodeType()
   * @generated
   */
  int NODE_TYPE = 6;

  /**
   * The meta object id for the '{@link uk.ac.open.problem.PhenomenonType <em>Phenomenon Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.problem.PhenomenonType
   * @see uk.ac.open.problem.impl.ProblemPackageImpl#getPhenomenonType()
   * @generated
   */
  int PHENOMENON_TYPE = 7;

  /**
   * The meta object id for the '{@link uk.ac.open.problem.ConstraintType <em>Constraint Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.problem.ConstraintType
   * @see uk.ac.open.problem.impl.ProblemPackageImpl#getConstraintType()
   * @generated
   */
  int CONSTRAINT_TYPE = 8;

  /**
   * The meta object id for the '{@link uk.ac.open.problem.LinkType <em>Link Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.problem.LinkType
   * @see uk.ac.open.problem.impl.ProblemPackageImpl#getLinkType()
   * @generated
   */
  int LINK_TYPE = 9;


  /**
   * Returns the meta object for class '{@link uk.ac.open.problem.ProblemDiagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagram</em>'.
   * @see uk.ac.open.problem.ProblemDiagram
   * @generated
   */
  EClass getProblemDiagram();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.problem.ProblemDiagram#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.problem.ProblemDiagram#getName()
   * @see #getProblemDiagram()
   * @generated
   */
  EAttribute getProblemDiagram_Name();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.problem.ProblemDiagram#getHighlight <em>Highlight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Highlight</em>'.
   * @see uk.ac.open.problem.ProblemDiagram#getHighlight()
   * @see #getProblemDiagram()
   * @generated
   */
  EReference getProblemDiagram_Highlight();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.problem.ProblemDiagram#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see uk.ac.open.problem.ProblemDiagram#getNodes()
   * @see #getProblemDiagram()
   * @generated
   */
  EReference getProblemDiagram_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.problem.ProblemDiagram#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see uk.ac.open.problem.ProblemDiagram#getLinks()
   * @see #getProblemDiagram()
   * @generated
   */
  EReference getProblemDiagram_Links();

  /**
   * Returns the meta object for class '{@link uk.ac.open.problem.Clock <em>Clock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clock</em>'.
   * @see uk.ac.open.problem.Clock
   * @generated
   */
  EClass getClock();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.problem.Clock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.problem.Clock#getName()
   * @see #getClock()
   * @generated
   */
  EAttribute getClock_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.problem.Clock#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see uk.ac.open.problem.Clock#getDescription()
   * @see #getClock()
   * @generated
   */
  EAttribute getClock_Description();

  /**
   * Returns the meta object for class '{@link uk.ac.open.problem.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see uk.ac.open.problem.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.problem.Node#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.open.problem.Node#getType()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Type();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.problem.Node#getHiddenPhenomena <em>Hidden Phenomena</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hidden Phenomena</em>'.
   * @see uk.ac.open.problem.Node#getHiddenPhenomena()
   * @see #getNode()
   * @generated
   */
  EReference getNode_HiddenPhenomena();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.problem.Node#getTimingConstraint <em>Timing Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Timing Constraint</em>'.
   * @see uk.ac.open.problem.Node#getTimingConstraint()
   * @see #getNode()
   * @generated
   */
  EReference getNode_TimingConstraint();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.problem.Node#getSubproblem <em>Subproblem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subproblem</em>'.
   * @see uk.ac.open.problem.Node#getSubproblem()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Subproblem();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.problem.Node#getProblemNodeRef <em>Problem Node Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Problem Node Ref</em>'.
   * @see uk.ac.open.problem.Node#getProblemNodeRef()
   * @see #getNode()
   * @generated
   */
  EReference getNode_ProblemNodeRef();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.problem.Node#getProblemRef <em>Problem Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Problem Ref</em>'.
   * @see uk.ac.open.problem.Node#getProblemRef()
   * @see #getNode()
   * @generated
   */
  EReference getNode_ProblemRef();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.open.problem.Node#getHref <em>Href</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Href</em>'.
   * @see uk.ac.open.problem.Node#getHref()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Href();

  /**
   * Returns the meta object for class '{@link uk.ac.open.problem.Phenomenon <em>Phenomenon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phenomenon</em>'.
   * @see uk.ac.open.problem.Phenomenon
   * @generated
   */
  EClass getPhenomenon();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.problem.Phenomenon#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.open.problem.Phenomenon#getType()
   * @see #getPhenomenon()
   * @generated
   */
  EAttribute getPhenomenon_Type();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.problem.Phenomenon#isIsControlled <em>Is Controlled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Controlled</em>'.
   * @see uk.ac.open.problem.Phenomenon#isIsControlled()
   * @see #getPhenomenon()
   * @generated
   */
  EAttribute getPhenomenon_IsControlled();

  /**
   * Returns the meta object for class '{@link uk.ac.open.problem.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see uk.ac.open.problem.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.problem.Constraint#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.open.problem.Constraint#getType()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Type();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.open.problem.Constraint#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Operand</em>'.
   * @see uk.ac.open.problem.Constraint#getOperand()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Operand();

  /**
   * Returns the meta object for class '{@link uk.ac.open.problem.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see uk.ac.open.problem.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.problem.Link#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see uk.ac.open.problem.Link#getFrom()
   * @see #getLink()
   * @generated
   */
  EReference getLink_From();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.problem.Link#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.open.problem.Link#getType()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Type();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.problem.Link#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see uk.ac.open.problem.Link#getTo()
   * @see #getLink()
   * @generated
   */
  EReference getLink_To();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.problem.Link#getPhenomena <em>Phenomena</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Phenomena</em>'.
   * @see uk.ac.open.problem.Link#getPhenomena()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Phenomena();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.problem.Link#getTiming <em>Timing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Timing</em>'.
   * @see uk.ac.open.problem.Link#getTiming()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Timing();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.problem.Link#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see uk.ac.open.problem.Link#getDescription()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Description();

  /**
   * Returns the meta object for enum '{@link uk.ac.open.problem.NodeType <em>Node Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Node Type</em>'.
   * @see uk.ac.open.problem.NodeType
   * @generated
   */
  EEnum getNodeType();

  /**
   * Returns the meta object for enum '{@link uk.ac.open.problem.PhenomenonType <em>Phenomenon Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Phenomenon Type</em>'.
   * @see uk.ac.open.problem.PhenomenonType
   * @generated
   */
  EEnum getPhenomenonType();

  /**
   * Returns the meta object for enum '{@link uk.ac.open.problem.ConstraintType <em>Constraint Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Constraint Type</em>'.
   * @see uk.ac.open.problem.ConstraintType
   * @generated
   */
  EEnum getConstraintType();

  /**
   * Returns the meta object for enum '{@link uk.ac.open.problem.LinkType <em>Link Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Link Type</em>'.
   * @see uk.ac.open.problem.LinkType
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
  ProblemFactory getProblemFactory();

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
     * The meta object literal for the '{@link uk.ac.open.problem.impl.ProblemDiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.problem.impl.ProblemDiagramImpl
     * @see uk.ac.open.problem.impl.ProblemPackageImpl#getProblemDiagram()
     * @generated
     */
    EClass PROBLEM_DIAGRAM = eINSTANCE.getProblemDiagram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBLEM_DIAGRAM__NAME = eINSTANCE.getProblemDiagram_Name();

    /**
     * The meta object literal for the '<em><b>Highlight</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBLEM_DIAGRAM__HIGHLIGHT = eINSTANCE.getProblemDiagram_Highlight();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBLEM_DIAGRAM__NODES = eINSTANCE.getProblemDiagram_Nodes();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBLEM_DIAGRAM__LINKS = eINSTANCE.getProblemDiagram_Links();

    /**
     * The meta object literal for the '{@link uk.ac.open.problem.impl.ClockImpl <em>Clock</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.problem.impl.ClockImpl
     * @see uk.ac.open.problem.impl.ProblemPackageImpl#getClock()
     * @generated
     */
    EClass CLOCK = eINSTANCE.getClock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOCK__NAME = eINSTANCE.getClock_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOCK__DESCRIPTION = eINSTANCE.getClock_Description();

    /**
     * The meta object literal for the '{@link uk.ac.open.problem.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.problem.impl.NodeImpl
     * @see uk.ac.open.problem.impl.ProblemPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

    /**
     * The meta object literal for the '<em><b>Hidden Phenomena</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__HIDDEN_PHENOMENA = eINSTANCE.getNode_HiddenPhenomena();

    /**
     * The meta object literal for the '<em><b>Timing Constraint</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__TIMING_CONSTRAINT = eINSTANCE.getNode_TimingConstraint();

    /**
     * The meta object literal for the '<em><b>Subproblem</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__SUBPROBLEM = eINSTANCE.getNode_Subproblem();

    /**
     * The meta object literal for the '<em><b>Problem Node Ref</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__PROBLEM_NODE_REF = eINSTANCE.getNode_ProblemNodeRef();

    /**
     * The meta object literal for the '<em><b>Problem Ref</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__PROBLEM_REF = eINSTANCE.getNode_ProblemRef();

    /**
     * The meta object literal for the '<em><b>Href</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__HREF = eINSTANCE.getNode_Href();

    /**
     * The meta object literal for the '{@link uk.ac.open.problem.impl.PhenomenonImpl <em>Phenomenon</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.problem.impl.PhenomenonImpl
     * @see uk.ac.open.problem.impl.ProblemPackageImpl#getPhenomenon()
     * @generated
     */
    EClass PHENOMENON = eINSTANCE.getPhenomenon();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PHENOMENON__TYPE = eINSTANCE.getPhenomenon_Type();

    /**
     * The meta object literal for the '<em><b>Is Controlled</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PHENOMENON__IS_CONTROLLED = eINSTANCE.getPhenomenon_IsControlled();

    /**
     * The meta object literal for the '{@link uk.ac.open.problem.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.problem.impl.ConstraintImpl
     * @see uk.ac.open.problem.impl.ProblemPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__TYPE = eINSTANCE.getConstraint_Type();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__OPERAND = eINSTANCE.getConstraint_Operand();

    /**
     * The meta object literal for the '{@link uk.ac.open.problem.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.problem.impl.LinkImpl
     * @see uk.ac.open.problem.impl.ProblemPackageImpl#getLink()
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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__TYPE = eINSTANCE.getLink_Type();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__TO = eINSTANCE.getLink_To();

    /**
     * The meta object literal for the '<em><b>Phenomena</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__PHENOMENA = eINSTANCE.getLink_Phenomena();

    /**
     * The meta object literal for the '<em><b>Timing</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__TIMING = eINSTANCE.getLink_Timing();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__DESCRIPTION = eINSTANCE.getLink_Description();

    /**
     * The meta object literal for the '{@link uk.ac.open.problem.NodeType <em>Node Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.problem.NodeType
     * @see uk.ac.open.problem.impl.ProblemPackageImpl#getNodeType()
     * @generated
     */
    EEnum NODE_TYPE = eINSTANCE.getNodeType();

    /**
     * The meta object literal for the '{@link uk.ac.open.problem.PhenomenonType <em>Phenomenon Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.problem.PhenomenonType
     * @see uk.ac.open.problem.impl.ProblemPackageImpl#getPhenomenonType()
     * @generated
     */
    EEnum PHENOMENON_TYPE = eINSTANCE.getPhenomenonType();

    /**
     * The meta object literal for the '{@link uk.ac.open.problem.ConstraintType <em>Constraint Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.problem.ConstraintType
     * @see uk.ac.open.problem.impl.ProblemPackageImpl#getConstraintType()
     * @generated
     */
    EEnum CONSTRAINT_TYPE = eINSTANCE.getConstraintType();

    /**
     * The meta object literal for the '{@link uk.ac.open.problem.LinkType <em>Link Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.problem.LinkType
     * @see uk.ac.open.problem.impl.ProblemPackageImpl#getLinkType()
     * @generated
     */
    EEnum LINK_TYPE = eINSTANCE.getLinkType();

  }

} //ProblemPackage
