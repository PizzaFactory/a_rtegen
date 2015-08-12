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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortInterface;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortComSpec;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RPortPrototype;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPort Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortPrototypeImpl#getRequiredInterface <em>Required Interface</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RPortPrototypeImpl#getRequiredComSpec <em>Required Com Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RPortPrototypeImpl extends PortPrototypeImpl implements RPortPrototype {
	/**
	 * The cached value of the '{@link #getRequiredInterface() <em>Required Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterface()
	 * @generated
	 * @ordered
	 */
	protected PortInterface requiredInterface;

	/**
	 * The cached value of the '{@link #getRequiredComSpec() <em>Required Com Spec</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredComSpec()
	 * @generated
	 * @ordered
	 */
	protected EList<RPortComSpec> requiredComSpec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPortPrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.RPORT_PROTOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInterface getRequiredInterface() {
		if (requiredInterface != null && ((EObject)requiredInterface).eIsProxy()) {
			InternalEObject oldRequiredInterface = (InternalEObject)requiredInterface;
			requiredInterface = (PortInterface)eResolveProxy(oldRequiredInterface);
			if (requiredInterface != oldRequiredInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.RPORT_PROTOTYPE__REQUIRED_INTERFACE, oldRequiredInterface, requiredInterface));
			}
		}
		return requiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInterface basicGetRequiredInterface() {
		return requiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredInterface(PortInterface newRequiredInterface) {
		PortInterface oldRequiredInterface = requiredInterface;
		requiredInterface = newRequiredInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.RPORT_PROTOTYPE__REQUIRED_INTERFACE, oldRequiredInterface, requiredInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RPortComSpec> getRequiredComSpec() {
		if (requiredComSpec == null) {
			requiredComSpec = new EObjectContainmentEList<RPortComSpec>(RPortComSpec.class, this, M2Package.RPORT_PROTOTYPE__REQUIRED_COM_SPEC);
		}
		return requiredComSpec;
	}

	/**
	 * The cached invocation delegate for the '{@link #getUsingDataTypes() <em>Get Using Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingDataTypes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_USING_DATA_TYPES__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.RPORT_PROTOTYPE___GET_USING_DATA_TYPES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AutosarDataType> getUsingDataTypes() {
		try {
			return (EList<AutosarDataType>)GET_USING_DATA_TYPES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.RPORT_PROTOTYPE__REQUIRED_COM_SPEC:
				return ((InternalEList<?>)getRequiredComSpec()).basicRemove(otherEnd, msgs);
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
			case M2Package.RPORT_PROTOTYPE__REQUIRED_INTERFACE:
				if (resolve) return getRequiredInterface();
				return basicGetRequiredInterface();
			case M2Package.RPORT_PROTOTYPE__REQUIRED_COM_SPEC:
				return getRequiredComSpec();
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
			case M2Package.RPORT_PROTOTYPE__REQUIRED_INTERFACE:
				setRequiredInterface((PortInterface)newValue);
				return;
			case M2Package.RPORT_PROTOTYPE__REQUIRED_COM_SPEC:
				getRequiredComSpec().clear();
				getRequiredComSpec().addAll((Collection<? extends RPortComSpec>)newValue);
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
			case M2Package.RPORT_PROTOTYPE__REQUIRED_INTERFACE:
				setRequiredInterface((PortInterface)null);
				return;
			case M2Package.RPORT_PROTOTYPE__REQUIRED_COM_SPEC:
				getRequiredComSpec().clear();
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
			case M2Package.RPORT_PROTOTYPE__REQUIRED_INTERFACE:
				return requiredInterface != null;
			case M2Package.RPORT_PROTOTYPE__REQUIRED_COM_SPEC:
				return requiredComSpec != null && !requiredComSpec.isEmpty();
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
			case M2Package.RPORT_PROTOTYPE___GET_USING_DATA_TYPES:
				return getUsingDataTypes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RPortPrototypeImpl
