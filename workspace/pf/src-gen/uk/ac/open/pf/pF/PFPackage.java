/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.pf.pF;

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
 * @see uk.ac.open.pf.pF.PFFactory
 * @model kind="package"
 * @generated
 */
public interface PFPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pF";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/open/pf/PF";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pF";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PFPackage eINSTANCE = uk.ac.open.pf.pF.impl.PFPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.open.pf.pF.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.pf.pF.impl.NodeImpl
   * @see uk.ac.open.pf.pF.impl.PFPackageImpl#getNode()
   * @generated
   */
  int NODE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__COMPOSITE = 2;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.open.pf.pF.impl.RootDiagramImpl <em>Root Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.pf.pF.impl.RootDiagramImpl
   * @see uk.ac.open.pf.pF.impl.PFPackageImpl#getRootDiagram()
   * @generated
   */
  int ROOT_DIAGRAM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_DIAGRAM__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_DIAGRAM__TYPE = NODE__TYPE;

  /**
   * The feature id for the '<em><b>Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_DIAGRAM__COMPOSITE = NODE__COMPOSITE;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_DIAGRAM__OBJECTS = NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Root Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_DIAGRAM_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.pf.pF.impl.CompositeObjectImpl <em>Composite Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.pf.pF.impl.CompositeObjectImpl
   * @see uk.ac.open.pf.pF.impl.PFPackageImpl#getCompositeObject()
   * @generated
   */
  int COMPOSITE_OBJECT = 2;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_OBJECT__FIELDS = 0;

  /**
   * The number of structural features of the '<em>Composite Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.open.pf.pF.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.pf.pF.impl.FieldImpl
   * @see uk.ac.open.pf.pF.impl.PFPackageImpl#getField()
   * @generated
   */
  int FIELD = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.open.pf.pF.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.pf.pF.impl.SimpleFieldImpl
   * @see uk.ac.open.pf.pF.impl.PFPackageImpl#getSimpleField()
   * @generated
   */
  int SIMPLE_FIELD = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__NAME = FIELD__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__VALUE = FIELD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.open.pf.pF.impl.CompositeFieldImpl <em>Composite Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.open.pf.pF.impl.CompositeFieldImpl
   * @see uk.ac.open.pf.pF.impl.PFPackageImpl#getCompositeField()
   * @generated
   */
  int COMPOSITE_FIELD = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_FIELD__NAME = FIELD__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_FIELD__VALUE = FIELD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Composite Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link uk.ac.open.pf.pF.RootDiagram <em>Root Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root Diagram</em>'.
   * @see uk.ac.open.pf.pF.RootDiagram
   * @generated
   */
  EClass getRootDiagram();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.pf.pF.RootDiagram#getObjects <em>Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objects</em>'.
   * @see uk.ac.open.pf.pF.RootDiagram#getObjects()
   * @see #getRootDiagram()
   * @generated
   */
  EReference getRootDiagram_Objects();

  /**
   * Returns the meta object for class '{@link uk.ac.open.pf.pF.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see uk.ac.open.pf.pF.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.pf.pF.Node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.pf.pF.Node#getName()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.pf.pF.Node#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.open.pf.pF.Node#getType()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Type();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.pf.pF.Node#getComposite <em>Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composite</em>'.
   * @see uk.ac.open.pf.pF.Node#getComposite()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Composite();

  /**
   * Returns the meta object for class '{@link uk.ac.open.pf.pF.CompositeObject <em>Composite Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Object</em>'.
   * @see uk.ac.open.pf.pF.CompositeObject
   * @generated
   */
  EClass getCompositeObject();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.open.pf.pF.CompositeObject#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see uk.ac.open.pf.pF.CompositeObject#getFields()
   * @see #getCompositeObject()
   * @generated
   */
  EReference getCompositeObject_Fields();

  /**
   * Returns the meta object for class '{@link uk.ac.open.pf.pF.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see uk.ac.open.pf.pF.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.pf.pF.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.open.pf.pF.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.open.pf.pF.SimpleField <em>Simple Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Field</em>'.
   * @see uk.ac.open.pf.pF.SimpleField
   * @generated
   */
  EClass getSimpleField();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.open.pf.pF.SimpleField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.open.pf.pF.SimpleField#getValue()
   * @see #getSimpleField()
   * @generated
   */
  EAttribute getSimpleField_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.open.pf.pF.CompositeField <em>Composite Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Field</em>'.
   * @see uk.ac.open.pf.pF.CompositeField
   * @generated
   */
  EClass getCompositeField();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.open.pf.pF.CompositeField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see uk.ac.open.pf.pF.CompositeField#getValue()
   * @see #getCompositeField()
   * @generated
   */
  EReference getCompositeField_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PFFactory getPFFactory();

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
     * The meta object literal for the '{@link uk.ac.open.pf.pF.impl.RootDiagramImpl <em>Root Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.pf.pF.impl.RootDiagramImpl
     * @see uk.ac.open.pf.pF.impl.PFPackageImpl#getRootDiagram()
     * @generated
     */
    EClass ROOT_DIAGRAM = eINSTANCE.getRootDiagram();

    /**
     * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT_DIAGRAM__OBJECTS = eINSTANCE.getRootDiagram_Objects();

    /**
     * The meta object literal for the '{@link uk.ac.open.pf.pF.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.pf.pF.impl.NodeImpl
     * @see uk.ac.open.pf.pF.impl.PFPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__NAME = eINSTANCE.getNode_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

    /**
     * The meta object literal for the '<em><b>Composite</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__COMPOSITE = eINSTANCE.getNode_Composite();

    /**
     * The meta object literal for the '{@link uk.ac.open.pf.pF.impl.CompositeObjectImpl <em>Composite Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.pf.pF.impl.CompositeObjectImpl
     * @see uk.ac.open.pf.pF.impl.PFPackageImpl#getCompositeObject()
     * @generated
     */
    EClass COMPOSITE_OBJECT = eINSTANCE.getCompositeObject();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_OBJECT__FIELDS = eINSTANCE.getCompositeObject_Fields();

    /**
     * The meta object literal for the '{@link uk.ac.open.pf.pF.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.pf.pF.impl.FieldImpl
     * @see uk.ac.open.pf.pF.impl.PFPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '{@link uk.ac.open.pf.pF.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.pf.pF.impl.SimpleFieldImpl
     * @see uk.ac.open.pf.pF.impl.PFPackageImpl#getSimpleField()
     * @generated
     */
    EClass SIMPLE_FIELD = eINSTANCE.getSimpleField();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FIELD__VALUE = eINSTANCE.getSimpleField_Value();

    /**
     * The meta object literal for the '{@link uk.ac.open.pf.pF.impl.CompositeFieldImpl <em>Composite Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.open.pf.pF.impl.CompositeFieldImpl
     * @see uk.ac.open.pf.pF.impl.PFPackageImpl#getCompositeField()
     * @generated
     */
    EClass COMPOSITE_FIELD = eINSTANCE.getCompositeField();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_FIELD__VALUE = eINSTANCE.getCompositeField_Value();

  }

} //PFPackage
