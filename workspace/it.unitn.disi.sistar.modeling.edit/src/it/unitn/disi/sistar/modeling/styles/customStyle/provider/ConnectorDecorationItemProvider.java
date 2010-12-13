/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConnectorDecorationItemProvider.java,v 1.1.1.1 2007/06/25 21:37:06 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.styles.customStyle.provider;


import it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage;
import it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
 * This is the item provider adapter for a {@link it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorDecorationItemProvider
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
	public ConnectorDecorationItemProvider(AdapterFactory adapterFactory) {
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

			addDecorationSourcePropertyDescriptor(object);
			addDecorationMiddlePropertyDescriptor(object);
			addDecorationTargetPropertyDescriptor(object);
			addDecorationMiddleTextPropertyDescriptor(object);
			addConnectionLineStylePropertyDescriptor(object);
			addTextSourcePropertyDescriptor(object);
			addTextMiddlePropertyDescriptor(object);
			addTextTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Decoration Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecorationSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorDecoration_decorationSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorDecoration_decorationSource_feature", "_UI_ConnectorDecoration_type"),
				 CustomStylePackage.Literals.CONNECTOR_DECORATION__DECORATION_SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decoration Middle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecorationMiddlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorDecoration_decorationMiddle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorDecoration_decorationMiddle_feature", "_UI_ConnectorDecoration_type"),
				 CustomStylePackage.Literals.CONNECTOR_DECORATION__DECORATION_MIDDLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decoration Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecorationTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorDecoration_decorationTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorDecoration_decorationTarget_feature", "_UI_ConnectorDecoration_type"),
				 CustomStylePackage.Literals.CONNECTOR_DECORATION__DECORATION_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decoration Middle Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecorationMiddleTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorDecoration_decorationMiddleText_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorDecoration_decorationMiddleText_feature", "_UI_ConnectorDecoration_type"),
				 CustomStylePackage.Literals.CONNECTOR_DECORATION__DECORATION_MIDDLE_TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connection Line Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionLineStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorDecoration_connectionLineStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorDecoration_connectionLineStyle_feature", "_UI_ConnectorDecoration_type"),
				 CustomStylePackage.Literals.CONNECTOR_DECORATION__CONNECTION_LINE_STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorDecoration_textSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorDecoration_textSource_feature", "_UI_ConnectorDecoration_type"),
				 CustomStylePackage.Literals.CONNECTOR_DECORATION__TEXT_SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Middle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextMiddlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorDecoration_textMiddle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorDecoration_textMiddle_feature", "_UI_ConnectorDecoration_type"),
				 CustomStylePackage.Literals.CONNECTOR_DECORATION__TEXT_MIDDLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorDecoration_textTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorDecoration_textTarget_feature", "_UI_ConnectorDecoration_type"),
				 CustomStylePackage.Literals.CONNECTOR_DECORATION__TEXT_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ConnectorDecoration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConnectorDecoration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		EEndDecorationType labelValue = ((ConnectorDecoration)object).getDecorationSource();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ConnectorDecoration_type") :
			getString("_UI_ConnectorDecoration_type") + " " + label;
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

		switch (notification.getFeatureID(ConnectorDecoration.class)) {
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_SOURCE:
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_MIDDLE:
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_TARGET:
			case CustomStylePackage.CONNECTOR_DECORATION__DECORATION_MIDDLE_TEXT:
			case CustomStylePackage.CONNECTOR_DECORATION__CONNECTION_LINE_STYLE:
			case CustomStylePackage.CONNECTOR_DECORATION__TEXT_SOURCE:
			case CustomStylePackage.CONNECTOR_DECORATION__TEXT_MIDDLE:
			case CustomStylePackage.CONNECTOR_DECORATION__TEXT_TARGET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return StyleEditPlugin.INSTANCE;
	}

}
