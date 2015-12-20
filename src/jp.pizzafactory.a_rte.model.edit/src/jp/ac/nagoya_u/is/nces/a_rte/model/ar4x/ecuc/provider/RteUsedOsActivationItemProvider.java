/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteUsedOsActivation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RteUsedOsActivationItemProvider extends EcucContainerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteUsedOsActivationItemProvider(AdapterFactory adapterFactory) {
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

			addRteExpectedTickDurationPropertyDescriptor(object);
			addRteExpectedActivationOffsetPropertyDescriptor(object);
			addRteActivationOsAlarmPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Rte Expected Tick Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRteExpectedTickDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteUsedOsActivation_rteExpectedTickDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RteUsedOsActivation_rteExpectedTickDuration_feature", "_UI_RteUsedOsActivation_type"),
				 EcucPackage.Literals.RTE_USED_OS_ACTIVATION__RTE_EXPECTED_TICK_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rte Expected Activation Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRteExpectedActivationOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteUsedOsActivation_rteExpectedActivationOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RteUsedOsActivation_rteExpectedActivationOffset_feature", "_UI_RteUsedOsActivation_type"),
				 EcucPackage.Literals.RTE_USED_OS_ACTIVATION__RTE_EXPECTED_ACTIVATION_OFFSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rte Activation Os Alarm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRteActivationOsAlarmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteUsedOsActivation_rteActivationOsAlarm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RteUsedOsActivation_rteActivationOsAlarm_feature", "_UI_RteUsedOsActivation_type"),
				 EcucPackage.Literals.RTE_USED_OS_ACTIVATION__RTE_ACTIVATION_OS_ALARM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns RteUsedOsActivation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RteUsedOsActivation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RteUsedOsActivation)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_RteUsedOsActivation_type") :
			getString("_UI_RteUsedOsActivation_type") + " " + label;
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

		switch (notification.getFeatureID(RteUsedOsActivation.class)) {
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_EXPECTED_TICK_DURATION:
			case EcucPackage.RTE_USED_OS_ACTIVATION__RTE_EXPECTED_ACTIVATION_OFFSET:
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
