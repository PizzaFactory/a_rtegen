/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SenderReceiverToSignalGroupMapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SenderReceiverToSignalGroupMappingItemProvider extends DataMappingItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverToSignalGroupMappingItemProvider(AdapterFactory adapterFactory) {
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

			addSignalGroupPropertyDescriptor(object);
			addDataElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Signal Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignalGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SenderReceiverToSignalGroupMapping_signalGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SenderReceiverToSignalGroupMapping_signalGroup_feature", "_UI_SenderReceiverToSignalGroupMapping_type"),
				 M2Package.Literals.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__SIGNAL_GROUP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SenderReceiverToSignalGroupMapping_dataElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SenderReceiverToSignalGroupMapping_dataElement_feature", "_UI_SenderReceiverToSignalGroupMapping_type"),
				 M2Package.Literals.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(M2Package.Literals.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF);
			childrenFeatures.add(M2Package.Literals.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING);
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
	 * This returns SenderReceiverToSignalGroupMapping.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SenderReceiverToSignalGroupMapping"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_SenderReceiverToSignalGroupMapping_type");
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

		switch (notification.getFeatureID(SenderReceiverToSignalGroupMapping.class)) {
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF:
			case M2Package.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING:
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
				(M2Package.Literals.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__DATA_ELEMENT_IREF,
				 M2Factory.eINSTANCE.createVariableDataPrototypeInSystemInstanceRef()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING,
				 M2Factory.eINSTANCE.createSenderRecRecordTypeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SENDER_RECEIVER_TO_SIGNAL_GROUP_MAPPING__TYPE_MAPPING,
				 M2Factory.eINSTANCE.createSenderRecArrayTypeMapping()));
	}

}
