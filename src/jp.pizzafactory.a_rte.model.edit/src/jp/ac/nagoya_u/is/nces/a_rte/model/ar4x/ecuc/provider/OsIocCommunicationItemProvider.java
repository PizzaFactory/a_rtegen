/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OsIocCommunicationItemProvider extends EcucContainerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocCommunicationItemProvider(AdapterFactory adapterFactory) {
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

			addOsIocBufferLengthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Os Ioc Buffer Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOsIocBufferLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OsIocCommunication_osIocBufferLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OsIocCommunication_osIocBufferLength_feature", "_UI_OsIocCommunication_type"),
				 EcucPackage.Literals.OS_IOC_COMMUNICATION__OS_IOC_BUFFER_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(EcucPackage.Literals.OS_IOC_COMMUNICATION__OS_IOC_SENDER_PROPERTIES);
			childrenFeatures.add(EcucPackage.Literals.OS_IOC_COMMUNICATION__OS_IOC_RECEIVER_PROPERTIES);
			childrenFeatures.add(EcucPackage.Literals.OS_IOC_COMMUNICATION__OS_IOC_DATA_PROPERTIES);
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
	 * This returns OsIocCommunication.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OsIocCommunication"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OsIocCommunication)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_OsIocCommunication_type") :
			getString("_UI_OsIocCommunication_type") + " " + label;
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

		switch (notification.getFeatureID(OsIocCommunication.class)) {
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_BUFFER_LENGTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_SENDER_PROPERTIES:
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_RECEIVER_PROPERTIES:
			case EcucPackage.OS_IOC_COMMUNICATION__OS_IOC_DATA_PROPERTIES:
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
				(EcucPackage.Literals.OS_IOC_COMMUNICATION__OS_IOC_SENDER_PROPERTIES,
				 EcucFactory.eINSTANCE.createOsIocSenderProperties()));

		newChildDescriptors.add
			(createChildParameter
				(EcucPackage.Literals.OS_IOC_COMMUNICATION__OS_IOC_RECEIVER_PROPERTIES,
				 EcucFactory.eINSTANCE.createOsIocReceiverProperties()));

		newChildDescriptors.add
			(createChildParameter
				(EcucPackage.Literals.OS_IOC_COMMUNICATION__OS_IOC_DATA_PROPERTIES,
				 EcucFactory.eINSTANCE.createOsIocDataProperties()));
	}

}
