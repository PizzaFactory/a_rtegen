/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteSendOperation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteSendOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TrustedFunctionRteSendOperationItemProvider extends TrustedFunctionRteOperationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustedFunctionRteSendOperationItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addSrSendTfSymbolNamePropertyDescriptor(object);
			addTrustedFunctionParamVariablePropertyDescriptor(object);
			addIsGroupPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TrustedFunctionRteSendOperation_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TrustedFunctionRteSendOperation_type_feature", "_UI_TrustedFunctionRteSendOperation_type"),
				 ModulePackage.Literals.TRUSTED_FUNCTION_RTE_SEND_OPERATION__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sr Send Tf Symbol Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSrSendTfSymbolNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TrustedFunctionRteSendOperation_srSendTfSymbolName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TrustedFunctionRteSendOperation_srSendTfSymbolName_feature", "_UI_TrustedFunctionRteSendOperation_type"),
				 ModulePackage.Literals.TRUSTED_FUNCTION_RTE_SEND_OPERATION__SR_SEND_TF_SYMBOL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trusted Function Param Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrustedFunctionParamVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TrustedFunctionRteSendOperation_trustedFunctionParamVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TrustedFunctionRteSendOperation_trustedFunctionParamVariable_feature", "_UI_TrustedFunctionRteSendOperation_type"),
				 ModulePackage.Literals.TRUSTED_FUNCTION_RTE_SEND_OPERATION__TRUSTED_FUNCTION_PARAM_VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TrustedFunctionRteSendOperation_isGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TrustedFunctionRteSendOperation_isGroup_feature", "_UI_TrustedFunctionRteSendOperation_type"),
				 ModulePackage.Literals.TRUSTED_FUNCTION_RTE_SEND_OPERATION__IS_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TrustedFunctionRteSendOperation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TrustedFunctionRteSendOperation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TrustedFunctionRteSendOperation)object).getRoleName();
		return label == null || label.length() == 0 ?
			getString("_UI_TrustedFunctionRteSendOperation_type") :
			getString("_UI_TrustedFunctionRteSendOperation_type") + " " + label;
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

		switch (notification.getFeatureID(TrustedFunctionRteSendOperation.class)) {
			case ModulePackage.TRUSTED_FUNCTION_RTE_SEND_OPERATION__SR_SEND_TF_SYMBOL_NAME:
			case ModulePackage.TRUSTED_FUNCTION_RTE_SEND_OPERATION__IS_GROUP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
