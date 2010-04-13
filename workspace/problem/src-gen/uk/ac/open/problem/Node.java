/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.problem;


import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.problem.Node#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.problem.Node#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.open.problem.Node#getDescription <em>Description</em>}</li>
 *   <li>{@link uk.ac.open.problem.Node#getSubproblem <em>Subproblem</em>}</li>
 *   <li>{@link uk.ac.open.problem.Node#getProblemRef <em>Problem Ref</em>}</li>
 *   <li>{@link uk.ac.open.problem.Node#getIstar <em>Istar</em>}</li>
 *   <li>{@link uk.ac.open.problem.Node#getIstarRef <em>Istar Ref</em>}</li>
 *   <li>{@link uk.ac.open.problem.Node#getHiddenPhenomena <em>Hidden Phenomena</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.problem.ProblemPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.open.problem.ProblemPackage#getNode_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link uk.ac.open.problem.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.open.problem.NodeType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see uk.ac.open.problem.NodeType
	 * @see #setType(NodeType)
	 * @see uk.ac.open.problem.ProblemPackage#getNode_Type()
	 * @model
	 * @generated
	 */
  NodeType getType();

  /**
	 * Sets the value of the '{@link uk.ac.open.problem.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see uk.ac.open.problem.NodeType
	 * @see #getType()
	 * @generated
	 */
  void setType(NodeType value);

  /**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see uk.ac.open.problem.ProblemPackage#getNode_Description()
	 * @model
	 * @generated
	 */
  String getDescription();

  /**
	 * Sets the value of the '{@link uk.ac.open.problem.Node#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(String value);

  /**
	 * Returns the value of the '<em><b>Subproblem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subproblem</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Subproblem</em>' containment reference.
	 * @see #setSubproblem(ProblemDiagram)
	 * @see uk.ac.open.problem.ProblemPackage#getNode_Subproblem()
	 * @model containment="true"
	 * @generated
	 */
  ProblemDiagram getSubproblem();

  /**
	 * Sets the value of the '{@link uk.ac.open.problem.Node#getSubproblem <em>Subproblem</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subproblem</em>' containment reference.
	 * @see #getSubproblem()
	 * @generated
	 */
  void setSubproblem(ProblemDiagram value);

  /**
	 * Returns the value of the '<em><b>Problem Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Problem Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Ref</em>' reference.
	 * @see #setProblemRef(Node)
	 * @see uk.ac.open.problem.ProblemPackage#getNode_ProblemRef()
	 * @model
	 * @generated
	 */
  Node getProblemRef();

  /**
	 * Sets the value of the '{@link uk.ac.open.problem.Node#getProblemRef <em>Problem Ref</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Ref</em>' reference.
	 * @see #getProblemRef()
	 * @generated
	 */
  void setProblemRef(Node value);

  /**
	 * Returns the value of the '<em><b>Istar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Istar</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Istar</em>' containment reference.
	 * @see #setIstar(Model)
	 * @see uk.ac.open.problem.ProblemPackage#getNode_Istar()
	 * @model containment="true"
	 * @generated
	 */
  Model getIstar();

  /**
	 * Sets the value of the '{@link uk.ac.open.problem.Node#getIstar <em>Istar</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Istar</em>' containment reference.
	 * @see #getIstar()
	 * @generated
	 */
  void setIstar(Model value);

  /**
	 * Returns the value of the '<em><b>Istar Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Istar Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Istar Ref</em>' reference.
	 * @see #setIstarRef(Intention)
	 * @see uk.ac.open.problem.ProblemPackage#getNode_IstarRef()
	 * @model
	 * @generated
	 */
  Intention getIstarRef();

  /**
	 * Sets the value of the '{@link uk.ac.open.problem.Node#getIstarRef <em>Istar Ref</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Istar Ref</em>' reference.
	 * @see #getIstarRef()
	 * @generated
	 */
  void setIstarRef(Intention value);

  /**
	 * Returns the value of the '<em><b>Hidden Phenomena</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.open.problem.Phenomenon}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hidden Phenomena</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden Phenomena</em>' containment reference list.
	 * @see uk.ac.open.problem.ProblemPackage#getNode_HiddenPhenomena()
	 * @model containment="true"
	 * @generated
	 */
  EList<Phenomenon> getHiddenPhenomena();

} // Node
