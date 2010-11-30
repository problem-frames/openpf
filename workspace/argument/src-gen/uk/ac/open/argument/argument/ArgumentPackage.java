/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument;

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
 * @see uk.ac.open.argument.argument.ArgumentFactory
 * @model kind="package"
 * @generated
 */
public interface ArgumentPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "argument";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/open/argument/Argument";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "argument";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArgumentPackage eINSTANCE = uk.ac.open.argument.argument.impl.ArgumentPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.ArgumentDiagramImpl <em>Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.ArgumentDiagramImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getArgumentDiagram()
   * @generated
   */
  int ARGUMENT_DIAGRAM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DIAGRAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DIAGRAM__NODES = 1;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DIAGRAM__LINKS = 2;

  /**
   * The number of structural features of the '<em>Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DIAGRAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.ArgumentImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Round</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__ROUND = 2;

  /**
   * The feature id for the '<em><b>Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__EXPR = 3;

  /**
   * The feature id for the '<em><b>Origin</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__ORIGIN = 4;

  /**
   * The feature id for the '<em><b>Foreground</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__FOREGROUND = 5;

  /**
   * The feature id for the '<em><b>Background</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__BACKGROUND = 6;

  /**
   * The feature id for the '<em><b>Shape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__SHAPE = 7;

  /**
   * The feature id for the '<em><b>Image</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__IMAGE = 8;

  /**
   * The feature id for the '<em><b>Grounds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__GROUNDS = 9;

  /**
   * The feature id for the '<em><b>Warrants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__WARRANTS = 10;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.LinkImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getLink()
   * @generated
   */
  int LINK = 2;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__FROM = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TO = 1;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.RebutsImpl <em>Rebuts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.RebutsImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRebuts()
   * @generated
   */
  int REBUTS = 3;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REBUTS__FROM = LINK__FROM;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REBUTS__TO = LINK__TO;

  /**
   * The number of structural features of the '<em>Rebuts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REBUTS_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.open.argument.argument.impl.MitigatesImpl <em>Mitigates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.argument.argument.impl.MitigatesImpl
   * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getMitigates()
   * @generated
   */
  int MITIGATES = 4;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGATES__FROM = LINK__FROM;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGATES__TO = LINK__TO;

  /**
   * The feature id for the '<em><b>Rebuttal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGATES__REBUTTAL = LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mitigates</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGATES_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.ArgumentDiagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagram</em>'.
   * @see uk.ac.open.argument.argument.ArgumentDiagram
   * @generated
   */
  EClass getArgumentDiagram();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.ArgumentDiagram#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.argument.argument.ArgumentDiagram#getName()
   * @see #getArgumentDiagram()
   * @generated
   */
  EAttribute getArgumentDiagram_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.argument.argument.ArgumentDiagram#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see uk.ac.open.argument.argument.ArgumentDiagram#getNodes()
   * @see #getArgumentDiagram()
   * @generated
   */
  EReference getArgumentDiagram_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.argument.argument.ArgumentDiagram#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see uk.ac.open.argument.argument.ArgumentDiagram#getLinks()
   * @see #getArgumentDiagram()
   * @generated
   */
  EReference getArgumentDiagram_Links();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see uk.ac.open.argument.argument.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Argument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.argument.argument.Argument#getName()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Argument#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see uk.ac.open.argument.argument.Argument#getDescription()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Description();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Argument#getRound <em>Round</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Round</em>'.
   * @see uk.ac.open.argument.argument.Argument#getRound()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Round();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Argument#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr</em>'.
   * @see uk.ac.open.argument.argument.Argument#getExpr()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Expr();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.argument.argument.Argument#getOrigin <em>Origin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Origin</em>'.
   * @see uk.ac.open.argument.argument.Argument#getOrigin()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Origin();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Argument#getForeground <em>Foreground</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Foreground</em>'.
   * @see uk.ac.open.argument.argument.Argument#getForeground()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Foreground();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Argument#getBackground <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Background</em>'.
   * @see uk.ac.open.argument.argument.Argument#getBackground()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Background();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Argument#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shape</em>'.
   * @see uk.ac.open.argument.argument.Argument#getShape()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Shape();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.argument.argument.Argument#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image</em>'.
   * @see uk.ac.open.argument.argument.Argument#getImage()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Image();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.argument.argument.Argument#getGrounds <em>Grounds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Grounds</em>'.
   * @see uk.ac.open.argument.argument.Argument#getGrounds()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Grounds();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.argument.argument.Argument#getWarrants <em>Warrants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Warrants</em>'.
   * @see uk.ac.open.argument.argument.Argument#getWarrants()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Warrants();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see uk.ac.open.argument.argument.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.argument.argument.Link#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see uk.ac.open.argument.argument.Link#getFrom()
   * @see #getLink()
   * @generated
   */
  EReference getLink_From();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.argument.argument.Link#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see uk.ac.open.argument.argument.Link#getTo()
   * @see #getLink()
   * @generated
   */
  EReference getLink_To();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Rebuts <em>Rebuts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rebuts</em>'.
   * @see uk.ac.open.argument.argument.Rebuts
   * @generated
   */
  EClass getRebuts();

  /**
   * Returns the meta object for class '{@link uk.ac.open.argument.argument.Mitigates <em>Mitigates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mitigates</em>'.
   * @see uk.ac.open.argument.argument.Mitigates
   * @generated
   */
  EClass getMitigates();

  /**
   * Returns the meta object for the reference '{@link uk.ac.open.argument.argument.Mitigates#getRebuttal <em>Rebuttal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rebuttal</em>'.
   * @see uk.ac.open.argument.argument.Mitigates#getRebuttal()
   * @see #getMitigates()
   * @generated
   */
  EReference getMitigates_Rebuttal();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ArgumentFactory getArgumentFactory();

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
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.ArgumentDiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.ArgumentDiagramImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getArgumentDiagram()
     * @generated
     */
    EClass ARGUMENT_DIAGRAM = eINSTANCE.getArgumentDiagram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT_DIAGRAM__NAME = eINSTANCE.getArgumentDiagram_Name();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT_DIAGRAM__NODES = eINSTANCE.getArgumentDiagram_Nodes();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT_DIAGRAM__LINKS = eINSTANCE.getArgumentDiagram_Links();

    /**
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.ArgumentImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__DESCRIPTION = eINSTANCE.getArgument_Description();

    /**
     * The meta object literal for the '<em><b>Round</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__ROUND = eINSTANCE.getArgument_Round();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__EXPR = eINSTANCE.getArgument_Expr();

    /**
     * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__ORIGIN = eINSTANCE.getArgument_Origin();

    /**
     * The meta object literal for the '<em><b>Foreground</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__FOREGROUND = eINSTANCE.getArgument_Foreground();

    /**
     * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__BACKGROUND = eINSTANCE.getArgument_Background();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__SHAPE = eINSTANCE.getArgument_Shape();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__IMAGE = eINSTANCE.getArgument_Image();

    /**
     * The meta object literal for the '<em><b>Grounds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__GROUNDS = eINSTANCE.getArgument_Grounds();

    /**
     * The meta object literal for the '<em><b>Warrants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__WARRANTS = eINSTANCE.getArgument_Warrants();

    /**
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.LinkImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getLink()
     * @generated
     */
    EClass LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__FROM = eINSTANCE.getLink_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__TO = eINSTANCE.getLink_To();

    /**
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.RebutsImpl <em>Rebuts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.RebutsImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getRebuts()
     * @generated
     */
    EClass REBUTS = eINSTANCE.getRebuts();

    /**
     * The meta object literal for the '{@link uk.ac.open.argument.argument.impl.MitigatesImpl <em>Mitigates</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.argument.argument.impl.MitigatesImpl
     * @see uk.ac.open.argument.argument.impl.ArgumentPackageImpl#getMitigates()
     * @generated
     */
    EClass MITIGATES = eINSTANCE.getMitigates();

    /**
     * The meta object literal for the '<em><b>Rebuttal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MITIGATES__REBUTTAL = eINSTANCE.getMitigates_Rebuttal();

  }

} //ArgumentPackage
