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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.DataConstr;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwImplPolicyEnum;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Data Def Props</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getInvalidValue <em>Invalid Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getSwImplPolicy <em>Sw Impl Policy</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getSwAddrMethod <em>Sw Addr Method</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getSwAlignment <em>Sw Alignment</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getCompuMethod <em>Compu Method</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwDataDefPropsImpl#getDataConstr <em>Data Constr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwDataDefPropsImpl extends M2ObjectImpl implements SwDataDefProps {
	/**
	 * The cached value of the '{@link #getInvalidValue() <em>Invalid Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification invalidValue;

	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected SwBaseType baseType;
	/**
	 * The default value of the '{@link #getSwImplPolicy() <em>Sw Impl Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwImplPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final SwImplPolicyEnum SW_IMPL_POLICY_EDEFAULT = SwImplPolicyEnum.UNSPECIFIED;
	/**
	 * The cached value of the '{@link #getSwImplPolicy() <em>Sw Impl Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwImplPolicy()
	 * @generated
	 * @ordered
	 */
	protected SwImplPolicyEnum swImplPolicy = SW_IMPL_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwAddrMethod() <em>Sw Addr Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAddrMethod()
	 * @generated
	 * @ordered
	 */
	protected SwAddrMethod swAddrMethod;

	/**
	 * The default value of the '{@link #getSwAlignment() <em>Sw Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final String SW_ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwAlignment() <em>Sw Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwAlignment()
	 * @generated
	 * @ordered
	 */
	protected String swAlignment = SW_ALIGNMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompuMethod() <em>Compu Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompuMethod()
	 * @generated
	 * @ordered
	 */
	protected CompuMethod compuMethod;

	/**
	 * The cached value of the '{@link #getDataConstr() <em>Data Constr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataConstr()
	 * @generated
	 * @ordered
	 */
	protected DataConstr dataConstr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwDataDefPropsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SW_DATA_DEF_PROPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getInvalidValue() {
		return invalidValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvalidValue(ValueSpecification newInvalidValue, NotificationChain msgs) {
		ValueSpecification oldInvalidValue = invalidValue;
		invalidValue = newInvalidValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE, oldInvalidValue, newInvalidValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvalidValue(ValueSpecification newInvalidValue) {
		if (newInvalidValue != invalidValue) {
			NotificationChain msgs = null;
			if (invalidValue != null)
				msgs = ((InternalEObject)invalidValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE, null, msgs);
			if (newInvalidValue != null)
				msgs = ((InternalEObject)newInvalidValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE, null, msgs);
			msgs = basicSetInvalidValue(newInvalidValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE, newInvalidValue, newInvalidValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwBaseType getBaseType() {
		if (baseType != null && ((EObject)baseType).eIsProxy()) {
			InternalEObject oldBaseType = (InternalEObject)baseType;
			baseType = (SwBaseType)eResolveProxy(oldBaseType);
			if (baseType != oldBaseType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SW_DATA_DEF_PROPS__BASE_TYPE, oldBaseType, baseType));
			}
		}
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwBaseType basicGetBaseType() {
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseType(SwBaseType newBaseType) {
		SwBaseType oldBaseType = baseType;
		baseType = newBaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__BASE_TYPE, oldBaseType, baseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwImplPolicyEnum getSwImplPolicy() {
		return swImplPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwImplPolicy(SwImplPolicyEnum newSwImplPolicy) {
		SwImplPolicyEnum oldSwImplPolicy = swImplPolicy;
		swImplPolicy = newSwImplPolicy == null ? SW_IMPL_POLICY_EDEFAULT : newSwImplPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__SW_IMPL_POLICY, oldSwImplPolicy, swImplPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod getSwAddrMethod() {
		if (swAddrMethod != null && ((EObject)swAddrMethod).eIsProxy()) {
			InternalEObject oldSwAddrMethod = (InternalEObject)swAddrMethod;
			swAddrMethod = (SwAddrMethod)eResolveProxy(oldSwAddrMethod);
			if (swAddrMethod != oldSwAddrMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SW_DATA_DEF_PROPS__SW_ADDR_METHOD, oldSwAddrMethod, swAddrMethod));
			}
		}
		return swAddrMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwAddrMethod basicGetSwAddrMethod() {
		return swAddrMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwAddrMethod(SwAddrMethod newSwAddrMethod) {
		SwAddrMethod oldSwAddrMethod = swAddrMethod;
		swAddrMethod = newSwAddrMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__SW_ADDR_METHOD, oldSwAddrMethod, swAddrMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwAlignment() {
		return swAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwAlignment(String newSwAlignment) {
		String oldSwAlignment = swAlignment;
		swAlignment = newSwAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__SW_ALIGNMENT, oldSwAlignment, swAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompuMethod getCompuMethod() {
		if (compuMethod != null && ((EObject)compuMethod).eIsProxy()) {
			InternalEObject oldCompuMethod = (InternalEObject)compuMethod;
			compuMethod = (CompuMethod)eResolveProxy(oldCompuMethod);
			if (compuMethod != oldCompuMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SW_DATA_DEF_PROPS__COMPU_METHOD, oldCompuMethod, compuMethod));
			}
		}
		return compuMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompuMethod basicGetCompuMethod() {
		return compuMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompuMethod(CompuMethod newCompuMethod) {
		CompuMethod oldCompuMethod = compuMethod;
		compuMethod = newCompuMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__COMPU_METHOD, oldCompuMethod, compuMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConstr getDataConstr() {
		if (dataConstr != null && ((EObject)dataConstr).eIsProxy()) {
			InternalEObject oldDataConstr = (InternalEObject)dataConstr;
			dataConstr = (DataConstr)eResolveProxy(oldDataConstr);
			if (dataConstr != oldDataConstr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.SW_DATA_DEF_PROPS__DATA_CONSTR, oldDataConstr, dataConstr));
			}
		}
		return dataConstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConstr basicGetDataConstr() {
		return dataConstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataConstr(DataConstr newDataConstr) {
		DataConstr oldDataConstr = dataConstr;
		dataConstr = newDataConstr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_DATA_DEF_PROPS__DATA_CONSTR, oldDataConstr, dataConstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE:
				return basicSetInvalidValue(null, msgs);
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
			case M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE:
				return getInvalidValue();
			case M2Package.SW_DATA_DEF_PROPS__BASE_TYPE:
				if (resolve) return getBaseType();
				return basicGetBaseType();
			case M2Package.SW_DATA_DEF_PROPS__SW_IMPL_POLICY:
				return getSwImplPolicy();
			case M2Package.SW_DATA_DEF_PROPS__SW_ADDR_METHOD:
				if (resolve) return getSwAddrMethod();
				return basicGetSwAddrMethod();
			case M2Package.SW_DATA_DEF_PROPS__SW_ALIGNMENT:
				return getSwAlignment();
			case M2Package.SW_DATA_DEF_PROPS__COMPU_METHOD:
				if (resolve) return getCompuMethod();
				return basicGetCompuMethod();
			case M2Package.SW_DATA_DEF_PROPS__DATA_CONSTR:
				if (resolve) return getDataConstr();
				return basicGetDataConstr();
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
			case M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE:
				setInvalidValue((ValueSpecification)newValue);
				return;
			case M2Package.SW_DATA_DEF_PROPS__BASE_TYPE:
				setBaseType((SwBaseType)newValue);
				return;
			case M2Package.SW_DATA_DEF_PROPS__SW_IMPL_POLICY:
				setSwImplPolicy((SwImplPolicyEnum)newValue);
				return;
			case M2Package.SW_DATA_DEF_PROPS__SW_ADDR_METHOD:
				setSwAddrMethod((SwAddrMethod)newValue);
				return;
			case M2Package.SW_DATA_DEF_PROPS__SW_ALIGNMENT:
				setSwAlignment((String)newValue);
				return;
			case M2Package.SW_DATA_DEF_PROPS__COMPU_METHOD:
				setCompuMethod((CompuMethod)newValue);
				return;
			case M2Package.SW_DATA_DEF_PROPS__DATA_CONSTR:
				setDataConstr((DataConstr)newValue);
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
			case M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE:
				setInvalidValue((ValueSpecification)null);
				return;
			case M2Package.SW_DATA_DEF_PROPS__BASE_TYPE:
				setBaseType((SwBaseType)null);
				return;
			case M2Package.SW_DATA_DEF_PROPS__SW_IMPL_POLICY:
				setSwImplPolicy(SW_IMPL_POLICY_EDEFAULT);
				return;
			case M2Package.SW_DATA_DEF_PROPS__SW_ADDR_METHOD:
				setSwAddrMethod((SwAddrMethod)null);
				return;
			case M2Package.SW_DATA_DEF_PROPS__SW_ALIGNMENT:
				setSwAlignment(SW_ALIGNMENT_EDEFAULT);
				return;
			case M2Package.SW_DATA_DEF_PROPS__COMPU_METHOD:
				setCompuMethod((CompuMethod)null);
				return;
			case M2Package.SW_DATA_DEF_PROPS__DATA_CONSTR:
				setDataConstr((DataConstr)null);
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
			case M2Package.SW_DATA_DEF_PROPS__INVALID_VALUE:
				return invalidValue != null;
			case M2Package.SW_DATA_DEF_PROPS__BASE_TYPE:
				return baseType != null;
			case M2Package.SW_DATA_DEF_PROPS__SW_IMPL_POLICY:
				return swImplPolicy != SW_IMPL_POLICY_EDEFAULT;
			case M2Package.SW_DATA_DEF_PROPS__SW_ADDR_METHOD:
				return swAddrMethod != null;
			case M2Package.SW_DATA_DEF_PROPS__SW_ALIGNMENT:
				return SW_ALIGNMENT_EDEFAULT == null ? swAlignment != null : !SW_ALIGNMENT_EDEFAULT.equals(swAlignment);
			case M2Package.SW_DATA_DEF_PROPS__COMPU_METHOD:
				return compuMethod != null;
			case M2Package.SW_DATA_DEF_PROPS__DATA_CONSTR:
				return dataConstr != null;
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
		result.append(" (swImplPolicy: ");
		result.append(swImplPolicy);
		result.append(", swAlignment: ");
		result.append(swAlignment);
		result.append(')');
		return result.toString();
	}

} //SwDataDefPropsImpl
