/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PartitionItemProvider extends LogicalCompartmentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionItemProvider(AdapterFactory adapterFactory) {
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

			addIsBswPartitionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Bsw Partition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsBswPartitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Partition_isBswPartition_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Partition_isBswPartition_feature", "_UI_Partition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModulePackage.Literals.PARTITION__IS_BSW_PARTITION,
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
			childrenFeatures.add(ModulePackage.Literals.PARTITION__SWC);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__PARTED_BSWM);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__OS_TRUSTED_MACRO);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__COM_RECEIVE_BUFFER_VARIABLE_SET);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__COM_SIGNAL_API_WRAPPER);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__COM_SIGNAL_API_ALIAS);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__COM_META_DATA_VARIABLE_SET);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_INDEX_CONSTANT);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__COM_PROXY_BUFFER_VARIABLE_SET);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__SR_RTE_BUFFER_INIT_VALUE_CONSTANT);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__SR_RTE_BUFFER_VARIABLE_SET);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__SR_RTE_BUFFER_QUEUED_VARIABLE);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__SR_FILTER_CONSTANT);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__SR_FILTER_OLD_VALUE_VARIABLE);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__SR_FILTER_OCCURRENCE_VARIABLE);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__CS_TF_ARGC_CONSTANT);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__CS_TF_OPID_CONSTANT);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__CS_TRUSTED_FUNCTION);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__ENTITY_START_VARIABLE);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__ENTITY_START_CONSTANT);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__TASK_BODY);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__RESTART_PARTITION_API);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__PARTITION_TERMINATED_API);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__PARTITION_RESTARTING_API);
			childrenFeatures.add(ModulePackage.Literals.PARTITION__TACK_STATUS);
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
	 * This returns Partition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Partition")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Partition)object).getRoleName();
		return label == null || label.length() == 0 ?
			getString("_UI_Partition_type") : //$NON-NLS-1$
			getString("_UI_Partition_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Partition.class)) {
			case ModulePackage.PARTITION__IS_BSW_PARTITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModulePackage.PARTITION__SWC:
			case ModulePackage.PARTITION__PARTED_BSWM:
			case ModulePackage.PARTITION__OS_TRUSTED_MACRO:
			case ModulePackage.PARTITION__COM_RECEIVE_BUFFER_VARIABLE_SET:
			case ModulePackage.PARTITION__COM_SIGNAL_API_WRAPPER:
			case ModulePackage.PARTITION__COM_SIGNAL_API_ALIAS:
			case ModulePackage.PARTITION__COM_META_DATA_VARIABLE_SET:
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION:
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_INDEX_CONSTANT:
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT:
			case ModulePackage.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE:
			case ModulePackage.PARTITION__COM_PROXY_BUFFER_VARIABLE_SET:
			case ModulePackage.PARTITION__SR_RTE_BUFFER_INIT_VALUE_CONSTANT:
			case ModulePackage.PARTITION__SR_RTE_BUFFER_VARIABLE_SET:
			case ModulePackage.PARTITION__SR_RTE_BUFFER_QUEUED_VARIABLE:
			case ModulePackage.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION:
			case ModulePackage.PARTITION__SR_FILTER_CONSTANT:
			case ModulePackage.PARTITION__SR_FILTER_OLD_VALUE_VARIABLE:
			case ModulePackage.PARTITION__SR_FILTER_OCCURRENCE_VARIABLE:
			case ModulePackage.PARTITION__CS_TF_ARGC_CONSTANT:
			case ModulePackage.PARTITION__CS_TF_OPID_CONSTANT:
			case ModulePackage.PARTITION__CS_TRUSTED_FUNCTION:
			case ModulePackage.PARTITION__ENTITY_START_VARIABLE:
			case ModulePackage.PARTITION__ENTITY_START_CONSTANT:
			case ModulePackage.PARTITION__TASK_BODY:
			case ModulePackage.PARTITION__RESTART_PARTITION_API:
			case ModulePackage.PARTITION__PARTITION_TERMINATED_API:
			case ModulePackage.PARTITION__PARTITION_RESTARTING_API:
			case ModulePackage.PARTITION__TACK_STATUS:
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
				(ModulePackage.Literals.PARTITION__SWC,
				 ModuleFactory.eINSTANCE.createSwc()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__PARTED_BSWM,
				 ModuleFactory.eINSTANCE.createPartedBswm()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__OS_TRUSTED_MACRO,
				 ModuleFactory.eINSTANCE.createMacro()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_RECEIVE_BUFFER_VARIABLE_SET,
				 ModuleFactory.eINSTANCE.createRteBufferVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_SIGNAL_API_WRAPPER,
				 ModuleFactory.eINSTANCE.createComSendSignalApiWrapper()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_SIGNAL_API_WRAPPER,
				 ModuleFactory.eINSTANCE.createComReceiveSignalApiWrapper()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_SIGNAL_API_ALIAS,
				 ModuleFactory.eINSTANCE.createFunctionMacro()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_META_DATA_VARIABLE_SET,
				 ModuleFactory.eINSTANCE.createGlobalVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION,
				 ModuleFactory.eINSTANCE.createComProxyFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_INDEX_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_INDEX_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstantMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstantMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE,
				 ModuleFactory.eINSTANCE.createComProxyFunctionTableVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE,
				 ModuleFactory.eINSTANCE.createModeQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__COM_PROXY_BUFFER_VARIABLE_SET,
				 ModuleFactory.eINSTANCE.createRteBufferVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_RTE_BUFFER_INIT_VALUE_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_RTE_BUFFER_INIT_VALUE_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstantMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_RTE_BUFFER_VARIABLE_SET,
				 ModuleFactory.eINSTANCE.createRteBufferVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_RTE_BUFFER_QUEUED_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION,
				 ModuleFactory.eINSTANCE.createRteBufferInvalidateTrustedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION,
				 ModuleFactory.eINSTANCE.createComSendSignalTrustedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION,
				 ModuleFactory.eINSTANCE.createRteBufferWriteTrustedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION,
				 ModuleFactory.eINSTANCE.createRteBufferSendTrustedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION,
				 ModuleFactory.eINSTANCE.createCsTrustedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_FILTER_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_FILTER_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstantMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_FILTER_OLD_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_FILTER_OLD_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_FILTER_OLD_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_FILTER_OLD_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createComProxyFunctionTableVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_FILTER_OLD_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_FILTER_OLD_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createModeQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_FILTER_OCCURRENCE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_FILTER_OCCURRENCE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_FILTER_OCCURRENCE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_FILTER_OCCURRENCE_VARIABLE,
				 ModuleFactory.eINSTANCE.createComProxyFunctionTableVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_FILTER_OCCURRENCE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__SR_FILTER_OCCURRENCE_VARIABLE,
				 ModuleFactory.eINSTANCE.createModeQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__CS_TF_ARGC_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__CS_TF_ARGC_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstantMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__CS_TF_OPID_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__CS_TF_OPID_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstantMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__CS_TRUSTED_FUNCTION,
				 ModuleFactory.eINSTANCE.createCsTrustedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__ENTITY_START_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__ENTITY_START_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__ENTITY_START_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__ENTITY_START_VARIABLE,
				 ModuleFactory.eINSTANCE.createComProxyFunctionTableVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__ENTITY_START_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__ENTITY_START_VARIABLE,
				 ModuleFactory.eINSTANCE.createModeQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__ENTITY_START_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__ENTITY_START_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstantMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__TASK_BODY,
				 ModuleFactory.eINSTANCE.createOsBackgroundTaskActivationExecutableTaskBody()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__TASK_BODY,
				 ModuleFactory.eINSTANCE.createOsTaskActivationExecutableTaskBody()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__TASK_BODY,
				 ModuleFactory.eINSTANCE.createOsEventSetExecutableTaskBody()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__TASK_BODY,
				 ModuleFactory.eINSTANCE.createComSendSignalImmediateTaskBody()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__RESTART_PARTITION_API,
				 ModuleFactory.eINSTANCE.createRestartPartitionApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__PARTITION_TERMINATED_API,
				 ModuleFactory.eINSTANCE.createPartitionTerminatedApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__PARTITION_RESTARTING_API,
				 ModuleFactory.eINSTANCE.createPartitionRestartingApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTITION__TACK_STATUS,
				 ModuleFactory.eINSTANCE.createTAckStatus()));
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
			childFeature == ModulePackage.Literals.PARTITION__COM_RECEIVE_BUFFER_VARIABLE_SET ||
			childFeature == ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_VARIABLE ||
			childFeature == ModulePackage.Literals.PARTITION__COM_PROXY_BUFFER_VARIABLE_SET ||
			childFeature == ModulePackage.Literals.PARTITION__SR_RTE_BUFFER_VARIABLE_SET ||
			childFeature == ModulePackage.Literals.PARTITION__SR_FILTER_OLD_VALUE_VARIABLE ||
			childFeature == ModulePackage.Literals.PARTITION__SR_FILTER_OCCURRENCE_VARIABLE ||
			childFeature == ModulePackage.Literals.PARTITION__ENTITY_START_VARIABLE ||
			childFeature == ModulePackage.Literals.PARTITION__COM_META_DATA_VARIABLE_SET ||
			childFeature == ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_INDEX_CONSTANT ||
			childFeature == ModulePackage.Literals.PARTITION__COM_PROXY_FUNCTION_TABLE_SIZE_CONSTANT ||
			childFeature == ModulePackage.Literals.PARTITION__SR_RTE_BUFFER_INIT_VALUE_CONSTANT ||
			childFeature == ModulePackage.Literals.PARTITION__SR_FILTER_CONSTANT ||
			childFeature == ModulePackage.Literals.PARTITION__CS_TF_ARGC_CONSTANT ||
			childFeature == ModulePackage.Literals.PARTITION__CS_TF_OPID_CONSTANT ||
			childFeature == ModulePackage.Literals.PARTITION__ENTITY_START_CONSTANT ||
			childFeature == ModulePackage.Literals.PARTITION__SR_RTE_BUFFER_QUEUED_VARIABLE ||
			childFeature == ModulePackage.Literals.PARTITION__RTE_BUFFER_SEND_TRUSTED_FUNCTION ||
			childFeature == ModulePackage.Literals.PARTITION__CS_TRUSTED_FUNCTION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
