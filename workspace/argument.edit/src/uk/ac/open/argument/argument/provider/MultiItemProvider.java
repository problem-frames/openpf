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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.open.argument.argument.ArgumentFactory;
import uk.ac.open.argument.argument.ArgumentPackage;
import uk.ac.open.argument.argument.Multi;
import uk.ac.open.argument.argument.UnaryOp;

/**
 * This is the item provider adapter for a {@link uk.ac.open.argument.argument.Multi} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiItemProvider
	extends ExpressionItemProvider
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
	public MultiItemProvider(AdapterFactory adapterFactory) {
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

			addMul_opPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mul op feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMul_opPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Multi_mul_op_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Multi_mul_op_feature", "_UI_Multi_type"),
				 ArgumentPackage.Literals.MULTI__MUL_OP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ArgumentPackage.Literals.MULTI__LEFT);
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
	 * This returns Multi.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Multi"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		UnaryOp labelValue = ((Multi)object).getUop();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Multi_type") :
			getString("_UI_Multi_type") + " " + label;
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

		switch (notification.getFeatureID(Multi.class)) {
			case ArgumentPackage.MULTI__MUL_OP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ArgumentPackage.MULTI__LEFT:
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
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createTerminalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createAssignPlus()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createAssignMin()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createRelNotEq()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createRelEqEq()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createRelLtEq()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createRelGtEq()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createRelEq()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createRelLt()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createRelGt()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createMulti()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createPow()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
				 ArgumentFactory.eINSTANCE.createIntLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentPackage.Literals.MULTI__LEFT,
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
			childFeature == ArgumentPackage.Literals.EXPRESSION__RIGHT ||
			childFeature == ArgumentPackage.Literals.MULTI__LEFT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
