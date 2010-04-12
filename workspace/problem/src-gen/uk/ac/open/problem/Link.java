/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.problem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.problem.Link#getFrom <em>From</em>}</li>
 *   <li>{@link uk.ac.open.problem.Link#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.open.problem.Link#getTo <em>To</em>}</li>
 *   <li>{@link uk.ac.open.problem.Link#getPhenomena <em>Phenomena</em>}</li>
 *   <li>{@link uk.ac.open.problem.Link#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.problem.ProblemPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends edu.toronto.cs.openome_model.Link
{
  /**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Node)
	 * @see uk.ac.open.problem.ProblemPackage#getLink_From()
	 * @model
	 * @generated
	 */
  Node getFrom();

  /**
	 * Sets the value of the '{@link uk.ac.open.problem.Link#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
  void setFrom(Node value);

  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.open.problem.LinkType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see uk.ac.open.problem.LinkType
	 * @see #setType(LinkType)
	 * @see uk.ac.open.problem.ProblemPackage#getLink_Type()
	 * @model
	 * @generated
	 */
  LinkType getType();

  /**
	 * Sets the value of the '{@link uk.ac.open.problem.Link#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see uk.ac.open.problem.LinkType
	 * @see #getType()
	 * @generated
	 */
  void setType(LinkType value);

  /**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Node)
	 * @see uk.ac.open.problem.ProblemPackage#getLink_To()
	 * @model
	 * @generated
	 */
  Node getTo();

  /**
	 * Sets the value of the '{@link uk.ac.open.problem.Link#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
  void setTo(Node value);

  /**
	 * Returns the value of the '<em><b>Phenomena</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.open.problem.Phenomenon}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Phenomena</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Phenomena</em>' containment reference list.
	 * @see uk.ac.open.problem.ProblemPackage#getLink_Phenomena()
	 * @model containment="true"
	 * @generated
	 */
  EList<Phenomenon> getPhenomena();

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
	 * @see uk.ac.open.problem.ProblemPackage#getLink_Description()
	 * @model
	 * @generated
	 */
  String getDescription();

  /**
	 * Sets the value of the '{@link uk.ac.open.problem.Link#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(String value);

} // Link
