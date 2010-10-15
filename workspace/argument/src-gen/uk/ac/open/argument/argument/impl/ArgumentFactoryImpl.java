/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.open.argument.argument.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentFactoryImpl extends EFactoryImpl implements ArgumentFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ArgumentFactory init()
  {
    try
    {
      ArgumentFactory theArgumentFactory = (ArgumentFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ac.uk/open/argument/Argument"); 
      if (theArgumentFactory != null)
      {
        return theArgumentFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ArgumentFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentFactoryImpl()
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
      case ArgumentPackage.ARGUMENT_DIAGRAM: return createArgumentDiagram();
      case ArgumentPackage.NODE: return createNode();
      case ArgumentPackage.ARGUMENT: return createArgument();
      case ArgumentPackage.FACT: return createFact();
      case ArgumentPackage.CLAIM: return createClaim();
      case ArgumentPackage.LINK: return createLink();
      case ArgumentPackage.REBUTS: return createRebuts();
      case ArgumentPackage.MITIGATES: return createMitigates();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentDiagram createArgumentDiagram()
  {
    ArgumentDiagramImpl argumentDiagram = new ArgumentDiagramImpl();
    return argumentDiagram;
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
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fact createFact()
  {
    FactImpl fact = new FactImpl();
    return fact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Claim createClaim()
  {
    ClaimImpl claim = new ClaimImpl();
    return claim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link createLink()
  {
    LinkImpl link = new LinkImpl();
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rebuts createRebuts()
  {
    RebutsImpl rebuts = new RebutsImpl();
    return rebuts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mitigates createMitigates()
  {
    MitigatesImpl mitigates = new MitigatesImpl();
    return mitigates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentPackage getArgumentPackage()
  {
    return (ArgumentPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ArgumentPackage getPackage()
  {
    return ArgumentPackage.eINSTANCE;
  }

} //ArgumentFactoryImpl
