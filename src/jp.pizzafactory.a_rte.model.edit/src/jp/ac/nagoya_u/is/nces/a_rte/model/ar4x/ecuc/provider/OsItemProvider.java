/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OsItemProvider extends EcucModuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EcucPackage.Literals.OS__OS_TASK);
			childrenFeatures.add(EcucPackage.Literals.OS__OS_EVENT);
			childrenFeatures.add(EcucPackage.Literals.OS__OS_APPLICATION);
			childrenFeatures.add(EcucPackage.Literals.OS__OS_ALARM);
			childrenFeatures.add(EcucPackage.Literals.OS__OS_RESOURCE);
			childrenFeatures.add(EcucPackage.Literals.OS__OS_SPINLOCK);
			childrenFeatures.add(EcucPackage.Literals.OS__OS_IOC);
			childrenFeatures.add(EcucPackage.Literals.OS__OS_OS);
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
	 * This returns Os.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Os")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Os)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Os_type") : //$NON-NLS-1$
			getString("_UI_Os_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Os.class)) {
			case EcucPackage.OS__OS_TASK:
			case EcucPackage.OS__OS_EVENT:
			case EcucPackage.OS__OS_APPLICATION:
			case EcucPackage.OS__OS_ALARM:
			case EcucPackage.OS__OS_RESOURCE:
			case EcucPackage.OS__OS_SPINLOCK:
			case EcucPackage.OS__OS_IOC:
			case EcucPackage.OS__OS_OS:
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
				(EcucPackage.Literals.OS__OS_TASK,
				 EcucFactory.eINSTANCE.createOsTask()));

		newChildDescriptors.add
			(createChildParameter
				(EcucPackage.Literals.OS__OS_EVENT,
				 EcucFactory.eINSTANCE.createOsEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EcucPackage.Literals.OS__OS_APPLICATION,
				 EcucFactory.eINSTANCE.createOsApplication()));

		newChildDescriptors.add
			(createChildParameter
				(EcucPackage.Literals.OS__OS_ALARM,
				 EcucFactory.eINSTANCE.createOsAlarm()));

		newChildDescriptors.add
			(createChildParameter
				(EcucPackage.Literals.OS__OS_RESOURCE,
				 EcucFactory.eINSTANCE.createOsResource()));

		newChildDescriptors.add
			(createChildParameter
				(EcucPackage.Literals.OS__OS_SPINLOCK,
				 EcucFactory.eINSTANCE.createOsSpinlock()));

		newChildDescriptors.add
			(createChildParameter
				(EcucPackage.Literals.OS__OS_IOC,
				 EcucFactory.eINSTANCE.createOsIoc()));

		newChildDescriptors.add
			(createChildParameter
				(EcucPackage.Literals.OS__OS_OS,
				 EcucFactory.eINSTANCE.createOsOS()));
	}

}
