/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeMachineInstanceItemProvider extends ModuleReferrableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeMachineInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addInitModeConstantPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Init Mode Constant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitModeConstantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModeMachineInstance_initModeConstant_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ModeMachineInstance_initModeConstant_feature", "_UI_ModeMachineInstance_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModulePackage.Literals.MODE_MACHINE_INSTANCE__INIT_MODE_CONSTANT,
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
			childrenFeatures.add(ModulePackage.Literals.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE_TYPE);
			childrenFeatures.add(ModulePackage.Literals.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE);
			childrenFeatures.add(ModulePackage.Literals.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE);
			childrenFeatures.add(ModulePackage.Literals.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE);
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
	 * This returns ModeMachineInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModeMachineInstance")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModeMachineInstance)object).getRoleName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModeMachineInstance_type") : //$NON-NLS-1$
			getString("_UI_ModeMachineInstance_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ModeMachineInstance.class)) {
			case ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE_TYPE:
			case ModulePackage.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE:
			case ModulePackage.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE:
			case ModulePackage.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE:
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
				(ModulePackage.Literals.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE_TYPE,
				 ModuleFactory.eINSTANCE.createModeQueueType()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE,
				 ModuleFactory.eINSTANCE.createModeQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE,
				 ModuleFactory.eINSTANCE.createComProxyFunctionTableVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE,
				 ModuleFactory.eINSTANCE.createModeQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE,
				 ModuleFactory.eINSTANCE.createComProxyFunctionTableVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE,
				 ModuleFactory.eINSTANCE.createModeQueuedVariable()));
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
			childFeature == ModulePackage.Literals.MODE_MACHINE_INSTANCE__REQUEST_MODE_QUEUE ||
			childFeature == ModulePackage.Literals.MODE_MACHINE_INSTANCE__CURRENT_MODE_VARIABLE ||
			childFeature == ModulePackage.Literals.MODE_MACHINE_INSTANCE__NEXT_MODE_VARIABLE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
