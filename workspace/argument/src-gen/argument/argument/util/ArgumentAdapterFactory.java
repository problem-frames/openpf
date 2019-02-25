/**
 */
package argument.argument.util;

import argument.argument.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see argument.argument.ArgumentPackage
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
      public Adapter caseAssignmentOp(AssignmentOp object)
      {
        return createAssignmentOpAdapter();
      }
      @Override
      public Adapter caseOrExp(OrExp object)
      {
        return createOrExpAdapter();
      }
      @Override
      public Adapter caseAndExp(AndExp object)
      {
        return createAndExpAdapter();
      }
      @Override
      public Adapter caseRelational(Relational object)
      {
        return createRelationalAdapter();
      }
      @Override
      public Adapter caseAddition(Addition object)
      {
        return createAdditionAdapter();
      }
      @Override
      public Adapter caseMultiplication(Multiplication object)
      {
        return createMultiplicationAdapter();
      }
      @Override
      public Adapter casePower(Power object)
      {
        return createPowerAdapter();
      }
      @Override
      public Adapter caseUnaryExpr(UnaryExpr object)
      {
        return createUnaryExprAdapter();
      }
      @Override
      public Adapter casePrePrimaryExpr(PrePrimaryExpr object)
      {
        return createPrePrimaryExprAdapter();
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
   * Creates a new adapter for an object of class '{@link argument.argument.ArgumentDiagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.ArgumentDiagram
   * @generated
   */
  public Adapter createArgumentDiagramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.Link
   * @generated
   */
  public Adapter createLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.Rebuts <em>Rebuts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.Rebuts
   * @generated
   */
  public Adapter createRebutsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.Mitigates <em>Mitigates</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.Mitigates
   * @generated
   */
  public Adapter createMitigatesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.Argument
   * @generated
   */
  public Adapter createArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.AssignmentOp <em>Assignment Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.AssignmentOp
   * @generated
   */
  public Adapter createAssignmentOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.OrExp <em>Or Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.OrExp
   * @generated
   */
  public Adapter createOrExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.AndExp <em>And Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.AndExp
   * @generated
   */
  public Adapter createAndExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.Relational <em>Relational</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.Relational
   * @generated
   */
  public Adapter createRelationalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.Addition
   * @generated
   */
  public Adapter createAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.Multiplication
   * @generated
   */
  public Adapter createMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.Power <em>Power</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.Power
   * @generated
   */
  public Adapter createPowerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.UnaryExpr <em>Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.UnaryExpr
   * @generated
   */
  public Adapter createUnaryExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.PrePrimaryExpr <em>Pre Primary Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.PrePrimaryExpr
   * @generated
   */
  public Adapter createPrePrimaryExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.TerminalExpression <em>Terminal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.TerminalExpression
   * @generated
   */
  public Adapter createTerminalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.AssignPlus <em>Assign Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.AssignPlus
   * @generated
   */
  public Adapter createAssignPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.AssignMin <em>Assign Min</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.AssignMin
   * @generated
   */
  public Adapter createAssignMinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.RelNotEq <em>Rel Not Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.RelNotEq
   * @generated
   */
  public Adapter createRelNotEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.RelEqEq <em>Rel Eq Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.RelEqEq
   * @generated
   */
  public Adapter createRelEqEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.RelLtEq <em>Rel Lt Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.RelLtEq
   * @generated
   */
  public Adapter createRelLtEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.RelGtEq <em>Rel Gt Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.RelGtEq
   * @generated
   */
  public Adapter createRelGtEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.RelEq <em>Rel Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.RelEq
   * @generated
   */
  public Adapter createRelEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.RelLt <em>Rel Lt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.RelLt
   * @generated
   */
  public Adapter createRelLtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.RelGt <em>Rel Gt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.RelGt
   * @generated
   */
  public Adapter createRelGtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.Multi
   * @generated
   */
  public Adapter createMultiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.Pow <em>Pow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.Pow
   * @generated
   */
  public Adapter createPowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.IntLiteral
   * @generated
   */
  public Adapter createIntLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link argument.argument.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see argument.argument.BooleanLiteral
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
