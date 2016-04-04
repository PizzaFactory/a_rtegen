/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferInvalidateSendOperation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferInvalidateSendOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TrustedFunctionRteBufferInvalidateSendOperationItemProvider extends TrustedFunctionRteOperationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustedFunctionRteBufferInvalidateSendOperationItemProvider(AdapterFactory adapterFactory) {
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

			addAccessTrustedFunctionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Access Trusted Function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessTrustedFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TrustedFunctionRteBufferInvalidateSendOperation_accessTrustedFunction_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_TrustedFunctionRteBufferInvalidateSendOperation_accessTrustedFunction_feature", "_UI_TrustedFunctionRteBufferInvalidateSendOperation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModulePackage.Literals.TRUSTED_FUNCTION_RTE_BUFFER_INVALIDATE_SEND_OPERATION__ACCESS_TRUSTED_FUNCTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns TrustedFunctionRteBufferInvalidateSendOperation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TrustedFunctionRteBufferInvalidateSendOperation")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TrustedFunctionRteBufferInvalidateSendOperation)object).getRoleName();
		return label == null || label.length() == 0 ?
			getString("_UI_TrustedFunctionRteBufferInvalidateSendOperation_type") : //$NON-NLS-1$
			getString("_UI_TrustedFunctionRteBufferInvalidateSendOperation_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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
	}

}
