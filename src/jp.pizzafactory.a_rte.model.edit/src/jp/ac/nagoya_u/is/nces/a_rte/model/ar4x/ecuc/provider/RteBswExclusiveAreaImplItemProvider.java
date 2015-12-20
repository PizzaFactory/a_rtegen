/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RteBswExclusiveAreaImplItemProvider extends EcucContainerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBswExclusiveAreaImplItemProvider(AdapterFactory adapterFactory) {
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

			addRteBswExclusiveAreaPropertyDescriptor(object);
			addRteBswExclusiveAreaOsResourcePropertyDescriptor(object);
			addRteExclusiveAreaImplMechanismPropertyDescriptor(object);
			addRteBswExclusiveAreaOsSpinlockPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Rte Bsw Exclusive Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRteBswExclusiveAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteBswExclusiveAreaImpl_rteBswExclusiveArea_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RteBswExclusiveAreaImpl_rteBswExclusiveArea_feature", "_UI_RteBswExclusiveAreaImpl_type"),
				 EcucPackage.Literals.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rte Bsw Exclusive Area Os Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRteBswExclusiveAreaOsResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteBswExclusiveAreaImpl_rteBswExclusiveAreaOsResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RteBswExclusiveAreaImpl_rteBswExclusiveAreaOsResource_feature", "_UI_RteBswExclusiveAreaImpl_type"),
				 EcucPackage.Literals.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_RESOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rte Exclusive Area Impl Mechanism feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRteExclusiveAreaImplMechanismPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteBswExclusiveAreaImpl_rteExclusiveAreaImplMechanism_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RteBswExclusiveAreaImpl_rteExclusiveAreaImplMechanism_feature", "_UI_RteBswExclusiveAreaImpl_type"),
				 EcucPackage.Literals.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rte Bsw Exclusive Area Os Spinlock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRteBswExclusiveAreaOsSpinlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteBswExclusiveAreaImpl_rteBswExclusiveAreaOsSpinlock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RteBswExclusiveAreaImpl_rteBswExclusiveAreaOsSpinlock_feature", "_UI_RteBswExclusiveAreaImpl_type"),
				 EcucPackage.Literals.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA_OS_SPINLOCK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns RteBswExclusiveAreaImpl.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RteBswExclusiveAreaImpl"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RteBswExclusiveAreaImpl)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_RteBswExclusiveAreaImpl_type") :
			getString("_UI_RteBswExclusiveAreaImpl_type") + " " + label;
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

		switch (notification.getFeatureID(RteBswExclusiveAreaImpl.class)) {
			case EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_EXCLUSIVE_AREA_IMPL_MECHANISM:
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
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
