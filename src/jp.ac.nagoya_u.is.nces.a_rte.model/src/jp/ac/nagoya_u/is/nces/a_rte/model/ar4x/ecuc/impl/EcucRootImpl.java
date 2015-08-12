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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObjectImpl;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Com;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcuC;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Os;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.Rte;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucRootImpl#getRte <em>Rte</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucRootImpl#getOs <em>Os</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucRootImpl#getCom <em>Com</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.impl.EcucRootImpl#getEcuC <em>Ecu C</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcucRootImpl extends ExtendedEObjectImpl implements EcucRoot {
	/**
	 * The cached value of the '{@link #getRte() <em>Rte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRte()
	 * @generated
	 * @ordered
	 */
	protected Rte rte;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected Os os;

	/**
	 * The cached value of the '{@link #getCom() <em>Com</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCom()
	 * @generated
	 * @ordered
	 */
	protected Com com;

	/**
	 * The cached value of the '{@link #getEcuC() <em>Ecu C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcuC()
	 * @generated
	 * @ordered
	 */
	protected EcuC ecuC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcucRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcucPackage.Literals.ECUC_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rte getRte() {
		return rte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRte(Rte newRte, NotificationChain msgs) {
		Rte oldRte = rte;
		rte = newRte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__RTE, oldRte, newRte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRte(Rte newRte) {
		if (newRte != rte) {
			NotificationChain msgs = null;
			if (rte != null)
				msgs = ((InternalEObject)rte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__RTE, null, msgs);
			if (newRte != null)
				msgs = ((InternalEObject)newRte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__RTE, null, msgs);
			msgs = basicSetRte(newRte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__RTE, newRte, newRte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Os getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOs(Os newOs, NotificationChain msgs) {
		Os oldOs = os;
		os = newOs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__OS, oldOs, newOs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(Os newOs) {
		if (newOs != os) {
			NotificationChain msgs = null;
			if (os != null)
				msgs = ((InternalEObject)os).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__OS, null, msgs);
			if (newOs != null)
				msgs = ((InternalEObject)newOs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__OS, null, msgs);
			msgs = basicSetOs(newOs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__OS, newOs, newOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Com getCom() {
		return com;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCom(Com newCom, NotificationChain msgs) {
		Com oldCom = com;
		com = newCom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__COM, oldCom, newCom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCom(Com newCom) {
		if (newCom != com) {
			NotificationChain msgs = null;
			if (com != null)
				msgs = ((InternalEObject)com).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__COM, null, msgs);
			if (newCom != null)
				msgs = ((InternalEObject)newCom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__COM, null, msgs);
			msgs = basicSetCom(newCom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__COM, newCom, newCom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcuC getEcuC() {
		return ecuC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEcuC(EcuC newEcuC, NotificationChain msgs) {
		EcuC oldEcuC = ecuC;
		ecuC = newEcuC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__ECU_C, oldEcuC, newEcuC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcuC(EcuC newEcuC) {
		if (newEcuC != ecuC) {
			NotificationChain msgs = null;
			if (ecuC != null)
				msgs = ((InternalEObject)ecuC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__ECU_C, null, msgs);
			if (newEcuC != null)
				msgs = ((InternalEObject)newEcuC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcucPackage.ECUC_ROOT__ECU_C, null, msgs);
			msgs = basicSetEcuC(newEcuC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcucPackage.ECUC_ROOT__ECU_C, newEcuC, newEcuC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcucPackage.ECUC_ROOT__RTE:
				return basicSetRte(null, msgs);
			case EcucPackage.ECUC_ROOT__OS:
				return basicSetOs(null, msgs);
			case EcucPackage.ECUC_ROOT__COM:
				return basicSetCom(null, msgs);
			case EcucPackage.ECUC_ROOT__ECU_C:
				return basicSetEcuC(null, msgs);
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
			case EcucPackage.ECUC_ROOT__RTE:
				return getRte();
			case EcucPackage.ECUC_ROOT__OS:
				return getOs();
			case EcucPackage.ECUC_ROOT__COM:
				return getCom();
			case EcucPackage.ECUC_ROOT__ECU_C:
				return getEcuC();
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
			case EcucPackage.ECUC_ROOT__RTE:
				setRte((Rte)newValue);
				return;
			case EcucPackage.ECUC_ROOT__OS:
				setOs((Os)newValue);
				return;
			case EcucPackage.ECUC_ROOT__COM:
				setCom((Com)newValue);
				return;
			case EcucPackage.ECUC_ROOT__ECU_C:
				setEcuC((EcuC)newValue);
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
			case EcucPackage.ECUC_ROOT__RTE:
				setRte((Rte)null);
				return;
			case EcucPackage.ECUC_ROOT__OS:
				setOs((Os)null);
				return;
			case EcucPackage.ECUC_ROOT__COM:
				setCom((Com)null);
				return;
			case EcucPackage.ECUC_ROOT__ECU_C:
				setEcuC((EcuC)null);
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
			case EcucPackage.ECUC_ROOT__RTE:
				return rte != null;
			case EcucPackage.ECUC_ROOT__OS:
				return os != null;
			case EcucPackage.ECUC_ROOT__COM:
				return com != null;
			case EcucPackage.ECUC_ROOT__ECU_C:
				return ecuC != null;
		}
		return super.eIsSet(featureID);
	}

} //EcucRootImpl
