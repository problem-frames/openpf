/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package argument.argument.provider;

import argument.argument.util.ArgumentAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentItemProviderAdapterFactory extends ArgumentAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.ArgumentDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentDiagramItemProvider argumentDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.ArgumentDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentDiagramAdapter() {
		if (argumentDiagramItemProvider == null) {
			argumentDiagramItemProvider = new ArgumentDiagramItemProvider(this);
		}

		return argumentDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.Rebuts} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RebutsItemProvider rebutsItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.Rebuts}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRebutsAdapter() {
		if (rebutsItemProvider == null) {
			rebutsItemProvider = new RebutsItemProvider(this);
		}

		return rebutsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.Mitigates} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MitigatesItemProvider mitigatesItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.Mitigates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMitigatesAdapter() {
		if (mitigatesItemProvider == null) {
			mitigatesItemProvider = new MitigatesItemProvider(this);
		}

		return mitigatesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.Argument} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentItemProvider argumentItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentAdapter() {
		if (argumentItemProvider == null) {
			argumentItemProvider = new ArgumentItemProvider(this);
		}

		return argumentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.Expression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionItemProvider expressionItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExpressionAdapter() {
		if (expressionItemProvider == null) {
			expressionItemProvider = new ExpressionItemProvider(this);
		}

		return expressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.AssignmentOp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentOpItemProvider assignmentOpItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.AssignmentOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentOpAdapter() {
		if (assignmentOpItemProvider == null) {
			assignmentOpItemProvider = new AssignmentOpItemProvider(this);
		}

		return assignmentOpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.OrExp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrExpItemProvider orExpItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.OrExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrExpAdapter() {
		if (orExpItemProvider == null) {
			orExpItemProvider = new OrExpItemProvider(this);
		}

		return orExpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.AndExp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndExpItemProvider andExpItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.AndExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndExpAdapter() {
		if (andExpItemProvider == null) {
			andExpItemProvider = new AndExpItemProvider(this);
		}

		return andExpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.Relational} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalItemProvider relationalItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.Relational}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationalAdapter() {
		if (relationalItemProvider == null) {
			relationalItemProvider = new RelationalItemProvider(this);
		}

		return relationalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.Addition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionItemProvider additionItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.Addition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdditionAdapter() {
		if (additionItemProvider == null) {
			additionItemProvider = new AdditionItemProvider(this);
		}

		return additionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.Multiplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicationItemProvider multiplicationItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.Multiplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiplicationAdapter() {
		if (multiplicationItemProvider == null) {
			multiplicationItemProvider = new MultiplicationItemProvider(this);
		}

		return multiplicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.Power} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerItemProvider powerItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.Power}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPowerAdapter() {
		if (powerItemProvider == null) {
			powerItemProvider = new PowerItemProvider(this);
		}

		return powerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.UnaryExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryExprItemProvider unaryExprItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.UnaryExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnaryExprAdapter() {
		if (unaryExprItemProvider == null) {
			unaryExprItemProvider = new UnaryExprItemProvider(this);
		}

		return unaryExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.PrePrimaryExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrePrimaryExprItemProvider prePrimaryExprItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.PrePrimaryExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrePrimaryExprAdapter() {
		if (prePrimaryExprItemProvider == null) {
			prePrimaryExprItemProvider = new PrePrimaryExprItemProvider(this);
		}

		return prePrimaryExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.TerminalExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalExpressionItemProvider terminalExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.TerminalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTerminalExpressionAdapter() {
		if (terminalExpressionItemProvider == null) {
			terminalExpressionItemProvider = new TerminalExpressionItemProvider(this);
		}

		return terminalExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.AssignPlus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignPlusItemProvider assignPlusItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.AssignPlus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignPlusAdapter() {
		if (assignPlusItemProvider == null) {
			assignPlusItemProvider = new AssignPlusItemProvider(this);
		}

		return assignPlusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.AssignMin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignMinItemProvider assignMinItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.AssignMin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignMinAdapter() {
		if (assignMinItemProvider == null) {
			assignMinItemProvider = new AssignMinItemProvider(this);
		}

		return assignMinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.Or} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrItemProvider orItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.Or}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrAdapter() {
		if (orItemProvider == null) {
			orItemProvider = new OrItemProvider(this);
		}

		return orItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.And} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndItemProvider andItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.And}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndAdapter() {
		if (andItemProvider == null) {
			andItemProvider = new AndItemProvider(this);
		}

		return andItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.RelNotEq} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelNotEqItemProvider relNotEqItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.RelNotEq}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelNotEqAdapter() {
		if (relNotEqItemProvider == null) {
			relNotEqItemProvider = new RelNotEqItemProvider(this);
		}

		return relNotEqItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.RelEqEq} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelEqEqItemProvider relEqEqItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.RelEqEq}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelEqEqAdapter() {
		if (relEqEqItemProvider == null) {
			relEqEqItemProvider = new RelEqEqItemProvider(this);
		}

		return relEqEqItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.RelLtEq} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelLtEqItemProvider relLtEqItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.RelLtEq}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelLtEqAdapter() {
		if (relLtEqItemProvider == null) {
			relLtEqItemProvider = new RelLtEqItemProvider(this);
		}

		return relLtEqItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.RelGtEq} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelGtEqItemProvider relGtEqItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.RelGtEq}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelGtEqAdapter() {
		if (relGtEqItemProvider == null) {
			relGtEqItemProvider = new RelGtEqItemProvider(this);
		}

		return relGtEqItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.RelEq} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelEqItemProvider relEqItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.RelEq}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelEqAdapter() {
		if (relEqItemProvider == null) {
			relEqItemProvider = new RelEqItemProvider(this);
		}

		return relEqItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.RelLt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelLtItemProvider relLtItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.RelLt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelLtAdapter() {
		if (relLtItemProvider == null) {
			relLtItemProvider = new RelLtItemProvider(this);
		}

		return relLtItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.RelGt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelGtItemProvider relGtItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.RelGt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelGtAdapter() {
		if (relGtItemProvider == null) {
			relGtItemProvider = new RelGtItemProvider(this);
		}

		return relGtItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.Plus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlusItemProvider plusItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.Plus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlusAdapter() {
		if (plusItemProvider == null) {
			plusItemProvider = new PlusItemProvider(this);
		}

		return plusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.Minus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinusItemProvider minusItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.Minus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMinusAdapter() {
		if (minusItemProvider == null) {
			minusItemProvider = new MinusItemProvider(this);
		}

		return minusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.Multi} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiItemProvider multiItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.Multi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiAdapter() {
		if (multiItemProvider == null) {
			multiItemProvider = new MultiItemProvider(this);
		}

		return multiItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.Div} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivItemProvider divItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.Div}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDivAdapter() {
		if (divItemProvider == null) {
			divItemProvider = new DivItemProvider(this);
		}

		return divItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.Pow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowItemProvider powItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.Pow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPowAdapter() {
		if (powItemProvider == null) {
			powItemProvider = new PowItemProvider(this);
		}

		return powItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.IntLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntLiteralItemProvider intLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.IntLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntLiteralAdapter() {
		if (intLiteralItemProvider == null) {
			intLiteralItemProvider = new IntLiteralItemProvider(this);
		}

		return intLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argument.argument.BooleanLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanLiteralItemProvider booleanLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link argument.argument.BooleanLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanLiteralAdapter() {
		if (booleanLiteralItemProvider == null) {
			booleanLiteralItemProvider = new BooleanLiteralItemProvider(this);
		}

		return booleanLiteralItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (argumentDiagramItemProvider != null) argumentDiagramItemProvider.dispose();
		if (linkItemProvider != null) linkItemProvider.dispose();
		if (rebutsItemProvider != null) rebutsItemProvider.dispose();
		if (mitigatesItemProvider != null) mitigatesItemProvider.dispose();
		if (argumentItemProvider != null) argumentItemProvider.dispose();
		if (expressionItemProvider != null) expressionItemProvider.dispose();
		if (assignmentOpItemProvider != null) assignmentOpItemProvider.dispose();
		if (orExpItemProvider != null) orExpItemProvider.dispose();
		if (andExpItemProvider != null) andExpItemProvider.dispose();
		if (relationalItemProvider != null) relationalItemProvider.dispose();
		if (additionItemProvider != null) additionItemProvider.dispose();
		if (multiplicationItemProvider != null) multiplicationItemProvider.dispose();
		if (powerItemProvider != null) powerItemProvider.dispose();
		if (unaryExprItemProvider != null) unaryExprItemProvider.dispose();
		if (prePrimaryExprItemProvider != null) prePrimaryExprItemProvider.dispose();
		if (terminalExpressionItemProvider != null) terminalExpressionItemProvider.dispose();
		if (assignPlusItemProvider != null) assignPlusItemProvider.dispose();
		if (assignMinItemProvider != null) assignMinItemProvider.dispose();
		if (orItemProvider != null) orItemProvider.dispose();
		if (andItemProvider != null) andItemProvider.dispose();
		if (relNotEqItemProvider != null) relNotEqItemProvider.dispose();
		if (relEqEqItemProvider != null) relEqEqItemProvider.dispose();
		if (relLtEqItemProvider != null) relLtEqItemProvider.dispose();
		if (relGtEqItemProvider != null) relGtEqItemProvider.dispose();
		if (relEqItemProvider != null) relEqItemProvider.dispose();
		if (relLtItemProvider != null) relLtItemProvider.dispose();
		if (relGtItemProvider != null) relGtItemProvider.dispose();
		if (plusItemProvider != null) plusItemProvider.dispose();
		if (minusItemProvider != null) minusItemProvider.dispose();
		if (multiItemProvider != null) multiItemProvider.dispose();
		if (divItemProvider != null) divItemProvider.dispose();
		if (powItemProvider != null) powItemProvider.dispose();
		if (intLiteralItemProvider != null) intLiteralItemProvider.dispose();
		if (booleanLiteralItemProvider != null) booleanLiteralItemProvider.dispose();
	}

}
