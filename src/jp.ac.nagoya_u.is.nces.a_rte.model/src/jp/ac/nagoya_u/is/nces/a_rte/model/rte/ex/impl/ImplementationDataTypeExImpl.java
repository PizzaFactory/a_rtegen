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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl;

import java.lang.reflect.InvocationTargetException;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CompuMethod;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.CompuMethodEx;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ImplementationDataTypeEx;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Data Type Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl.ImplementationDataTypeExImpl#getCompuMethodEx <em>Compu Method Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationDataTypeExImpl extends ExtendedEObjectImpl implements ImplementationDataTypeEx {
	/**
	 * The cached value of the '{@link #getCompuMethodEx() <em>Compu Method Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompuMethodEx()
	 * @generated
	 * @ordered
	 */
	protected CompuMethodEx compuMethodEx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationDataTypeExImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompuMethodEx getCompuMethodEx() {
		if (compuMethodEx != null && ((EObject)compuMethodEx).eIsProxy()) {
			InternalEObject oldCompuMethodEx = (InternalEObject)compuMethodEx;
			compuMethodEx = (CompuMethodEx)eResolveProxy(oldCompuMethodEx);
			if (compuMethodEx != oldCompuMethodEx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExPackage.IMPLEMENTATION_DATA_TYPE_EX__COMPU_METHOD_EX, oldCompuMethodEx, compuMethodEx));
			}
		}
		return compuMethodEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompuMethodEx basicGetCompuMethodEx() {
		return compuMethodEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompuMethodEx(CompuMethodEx newCompuMethodEx) {
		CompuMethodEx oldCompuMethodEx = compuMethodEx;
		compuMethodEx = newCompuMethodEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExPackage.IMPLEMENTATION_DATA_TYPE_EX__COMPU_METHOD_EX, oldCompuMethodEx, compuMethodEx));
	}

	/**
	 * The cached invocation delegate for the '{@link #providesTypeDefinition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Provides Type Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #providesTypeDefinition(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PROVIDES_TYPE_DEFINITION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_TYPE_DEFINITION__IMPLEMENTATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean providesTypeDefinition(ImplementationDataType this_) {
		try {
			return (Boolean)PROVIDES_TYPE_DEFINITION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #providesEnumConstant(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType) <em>Provides Enum Constant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #providesEnumConstant(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PROVIDES_ENUM_CONSTANT_IMPLEMENTATION_DATA_TYPE_APPLICATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_ENUM_CONSTANT__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean providesEnumConstant(ImplementationDataType this_, ApplicationDataType applicationDataType) {
		try {
			return (Boolean)PROVIDES_ENUM_CONSTANT_IMPLEMENTATION_DATA_TYPE_APPLICATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{this_, applicationDataType}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getCompuMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType) <em>Get Compu Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompuMethod(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ApplicationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_COMPU_METHOD_IMPLEMENTATION_DATA_TYPE_APPLICATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.IMPLEMENTATION_DATA_TYPE_EX___GET_COMPU_METHOD__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompuMethod getCompuMethod(ImplementationDataType this_, ApplicationDataType applicationDataType) {
		try {
			return (CompuMethod)GET_COMPU_METHOD_IMPLEMENTATION_DATA_TYPE_APPLICATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{this_, applicationDataType}));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExPackage.IMPLEMENTATION_DATA_TYPE_EX__COMPU_METHOD_EX:
				if (resolve) return getCompuMethodEx();
				return basicGetCompuMethodEx();
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
			case ExPackage.IMPLEMENTATION_DATA_TYPE_EX__COMPU_METHOD_EX:
				setCompuMethodEx((CompuMethodEx)newValue);
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
			case ExPackage.IMPLEMENTATION_DATA_TYPE_EX__COMPU_METHOD_EX:
				setCompuMethodEx((CompuMethodEx)null);
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
			case ExPackage.IMPLEMENTATION_DATA_TYPE_EX__COMPU_METHOD_EX:
				return compuMethodEx != null;
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
			case ExPackage.IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_TYPE_DEFINITION__IMPLEMENTATIONDATATYPE:
				return providesTypeDefinition((ImplementationDataType)arguments.get(0));
			case ExPackage.IMPLEMENTATION_DATA_TYPE_EX___PROVIDES_ENUM_CONSTANT__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE:
				return providesEnumConstant((ImplementationDataType)arguments.get(0), (ApplicationDataType)arguments.get(1));
			case ExPackage.IMPLEMENTATION_DATA_TYPE_EX___GET_COMPU_METHOD__IMPLEMENTATIONDATATYPE_APPLICATIONDATATYPE:
				return getCompuMethod((ImplementationDataType)arguments.get(0), (ApplicationDataType)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImplementationDataTypeExImpl
