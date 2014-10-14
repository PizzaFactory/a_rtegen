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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import java.lang.reflect.InvocationTargetException;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstr;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Autosar Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarDataTypeImpl#getSwDataDefProps <em>Sw Data Def Props</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarDataTypeImpl#getInvalidValue <em>Invalid Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarDataTypeImpl#getCompuMethod <em>Compu Method</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarDataTypeImpl#getDataConstr <em>Data Constr</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarDataTypeImpl#getSwAddrMethod <em>Sw Addr Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AutosarDataTypeImpl extends ArElementImpl implements AutosarDataType {
	/**
	 * The cached value of the '{@link #getSwDataDefProps() <em>Sw Data Def Props</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwDataDefProps()
	 * @generated
	 * @ordered
	 */
	protected SwDataDefProps swDataDefProps;

	/**
	 * The cached setting delegate for the '{@link #getInvalidValue() <em>Invalid Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidValue()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate INVALID_VALUE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)M2Package.Literals.AUTOSAR_DATA_TYPE__INVALID_VALUE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getCompuMethod() <em>Compu Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompuMethod()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate COMPU_METHOD__ESETTING_DELEGATE = ((EStructuralFeature.Internal)M2Package.Literals.AUTOSAR_DATA_TYPE__COMPU_METHOD).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getDataConstr() <em>Data Constr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataConstr()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DATA_CONSTR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)M2Package.Literals.AUTOSAR_DATA_TYPE__DATA_CONSTR).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSwAddrMethod() <em>Sw Addr Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAddrMethod()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SW_ADDR_METHOD__ESETTING_DELEGATE = ((EStructuralFeature.Internal)M2Package.Literals.AUTOSAR_DATA_TYPE__SW_ADDR_METHOD).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutosarDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.AUTOSAR_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwDataDefProps getSwDataDefProps() {
		return swDataDefProps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwDataDefProps(SwDataDefProps newSwDataDefProps, NotificationChain msgs) {
		SwDataDefProps oldSwDataDefProps = swDataDefProps;
		swDataDefProps = newSwDataDefProps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.AUTOSAR_DATA_TYPE__SW_DATA_DEF_PROPS, oldSwDataDefProps, newSwDataDefProps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwDataDefProps(SwDataDefProps newSwDataDefProps) {
		if (newSwDataDefProps != swDataDefProps) {
			NotificationChain msgs = null;
			if (swDataDefProps != null)
				msgs = ((InternalEObject)swDataDefProps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.AUTOSAR_DATA_TYPE__SW_DATA_DEF_PROPS, null, msgs);
			if (newSwDataDefProps != null)
				msgs = ((InternalEObject)newSwDataDefProps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.AUTOSAR_DATA_TYPE__SW_DATA_DEF_PROPS, null, msgs);
			msgs = basicSetSwDataDefProps(newSwDataDefProps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.AUTOSAR_DATA_TYPE__SW_DATA_DEF_PROPS, newSwDataDefProps, newSwDataDefProps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getInvalidValue() {
		return (ValueSpecification)INVALID_VALUE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetInvalidValue() {
		return (ValueSpecification)INVALID_VALUE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvalidValue(ValueSpecification newInvalidValue) {
		INVALID_VALUE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newInvalidValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompuMethod getCompuMethod() {
		return (CompuMethod)COMPU_METHOD__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompuMethod basicGetCompuMethod() {
		return (CompuMethod)COMPU_METHOD__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompuMethod(CompuMethod newCompuMethod) {
		COMPU_METHOD__ESETTING_DELEGATE.dynamicSet(this, null, 0, newCompuMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConstr getDataConstr() {
		return (DataConstr)DATA_CONSTR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConstr basicGetDataConstr() {
		return (DataConstr)DATA_CONSTR__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataConstr(DataConstr newDataConstr) {
		DATA_CONSTR__ESETTING_DELEGATE.dynamicSet(this, null, 0, newDataConstr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod getSwAddrMethod() {
		return (SwAddrMethod)SW_ADDR_METHOD__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod basicGetSwAddrMethod() {
		return (SwAddrMethod)SW_ADDR_METHOD__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwAddrMethod(SwAddrMethod newSwAddrMethod) {
		SW_ADDR_METHOD__ESETTING_DELEGATE.dynamicSet(this, null, 0, newSwAddrMethod);
	}

	/**
	 * The cached invocation delegate for the '{@link #getSwImplPolicy() <em>Get Sw Impl Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwImplPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SW_IMPL_POLICY__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.AUTOSAR_DATA_TYPE___GET_SW_IMPL_POLICY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwImplPolicyEnum getSwImplPolicy() {
		try {
			return (SwImplPolicyEnum)GET_SW_IMPL_POLICY__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case M2Package.AUTOSAR_DATA_TYPE__SW_DATA_DEF_PROPS:
				return basicSetSwDataDefProps(null, msgs);
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
			case M2Package.AUTOSAR_DATA_TYPE__SW_DATA_DEF_PROPS:
				return getSwDataDefProps();
			case M2Package.AUTOSAR_DATA_TYPE__INVALID_VALUE:
				if (resolve) return getInvalidValue();
				return basicGetInvalidValue();
			case M2Package.AUTOSAR_DATA_TYPE__COMPU_METHOD:
				if (resolve) return getCompuMethod();
				return basicGetCompuMethod();
			case M2Package.AUTOSAR_DATA_TYPE__DATA_CONSTR:
				if (resolve) return getDataConstr();
				return basicGetDataConstr();
			case M2Package.AUTOSAR_DATA_TYPE__SW_ADDR_METHOD:
				if (resolve) return getSwAddrMethod();
				return basicGetSwAddrMethod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case M2Package.AUTOSAR_DATA_TYPE__SW_DATA_DEF_PROPS:
				setSwDataDefProps((SwDataDefProps)newValue);
				return;
			case M2Package.AUTOSAR_DATA_TYPE__INVALID_VALUE:
				setInvalidValue((ValueSpecification)newValue);
				return;
			case M2Package.AUTOSAR_DATA_TYPE__COMPU_METHOD:
				setCompuMethod((CompuMethod)newValue);
				return;
			case M2Package.AUTOSAR_DATA_TYPE__DATA_CONSTR:
				setDataConstr((DataConstr)newValue);
				return;
			case M2Package.AUTOSAR_DATA_TYPE__SW_ADDR_METHOD:
				setSwAddrMethod((SwAddrMethod)newValue);
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
			case M2Package.AUTOSAR_DATA_TYPE__SW_DATA_DEF_PROPS:
				setSwDataDefProps((SwDataDefProps)null);
				return;
			case M2Package.AUTOSAR_DATA_TYPE__INVALID_VALUE:
				setInvalidValue((ValueSpecification)null);
				return;
			case M2Package.AUTOSAR_DATA_TYPE__COMPU_METHOD:
				setCompuMethod((CompuMethod)null);
				return;
			case M2Package.AUTOSAR_DATA_TYPE__DATA_CONSTR:
				setDataConstr((DataConstr)null);
				return;
			case M2Package.AUTOSAR_DATA_TYPE__SW_ADDR_METHOD:
				setSwAddrMethod((SwAddrMethod)null);
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
			case M2Package.AUTOSAR_DATA_TYPE__SW_DATA_DEF_PROPS:
				return swDataDefProps != null;
			case M2Package.AUTOSAR_DATA_TYPE__INVALID_VALUE:
				return INVALID_VALUE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case M2Package.AUTOSAR_DATA_TYPE__COMPU_METHOD:
				return COMPU_METHOD__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case M2Package.AUTOSAR_DATA_TYPE__DATA_CONSTR:
				return DATA_CONSTR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case M2Package.AUTOSAR_DATA_TYPE__SW_ADDR_METHOD:
				return SW_ADDR_METHOD__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case M2Package.AUTOSAR_DATA_TYPE___GET_SW_IMPL_POLICY:
				return getSwImplPolicy();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AutosarDataTypeImpl
