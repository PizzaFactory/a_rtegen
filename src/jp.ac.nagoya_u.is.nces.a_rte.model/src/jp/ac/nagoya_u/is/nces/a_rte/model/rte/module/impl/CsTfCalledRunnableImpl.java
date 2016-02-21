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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ServerRunnableStartOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CsTfCalledRunnable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Cs Trusted Runnables</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CsTfCalledRunnableImpl#getCsTfOpidConstantName <em>Cs Tf Opid Constant Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.CsTfCalledRunnableImpl#getStartOperation <em>Start Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CsTfCalledRunnableImpl extends ModuleObjectImpl implements CsTfCalledRunnable {
	/**
	 * The default value of the '{@link #getCsTfOpidConstantName() <em>Cs Tf Opid Constant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfOpidConstantName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_TF_OPID_CONSTANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsTfOpidConstantName() <em>Cs Tf Opid Constant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsTfOpidConstantName()
	 * @generated
	 * @ordered
	 */
	protected String csTfOpidConstantName = CS_TF_OPID_CONSTANT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartOperation() <em>Start Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOperation()
	 * @generated
	 * @ordered
	 */
	protected ServerRunnableStartOperation startOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CsTfCalledRunnableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.CS_TF_CALLED_RUNNABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCsTfOpidConstantName() {
		return csTfOpidConstantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsTfOpidConstantName(String newCsTfOpidConstantName) {
		String oldCsTfOpidConstantName = csTfOpidConstantName;
		csTfOpidConstantName = newCsTfOpidConstantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CS_TF_CALLED_RUNNABLE__CS_TF_OPID_CONSTANT_NAME, oldCsTfOpidConstantName, csTfOpidConstantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerRunnableStartOperation getStartOperation() {
		return startOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartOperation(ServerRunnableStartOperation newStartOperation, NotificationChain msgs) {
		ServerRunnableStartOperation oldStartOperation = startOperation;
		startOperation = newStartOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModulePackage.CS_TF_CALLED_RUNNABLE__START_OPERATION, oldStartOperation, newStartOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOperation(ServerRunnableStartOperation newStartOperation) {
		if (newStartOperation != startOperation) {
			NotificationChain msgs = null;
			if (startOperation != null)
				msgs = ((InternalEObject)startOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModulePackage.CS_TF_CALLED_RUNNABLE__START_OPERATION, null, msgs);
			if (newStartOperation != null)
				msgs = ((InternalEObject)newStartOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModulePackage.CS_TF_CALLED_RUNNABLE__START_OPERATION, null, msgs);
			msgs = basicSetStartOperation(newStartOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.CS_TF_CALLED_RUNNABLE__START_OPERATION, newStartOperation, newStartOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.CS_TF_CALLED_RUNNABLE__START_OPERATION:
				return basicSetStartOperation(null, msgs);
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
			case ModulePackage.CS_TF_CALLED_RUNNABLE__CS_TF_OPID_CONSTANT_NAME:
				return getCsTfOpidConstantName();
			case ModulePackage.CS_TF_CALLED_RUNNABLE__START_OPERATION:
				return getStartOperation();
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
			case ModulePackage.CS_TF_CALLED_RUNNABLE__CS_TF_OPID_CONSTANT_NAME:
				setCsTfOpidConstantName((String)newValue);
				return;
			case ModulePackage.CS_TF_CALLED_RUNNABLE__START_OPERATION:
				setStartOperation((ServerRunnableStartOperation)newValue);
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
			case ModulePackage.CS_TF_CALLED_RUNNABLE__CS_TF_OPID_CONSTANT_NAME:
				setCsTfOpidConstantName(CS_TF_OPID_CONSTANT_NAME_EDEFAULT);
				return;
			case ModulePackage.CS_TF_CALLED_RUNNABLE__START_OPERATION:
				setStartOperation((ServerRunnableStartOperation)null);
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
			case ModulePackage.CS_TF_CALLED_RUNNABLE__CS_TF_OPID_CONSTANT_NAME:
				return CS_TF_OPID_CONSTANT_NAME_EDEFAULT == null ? csTfOpidConstantName != null : !CS_TF_OPID_CONSTANT_NAME_EDEFAULT.equals(csTfOpidConstantName);
			case ModulePackage.CS_TF_CALLED_RUNNABLE__START_OPERATION:
				return startOperation != null;
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
		result.append(" (csTfOpidConstantName: "); //$NON-NLS-1$
		result.append(csTfOpidConstantName);
		result.append(')');
		return result.toString();
	}

} //CsTfCalledRunnableImpl
