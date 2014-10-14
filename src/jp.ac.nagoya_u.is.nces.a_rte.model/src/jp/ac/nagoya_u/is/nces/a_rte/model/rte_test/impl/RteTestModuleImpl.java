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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.BswmMockSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.ComStubHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.IocMockSource;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.OsStubHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestModule;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.RteTestPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.SwcMockSource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestModuleImpl#getOsStubHeader <em>Os Stub Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestModuleImpl#getComStubHeader <em>Com Stub Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestModuleImpl#getIocMockHeader <em>Ioc Mock Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestModuleImpl#getSwcMockHeader <em>Swc Mock Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestModuleImpl#getSwcMockSource <em>Swc Mock Source</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestModuleImpl#getIocMockSource <em>Ioc Mock Source</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestModuleImpl#getBswmMockHeader <em>Bswm Mock Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte_test.impl.RteTestModuleImpl#getBswmMockSource <em>Bswm Mock Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteTestModuleImpl extends MinimalEObjectImpl.Container implements RteTestModule {
	/**
	 * The cached value of the '{@link #getOsStubHeader() <em>Os Stub Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsStubHeader()
	 * @generated
	 * @ordered
	 */
	protected OsStubHeader osStubHeader;

	/**
	 * The cached value of the '{@link #getComStubHeader() <em>Com Stub Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComStubHeader()
	 * @generated
	 * @ordered
	 */
	protected ComStubHeader comStubHeader;

	/**
	 * The cached value of the '{@link #getIocMockHeader() <em>Ioc Mock Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIocMockHeader()
	 * @generated
	 * @ordered
	 */
	protected IocMockHeader iocMockHeader;

	/**
	 * The cached value of the '{@link #getSwcMockHeader() <em>Swc Mock Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwcMockHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<SwcMockHeader> swcMockHeader;

	/**
	 * The cached value of the '{@link #getSwcMockSource() <em>Swc Mock Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwcMockSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SwcMockSource> swcMockSource;

	/**
	 * The cached value of the '{@link #getIocMockSource() <em>Ioc Mock Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIocMockSource()
	 * @generated
	 * @ordered
	 */
	protected IocMockSource iocMockSource;

	/**
	 * The cached value of the '{@link #getBswmMockHeader() <em>Bswm Mock Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswmMockHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<BswmMockHeader> bswmMockHeader;

	/**
	 * The cached value of the '{@link #getBswmMockSource() <em>Bswm Mock Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswmMockSource()
	 * @generated
	 * @ordered
	 */
	protected EList<BswmMockSource> bswmMockSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteTestModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RteTestPackage.Literals.RTE_TEST_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsStubHeader getOsStubHeader() {
		return osStubHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOsStubHeader(OsStubHeader newOsStubHeader, NotificationChain msgs) {
		OsStubHeader oldOsStubHeader = osStubHeader;
		osStubHeader = newOsStubHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RteTestPackage.RTE_TEST_MODULE__OS_STUB_HEADER, oldOsStubHeader, newOsStubHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsStubHeader(OsStubHeader newOsStubHeader) {
		if (newOsStubHeader != osStubHeader) {
			NotificationChain msgs = null;
			if (osStubHeader != null)
				msgs = ((InternalEObject)osStubHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RteTestPackage.RTE_TEST_MODULE__OS_STUB_HEADER, null, msgs);
			if (newOsStubHeader != null)
				msgs = ((InternalEObject)newOsStubHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RteTestPackage.RTE_TEST_MODULE__OS_STUB_HEADER, null, msgs);
			msgs = basicSetOsStubHeader(newOsStubHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RteTestPackage.RTE_TEST_MODULE__OS_STUB_HEADER, newOsStubHeader, newOsStubHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComStubHeader getComStubHeader() {
		return comStubHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComStubHeader(ComStubHeader newComStubHeader, NotificationChain msgs) {
		ComStubHeader oldComStubHeader = comStubHeader;
		comStubHeader = newComStubHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RteTestPackage.RTE_TEST_MODULE__COM_STUB_HEADER, oldComStubHeader, newComStubHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComStubHeader(ComStubHeader newComStubHeader) {
		if (newComStubHeader != comStubHeader) {
			NotificationChain msgs = null;
			if (comStubHeader != null)
				msgs = ((InternalEObject)comStubHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RteTestPackage.RTE_TEST_MODULE__COM_STUB_HEADER, null, msgs);
			if (newComStubHeader != null)
				msgs = ((InternalEObject)newComStubHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RteTestPackage.RTE_TEST_MODULE__COM_STUB_HEADER, null, msgs);
			msgs = basicSetComStubHeader(newComStubHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RteTestPackage.RTE_TEST_MODULE__COM_STUB_HEADER, newComStubHeader, newComStubHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocMockHeader getIocMockHeader() {
		return iocMockHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIocMockHeader(IocMockHeader newIocMockHeader, NotificationChain msgs) {
		IocMockHeader oldIocMockHeader = iocMockHeader;
		iocMockHeader = newIocMockHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_HEADER, oldIocMockHeader, newIocMockHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIocMockHeader(IocMockHeader newIocMockHeader) {
		if (newIocMockHeader != iocMockHeader) {
			NotificationChain msgs = null;
			if (iocMockHeader != null)
				msgs = ((InternalEObject)iocMockHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_HEADER, null, msgs);
			if (newIocMockHeader != null)
				msgs = ((InternalEObject)newIocMockHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_HEADER, null, msgs);
			msgs = basicSetIocMockHeader(newIocMockHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_HEADER, newIocMockHeader, newIocMockHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwcMockHeader> getSwcMockHeader() {
		if (swcMockHeader == null) {
			swcMockHeader = new EObjectContainmentEList<SwcMockHeader>(SwcMockHeader.class, this, RteTestPackage.RTE_TEST_MODULE__SWC_MOCK_HEADER);
		}
		return swcMockHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwcMockSource> getSwcMockSource() {
		if (swcMockSource == null) {
			swcMockSource = new EObjectContainmentEList<SwcMockSource>(SwcMockSource.class, this, RteTestPackage.RTE_TEST_MODULE__SWC_MOCK_SOURCE);
		}
		return swcMockSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocMockSource getIocMockSource() {
		return iocMockSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIocMockSource(IocMockSource newIocMockSource, NotificationChain msgs) {
		IocMockSource oldIocMockSource = iocMockSource;
		iocMockSource = newIocMockSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_SOURCE, oldIocMockSource, newIocMockSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIocMockSource(IocMockSource newIocMockSource) {
		if (newIocMockSource != iocMockSource) {
			NotificationChain msgs = null;
			if (iocMockSource != null)
				msgs = ((InternalEObject)iocMockSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_SOURCE, null, msgs);
			if (newIocMockSource != null)
				msgs = ((InternalEObject)newIocMockSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_SOURCE, null, msgs);
			msgs = basicSetIocMockSource(newIocMockSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_SOURCE, newIocMockSource, newIocMockSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswmMockHeader> getBswmMockHeader() {
		if (bswmMockHeader == null) {
			bswmMockHeader = new EObjectContainmentEList<BswmMockHeader>(BswmMockHeader.class, this, RteTestPackage.RTE_TEST_MODULE__BSWM_MOCK_HEADER);
		}
		return bswmMockHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswmMockSource> getBswmMockSource() {
		if (bswmMockSource == null) {
			bswmMockSource = new EObjectContainmentEList<BswmMockSource>(BswmMockSource.class, this, RteTestPackage.RTE_TEST_MODULE__BSWM_MOCK_SOURCE);
		}
		return bswmMockSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RteTestPackage.RTE_TEST_MODULE__OS_STUB_HEADER:
				return basicSetOsStubHeader(null, msgs);
			case RteTestPackage.RTE_TEST_MODULE__COM_STUB_HEADER:
				return basicSetComStubHeader(null, msgs);
			case RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_HEADER:
				return basicSetIocMockHeader(null, msgs);
			case RteTestPackage.RTE_TEST_MODULE__SWC_MOCK_HEADER:
				return ((InternalEList<?>)getSwcMockHeader()).basicRemove(otherEnd, msgs);
			case RteTestPackage.RTE_TEST_MODULE__SWC_MOCK_SOURCE:
				return ((InternalEList<?>)getSwcMockSource()).basicRemove(otherEnd, msgs);
			case RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_SOURCE:
				return basicSetIocMockSource(null, msgs);
			case RteTestPackage.RTE_TEST_MODULE__BSWM_MOCK_HEADER:
				return ((InternalEList<?>)getBswmMockHeader()).basicRemove(otherEnd, msgs);
			case RteTestPackage.RTE_TEST_MODULE__BSWM_MOCK_SOURCE:
				return ((InternalEList<?>)getBswmMockSource()).basicRemove(otherEnd, msgs);
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
			case RteTestPackage.RTE_TEST_MODULE__OS_STUB_HEADER:
				return getOsStubHeader();
			case RteTestPackage.RTE_TEST_MODULE__COM_STUB_HEADER:
				return getComStubHeader();
			case RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_HEADER:
				return getIocMockHeader();
			case RteTestPackage.RTE_TEST_MODULE__SWC_MOCK_HEADER:
				return getSwcMockHeader();
			case RteTestPackage.RTE_TEST_MODULE__SWC_MOCK_SOURCE:
				return getSwcMockSource();
			case RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_SOURCE:
				return getIocMockSource();
			case RteTestPackage.RTE_TEST_MODULE__BSWM_MOCK_HEADER:
				return getBswmMockHeader();
			case RteTestPackage.RTE_TEST_MODULE__BSWM_MOCK_SOURCE:
				return getBswmMockSource();
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
			case RteTestPackage.RTE_TEST_MODULE__OS_STUB_HEADER:
				setOsStubHeader((OsStubHeader)newValue);
				return;
			case RteTestPackage.RTE_TEST_MODULE__COM_STUB_HEADER:
				setComStubHeader((ComStubHeader)newValue);
				return;
			case RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_HEADER:
				setIocMockHeader((IocMockHeader)newValue);
				return;
			case RteTestPackage.RTE_TEST_MODULE__SWC_MOCK_HEADER:
				getSwcMockHeader().clear();
				getSwcMockHeader().addAll((Collection<? extends SwcMockHeader>)newValue);
				return;
			case RteTestPackage.RTE_TEST_MODULE__SWC_MOCK_SOURCE:
				getSwcMockSource().clear();
				getSwcMockSource().addAll((Collection<? extends SwcMockSource>)newValue);
				return;
			case RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_SOURCE:
				setIocMockSource((IocMockSource)newValue);
				return;
			case RteTestPackage.RTE_TEST_MODULE__BSWM_MOCK_HEADER:
				getBswmMockHeader().clear();
				getBswmMockHeader().addAll((Collection<? extends BswmMockHeader>)newValue);
				return;
			case RteTestPackage.RTE_TEST_MODULE__BSWM_MOCK_SOURCE:
				getBswmMockSource().clear();
				getBswmMockSource().addAll((Collection<? extends BswmMockSource>)newValue);
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
			case RteTestPackage.RTE_TEST_MODULE__OS_STUB_HEADER:
				setOsStubHeader((OsStubHeader)null);
				return;
			case RteTestPackage.RTE_TEST_MODULE__COM_STUB_HEADER:
				setComStubHeader((ComStubHeader)null);
				return;
			case RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_HEADER:
				setIocMockHeader((IocMockHeader)null);
				return;
			case RteTestPackage.RTE_TEST_MODULE__SWC_MOCK_HEADER:
				getSwcMockHeader().clear();
				return;
			case RteTestPackage.RTE_TEST_MODULE__SWC_MOCK_SOURCE:
				getSwcMockSource().clear();
				return;
			case RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_SOURCE:
				setIocMockSource((IocMockSource)null);
				return;
			case RteTestPackage.RTE_TEST_MODULE__BSWM_MOCK_HEADER:
				getBswmMockHeader().clear();
				return;
			case RteTestPackage.RTE_TEST_MODULE__BSWM_MOCK_SOURCE:
				getBswmMockSource().clear();
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
			case RteTestPackage.RTE_TEST_MODULE__OS_STUB_HEADER:
				return osStubHeader != null;
			case RteTestPackage.RTE_TEST_MODULE__COM_STUB_HEADER:
				return comStubHeader != null;
			case RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_HEADER:
				return iocMockHeader != null;
			case RteTestPackage.RTE_TEST_MODULE__SWC_MOCK_HEADER:
				return swcMockHeader != null && !swcMockHeader.isEmpty();
			case RteTestPackage.RTE_TEST_MODULE__SWC_MOCK_SOURCE:
				return swcMockSource != null && !swcMockSource.isEmpty();
			case RteTestPackage.RTE_TEST_MODULE__IOC_MOCK_SOURCE:
				return iocMockSource != null;
			case RteTestPackage.RTE_TEST_MODULE__BSWM_MOCK_HEADER:
				return bswmMockHeader != null && !bswmMockHeader.isEmpty();
			case RteTestPackage.RTE_TEST_MODULE__BSWM_MOCK_SOURCE:
				return bswmMockSource != null && !bswmMockSource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RteTestModuleImpl
