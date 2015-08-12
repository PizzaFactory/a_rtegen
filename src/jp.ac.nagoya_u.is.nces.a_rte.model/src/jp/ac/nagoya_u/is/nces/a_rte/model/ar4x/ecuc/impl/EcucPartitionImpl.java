/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  �嵭����Ԥϡ��ʲ���(1)��(4)�ξ������������˸¤ꡤ�ܥ��եȥ���
 *  �����ܥ��եȥ���������Ѥ�����Τ�ޤࡥ�ʲ�Ʊ���ˤ���ѡ�ʣ������
 *  �ѡ������ۡʰʲ������ѤȸƤ֡ˤ��뤳�Ȥ�̵���ǵ������롥
 *  (1) �ܥ��եȥ������򥽡��������ɤη������Ѥ�����ˤϡ��嵭������
 *      ��ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ��꤬�����Τޤޤη��ǥ���
 *      ����������˴ޤޤ�Ƥ��뤳�ȡ�
 *  (2) �ܥ��եȥ������򡤥饤�֥������ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ�����Ǻ����ۤ�����ˤϡ������ۤ�ȼ���ɥ�����ȡ�����
 *      �ԥޥ˥奢��ʤɡˤˡ��嵭�����ɽ�����������Ѿ�浪��Ӳ���
 *      ��̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *  (3) �ܥ��եȥ������򡤵�����Ȥ߹���ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ��ʤ����Ǻ����ۤ�����ˤϡ����Τ����줫�ξ�����������
 *      �ȡ�
 *    (a) �����ۤ�ȼ���ɥ�����ȡ����Ѽԥޥ˥奢��ʤɡˤˡ��嵭����
 *        �ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *    (b) �����ۤη��֤��̤�������ˡ�ˤ�äơ�TOPPERS�ץ������Ȥ�
 *        ��𤹤뤳�ȡ�
 *  (4) �ܥ��եȥ����������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������뤤���ʤ�»
 *      ������⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ����դ��뤳�ȡ�
 *      �ޤ����ܥ��եȥ������Υ桼���ޤ��ϥ���ɥ桼������Τ����ʤ���
 *      ͳ�˴�Ť����ᤫ��⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ�
 *      ���դ��뤳�ȡ�
 *
 *  �ܥ��եȥ������ϡ�AUTOSAR��AUTomotive Open System ARchitecture�˻�
 *  �ͤ˴�Ť��Ƥ��롥�嵭�ε����ϡ�AUTOSAR����Ū�⻺������������Τ�
 *  �Ϥʤ���AUTOSAR�ϡ�AUTOSAR���ͤ˴�Ť������եȥ�����������Ū����
 *  �Ѥ���Ԥ��Ф��ơ�AUTOSAR�ѡ��ȥʡ��ˤʤ뤳�Ȥ���Ƥ��롥
 *
 *  �ܥ��եȥ������ϡ�̵�ݾڤ��󶡤���Ƥ����ΤǤ��롥�嵭����Ԥ�
 *  ���TOPPERS�ץ������Ȥϡ��ܥ��եȥ������˴ؤ��ơ�����λ�����Ū
 *  ���Ф���Ŭ������ޤ�ơ������ʤ��ݾڤ�Ԥ�ʤ����ޤ����ܥ��եȥ���
 *  �������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������������ʤ�»���˴ؤ��Ƥ⡤��
 *  ����Ǥ�����ʤ���
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsApplication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionImpl#getEcucPartitionBswModuleExecution <em>Ecuc Partition Bsw Module Execution</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionImpl#getPartitionCanBeRestarted <em>Partition Can Be Restarted</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionImpl#getEcucPartitionSoftwareComponent <em>Ecuc Partition Software Component</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucPartitionImpl#getImplOsApplication <em>Impl Os Application</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcucPartitionImpl extends EcucContainerImpl implements EcucPartition {
	/**
	 * The default value of the '{@link #getEcucPartitionBswModuleExecution() <em>Ecuc Partition Bsw Module Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcucPartitionBswModuleExecution()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ECUC_PARTITION_BSW_MODULE_EXECUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEcucPartitionBswModuleExecution() <em>Ecuc Partition Bsw Module Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcucPartitionBswModuleExecution()
	 * @generated
	 * @ordered
	 */
	protected Boolean ecucPartitionBswModuleExecution = ECUC_PARTITION_BSW_MODULE_EXECUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartitionCanBeRestarted() <em>Partition Can Be Restarted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionCanBeRestarted()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PARTITION_CAN_BE_RESTARTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitionCanBeRestarted() <em>Partition Can Be Restarted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionCanBeRestarted()
	 * @generated
	 * @ordered
	 */
	protected Boolean partitionCanBeRestarted = PARTITION_CAN_BE_RESTARTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEcucPartitionSoftwareComponent() <em>Ecuc Partition Software Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcucPartitionSoftwareComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SwComponentInstanceInSystem> ecucPartitionSoftwareComponent;

	/**
	 * The cached value of the '{@link #getImplOsApplication() <em>Impl Os Application</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplOsApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<OsApplication> implOsApplication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcucPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.ECUC_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEcucPartitionBswModuleExecution() {
		return ecucPartitionBswModuleExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcucPartitionBswModuleExecution(Boolean newEcucPartitionBswModuleExecution) {
		Boolean oldEcucPartitionBswModuleExecution = ecucPartitionBswModuleExecution;
		ecucPartitionBswModuleExecution = newEcucPartitionBswModuleExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION, oldEcucPartitionBswModuleExecution, ecucPartitionBswModuleExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPartitionCanBeRestarted() {
		return partitionCanBeRestarted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionCanBeRestarted(Boolean newPartitionCanBeRestarted) {
		Boolean oldPartitionCanBeRestarted = partitionCanBeRestarted;
		partitionCanBeRestarted = newPartitionCanBeRestarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_PARTITION__PARTITION_CAN_BE_RESTARTED, oldPartitionCanBeRestarted, partitionCanBeRestarted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwComponentInstanceInSystem> getEcucPartitionSoftwareComponent() {
		if (ecucPartitionSoftwareComponent == null) {
			ecucPartitionSoftwareComponent = new EObjectWithInverseResolvingEList.ManyInverse<SwComponentInstanceInSystem>(SwComponentInstanceInSystem.class, this, EcucPackage.ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT, InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM__OWNER_PARTITION);
		}
		return ecucPartitionSoftwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsApplication> getImplOsApplication() {
		if (implOsApplication == null) {
			implOsApplication = new EObjectWithInverseResolvingEList<OsApplication>(OsApplication.class, this, EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION, EcucPackage.OS_APPLICATION__OS_APP_ECUC_PARTITION);
		}
		return implOsApplication;
	}

	/**
	 * The cached invocation delegate for the '{@link #isTrusted() <em>Is Trusted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrusted()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_TRUSTED__EINVOCATION_DELEGATE = ((EOperation.Internal)EcucPackage.Literals.ECUC_PARTITION___IS_TRUSTED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrusted() {
		try {
			return (Boolean)IS_TRUSTED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getOwnerCore() <em>Get Owner Core</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerCore()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_OWNER_CORE__EINVOCATION_DELEGATE = ((EOperation.Internal)EcucPackage.Literals.ECUC_PARTITION___GET_OWNER_CORE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOwnerCore() {
		try {
			return (Integer)GET_OWNER_CORE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEcucPartitionSoftwareComponent()).basicAdd(otherEnd, msgs);
			case EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplOsApplication()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT:
				return ((InternalEList<?>)getEcucPartitionSoftwareComponent()).basicRemove(otherEnd, msgs);
			case EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION:
				return ((InternalEList<?>)getImplOsApplication()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION:
				return getEcucPartitionBswModuleExecution();
			case EcucPackage.ECUC_PARTITION__PARTITION_CAN_BE_RESTARTED:
				return getPartitionCanBeRestarted();
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT:
				return getEcucPartitionSoftwareComponent();
			case EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION:
				return getImplOsApplication();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION:
				setEcucPartitionBswModuleExecution((Boolean)newValue);
				return;
			case EcucPackage.ECUC_PARTITION__PARTITION_CAN_BE_RESTARTED:
				setPartitionCanBeRestarted((Boolean)newValue);
				return;
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT:
				getEcucPartitionSoftwareComponent().clear();
				getEcucPartitionSoftwareComponent().addAll((Collection<? extends SwComponentInstanceInSystem>)newValue);
				return;
			case EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION:
				getImplOsApplication().clear();
				getImplOsApplication().addAll((Collection<? extends OsApplication>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION:
				setEcucPartitionBswModuleExecution(ECUC_PARTITION_BSW_MODULE_EXECUTION_EDEFAULT);
				return;
			case EcucPackage.ECUC_PARTITION__PARTITION_CAN_BE_RESTARTED:
				setPartitionCanBeRestarted(PARTITION_CAN_BE_RESTARTED_EDEFAULT);
				return;
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT:
				getEcucPartitionSoftwareComponent().clear();
				return;
			case EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION:
				getImplOsApplication().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_BSW_MODULE_EXECUTION:
				return ECUC_PARTITION_BSW_MODULE_EXECUTION_EDEFAULT == null ? ecucPartitionBswModuleExecution != null : !ECUC_PARTITION_BSW_MODULE_EXECUTION_EDEFAULT.equals(ecucPartitionBswModuleExecution);
			case EcucPackage.ECUC_PARTITION__PARTITION_CAN_BE_RESTARTED:
				return PARTITION_CAN_BE_RESTARTED_EDEFAULT == null ? partitionCanBeRestarted != null : !PARTITION_CAN_BE_RESTARTED_EDEFAULT.equals(partitionCanBeRestarted);
			case EcucPackage.ECUC_PARTITION__ECUC_PARTITION_SOFTWARE_COMPONENT:
				return ecucPartitionSoftwareComponent != null && !ecucPartitionSoftwareComponent.isEmpty();
			case EcucPackage.ECUC_PARTITION__IMPL_OS_APPLICATION:
				return implOsApplication != null && !implOsApplication.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcucPackage.ECUC_PARTITION___IS_TRUSTED:
				return isTrusted();
			case EcucPackage.ECUC_PARTITION___GET_OWNER_CORE:
				return getOwnerCore();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ecucPartitionBswModuleExecution: ");
		result.append(ecucPartitionBswModuleExecution);
		result.append(", partitionCanBeRestarted: ");
		result.append(partitionCanBeRestarted);
		result.append(')');
		return result.toString();
	}

} //EcucPartitionImpl
