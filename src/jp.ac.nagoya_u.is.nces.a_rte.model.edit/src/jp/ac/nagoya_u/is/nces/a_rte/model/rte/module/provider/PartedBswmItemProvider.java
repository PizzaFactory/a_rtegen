/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PartedBswmItemProvider extends LogicalCompartmentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartedBswmItemProvider(AdapterFactory adapterFactory) {
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

			addBswmPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bswm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBswmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartedBswm_bswm_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_PartedBswm_bswm_feature", "_UI_PartedBswm_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModulePackage.Literals.PARTED_BSWM__BSWM,
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
			childrenFeatures.add(ModulePackage.Literals.PARTED_BSWM__BSW_MEMORY_MAPPING);
			childrenFeatures.add(ModulePackage.Literals.PARTED_BSWM__DEPENDENT_BSW_SCHEDULABLE_ENTITY);
			childrenFeatures.add(ModulePackage.Literals.PARTED_BSWM__MODE_MACHINE_INSTANCE);
			childrenFeatures.add(ModulePackage.Literals.PARTED_BSWM__SCHM_API);
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
	 * This returns PartedBswm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PartedBswm")); //$NON-NLS-1$
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
		String label = ((PartedBswm)object).getRoleName();
    	StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_PartedBswm_type"), StyledString.Style.QUALIFIER_STYLER);  //$NON-NLS-1$
		} else {
			styledLabel.append(getString("_UI_PartedBswm_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label); //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(PartedBswm.class)) {
			case ModulePackage.PARTED_BSWM__BSW_MEMORY_MAPPING:
			case ModulePackage.PARTED_BSWM__DEPENDENT_BSW_SCHEDULABLE_ENTITY:
			case ModulePackage.PARTED_BSWM__MODE_MACHINE_INSTANCE:
			case ModulePackage.PARTED_BSWM__SCHM_API:
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
				(ModulePackage.Literals.PARTED_BSWM__BSW_MEMORY_MAPPING,
				 ModuleFactory.eINSTANCE.createBswMemoryMapping()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTED_BSWM__DEPENDENT_BSW_SCHEDULABLE_ENTITY,
				 ModuleFactory.eINSTANCE.createBswSchedulableEntity()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTED_BSWM__DEPENDENT_BSW_SCHEDULABLE_ENTITY,
				 ModuleFactory.eINSTANCE.createComSendSignalProxyEntity()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTED_BSWM__DEPENDENT_BSW_SCHEDULABLE_ENTITY,
				 ModuleFactory.eINSTANCE.createComSendSignalImmediateEntity()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTED_BSWM__DEPENDENT_BSW_SCHEDULABLE_ENTITY,
				 ModuleFactory.eINSTANCE.createComSendSignalPeriodicEntity()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTED_BSWM__MODE_MACHINE_INSTANCE,
				 ModuleFactory.eINSTANCE.createModeMachineInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTED_BSWM__SCHM_API,
				 ModuleFactory.eINSTANCE.createSchmEnterApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTED_BSWM__SCHM_API,
				 ModuleFactory.eINSTANCE.createSchmExitApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTED_BSWM__SCHM_API,
				 ModuleFactory.eINSTANCE.createSchmModeApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.PARTED_BSWM__SCHM_API,
				 ModuleFactory.eINSTANCE.createSchmSwitchApi()));
	}

}
