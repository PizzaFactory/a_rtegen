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
import java.util.Collections;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ClientServerOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ROperationInAtomicSwcInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROperation In Atomic Swc Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ROperationInAtomicSwcInstanceRefImpl#getInstanceRef <em>Instance Ref</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ROperationInAtomicSwcInstanceRefImpl#getContextRPort <em>Context RPort</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.ROperationInAtomicSwcInstanceRefImpl#getTargetRequiredOperation <em>Target Required Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROperationInAtomicSwcInstanceRefImpl extends M2ObjectImpl implements ROperationInAtomicSwcInstanceRef {
	/**
	 * The cached value of the '{@link #getContextRPort() <em>Context RPort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextRPort()
	 * @generated
	 * @ordered
	 */
	protected RPortPrototype contextRPort;

	/**
	 * The cached value of the '{@link #getTargetRequiredOperation() <em>Target Required Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRequiredOperation()
	 * @generated
	 * @ordered
	 */
	protected ClientServerOperation targetRequiredOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROperationInAtomicSwcInstanceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getInstanceRef() {
		BasicInternalEList<String> instanceRefs = new BasicInternalEList<String>(String.class);
		Collections.addAll(instanceRefs, getContextRPort().getId(), getTargetRequiredOperation().getId());
		return instanceRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPortPrototype getContextRPort() {
		if (contextRPort != null && ((EObject)contextRPort).eIsProxy()) {
			InternalEObject oldContextRPort = (InternalEObject)contextRPort;
			contextRPort = (RPortPrototype)eResolveProxy(oldContextRPort);
			if (contextRPort != oldContextRPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_RPORT, oldContextRPort, contextRPort));
			}
		}
		return contextRPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPortPrototype basicGetContextRPort() {
		return contextRPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextRPort(RPortPrototype newContextRPort) {
		RPortPrototype oldContextRPort = contextRPort;
		contextRPort = newContextRPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_RPORT, oldContextRPort, contextRPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServerOperation getTargetRequiredOperation() {
		if (targetRequiredOperation != null && ((EObject)targetRequiredOperation).eIsProxy()) {
			InternalEObject oldTargetRequiredOperation = (InternalEObject)targetRequiredOperation;
			targetRequiredOperation = (ClientServerOperation)eResolveProxy(oldTargetRequiredOperation);
			if (targetRequiredOperation != oldTargetRequiredOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_REQUIRED_OPERATION, oldTargetRequiredOperation, targetRequiredOperation));
			}
		}
		return targetRequiredOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServerOperation basicGetTargetRequiredOperation() {
		return targetRequiredOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRequiredOperation(ClientServerOperation newTargetRequiredOperation) {
		ClientServerOperation oldTargetRequiredOperation = targetRequiredOperation;
		targetRequiredOperation = newTargetRequiredOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_REQUIRED_OPERATION, oldTargetRequiredOperation, targetRequiredOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__INSTANCE_REF:
				return getInstanceRef();
			case M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_RPORT:
				if (resolve) return getContextRPort();
				return basicGetContextRPort();
			case M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_REQUIRED_OPERATION:
				if (resolve) return getTargetRequiredOperation();
				return basicGetTargetRequiredOperation();
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
			case M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__INSTANCE_REF:
				getInstanceRef().clear();
				getInstanceRef().addAll((Collection<? extends String>)newValue);
				return;
			case M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_RPORT:
				setContextRPort((RPortPrototype)newValue);
				return;
			case M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_REQUIRED_OPERATION:
				setTargetRequiredOperation((ClientServerOperation)newValue);
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
			case M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__INSTANCE_REF:
				getInstanceRef().clear();
				return;
			case M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_RPORT:
				setContextRPort((RPortPrototype)null);
				return;
			case M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_REQUIRED_OPERATION:
				setTargetRequiredOperation((ClientServerOperation)null);
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
			case M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__INSTANCE_REF:
				return !getInstanceRef().isEmpty();
			case M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_RPORT:
				return contextRPort != null;
			case M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_REQUIRED_OPERATION:
				return targetRequiredOperation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IInstanceRef.class) {
			switch (derivedFeatureID) {
				case M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__INSTANCE_REF: return M2Package.IINSTANCE_REF__INSTANCE_REF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IInstanceRef.class) {
			switch (baseFeatureID) {
				case M2Package.IINSTANCE_REF__INSTANCE_REF: return M2Package.ROPERATION_IN_ATOMIC_SWC_INSTANCE_REF__INSTANCE_REF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ROperationInAtomicSwcInstanceRefImpl
