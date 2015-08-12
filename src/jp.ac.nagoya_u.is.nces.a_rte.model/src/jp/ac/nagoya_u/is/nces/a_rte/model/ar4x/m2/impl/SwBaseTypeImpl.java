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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwBaseTypeImpl#getBaseTypeEncoding <em>Base Type Encoding</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwBaseTypeImpl#getBaseTypeSize <em>Base Type Size</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwBaseTypeImpl#getNativeDeclaration <em>Native Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwBaseTypeImpl extends ArElementImpl implements SwBaseType {
	/**
	 * The default value of the '{@link #getBaseTypeEncoding() <em>Base Type Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTypeEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TYPE_ENCODING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBaseTypeEncoding() <em>Base Type Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTypeEncoding()
	 * @generated
	 * @ordered
	 */
	protected String baseTypeEncoding = BASE_TYPE_ENCODING_EDEFAULT;
	/**
	 * The default value of the '{@link #getBaseTypeSize() <em>Base Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTypeSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BASE_TYPE_SIZE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBaseTypeSize() <em>Base Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTypeSize()
	 * @generated
	 * @ordered
	 */
	protected Integer baseTypeSize = BASE_TYPE_SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getNativeDeclaration() <em>Native Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final String NATIVE_DECLARATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNativeDeclaration() <em>Native Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeDeclaration()
	 * @generated
	 * @ordered
	 */
	protected String nativeDeclaration = NATIVE_DECLARATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SW_BASE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseTypeEncoding() {
		return baseTypeEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTypeEncoding(String newBaseTypeEncoding) {
		String oldBaseTypeEncoding = baseTypeEncoding;
		baseTypeEncoding = newBaseTypeEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_BASE_TYPE__BASE_TYPE_ENCODING, oldBaseTypeEncoding, baseTypeEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBaseTypeSize() {
		return baseTypeSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTypeSize(Integer newBaseTypeSize) {
		Integer oldBaseTypeSize = baseTypeSize;
		baseTypeSize = newBaseTypeSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_BASE_TYPE__BASE_TYPE_SIZE, oldBaseTypeSize, baseTypeSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNativeDeclaration() {
		return nativeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNativeDeclaration(String newNativeDeclaration) {
		String oldNativeDeclaration = nativeDeclaration;
		nativeDeclaration = newNativeDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_BASE_TYPE__NATIVE_DECLARATION, oldNativeDeclaration, nativeDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer getUpperLimitForUnsignedInteger() {
		return Integer.valueOf((int)Math.pow(2, baseTypeSize) - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.SW_BASE_TYPE__BASE_TYPE_ENCODING:
				return getBaseTypeEncoding();
			case M2Package.SW_BASE_TYPE__BASE_TYPE_SIZE:
				return getBaseTypeSize();
			case M2Package.SW_BASE_TYPE__NATIVE_DECLARATION:
				return getNativeDeclaration();
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
			case M2Package.SW_BASE_TYPE__BASE_TYPE_ENCODING:
				setBaseTypeEncoding((String)newValue);
				return;
			case M2Package.SW_BASE_TYPE__BASE_TYPE_SIZE:
				setBaseTypeSize((Integer)newValue);
				return;
			case M2Package.SW_BASE_TYPE__NATIVE_DECLARATION:
				setNativeDeclaration((String)newValue);
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
			case M2Package.SW_BASE_TYPE__BASE_TYPE_ENCODING:
				setBaseTypeEncoding(BASE_TYPE_ENCODING_EDEFAULT);
				return;
			case M2Package.SW_BASE_TYPE__BASE_TYPE_SIZE:
				setBaseTypeSize(BASE_TYPE_SIZE_EDEFAULT);
				return;
			case M2Package.SW_BASE_TYPE__NATIVE_DECLARATION:
				setNativeDeclaration(NATIVE_DECLARATION_EDEFAULT);
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
			case M2Package.SW_BASE_TYPE__BASE_TYPE_ENCODING:
				return BASE_TYPE_ENCODING_EDEFAULT == null ? baseTypeEncoding != null : !BASE_TYPE_ENCODING_EDEFAULT.equals(baseTypeEncoding);
			case M2Package.SW_BASE_TYPE__BASE_TYPE_SIZE:
				return BASE_TYPE_SIZE_EDEFAULT == null ? baseTypeSize != null : !BASE_TYPE_SIZE_EDEFAULT.equals(baseTypeSize);
			case M2Package.SW_BASE_TYPE__NATIVE_DECLARATION:
				return NATIVE_DECLARATION_EDEFAULT == null ? nativeDeclaration != null : !NATIVE_DECLARATION_EDEFAULT.equals(nativeDeclaration);
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
			case M2Package.SW_BASE_TYPE___GET_UPPER_LIMIT_FOR_UNSIGNED_INTEGER:
				return getUpperLimitForUnsignedInteger();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (baseTypeEncoding: ");
		result.append(baseTypeEncoding);
		result.append(", baseTypeSize: ");
		result.append(baseTypeSize);
		result.append(", nativeDeclaration: ");
		result.append(nativeDeclaration);
		result.append(')');
		return result.toString();
	}

} //SwBaseTypeImpl
