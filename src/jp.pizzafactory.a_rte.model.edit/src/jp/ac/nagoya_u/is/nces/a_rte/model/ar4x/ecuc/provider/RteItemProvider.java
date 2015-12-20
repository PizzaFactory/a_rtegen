/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RteItemProvider extends EcucModuleItemProvider {
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
			childrenFeatures.add(EcucPackage.Literals.RTE__RTE_GENERATION);
			childrenFeatures.add(EcucPackage.Literals.RTE__RTE_BSW_GENERAL);
			childrenFeatures.add(EcucPackage.Literals.RTE__RTE_SW_COMPONENT_INSTANCE);
			childrenFeatures.add(EcucPackage.Literals.RTE__RTE_OS_INTERACTION);
			childrenFeatures.add(EcucPackage.Literals.RTE__RTE_INITIALIZATION_BEHAVIOR);
			childrenFeatures.add(EcucPackage.Literals.RTE__RTE_BSW_MODULE_INSTANCE);
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
		String label = ((Rte)object).getId();
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
			case EcucPackage.RTE__RTE_GENERATION:
			case EcucPackage.RTE__RTE_BSW_GENERAL:
			case EcucPackage.RTE__RTE_SW_COMPONENT_INSTANCE:
			case EcucPackage.RTE__RTE_OS_INTERACTION:
			case EcucPackage.RTE__RTE_INITIALIZATION_BEHAVIOR:
			case EcucPackage.RTE__RTE_BSW_MODULE_INSTANCE:
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
				(EcucPackage.Literals.RTE__RTE_GENERATION,
				 EcucFactory.eINSTANCE.createRteGeneration()));

		newChildDescriptors.add
			(createChildParameter
				(EcucPackage.Literals.RTE__RTE_BSW_GENERAL,
				 EcucFactory.eINSTANCE.createRteBswGeneral()));

		newChildDescriptors.add
			(createChildParameter
				(EcucPackage.Literals.RTE__RTE_SW_COMPONENT_INSTANCE,
				 EcucFactory.eINSTANCE.createRteSwComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(EcucPackage.Literals.RTE__RTE_OS_INTERACTION,
				 EcucFactory.eINSTANCE.createRteOsInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(EcucPackage.Literals.RTE__RTE_INITIALIZATION_BEHAVIOR,
				 EcucFactory.eINSTANCE.createRteInitializationBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(EcucPackage.Literals.RTE__RTE_BSW_MODULE_INSTANCE,
				 EcucFactory.eINSTANCE.createRteBswModuleInstance()));
	}

}
