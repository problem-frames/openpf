/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace.provider;


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

import org.w3.namespace.Connector;
import org.w3.namespace.NamespaceFactory;
import org.w3.namespace.NamespacePackage;

/**
 * This is the item provider adapter for a {@link org.w3.namespace.Connector} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorItemProvider
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
	public ConnectorItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connector_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connector_id_feature", "_UI_Connector_type"),
				 NamespacePackage.Literals.CONNECTOR__ID,
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
			childrenFeatures.add(NamespacePackage.Literals.CONNECTOR__REQUISITE_CONNECTOR);
			childrenFeatures.add(NamespacePackage.Literals.CONNECTOR__SIMPLE_REQUISITE_CONNECTOR);
			childrenFeatures.add(NamespacePackage.Literals.CONNECTOR__SUBSTEP_CONNECTOR);
			childrenFeatures.add(NamespacePackage.Literals.CONNECTOR__REACTION_CONNECTOR);
			childrenFeatures.add(NamespacePackage.Literals.CONNECTOR__HANDLER_CONNECTOR);
			childrenFeatures.add(NamespacePackage.Literals.CONNECTOR__BINDING);
			childrenFeatures.add(NamespacePackage.Literals.CONNECTOR__STEP_DECLARATION);
			childrenFeatures.add(NamespacePackage.Literals.CONNECTOR__STEP_REFERENCE);
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
	 * This returns Connector.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Connector"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Connector)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Connector_type") :
			getString("_UI_Connector_type") + " " + label;
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

		switch (notification.getFeatureID(Connector.class)) {
			case NamespacePackage.CONNECTOR__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case NamespacePackage.CONNECTOR__REQUISITE_CONNECTOR:
			case NamespacePackage.CONNECTOR__SIMPLE_REQUISITE_CONNECTOR:
			case NamespacePackage.CONNECTOR__SUBSTEP_CONNECTOR:
			case NamespacePackage.CONNECTOR__REACTION_CONNECTOR:
			case NamespacePackage.CONNECTOR__HANDLER_CONNECTOR:
			case NamespacePackage.CONNECTOR__BINDING:
			case NamespacePackage.CONNECTOR__STEP_DECLARATION:
			case NamespacePackage.CONNECTOR__STEP_REFERENCE:
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
				(NamespacePackage.Literals.CONNECTOR__REQUISITE_CONNECTOR,
				 NamespaceFactory.eINSTANCE.createRequisiteConnector()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.CONNECTOR__SIMPLE_REQUISITE_CONNECTOR,
				 NamespaceFactory.eINSTANCE.createSimpleRequisiteConnector()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.CONNECTOR__SUBSTEP_CONNECTOR,
				 NamespaceFactory.eINSTANCE.createSubstepConnector()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.CONNECTOR__REACTION_CONNECTOR,
				 NamespaceFactory.eINSTANCE.createReactionConnector()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.CONNECTOR__HANDLER_CONNECTOR,
				 NamespaceFactory.eINSTANCE.createHandlerConnector()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.CONNECTOR__BINDING,
				 NamespaceFactory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.CONNECTOR__STEP_DECLARATION,
				 NamespaceFactory.eINSTANCE.createStepDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.CONNECTOR__STEP_REFERENCE,
				 NamespaceFactory.eINSTANCE.createStepReference()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LittlejilEditPlugin.INSTANCE;
	}

}
