/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RteInternalHeaderItemProvider extends HeaderFileItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteInternalHeaderItemProvider(AdapterFactory adapterFactory) {
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

			addConstantPropertyDescriptor(object);
			addRteCoreStartApiImplPropertyDescriptor(object);
			addSchmCoreInitApiImplPropertyDescriptor(object);
			addModeDeclarationGroupPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Constant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteInternalHeader_constant_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RteInternalHeader_constant_feature", "_UI_RteInternalHeader_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModulePackage.Literals.RTE_INTERNAL_HEADER__CONSTANT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rte Core Start Api Impl feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRteCoreStartApiImplPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteInternalHeader_rteCoreStartApiImpl_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RteInternalHeader_rteCoreStartApiImpl_feature", "_UI_RteInternalHeader_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModulePackage.Literals.RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schm Core Init Api Impl feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchmCoreInitApiImplPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteInternalHeader_schmCoreInitApiImpl_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RteInternalHeader_schmCoreInitApiImpl_feature", "_UI_RteInternalHeader_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModulePackage.Literals.RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mode Declaration Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModeDeclarationGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RteInternalHeader_modeDeclarationGroup_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RteInternalHeader_modeDeclarationGroup_feature", "_UI_RteInternalHeader_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModulePackage.Literals.RTE_INTERNAL_HEADER__MODE_DECLARATION_GROUP,
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
			childrenFeatures.add(ModulePackage.Literals.RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_INTERNAL_HEADER__FUNCTION_MACRO);
			childrenFeatures.add(ModulePackage.Literals.RTE_INTERNAL_HEADER__COM_PROXY_FUNCTION_TABLE_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_INTERNAL_HEADER__COM_SIGNAL_API_WRAPPER_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_INTERNAL_HEADER__MODE_TYPE);
			childrenFeatures.add(ModulePackage.Literals.RTE_INTERNAL_HEADER__MODE_MACHINE_INSTANCE);
			childrenFeatures.add(ModulePackage.Literals.RTE_INTERNAL_HEADER__RTE_API_GROUP);
			childrenFeatures.add(ModulePackage.Literals.RTE_INTERNAL_HEADER__SCHM_API_GROUP);
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
	 * This returns RteInternalHeader.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RteInternalHeader")); //$NON-NLS-1$
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
		String label = ((RteInternalHeader)object).getRoleName();
    	StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_RteInternalHeader_type"), StyledString.Style.QUALIFIER_STYLER);  //$NON-NLS-1$
		} else {
			styledLabel.append(getString("_UI_RteInternalHeader_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label); //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(RteInternalHeader.class)) {
			case ModulePackage.RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP:
			case ModulePackage.RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP:
			case ModulePackage.RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP:
			case ModulePackage.RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
			case ModulePackage.RTE_INTERNAL_HEADER__FUNCTION_MACRO:
			case ModulePackage.RTE_INTERNAL_HEADER__COM_PROXY_FUNCTION_TABLE_GROUP:
			case ModulePackage.RTE_INTERNAL_HEADER__COM_SIGNAL_API_WRAPPER_GROUP:
			case ModulePackage.RTE_INTERNAL_HEADER__MODE_TYPE:
			case ModulePackage.RTE_INTERNAL_HEADER__MODE_MACHINE_INSTANCE:
			case ModulePackage.RTE_INTERNAL_HEADER__RTE_API_GROUP:
			case ModulePackage.RTE_INTERNAL_HEADER__SCHM_API_GROUP:
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
				(ModulePackage.Literals.RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP,
				 ModuleFactory.eINSTANCE.createGlobalVariableFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP,
				 ModuleFactory.eINSTANCE.createTrustedFunctionFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP,
				 ModuleFactory.eINSTANCE.createBswSchedulableEntityFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP,
				 ModuleFactory.eINSTANCE.createExecutableEntityFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_INTERNAL_HEADER__FUNCTION_MACRO,
				 ModuleFactory.eINSTANCE.createFunctionMacro()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_INTERNAL_HEADER__COM_PROXY_FUNCTION_TABLE_GROUP,
				 ModuleFactory.eINSTANCE.createComProxyFunctionTableFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_INTERNAL_HEADER__COM_SIGNAL_API_WRAPPER_GROUP,
				 ModuleFactory.eINSTANCE.createComSignalApiWrapperFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_INTERNAL_HEADER__MODE_TYPE,
				 ModuleFactory.eINSTANCE.createModeType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_INTERNAL_HEADER__MODE_MACHINE_INSTANCE,
				 ModuleFactory.eINSTANCE.createModeMachineInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_INTERNAL_HEADER__RTE_API_GROUP,
				 ModuleFactory.eINSTANCE.createRteApiFileContentsGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_INTERNAL_HEADER__SCHM_API_GROUP,
				 ModuleFactory.eINSTANCE.createSchmApiFileContentsGroup()));
	}

}
