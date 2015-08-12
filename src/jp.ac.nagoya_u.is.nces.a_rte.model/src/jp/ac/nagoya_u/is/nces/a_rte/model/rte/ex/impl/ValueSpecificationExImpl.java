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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.impl;

import java.lang.reflect.InvocationTargetException;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ValueSpecificationEx;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Specification Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ValueSpecificationExImpl extends ExtendedEObjectImpl implements ValueSpecificationEx {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSpecificationExImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExPackage.Literals.VALUE_SPECIFICATION_EX;
	}

	/**
	 * The cached invocation delegate for the '{@link #getEndValueSpec(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification) <em>Get End Value Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndValueSpec(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_END_VALUE_SPEC_VALUE_SPECIFICATION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getEndValueSpec(ValueSpecification this_) {
		try {
			return (ValueSpecification)GET_END_VALUE_SPEC_VALUE_SPECIFICATION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getValueSpecAsText(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification) <em>Get Value Spec As Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSpecAsText(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_VALUE_SPEC_AS_TEXT_VALUE_SPECIFICATION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueSpecAsText(ValueSpecification this_) {
		try {
			return (String)GET_VALUE_SPEC_AS_TEXT_VALUE_SPECIFICATION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isForVALUE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification) <em>Is For VALUE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForVALUE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FOR_VALUE_VALUE_SPECIFICATION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___IS_FOR_VALUE__VALUESPECIFICATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForVALUE(ValueSpecification this_) {
		try {
			return (Boolean)IS_FOR_VALUE_VALUE_SPECIFICATION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{this_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isForARRAY(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Is For ARRAY</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForARRAY(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FOR_ARRAY_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___IS_FOR_ARRAY__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForARRAY(ValueSpecification value, ImplementationDataType type) {
		try {
			return (Boolean)IS_FOR_ARRAY_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{value, type}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isForSTRUCTURE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Is For STRUCTURE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForSTRUCTURE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FOR_STRUCTURE_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___IS_FOR_STRUCTURE__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForSTRUCTURE(ValueSpecification value, ImplementationDataType type) {
		try {
			return (Boolean)IS_FOR_STRUCTURE_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{value, type}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isForUNION(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Is For UNION</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForUNION(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FOR_UNION_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___IS_FOR_UNION__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForUNION(ValueSpecification value, ImplementationDataType type) {
		try {
			return (Boolean)IS_FOR_UNION_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{value, type}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isForDATA_REFERENCE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification) <em>Is For DATA REFERENCE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForDATA_REFERENCE(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FOR_DATA_REFERENCE_VALUE_SPECIFICATION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___IS_FOR_DATA_REFERENCE__VALUESPECIFICATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForDATA_REFERENCE(ValueSpecification value) {
		try {
			return (Boolean)IS_FOR_DATA_REFERENCE_VALUE_SPECIFICATION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{value}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isValidValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType) <em>Is Valid Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_VALID_VALUE_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___IS_VALID_VALUE__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValidValue(ValueSpecification value, ImplementationDataType type) {
		try {
			return (Boolean)IS_VALID_VALUE_VALUE_SPECIFICATION_IMPLEMENTATION_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{value, type}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #equalsInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification) <em>Equals Init Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #equalsInitValue(jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification, jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ValueSpecification)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EQUALS_INIT_VALUE_VALUE_SPECIFICATION_VALUE_SPECIFICATION__EINVOCATION_DELEGATE = ((EOperation.Internal)ExPackage.Literals.VALUE_SPECIFICATION_EX___EQUALS_INIT_VALUE__VALUESPECIFICATION_VALUESPECIFICATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equalsInitValue(ValueSpecification v1, ValueSpecification v2) {
		try {
			return (Boolean)EQUALS_INIT_VALUE_VALUE_SPECIFICATION_VALUE_SPECIFICATION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{v1, v2}));
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExPackage.VALUE_SPECIFICATION_EX___GET_END_VALUE_SPEC__VALUESPECIFICATION:
				return getEndValueSpec((ValueSpecification)arguments.get(0));
			case ExPackage.VALUE_SPECIFICATION_EX___GET_VALUE_SPEC_AS_TEXT__VALUESPECIFICATION:
				return getValueSpecAsText((ValueSpecification)arguments.get(0));
			case ExPackage.VALUE_SPECIFICATION_EX___IS_FOR_VALUE__VALUESPECIFICATION:
				return isForVALUE((ValueSpecification)arguments.get(0));
			case ExPackage.VALUE_SPECIFICATION_EX___IS_FOR_ARRAY__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE:
				return isForARRAY((ValueSpecification)arguments.get(0), (ImplementationDataType)arguments.get(1));
			case ExPackage.VALUE_SPECIFICATION_EX___IS_FOR_STRUCTURE__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE:
				return isForSTRUCTURE((ValueSpecification)arguments.get(0), (ImplementationDataType)arguments.get(1));
			case ExPackage.VALUE_SPECIFICATION_EX___IS_FOR_UNION__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE:
				return isForUNION((ValueSpecification)arguments.get(0), (ImplementationDataType)arguments.get(1));
			case ExPackage.VALUE_SPECIFICATION_EX___IS_FOR_DATA_REFERENCE__VALUESPECIFICATION:
				return isForDATA_REFERENCE((ValueSpecification)arguments.get(0));
			case ExPackage.VALUE_SPECIFICATION_EX___IS_VALID_VALUE__VALUESPECIFICATION_IMPLEMENTATIONDATATYPE:
				return isValidValue((ValueSpecification)arguments.get(0), (ImplementationDataType)arguments.get(1));
			case ExPackage.VALUE_SPECIFICATION_EX___EQUALS_INIT_VALUE__VALUESPECIFICATION_VALUESPECIFICATION:
				return equalsInitValue((ValueSpecification)arguments.get(0), (ValueSpecification)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ValueSpecificationExImpl
