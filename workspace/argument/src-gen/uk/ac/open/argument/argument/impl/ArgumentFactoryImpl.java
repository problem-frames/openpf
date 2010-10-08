/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
      case ArgumentPackage.LINK: return createLink();
      case ArgumentPackage.EXPRESSION: return createExpression();
      case ArgumentPackage.NODE_LITERAL: return createNodeLiteral();
      case ArgumentPackage.SPLIT_COMMAS: return createSplitCommas();
      case ArgumentPackage.SPLIT_CONNECTIVE: return createSplitConnective();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ArgumentPackage.NODE_TYPE:
        return createNodeTypeFromString(eDataType, initialValue);
      case ArgumentPackage.CONNECTIVE_TYPE:
        return createConnectiveTypeFromString(eDataType, initialValue);
      case ArgumentPackage.LINK_TYPE:
        return createLinkTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ArgumentPackage.NODE_TYPE:
        return convertNodeTypeToString(eDataType, instanceValue);
      case ArgumentPackage.CONNECTIVE_TYPE:
        return convertConnectiveTypeToString(eDataType, instanceValue);
      case ArgumentPackage.LINK_TYPE:
        return convertLinkTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeLiteral createNodeLiteral()
  {
    NodeLiteralImpl nodeLiteral = new NodeLiteralImpl();
    return nodeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SplitCommas createSplitCommas()
  {
    SplitCommasImpl splitCommas = new SplitCommasImpl();
    return splitCommas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SplitConnective createSplitConnective()
  {
    SplitConnectiveImpl splitConnective = new SplitConnectiveImpl();
    return splitConnective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue)
  {
    NodeType result = NodeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNodeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectiveType createConnectiveTypeFromString(EDataType eDataType, String initialValue)
  {
    ConnectiveType result = ConnectiveType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConnectiveTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkType createLinkTypeFromString(EDataType eDataType, String initialValue)
  {
    LinkType result = LinkType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLinkTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
