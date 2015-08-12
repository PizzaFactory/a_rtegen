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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CoreImpl#getPartition <em>Partition</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CoreImpl#getRteStartApi <em>Rte Start Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CoreImpl#getCoreId <em>Core Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CoreImpl#getIsMasterCore <em>Is Master Core</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CoreImpl#getSchmInitApi <em>Schm Init Api</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoreImpl extends LogicalCompartmentImpl implements Core {
	/**
	 * The cached value of the '{@link #getPartition() <em>Partition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartition()
	 * @generated
	 * @ordered
	 */
	protected EList<Partition> partition;

	/**
	 * The cached value of the '{@link #getRteStartApi() <em>Rte Start Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteStartApi()
	 * @generated
	 * @ordered
	 */
	protected RteCoreStartApiImpl rteStartApi;

	/**
	 * The default value of the '{@link #getCoreId() <em>Core Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CORE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoreId() <em>Core Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreId()
	 * @generated
	 * @ordered
	 */
	protected Integer coreId = CORE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsMasterCore() <em>Is Master Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMasterCore()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MASTER_CORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsMasterCore() <em>Is Master Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMasterCore()
	 * @generated
	 * @ordered
	 */
	protected Boolean isMasterCore = IS_MASTER_CORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchmInitApi() <em>Schm Init Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmInitApi()
	 * @generated
	 * @ordered
	 */
	protected SchmCoreInitApiImpl schmInitApi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Partition> getPartition() {
		if (partition == null) {
			partition = new EObjectContainmentWithInverseEList<Partition>(Partition.class, this, ModulePackage.CORE__PARTITION, ModulePackage.PARTITION__PARENT);
		}
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteCoreStartApiImpl getRteStartApi() {
		return rteStartApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRteStartApi(RteCoreStartApiImpl newRteStartApi, NotificationChain msgs) {
		RteCoreStartApiImpl oldRteStartApi = rteStartApi;
		rteStartApi = newRteStartApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.CORE__RTE_START_API, oldRteStartApi, newRteStartApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRteStartApi(RteCoreStartApiImpl newRteStartApi) {
		if (newRteStartApi != rteStartApi) {
			NotificationChain msgs = null;
			if (rteStartApi != null)
				msgs = ((InternalEObject)rteStartApi).eInverseRemove(this, ModulePackage.RTE_CORE_START_API_IMPL__PARENT, RteCoreStartApiImpl.class, msgs);
			if (newRteStartApi != null)
				msgs = ((InternalEObject)newRteStartApi).eInverseAdd(this, ModulePackage.RTE_CORE_START_API_IMPL__PARENT, RteCoreStartApiImpl.class, msgs);
			msgs = basicSetRteStartApi(newRteStartApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CORE__RTE_START_API, newRteStartApi, newRteStartApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCoreId() {
		return coreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreId(Integer newCoreId) {
		Integer oldCoreId = coreId;
		coreId = newCoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CORE__CORE_ID, oldCoreId, coreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMasterCore() {
		return isMasterCore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMasterCore(Boolean newIsMasterCore) {
		Boolean oldIsMasterCore = isMasterCore;
		isMasterCore = newIsMasterCore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CORE__IS_MASTER_CORE, oldIsMasterCore, isMasterCore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchmCoreInitApiImpl getSchmInitApi() {
		return schmInitApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchmInitApi(SchmCoreInitApiImpl newSchmInitApi, NotificationChain msgs) {
		SchmCoreInitApiImpl oldSchmInitApi = schmInitApi;
		schmInitApi = newSchmInitApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.CORE__SCHM_INIT_API, oldSchmInitApi, newSchmInitApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchmInitApi(SchmCoreInitApiImpl newSchmInitApi) {
		if (newSchmInitApi != schmInitApi) {
			NotificationChain msgs = null;
			if (schmInitApi != null)
				msgs = ((InternalEObject)schmInitApi).eInverseRemove(this, ModulePackage.SCHM_CORE_INIT_API_IMPL__PARENT, SchmCoreInitApiImpl.class, msgs);
			if (newSchmInitApi != null)
				msgs = ((InternalEObject)newSchmInitApi).eInverseAdd(this, ModulePackage.SCHM_CORE_INIT_API_IMPL__PARENT, SchmCoreInitApiImpl.class, msgs);
			msgs = basicSetSchmInitApi(newSchmInitApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CORE__SCHM_INIT_API, newSchmInitApi, newSchmInitApi));
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
			case ModulePackage.CORE__PARTITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartition()).basicAdd(otherEnd, msgs);
			case ModulePackage.CORE__RTE_START_API:
				if (rteStartApi != null)
					msgs = ((InternalEObject)rteStartApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.CORE__RTE_START_API, null, msgs);
				return basicSetRteStartApi((RteCoreStartApiImpl)otherEnd, msgs);
			case ModulePackage.CORE__SCHM_INIT_API:
				if (schmInitApi != null)
					msgs = ((InternalEObject)schmInitApi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.CORE__SCHM_INIT_API, null, msgs);
				return basicSetSchmInitApi((SchmCoreInitApiImpl)otherEnd, msgs);
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
			case ModulePackage.CORE__PARTITION:
				return ((InternalEList<?>)getPartition()).basicRemove(otherEnd, msgs);
			case ModulePackage.CORE__RTE_START_API:
				return basicSetRteStartApi(null, msgs);
			case ModulePackage.CORE__SCHM_INIT_API:
				return basicSetSchmInitApi(null, msgs);
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
			case ModulePackage.CORE__PARTITION:
				return getPartition();
			case ModulePackage.CORE__RTE_START_API:
				return getRteStartApi();
			case ModulePackage.CORE__CORE_ID:
				return getCoreId();
			case ModulePackage.CORE__IS_MASTER_CORE:
				return getIsMasterCore();
			case ModulePackage.CORE__SCHM_INIT_API:
				return getSchmInitApi();
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
			case ModulePackage.CORE__PARTITION:
				getPartition().clear();
				getPartition().addAll((Collection<? extends Partition>)newValue);
				return;
			case ModulePackage.CORE__RTE_START_API:
				setRteStartApi((RteCoreStartApiImpl)newValue);
				return;
			case ModulePackage.CORE__CORE_ID:
				setCoreId((Integer)newValue);
				return;
			case ModulePackage.CORE__IS_MASTER_CORE:
				setIsMasterCore((Boolean)newValue);
				return;
			case ModulePackage.CORE__SCHM_INIT_API:
				setSchmInitApi((SchmCoreInitApiImpl)newValue);
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
			case ModulePackage.CORE__PARTITION:
				getPartition().clear();
				return;
			case ModulePackage.CORE__RTE_START_API:
				setRteStartApi((RteCoreStartApiImpl)null);
				return;
			case ModulePackage.CORE__CORE_ID:
				setCoreId(CORE_ID_EDEFAULT);
				return;
			case ModulePackage.CORE__IS_MASTER_CORE:
				setIsMasterCore(IS_MASTER_CORE_EDEFAULT);
				return;
			case ModulePackage.CORE__SCHM_INIT_API:
				setSchmInitApi((SchmCoreInitApiImpl)null);
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
			case ModulePackage.CORE__PARTITION:
				return partition != null && !partition.isEmpty();
			case ModulePackage.CORE__RTE_START_API:
				return rteStartApi != null;
			case ModulePackage.CORE__CORE_ID:
				return CORE_ID_EDEFAULT == null ? coreId != null : !CORE_ID_EDEFAULT.equals(coreId);
			case ModulePackage.CORE__IS_MASTER_CORE:
				return IS_MASTER_CORE_EDEFAULT == null ? isMasterCore != null : !IS_MASTER_CORE_EDEFAULT.equals(isMasterCore);
			case ModulePackage.CORE__SCHM_INIT_API:
				return schmInitApi != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (coreId: ");
		result.append(coreId);
		result.append(", isMasterCore: ");
		result.append(isMasterCore);
		result.append(')');
		return result.toString();
	}

} //CoreImpl
