/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ArPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArPackageItemProvider extends IdentifiableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArPackageItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(M2Package.Literals.AR_PACKAGE__ELEMENT);
			childrenFeatures.add(M2Package.Literals.AR_PACKAGE__AR_PACKAGE);
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
	 * This returns ArPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArPackage")); //$NON-NLS-1$
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
		String label = ((ArPackage)object).getId();
    	StyledString styledLabel = new StyledString();
		if (label == null || label.length() == 0) {
			styledLabel.append(getString("_UI_ArPackage_type"), StyledString.Style.QUALIFIER_STYLER);  //$NON-NLS-1$
		} else {
			styledLabel.append(getString("_UI_ArPackage_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label); //$NON-NLS-1$ //$NON-NLS-2$
		}
		return styledLabel;
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

		switch (notification.getFeatureID(ArPackage.class)) {
			case M2Package.AR_PACKAGE__ELEMENT:
			case M2Package.AR_PACKAGE__AR_PACKAGE:
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
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createSwBaseType()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createPortInterface()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createSenderReceiverInterface()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createApplicationSwComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createEcucModuleConfigurationValues()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createCompositionSwComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createImplementationDataType()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createDataTypeMappingSet()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createModeDeclarationGroupPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createModeDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createModeDeclarationGroup()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createApplicationPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createConstantSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createClientServerInterface()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createSystemSignal()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createISignal()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createISignalIPdu()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createEcucValueCollection()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createSwAddrMethod()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createCompuMethod()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createDataConstr()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createEcuAbstractionSwComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createNvBlockSwComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createSensorActuatorSwComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createComplexDeviceDriverSwComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createServiceProxySwComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createServiceSwComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createSwcBswMapping()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createBswImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createBswModuleDescription()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createBswModuleEntry()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createSystemSignalGroup()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__ELEMENT,
				 M2Factory.eINSTANCE.createISignalGroup()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.AR_PACKAGE__AR_PACKAGE,
				 M2Factory.eINSTANCE.createArPackage()));
	}

}
