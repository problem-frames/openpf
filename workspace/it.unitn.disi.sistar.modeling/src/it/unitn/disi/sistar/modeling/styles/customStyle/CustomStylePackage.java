/**
 * <copyright>
 * </copyright>
 *
 * $Id: CustomStylePackage.java,v 1.1.1.1 2007/06/25 21:37:01 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.styles.customStyle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.runtime.notation.NotationPackage;

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
 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStyleFactory
 * @model kind="package"
 * @generated
 */
public interface CustomStylePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "customStyle";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.custom-style.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cust";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomStylePackage eINSTANCE = it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStylePackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ActorStyleImpl <em>Actor Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.ActorStyleImpl
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStylePackageImpl#getActorStyle()
	 * @generated
	 */
	int ACTOR_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Actor Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STYLE__ACTOR_WIDTH = NotationPackage.STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actor Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STYLE__ACTOR_HEIGHT = NotationPackage.STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actor X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STYLE__ACTOR_X = NotationPackage.STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actor Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STYLE__ACTOR_Y = NotationPackage.STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rationale Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STYLE__RATIONALE_SHAPE = NotationPackage.STYLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Actor Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STYLE_FEATURE_COUNT = NotationPackage.STYLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.CoreLocationImpl <em>Core Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CoreLocationImpl
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStylePackageImpl#getCoreLocation()
	 * @generated
	 */
	int CORE_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Core Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_LOCATION__CORE_WIDTH = NotationPackage.STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Core Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_LOCATION__CORE_HEIGHT = NotationPackage.STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Core X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_LOCATION__CORE_X = NotationPackage.STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Core Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_LOCATION__CORE_Y = NotationPackage.STYLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Core Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_LOCATION_FEATURE_COUNT = NotationPackage.STYLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ConnectorDecorationImpl <em>Connector Decoration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.ConnectorDecorationImpl
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStylePackageImpl#getConnectorDecoration()
	 * @generated
	 */
	int CONNECTOR_DECORATION = 2;

	/**
	 * The feature id for the '<em><b>Decoration Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DECORATION__DECORATION_SOURCE = NotationPackage.STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decoration Middle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DECORATION__DECORATION_MIDDLE = NotationPackage.STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decoration Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DECORATION__DECORATION_TARGET = NotationPackage.STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Decoration Middle Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DECORATION__DECORATION_MIDDLE_TEXT = NotationPackage.STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connection Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DECORATION__CONNECTION_LINE_STYLE = NotationPackage.STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Text Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DECORATION__TEXT_SOURCE = NotationPackage.STYLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Text Middle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DECORATION__TEXT_MIDDLE = NotationPackage.STYLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Text Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DECORATION__TEXT_TARGET = NotationPackage.STYLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Connector Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DECORATION_FEATURE_COUNT = NotationPackage.STYLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.EShapeType <em>EShape Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EShapeType
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStylePackageImpl#getEShapeType()
	 * @generated
	 */
	int ESHAPE_TYPE = 3;


	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType <em>EEnd Decoration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStylePackageImpl#getEEndDecorationType()
	 * @generated
	 */
	int EEND_DECORATION_TYPE = 4;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.EMidDecorationType <em>EMid Decoration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EMidDecorationType
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStylePackageImpl#getEMidDecorationType()
	 * @generated
	 */
	int EMID_DECORATION_TYPE = 5;


	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.EConnectionLineStyle <em>EConnection Line Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EConnectionLineStyle
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStylePackageImpl#getEConnectionLineStyle()
	 * @generated
	 */
	int ECONNECTION_LINE_STYLE = 6;


	/**
	 * Returns the meta object for class '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle <em>Actor Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Style</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle
	 * @generated
	 */
	EClass getActorStyle();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorWidth <em>Actor Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor Width</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorWidth()
	 * @see #getActorStyle()
	 * @generated
	 */
	EAttribute getActorStyle_ActorWidth();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorHeight <em>Actor Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor Height</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorHeight()
	 * @see #getActorStyle()
	 * @generated
	 */
	EAttribute getActorStyle_ActorHeight();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorX <em>Actor X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor X</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorX()
	 * @see #getActorStyle()
	 * @generated
	 */
	EAttribute getActorStyle_ActorX();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorY <em>Actor Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor Y</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getActorY()
	 * @see #getActorStyle()
	 * @generated
	 */
	EAttribute getActorStyle_ActorY();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getRationaleShape <em>Rationale Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale Shape</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle#getRationaleShape()
	 * @see #getActorStyle()
	 * @generated
	 */
	EAttribute getActorStyle_RationaleShape();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.sistar.modeling.styles.customStyle.CoreLocation <em>Core Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Location</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CoreLocation
	 * @generated
	 */
	EClass getCoreLocation();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.CoreLocation#getCoreX <em>Core X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core X</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CoreLocation#getCoreX()
	 * @see #getCoreLocation()
	 * @generated
	 */
	EAttribute getCoreLocation_CoreX();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.CoreLocation#getCoreY <em>Core Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Y</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CoreLocation#getCoreY()
	 * @see #getCoreLocation()
	 * @generated
	 */
	EAttribute getCoreLocation_CoreY();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration <em>Connector Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Decoration</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration
	 * @generated
	 */
	EClass getConnectorDecoration();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationSource <em>Decoration Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decoration Source</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationSource()
	 * @see #getConnectorDecoration()
	 * @generated
	 */
	EAttribute getConnectorDecoration_DecorationSource();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationMiddle <em>Decoration Middle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decoration Middle</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationMiddle()
	 * @see #getConnectorDecoration()
	 * @generated
	 */
	EAttribute getConnectorDecoration_DecorationMiddle();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationTarget <em>Decoration Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decoration Target</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationTarget()
	 * @see #getConnectorDecoration()
	 * @generated
	 */
	EAttribute getConnectorDecoration_DecorationTarget();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationMiddleText <em>Decoration Middle Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decoration Middle Text</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getDecorationMiddleText()
	 * @see #getConnectorDecoration()
	 * @generated
	 */
	EAttribute getConnectorDecoration_DecorationMiddleText();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getConnectionLineStyle <em>Connection Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Line Style</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getConnectionLineStyle()
	 * @see #getConnectorDecoration()
	 * @generated
	 */
	EAttribute getConnectorDecoration_ConnectionLineStyle();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getTextSource <em>Text Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Source</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getTextSource()
	 * @see #getConnectorDecoration()
	 * @generated
	 */
	EAttribute getConnectorDecoration_TextSource();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getTextMiddle <em>Text Middle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Middle</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getTextMiddle()
	 * @see #getConnectorDecoration()
	 * @generated
	 */
	EAttribute getConnectorDecoration_TextMiddle();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getTextTarget <em>Text Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Target</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration#getTextTarget()
	 * @see #getConnectorDecoration()
	 * @generated
	 */
	EAttribute getConnectorDecoration_TextTarget();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.CoreLocation#getCoreHeight <em>Core Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Height</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CoreLocation#getCoreHeight()
	 * @see #getCoreLocation()
	 * @generated
	 */
	EAttribute getCoreLocation_CoreHeight();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.styles.customStyle.CoreLocation#getCoreWidth <em>Core Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Width</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CoreLocation#getCoreWidth()
	 * @see #getCoreLocation()
	 * @generated
	 */
	EAttribute getCoreLocation_CoreWidth();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.sistar.modeling.styles.customStyle.EShapeType <em>EShape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EShape Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EShapeType
	 * @generated
	 */
	EEnum getEShapeType();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType <em>EEnd Decoration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEnd Decoration Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType
	 * @generated
	 */
	EEnum getEEndDecorationType();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.sistar.modeling.styles.customStyle.EMidDecorationType <em>EMid Decoration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EMid Decoration Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EMidDecorationType
	 * @generated
	 */
	EEnum getEMidDecorationType();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.sistar.modeling.styles.customStyle.EConnectionLineStyle <em>EConnection Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EConnection Line Style</em>'.
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EConnectionLineStyle
	 * @generated
	 */
	EEnum getEConnectionLineStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CustomStyleFactory getCustomStyleFactory();

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
	interface Literals  {
		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ActorStyleImpl <em>Actor Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.ActorStyleImpl
		 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStylePackageImpl#getActorStyle()
		 * @generated
		 */
		EClass ACTOR_STYLE = eINSTANCE.getActorStyle();

		/**
		 * The meta object literal for the '<em><b>Actor Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_STYLE__ACTOR_WIDTH = eINSTANCE.getActorStyle_ActorWidth();

		/**
		 * The meta object literal for the '<em><b>Actor Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_STYLE__ACTOR_HEIGHT = eINSTANCE.getActorStyle_ActorHeight();

		/**
		 * The meta object literal for the '<em><b>Actor X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_STYLE__ACTOR_X = eINSTANCE.getActorStyle_ActorX();

		/**
		 * The meta object literal for the '<em><b>Actor Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_STYLE__ACTOR_Y = eINSTANCE.getActorStyle_ActorY();

		/**
		 * The meta object literal for the '<em><b>Rationale Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_STYLE__RATIONALE_SHAPE = eINSTANCE.getActorStyle_RationaleShape();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.CoreLocationImpl <em>Core Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CoreLocationImpl
		 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStylePackageImpl#getCoreLocation()
		 * @generated
		 */
		EClass CORE_LOCATION = eINSTANCE.getCoreLocation();

		/**
		 * The meta object literal for the '<em><b>Core X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_LOCATION__CORE_X = eINSTANCE.getCoreLocation_CoreX();

		/**
		 * The meta object literal for the '<em><b>Core Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_LOCATION__CORE_Y = eINSTANCE.getCoreLocation_CoreY();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ConnectorDecorationImpl <em>Connector Decoration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.ConnectorDecorationImpl
		 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStylePackageImpl#getConnectorDecoration()
		 * @generated
		 */
		EClass CONNECTOR_DECORATION = eINSTANCE.getConnectorDecoration();

		/**
		 * The meta object literal for the '<em><b>Decoration Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_DECORATION__DECORATION_SOURCE = eINSTANCE.getConnectorDecoration_DecorationSource();

		/**
		 * The meta object literal for the '<em><b>Decoration Middle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_DECORATION__DECORATION_MIDDLE = eINSTANCE.getConnectorDecoration_DecorationMiddle();

		/**
		 * The meta object literal for the '<em><b>Decoration Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_DECORATION__DECORATION_TARGET = eINSTANCE.getConnectorDecoration_DecorationTarget();

		/**
		 * The meta object literal for the '<em><b>Decoration Middle Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_DECORATION__DECORATION_MIDDLE_TEXT = eINSTANCE.getConnectorDecoration_DecorationMiddleText();

		/**
		 * The meta object literal for the '<em><b>Connection Line Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_DECORATION__CONNECTION_LINE_STYLE = eINSTANCE.getConnectorDecoration_ConnectionLineStyle();

		/**
		 * The meta object literal for the '<em><b>Text Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_DECORATION__TEXT_SOURCE = eINSTANCE.getConnectorDecoration_TextSource();

		/**
		 * The meta object literal for the '<em><b>Text Middle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_DECORATION__TEXT_MIDDLE = eINSTANCE.getConnectorDecoration_TextMiddle();

		/**
		 * The meta object literal for the '<em><b>Text Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_DECORATION__TEXT_TARGET = eINSTANCE.getConnectorDecoration_TextTarget();

		/**
		 * The meta object literal for the '<em><b>Core Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_LOCATION__CORE_HEIGHT = eINSTANCE.getCoreLocation_CoreHeight();

		/**
		 * The meta object literal for the '<em><b>Core Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_LOCATION__CORE_WIDTH = eINSTANCE.getCoreLocation_CoreWidth();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.EShapeType <em>EShape Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EShapeType
		 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStylePackageImpl#getEShapeType()
		 * @generated
		 */
		EEnum ESHAPE_TYPE = eINSTANCE.getEShapeType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType <em>EEnd Decoration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType
		 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStylePackageImpl#getEEndDecorationType()
		 * @generated
		 */
		EEnum EEND_DECORATION_TYPE = eINSTANCE.getEEndDecorationType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.EMidDecorationType <em>EMid Decoration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EMidDecorationType
		 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStylePackageImpl#getEMidDecorationType()
		 * @generated
		 */
		EEnum EMID_DECORATION_TYPE = eINSTANCE.getEMidDecorationType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.styles.customStyle.EConnectionLineStyle <em>EConnection Line Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.styles.customStyle.EConnectionLineStyle
		 * @see it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStylePackageImpl#getEConnectionLineStyle()
		 * @generated
		 */
		EEnum ECONNECTION_LINE_STYLE = eINSTANCE.getEConnectionLineStyle();

	}

} //CustomStylePackage
