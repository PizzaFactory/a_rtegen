/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteEventToTaskMapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RteEventToTaskMappingItemProvider extends EcucContainerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteEventToTaskMappingItemProvider(AdapterFactory adapterFactory) {
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

			addRteEventPropertyDescriptor(object);
			addRteActivationOffsetPropertyDescriptor(object);
			addRteMappedToTaskPropertyDescriptor(object);
			addRtePositionInTaskPropertyDescriptor(object);
			addRteUsedOsAlarmPropertyDescriptor(object);
			addRteUsedOsEventPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Rte Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRteEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteEventToTaskMapping_rteEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RteEventToTaskMapping_rteEvent_feature", "_UI_RteEventToTaskMapping_type"),
				 EcucPackage.Literals.RTE_EVENT_TO_TASK_MAPPING__RTE_EVENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rte Activation Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRteActivationOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteEventToTaskMapping_rteActivationOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RteEventToTaskMapping_rteActivationOffset_feature", "_UI_RteEventToTaskMapping_type"),
				 EcucPackage.Literals.RTE_EVENT_TO_TASK_MAPPING__RTE_ACTIVATION_OFFSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rte Mapped To Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRteMappedToTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteEventToTaskMapping_rteMappedToTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RteEventToTaskMapping_rteMappedToTask_feature", "_UI_RteEventToTaskMapping_type"),
				 EcucPackage.Literals.RTE_EVENT_TO_TASK_MAPPING__RTE_MAPPED_TO_TASK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rte Position In Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRtePositionInTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteEventToTaskMapping_rtePositionInTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RteEventToTaskMapping_rtePositionInTask_feature", "_UI_RteEventToTaskMapping_type"),
				 EcucPackage.Literals.RTE_EVENT_TO_TASK_MAPPING__RTE_POSITION_IN_TASK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rte Used Os Alarm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRteUsedOsAlarmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteEventToTaskMapping_rteUsedOsAlarm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RteEventToTaskMapping_rteUsedOsAlarm_feature", "_UI_RteEventToTaskMapping_type"),
				 EcucPackage.Literals.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_ALARM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rte Used Os Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRteUsedOsEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteEventToTaskMapping_rteUsedOsEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RteEventToTaskMapping_rteUsedOsEvent_feature", "_UI_RteEventToTaskMapping_type"),
				 EcucPackage.Literals.RTE_EVENT_TO_TASK_MAPPING__RTE_USED_OS_EVENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns RteEventToTaskMapping.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RteEventToTaskMapping"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RteEventToTaskMapping)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_RteEventToTaskMapping_type") :
			getString("_UI_RteEventToTaskMapping_type") + " " + label;
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

		switch (notification.getFeatureID(RteEventToTaskMapping.class)) {
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_ACTIVATION_OFFSET:
			case EcucPackage.RTE_EVENT_TO_TASK_MAPPING__RTE_POSITION_IN_TASK:
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
