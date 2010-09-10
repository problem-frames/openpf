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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.w3.namespace.DocumentRoot;
import org.w3.namespace.NamespaceFactory;
import org.w3.namespace.NamespacePackage;

/**
 * This is the item provider adapter for a {@link org.w3.namespace.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__ABORTER);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__AGGREGATE);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__ANNOTATION);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__BINDING);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__CARDINALITY);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__CHANNEL_BINDING);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__CONNECTOR);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__CONSTANT_BINDING);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__CONTROL_PARAMETER);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__DIAGRAM);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__EXPORT);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__EXTERNAL_OBJECT);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__FIELD);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__HANDLER_CONNECTOR);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__IMPORT);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__INTERFACE_DECL);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__LITTLEJIL);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__LOCATION);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__METADATA);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__MODULE);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__NULL_AGGREGATE);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__POST_IT);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__PREDICATE_EXPRESSION);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__REACTION_CONNECTOR);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__REQUISITE_CONNECTOR);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__SCOPE_BINDING);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__SIMPLE_REQUISITE_CONNECTOR);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__STEP_DECLARATION);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__STEP_REFERENCE);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__SUBSTEP_CONNECTOR);
			childrenFeatures.add(NamespacePackage.Literals.DOCUMENT_ROOT__TAGGED_LOCATION);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case NamespacePackage.DOCUMENT_ROOT__ABORTER:
			case NamespacePackage.DOCUMENT_ROOT__AGGREGATE:
			case NamespacePackage.DOCUMENT_ROOT__ANNOTATION:
			case NamespacePackage.DOCUMENT_ROOT__BINDING:
			case NamespacePackage.DOCUMENT_ROOT__CARDINALITY:
			case NamespacePackage.DOCUMENT_ROOT__CHANNEL_BINDING:
			case NamespacePackage.DOCUMENT_ROOT__CONNECTOR:
			case NamespacePackage.DOCUMENT_ROOT__CONSTANT_BINDING:
			case NamespacePackage.DOCUMENT_ROOT__CONTROL_PARAMETER:
			case NamespacePackage.DOCUMENT_ROOT__DIAGRAM:
			case NamespacePackage.DOCUMENT_ROOT__EXPORT:
			case NamespacePackage.DOCUMENT_ROOT__EXTERNAL_OBJECT:
			case NamespacePackage.DOCUMENT_ROOT__FIELD:
			case NamespacePackage.DOCUMENT_ROOT__HANDLER_CONNECTOR:
			case NamespacePackage.DOCUMENT_ROOT__IMPORT:
			case NamespacePackage.DOCUMENT_ROOT__INTERFACE_DECL:
			case NamespacePackage.DOCUMENT_ROOT__LITTLEJIL:
			case NamespacePackage.DOCUMENT_ROOT__LOCATION:
			case NamespacePackage.DOCUMENT_ROOT__METADATA:
			case NamespacePackage.DOCUMENT_ROOT__MODULE:
			case NamespacePackage.DOCUMENT_ROOT__NULL_AGGREGATE:
			case NamespacePackage.DOCUMENT_ROOT__POST_IT:
			case NamespacePackage.DOCUMENT_ROOT__PREDICATE_EXPRESSION:
			case NamespacePackage.DOCUMENT_ROOT__REACTION_CONNECTOR:
			case NamespacePackage.DOCUMENT_ROOT__REQUISITE_CONNECTOR:
			case NamespacePackage.DOCUMENT_ROOT__SCOPE_BINDING:
			case NamespacePackage.DOCUMENT_ROOT__SIMPLE_REQUISITE_CONNECTOR:
			case NamespacePackage.DOCUMENT_ROOT__STEP_DECLARATION:
			case NamespacePackage.DOCUMENT_ROOT__STEP_REFERENCE:
			case NamespacePackage.DOCUMENT_ROOT__SUBSTEP_CONNECTOR:
			case NamespacePackage.DOCUMENT_ROOT__TAGGED_LOCATION:
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
				(NamespacePackage.Literals.DOCUMENT_ROOT__ABORTER,
				 NamespaceFactory.eINSTANCE.createAborter()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__AGGREGATE,
				 NamespaceFactory.eINSTANCE.createAggregate()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__ANNOTATION,
				 NamespaceFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__BINDING,
				 NamespaceFactory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__CARDINALITY,
				 NamespaceFactory.eINSTANCE.createCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__CHANNEL_BINDING,
				 NamespaceFactory.eINSTANCE.createChannelBinding()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__CONNECTOR,
				 NamespaceFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__CONSTANT_BINDING,
				 NamespaceFactory.eINSTANCE.createConstantBinding()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__CONTROL_PARAMETER,
				 NamespaceFactory.eINSTANCE.createControlParameter()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__DIAGRAM,
				 NamespaceFactory.eINSTANCE.createDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__EXPORT,
				 NamespaceFactory.eINSTANCE.createExport()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__EXTERNAL_OBJECT,
				 NamespaceFactory.eINSTANCE.createExternalObject()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__FIELD,
				 NamespaceFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__HANDLER_CONNECTOR,
				 NamespaceFactory.eINSTANCE.createHandlerConnector()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__IMPORT,
				 NamespaceFactory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__INTERFACE_DECL,
				 NamespaceFactory.eINSTANCE.createInterfaceDecl()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__LITTLEJIL,
				 NamespaceFactory.eINSTANCE.createLittlejil()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__LOCATION,
				 NamespaceFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__METADATA,
				 NamespaceFactory.eINSTANCE.createMetadata()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__MODULE,
				 NamespaceFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__NULL_AGGREGATE,
				 NamespaceFactory.eINSTANCE.createNullAggregate()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__POST_IT,
				 NamespaceFactory.eINSTANCE.createPostIt()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__PREDICATE_EXPRESSION,
				 NamespaceFactory.eINSTANCE.createPredicateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__REACTION_CONNECTOR,
				 NamespaceFactory.eINSTANCE.createReactionConnector()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__REQUISITE_CONNECTOR,
				 NamespaceFactory.eINSTANCE.createRequisiteConnector()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__SCOPE_BINDING,
				 NamespaceFactory.eINSTANCE.createScopeBinding()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__SIMPLE_REQUISITE_CONNECTOR,
				 NamespaceFactory.eINSTANCE.createSimpleRequisiteConnector()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__STEP_DECLARATION,
				 NamespaceFactory.eINSTANCE.createStepDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__STEP_REFERENCE,
				 NamespaceFactory.eINSTANCE.createStepReference()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__SUBSTEP_CONNECTOR,
				 NamespaceFactory.eINSTANCE.createSubstepConnector()));

		newChildDescriptors.add
			(createChildParameter
				(NamespacePackage.Literals.DOCUMENT_ROOT__TAGGED_LOCATION,
				 NamespaceFactory.eINSTANCE.createTaggedLocation()));
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
