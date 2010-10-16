/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.dependency.dependency.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.open.dependency.dependency.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencyFactoryImpl extends EFactoryImpl implements DependencyFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DependencyFactory init()
  {
    try
    {
      DependencyFactory theDependencyFactory = (DependencyFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.Dependency"); 
      if (theDependencyFactory != null)
      {
        return theDependencyFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DependencyFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyFactoryImpl()
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
      case DependencyPackage.MODEL: return createModel();
      case DependencyPackage.NODE: return createNode();
      case DependencyPackage.DEPENDENCY: return createDependency();
      case DependencyPackage.COUPLING: return createCoupling();
      case DependencyPackage.PRECEDENCE: return createPrecedence();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
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
  public Dependency createDependency()
  {
    DependencyImpl dependency = new DependencyImpl();
    return dependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coupling createCoupling()
  {
    CouplingImpl coupling = new CouplingImpl();
    return coupling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Precedence createPrecedence()
  {
    PrecedenceImpl precedence = new PrecedenceImpl();
    return precedence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyPackage getDependencyPackage()
  {
    return (DependencyPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DependencyPackage getPackage()
  {
    return DependencyPackage.eINSTANCE;
  }

} //DependencyFactoryImpl
