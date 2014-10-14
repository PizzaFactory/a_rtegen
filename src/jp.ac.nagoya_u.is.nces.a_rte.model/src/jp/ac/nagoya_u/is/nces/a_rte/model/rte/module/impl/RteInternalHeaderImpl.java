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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntityGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionGroup;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Internal Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getGlobalVariableGroup <em>Global Variable Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getTrustedFunctionGroup <em>Trusted Function Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getBswSchedulableEntityGroup <em>Bsw Schedulable Entity Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getRteCoreStartApiImpl <em>Rte Core Start Api Impl</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getDependentExecutableEntityGroup <em>Dependent Executable Entity Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteInternalHeaderImpl#getSchmCoreInitApiImpl <em>Schm Core Init Api Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteInternalHeaderImpl extends HeaderFileImpl implements RteInternalHeader {
	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> constant;

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
	 * The cached value of the '{@link #getTrustedFunctionGroup() <em>Trusted Function Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustedFunctionGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<TrustedFunctionGroup> trustedFunctionGroup;

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
	 * The cached value of the '{@link #getRteCoreStartApiImpl() <em>Rte Core Start Api Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteCoreStartApiImpl()
	 * @generated
	 * @ordered
	 */
	protected RteCoreStartApiImpl rteCoreStartApiImpl;

	/**
	 * The cached value of the '{@link #getDependentExecutableEntityGroup() <em>Dependent Executable Entity Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentExecutableEntityGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableEntityGroup> dependentExecutableEntityGroup;

	/**
	 * The cached value of the '{@link #getSchmCoreInitApiImpl() <em>Schm Core Init Api Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmCoreInitApiImpl()
	 * @generated
	 * @ordered
	 */
	protected SchmCoreInitApiImpl schmCoreInitApiImpl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteInternalHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_INTERNAL_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getConstant() {
		if (constant == null) {
			constant = new EObjectResolvingEList<Constant>(Constant.class, this, ModulePackage.RTE_INTERNAL_HEADER__CONSTANT);
		}
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariableGroup> getGlobalVariableGroup() {
		if (globalVariableGroup == null) {
			globalVariableGroup = new EObjectContainmentEList<GlobalVariableGroup>(GlobalVariableGroup.class, this, ModulePackage.RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP);
		}
		return globalVariableGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrustedFunctionGroup> getTrustedFunctionGroup() {
		if (trustedFunctionGroup == null) {
			trustedFunctionGroup = new EObjectContainmentEList<TrustedFunctionGroup>(TrustedFunctionGroup.class, this, ModulePackage.RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP);
		}
		return trustedFunctionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswSchedulableEntityGroup> getBswSchedulableEntityGroup() {
		if (bswSchedulableEntityGroup == null) {
			bswSchedulableEntityGroup = new EObjectContainmentEList<BswSchedulableEntityGroup>(BswSchedulableEntityGroup.class, this, ModulePackage.RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP);
		}
		return bswSchedulableEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteCoreStartApiImpl getRteCoreStartApiImpl() {
		if (rteCoreStartApiImpl != null && ((EObject)rteCoreStartApiImpl).eIsProxy()) {
			InternalEObject oldRteCoreStartApiImpl = (InternalEObject)rteCoreStartApiImpl;
			rteCoreStartApiImpl = (RteCoreStartApiImpl)eResolveProxy(oldRteCoreStartApiImpl);
			if (rteCoreStartApiImpl != oldRteCoreStartApiImpl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL, oldRteCoreStartApiImpl, rteCoreStartApiImpl));
			}
		}
		return rteCoreStartApiImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteCoreStartApiImpl basicGetRteCoreStartApiImpl() {
		return rteCoreStartApiImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteCoreStartApiImpl(RteCoreStartApiImpl newRteCoreStartApiImpl) {
		RteCoreStartApiImpl oldRteCoreStartApiImpl = rteCoreStartApiImpl;
		rteCoreStartApiImpl = newRteCoreStartApiImpl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL, oldRteCoreStartApiImpl, rteCoreStartApiImpl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableEntityGroup> getDependentExecutableEntityGroup() {
		if (dependentExecutableEntityGroup == null) {
			dependentExecutableEntityGroup = new EObjectContainmentEList<ExecutableEntityGroup>(ExecutableEntityGroup.class, this, ModulePackage.RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP);
		}
		return dependentExecutableEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmCoreInitApiImpl getSchmCoreInitApiImpl() {
		if (schmCoreInitApiImpl != null && ((EObject)schmCoreInitApiImpl).eIsProxy()) {
			InternalEObject oldSchmCoreInitApiImpl = (InternalEObject)schmCoreInitApiImpl;
			schmCoreInitApiImpl = (SchmCoreInitApiImpl)eResolveProxy(oldSchmCoreInitApiImpl);
			if (schmCoreInitApiImpl != oldSchmCoreInitApiImpl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL, oldSchmCoreInitApiImpl, schmCoreInitApiImpl));
			}
		}
		return schmCoreInitApiImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmCoreInitApiImpl basicGetSchmCoreInitApiImpl() {
		return schmCoreInitApiImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchmCoreInitApiImpl(SchmCoreInitApiImpl newSchmCoreInitApiImpl) {
		SchmCoreInitApiImpl oldSchmCoreInitApiImpl = schmCoreInitApiImpl;
		schmCoreInitApiImpl = newSchmCoreInitApiImpl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL, oldSchmCoreInitApiImpl, schmCoreInitApiImpl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP:
				return ((InternalEList<?>)getGlobalVariableGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP:
				return ((InternalEList<?>)getTrustedFunctionGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP:
				return ((InternalEList<?>)getBswSchedulableEntityGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				return ((InternalEList<?>)getDependentExecutableEntityGroup()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.RTE_INTERNAL_HEADER__CONSTANT:
				return getConstant();
			case ModulePackage.RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP:
				return getGlobalVariableGroup();
			case ModulePackage.RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP:
				return getTrustedFunctionGroup();
			case ModulePackage.RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP:
				return getBswSchedulableEntityGroup();
			case ModulePackage.RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL:
				if (resolve) return getRteCoreStartApiImpl();
				return basicGetRteCoreStartApiImpl();
			case ModulePackage.RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				return getDependentExecutableEntityGroup();
			case ModulePackage.RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL:
				if (resolve) return getSchmCoreInitApiImpl();
				return basicGetSchmCoreInitApiImpl();
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
			case ModulePackage.RTE_INTERNAL_HEADER__CONSTANT:
				getConstant().clear();
				getConstant().addAll((Collection<? extends Constant>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP:
				getGlobalVariableGroup().clear();
				getGlobalVariableGroup().addAll((Collection<? extends GlobalVariableGroup>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP:
				getTrustedFunctionGroup().clear();
				getTrustedFunctionGroup().addAll((Collection<? extends TrustedFunctionGroup>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP:
				getBswSchedulableEntityGroup().clear();
				getBswSchedulableEntityGroup().addAll((Collection<? extends BswSchedulableEntityGroup>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL:
				setRteCoreStartApiImpl((RteCoreStartApiImpl)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				getDependentExecutableEntityGroup().clear();
				getDependentExecutableEntityGroup().addAll((Collection<? extends ExecutableEntityGroup>)newValue);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL:
				setSchmCoreInitApiImpl((SchmCoreInitApiImpl)newValue);
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
			case ModulePackage.RTE_INTERNAL_HEADER__CONSTANT:
				getConstant().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP:
				getGlobalVariableGroup().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP:
				getTrustedFunctionGroup().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP:
				getBswSchedulableEntityGroup().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL:
				setRteCoreStartApiImpl((RteCoreStartApiImpl)null);
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				getDependentExecutableEntityGroup().clear();
				return;
			case ModulePackage.RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL:
				setSchmCoreInitApiImpl((SchmCoreInitApiImpl)null);
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
			case ModulePackage.RTE_INTERNAL_HEADER__CONSTANT:
				return constant != null && !constant.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__GLOBAL_VARIABLE_GROUP:
				return globalVariableGroup != null && !globalVariableGroup.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__TRUSTED_FUNCTION_GROUP:
				return trustedFunctionGroup != null && !trustedFunctionGroup.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__BSW_SCHEDULABLE_ENTITY_GROUP:
				return bswSchedulableEntityGroup != null && !bswSchedulableEntityGroup.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__RTE_CORE_START_API_IMPL:
				return rteCoreStartApiImpl != null;
			case ModulePackage.RTE_INTERNAL_HEADER__DEPENDENT_EXECUTABLE_ENTITY_GROUP:
				return dependentExecutableEntityGroup != null && !dependentExecutableEntityGroup.isEmpty();
			case ModulePackage.RTE_INTERNAL_HEADER__SCHM_CORE_INIT_API_IMPL:
				return schmCoreInitApiImpl != null;
		}
		return super.eIsSet(featureID);
	}

} //RteInternalHeaderImpl
