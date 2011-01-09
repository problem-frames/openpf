/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.open.argument.argument.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.open.argument.argument.ArgumentFactory;
import uk.ac.open.argument.argument.ArgumentPackage;
import uk.ac.open.argument.argument.Expression;
import uk.ac.open.argument.argument.UnaryOp;

/**
 * This is the item provider adapter for a {@link uk.ac.open.argument.argument.Expression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addUopPropertyDescriptor(object);
			addNPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Expression_uop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Expression_uop_feature", "_UI_Expression_type"),
				 ArgumentPackage.Literals.EXPRESSION__UOP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the N feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Expression_n_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Expression_n_feature", "_UI_Expression_type"),
				 ArgumentPackage.Literals.EXPRESSION__N,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ArgumentPackage.Literals.EXPRESSION__ASSIGN);
			childrenFeatures.add(ArgumentPackage.Literals.EXPRESSION__RIGHT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Expression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Expression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		UnaryOp labelValue = ((Expression)object).getUop();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Expression_type") :
			getString("_UI_Expression_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Expression.class)) {
			case ArgumentPackage.EXPRESSION__UOP:
			case ArgumentPackage.EXPRESSION__N:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ArgumentPackage.EXPRESSION__ASSIGN:
			case ArgumentPackage.EXPRESSION__RIGHT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createTerminalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createAssignPlus()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createAssignMin()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createRelNotEq()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createRelEqEq()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createRelLtEq()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createRelGtEq()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createRelEq()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createRelLt()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createRelGt()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createMulti()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createPow()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createIntLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__ASSIGN,
				 ArgumentFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createTerminalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createAssignPlus()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createAssignMin()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createRelNotEq()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createRelEqEq()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createRelLtEq()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createRelGtEq()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createRelEq()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createRelLt()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createRelGt()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createMulti()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createPow()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createIntLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.EXPRESSION__RIGHT,
				 ArgumentFactory.eINSTANCE.createBooleanLiteral()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ArgumentPackage.Literals.EXPRESSION__ASSIGN ||
			childFeature == ArgumentPackage.Literals.EXPRESSION__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ArgumentEditPlugin.INSTANCE;
	}

}
