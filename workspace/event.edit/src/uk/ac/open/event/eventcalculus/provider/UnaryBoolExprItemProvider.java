/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.open.event.eventcalculus.provider;


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

import uk.ac.open.event.eventcalculus.EventcalculusFactory;
import uk.ac.open.event.eventcalculus.EventcalculusPackage;
import uk.ac.open.event.eventcalculus.UnaryBoolExpr;
import uk.ac.open.event.eventcalculus.UnaryBoolOp;

/**
 * This is the item provider adapter for a {@link uk.ac.open.event.eventcalculus.UnaryBoolExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryBoolExprItemProvider
	extends BoolExprItemProvider
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
	public UnaryBoolExprItemProvider(AdapterFactory adapterFactory) {
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

			addUnaryop_lhsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Unaryop lhs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnaryop_lhsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryBoolExpr_unaryop_lhs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryBoolExpr_unaryop_lhs_feature", "_UI_UnaryBoolExpr_type"),
				 EventcalculusPackage.Literals.UNARY_BOOL_EXPR__UNARYOP_LHS,
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
			childrenFeatures.add(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPR);
			childrenFeatures.add(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPS);
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
	 * This returns UnaryBoolExpr.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnaryBoolExpr"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		UnaryBoolOp labelValue = ((UnaryBoolExpr)object).getUnaryop_lhs();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_UnaryBoolExpr_type") :
			getString("_UI_UnaryBoolExpr_type") + " " + label;
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

		switch (notification.getFeatureID(UnaryBoolExpr.class)) {
			case EventcalculusPackage.UNARY_BOOL_EXPR__UNARYOP_LHS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EventcalculusPackage.UNARY_BOOL_EXPR__OPR:
			case EventcalculusPackage.UNARY_BOOL_EXPR__OPS:
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
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPR,
				 EventcalculusFactory.eINSTANCE.createBoolExpr()));

		newChildDescriptors.add
			(createChildParameter
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPR,
				 EventcalculusFactory.eINSTANCE.createTemporalPredicate()));

		newChildDescriptors.add
			(createChildParameter
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPR,
				 EventcalculusFactory.eINSTANCE.createUnaryBoolExpr()));

		newChildDescriptors.add
			(createChildParameter
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPR,
				 EventcalculusFactory.eINSTANCE.createBinaryBoolExpr()));

		newChildDescriptors.add
			(createChildParameter
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPR,
				 EventcalculusFactory.eINSTANCE.createHoldsAt()));

		newChildDescriptors.add
			(createChildParameter
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPR,
				 EventcalculusFactory.eINSTANCE.createHappens()));

		newChildDescriptors.add
			(createChildParameter
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPR,
				 EventcalculusFactory.eINSTANCE.createInitiates()));

		newChildDescriptors.add
			(createChildParameter
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPR,
				 EventcalculusFactory.eINSTANCE.createTerminates()));

		newChildDescriptors.add
			(createChildParameter
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPS,
				 EventcalculusFactory.eINSTANCE.createBoolExpr()));

		newChildDescriptors.add
			(createChildParameter
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPS,
				 EventcalculusFactory.eINSTANCE.createTemporalPredicate()));

		newChildDescriptors.add
			(createChildParameter
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPS,
				 EventcalculusFactory.eINSTANCE.createUnaryBoolExpr()));

		newChildDescriptors.add
			(createChildParameter
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPS,
				 EventcalculusFactory.eINSTANCE.createBinaryBoolExpr()));

		newChildDescriptors.add
			(createChildParameter
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPS,
				 EventcalculusFactory.eINSTANCE.createHoldsAt()));

		newChildDescriptors.add
			(createChildParameter
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPS,
				 EventcalculusFactory.eINSTANCE.createHappens()));

		newChildDescriptors.add
			(createChildParameter
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPS,
				 EventcalculusFactory.eINSTANCE.createInitiates()));

		newChildDescriptors.add
			(createChildParameter
				(EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPS,
				 EventcalculusFactory.eINSTANCE.createTerminates()));
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
			childFeature == EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPR ||
			childFeature == EventcalculusPackage.Literals.UNARY_BOOL_EXPR__OPS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
