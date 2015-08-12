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

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AutosarVariableRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableInAtomicSwcInstanceRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Autosar Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarVariableRefImpl#getAutosarVariableIref <em>Autosar Variable Iref</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarVariableRefImpl#getAutosarVariable <em>Autosar Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.AutosarVariableRefImpl#getLocalVariable <em>Local Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutosarVariableRefImpl extends M2ObjectImpl implements AutosarVariableRef {
	/**
	 * The cached value of the '{@link #getAutosarVariableIref() <em>Autosar Variable Iref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutosarVariableIref()
	 * @generated
	 * @ordered
	 */
	protected VariableInAtomicSwcInstanceRef autosarVariableIref;

	/**
	 * The cached value of the '{@link #getAutosarVariable() <em>Autosar Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutosarVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableDataInstanceInSwc autosarVariable;

	/**
	 * The cached value of the '{@link #getLocalVariable() <em>Local Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableDataPrototype localVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutosarVariableRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.AUTOSAR_VARIABLE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableInAtomicSwcInstanceRef getAutosarVariableIref() {
		return autosarVariableIref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutosarVariableIref(VariableInAtomicSwcInstanceRef newAutosarVariableIref, NotificationChain msgs) {
		VariableInAtomicSwcInstanceRef oldAutosarVariableIref = autosarVariableIref;
		autosarVariableIref = newAutosarVariableIref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF, oldAutosarVariableIref, newAutosarVariableIref);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutosarVariableIref(VariableInAtomicSwcInstanceRef newAutosarVariableIref) {
		if (newAutosarVariableIref != autosarVariableIref) {
			NotificationChain msgs = null;
			if (autosarVariableIref != null)
				msgs = ((InternalEObject)autosarVariableIref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF, null, msgs);
			if (newAutosarVariableIref != null)
				msgs = ((InternalEObject)newAutosarVariableIref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF, null, msgs);
			msgs = basicSetAutosarVariableIref(newAutosarVariableIref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF, newAutosarVariableIref, newAutosarVariableIref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInSwc getAutosarVariable() {
		if (autosarVariable != null && ((EObject)autosarVariable).eIsProxy()) {
			InternalEObject oldAutosarVariable = (InternalEObject)autosarVariable;
			autosarVariable = (VariableDataInstanceInSwc)eResolveProxy(oldAutosarVariable);
			if (autosarVariable != oldAutosarVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE, oldAutosarVariable, autosarVariable));
			}
		}
		return autosarVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataInstanceInSwc basicGetAutosarVariable() {
		return autosarVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutosarVariable(VariableDataInstanceInSwc newAutosarVariable) {
		VariableDataInstanceInSwc oldAutosarVariable = autosarVariable;
		autosarVariable = newAutosarVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE, oldAutosarVariable, autosarVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototype getLocalVariable() {
		if (localVariable != null && ((EObject)localVariable).eIsProxy()) {
			InternalEObject oldLocalVariable = (InternalEObject)localVariable;
			localVariable = (VariableDataPrototype)eResolveProxy(oldLocalVariable);
			if (localVariable != oldLocalVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.AUTOSAR_VARIABLE_REF__LOCAL_VARIABLE, oldLocalVariable, localVariable));
			}
		}
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototype basicGetLocalVariable() {
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalVariable(VariableDataPrototype newLocalVariable) {
		VariableDataPrototype oldLocalVariable = localVariable;
		localVariable = newLocalVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.AUTOSAR_VARIABLE_REF__LOCAL_VARIABLE, oldLocalVariable, localVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF:
				return basicSetAutosarVariableIref(null, msgs);
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
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF:
				return getAutosarVariableIref();
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE:
				if (resolve) return getAutosarVariable();
				return basicGetAutosarVariable();
			case M2Package.AUTOSAR_VARIABLE_REF__LOCAL_VARIABLE:
				if (resolve) return getLocalVariable();
				return basicGetLocalVariable();
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
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF:
				setAutosarVariableIref((VariableInAtomicSwcInstanceRef)newValue);
				return;
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE:
				setAutosarVariable((VariableDataInstanceInSwc)newValue);
				return;
			case M2Package.AUTOSAR_VARIABLE_REF__LOCAL_VARIABLE:
				setLocalVariable((VariableDataPrototype)newValue);
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
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF:
				setAutosarVariableIref((VariableInAtomicSwcInstanceRef)null);
				return;
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE:
				setAutosarVariable((VariableDataInstanceInSwc)null);
				return;
			case M2Package.AUTOSAR_VARIABLE_REF__LOCAL_VARIABLE:
				setLocalVariable((VariableDataPrototype)null);
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
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE_IREF:
				return autosarVariableIref != null;
			case M2Package.AUTOSAR_VARIABLE_REF__AUTOSAR_VARIABLE:
				return autosarVariable != null;
			case M2Package.AUTOSAR_VARIABLE_REF__LOCAL_VARIABLE:
				return localVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //AutosarVariableRefImpl
