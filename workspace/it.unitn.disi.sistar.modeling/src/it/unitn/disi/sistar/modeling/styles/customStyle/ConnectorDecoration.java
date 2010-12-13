/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConnectorDecoration.java,v 1.3 2007/07/24 09:08:24 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.styles.customStyle;

import org.eclipse.gmf.runtime.notation.Style;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Decoration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationSource <em>Decoration Source</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationMiddle <em>Decoration Middle</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationTarget <em>Decoration Target</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationMiddleText <em>Decoration Middle Text</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getConnectionLineStyle <em>Connection Line Style</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getTextSource <em>Text Source</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getTextMiddle <em>Text Middle</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getTextTarget <em>Text Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getConnectorDecoration()
 * @model
 * @generated
 */
public interface ConnectorDecoration extends Style {
	/**
	 * Returns the value of the '<em><b>Decoration Source</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoration Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoration Source</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType
	 * @see #setDecorationSource(EEndDecorationType)
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getConnectorDecoration_DecorationSource()
	 * @model default="NONE"
	 * @generated
	 */
	EEndDecorationType getDecorationSource();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationSource <em>Decoration Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decoration Source</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType
	 * @see #getDecorationSource()
	 * @generated
	 */
	void setDecorationSource(EEndDecorationType value);

	/**
	 * Returns the value of the '<em><b>Decoration Middle</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link it.unitn.disi.sistar.modeling.styles.customStyle.EMidDecorationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoration Middle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoration Middle</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EMidDecorationType
	 * @see #setDecorationMiddle(EMidDecorationType)
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getConnectorDecoration_DecorationMiddle()
	 * @model default="NONE"
	 * @generated
	 */
	EMidDecorationType getDecorationMiddle();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationMiddle <em>Decoration Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decoration Middle</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EMidDecorationType
	 * @see #getDecorationMiddle()
	 * @generated
	 */
	void setDecorationMiddle(EMidDecorationType value);

	/**
	 * Returns the value of the '<em><b>Decoration Target</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoration Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoration Target</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType
	 * @see #setDecorationTarget(EEndDecorationType)
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getConnectorDecoration_DecorationTarget()
	 * @model default="NONE"
	 * @generated
	 */
	EEndDecorationType getDecorationTarget();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationTarget <em>Decoration Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decoration Target</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType
	 * @see #getDecorationTarget()
	 * @generated
	 */
	void setDecorationTarget(EEndDecorationType value);

	/**
	 * Returns the value of the '<em><b>Decoration Middle Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoration Middle Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoration Middle Text</em>' attribute.
	 * @see #setDecorationMiddleText(String)
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getConnectorDecoration_DecorationMiddleText()
	 * @model
	 * @generated
	 */
	String getDecorationMiddleText();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationMiddleText <em>Decoration Middle Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decoration Middle Text</em>' attribute.
	 * @see #getDecorationMiddleText()
	 * @generated
	 */
	void setDecorationMiddleText(String value);

	/**
	 * Returns the value of the '<em><b>Connection Line Style</b></em>' attribute.
	 * The literals are from the enumeration {@link it.unitn.disi.sistar.modeling.styles.customStyle.EConnectionLineStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Line Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Line Style</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EConnectionLineStyle
	 * @see #setConnectionLineStyle(EConnectionLineStyle)
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getConnectorDecoration_ConnectionLineStyle()
	 * @model
	 * @generated
	 */
	EConnectionLineStyle getConnectionLineStyle();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getConnectionLineStyle <em>Connection Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Line Style</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EConnectionLineStyle
	 * @see #getConnectionLineStyle()
	 * @generated
	 */
	void setConnectionLineStyle(EConnectionLineStyle value);

	/**
	 * Returns the value of the '<em><b>Text Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Source</em>' attribute.
	 * @see #setTextSource(String)
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getConnectorDecoration_TextSource()
	 * @model
	 * @generated
	 */
	String getTextSource();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getTextSource <em>Text Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Source</em>' attribute.
	 * @see #getTextSource()
	 * @generated
	 */
	void setTextSource(String value);

	/**
	 * Returns the value of the '<em><b>Text Middle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Middle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Middle</em>' attribute.
	 * @see #setTextMiddle(String)
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getConnectorDecoration_TextMiddle()
	 * @model
	 * @generated
	 */
	String getTextMiddle();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getTextMiddle <em>Text Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Middle</em>' attribute.
	 * @see #getTextMiddle()
	 * @generated
	 */
	void setTextMiddle(String value);

	/**
	 * Returns the value of the '<em><b>Text Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Target</em>' attribute.
	 * @see #setTextTarget(String)
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getConnectorDecoration_TextTarget()
	 * @model
	 * @generated
	 */
	String getTextTarget();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getTextTarget <em>Text Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Target</em>' attribute.
	 * @see #getTextTarget()
	 * @generated
	 */
	void setTextTarget(String value);

} // ConnectorDecoration