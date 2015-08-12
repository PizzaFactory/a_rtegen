/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
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
