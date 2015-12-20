/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataTypeElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplementationDataTypeElementItemProvider extends IdentifiableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataTypeElementItemProvider(AdapterFactory adapterFactory) {
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

			addArraySizePropertyDescriptor(object);
			addArraySizeSemanticsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Array Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArraySizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImplementationDataTypeElement_arraySize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImplementationDataTypeElement_arraySize_feature", "_UI_ImplementationDataTypeElement_type"),
				 M2Package.Literals.IMPLEMENTATION_DATA_TYPE_ELEMENT__ARRAY_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Array Size Semantics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArraySizeSemanticsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImplementationDataTypeElement_arraySizeSemantics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImplementationDataTypeElement_arraySizeSemantics_feature", "_UI_ImplementationDataTypeElement_type"),
				 M2Package.Literals.IMPLEMENTATION_DATA_TYPE_ELEMENT__ARRAY_SIZE_SEMANTICS,
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
			childrenFeatures.add(M2Package.Literals.IMPLEMENTATION_DATA_TYPE_ELEMENT__SUB_ELEMENT);
			childrenFeatures.add(M2Package.Literals.IMPLEMENTATION_DATA_TYPE_ELEMENT__SW_DATA_DEF_PROPS);
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
	 * This returns ImplementationDataTypeElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImplementationDataTypeElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ImplementationDataTypeElement)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ImplementationDataTypeElement_type") :
			getString("_UI_ImplementationDataTypeElement_type") + " " + label;
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

		switch (notification.getFeatureID(ImplementationDataTypeElement.class)) {
			case M2Package.IMPLEMENTATION_DATA_TYPE_ELEMENT__ARRAY_SIZE:
			case M2Package.IMPLEMENTATION_DATA_TYPE_ELEMENT__ARRAY_SIZE_SEMANTICS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case M2Package.IMPLEMENTATION_DATA_TYPE_ELEMENT__SUB_ELEMENT:
			case M2Package.IMPLEMENTATION_DATA_TYPE_ELEMENT__SW_DATA_DEF_PROPS:
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
				(M2Package.Literals.IMPLEMENTATION_DATA_TYPE_ELEMENT__SUB_ELEMENT,
				 M2Factory.eINSTANCE.createImplementationDataTypeElement()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.IMPLEMENTATION_DATA_TYPE_ELEMENT__SW_DATA_DEF_PROPS,
				 M2Factory.eINSTANCE.createSwDataDefProps()));
	}

}
