/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getDescription <em>Description</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getRound <em>Round</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getExpr <em>Expr</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getOrigin <em>Origin</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getForeground <em>Foreground</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getBackground <em>Background</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getShape <em>Shape</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getImage <em>Image</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getGrounds <em>Grounds</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getWarrants <em>Warrants</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument()
 * @model annotation="gmf.node label='name, description, expr, round' label.pattern='{0}: {1}\\n {2} #{3}' label.icon='false'"
 * @generated
 */
public interface Argument extends EObject
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
	 * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link uk.ac.open.argument.argument.Argument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

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
	 * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Description()
	 * @model
	 * @generated
	 */
  String getDescription();

  /**
	 * Sets the value of the '{@link uk.ac.open.argument.argument.Argument#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(String value);

  /**
	 * Returns the value of the '<em><b>Round</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Round</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Round</em>' attribute.
	 * @see #setRound(int)
	 * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Round()
	 * @model
	 * @generated
	 */
  int getRound();

  /**
	 * Sets the value of the '{@link uk.ac.open.argument.argument.Argument#getRound <em>Round</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Round</em>' attribute.
	 * @see #getRound()
	 * @generated
	 */
  void setRound(int value);

  /**
	 * Returns the value of the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' attribute.
	 * @see #setExpr(String)
	 * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Expr()
	 * @model
	 * @generated
	 */
  String getExpr();

  /**
	 * Sets the value of the '{@link uk.ac.open.argument.argument.Argument#getExpr <em>Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' attribute.
	 * @see #getExpr()
	 * @generated
	 */
  void setExpr(String value);

  /**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Origin</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Argument)
	 * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Origin()
	 * @model annotation="gmf.link target='origin' style='dash' width='2' color='160,32,240' target.decoration='arrow'"
	 * @generated
	 */
  Argument getOrigin();

  /**
	 * Sets the value of the '{@link uk.ac.open.argument.argument.Argument#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
  void setOrigin(Argument value);

  /**
	 * Returns the value of the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreground</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreground</em>' attribute.
	 * @see #setForeground(String)
	 * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Foreground()
	 * @model
	 * @generated
	 */
  String getForeground();

  /**
	 * Sets the value of the '{@link uk.ac.open.argument.argument.Argument#getForeground <em>Foreground</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground</em>' attribute.
	 * @see #getForeground()
	 * @generated
	 */
  void setForeground(String value);

  /**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Background</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(String)
	 * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Background()
	 * @model
	 * @generated
	 */
  String getBackground();

  /**
	 * Sets the value of the '{@link uk.ac.open.argument.argument.Argument#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
  void setBackground(String value);

  /**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shape</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see #setShape(String)
	 * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Shape()
	 * @model
	 * @generated
	 */
  String getShape();

  /**
	 * Sets the value of the '{@link uk.ac.open.argument.argument.Argument#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see #getShape()
	 * @generated
	 */
  void setShape(String value);

  /**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Image()
	 * @model
	 * @generated
	 */
  String getImage();

  /**
	 * Sets the value of the '{@link uk.ac.open.argument.argument.Argument#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
  void setImage(String value);

  /**
	 * Returns the value of the '<em><b>Grounds</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.open.argument.argument.Argument}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grounds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Grounds</em>' containment reference list.
	 * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Grounds()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  EList<Argument> getGrounds();

  /**
	 * Returns the value of the '<em><b>Warrants</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.open.argument.argument.Argument}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Warrants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Warrants</em>' containment reference list.
	 * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Warrants()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
  EList<Argument> getWarrants();

} // Argument
