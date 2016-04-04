/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.EntityStarter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityStarterItemProvider extends InteractionEndItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityStarterItemProvider(AdapterFactory adapterFactory) {
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

			addExecutionContextPropertyDescriptor(object);
			addExpectedConfigPropertyDescriptor(object);
			addStartInteractionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Execution Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityStarter_executionContext_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityStarter_executionContext_feature", "_UI_EntityStarter_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 InteractionPackage.Literals.ENTITY_STARTER__EXECUTION_CONTEXT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expected Config feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpectedConfigPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityStarter_expectedConfig_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityStarter_expectedConfig_feature", "_UI_EntityStarter_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 InteractionPackage.Literals.ENTITY_STARTER__EXPECTED_CONFIG,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Interaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartInteractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityStarter_startInteraction_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityStarter_startInteraction_feature", "_UI_EntityStarter_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 InteractionPackage.Literals.ENTITY_STARTER__START_INTERACTION,
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
			childrenFeatures.add(InteractionPackage.Literals.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION);
			childrenFeatures.add(InteractionPackage.Literals.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EntityStarter)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_EntityStarter_type") : //$NON-NLS-1$
			getString("_UI_EntityStarter_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(EntityStarter.class)) {
			case InteractionPackage.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION:
			case InteractionPackage.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION:
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
				(InteractionPackage.Literals.ENTITY_STARTER__START_OFFSET_COUNTER_IMPLEMENTATION,
				 InteractionFactory.eINSTANCE.createStartOffsetCounterImplementation()));

		newChildDescriptors.add
			(createChildParameter
				(InteractionPackage.Literals.ENTITY_STARTER__CYCLE_COUNTER_IMPLEMENTATION,
				 InteractionFactory.eINSTANCE.createCycleCounterImplementation()));
	}

}
