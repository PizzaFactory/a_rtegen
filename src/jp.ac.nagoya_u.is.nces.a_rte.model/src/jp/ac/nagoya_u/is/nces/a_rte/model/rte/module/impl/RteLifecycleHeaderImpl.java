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
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiGroup;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Lifecycle Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleHeaderImpl#getRteLifecycleApiGroup <em>Rte Lifecycle Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.RteLifecycleHeaderImpl#getSchmLifecycleApiGroup <em>Schm Lifecycle Api Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteLifecycleHeaderImpl extends HeaderFileImpl implements RteLifecycleHeader {
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
	 * The cached value of the '{@link #getSchmLifecycleApiGroup() <em>Schm Lifecycle Api Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchmLifecycleApiGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<SchmLifecycleApiGroup> schmLifecycleApiGroup;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteLifecycleHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.RTE_LIFECYCLE_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteLifecycleApiGroup> getRteLifecycleApiGroup() {
		if (rteLifecycleApiGroup == null) {
			rteLifecycleApiGroup = new EObjectContainmentEList<RteLifecycleApiGroup>(RteLifecycleApiGroup.class, this, ModulePackage.RTE_LIFECYCLE_HEADER__RTE_LIFECYCLE_API_GROUP);
		}
		return rteLifecycleApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchmLifecycleApiGroup> getSchmLifecycleApiGroup() {
		if (schmLifecycleApiGroup == null) {
			schmLifecycleApiGroup = new EObjectContainmentEList<SchmLifecycleApiGroup>(SchmLifecycleApiGroup.class, this, ModulePackage.RTE_LIFECYCLE_HEADER__SCHM_LIFECYCLE_API_GROUP);
		}
		return schmLifecycleApiGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.RTE_LIFECYCLE_HEADER__RTE_LIFECYCLE_API_GROUP:
				return ((InternalEList<?>)getRteLifecycleApiGroup()).basicRemove(otherEnd, msgs);
			case ModulePackage.RTE_LIFECYCLE_HEADER__SCHM_LIFECYCLE_API_GROUP:
				return ((InternalEList<?>)getSchmLifecycleApiGroup()).basicRemove(otherEnd, msgs);
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
			case ModulePackage.RTE_LIFECYCLE_HEADER__RTE_LIFECYCLE_API_GROUP:
				return getRteLifecycleApiGroup();
			case ModulePackage.RTE_LIFECYCLE_HEADER__SCHM_LIFECYCLE_API_GROUP:
				return getSchmLifecycleApiGroup();
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
			case ModulePackage.RTE_LIFECYCLE_HEADER__RTE_LIFECYCLE_API_GROUP:
				getRteLifecycleApiGroup().clear();
				getRteLifecycleApiGroup().addAll((Collection<? extends RteLifecycleApiGroup>)newValue);
				return;
			case ModulePackage.RTE_LIFECYCLE_HEADER__SCHM_LIFECYCLE_API_GROUP:
				getSchmLifecycleApiGroup().clear();
				getSchmLifecycleApiGroup().addAll((Collection<? extends SchmLifecycleApiGroup>)newValue);
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
			case ModulePackage.RTE_LIFECYCLE_HEADER__RTE_LIFECYCLE_API_GROUP:
				getRteLifecycleApiGroup().clear();
				return;
			case ModulePackage.RTE_LIFECYCLE_HEADER__SCHM_LIFECYCLE_API_GROUP:
				getSchmLifecycleApiGroup().clear();
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
			case ModulePackage.RTE_LIFECYCLE_HEADER__RTE_LIFECYCLE_API_GROUP:
				return rteLifecycleApiGroup != null && !rteLifecycleApiGroup.isEmpty();
			case ModulePackage.RTE_LIFECYCLE_HEADER__SCHM_LIFECYCLE_API_GROUP:
				return schmLifecycleApiGroup != null && !schmLifecycleApiGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RteLifecycleHeaderImpl
