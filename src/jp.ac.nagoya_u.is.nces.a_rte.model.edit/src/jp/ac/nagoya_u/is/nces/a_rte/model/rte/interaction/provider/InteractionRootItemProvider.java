/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.provider.RteEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemFontProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionRootItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemFontProvider, IItemFontProvider, IItemStyledLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionRootItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION_END);
			childrenFeatures.add(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION);
			childrenFeatures.add(InteractionPackage.Literals.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION);
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
	 * This returns InteractionRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InteractionRoot")); //$NON-NLS-1$
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
		return new StyledString(getString("_UI_InteractionRoot_type")); //$NON-NLS-1$
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

		switch (notification.getFeatureID(InteractionRoot.class)) {
			case InteractionPackage.INTERACTION_ROOT__INTERACTION_END:
			case InteractionPackage.INTERACTION_ROOT__INTERACTION:
			case InteractionPackage.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION:
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
				(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION_END,
				 InteractionFactory.eINSTANCE.createInternalEcuSender()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION_END,
				 InteractionFactory.eINSTANCE.createExternalEcuSender()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION_END,
				 InteractionFactory.eINSTANCE.createReceiver()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION_END,
				 InteractionFactory.eINSTANCE.createInternalEcuReceiver()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION_END,
				 InteractionFactory.eINSTANCE.createExternalEcuReceiver()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION_END,
				 InteractionFactory.eINSTANCE.createPeriodicComSendProxy()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION_END,
				 InteractionFactory.eINSTANCE.createImmediateComSendProxy()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION_END,
				 InteractionFactory.eINSTANCE.createExecutionContext()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION_END,
				 InteractionFactory.eINSTANCE.createOsTaskActivateEntityStarter()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION_END,
				 InteractionFactory.eINSTANCE.createOsEventSetEntityStarter()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION,
				 InteractionFactory.eINSTANCE.createSendInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION,
				 InteractionFactory.eINSTANCE.createReceiveInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION,
				 InteractionFactory.eINSTANCE.createComSendProxyInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION,
				 InteractionFactory.eINSTANCE.createRunnableEntityStartInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.INTERACTION_ROOT__INTERACTION,
				 InteractionFactory.eINSTANCE.createBswSchedulableEntityStartInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.INTERACTION_ROOT__GENERATED_ECU_CONFIGURATION,
				 InteractionFactory.eINSTANCE.createGeneratedEcuConfiguration()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RteEditPlugin.INSTANCE;
	}

}
