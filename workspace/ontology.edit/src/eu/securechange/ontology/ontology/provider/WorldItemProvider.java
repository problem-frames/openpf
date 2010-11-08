/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package eu.securechange.ontology.ontology.provider;


import eu.securechange.ontology.ontology.OntologyFactory;
import eu.securechange.ontology.ontology.OntologyPackage;
import eu.securechange.ontology.ontology.World;

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

/**
 * This is the item provider adapter for a {@link eu.securechange.ontology.ontology.World} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorldItemProvider
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
	public WorldItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(OntologyPackage.Literals.WORLD__ENTITIES);
			childrenFeatures.add(OntologyPackage.Literals.WORLD__DOMAINS);
			childrenFeatures.add(OntologyPackage.Literals.WORLD__RELATIONSHIPS);
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
	 * This returns World.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/World"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_World_type");
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

		switch (notification.getFeatureID(World.class)) {
			case OntologyPackage.WORLD__ENTITIES:
			case OntologyPackage.WORLD__DOMAINS:
			case OntologyPackage.WORLD__RELATIONSHIPS:
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
				(OntologyPackage.Literals.WORLD__ENTITIES,
				 OntologyFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__ENTITIES,
				 OntologyFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__ENTITIES,
				 OntologyFactory.eINSTANCE.createStakeholder()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__ENTITIES,
				 OntologyFactory.eINSTANCE.createAttacker()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__ENTITIES,
				 OntologyFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__ENTITIES,
				 OntologyFactory.eINSTANCE.createNaturalProcess()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__ENTITIES,
				 OntologyFactory.eINSTANCE.createHumanActivity()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__ENTITIES,
				 OntologyFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__ENTITIES,
				 OntologyFactory.eINSTANCE.createAsset()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__ENTITIES,
				 OntologyFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__DOMAINS,
				 OntologyFactory.eINSTANCE.createDomain()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__RELATIONSHIPS,
				 OntologyFactory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__RELATIONSHIPS,
				 OntologyFactory.eINSTANCE.createWants()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__RELATIONSHIPS,
				 OntologyFactory.eINSTANCE.createDoes()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__RELATIONSHIPS,
				 OntologyFactory.eINSTANCE.createDecomposes()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__RELATIONSHIPS,
				 OntologyFactory.eINSTANCE.createTrusts()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__RELATIONSHIPS,
				 OntologyFactory.eINSTANCE.createDelegates()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__RELATIONSHIPS,
				 OntologyFactory.eINSTANCE.createContributes()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__RELATIONSHIPS,
				 OntologyFactory.eINSTANCE.createFulfils()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__RELATIONSHIPS,
				 OntologyFactory.eINSTANCE.createProvides()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__RELATIONSHIPS,
				 OntologyFactory.eINSTANCE.createConsumes()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__RELATIONSHIPS,
				 OntologyFactory.eINSTANCE.createExploits()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__RELATIONSHIPS,
				 OntologyFactory.eINSTANCE.createDamages()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__RELATIONSHIPS,
				 OntologyFactory.eINSTANCE.createAttacks()));

		newChildDescriptors.add
			(createChildParameter
				(OntologyPackage.Literals.WORLD__RELATIONSHIPS,
				 OntologyFactory.eINSTANCE.createArgues()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OntologyEditPlugin.INSTANCE;
	}

}
