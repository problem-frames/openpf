/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.arguments.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.arguments.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentsFactoryImpl extends EFactoryImpl implements ArgumentsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ArgumentsFactory init()
  {
    try
    {
      ArgumentsFactory theArgumentsFactory = (ArgumentsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/mydsl/Arguments"); 
      if (theArgumentsFactory != null)
      {
        return theArgumentsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ArgumentsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentsFactoryImpl()
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
      case ArgumentsPackage.ARGUMENT: return createArgument();
      case ArgumentsPackage.REBUTTAL: return createRebuttal();
      case ArgumentsPackage.GSTATEMENT: return creategStatement();
      case ArgumentsPackage.WSTATEMENT: return createwStatement();
      case ArgumentsPackage.RSTATEMENT: return createrStatement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
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
  public Rebuttal createRebuttal()
  {
    RebuttalImpl rebuttal = new RebuttalImpl();
    return rebuttal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public gStatement creategStatement()
  {
    gStatementImpl gStatement = new gStatementImpl();
    return gStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public wStatement createwStatement()
  {
    wStatementImpl wStatement = new wStatementImpl();
    return wStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rStatement createrStatement()
  {
    rStatementImpl rStatement = new rStatementImpl();
    return rStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentsPackage getArgumentsPackage()
  {
    return (ArgumentsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ArgumentsPackage getPackage()
  {
    return ArgumentsPackage.eINSTANCE;
  }

} //ArgumentsFactoryImpl
