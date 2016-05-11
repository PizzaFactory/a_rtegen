/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BswInternalBehaviorItemProvider extends IdentifiableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswInternalBehaviorItemProvider(AdapterFactory adapterFactory) {
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

			addDataTypeMappingPropertyDescriptor(object);
			addImplementationPropertyDescriptor(object);
			addBswSchedulableEntityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data Type Mapping feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataTypeMappingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InternalBehavior_dataTypeMapping_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_InternalBehavior_dataTypeMapping_feature", "_UI_InternalBehavior_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 M2Package.Literals.INTERNAL_BEHAVIOR__DATA_TYPE_MAPPING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BswInternalBehavior_implementation_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_BswInternalBehavior_implementation_feature", "_UI_BswInternalBehavior_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 M2Package.Literals.BSW_INTERNAL_BEHAVIOR__IMPLEMENTATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bsw Schedulable Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBswSchedulableEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BswInternalBehavior_bswSchedulableEntity_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_BswInternalBehavior_bswSchedulableEntity_feature", "_UI_BswInternalBehavior_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 M2Package.Literals.BSW_INTERNAL_BEHAVIOR__BSW_SCHEDULABLE_ENTITY,
				 false,
				 false,
				 false,
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
			childrenFeatures.add(M2Package.Literals.INTERNAL_BEHAVIOR__EXCLUSIVE_AREA);
			childrenFeatures.add(M2Package.Literals.BSW_INTERNAL_BEHAVIOR__ENTITY);
			childrenFeatures.add(M2Package.Literals.BSW_INTERNAL_BEHAVIOR__EVENT);
			childrenFeatures.add(M2Package.Literals.BSW_INTERNAL_BEHAVIOR__MODE_SENDER_POLICY);
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
	 * This returns BswInternalBehavior.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BswInternalBehavior")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BswInternalBehavior)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_BswInternalBehavior_type") : //$NON-NLS-1$
			getString("_UI_BswInternalBehavior_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(BswInternalBehavior.class)) {
			case M2Package.BSW_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA:
			case M2Package.BSW_INTERNAL_BEHAVIOR__ENTITY:
			case M2Package.BSW_INTERNAL_BEHAVIOR__EVENT:
			case M2Package.BSW_INTERNAL_BEHAVIOR__MODE_SENDER_POLICY:
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
				(M2Package.Literals.INTERNAL_BEHAVIOR__EXCLUSIVE_AREA,
				 M2Factory.eINSTANCE.createExclusiveArea()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.BSW_INTERNAL_BEHAVIOR__ENTITY,
				 M2Factory.eINSTANCE.createBswSchedulableEntity()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.BSW_INTERNAL_BEHAVIOR__ENTITY,
				 M2Factory.eINSTANCE.createBswCalledEntity()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.BSW_INTERNAL_BEHAVIOR__ENTITY,
				 M2Factory.eINSTANCE.createBswInterruptEntity()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.BSW_INTERNAL_BEHAVIOR__EVENT,
				 M2Factory.eINSTANCE.createBswModeSwitchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.BSW_INTERNAL_BEHAVIOR__EVENT,
				 M2Factory.eINSTANCE.createBswTimingEvent()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.BSW_INTERNAL_BEHAVIOR__EVENT,
				 M2Factory.eINSTANCE.createBswBackgroundEvent()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.BSW_INTERNAL_BEHAVIOR__MODE_SENDER_POLICY,
				 M2Factory.eINSTANCE.createBswModeSenderPolicy()));
	}

}
