/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InvalidateApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InvalidateApi} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InvalidateApiItemProvider extends RteApiItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidateApiItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ModulePackage.Literals.INVALIDATE_API__OPERATION);
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
	 * This returns InvalidateApi.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InvalidateApi")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InvalidateApi)object).getRoleName();
		return label == null || label.length() == 0 ?
			getString("_UI_InvalidateApi_type") : //$NON-NLS-1$
			getString("_UI_InvalidateApi_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(InvalidateApi.class)) {
			case ModulePackage.INVALIDATE_API__OPERATION:
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
				(ModulePackage.Literals.INVALIDATE_API__OPERATION,
				 ModuleFactory.eINSTANCE.createRteBufferNonqueuedSendOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.INVALIDATE_API__OPERATION,
				 ModuleFactory.eINSTANCE.createIocSendOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.INVALIDATE_API__OPERATION,
				 ModuleFactory.eINSTANCE.createIocNonqueuedSendOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.INVALIDATE_API__OPERATION,
				 ModuleFactory.eINSTANCE.createDirectComSendOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.INVALIDATE_API__OPERATION,
				 ModuleFactory.eINSTANCE.createTrustedFunctionRteOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.INVALIDATE_API__OPERATION,
				 ModuleFactory.eINSTANCE.createTrustedFunctionRteSendOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.INVALIDATE_API__OPERATION,
				 ModuleFactory.eINSTANCE.createTrustedFunctionRteBufferWriteSendOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.INVALIDATE_API__OPERATION,
				 ModuleFactory.eINSTANCE.createTrustedFunctionComSendOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.INVALIDATE_API__OPERATION,
				 ModuleFactory.eINSTANCE.createImmediateProxyComSendOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.INVALIDATE_API__OPERATION,
				 ModuleFactory.eINSTANCE.createPeriodicProxyComSendOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.INVALIDATE_API__OPERATION,
				 ModuleFactory.eINSTANCE.createRteBufferQueuedSendOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.INVALIDATE_API__OPERATION,
				 ModuleFactory.eINSTANCE.createIocQueuedSendOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.INVALIDATE_API__OPERATION,
				 ModuleFactory.eINSTANCE.createTrustedFunctionRteBufferInvalidateSendOperation()));
	}

}
