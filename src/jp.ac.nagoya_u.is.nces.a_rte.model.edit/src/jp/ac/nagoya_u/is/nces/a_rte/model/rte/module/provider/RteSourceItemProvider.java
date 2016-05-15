/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RteSourceItemProvider extends SourceFileItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteSourceItemProvider(AdapterFactory adapterFactory) {
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

			addSourceMacroPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source Macro feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceMacroPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteSource_sourceMacro_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RteSource_sourceMacro_feature", "_UI_RteSource_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModulePackage.Literals.RTE_SOURCE__SOURCE_MACRO,
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
			childrenFeatures.add(ModulePackage.Literals.RTE_SOURCE__GLOBAL_VARIABLE_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_SOURCE__DEPENDENT_EXTERNAL_EXECUTABLE_ENTITY_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_SOURCE__RTE_API_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_SOURCE__RTE_LIFECYCLE_API_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_SOURCE__TASK_BODY_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_SOURCE__COM_CALLBACK_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_SOURCE__TRUSTED_FUNCTION_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_SOURCE__SCHM_API_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_SOURCE__COM_SIGNAL_API_WRAPPER_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_SOURCE__COM_PROXY_FUNCTION_GROUP);
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
	 * This returns RteSource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RteSource")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return ((StyledString)getStyledText(object)).getString();
	}
	

	/**
	 * This returns the label styled text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStyledText(Object object) {
		String label = ((RteSource)object).getRoleName();
    	StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_RteSource_type"), StyledString.Style.QUALIFIER_STYLER);  //$NON-NLS-1$
		} else {
			styledLabel.append(getString("_UI_RteSource_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label); //$NON-NLS-1$ //$NON-NLS-2$
		}
		return styledLabel;
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

		switch (notification.getFeatureID(RteSource.class)) {
			case ModulePackage.RTE_SOURCE__GLOBAL_VARIABLE_GROUP:
			case ModulePackage.RTE_SOURCE__DEPENDENT_EXTERNAL_EXECUTABLE_ENTITY_GROUP:
			case ModulePackage.RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP:
			case ModulePackage.RTE_SOURCE__RTE_API_GROUP:
			case ModulePackage.RTE_SOURCE__RTE_LIFECYCLE_API_GROUP:
			case ModulePackage.RTE_SOURCE__TASK_BODY_GROUP:
			case ModulePackage.RTE_SOURCE__COM_CALLBACK_GROUP:
			case ModulePackage.RTE_SOURCE__TRUSTED_FUNCTION_GROUP:
			case ModulePackage.RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP:
			case ModulePackage.RTE_SOURCE__SCHM_API_GROUP:
			case ModulePackage.RTE_SOURCE__COM_SIGNAL_API_WRAPPER_GROUP:
			case ModulePackage.RTE_SOURCE__COM_PROXY_FUNCTION_GROUP:
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
				(ModulePackage.Literals.RTE_SOURCE__GLOBAL_VARIABLE_GROUP,
				 ModuleFactory.eINSTANCE.createGlobalVariableFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_SOURCE__DEPENDENT_EXTERNAL_EXECUTABLE_ENTITY_GROUP,
				 ModuleFactory.eINSTANCE.createExecutableEntityFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP,
				 ModuleFactory.eINSTANCE.createBswSchedulableEntityFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_SOURCE__RTE_API_GROUP,
				 ModuleFactory.eINSTANCE.createRteApiFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_SOURCE__RTE_LIFECYCLE_API_GROUP,
				 ModuleFactory.eINSTANCE.createRteLifecycleApiFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_SOURCE__TASK_BODY_GROUP,
				 ModuleFactory.eINSTANCE.createTaskBodyFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_SOURCE__COM_CALLBACK_GROUP,
				 ModuleFactory.eINSTANCE.createComCallbackFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_SOURCE__TRUSTED_FUNCTION_GROUP,
				 ModuleFactory.eINSTANCE.createTrustedFunctionFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP,
				 ModuleFactory.eINSTANCE.createSchmLifecycleApiFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_SOURCE__SCHM_API_GROUP,
				 ModuleFactory.eINSTANCE.createSchmApiFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_SOURCE__COM_SIGNAL_API_WRAPPER_GROUP,
				 ModuleFactory.eINSTANCE.createComSignalApiWrapperFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_SOURCE__COM_PROXY_FUNCTION_GROUP,
				 ModuleFactory.eINSTANCE.createComProxyFunctionFileContentsGroup()));
	}

}
