/**
 * <copyright>
 * </copyright>
 *
 * $Id: ActorStyle.java,v 1.1.1.1 2007/06/08 11:23:04 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.styles.customStyle;

import org.eclipse.gmf.runtime.notation.Style;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorWidth <em>Actor Width</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorHeight <em>Actor Height</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorX <em>Actor X</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorY <em>Actor Y</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getRationaleShape <em>Rationale Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getActorStyle()
 * @model
 * @generated
 */
public interface ActorStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Actor Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Width</em>' attribute.
	 * @see #setActorWidth(int)
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getActorStyle_ActorWidth()
	 * @model
	 * @generated
	 */
	int getActorWidth();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorWidth <em>Actor Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Width</em>' attribute.
	 * @see #getActorWidth()
	 * @generated
	 */
	void setActorWidth(int value);

	/**
	 * Returns the value of the '<em><b>Actor Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Height</em>' attribute.
	 * @see #setActorHeight(int)
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getActorStyle_ActorHeight()
	 * @model
	 * @generated
	 */
	int getActorHeight();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorHeight <em>Actor Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Height</em>' attribute.
	 * @see #getActorHeight()
	 * @generated
	 */
	void setActorHeight(int value);

	/**
	 * Returns the value of the '<em><b>Actor X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor X</em>' attribute.
	 * @see #setActorX(int)
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getActorStyle_ActorX()
	 * @model
	 * @generated
	 */
	int getActorX();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorX <em>Actor X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor X</em>' attribute.
	 * @see #getActorX()
	 * @generated
	 */
	void setActorX(int value);

	/**
	 * Returns the value of the '<em><b>Actor Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Y</em>' attribute.
	 * @see #setActorY(int)
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getActorStyle_ActorY()
	 * @model
	 * @generated
	 */
	int getActorY();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorY <em>Actor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Y</em>' attribute.
	 * @see #getActorY()
	 * @generated
	 */
	void setActorY(int value);

	/**
	 * Returns the value of the '<em><b>Rationale Shape</b></em>' attribute.
	 * The literals are from the enumeration {@link it.unitn.disi.sistar.modeling.styles.customStyle.EShapeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale Shape</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EShapeType
	 * @see #setRationaleShape(EShapeType)
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getActorStyle_RationaleShape()
	 * @model
	 * @generated
	 */
	EShapeType getRationaleShape();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getRationaleShape <em>Rationale Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale Shape</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EShapeType
	 * @see #getRationaleShape()
	 * @generated
	 */
	void setRationaleShape(EShapeType value);

} // ActorStyle