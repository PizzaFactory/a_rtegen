/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IocNonqueuedCommunicationItemProvider extends IocCommunicationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocNonqueuedCommunicationItemProvider(AdapterFactory adapterFactory) {
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

			addInitValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Init Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IocNonqueuedCommunication_initValue_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_IocNonqueuedCommunication_initValue_feature", "_UI_IocNonqueuedCommunication_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModulePackage.Literals.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE,
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
			childrenFeatures.add(ModulePackage.Literals.IOC_NONQUEUED_COMMUNICATION__WRITE_API);
			childrenFeatures.add(ModulePackage.Literals.IOC_NONQUEUED_COMMUNICATION__READ_API);
			childrenFeatures.add(ModulePackage.Literals.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE_VARIABLE);
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
	 * This returns IocNonqueuedCommunication.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IocNonqueuedCommunication")); //$NON-NLS-1$
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
		return new StyledString(getString("_UI_IocNonqueuedCommunication_type")); //$NON-NLS-1$
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

		switch (notification.getFeatureID(IocNonqueuedCommunication.class)) {
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__WRITE_API:
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__READ_API:
			case ModulePackage.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE_VARIABLE:
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
				(ModulePackage.Literals.IOC_NONQUEUED_COMMUNICATION__WRITE_API,
				 ModuleFactory.eINSTANCE.createIocWriteApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.IOC_NONQUEUED_COMMUNICATION__READ_API,
				 ModuleFactory.eINSTANCE.createIocReadApi()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createGlobalVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createComProxyFunctionTableVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createRteBufferQueuedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModulePackage.Literals.IOC_NONQUEUED_COMMUNICATION__INIT_VALUE_VARIABLE,
				 ModuleFactory.eINSTANCE.createModeQueuedVariable()));
	}

}
