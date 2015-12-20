/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RteItemProvider extends LogicalCompartmentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ModulePackage.Literals.RTE__CORE);
			childrenFeatures.add(ModulePackage.Literals.RTE__BSWM);
			childrenFeatures.add(ModulePackage.Literals.RTE__GENERATION_INFO);
			childrenFeatures.add(ModulePackage.Literals.RTE__DEPENDENT_TYPE);
			childrenFeatures.add(ModulePackage.Literals.RTE__DEPENDENT_CONSTANT);
			childrenFeatures.add(ModulePackage.Literals.RTE__DEPENDENT_OS_API);
			childrenFeatures.add(ModulePackage.Literals.RTE__DEPENDENT_IOC_COMMUNICATION);
			childrenFeatures.add(ModulePackage.Literals.RTE__DEPENDENT_COM_API);
			childrenFeatures.add(ModulePackage.Literals.RTE__IOC_INIT_VALUE_CONSTANT);
			childrenFeatures.add(ModulePackage.Literals.RTE__IOC_INIT_VALUE_VARIABLE_SET);
			childrenFeatures.add(ModulePackage.Literals.RTE__RTE_MEMORY_MAPPING);
			childrenFeatures.add(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE);
			childrenFeatures.add(ModulePackage.Literals.RTE__COM_SEND_SIGNAL_TF_PARAM_TYPE);
			childrenFeatures.add(ModulePackage.Literals.RTE__COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE);
			childrenFeatures.add(ModulePackage.Literals.RTE__CS_TF_PARAM_TYPE);
			childrenFeatures.add(ModulePackage.Literals.RTE__SR_RTE_SEND_TF_PARAM_TYPE);
			childrenFeatures.add(ModulePackage.Literals.RTE__SR_RTE_BUFFER_QUEUE_MAX_LENGTH_CONSTANT);
			childrenFeatures.add(ModulePackage.Literals.RTE__SR_RTE_BUFFER_QUEUE_TYPE);
			childrenFeatures.add(ModulePackage.Literals.RTE__IMMEDIATE_CONSTANT);
			childrenFeatures.add(ModulePackage.Literals.RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION);
			childrenFeatures.add(ModulePackage.Literals.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY);
			childrenFeatures.add(ModulePackage.Literals.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY);
			childrenFeatures.add(ModulePackage.Literals.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY);
			childrenFeatures.add(ModulePackage.Literals.RTE__COM_CALLBACK);
			childrenFeatures.add(ModulePackage.Literals.RTE__RTE_START_API);
			childrenFeatures.add(ModulePackage.Literals.RTE__RTE_STOP_API);
			childrenFeatures.add(ModulePackage.Literals.RTE__SCHM_INIT_API);
			childrenFeatures.add(ModulePackage.Literals.RTE__SCHM_DEINIT_API);
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
	 * This returns Rte.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Rte"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Rte)object).getRoleName();
		return label == null || label.length() == 0 ?
			getString("_UI_Rte_type") :
			getString("_UI_Rte_type") + " " + label;
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

		switch (notification.getFeatureID(Rte.class)) {
			case ModulePackage.RTE__CORE:
			case ModulePackage.RTE__BSWM:
			case ModulePackage.RTE__GENERATION_INFO:
			case ModulePackage.RTE__DEPENDENT_TYPE:
			case ModulePackage.RTE__DEPENDENT_CONSTANT:
			case ModulePackage.RTE__DEPENDENT_OS_API:
			case ModulePackage.RTE__DEPENDENT_IOC_COMMUNICATION:
			case ModulePackage.RTE__DEPENDENT_COM_API:
			case ModulePackage.RTE__IOC_INIT_VALUE_CONSTANT:
			case ModulePackage.RTE__IOC_INIT_VALUE_VARIABLE_SET:
			case ModulePackage.RTE__RTE_MEMORY_MAPPING:
			case ModulePackage.RTE__IMPLEMENTATION_DATA_TYPE:
			case ModulePackage.RTE__COM_SEND_SIGNAL_TF_PARAM_TYPE:
			case ModulePackage.RTE__COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE:
			case ModulePackage.RTE__CS_TF_PARAM_TYPE:
			case ModulePackage.RTE__SR_RTE_SEND_TF_PARAM_TYPE:
			case ModulePackage.RTE__SR_RTE_BUFFER_QUEUE_MAX_LENGTH_CONSTANT:
			case ModulePackage.RTE__SR_RTE_BUFFER_QUEUE_TYPE:
			case ModulePackage.RTE__IMMEDIATE_CONSTANT:
			case ModulePackage.RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION:
			case ModulePackage.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY:
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY:
			case ModulePackage.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY:
			case ModulePackage.RTE__COM_CALLBACK:
			case ModulePackage.RTE__RTE_START_API:
			case ModulePackage.RTE__RTE_STOP_API:
			case ModulePackage.RTE__SCHM_INIT_API:
			case ModulePackage.RTE__SCHM_DEINIT_API:
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
				(ModulePackage.Literals.RTE__CORE,
				 ModuleFactory.eINSTANCE.createCore()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__BSWM,
				 ModuleFactory.eINSTANCE.createBswm()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__GENERATION_INFO,
				 ModuleFactory.eINSTANCE.createGenerationInfo()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createModeType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createModeQueueType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createRedefinitionPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createArrayType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createRedefinitionArrayType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createUnionType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createRedefinitionUnionType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createStructType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createRedefinitionStructType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createBlackboxType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createRteBufferQueueType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createRteSendTrustedFunctionParamType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createComSendTrustedFunctionParamType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createCsTrustedFunctionParamType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createPointerType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_TYPE,
				 ModuleFactory.eINSTANCE.createRedefinitionPointerType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstantMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_OS_API,
				 ModuleFactory.eINSTANCE.createOsSetEventApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_OS_API,
				 ModuleFactory.eINSTANCE.createOsSuspendAllInterruptsApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_OS_API,
				 ModuleFactory.eINSTANCE.createOsGetSpinlockApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_IOC_COMMUNICATION,
				 ModuleFactory.eINSTANCE.createIocNonqueuedCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_IOC_COMMUNICATION,
				 ModuleFactory.eINSTANCE.createIocQueuedCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_IOC_COMMUNICATION,
				 ModuleFactory.eINSTANCE.createIocQueuedGroupCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_COM_API,
				 ModuleFactory.eINSTANCE.createComSendSignalApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__DEPENDENT_COM_API,
				 ModuleFactory.eINSTANCE.createComReceiveSignalApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IOC_INIT_VALUE_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IOC_INIT_VALUE_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstantMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IOC_INIT_VALUE_VARIABLE_SET,
				 ModuleFactory.eINSTANCE.createRteBufferVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__RTE_MEMORY_MAPPING,
				 ModuleFactory.eINSTANCE.createBswMemoryMapping()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createModeType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createModeQueueType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createRedefinitionPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createArrayType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createRedefinitionArrayType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createUnionType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createRedefinitionUnionType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createStructType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createRedefinitionStructType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createBlackboxType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createRteBufferQueueType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createRteSendTrustedFunctionParamType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createComSendTrustedFunctionParamType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createCsTrustedFunctionParamType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createPointerType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE,
				 ModuleFactory.eINSTANCE.createRedefinitionPointerType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__COM_SEND_SIGNAL_TF_PARAM_TYPE,
				 ModuleFactory.eINSTANCE.createComSendTrustedFunctionParamType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE,
				 ModuleFactory.eINSTANCE.createComSendTrustedFunctionParamType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__CS_TF_PARAM_TYPE,
				 ModuleFactory.eINSTANCE.createCsTrustedFunctionParamType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__SR_RTE_SEND_TF_PARAM_TYPE,
				 ModuleFactory.eINSTANCE.createRteSendTrustedFunctionParamType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__SR_RTE_BUFFER_QUEUE_MAX_LENGTH_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__SR_RTE_BUFFER_QUEUE_MAX_LENGTH_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstantMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__SR_RTE_BUFFER_QUEUE_TYPE,
				 ModuleFactory.eINSTANCE.createRteBufferQueueType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMMEDIATE_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__IMMEDIATE_CONSTANT,
				 ModuleFactory.eINSTANCE.createConstantMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__COM_SEND_SIGNAL_TRUSTED_FUNCTION,
				 ModuleFactory.eINSTANCE.createComSendSignalTrustedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__COM_SEND_SIGNAL_PERIODIC_ENTITY,
				 ModuleFactory.eINSTANCE.createComSendSignalPeriodicEntity()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__COM_SEND_SIGNAL_IMMEDIATE_ENTITY,
				 ModuleFactory.eINSTANCE.createComSendSignalImmediateEntity()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__COM_SEND_SIGNAL_IMMEDIATE_TASK_BODY,
				 ModuleFactory.eINSTANCE.createComSendSignalImmediateTaskBody()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__COM_CALLBACK,
				 ModuleFactory.eINSTANCE.createComReceiveCallback()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__COM_CALLBACK,
				 ModuleFactory.eINSTANCE.createComReceiveTimeoutCallback()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__COM_CALLBACK,
				 ModuleFactory.eINSTANCE.createComInvalidateCallback()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__RTE_START_API,
				 ModuleFactory.eINSTANCE.createMulticoreRteStartApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__RTE_START_API,
				 ModuleFactory.eINSTANCE.createSinglecoreRteStartApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__RTE_STOP_API,
				 ModuleFactory.eINSTANCE.createRteStopApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__SCHM_INIT_API,
				 ModuleFactory.eINSTANCE.createSchmInitApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__SCHM_INIT_API,
				 ModuleFactory.eINSTANCE.createSinglecoreSchmInitApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__SCHM_INIT_API,
				 ModuleFactory.eINSTANCE.createMulticoreSchmInitApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__SCHM_INIT_API,
				 ModuleFactory.eINSTANCE.createSchmCoreInitApiImpl()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE__SCHM_DEINIT_API,
				 ModuleFactory.eINSTANCE.createSchmDeinitApi()));
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
			childFeature == ModulePackage.Literals.RTE__DEPENDENT_TYPE ||
			childFeature == ModulePackage.Literals.RTE__IMPLEMENTATION_DATA_TYPE ||
			childFeature == ModulePackage.Literals.RTE__SR_RTE_BUFFER_QUEUE_TYPE ||
			childFeature == ModulePackage.Literals.RTE__SR_RTE_SEND_TF_PARAM_TYPE ||
			childFeature == ModulePackage.Literals.RTE__COM_SEND_SIGNAL_TF_PARAM_TYPE ||
			childFeature == ModulePackage.Literals.RTE__COM_SEND_SIGNAL_GROUP_TF_PARAM_TYPE ||
			childFeature == ModulePackage.Literals.RTE__CS_TF_PARAM_TYPE ||
			childFeature == ModulePackage.Literals.RTE__DEPENDENT_CONSTANT ||
			childFeature == ModulePackage.Literals.RTE__IOC_INIT_VALUE_CONSTANT ||
			childFeature == ModulePackage.Literals.RTE__SR_RTE_BUFFER_QUEUE_MAX_LENGTH_CONSTANT ||
			childFeature == ModulePackage.Literals.RTE__IMMEDIATE_CONSTANT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
