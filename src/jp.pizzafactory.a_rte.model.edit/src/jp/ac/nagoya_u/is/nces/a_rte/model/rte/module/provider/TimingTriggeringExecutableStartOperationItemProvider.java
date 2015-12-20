/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.provider;


import java.util.Collection;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimingTriggeringExecutableStartOperationItemProvider extends ExecutableStartOperationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingTriggeringExecutableStartOperationItemProvider(AdapterFactory adapterFactory) {
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

			addCyclePeriodConstantPropertyDescriptor(object);
			addCycleOffsetConstantPropertyDescriptor(object);
			addStartOffsetConstantPropertyDescriptor(object);
			addStartOffsetCounterVariablePropertyDescriptor(object);
			addCycleCounterVariablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cycle Period Constant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCyclePeriodConstantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimingTriggeringExecutableStartOperation_cyclePeriodConstant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimingTriggeringExecutableStartOperation_cyclePeriodConstant_feature", "_UI_TimingTriggeringExecutableStartOperation_type"),
				 ModulePackage.Literals.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_PERIOD_CONSTANT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cycle Offset Constant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCycleOffsetConstantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimingTriggeringExecutableStartOperation_cycleOffsetConstant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimingTriggeringExecutableStartOperation_cycleOffsetConstant_feature", "_UI_TimingTriggeringExecutableStartOperation_type"),
				 ModulePackage.Literals.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_OFFSET_CONSTANT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Offset Constant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartOffsetConstantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimingTriggeringExecutableStartOperation_startOffsetConstant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimingTriggeringExecutableStartOperation_startOffsetConstant_feature", "_UI_TimingTriggeringExecutableStartOperation_type"),
				 ModulePackage.Literals.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_CONSTANT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Offset Counter Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartOffsetCounterVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimingTriggeringExecutableStartOperation_startOffsetCounterVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimingTriggeringExecutableStartOperation_startOffsetCounterVariable_feature", "_UI_TimingTriggeringExecutableStartOperation_type"),
				 ModulePackage.Literals.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__START_OFFSET_COUNTER_VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cycle Counter Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCycleCounterVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimingTriggeringExecutableStartOperation_cycleCounterVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimingTriggeringExecutableStartOperation_cycleCounterVariable_feature", "_UI_TimingTriggeringExecutableStartOperation_type"),
				 ModulePackage.Literals.TIMING_TRIGGERING_EXECUTABLE_START_OPERATION__CYCLE_COUNTER_VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns TimingTriggeringExecutableStartOperation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TimingTriggeringExecutableStartOperation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TimingTriggeringExecutableStartOperation)object).getRoleName();
		return label == null || label.length() == 0 ?
			getString("_UI_TimingTriggeringExecutableStartOperation_type") :
			getString("_UI_TimingTriggeringExecutableStartOperation_type") + " " + label;
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
