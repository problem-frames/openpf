/**
 * <copyright>
 * </copyright>
 *
 * $Id: CustomStylePackageImpl.java,v 1.1.1.1 2007/06/25 21:37:01 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.styles.customStyle.impl;

import it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle;
import it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration;
import it.unitn.disi.sistar.modeling.styles.customStyle.CoreLocation;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStyleFactory;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage;
import it.unitn.disi.sistar.modeling.styles.customStyle.EConnectionLineStyle;
import it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType;
import it.unitn.disi.sistar.modeling.styles.customStyle.EMidDecorationType;
import it.unitn.disi.sistar.modeling.styles.customStyle.EShapeType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomStylePackageImpl extends EPackageImpl implements CustomStylePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorDecorationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eShapeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eEndDecorationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eMidDecorationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eConnectionLineStyleEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CustomStylePackageImpl() {
		super(eNS_URI, CustomStyleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CustomStylePackage init() {
		if (isInited) return (CustomStylePackage)EPackage.Registry.INSTANCE.getEPackage(CustomStylePackage.eNS_URI);

		// Obtain or create and register package
		CustomStylePackageImpl theCustomStylePackage = (CustomStylePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof CustomStylePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new CustomStylePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		NotationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCustomStylePackage.createPackageContents();

		// Initialize created meta-data
		theCustomStylePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCustomStylePackage.freeze();

		return theCustomStylePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorStyle() {
		return actorStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActorStyle_ActorWidth() {
		return (EAttribute)actorStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActorStyle_ActorHeight() {
		return (EAttribute)actorStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActorStyle_ActorX() {
		return (EAttribute)actorStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActorStyle_ActorY() {
		return (EAttribute)actorStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActorStyle_RationaleShape() {
		return (EAttribute)actorStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoreLocation() {
		return coreLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoreLocation_CoreX() {
		return (EAttribute)coreLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoreLocation_CoreY() {
		return (EAttribute)coreLocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorDecoration() {
		return connectorDecorationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorDecoration_DecorationSource() {
		return (EAttribute)connectorDecorationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorDecoration_DecorationMiddle() {
		return (EAttribute)connectorDecorationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorDecoration_DecorationTarget() {
		return (EAttribute)connectorDecorationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorDecoration_DecorationMiddleText() {
		return (EAttribute)connectorDecorationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorDecoration_ConnectionLineStyle() {
		return (EAttribute)connectorDecorationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorDecoration_TextSource() {
		return (EAttribute)connectorDecorationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorDecoration_TextMiddle() {
		return (EAttribute)connectorDecorationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorDecoration_TextTarget() {
		return (EAttribute)connectorDecorationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoreLocation_CoreHeight() {
		return (EAttribute)coreLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoreLocation_CoreWidth() {
		return (EAttribute)coreLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEShapeType() {
		return eShapeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEEndDecorationType() {
		return eEndDecorationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEMidDecorationType() {
		return eMidDecorationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEConnectionLineStyle() {
		return eConnectionLineStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomStyleFactory getCustomStyleFactory() {
		return (CustomStyleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		actorStyleEClass = createEClass(ACTOR_STYLE);
		createEAttribute(actorStyleEClass, ACTOR_STYLE__ACTOR_WIDTH);
		createEAttribute(actorStyleEClass, ACTOR_STYLE__ACTOR_HEIGHT);
		createEAttribute(actorStyleEClass, ACTOR_STYLE__ACTOR_X);
		createEAttribute(actorStyleEClass, ACTOR_STYLE__ACTOR_Y);
		createEAttribute(actorStyleEClass, ACTOR_STYLE__RATIONALE_SHAPE);

		coreLocationEClass = createEClass(CORE_LOCATION);
		createEAttribute(coreLocationEClass, CORE_LOCATION__CORE_WIDTH);
		createEAttribute(coreLocationEClass, CORE_LOCATION__CORE_HEIGHT);
		createEAttribute(coreLocationEClass, CORE_LOCATION__CORE_X);
		createEAttribute(coreLocationEClass, CORE_LOCATION__CORE_Y);

		connectorDecorationEClass = createEClass(CONNECTOR_DECORATION);
		createEAttribute(connectorDecorationEClass, CONNECTOR_DECORATION__DECORATION_SOURCE);
		createEAttribute(connectorDecorationEClass, CONNECTOR_DECORATION__DECORATION_MIDDLE);
		createEAttribute(connectorDecorationEClass, CONNECTOR_DECORATION__DECORATION_TARGET);
		createEAttribute(connectorDecorationEClass, CONNECTOR_DECORATION__DECORATION_MIDDLE_TEXT);
		createEAttribute(connectorDecorationEClass, CONNECTOR_DECORATION__CONNECTION_LINE_STYLE);
		createEAttribute(connectorDecorationEClass, CONNECTOR_DECORATION__TEXT_SOURCE);
		createEAttribute(connectorDecorationEClass, CONNECTOR_DECORATION__TEXT_MIDDLE);
		createEAttribute(connectorDecorationEClass, CONNECTOR_DECORATION__TEXT_TARGET);

		// Create enums
		eShapeTypeEEnum = createEEnum(ESHAPE_TYPE);
		eEndDecorationTypeEEnum = createEEnum(EEND_DECORATION_TYPE);
		eMidDecorationTypeEEnum = createEEnum(EMID_DECORATION_TYPE);
		eConnectionLineStyleEEnum = createEEnum(ECONNECTION_LINE_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NotationPackage theNotationPackage = (NotationPackage)EPackage.Registry.INSTANCE.getEPackage(NotationPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add supertypes to classes
		actorStyleEClass.getESuperTypes().add(theNotationPackage.getStyle());
		coreLocationEClass.getESuperTypes().add(theNotationPackage.getStyle());
		connectorDecorationEClass.getESuperTypes().add(theNotationPackage.getStyle());

		// Initialize classes and features; add operations and parameters
		initEClass(actorStyleEClass, ActorStyle.class, "ActorStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActorStyle_ActorWidth(), ecorePackage.getEInt(), "actorWidth", null, 0, 1, ActorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActorStyle_ActorHeight(), ecorePackage.getEInt(), "actorHeight", null, 0, 1, ActorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActorStyle_ActorX(), theEcorePackage.getEInt(), "actorX", null, 0, 1, ActorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActorStyle_ActorY(), theEcorePackage.getEInt(), "actorY", null, 0, 1, ActorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActorStyle_RationaleShape(), this.getEShapeType(), "rationaleShape", null, 0, 1, ActorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreLocationEClass, CoreLocation.class, "CoreLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoreLocation_CoreWidth(), ecorePackage.getEInt(), "coreWidth", null, 0, 1, CoreLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoreLocation_CoreHeight(), ecorePackage.getEInt(), "coreHeight", null, 0, 1, CoreLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoreLocation_CoreX(), theEcorePackage.getEInt(), "coreX", null, 0, 1, CoreLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoreLocation_CoreY(), theEcorePackage.getEInt(), "coreY", null, 0, 1, CoreLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorDecorationEClass, ConnectorDecoration.class, "ConnectorDecoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectorDecoration_DecorationSource(), this.getEEndDecorationType(), "decorationSource", "NONE", 0, 1, ConnectorDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorDecoration_DecorationMiddle(), this.getEMidDecorationType(), "decorationMiddle", "NONE", 0, 1, ConnectorDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorDecoration_DecorationTarget(), this.getEEndDecorationType(), "decorationTarget", "NONE", 0, 1, ConnectorDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorDecoration_DecorationMiddleText(), theEcorePackage.getEString(), "decorationMiddleText", null, 0, 1, ConnectorDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorDecoration_ConnectionLineStyle(), this.getEConnectionLineStyle(), "connectionLineStyle", null, 0, 1, ConnectorDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorDecoration_TextSource(), theEcorePackage.getEString(), "textSource", null, 0, 1, ConnectorDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorDecoration_TextMiddle(), ecorePackage.getEString(), "textMiddle", null, 0, 1, ConnectorDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorDecoration_TextTarget(), theEcorePackage.getEString(), "textTarget", null, 0, 1, ConnectorDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eShapeTypeEEnum, EShapeType.class, "EShapeType");
		addEEnumLiteral(eShapeTypeEEnum, EShapeType.OVAL_LITERAL);
		addEEnumLiteral(eShapeTypeEEnum, EShapeType.RECTANGLE_LITERAL);

		initEEnum(eEndDecorationTypeEEnum, EEndDecorationType.class, "EEndDecorationType");
		addEEnumLiteral(eEndDecorationTypeEEnum, EEndDecorationType.NONE_LITERAL);
		addEEnumLiteral(eEndDecorationTypeEEnum, EEndDecorationType.SOLID_ARROW_LITERAL);
		addEEnumLiteral(eEndDecorationTypeEEnum, EEndDecorationType.LINE_ARROW_LITERAL);
		addEEnumLiteral(eEndDecorationTypeEEnum, EEndDecorationType.BOX_LITERAL);
		addEEnumLiteral(eEndDecorationTypeEEnum, EEndDecorationType.SOLID_ARROW_FILL_LITERAL);
		addEEnumLiteral(eEndDecorationTypeEEnum, EEndDecorationType.BOX_FILL_LITERAL);
		addEEnumLiteral(eEndDecorationTypeEEnum, EEndDecorationType.DIAMOND_LITERAL);
		addEEnumLiteral(eEndDecorationTypeEEnum, EEndDecorationType.DIAMOND_FILL_LITERAL);

		initEEnum(eMidDecorationTypeEEnum, EMidDecorationType.class, "EMidDecorationType");
		addEEnumLiteral(eMidDecorationTypeEEnum, EMidDecorationType.NONE_LITERAL);
		addEEnumLiteral(eMidDecorationTypeEEnum, EMidDecorationType.ARROW_LITERAL);
		addEEnumLiteral(eMidDecorationTypeEEnum, EMidDecorationType.BOX_LITERAL);

		initEEnum(eConnectionLineStyleEEnum, EConnectionLineStyle.class, "EConnectionLineStyle");
		addEEnumLiteral(eConnectionLineStyleEEnum, EConnectionLineStyle.SOLID_LITERAL);
		addEEnumLiteral(eConnectionLineStyleEEnum, EConnectionLineStyle.DASHED_LITERAL);
		addEEnumLiteral(eConnectionLineStyleEEnum, EConnectionLineStyle.DOTTED_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //CustomStylePackageImpl
