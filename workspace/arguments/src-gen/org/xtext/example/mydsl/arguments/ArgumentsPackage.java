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
   * The meta object id for the '{@link org.xtext.example.mydsl.arguments.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.arguments.impl.ArgumentImpl
   * @see org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 0;

  /**
   * The feature id for the '<em><b>Cname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__CNAME = 0;

  /**
   * The feature id for the '<em><b>Claimstr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__CLAIMSTR = 1;

  /**
   * The feature id for the '<em><b>Gname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__GNAME = 2;

  /**
   * The feature id for the '<em><b>Groundstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__GROUNDSTATEMENTS = 3;

  /**
   * The feature id for the '<em><b>Wname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__WNAME = 4;

  /**
   * The feature id for the '<em><b>Warrantstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__WARRANTSTATEMENTS = 5;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.arguments.impl.RebuttalImpl <em>Rebuttal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.arguments.impl.RebuttalImpl
   * @see org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl#getRebuttal()
   * @generated
   */
  int REBUTTAL = 1;

  /**
   * The feature id for the '<em><b>Aname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REBUTTAL__ANAME = 0;

  /**
   * The feature id for the '<em><b>Rname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REBUTTAL__RNAME = 1;

  /**
   * The feature id for the '<em><b>Rebuttalstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REBUTTAL__REBUTTALSTATEMENTS = 2;

  /**
   * The number of structural features of the '<em>Rebuttal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REBUTTAL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.arguments.impl.gStatementImpl <em>gStatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.arguments.impl.gStatementImpl
   * @see org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl#getgStatement()
   * @generated
   */
  int GSTATEMENT = 2;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.arguments.impl.wStatementImpl <em>wStatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.arguments.impl.wStatementImpl
   * @see org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl#getwStatement()
   * @generated
   */
  int WSTATEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WSTATEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Groundstr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WSTATEMENT__GROUNDSTR = 1;

  /**
   * The number of structural features of the '<em>wStatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WSTATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.arguments.impl.rStatementImpl <em>rStatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.arguments.impl.rStatementImpl
   * @see org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl#getrStatement()
   * @generated
   */
  int RSTATEMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSTATEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Groundstr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSTATEMENT__GROUNDSTR = 1;

  /**
   * The number of structural features of the '<em>rStatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSTATEMENT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.arguments.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see org.xtext.example.mydsl.arguments.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.arguments.Argument#getCname <em>Cname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cname</em>'.
   * @see org.xtext.example.mydsl.arguments.Argument#getCname()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Cname();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.arguments.Argument#getClaimstr <em>Claimstr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Claimstr</em>'.
   * @see org.xtext.example.mydsl.arguments.Argument#getClaimstr()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Claimstr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.arguments.Argument#getGname <em>Gname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gname</em>'.
   * @see org.xtext.example.mydsl.arguments.Argument#getGname()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Gname();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.arguments.Argument#getGroundstatements <em>Groundstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groundstatements</em>'.
   * @see org.xtext.example.mydsl.arguments.Argument#getGroundstatements()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Groundstatements();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.arguments.Argument#getWname <em>Wname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wname</em>'.
   * @see org.xtext.example.mydsl.arguments.Argument#getWname()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Wname();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.arguments.Argument#getWarrantstatements <em>Warrantstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Warrantstatements</em>'.
   * @see org.xtext.example.mydsl.arguments.Argument#getWarrantstatements()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Warrantstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.arguments.Rebuttal <em>Rebuttal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rebuttal</em>'.
   * @see org.xtext.example.mydsl.arguments.Rebuttal
   * @generated
   */
  EClass getRebuttal();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.arguments.Rebuttal#getAname <em>Aname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aname</em>'.
   * @see org.xtext.example.mydsl.arguments.Rebuttal#getAname()
   * @see #getRebuttal()
   * @generated
   */
  EReference getRebuttal_Aname();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.arguments.Rebuttal#getRname <em>Rname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rname</em>'.
   * @see org.xtext.example.mydsl.arguments.Rebuttal#getRname()
   * @see #getRebuttal()
   * @generated
   */
  EAttribute getRebuttal_Rname();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.arguments.Rebuttal#getRebuttalstatements <em>Rebuttalstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rebuttalstatements</em>'.
   * @see org.xtext.example.mydsl.arguments.Rebuttal#getRebuttalstatements()
   * @see #getRebuttal()
   * @generated
   */
  EReference getRebuttal_Rebuttalstatements();

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
   * Returns the meta object for class '{@link org.xtext.example.mydsl.arguments.wStatement <em>wStatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>wStatement</em>'.
   * @see org.xtext.example.mydsl.arguments.wStatement
   * @generated
   */
  EClass getwStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.arguments.wStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.arguments.wStatement#getName()
   * @see #getwStatement()
   * @generated
   */
  EAttribute getwStatement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.arguments.wStatement#getGroundstr <em>Groundstr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Groundstr</em>'.
   * @see org.xtext.example.mydsl.arguments.wStatement#getGroundstr()
   * @see #getwStatement()
   * @generated
   */
  EAttribute getwStatement_Groundstr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.arguments.rStatement <em>rStatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rStatement</em>'.
   * @see org.xtext.example.mydsl.arguments.rStatement
   * @generated
   */
  EClass getrStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.arguments.rStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.arguments.rStatement#getName()
   * @see #getrStatement()
   * @generated
   */
  EAttribute getrStatement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.arguments.rStatement#getGroundstr <em>Groundstr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Groundstr</em>'.
   * @see org.xtext.example.mydsl.arguments.rStatement#getGroundstr()
   * @see #getrStatement()
   * @generated
   */
  EAttribute getrStatement_Groundstr();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.arguments.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.arguments.impl.ArgumentImpl
     * @see org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Cname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__CNAME = eINSTANCE.getArgument_Cname();

    /**
     * The meta object literal for the '<em><b>Claimstr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__CLAIMSTR = eINSTANCE.getArgument_Claimstr();

    /**
     * The meta object literal for the '<em><b>Gname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__GNAME = eINSTANCE.getArgument_Gname();

    /**
     * The meta object literal for the '<em><b>Groundstatements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__GROUNDSTATEMENTS = eINSTANCE.getArgument_Groundstatements();

    /**
     * The meta object literal for the '<em><b>Wname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__WNAME = eINSTANCE.getArgument_Wname();

    /**
     * The meta object literal for the '<em><b>Warrantstatements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__WARRANTSTATEMENTS = eINSTANCE.getArgument_Warrantstatements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.arguments.impl.RebuttalImpl <em>Rebuttal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.arguments.impl.RebuttalImpl
     * @see org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl#getRebuttal()
     * @generated
     */
    EClass REBUTTAL = eINSTANCE.getRebuttal();

    /**
     * The meta object literal for the '<em><b>Aname</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REBUTTAL__ANAME = eINSTANCE.getRebuttal_Aname();

    /**
     * The meta object literal for the '<em><b>Rname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REBUTTAL__RNAME = eINSTANCE.getRebuttal_Rname();

    /**
     * The meta object literal for the '<em><b>Rebuttalstatements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REBUTTAL__REBUTTALSTATEMENTS = eINSTANCE.getRebuttal_Rebuttalstatements();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.arguments.impl.wStatementImpl <em>wStatement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.arguments.impl.wStatementImpl
     * @see org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl#getwStatement()
     * @generated
     */
    EClass WSTATEMENT = eINSTANCE.getwStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WSTATEMENT__NAME = eINSTANCE.getwStatement_Name();

    /**
     * The meta object literal for the '<em><b>Groundstr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WSTATEMENT__GROUNDSTR = eINSTANCE.getwStatement_Groundstr();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.arguments.impl.rStatementImpl <em>rStatement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.arguments.impl.rStatementImpl
     * @see org.xtext.example.mydsl.arguments.impl.ArgumentsPackageImpl#getrStatement()
     * @generated
     */
    EClass RSTATEMENT = eINSTANCE.getrStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RSTATEMENT__NAME = eINSTANCE.getrStatement_Name();

    /**
     * The meta object literal for the '<em><b>Groundstr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RSTATEMENT__GROUNDSTR = eINSTANCE.getrStatement_Groundstr();

  }

} //ArgumentsPackage
