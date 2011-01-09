/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.open.argument.argument.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.open.argument.argument.ArgumentPackage
 * @generated
 */
public class ArgumentAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArgumentPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ArgumentPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArgumentSwitch<Adapter> modelSwitch =
    new ArgumentSwitch<Adapter>()
    {
      @Override
      public Adapter caseArgumentDiagram(ArgumentDiagram object)
      {
        return createArgumentDiagramAdapter();
      }
      @Override
      public Adapter caseLink(Link object)
      {
        return createLinkAdapter();
      }
      @Override
      public Adapter caseRebuts(Rebuts object)
      {
        return createRebutsAdapter();
      }
      @Override
      public Adapter caseMitigates(Mitigates object)
      {
        return createMitigatesAdapter();
      }
      @Override
      public Adapter caseArgument(Argument object)
      {
        return createArgumentAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseTerminalExpression(TerminalExpression object)
      {
        return createTerminalExpressionAdapter();
      }
      @Override
      public Adapter caseAssignPlus(AssignPlus object)
      {
        return createAssignPlusAdapter();
      }
      @Override
      public Adapter caseAssignMin(AssignMin object)
      {
        return createAssignMinAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseRelNotEq(RelNotEq object)
      {
        return createRelNotEqAdapter();
      }
      @Override
      public Adapter caseRelEqEq(RelEqEq object)
      {
        return createRelEqEqAdapter();
      }
      @Override
      public Adapter caseRelLtEq(RelLtEq object)
      {
        return createRelLtEqAdapter();
      }
      @Override
      public Adapter caseRelGtEq(RelGtEq object)
      {
        return createRelGtEqAdapter();
      }
      @Override
      public Adapter caseRelEq(RelEq object)
      {
        return createRelEqAdapter();
      }
      @Override
      public Adapter caseRelLt(RelLt object)
      {
        return createRelLtAdapter();
      }
      @Override
      public Adapter caseRelGt(RelGt object)
      {
        return createRelGtAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMulti(Multi object)
      {
        return createMultiAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter casePow(Pow object)
      {
        return createPowAdapter();
      }
      @Override
      public Adapter caseIntLiteral(IntLiteral object)
      {
        return createIntLiteralAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object)
      {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.ArgumentDiagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.ArgumentDiagram
   * @generated
   */
  public Adapter createArgumentDiagramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.Link
   * @generated
   */
  public Adapter createLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.Rebuts <em>Rebuts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.Rebuts
   * @generated
   */
  public Adapter createRebutsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.Mitigates <em>Mitigates</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.Mitigates
   * @generated
   */
  public Adapter createMitigatesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.Argument
   * @generated
   */
  public Adapter createArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.TerminalExpression <em>Terminal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.TerminalExpression
   * @generated
   */
  public Adapter createTerminalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.AssignPlus <em>Assign Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.AssignPlus
   * @generated
   */
  public Adapter createAssignPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.AssignMin <em>Assign Min</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.AssignMin
   * @generated
   */
  public Adapter createAssignMinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.RelNotEq <em>Rel Not Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.RelNotEq
   * @generated
   */
  public Adapter createRelNotEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.RelEqEq <em>Rel Eq Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.RelEqEq
   * @generated
   */
  public Adapter createRelEqEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.RelLtEq <em>Rel Lt Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.RelLtEq
   * @generated
   */
  public Adapter createRelLtEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.RelGtEq <em>Rel Gt Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.RelGtEq
   * @generated
   */
  public Adapter createRelGtEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.RelEq <em>Rel Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.RelEq
   * @generated
   */
  public Adapter createRelEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.RelLt <em>Rel Lt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.RelLt
   * @generated
   */
  public Adapter createRelLtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.RelGt <em>Rel Gt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.RelGt
   * @generated
   */
  public Adapter createRelGtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.Multi
   * @generated
   */
  public Adapter createMultiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.Pow <em>Pow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.Pow
   * @generated
   */
  public Adapter createPowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.IntLiteral
   * @generated
   */
  public Adapter createIntLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.open.argument.argument.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.open.argument.argument.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ArgumentAdapterFactory
