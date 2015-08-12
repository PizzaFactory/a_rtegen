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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntityGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallbackGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ProxyApiGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApiGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignalApiGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBodyGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionGroup;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getGlobalVariableGroup <em>Global Variable Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getBswSchedulableEntityGroup <em>Bsw Schedulable Entity Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getRteApiGroup <em>Rte Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getRteLifecycleApiGroup <em>Rte Lifecycle Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getTaskBodyGroup <em>Task Body Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getComCallbackGroup <em>Com Callback Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getTrustedFunctionGroup <em>Trusted Function Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getSourceMacro <em>Source Macro</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getSchmLifecycleApiGroup <em>Schm Lifecycle Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getSchmApiGroup <em>Schm Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getSignalApiGroup <em>Signal Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteSourceImpl#getProxyApiGroup <em>Proxy Api Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteSourceImpl extends SourceFileImpl implements RteSource {
	/**
	 * The cached value of the '{@link #getGlobalVariableGroup() <em>Global Variable Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariableGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariableGroup> globalVariableGroup;

	/**
	 * The cached value of the '{@link #getBswSchedulableEntityGroup() <em>Bsw Schedulable Entity Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswSchedulableEntityGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<BswSchedulableEntityGroup> bswSchedulableEntityGroup;

	/**
	 * The cached value of the '{@link #getRteApiGroup() <em>Rte Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<RteApiGroup> rteApiGroup;

	/**
	 * The cached value of the '{@link #getRteLifecycleApiGroup() <em>Rte Lifecycle Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteLifecycleApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<RteLifecycleApiGroup> rteLifecycleApiGroup;

	/**
	 * The cached value of the '{@link #getTaskBodyGroup() <em>Task Body Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskBodyGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskBodyGroup> taskBodyGroup;

	/**
	 * The cached value of the '{@link #getComCallbackGroup() <em>Com Callback Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComCallbackGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ComCallbackGroup> comCallbackGroup;

	/**
	 * The cached value of the '{@link #getTrustedFunctionGroup() <em>Trusted Function Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustedFunctionGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<TrustedFunctionGroup> trustedFunctionGroup;

	/**
	 * The cached value of the '{@link #getSourceMacro() <em>Source Macro</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMacro()
	 * @generated
	 * @ordered
	 */
	protected EList<Macro> sourceMacro;

	/**
	 * The cached value of the '{@link #getSchmLifecycleApiGroup() <em>Schm Lifecycle Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmLifecycleApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<SchmLifecycleApiGroup> schmLifecycleApiGroup;

	/**
	 * The cached value of the '{@link #getSchmApiGroup() <em>Schm Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<SchmApiGroup> schmApiGroup;

	/**
	 * The cached value of the '{@link #getSignalApiGroup() <em>Signal Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalApiGroup> signalApiGroup;

	/**
	 * The cached value of the '{@link #getProxyApiGroup() <em>Proxy Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ProxyApiGroup> proxyApiGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariableGroup> getGlobalVariableGroup() {
		if (globalVariableGroup == null) {
			globalVariableGroup = new EObjectContainmentEList<GlobalVariableGroup>(GlobalVariableGroup.class, this, ModulePackage.RTE_SOURCE__GLOBAL_VARIABLE_GROUP);
		}
		return globalVariableGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswSchedulableEntityGroup> getBswSchedulableEntityGroup() {
		if (bswSchedulableEntityGroup == null) {
			bswSchedulableEntityGroup = new EObjectContainmentEList<BswSchedulableEntityGroup>(BswSchedulableEntityGroup.class, this, ModulePackage.RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP);
		}
		return bswSchedulableEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteApiGroup> getRteApiGroup() {
		if (rteApiGroup == null) {
			rteApiGroup = new EObjectContainmentEList<RteApiGroup>(RteApiGroup.class, this, ModulePackage.RTE_SOURCE__RTE_API_GROUP);
		}
		return rteApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteLifecycleApiGroup> getRteLifecycleApiGroup() {
		if (rteLifecycleApiGroup == null) {
			rteLifecycleApiGroup = new EObjectContainmentEList<RteLifecycleApiGroup>(RteLifecycleApiGroup.class, this, ModulePackage.RTE_SOURCE__RTE_LIFECYCLE_API_GROUP);
		}
		return rteLifecycleApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskBodyGroup> getTaskBodyGroup() {
		if (taskBodyGroup == null) {
			taskBodyGroup = new EObjectContainmentEList<TaskBodyGroup>(TaskBodyGroup.class, this, ModulePackage.RTE_SOURCE__TASK_BODY_GROUP);
		}
		return taskBodyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComCallbackGroup> getComCallbackGroup() {
		if (comCallbackGroup == null) {
			comCallbackGroup = new EObjectContainmentEList<ComCallbackGroup>(ComCallbackGroup.class, this, ModulePackage.RTE_SOURCE__COM_CALLBACK_GROUP);
		}
		return comCallbackGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrustedFunctionGroup> getTrustedFunctionGroup() {
		if (trustedFunctionGroup == null) {
			trustedFunctionGroup = new EObjectContainmentEList<TrustedFunctionGroup>(TrustedFunctionGroup.class, this, ModulePackage.RTE_SOURCE__TRUSTED_FUNCTION_GROUP);
		}
		return trustedFunctionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Macro> getSourceMacro() {
		if (sourceMacro == null) {
			sourceMacro = new EObjectResolvingEList<Macro>(Macro.class, this, ModulePackage.RTE_SOURCE__SOURCE_MACRO);
		}
		return sourceMacro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchmLifecycleApiGroup> getSchmLifecycleApiGroup() {
		if (schmLifecycleApiGroup == null) {
			schmLifecycleApiGroup = new EObjectContainmentEList<SchmLifecycleApiGroup>(SchmLifecycleApiGroup.class, this, ModulePackage.RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP);
		}
		return schmLifecycleApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchmApiGroup> getSchmApiGroup() {
		if (schmApiGroup == null) {
			schmApiGroup = new EObjectContainmentEList<SchmApiGroup>(SchmApiGroup.class, this, ModulePackage.RTE_SOURCE__SCHM_API_GROUP);
		}
		return schmApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalApiGroup> getSignalApiGroup() {
		if (signalApiGroup == null) {
			signalApiGroup = new EObjectContainmentEList<SignalApiGroup>(SignalApiGroup.class, this, ModulePackage.RTE_SOURCE__SIGNAL_API_GROUP);
		}
		return signalApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProxyApiGroup> getProxyApiGroup() {
		if (proxyApiGroup == null) {
			proxyApiGroup = new EObjectContainmentEList<ProxyApiGroup>(ProxyApiGroup.class, this, ModulePackage.RTE_SOURCE__PROXY_API_GROUP);
		}
		return proxyApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_SOURCE__GLOBAL_VARIABLE_GROUP:
				return ((InternalEList<?>)getGlobalVariableGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP:
				return ((InternalEList<?>)getBswSchedulableEntityGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__RTE_API_GROUP:
				return ((InternalEList<?>)getRteApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__RTE_LIFECYCLE_API_GROUP:
				return ((InternalEList<?>)getRteLifecycleApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__TASK_BODY_GROUP:
				return ((InternalEList<?>)getTaskBodyGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__COM_CALLBACK_GROUP:
				return ((InternalEList<?>)getComCallbackGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__TRUSTED_FUNCTION_GROUP:
				return ((InternalEList<?>)getTrustedFunctionGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP:
				return ((InternalEList<?>)getSchmLifecycleApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__SCHM_API_GROUP:
				return ((InternalEList<?>)getSchmApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__SIGNAL_API_GROUP:
				return ((InternalEList<?>)getSignalApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_SOURCE__PROXY_API_GROUP:
				return ((InternalEList<?>)getProxyApiGroup()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.RTE_SOURCE__GLOBAL_VARIABLE_GROUP:
				return getGlobalVariableGroup();
			case ModulePackage.RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP:
				return getBswSchedulableEntityGroup();
			case ModulePackage.RTE_SOURCE__RTE_API_GROUP:
				return getRteApiGroup();
			case ModulePackage.RTE_SOURCE__RTE_LIFECYCLE_API_GROUP:
				return getRteLifecycleApiGroup();
			case ModulePackage.RTE_SOURCE__TASK_BODY_GROUP:
				return getTaskBodyGroup();
			case ModulePackage.RTE_SOURCE__COM_CALLBACK_GROUP:
				return getComCallbackGroup();
			case ModulePackage.RTE_SOURCE__TRUSTED_FUNCTION_GROUP:
				return getTrustedFunctionGroup();
			case ModulePackage.RTE_SOURCE__SOURCE_MACRO:
				return getSourceMacro();
			case ModulePackage.RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP:
				return getSchmLifecycleApiGroup();
			case ModulePackage.RTE_SOURCE__SCHM_API_GROUP:
				return getSchmApiGroup();
			case ModulePackage.RTE_SOURCE__SIGNAL_API_GROUP:
				return getSignalApiGroup();
			case ModulePackage.RTE_SOURCE__PROXY_API_GROUP:
				return getProxyApiGroup();
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
			case ModulePackage.RTE_SOURCE__GLOBAL_VARIABLE_GROUP:
				getGlobalVariableGroup().clear();
				getGlobalVariableGroup().addAll((Collection<? extends GlobalVariableGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP:
				getBswSchedulableEntityGroup().clear();
				getBswSchedulableEntityGroup().addAll((Collection<? extends BswSchedulableEntityGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__RTE_API_GROUP:
				getRteApiGroup().clear();
				getRteApiGroup().addAll((Collection<? extends RteApiGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__RTE_LIFECYCLE_API_GROUP:
				getRteLifecycleApiGroup().clear();
				getRteLifecycleApiGroup().addAll((Collection<? extends RteLifecycleApiGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__TASK_BODY_GROUP:
				getTaskBodyGroup().clear();
				getTaskBodyGroup().addAll((Collection<? extends TaskBodyGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__COM_CALLBACK_GROUP:
				getComCallbackGroup().clear();
				getComCallbackGroup().addAll((Collection<? extends ComCallbackGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__TRUSTED_FUNCTION_GROUP:
				getTrustedFunctionGroup().clear();
				getTrustedFunctionGroup().addAll((Collection<? extends TrustedFunctionGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__SOURCE_MACRO:
				getSourceMacro().clear();
				getSourceMacro().addAll((Collection<? extends Macro>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP:
				getSchmLifecycleApiGroup().clear();
				getSchmLifecycleApiGroup().addAll((Collection<? extends SchmLifecycleApiGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__SCHM_API_GROUP:
				getSchmApiGroup().clear();
				getSchmApiGroup().addAll((Collection<? extends SchmApiGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__SIGNAL_API_GROUP:
				getSignalApiGroup().clear();
				getSignalApiGroup().addAll((Collection<? extends SignalApiGroup>)newValue);
				return;
			case ModulePackage.RTE_SOURCE__PROXY_API_GROUP:
				getProxyApiGroup().clear();
				getProxyApiGroup().addAll((Collection<? extends ProxyApiGroup>)newValue);
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
			case ModulePackage.RTE_SOURCE__GLOBAL_VARIABLE_GROUP:
				getGlobalVariableGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP:
				getBswSchedulableEntityGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__RTE_API_GROUP:
				getRteApiGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__RTE_LIFECYCLE_API_GROUP:
				getRteLifecycleApiGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__TASK_BODY_GROUP:
				getTaskBodyGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__COM_CALLBACK_GROUP:
				getComCallbackGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__TRUSTED_FUNCTION_GROUP:
				getTrustedFunctionGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__SOURCE_MACRO:
				getSourceMacro().clear();
				return;
			case ModulePackage.RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP:
				getSchmLifecycleApiGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__SCHM_API_GROUP:
				getSchmApiGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__SIGNAL_API_GROUP:
				getSignalApiGroup().clear();
				return;
			case ModulePackage.RTE_SOURCE__PROXY_API_GROUP:
				getProxyApiGroup().clear();
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
			case ModulePackage.RTE_SOURCE__GLOBAL_VARIABLE_GROUP:
				return globalVariableGroup != null && !globalVariableGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__BSW_SCHEDULABLE_ENTITY_GROUP:
				return bswSchedulableEntityGroup != null && !bswSchedulableEntityGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__RTE_API_GROUP:
				return rteApiGroup != null && !rteApiGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__RTE_LIFECYCLE_API_GROUP:
				return rteLifecycleApiGroup != null && !rteLifecycleApiGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__TASK_BODY_GROUP:
				return taskBodyGroup != null && !taskBodyGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__COM_CALLBACK_GROUP:
				return comCallbackGroup != null && !comCallbackGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__TRUSTED_FUNCTION_GROUP:
				return trustedFunctionGroup != null && !trustedFunctionGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__SOURCE_MACRO:
				return sourceMacro != null && !sourceMacro.isEmpty();
			case ModulePackage.RTE_SOURCE__SCHM_LIFECYCLE_API_GROUP:
				return schmLifecycleApiGroup != null && !schmLifecycleApiGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__SCHM_API_GROUP:
				return schmApiGroup != null && !schmApiGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__SIGNAL_API_GROUP:
				return signalApiGroup != null && !signalApiGroup.isEmpty();
			case ModulePackage.RTE_SOURCE__PROXY_API_GROUP:
				return proxyApiGroup != null && !proxyApiGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RteSourceImpl
