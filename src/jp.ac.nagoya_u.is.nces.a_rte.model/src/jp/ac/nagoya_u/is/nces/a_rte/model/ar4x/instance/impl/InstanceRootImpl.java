/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2014 by Eiwa System Management, Inc., JAPAN
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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyDataInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.AssemblyOperationInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.DelegationDataInstanceConnector;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstanceRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.OperationInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.PortInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceRootImpl#getAssemblyDataInstanceConnector <em>Assembly Data Instance Connector</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceRootImpl#getDelegationDataInstanceConnector <em>Delegation Data Instance Connector</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceRootImpl#getSwComponentInstanceInSystem <em>Sw Component Instance In System</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceRootImpl#getPortInstanceInComposition <em>Port Instance In Composition</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceRootImpl#getVariableDataInstanceInSwc <em>Variable Data Instance In Swc</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceRootImpl#getOperationInstanceInSwc <em>Operation Instance In Swc</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.impl.InstanceRootImpl#getAssemblyOperationInstanceConnector <em>Assembly Operation Instance Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceRootImpl extends ExtendedEObjectImpl implements InstanceRoot {
	/**
	 * The cached value of the '{@link #getAssemblyDataInstanceConnector() <em>Assembly Data Instance Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyDataInstanceConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyDataInstanceConnector> assemblyDataInstanceConnector;

	/**
	 * The cached value of the '{@link #getDelegationDataInstanceConnector() <em>Delegation Data Instance Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationDataInstanceConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<DelegationDataInstanceConnector> delegationDataInstanceConnector;

	/**
	 * The cached value of the '{@link #getSwComponentInstanceInSystem() <em>Sw Component Instance In System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwComponentInstanceInSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<SwComponentInstanceInSystem> swComponentInstanceInSystem;

	/**
	 * The cached value of the '{@link #getPortInstanceInComposition() <em>Port Instance In Composition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInstanceInComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstanceInComposition> portInstanceInComposition;

	/**
	 * The cached value of the '{@link #getVariableDataInstanceInSwc() <em>Variable Data Instance In Swc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDataInstanceInSwc()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDataInstanceInSwc> variableDataInstanceInSwc;

	/**
	 * The cached value of the '{@link #getOperationInstanceInSwc() <em>Operation Instance In Swc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationInstanceInSwc()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationInstanceInSwc> operationInstanceInSwc;

	/**
	 * The cached value of the '{@link #getAssemblyOperationInstanceConnector() <em>Assembly Operation Instance Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyOperationInstanceConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyOperationInstanceConnector> assemblyOperationInstanceConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.INSTANCE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyDataInstanceConnector> getAssemblyDataInstanceConnector() {
		if (assemblyDataInstanceConnector == null) {
			assemblyDataInstanceConnector = new EObjectContainmentEList<AssemblyDataInstanceConnector>(AssemblyDataInstanceConnector.class, this, InstancePackage.INSTANCE_ROOT__ASSEMBLY_DATA_INSTANCE_CONNECTOR);
		}
		return assemblyDataInstanceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelegationDataInstanceConnector> getDelegationDataInstanceConnector() {
		if (delegationDataInstanceConnector == null) {
			delegationDataInstanceConnector = new EObjectContainmentEList<DelegationDataInstanceConnector>(DelegationDataInstanceConnector.class, this, InstancePackage.INSTANCE_ROOT__DELEGATION_DATA_INSTANCE_CONNECTOR);
		}
		return delegationDataInstanceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwComponentInstanceInSystem> getSwComponentInstanceInSystem() {
		if (swComponentInstanceInSystem == null) {
			swComponentInstanceInSystem = new EObjectContainmentEList<SwComponentInstanceInSystem>(SwComponentInstanceInSystem.class, this, InstancePackage.INSTANCE_ROOT__SW_COMPONENT_INSTANCE_IN_SYSTEM);
		}
		return swComponentInstanceInSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortInstanceInComposition> getPortInstanceInComposition() {
		if (portInstanceInComposition == null) {
			portInstanceInComposition = new EObjectContainmentEList<PortInstanceInComposition>(PortInstanceInComposition.class, this, InstancePackage.INSTANCE_ROOT__PORT_INSTANCE_IN_COMPOSITION);
		}
		return portInstanceInComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDataInstanceInSwc> getVariableDataInstanceInSwc() {
		if (variableDataInstanceInSwc == null) {
			variableDataInstanceInSwc = new EObjectContainmentEList<VariableDataInstanceInSwc>(VariableDataInstanceInSwc.class, this, InstancePackage.INSTANCE_ROOT__VARIABLE_DATA_INSTANCE_IN_SWC);
		}
		return variableDataInstanceInSwc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationInstanceInSwc> getOperationInstanceInSwc() {
		if (operationInstanceInSwc == null) {
			operationInstanceInSwc = new EObjectContainmentEList<OperationInstanceInSwc>(OperationInstanceInSwc.class, this, InstancePackage.INSTANCE_ROOT__OPERATION_INSTANCE_IN_SWC);
		}
		return operationInstanceInSwc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyOperationInstanceConnector> getAssemblyOperationInstanceConnector() {
		if (assemblyOperationInstanceConnector == null) {
			assemblyOperationInstanceConnector = new EObjectContainmentEList<AssemblyOperationInstanceConnector>(AssemblyOperationInstanceConnector.class, this, InstancePackage.INSTANCE_ROOT__ASSEMBLY_OPERATION_INSTANCE_CONNECTOR);
		}
		return assemblyOperationInstanceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.INSTANCE_ROOT__ASSEMBLY_DATA_INSTANCE_CONNECTOR:
				return ((InternalEList<?>)getAssemblyDataInstanceConnector()).basicRemove(otherEnd, msgs);
			case InstancePackage.INSTANCE_ROOT__DELEGATION_DATA_INSTANCE_CONNECTOR:
				return ((InternalEList<?>)getDelegationDataInstanceConnector()).basicRemove(otherEnd, msgs);
			case InstancePackage.INSTANCE_ROOT__SW_COMPONENT_INSTANCE_IN_SYSTEM:
				return ((InternalEList<?>)getSwComponentInstanceInSystem()).basicRemove(otherEnd, msgs);
			case InstancePackage.INSTANCE_ROOT__PORT_INSTANCE_IN_COMPOSITION:
				return ((InternalEList<?>)getPortInstanceInComposition()).basicRemove(otherEnd, msgs);
			case InstancePackage.INSTANCE_ROOT__VARIABLE_DATA_INSTANCE_IN_SWC:
				return ((InternalEList<?>)getVariableDataInstanceInSwc()).basicRemove(otherEnd, msgs);
			case InstancePackage.INSTANCE_ROOT__OPERATION_INSTANCE_IN_SWC:
				return ((InternalEList<?>)getOperationInstanceInSwc()).basicRemove(otherEnd, msgs);
			case InstancePackage.INSTANCE_ROOT__ASSEMBLY_OPERATION_INSTANCE_CONNECTOR:
				return ((InternalEList<?>)getAssemblyOperationInstanceConnector()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.INSTANCE_ROOT__ASSEMBLY_DATA_INSTANCE_CONNECTOR:
				return getAssemblyDataInstanceConnector();
			case InstancePackage.INSTANCE_ROOT__DELEGATION_DATA_INSTANCE_CONNECTOR:
				return getDelegationDataInstanceConnector();
			case InstancePackage.INSTANCE_ROOT__SW_COMPONENT_INSTANCE_IN_SYSTEM:
				return getSwComponentInstanceInSystem();
			case InstancePackage.INSTANCE_ROOT__PORT_INSTANCE_IN_COMPOSITION:
				return getPortInstanceInComposition();
			case InstancePackage.INSTANCE_ROOT__VARIABLE_DATA_INSTANCE_IN_SWC:
				return getVariableDataInstanceInSwc();
			case InstancePackage.INSTANCE_ROOT__OPERATION_INSTANCE_IN_SWC:
				return getOperationInstanceInSwc();
			case InstancePackage.INSTANCE_ROOT__ASSEMBLY_OPERATION_INSTANCE_CONNECTOR:
				return getAssemblyOperationInstanceConnector();
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
			case InstancePackage.INSTANCE_ROOT__ASSEMBLY_DATA_INSTANCE_CONNECTOR:
				getAssemblyDataInstanceConnector().clear();
				getAssemblyDataInstanceConnector().addAll((Collection<? extends AssemblyDataInstanceConnector>)newValue);
				return;
			case InstancePackage.INSTANCE_ROOT__DELEGATION_DATA_INSTANCE_CONNECTOR:
				getDelegationDataInstanceConnector().clear();
				getDelegationDataInstanceConnector().addAll((Collection<? extends DelegationDataInstanceConnector>)newValue);
				return;
			case InstancePackage.INSTANCE_ROOT__SW_COMPONENT_INSTANCE_IN_SYSTEM:
				getSwComponentInstanceInSystem().clear();
				getSwComponentInstanceInSystem().addAll((Collection<? extends SwComponentInstanceInSystem>)newValue);
				return;
			case InstancePackage.INSTANCE_ROOT__PORT_INSTANCE_IN_COMPOSITION:
				getPortInstanceInComposition().clear();
				getPortInstanceInComposition().addAll((Collection<? extends PortInstanceInComposition>)newValue);
				return;
			case InstancePackage.INSTANCE_ROOT__VARIABLE_DATA_INSTANCE_IN_SWC:
				getVariableDataInstanceInSwc().clear();
				getVariableDataInstanceInSwc().addAll((Collection<? extends VariableDataInstanceInSwc>)newValue);
				return;
			case InstancePackage.INSTANCE_ROOT__OPERATION_INSTANCE_IN_SWC:
				getOperationInstanceInSwc().clear();
				getOperationInstanceInSwc().addAll((Collection<? extends OperationInstanceInSwc>)newValue);
				return;
			case InstancePackage.INSTANCE_ROOT__ASSEMBLY_OPERATION_INSTANCE_CONNECTOR:
				getAssemblyOperationInstanceConnector().clear();
				getAssemblyOperationInstanceConnector().addAll((Collection<? extends AssemblyOperationInstanceConnector>)newValue);
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
			case InstancePackage.INSTANCE_ROOT__ASSEMBLY_DATA_INSTANCE_CONNECTOR:
				getAssemblyDataInstanceConnector().clear();
				return;
			case InstancePackage.INSTANCE_ROOT__DELEGATION_DATA_INSTANCE_CONNECTOR:
				getDelegationDataInstanceConnector().clear();
				return;
			case InstancePackage.INSTANCE_ROOT__SW_COMPONENT_INSTANCE_IN_SYSTEM:
				getSwComponentInstanceInSystem().clear();
				return;
			case InstancePackage.INSTANCE_ROOT__PORT_INSTANCE_IN_COMPOSITION:
				getPortInstanceInComposition().clear();
				return;
			case InstancePackage.INSTANCE_ROOT__VARIABLE_DATA_INSTANCE_IN_SWC:
				getVariableDataInstanceInSwc().clear();
				return;
			case InstancePackage.INSTANCE_ROOT__OPERATION_INSTANCE_IN_SWC:
				getOperationInstanceInSwc().clear();
				return;
			case InstancePackage.INSTANCE_ROOT__ASSEMBLY_OPERATION_INSTANCE_CONNECTOR:
				getAssemblyOperationInstanceConnector().clear();
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
			case InstancePackage.INSTANCE_ROOT__ASSEMBLY_DATA_INSTANCE_CONNECTOR:
				return assemblyDataInstanceConnector != null && !assemblyDataInstanceConnector.isEmpty();
			case InstancePackage.INSTANCE_ROOT__DELEGATION_DATA_INSTANCE_CONNECTOR:
				return delegationDataInstanceConnector != null && !delegationDataInstanceConnector.isEmpty();
			case InstancePackage.INSTANCE_ROOT__SW_COMPONENT_INSTANCE_IN_SYSTEM:
				return swComponentInstanceInSystem != null && !swComponentInstanceInSystem.isEmpty();
			case InstancePackage.INSTANCE_ROOT__PORT_INSTANCE_IN_COMPOSITION:
				return portInstanceInComposition != null && !portInstanceInComposition.isEmpty();
			case InstancePackage.INSTANCE_ROOT__VARIABLE_DATA_INSTANCE_IN_SWC:
				return variableDataInstanceInSwc != null && !variableDataInstanceInSwc.isEmpty();
			case InstancePackage.INSTANCE_ROOT__OPERATION_INSTANCE_IN_SWC:
				return operationInstanceInSwc != null && !operationInstanceInSwc.isEmpty();
			case InstancePackage.INSTANCE_ROOT__ASSEMBLY_OPERATION_INSTANCE_CONNECTOR:
				return assemblyOperationInstanceConnector != null && !assemblyOperationInstanceConnector.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstanceRootImpl
