/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.arguments;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.xtext.example.mydsl.arguments.ArgumentsFactory
 * @model kind="package"
 * @generated
 */
public interface ArgumentsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "arguments";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/Arguments";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "arguments";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArgumentsPackage eINSTANCE = org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.arguments.impl.ArgImpl <em>Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.arguments.impl.ArgImpl
   * @see org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl#getArg()
   * @generated
   */
  int ARG = 0;

  /**
   * The feature id for the '<em><b>Groundstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG__GROUNDSTATEMENTS = 0;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG__INNER = 1;

  /**
   * The number of structural features of the '<em>Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.arguments.impl.gStatementImpl <em>gStatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.arguments.impl.gStatementImpl
   * @see org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl#getgStatement()
   * @generated
   */
  int GSTATEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GSTATEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Groundstr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GSTATEMENT__GROUNDSTR = 1;

  /**
   * The number of structural features of the '<em>gStatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GSTATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.arguments.impl.RecArgImpl <em>Rec Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.arguments.impl.RecArgImpl
   * @see org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl#getRecArg()
   * @generated
   */
  int REC_ARG = 2;

  /**
   * The feature id for the '<em><b>Groundstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REC_ARG__GROUNDSTATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Rec Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REC_ARG_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.arguments.Arg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arg</em>'.
   * @see org.xtext.example.mydsl.arguments.Arg
   * @generated
   */
  EClass getArg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.arguments.Arg#getGroundstatements <em>Groundstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groundstatements</em>'.
   * @see org.xtext.example.mydsl.arguments.Arg#getGroundstatements()
   * @see #getArg()
   * @generated
   */
  EReference getArg_Groundstatements();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.arguments.Arg#getInner <em>Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inner</em>'.
   * @see org.xtext.example.mydsl.arguments.Arg#getInner()
   * @see #getArg()
   * @generated
   */
  EReference getArg_Inner();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.arguments.gStatement <em>gStatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>gStatement</em>'.
   * @see org.xtext.example.mydsl.arguments.gStatement
   * @generated
   */
  EClass getgStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.arguments.gStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.arguments.gStatement#getName()
   * @see #getgStatement()
   * @generated
   */
  EAttribute getgStatement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.arguments.gStatement#getGroundstr <em>Groundstr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Groundstr</em>'.
   * @see org.xtext.example.mydsl.arguments.gStatement#getGroundstr()
   * @see #getgStatement()
   * @generated
   */
  EAttribute getgStatement_Groundstr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.arguments.RecArg <em>Rec Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rec Arg</em>'.
   * @see org.xtext.example.mydsl.arguments.RecArg
   * @generated
   */
  EClass getRecArg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.arguments.RecArg#getGroundstatements <em>Groundstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groundstatements</em>'.
   * @see org.xtext.example.mydsl.arguments.RecArg#getGroundstatements()
   * @see #getRecArg()
   * @generated
   */
  EReference getRecArg_Groundstatements();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ArgumentsFactory getArgumentsFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.arguments.impl.ArgImpl <em>Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.arguments.impl.ArgImpl
     * @see org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl#getArg()
     * @generated
     */
    EClass ARG = eINSTANCE.getArg();

    /**
     * The meta object literal for the '<em><b>Groundstatements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG__GROUNDSTATEMENTS = eINSTANCE.getArg_Groundstatements();

    /**
     * The meta object literal for the '<em><b>Inner</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG__INNER = eINSTANCE.getArg_Inner();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.arguments.impl.gStatementImpl <em>gStatement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.arguments.impl.gStatementImpl
     * @see org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl#getgStatement()
     * @generated
     */
    EClass GSTATEMENT = eINSTANCE.getgStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GSTATEMENT__NAME = eINSTANCE.getgStatement_Name();

    /**
     * The meta object literal for the '<em><b>Groundstr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GSTATEMENT__GROUNDSTR = eINSTANCE.getgStatement_Groundstr();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.arguments.impl.RecArgImpl <em>Rec Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.arguments.impl.RecArgImpl
     * @see org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl#getRecArg()
     * @generated
     */
    EClass REC_ARG = eINSTANCE.getRecArg();

    /**
     * The meta object literal for the '<em><b>Groundstatements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REC_ARG__GROUNDSTATEMENTS = eINSTANCE.getRecArg_Groundstatements();

  }

} //ArgumentsPackage
