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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.POperationInAtomicSwcInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PPortPrototype;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>POperation In Atomic Swc Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.POperationInAtomicSwcInstanceRefImpl#getInstanceRef <em>Instance Ref</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.POperationInAtomicSwcInstanceRefImpl#getContextPPort <em>Context PPort</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.POperationInAtomicSwcInstanceRefImpl#getTargetProvidedOperation <em>Target Provided Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class POperationInAtomicSwcInstanceRefImpl extends M2ObjectImpl implements POperationInAtomicSwcInstanceRef {
	/**
	 * The cached value of the '{@link #getContextPPort() <em>Context PPort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextPPort()
	 * @generated
	 * @ordered
	 */
	protected PPortPrototype contextPPort;

	/**
	 * The cached value of the '{@link #getTargetProvidedOperation() <em>Target Provided Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProvidedOperation()
	 * @generated
	 * @ordered
	 */
	protected ClientServerOperation targetProvidedOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected POperationInAtomicSwcInstanceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getInstanceRef() {
		BasicInternalEList<String> instanceRefs = new BasicInternalEList<String>(String.class);
		Collections.addAll(instanceRefs, getContextPPort().getId(), getTargetProvidedOperation().getId());
		return instanceRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPortPrototype getContextPPort() {
		if (contextPPort != null && ((EObject)contextPPort).eIsProxy()) {
			InternalEObject oldContextPPort = (InternalEObject)contextPPort;
			contextPPort = (PPortPrototype)eResolveProxy(oldContextPPort);
			if (contextPPort != oldContextPPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_PPORT, oldContextPPort, contextPPort));
			}
		}
		return contextPPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPortPrototype basicGetContextPPort() {
		return contextPPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextPPort(PPortPrototype newContextPPort) {
		PPortPrototype oldContextPPort = contextPPort;
		contextPPort = newContextPPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_PPORT, oldContextPPort, contextPPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServerOperation getTargetProvidedOperation() {
		if (targetProvidedOperation != null && ((EObject)targetProvidedOperation).eIsProxy()) {
			InternalEObject oldTargetProvidedOperation = (InternalEObject)targetProvidedOperation;
			targetProvidedOperation = (ClientServerOperation)eResolveProxy(oldTargetProvidedOperation);
			if (targetProvidedOperation != oldTargetProvidedOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_PROVIDED_OPERATION, oldTargetProvidedOperation, targetProvidedOperation));
			}
		}
		return targetProvidedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServerOperation basicGetTargetProvidedOperation() {
		return targetProvidedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetProvidedOperation(ClientServerOperation newTargetProvidedOperation) {
		ClientServerOperation oldTargetProvidedOperation = targetProvidedOperation;
		targetProvidedOperation = newTargetProvidedOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_PROVIDED_OPERATION, oldTargetProvidedOperation, targetProvidedOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__INSTANCE_REF:
				return getInstanceRef();
			case M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_PPORT:
				if (resolve) return getContextPPort();
				return basicGetContextPPort();
			case M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_PROVIDED_OPERATION:
				if (resolve) return getTargetProvidedOperation();
				return basicGetTargetProvidedOperation();
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
			case M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__INSTANCE_REF:
				getInstanceRef().clear();
				getInstanceRef().addAll((Collection<? extends String>)newValue);
				return;
			case M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_PPORT:
				setContextPPort((PPortPrototype)newValue);
				return;
			case M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_PROVIDED_OPERATION:
				setTargetProvidedOperation((ClientServerOperation)newValue);
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
			case M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__INSTANCE_REF:
				getInstanceRef().clear();
				return;
			case M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_PPORT:
				setContextPPort((PPortPrototype)null);
				return;
			case M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_PROVIDED_OPERATION:
				setTargetProvidedOperation((ClientServerOperation)null);
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
			case M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__INSTANCE_REF:
				return !getInstanceRef().isEmpty();
			case M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__CONTEXT_PPORT:
				return contextPPort != null;
			case M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__TARGET_PROVIDED_OPERATION:
				return targetProvidedOperation != null;
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
				case M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__INSTANCE_REF: return M2Package.IINSTANCE_REF__INSTANCE_REF;
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
				case M2Package.IINSTANCE_REF__INSTANCE_REF: return M2Package.POPERATION_IN_ATOMIC_SWC_INSTANCE_REF__INSTANCE_REF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //POperationInAtomicSwcInstanceRefImpl
