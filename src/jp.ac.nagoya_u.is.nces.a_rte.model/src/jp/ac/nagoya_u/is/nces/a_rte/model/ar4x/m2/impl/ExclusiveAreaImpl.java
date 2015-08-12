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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswExclusiveAreaImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteExclusiveAreaImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExclusiveArea;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.InternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusive Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExclusiveAreaImpl#getSwcConfig <em>Swc Config</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExclusiveAreaImpl#getBswConfig <em>Bsw Config</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExclusiveAreaImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ExclusiveAreaImpl#getEnterExecutableEntity <em>Enter Executable Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExclusiveAreaImpl extends IdentifiableImpl implements ExclusiveArea {
	/**
	 * The cached value of the '{@link #getSwcConfig() <em>Swc Config</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwcConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<RteExclusiveAreaImplementation> swcConfig;
	/**
	 * The cached value of the '{@link #getBswConfig() <em>Bsw Config</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBswExclusiveAreaImpl> bswConfig;
	/**
	 * The cached value of the '{@link #getEnterExecutableEntity() <em>Enter Executable Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterExecutableEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableEntity> enterExecutableEntity;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.EXCLUSIVE_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalBehavior getParent() {
		if (eContainerFeatureID() != M2Package.EXCLUSIVE_AREA__PARENT) return null;
		return (InternalBehavior)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(InternalBehavior newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, M2Package.EXCLUSIVE_AREA__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(InternalBehavior newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != M2Package.EXCLUSIVE_AREA__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, M2Package.INTERNAL_BEHAVIOR__EXCLUSIVE_AREA, InternalBehavior.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.EXCLUSIVE_AREA__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableEntity> getEnterExecutableEntity() {
		if (enterExecutableEntity == null) {
			enterExecutableEntity = new EObjectWithInverseResolvingEList.ManyInverse<ExecutableEntity>(ExecutableEntity.class, this, M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY, M2Package.EXECUTABLE_ENTITY__CAN_ENTER_EXCLUSIVE_AREA);
		}
		return enterExecutableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteExclusiveAreaImplementation> getSwcConfig() {
		if (swcConfig == null) {
			swcConfig = new EObjectWithInverseResolvingEList<RteExclusiveAreaImplementation>(RteExclusiveAreaImplementation.class, this, M2Package.EXCLUSIVE_AREA__SWC_CONFIG, EcucPackage.RTE_EXCLUSIVE_AREA_IMPLEMENTATION__RTE_EXCLUSIVE_AREA);
		}
		return swcConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBswExclusiveAreaImpl> getBswConfig() {
		if (bswConfig == null) {
			bswConfig = new EObjectWithInverseResolvingEList<RteBswExclusiveAreaImpl>(RteBswExclusiveAreaImpl.class, this, M2Package.EXCLUSIVE_AREA__BSW_CONFIG, EcucPackage.RTE_BSW_EXCLUSIVE_AREA_IMPL__RTE_BSW_EXCLUSIVE_AREA);
		}
		return bswConfig;
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
			case M2Package.EXCLUSIVE_AREA__SWC_CONFIG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwcConfig()).basicAdd(otherEnd, msgs);
			case M2Package.EXCLUSIVE_AREA__BSW_CONFIG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBswConfig()).basicAdd(otherEnd, msgs);
			case M2Package.EXCLUSIVE_AREA__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((InternalBehavior)otherEnd, msgs);
			case M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnterExecutableEntity()).basicAdd(otherEnd, msgs);
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
			case M2Package.EXCLUSIVE_AREA__SWC_CONFIG:
				return ((InternalEList<?>)getSwcConfig()).basicRemove(otherEnd, msgs);
			case M2Package.EXCLUSIVE_AREA__BSW_CONFIG:
				return ((InternalEList<?>)getBswConfig()).basicRemove(otherEnd, msgs);
			case M2Package.EXCLUSIVE_AREA__PARENT:
				return basicSetParent(null, msgs);
			case M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY:
				return ((InternalEList<?>)getEnterExecutableEntity()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case M2Package.EXCLUSIVE_AREA__PARENT:
				return eInternalContainer().eInverseRemove(this, M2Package.INTERNAL_BEHAVIOR__EXCLUSIVE_AREA, InternalBehavior.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.EXCLUSIVE_AREA__SWC_CONFIG:
				return getSwcConfig();
			case M2Package.EXCLUSIVE_AREA__BSW_CONFIG:
				return getBswConfig();
			case M2Package.EXCLUSIVE_AREA__PARENT:
				return getParent();
			case M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY:
				return getEnterExecutableEntity();
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
			case M2Package.EXCLUSIVE_AREA__SWC_CONFIG:
				getSwcConfig().clear();
				getSwcConfig().addAll((Collection<? extends RteExclusiveAreaImplementation>)newValue);
				return;
			case M2Package.EXCLUSIVE_AREA__BSW_CONFIG:
				getBswConfig().clear();
				getBswConfig().addAll((Collection<? extends RteBswExclusiveAreaImpl>)newValue);
				return;
			case M2Package.EXCLUSIVE_AREA__PARENT:
				setParent((InternalBehavior)newValue);
				return;
			case M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY:
				getEnterExecutableEntity().clear();
				getEnterExecutableEntity().addAll((Collection<? extends ExecutableEntity>)newValue);
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
			case M2Package.EXCLUSIVE_AREA__SWC_CONFIG:
				getSwcConfig().clear();
				return;
			case M2Package.EXCLUSIVE_AREA__BSW_CONFIG:
				getBswConfig().clear();
				return;
			case M2Package.EXCLUSIVE_AREA__PARENT:
				setParent((InternalBehavior)null);
				return;
			case M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY:
				getEnterExecutableEntity().clear();
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
			case M2Package.EXCLUSIVE_AREA__SWC_CONFIG:
				return swcConfig != null && !swcConfig.isEmpty();
			case M2Package.EXCLUSIVE_AREA__BSW_CONFIG:
				return bswConfig != null && !bswConfig.isEmpty();
			case M2Package.EXCLUSIVE_AREA__PARENT:
				return getParent() != null;
			case M2Package.EXCLUSIVE_AREA__ENTER_EXECUTABLE_ENTITY:
				return enterExecutableEntity != null && !enterExecutableEntity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExclusiveAreaImpl
