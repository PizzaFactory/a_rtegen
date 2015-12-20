/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwDataDefPropsItemProvider extends M2ObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwDataDefPropsItemProvider(AdapterFactory adapterFactory) {
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

			addBaseTypePropertyDescriptor(object);
			addSwImplPolicyPropertyDescriptor(object);
			addSwAddrMethodPropertyDescriptor(object);
			addSwAlignmentPropertyDescriptor(object);
			addCompuMethodPropertyDescriptor(object);
			addDataConstrPropertyDescriptor(object);
			addImplementationDataTypePropertyDescriptor(object);
			addSwPointerTargetPropsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwDataDefProps_baseType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwDataDefProps_baseType_feature", "_UI_SwDataDefProps_type"),
				 M2Package.Literals.SW_DATA_DEF_PROPS__BASE_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sw Impl Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwImplPolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwDataDefProps_swImplPolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwDataDefProps_swImplPolicy_feature", "_UI_SwDataDefProps_type"),
				 M2Package.Literals.SW_DATA_DEF_PROPS__SW_IMPL_POLICY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sw Addr Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwAddrMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwDataDefProps_swAddrMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwDataDefProps_swAddrMethod_feature", "_UI_SwDataDefProps_type"),
				 M2Package.Literals.SW_DATA_DEF_PROPS__SW_ADDR_METHOD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sw Alignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwAlignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwDataDefProps_swAlignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwDataDefProps_swAlignment_feature", "_UI_SwDataDefProps_type"),
				 M2Package.Literals.SW_DATA_DEF_PROPS__SW_ALIGNMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compu Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompuMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwDataDefProps_compuMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwDataDefProps_compuMethod_feature", "_UI_SwDataDefProps_type"),
				 M2Package.Literals.SW_DATA_DEF_PROPS__COMPU_METHOD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Constr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataConstrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwDataDefProps_dataConstr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwDataDefProps_dataConstr_feature", "_UI_SwDataDefProps_type"),
				 M2Package.Literals.SW_DATA_DEF_PROPS__DATA_CONSTR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implementation Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwDataDefProps_implementationDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwDataDefProps_implementationDataType_feature", "_UI_SwDataDefProps_type"),
				 M2Package.Literals.SW_DATA_DEF_PROPS__IMPLEMENTATION_DATA_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sw Pointer Target Props feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwPointerTargetPropsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwDataDefProps_swPointerTargetProps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwDataDefProps_swPointerTargetProps_feature", "_UI_SwDataDefProps_type"),
				 M2Package.Literals.SW_DATA_DEF_PROPS__SW_POINTER_TARGET_PROPS,
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
			childrenFeatures.add(M2Package.Literals.SW_DATA_DEF_PROPS__INVALID_VALUE);
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
	 * This returns SwDataDefProps.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SwDataDefProps"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SwImplPolicyEnum labelValue = ((SwDataDefProps)object).getSwImplPolicy();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SwDataDefProps_type") :
			getString("_UI_SwDataDefProps_type") + " " + label;
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

		switch (notification.getFeatureID(SwDataDefProps.class)) {
			case M2Package.SW_DATA_DEF_PROPS__SW_IMPL_POLICY:
			case M2Package.SW_DATA_DEF_PROPS__SW_ALIGNMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE:
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
				(M2Package.Literals.SW_DATA_DEF_PROPS__INVALID_VALUE,
				 M2Factory.eINSTANCE.createNumericalValueSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SW_DATA_DEF_PROPS__INVALID_VALUE,
				 M2Factory.eINSTANCE.createTextValueSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SW_DATA_DEF_PROPS__INVALID_VALUE,
				 M2Factory.eINSTANCE.createConstantReference()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SW_DATA_DEF_PROPS__INVALID_VALUE,
				 M2Factory.eINSTANCE.createReferenceValueSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SW_DATA_DEF_PROPS__INVALID_VALUE,
				 M2Factory.eINSTANCE.createArrayValueSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SW_DATA_DEF_PROPS__INVALID_VALUE,
				 M2Factory.eINSTANCE.createRecordValueSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.SW_DATA_DEF_PROPS__INVALID_VALUE,
				 M2Factory.eINSTANCE.createApplicationValueSpecification()));
	}

}
