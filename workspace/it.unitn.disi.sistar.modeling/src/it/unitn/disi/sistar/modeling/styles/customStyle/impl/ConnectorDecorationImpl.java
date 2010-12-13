/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConnectorDecorationImpl.java,v 1.1.1.1 2007/06/25 21:37:02 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.styles.customStyle.impl;

import it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage;
import it.unitn.disi.sistar.modeling.styles.customStyle.EConnectionLineStyle;
import it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType;
import it.unitn.disi.sistar.modeling.styles.customStyle.EMidDecorationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Decoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ConnectorDecorationImpl#getDecorationSource <em>Decoration Source</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ConnectorDecorationImpl#getDecorationMiddle <em>Decoration Middle</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ConnectorDecorationImpl#getDecorationTarget <em>Decoration Target</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ConnectorDecorationImpl#getDecorationMiddleText <em>Decoration Middle Text</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ConnectorDecorationImpl#getConnectionLineStyle <em>Connection Line Style</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ConnectorDecorationImpl#getTextSource <em>Text Source</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ConnectorDecorationImpl#getTextMiddle <em>Text Middle</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ConnectorDecorationImpl#getTextTarget <em>Text Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorDecorationImpl extends EObjectImpl implements ConnectorDecoration {
	/**
	 * The default value of the '{@link #getDecorationSource() <em>Decoration Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationSource()
	 * @generated NOT
	 * @ordered
	 */
	protected static final EEndDecorationType DECORATION_SOURCE_EDEFAULT = EEndDecorationType.NONE_LITERAL;

	/**
	 * The cached value of the '{@link #getDecorationSource() <em>Decoration Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationSource()
	 * @generated
	 * @ordered
	 */
	protected EEndDecorationType decorationSource = DECORATION_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecorationMiddle() <em>Decoration Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationMiddle()
	 * @generated
	 * @ordered
	 */
	protected static final EMidDecorationType DECORATION_MIDDLE_EDEFAULT = EMidDecorationType.NONE_LITERAL;

	/**
	 * The cached value of the '{@link #getDecorationMiddle() <em>Decoration Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationMiddle()
	 * @generated
	 * @ordered
	 */
	protected EMidDecorationType decorationMiddle = DECORATION_MIDDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecorationTarget() <em>Decoration Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationTarget()
	 * @generated NOT
	 * @ordered
	 */
	protected static final EEndDecorationType DECORATION_TARGET_EDEFAULT = EEndDecorationType.NONE_LITERAL;

	/**
	 * The cached value of the '{@link #getDecorationTarget() <em>Decoration Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationTarget()
	 * @generated
	 * @ordered
	 */
	protected EEndDecorationType decorationTarget = DECORATION_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecorationMiddleText() <em>Decoration Middle Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationMiddleText()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATION_MIDDLE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecorationMiddleText() <em>Decoration Middle Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationMiddleText()
	 * @generated
	 * @ordered
	 */
	protected String decorationMiddleText = DECORATION_MIDDLE_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionLineStyle() <em>Connection Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionLineStyle()
	 * @generated
	 * @ordered
	 */
	protected static final EConnectionLineStyle CONNECTION_LINE_STYLE_EDEFAULT = EConnectionLineStyle.SOLID_LITERAL;

	/**
	 * The cached value of the '{@link #getConnectionLineStyle() <em>Connection Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionLineStyle()
	 * @generated
	 * @ordered
	 */
	protected EConnectionLineStyle connectionLineStyle = CONNECTION_LINE_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextSource() <em>Text Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextSource()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextSource() <em>Text Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextSource()
	 * @generated
	 * @ordered
	 */
	protected String textSource = TEXT_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextMiddle() <em>Text Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextMiddle()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_MIDDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextMiddle() <em>Text Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextMiddle()
	 * @generated
	 * @ordered
	 */
	protected String textMiddle = TEXT_MIDDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextTarget() <em>Text Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextTarget() <em>Text Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextTarget()
	 * @generated
	 * @ordered
	 */
	protected String textTarget = TEXT_TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorDecorationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CustomStylePackage.Literals.CONNECTOR_DECORATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEndDecorationType getDecorationSource() {
		return decorationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecorationSource(EEndDecorationType newDecorationSource) {
		EEndDecorationType oldDecorationSource = decorationSource;
		decorationSource = newDecorationSource == null ? DECORATION_SOURCE_EDEFAULT : newDecorationSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.CONNECTOR_DECORATION__DECORATION_SOURCE, oldDecorationSource, decorationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMidDecorationType getDecorationMiddle() {
		return decorationMiddle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecorationMiddle(EMidDecorationType newDecorationMiddle) {
		EMidDecorationType oldDecorationMiddle = decorationMiddle;
		decorationMiddle = newDecorationMiddle == null ? DECORATION_MIDDLE_EDEFAULT : newDecorationMiddle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.CONNECTOR_DECORATION__DECORATION_MIDDLE, oldDecorationMiddle, decorationMiddle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEndDecorationType getDecorationTarget() {
		return decorationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecorationTarget(EEndDecorationType newDecorationTarget) {
		EEndDecorationType oldDecorationTarget = decorationTarget;
		decorationTarget = newDecorationTarget == null ? DECORATION_TARGET_EDEFAULT : newDecorationTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.CONNECTOR_DECORATION__DECORATION_TARGET, oldDecorationTarget, decorationTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecorationMiddleText() {
		return decorationMiddleText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecorationMiddleText(String newDecorationMiddleText) {
		String oldDecorationMiddleText = decorationMiddleText;
		decorationMiddleText = newDecorationMiddleText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.CONNECTOR_DECORATION__DECORATION_MIDDLE_TEXT, oldDecorationMiddleText, decorationMiddleText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EConnectionLineStyle getConnectionLineStyle() {
		return connectionLineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionLineStyle(EConnectionLineStyle newConnectionLineStyle) {
		EConnectionLineStyle oldConnectionLineStyle = connectionLineStyle;
		connectionLineStyle = newConnectionLineStyle == null ? CONNECTION_LINE_STYLE_EDEFAULT : newConnectionLineStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.CONNECTOR_DECORATION__CONNECTION_LINE_STYLE, oldConnectionLineStyle, connectionLineStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextSource() {
		return textSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextSource(String newTextSource) {
		String oldTextSource = textSource;
		textSource = newTextSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.CONNECTOR_DECORATION__TEXT_SOURCE, oldTextSource, textSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextMiddle() {
		return textMiddle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextMiddle(String newTextMiddle) {
		String oldTextMiddle = textMiddle;
		textMiddle = newTextMiddle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.CONNECTOR_DECORATION__TEXT_MIDDLE, oldTextMiddle, textMiddle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextTarget() {
		return textTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextTarget(String newTextTarget) {
		String oldTextTarget = textTarget;
		textTarget = newTextTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.CONNECTOR_DECORATION__TEXT_TARGET, oldTextTarget, textTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_SOURCE:
				return getDecorationSource();
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_MIDDLE:
				return getDecorationMiddle();
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_TARGET:
				return getDecorationTarget();
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_MIDDLE_TEXT:
				return getDecorationMiddleText();
			case CustomStylePackage.CONNECTOR_DECORATION__CONNECTION_LINE_STYLE:
				return getConnectionLineStyle();
			case CustomStylePackage.CONNECTOR_DECORATION__TEXT_SOURCE:
				return getTextSource();
			case CustomStylePackage.CONNECTOR_DECORATION__TEXT_MIDDLE:
				return getTextMiddle();
			case CustomStylePackage.CONNECTOR_DECORATION__TEXT_TARGET:
				return getTextTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_SOURCE:
				setDecorationSource((EEndDecorationType)newValue);
				return;
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_MIDDLE:
				setDecorationMiddle((EMidDecorationType)newValue);
				return;
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_TARGET:
				setDecorationTarget((EEndDecorationType)newValue);
				return;
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_MIDDLE_TEXT:
				setDecorationMiddleText((String)newValue);
				return;
			case CustomStylePackage.CONNECTOR_DECORATION__CONNECTION_LINE_STYLE:
				setConnectionLineStyle((EConnectionLineStyle)newValue);
				return;
			case CustomStylePackage.CONNECTOR_DECORATION__TEXT_SOURCE:
				setTextSource((String)newValue);
				return;
			case CustomStylePackage.CONNECTOR_DECORATION__TEXT_MIDDLE:
				setTextMiddle((String)newValue);
				return;
			case CustomStylePackage.CONNECTOR_DECORATION__TEXT_TARGET:
				setTextTarget((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_SOURCE:
				setDecorationSource(DECORATION_SOURCE_EDEFAULT);
				return;
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_MIDDLE:
				setDecorationMiddle(DECORATION_MIDDLE_EDEFAULT);
				return;
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_TARGET:
				setDecorationTarget(DECORATION_TARGET_EDEFAULT);
				return;
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_MIDDLE_TEXT:
				setDecorationMiddleText(DECORATION_MIDDLE_TEXT_EDEFAULT);
				return;
			case CustomStylePackage.CONNECTOR_DECORATION__CONNECTION_LINE_STYLE:
				setConnectionLineStyle(CONNECTION_LINE_STYLE_EDEFAULT);
				return;
			case CustomStylePackage.CONNECTOR_DECORATION__TEXT_SOURCE:
				setTextSource(TEXT_SOURCE_EDEFAULT);
				return;
			case CustomStylePackage.CONNECTOR_DECORATION__TEXT_MIDDLE:
				setTextMiddle(TEXT_MIDDLE_EDEFAULT);
				return;
			case CustomStylePackage.CONNECTOR_DECORATION__TEXT_TARGET:
				setTextTarget(TEXT_TARGET_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_SOURCE:
				return decorationSource != DECORATION_SOURCE_EDEFAULT;
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_MIDDLE:
				return decorationMiddle != DECORATION_MIDDLE_EDEFAULT;
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_TARGET:
				return decorationTarget != DECORATION_TARGET_EDEFAULT;
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_MIDDLE_TEXT:
				return DECORATION_MIDDLE_TEXT_EDEFAULT == null ? decorationMiddleText != null : !DECORATION_MIDDLE_TEXT_EDEFAULT.equals(decorationMiddleText);
			case CustomStylePackage.CONNECTOR_DECORATION__CONNECTION_LINE_STYLE:
				return connectionLineStyle != CONNECTION_LINE_STYLE_EDEFAULT;
			case CustomStylePackage.CONNECTOR_DECORATION__TEXT_SOURCE:
				return TEXT_SOURCE_EDEFAULT == null ? textSource != null : !TEXT_SOURCE_EDEFAULT.equals(textSource);
			case CustomStylePackage.CONNECTOR_DECORATION__TEXT_MIDDLE:
				return TEXT_MIDDLE_EDEFAULT == null ? textMiddle != null : !TEXT_MIDDLE_EDEFAULT.equals(textMiddle);
			case CustomStylePackage.CONNECTOR_DECORATION__TEXT_TARGET:
				return TEXT_TARGET_EDEFAULT == null ? textTarget != null : !TEXT_TARGET_EDEFAULT.equals(textTarget);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (decorationSource: ");
		result.append(decorationSource);
		result.append(", decorationMiddle: ");
		result.append(decorationMiddle);
		result.append(", decorationTarget: ");
		result.append(decorationTarget);
		result.append(", decorationMiddleText: ");
		result.append(decorationMiddleText);
		result.append(", connectionLineStyle: ");
		result.append(connectionLineStyle);
		result.append(", textSource: ");
		result.append(textSource);
		result.append(", textMiddle: ");
		result.append(textMiddle);
		result.append(", textTarget: ");
		result.append(textTarget);
		result.append(')');
		return result.toString();
	}

} //ConnectorDecorationImpl