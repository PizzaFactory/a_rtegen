/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwcInternalBehaviorItemProvider extends IdentifiableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcInternalBehaviorItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(M2Package.Literals.SWC_INTERNAL_BEHAVIOR__RUNNABLE);
			childrenFeatures.add(M2Package.Literals.SWC_INTERNAL_BEHAVIOR__EVENT);
			childrenFeatures.add(M2Package.Literals.SWC_INTERNAL_BEHAVIOR__PORT_API_OPTION);
			childrenFeatures.add(M2Package.Literals.SWC_INTERNAL_BEHAVIOR__INCLUDED_DATA_TYPE_SET);
			childrenFeatures.add(M2Package.Literals.SWC_INTERNAL_BEHAVIOR__EXPLICIT_INTER_RUNNABLE_VARIABLE);
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
	 * This returns SwcInternalBehavior.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SwcInternalBehavior")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SwcInternalBehavior)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_SwcInternalBehavior_type") : //$NON-NLS-1$
			getString("_UI_SwcInternalBehavior_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(SwcInternalBehavior.class)) {
			case M2Package.SWC_INTERNAL_BEHAVIOR__EXCLUSIVE_AREA:
			case M2Package.SWC_INTERNAL_BEHAVIOR__RUNNABLE:
			case M2Package.SWC_INTERNAL_BEHAVIOR__EVENT:
			case M2Package.SWC_INTERNAL_BEHAVIOR__PORT_API_OPTION:
			case M2Package.SWC_INTERNAL_BEHAVIOR__INCLUDED_DATA_TYPE_SET:
			case M2Package.SWC_INTERNAL_BEHAVIOR__EXPLICIT_INTER_RUNNABLE_VARIABLE:
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
				(M2Package.Literals.SWC_INTERNAL_BEHAVIOR__RUNNABLE,
				 M2Factory.eINSTANCE.createRunnableEntity()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SWC_INTERNAL_BEHAVIOR__EVENT,
				 M2Factory.eINSTANCE.createTimingEvent()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SWC_INTERNAL_BEHAVIOR__EVENT,
				 M2Factory.eINSTANCE.createBackgroundEvent()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SWC_INTERNAL_BEHAVIOR__EVENT,
				 M2Factory.eINSTANCE.createDataSendCompletedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SWC_INTERNAL_BEHAVIOR__EVENT,
				 M2Factory.eINSTANCE.createDataReceivedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SWC_INTERNAL_BEHAVIOR__EVENT,
				 M2Factory.eINSTANCE.createDataReceiveErrorEvent()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SWC_INTERNAL_BEHAVIOR__EVENT,
				 M2Factory.eINSTANCE.createOperationInvokedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SWC_INTERNAL_BEHAVIOR__PORT_API_OPTION,
				 M2Factory.eINSTANCE.createPortApiOption()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SWC_INTERNAL_BEHAVIOR__INCLUDED_DATA_TYPE_SET,
				 M2Factory.eINSTANCE.createIncludedDataTypeSet()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SWC_INTERNAL_BEHAVIOR__EXPLICIT_INTER_RUNNABLE_VARIABLE,
				 M2Factory.eINSTANCE.createVariableDataPrototype()));
	}

}
