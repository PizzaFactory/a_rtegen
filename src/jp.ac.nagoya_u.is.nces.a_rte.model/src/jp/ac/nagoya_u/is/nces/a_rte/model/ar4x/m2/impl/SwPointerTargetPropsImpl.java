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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwDataDefProps;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwPointerTargetProps;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Pointer Target Props</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwPointerTargetPropsImpl#getTargetCategory <em>Target Category</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwPointerTargetPropsImpl#getSwDataDefProps <em>Sw Data Def Props</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwPointerTargetPropsImpl extends M2ObjectImpl implements SwPointerTargetProps {
	/**
	 * The default value of the '{@link #getTargetCategory() <em>Target Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetCategory() <em>Target Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCategory()
	 * @generated
	 * @ordered
	 */
	protected String targetCategory = TARGET_CATEGORY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwPointerTargetPropsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SW_POINTER_TARGET_PROPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetCategory() {
		return targetCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCategory(String newTargetCategory) {
		String oldTargetCategory = targetCategory;
		targetCategory = newTargetCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_POINTER_TARGET_PROPS__TARGET_CATEGORY, oldTargetCategory, targetCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS, oldSwDataDefProps, newSwDataDefProps);
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
				msgs = ((InternalEObject)swDataDefProps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS, null, msgs);
			if (newSwDataDefProps != null)
				msgs = ((InternalEObject)newSwDataDefProps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS, null, msgs);
			msgs = basicSetSwDataDefProps(newSwDataDefProps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS, newSwDataDefProps, newSwDataDefProps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS:
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
			case M2Package.SW_POINTER_TARGET_PROPS__TARGET_CATEGORY:
				return getTargetCategory();
			case M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS:
				return getSwDataDefProps();
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
			case M2Package.SW_POINTER_TARGET_PROPS__TARGET_CATEGORY:
				setTargetCategory((String)newValue);
				return;
			case M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS:
				setSwDataDefProps((SwDataDefProps)newValue);
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
			case M2Package.SW_POINTER_TARGET_PROPS__TARGET_CATEGORY:
				setTargetCategory(TARGET_CATEGORY_EDEFAULT);
				return;
			case M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS:
				setSwDataDefProps((SwDataDefProps)null);
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
			case M2Package.SW_POINTER_TARGET_PROPS__TARGET_CATEGORY:
				return TARGET_CATEGORY_EDEFAULT == null ? targetCategory != null : !TARGET_CATEGORY_EDEFAULT.equals(targetCategory);
			case M2Package.SW_POINTER_TARGET_PROPS__SW_DATA_DEF_PROPS:
				return swDataDefProps != null;
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
		result.append(" (targetCategory: ");
		result.append(targetCategory);
		result.append(')');
		return result.toString();
	}

} //SwPointerTargetPropsImpl
