/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule;

import jp.pizzafactory.a_rte.model.rte.provider.RteEditPlugin;

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
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RteModuleItemProvider 
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
	public RteModuleItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__BSW_MEMORY_MAPPING_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__SWC_MEMORY_MAPPING_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__RTE_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__RTE_TYPE_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__RTE_APPLICATION_TYPE_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__RTE_APPLICATION_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__MODULE_INTERLINK_TYPE_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__MODULE_INTERLINK_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__RTE_LIFECYCLE_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__RTE_CONFIGURATION_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__RTE_VFB_TRACE_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__RTE_CALLBACK_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__RTE_UTILITY_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__RTE_BSW_API_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__RTE_COMMON_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__RTE_PARTITION_HEADER);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__RTE_COMMON_SOURCE);
			childrenFeatures.add(ModulePackage.Literals.RTE_MODULE__RTE_PARTITION_SOURCE);
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
	 * This returns RteModule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RteModule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_RteModule_type");
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

		switch (notification.getFeatureID(RteModule.class)) {
			case ModulePackage.RTE_MODULE__DEPENDENT_HEADER:
			case ModulePackage.RTE_MODULE__BSW_MEMORY_MAPPING_HEADER:
			case ModulePackage.RTE_MODULE__SWC_MEMORY_MAPPING_HEADER:
			case ModulePackage.RTE_MODULE__RTE_HEADER:
			case ModulePackage.RTE_MODULE__RTE_TYPE_HEADER:
			case ModulePackage.RTE_MODULE__RTE_APPLICATION_TYPE_HEADER:
			case ModulePackage.RTE_MODULE__RTE_APPLICATION_HEADER:
			case ModulePackage.RTE_MODULE__MODULE_INTERLINK_TYPE_HEADER:
			case ModulePackage.RTE_MODULE__MODULE_INTERLINK_HEADER:
			case ModulePackage.RTE_MODULE__RTE_LIFECYCLE_HEADER:
			case ModulePackage.RTE_MODULE__RTE_CONFIGURATION_HEADER:
			case ModulePackage.RTE_MODULE__RTE_VFB_TRACE_HEADER:
			case ModulePackage.RTE_MODULE__RTE_CALLBACK_HEADER:
			case ModulePackage.RTE_MODULE__RTE_UTILITY_HEADER:
			case ModulePackage.RTE_MODULE__RTE_BSW_API_HEADER:
			case ModulePackage.RTE_MODULE__RTE_COMMON_HEADER:
			case ModulePackage.RTE_MODULE__RTE_PARTITION_HEADER:
			case ModulePackage.RTE_MODULE__RTE_COMMON_SOURCE:
			case ModulePackage.RTE_MODULE__RTE_PARTITION_SOURCE:
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
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createRteApplicationHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createRteHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createRteBswApiHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createRteLifecycleHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createRteApplicationTypeHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createRteVfbTraceHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createRteConfigurationHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createRteCallbackHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createRteTypeHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createRteInternalHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createRteUtilityHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createBlackboxHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createBswMemoryMappingHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createSwcMemoryMappingHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createModuleInterlinkHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER,
				 ModuleFactory.eINSTANCE.createModuleInterlinkTypeHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__BSW_MEMORY_MAPPING_HEADER,
				 ModuleFactory.eINSTANCE.createBswMemoryMappingHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__SWC_MEMORY_MAPPING_HEADER,
				 ModuleFactory.eINSTANCE.createSwcMemoryMappingHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__RTE_HEADER,
				 ModuleFactory.eINSTANCE.createRteHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__RTE_TYPE_HEADER,
				 ModuleFactory.eINSTANCE.createRteTypeHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__RTE_APPLICATION_TYPE_HEADER,
				 ModuleFactory.eINSTANCE.createRteApplicationTypeHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__RTE_APPLICATION_HEADER,
				 ModuleFactory.eINSTANCE.createRteApplicationHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__MODULE_INTERLINK_TYPE_HEADER,
				 ModuleFactory.eINSTANCE.createModuleInterlinkTypeHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__MODULE_INTERLINK_HEADER,
				 ModuleFactory.eINSTANCE.createModuleInterlinkHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__RTE_LIFECYCLE_HEADER,
				 ModuleFactory.eINSTANCE.createRteLifecycleHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__RTE_CONFIGURATION_HEADER,
				 ModuleFactory.eINSTANCE.createRteConfigurationHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__RTE_VFB_TRACE_HEADER,
				 ModuleFactory.eINSTANCE.createRteVfbTraceHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__RTE_CALLBACK_HEADER,
				 ModuleFactory.eINSTANCE.createRteCallbackHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__RTE_UTILITY_HEADER,
				 ModuleFactory.eINSTANCE.createRteUtilityHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__RTE_BSW_API_HEADER,
				 ModuleFactory.eINSTANCE.createRteBswApiHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__RTE_COMMON_HEADER,
				 ModuleFactory.eINSTANCE.createRteInternalHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__RTE_PARTITION_HEADER,
				 ModuleFactory.eINSTANCE.createRteInternalHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__RTE_COMMON_SOURCE,
				 ModuleFactory.eINSTANCE.createRteSource()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_MODULE__RTE_PARTITION_SOURCE,
				 ModuleFactory.eINSTANCE.createRteSource()));
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
			childFeature == ModulePackage.Literals.RTE_MODULE__DEPENDENT_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__RTE_APPLICATION_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__RTE_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__RTE_BSW_API_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__RTE_LIFECYCLE_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__RTE_APPLICATION_TYPE_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__RTE_VFB_TRACE_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__RTE_CONFIGURATION_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__RTE_CALLBACK_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__RTE_TYPE_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__RTE_COMMON_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__RTE_PARTITION_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__RTE_UTILITY_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__BSW_MEMORY_MAPPING_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__SWC_MEMORY_MAPPING_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__MODULE_INTERLINK_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__MODULE_INTERLINK_TYPE_HEADER ||
			childFeature == ModulePackage.Literals.RTE_MODULE__RTE_COMMON_SOURCE ||
			childFeature == ModulePackage.Literals.RTE_MODULE__RTE_PARTITION_SOURCE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RteEditPlugin.INSTANCE;
	}

}
