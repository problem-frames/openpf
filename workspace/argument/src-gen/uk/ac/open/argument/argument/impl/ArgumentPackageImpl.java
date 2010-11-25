/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.open.argument.argument.Argument;
import uk.ac.open.argument.argument.ArgumentDiagram;
import uk.ac.open.argument.argument.ArgumentFactory;
import uk.ac.open.argument.argument.ArgumentPackage;
import uk.ac.open.argument.argument.Link;
import uk.ac.open.argument.argument.Mitigates;
import uk.ac.open.argument.argument.Rebuts;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentPackageImpl extends EPackageImpl implements ArgumentPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass argumentDiagramEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass argumentEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass linkEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rebutsEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mitigatesEClass = null;

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
	 * @see uk.ac.open.argument.argument.ArgumentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ArgumentPackageImpl()
  {
		super(eNS_URI, ArgumentFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ArgumentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ArgumentPackage init()
  {
		if (isInited) return (ArgumentPackage)EPackage.Registry.INSTANCE.getEPackage(ArgumentPackage.eNS_URI);

		// Obtain or create and register package
		ArgumentPackageImpl theArgumentPackage = (ArgumentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArgumentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArgumentPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theArgumentPackage.createPackageContents();

		// Initialize created meta-data
		theArgumentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArgumentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArgumentPackage.eNS_URI, theArgumentPackage);
		return theArgumentPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getArgumentDiagram()
  {
		return argumentDiagramEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getArgumentDiagram_Name()
  {
		return (EAttribute)argumentDiagramEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getArgumentDiagram_Nodes()
  {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getArgumentDiagram_Links()
  {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getArgument()
  {
		return argumentEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getArgument_Name()
  {
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getArgument_Description()
  {
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getArgument_Round()
  {
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getArgument_Expr()
  {
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getArgument_Origin()
  {
		return (EReference)argumentEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getArgument_Foreground()
  {
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getArgument_Background()
  {
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getArgument_Shape()
  {
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getArgument_Image()
  {
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getArgument_Grounds()
  {
		return (EReference)argumentEClass.getEStructuralFeatures().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getArgument_Warrants()
  {
		return (EReference)argumentEClass.getEStructuralFeatures().get(10);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLink()
  {
		return linkEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLink_From()
  {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLink_To()
  {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRebuts()
  {
		return rebutsEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMitigates()
  {
		return mitigatesEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMitigates_Name()
  {
		return (EAttribute)mitigatesEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMitigates_Rebuttal()
  {
		return (EReference)mitigatesEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ArgumentFactory getArgumentFactory()
  {
		return (ArgumentFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		argumentDiagramEClass = createEClass(ARGUMENT_DIAGRAM);
		createEAttribute(argumentDiagramEClass, ARGUMENT_DIAGRAM__NAME);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__NODES);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__LINKS);

		argumentEClass = createEClass(ARGUMENT);
		createEAttribute(argumentEClass, ARGUMENT__NAME);
		createEAttribute(argumentEClass, ARGUMENT__DESCRIPTION);
		createEAttribute(argumentEClass, ARGUMENT__ROUND);
		createEAttribute(argumentEClass, ARGUMENT__EXPR);
		createEReference(argumentEClass, ARGUMENT__ORIGIN);
		createEAttribute(argumentEClass, ARGUMENT__FOREGROUND);
		createEAttribute(argumentEClass, ARGUMENT__BACKGROUND);
		createEAttribute(argumentEClass, ARGUMENT__SHAPE);
		createEAttribute(argumentEClass, ARGUMENT__IMAGE);
		createEReference(argumentEClass, ARGUMENT__GROUNDS);
		createEReference(argumentEClass, ARGUMENT__WARRANTS);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__FROM);
		createEReference(linkEClass, LINK__TO);

		rebutsEClass = createEClass(REBUTS);

		mitigatesEClass = createEClass(MITIGATES);
		createEAttribute(mitigatesEClass, MITIGATES__NAME);
		createEReference(mitigatesEClass, MITIGATES__REBUTTAL);
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
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rebutsEClass.getESuperTypes().add(this.getLink());
		mitigatesEClass.getESuperTypes().add(this.getLink());

		// Initialize classes and features; add operations and parameters
		initEClass(argumentDiagramEClass, ArgumentDiagram.class, "ArgumentDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgumentDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentDiagram_Nodes(), this.getArgument(), null, "nodes", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentDiagram_Links(), this.getLink(), null, "links", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgument_Name(), ecorePackage.getEString(), "name", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Description(), ecorePackage.getEString(), "description", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Round(), ecorePackage.getEInt(), "round", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Expr(), ecorePackage.getEString(), "expr", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgument_Origin(), this.getArgument(), null, "origin", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Foreground(), ecorePackage.getEString(), "foreground", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Background(), ecorePackage.getEString(), "background", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Shape(), ecorePackage.getEString(), "shape", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Image(), ecorePackage.getEString(), "image", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgument_Grounds(), this.getArgument(), null, "grounds", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgument_Warrants(), this.getArgument(), null, "warrants", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_From(), this.getArgument(), null, "from", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_To(), this.getArgument(), null, "to", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rebutsEClass, Rebuts.class, "Rebuts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mitigatesEClass, Mitigates.class, "Mitigates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMitigates_Name(), ecorePackage.getEString(), "name", null, 0, 1, Mitigates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMitigates_Rebuttal(), this.getArgument(), null, "rebuttal", null, 0, 1, Mitigates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
		// gmf.compartment
		createGmf_4Annotations();
	}

		/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });							
	}

		/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";			
		addAnnotation
		  (argumentDiagramEClass, 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });						
	}

		/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";				
		addAnnotation
		  (argumentEClass, 
		   source, 
		   new String[] {
			 "label", "name, description, expr, round",
			 "label.pattern", "{0}: {1}\\n {2} #{3}",
			 "label.icon", "false"
		   });					
	}

		/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";					
		addAnnotation
		  (getArgument_Origin(), 
		   source, 
		   new String[] {
			 "target", "origin",
			 "style", "dash",
			 "width", "2",
			 "color", "255,255,0",
			 "target.decoration", "arrow"
		   });				
		addAnnotation
		  (rebutsEClass, 
		   source, 
		   new String[] {
			 "source", "from",
			 "target", "to",
			 "style", "dot",
			 "width", "2",
			 "color", "255,0,0",
			 "target.decoration", "arrow"
		   });		
		addAnnotation
		  (mitigatesEClass, 
		   source, 
		   new String[] {
			 "source", "from",
			 "target", "to",
			 "label", "name",
			 "style", "solid",
			 "width", "2",
			 "color", "0,0,255",
			 "target.decoration", "arrow"
		   });
	}

		/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.compartment";						
		addAnnotation
		  (getArgument_Grounds(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getArgument_Warrants(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
	}

} //ArgumentPackageImpl
