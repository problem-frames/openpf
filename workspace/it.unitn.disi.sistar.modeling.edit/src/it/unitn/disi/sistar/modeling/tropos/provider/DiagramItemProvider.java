/**
 * <copyright>
 * </copyright>
 *
 * $Id: DiagramItemProvider.java,v 1.1.1.1 2007/06/12 20:10:13 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos.provider;


import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.TroposFactory;
import it.unitn.disi.sistar.modeling.tropos.TroposPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.unitn.disi.sistar.modeling.tropos.Diagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramItemProvider
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
	public DiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTitlePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diagram_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diagram_title_feature", "_UI_Diagram_type"),
				 TroposPackage.Literals.DIAGRAM__TITLE,
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
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TroposPackage.Literals.DIAGRAM__OBJECT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Diagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Diagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Diagram)object).getTitle();
		return label == null || label.length() == 0 ?
			getString("_UI_Diagram_type") :
			getString("_UI_Diagram_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Diagram.class)) {
			case TroposPackage.DIAGRAM__TITLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TroposPackage.DIAGRAM__OBJECT:
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
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TroposPackage.Literals.DIAGRAM__OBJECT,
				 TroposFactory.eINSTANCE.createGraphicalObject()));

		newChildDescriptors.add
			(createChildParameter
				(TroposPackage.Literals.DIAGRAM__OBJECT,
				 TroposFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(TroposPackage.Literals.DIAGRAM__OBJECT,
				 TroposFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(TroposPackage.Literals.DIAGRAM__OBJECT,
				 TroposFactory.eINSTANCE.createRelation()));

		newChildDescriptors.add
			(createChildParameter
				(TroposPackage.Literals.DIAGRAM__OBJECT,
				 TroposFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(TroposPackage.Literals.DIAGRAM__OBJECT,
				 TroposFactory.eINSTANCE.createComposition()));

		newChildDescriptors.add
			(createChildParameter
				(TroposPackage.Literals.DIAGRAM__OBJECT,
				 TroposFactory.eINSTANCE.createContribution()));

		newChildDescriptors.add
			(createChildParameter
				(TroposPackage.Literals.DIAGRAM__OBJECT,
				 TroposFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(TroposPackage.Literals.DIAGRAM__OBJECT,
				 TroposFactory.eINSTANCE.createOwnership()));

		newChildDescriptors.add
			(createChildParameter
				(TroposPackage.Literals.DIAGRAM__OBJECT,
				 TroposFactory.eINSTANCE.createMeansEnd()));

		newChildDescriptors.add
			(createChildParameter
				(TroposPackage.Literals.DIAGRAM__OBJECT,
				 TroposFactory.eINSTANCE.createCustomRelation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return TroposEditPlugin.INSTANCE;
	}

}