/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.Link#getAfrom <em>Afrom</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Link#getLink <em>Link</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Link#getToNode1 <em>To Node1</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.argument.argument.ArgumentPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject
{
  /**
   * Returns the value of the '<em><b>Afrom</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Afrom</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Afrom</em>' reference.
   * @see #setAfrom(Node)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getLink_Afrom()
   * @model
   * @generated
   */
  Node getAfrom();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Link#getAfrom <em>Afrom</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Afrom</em>' reference.
   * @see #getAfrom()
   * @generated
   */
  void setAfrom(Node value);

  /**
   * Returns the value of the '<em><b>Link</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.open.argument.argument.LinkType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' attribute.
   * @see uk.ac.open.argument.argument.LinkType
   * @see #setLink(LinkType)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getLink_Link()
   * @model
   * @generated
   */
  LinkType getLink();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Link#getLink <em>Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link</em>' attribute.
   * @see uk.ac.open.argument.argument.LinkType
   * @see #getLink()
   * @generated
   */
  void setLink(LinkType value);

  /**
   * Returns the value of the '<em><b>To Node1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Node1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Node1</em>' containment reference.
   * @see #setToNode1(Expression)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getLink_ToNode1()
   * @model containment="true"
   * @generated
   */
  Expression getToNode1();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Link#getToNode1 <em>To Node1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Node1</em>' containment reference.
   * @see #getToNode1()
   * @generated
   */
  void setToNode1(Expression value);

} // Link
