/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RunnableEntityItemProvider extends ExecutableEntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableEntityItemProvider(AdapterFactory adapterFactory) {
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

			addEventPropertyDescriptor(object);
			addSymbolPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RunnableEntity_event_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RunnableEntity_event_feature", "_UI_RunnableEntity_type"),
				 M2Package.Literals.RUNNABLE_ENTITY__EVENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Symbol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSymbolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RunnableEntity_symbol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RunnableEntity_symbol_feature", "_UI_RunnableEntity_type"),
				 M2Package.Literals.RUNNABLE_ENTITY__SYMBOL,
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
			childrenFeatures.add(M2Package.Literals.RUNNABLE_ENTITY__DATA_SEND_POINT);
			childrenFeatures.add(M2Package.Literals.RUNNABLE_ENTITY__DATA_RECEIVE_POINT_BY_ARGUMENT);
			childrenFeatures.add(M2Package.Literals.RUNNABLE_ENTITY__SERVER_CALL_POINT);
			childrenFeatures.add(M2Package.Literals.RUNNABLE_ENTITY__WRITTEN_LOCAL_VARIABLE);
			childrenFeatures.add(M2Package.Literals.RUNNABLE_ENTITY__READ_LOCAL_VARIABLE);
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
	 * This returns RunnableEntity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RunnableEntity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RunnableEntity)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_RunnableEntity_type") :
			getString("_UI_RunnableEntity_type") + " " + label;
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

		switch (notification.getFeatureID(RunnableEntity.class)) {
			case M2Package.RUNNABLE_ENTITY__SYMBOL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case M2Package.RUNNABLE_ENTITY__DATA_SEND_POINT:
			case M2Package.RUNNABLE_ENTITY__DATA_RECEIVE_POINT_BY_ARGUMENT:
			case M2Package.RUNNABLE_ENTITY__SERVER_CALL_POINT:
			case M2Package.RUNNABLE_ENTITY__WRITTEN_LOCAL_VARIABLE:
			case M2Package.RUNNABLE_ENTITY__READ_LOCAL_VARIABLE:
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
				(M2Package.Literals.RUNNABLE_ENTITY__DATA_SEND_POINT,
				 M2Factory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.RUNNABLE_ENTITY__DATA_RECEIVE_POINT_BY_ARGUMENT,
				 M2Factory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.RUNNABLE_ENTITY__SERVER_CALL_POINT,
				 M2Factory.eINSTANCE.createSynchronousServerCallPoint()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.RUNNABLE_ENTITY__WRITTEN_LOCAL_VARIABLE,
				 M2Factory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add
			(createChildParameter
				(M2Package.Literals.RUNNABLE_ENTITY__READ_LOCAL_VARIABLE,
				 M2Factory.eINSTANCE.createVariableAccess()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == M2Package.Literals.RUNNABLE_ENTITY__DATA_SEND_POINT ||
			childFeature == M2Package.Literals.RUNNABLE_ENTITY__DATA_RECEIVE_POINT_BY_ARGUMENT ||
			childFeature == M2Package.Literals.RUNNABLE_ENTITY__WRITTEN_LOCAL_VARIABLE ||
			childFeature == M2Package.Literals.RUNNABLE_ENTITY__READ_LOCAL_VARIABLE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
