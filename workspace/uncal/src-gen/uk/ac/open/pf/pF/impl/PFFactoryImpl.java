/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.pf.pF.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.open.pf.pF.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PFFactoryImpl extends EFactoryImpl implements PFFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PFFactory init()
  {
    try
    {
      PFFactory thePFFactory = (PFFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ac.uk/open/pf/PF"); 
      if (thePFFactory != null)
      {
        return thePFFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PFFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PFFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PFPackage.ROOT_DIAGRAM: return createRootDiagram();
      case PFPackage.NODE: return createNode();
      case PFPackage.COMPOSITE_OBJECT: return createCompositeObject();
      case PFPackage.FIELD: return createField();
      case PFPackage.SIMPLE_FIELD: return createSimpleField();
      case PFPackage.COMPOSITE_FIELD: return createCompositeField();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RootDiagram createRootDiagram()
  {
    RootDiagramImpl rootDiagram = new RootDiagramImpl();
    return rootDiagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeObject createCompositeObject()
  {
    CompositeObjectImpl compositeObject = new CompositeObjectImpl();
    return compositeObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleField createSimpleField()
  {
    SimpleFieldImpl simpleField = new SimpleFieldImpl();
    return simpleField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeField createCompositeField()
  {
    CompositeFieldImpl compositeField = new CompositeFieldImpl();
    return compositeField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PFPackage getPFPackage()
  {
    return (PFPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PFPackage getPackage()
  {
    return PFPackage.eINSTANCE;
  }

} //PFFactoryImpl
