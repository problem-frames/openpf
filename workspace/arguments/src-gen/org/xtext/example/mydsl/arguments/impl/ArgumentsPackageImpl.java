/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.arguments.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl.arguments.Argument;
import org.xtext.example.mydsl.arguments.ArgumentsFactory;
import org.xtext.example.mydsl.arguments.ArgumentsPackage;
import org.xtext.example.mydsl.arguments.Rebuttal;
import org.xtext.example.mydsl.arguments.gStatement;
import org.xtext.example.mydsl.arguments.rStatement;
import org.xtext.example.mydsl.arguments.wStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentsPackageImpl extends EPackageImpl implements ArgumentsPackage
{
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
  private EClass rebuttalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rStatementEClass = null;

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
   * @see org.xtext.example.mydsl.arguments.ArgumentsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ArgumentsPackageImpl()
  {
    super(eNS_URI, ArgumentsFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ArgumentsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ArgumentsPackage init()
  {
    if (isInited) return (ArgumentsPackage)EPackage.Registry.INSTANCE.getEPackage(ArgumentsPackage.eNS_URI);

    // Obtain or create and register package
    ArgumentsPackageImpl theArgumentsPackage = (ArgumentsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArgumentsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArgumentsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theArgumentsPackage.createPackageContents();

    // Initialize created meta-data
    theArgumentsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theArgumentsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ArgumentsPackage.eNS_URI, theArgumentsPackage);
    return theArgumentsPackage;
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
  public EAttribute getArgument_Cname()
  {
    return (EAttribute)argumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgument_Claimstr()
  {
    return (EAttribute)argumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgument_Gname()
  {
    return (EAttribute)argumentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgument_Groundstatements()
  {
    return (EReference)argumentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgument_Wname()
  {
    return (EAttribute)argumentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgument_Warrantstatements()
  {
    return (EReference)argumentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRebuttal()
  {
    return rebuttalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRebuttal_Aname()
  {
    return (EReference)rebuttalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRebuttal_Rname()
  {
    return (EAttribute)rebuttalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRebuttal_Rebuttalstatements()
  {
    return (EReference)rebuttalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgStatement()
  {
    return gStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getgStatement_Name()
  {
    return (EAttribute)gStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getgStatement_Groundstr()
  {
    return (EAttribute)gStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getwStatement()
  {
    return wStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getwStatement_Name()
  {
    return (EAttribute)wStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getwStatement_Groundstr()
  {
    return (EAttribute)wStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrStatement()
  {
    return rStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrStatement_Name()
  {
    return (EAttribute)rStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrStatement_Groundstr()
  {
    return (EAttribute)rStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentsFactory getArgumentsFactory()
  {
    return (ArgumentsFactory)getEFactoryInstance();
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
    argumentEClass = createEClass(ARGUMENT);
    createEAttribute(argumentEClass, ARGUMENT__CNAME);
    createEAttribute(argumentEClass, ARGUMENT__CLAIMSTR);
    createEAttribute(argumentEClass, ARGUMENT__GNAME);
    createEReference(argumentEClass, ARGUMENT__GROUNDSTATEMENTS);
    createEAttribute(argumentEClass, ARGUMENT__WNAME);
    createEReference(argumentEClass, ARGUMENT__WARRANTSTATEMENTS);

    rebuttalEClass = createEClass(REBUTTAL);
    createEReference(rebuttalEClass, REBUTTAL__ANAME);
    createEAttribute(rebuttalEClass, REBUTTAL__RNAME);
    createEReference(rebuttalEClass, REBUTTAL__REBUTTALSTATEMENTS);

    gStatementEClass = createEClass(GSTATEMENT);
    createEAttribute(gStatementEClass, GSTATEMENT__NAME);
    createEAttribute(gStatementEClass, GSTATEMENT__GROUNDSTR);

    wStatementEClass = createEClass(WSTATEMENT);
    createEAttribute(wStatementEClass, WSTATEMENT__NAME);
    createEAttribute(wStatementEClass, WSTATEMENT__GROUNDSTR);

    rStatementEClass = createEClass(RSTATEMENT);
    createEAttribute(rStatementEClass, RSTATEMENT__NAME);
    createEAttribute(rStatementEClass, RSTATEMENT__GROUNDSTR);
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

    // Initialize classes and features; add operations and parameters
    initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArgument_Cname(), ecorePackage.getEString(), "cname", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArgument_Claimstr(), ecorePackage.getEString(), "claimstr", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArgument_Gname(), ecorePackage.getEString(), "gname", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArgument_Groundstatements(), this.getgStatement(), null, "groundstatements", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArgument_Wname(), ecorePackage.getEString(), "wname", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArgument_Warrantstatements(), this.getwStatement(), null, "warrantstatements", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rebuttalEClass, Rebuttal.class, "Rebuttal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRebuttal_Aname(), this.getArgument(), null, "aname", null, 0, 1, Rebuttal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRebuttal_Rname(), ecorePackage.getEString(), "rname", null, 0, 1, Rebuttal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRebuttal_Rebuttalstatements(), this.getrStatement(), null, "rebuttalstatements", null, 0, -1, Rebuttal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gStatementEClass, gStatement.class, "gStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getgStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, gStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getgStatement_Groundstr(), ecorePackage.getEString(), "groundstr", null, 0, 1, gStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wStatementEClass, wStatement.class, "wStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getwStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, wStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getwStatement_Groundstr(), ecorePackage.getEString(), "groundstr", null, 0, 1, wStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rStatementEClass, rStatement.class, "rStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getrStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, rStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getrStatement_Groundstr(), ecorePackage.getEString(), "groundstr", null, 0, 1, rStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ArgumentsPackageImpl
