/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RteBufferVariableSetItemProvider extends GlobalVariableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteBufferVariableSetItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE);
			childrenFeatures.add(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE);
			childrenFeatures.add(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE);
			childrenFeatures.add(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE);
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
	 * This returns RteBufferVariableSet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RteBufferVariableSet"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RteBufferVariableSet)object).getRoleName();
		return label == null || label.length() == 0 ?
			getString("_UI_RteBufferVariableSet_type") :
			getString("_UI_RteBufferVariableSet_type") + " " + label;
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

		switch (notification.getFeatureID(RteBufferVariableSet.class)) {
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE:
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE:
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE:
			case ModulePackage.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE:
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
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createComProxyFunctionTableVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createModeQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE,
				 ModuleFactory.eINSTANCE.createComProxyFunctionTableVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE,
				 ModuleFactory.eINSTANCE.createModeQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createComProxyFunctionTableVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createModeQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE,
				 ModuleFactory.eINSTANCE.createComProxyFunctionTableVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE,
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
			childFeature == ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__VALUE_VARIABLE ||
			childFeature == ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE ||
			childFeature == ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__INIT_VALUE_VARIABLE ||
			childFeature == ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__COMPLEX_VARIABLE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
