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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getCore <em>Core</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComCallback <em>Com Callback</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalPeriodicEntity <em>Com Send Signal Periodic Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalImmediateEntity <em>Com Send Signal Immediate Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalTrustedFunction <em>Com Send Signal Trusted Function</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentType <em>Dependent Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteType <em>Rte Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentOsApi <em>Dependent Os Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentIocCommunication <em>Dependent Ioc Communication</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentComApi <em>Dependent Com Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteStartApi <em>Rte Start Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getIocInitValueConstant <em>Ioc Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getDependentConstant <em>Dependent Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalImmediateTaskBody <em>Com Send Signal Immediate Task Body</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteStopApi <em>Rte Stop Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteTypeConstant <em>Rte Type Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteMemoryMapping <em>Rte Memory Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getGenerationInfo <em>Generation Info</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getBswm <em>Bswm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSchmInitApi <em>Schm Init Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSchmDeinitApi <em>Schm Deinit Api</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte()
 * @model
 * @generated
 */
public interface Rte extends LogicalCompartment {
	/**
	 * Returns the value of the '<em><b>Core</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_Core()
	 * @model containment="true"
	 * @generated
	 */
	EList<Core> getCore();

	/**
	 * Returns the value of the '<em><b>Com Callback</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallback}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Callback</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Callback</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_ComCallback()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComCallback> getComCallback();

	/**
	 * Returns the value of the '<em><b>Com Send Signal Periodic Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Send Signal Periodic Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Send Signal Periodic Entity</em>' containment reference.
	 * @see #setComSendSignalPeriodicEntity(ComSendSignalPeriodicEntity)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_ComSendSignalPeriodicEntity()
	 * @model containment="true"
	 * @generated
	 */
	ComSendSignalPeriodicEntity getComSendSignalPeriodicEntity();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalPeriodicEntity <em>Com Send Signal Periodic Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Send Signal Periodic Entity</em>' containment reference.
	 * @see #getComSendSignalPeriodicEntity()
	 * @generated
	 */
	void setComSendSignalPeriodicEntity(ComSendSignalPeriodicEntity value);

	/**
	 * Returns the value of the '<em><b>Com Send Signal Immediate Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Send Signal Immediate Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Send Signal Immediate Entity</em>' containment reference.
	 * @see #setComSendSignalImmediateEntity(ComSendSignalImmediateEntity)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_ComSendSignalImmediateEntity()
	 * @model containment="true"
	 * @generated
	 */
	ComSendSignalImmediateEntity getComSendSignalImmediateEntity();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalImmediateEntity <em>Com Send Signal Immediate Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Send Signal Immediate Entity</em>' containment reference.
	 * @see #getComSendSignalImmediateEntity()
	 * @generated
	 */
	void setComSendSignalImmediateEntity(ComSendSignalImmediateEntity value);

	/**
	 * Returns the value of the '<em><b>Com Send Signal Trusted Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Send Signal Trusted Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Send Signal Trusted Function</em>' containment reference.
	 * @see #setComSendSignalTrustedFunction(ComSendSignalTrustedFunction)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_ComSendSignalTrustedFunction()
	 * @model containment="true"
	 * @generated
	 */
	ComSendSignalTrustedFunction getComSendSignalTrustedFunction();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalTrustedFunction <em>Com Send Signal Trusted Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Send Signal Trusted Function</em>' containment reference.
	 * @see #getComSendSignalTrustedFunction()
	 * @generated
	 */
	void setComSendSignalTrustedFunction(ComSendSignalTrustedFunction value);

	/**
	 * Returns the value of the '<em><b>Dependent Type</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Type</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_DependentType()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getDependentType();

	/**
	 * Returns the value of the '<em><b>Rte Type</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Type</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_RteType()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getRteType();

	/**
	 * Returns the value of the '<em><b>Dependent Os Api</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsApi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Os Api</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Os Api</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_DependentOsApi()
	 * @model containment="true"
	 * @generated
	 */
	EList<OsApi> getDependentOsApi();

	/**
	 * Returns the value of the '<em><b>Dependent Ioc Communication</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocCommunication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Ioc Communication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Ioc Communication</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_DependentIocCommunication()
	 * @model containment="true"
	 * @generated
	 */
	EList<IocCommunication> getDependentIocCommunication();

	/**
	 * Returns the value of the '<em><b>Dependent Com Api</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComApi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Com Api</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Com Api</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_DependentComApi()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComApi> getDependentComApi();

	/**
	 * Returns the value of the '<em><b>Rte Start Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Start Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Start Api</em>' containment reference.
	 * @see #setRteStartApi(RteStartApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_RteStartApi()
	 * @model containment="true"
	 * @generated
	 */
	RteStartApi getRteStartApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteStartApi <em>Rte Start Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Start Api</em>' containment reference.
	 * @see #getRteStartApi()
	 * @generated
	 */
	void setRteStartApi(RteStartApi value);

	/**
	 * Returns the value of the '<em><b>Ioc Init Value Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ioc Init Value Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ioc Init Value Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_IocInitValueConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getIocInitValueConstant();

	/**
	 * Returns the value of the '<em><b>Dependent Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_DependentConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getDependentConstant();

	/**
	 * Returns the value of the '<em><b>Com Send Signal Immediate Task Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Send Signal Immediate Task Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Send Signal Immediate Task Body</em>' containment reference.
	 * @see #setComSendSignalImmediateTaskBody(ComSendSignalImmediateTaskBody)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_ComSendSignalImmediateTaskBody()
	 * @model containment="true"
	 * @generated
	 */
	ComSendSignalImmediateTaskBody getComSendSignalImmediateTaskBody();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getComSendSignalImmediateTaskBody <em>Com Send Signal Immediate Task Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Send Signal Immediate Task Body</em>' containment reference.
	 * @see #getComSendSignalImmediateTaskBody()
	 * @generated
	 */
	void setComSendSignalImmediateTaskBody(ComSendSignalImmediateTaskBody value);

	/**
	 * Returns the value of the '<em><b>Rte Stop Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Stop Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Stop Api</em>' containment reference.
	 * @see #setRteStopApi(RteStopApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_RteStopApi()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RteStopApi getRteStopApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getRteStopApi <em>Rte Stop Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Stop Api</em>' containment reference.
	 * @see #getRteStopApi()
	 * @generated
	 */
	void setRteStopApi(RteStopApi value);

	/**
	 * Returns the value of the '<em><b>Rte Type Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Type Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Type Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_RteTypeConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getRteTypeConstant();

	/**
	 * Returns the value of the '<em><b>Rte Memory Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Memory Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Memory Mapping</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_RteMemoryMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<BswMemoryMapping> getRteMemoryMapping();

	/**
	 * Returns the value of the '<em><b>Generation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Info</em>' containment reference.
	 * @see #setGenerationInfo(GenerationInfo)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_GenerationInfo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GenerationInfo getGenerationInfo();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getGenerationInfo <em>Generation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Info</em>' containment reference.
	 * @see #getGenerationInfo()
	 * @generated
	 */
	void setGenerationInfo(GenerationInfo value);

	/**
	 * Returns the value of the '<em><b>Bswm</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bswm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bswm</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_Bswm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bswm> getBswm();

	/**
	 * Returns the value of the '<em><b>Schm Init Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schm Init Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schm Init Api</em>' containment reference.
	 * @see #setSchmInitApi(SchmInitApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_SchmInitApi()
	 * @model containment="true"
	 * @generated
	 */
	SchmInitApi getSchmInitApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSchmInitApi <em>Schm Init Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schm Init Api</em>' containment reference.
	 * @see #getSchmInitApi()
	 * @generated
	 */
	void setSchmInitApi(SchmInitApi value);

	/**
	 * Returns the value of the '<em><b>Schm Deinit Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schm Deinit Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schm Deinit Api</em>' containment reference.
	 * @see #setSchmDeinitApi(SchmDeinitApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRte_SchmDeinitApi()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SchmDeinitApi getSchmDeinitApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Rte#getSchmDeinitApi <em>Schm Deinit Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schm Deinit Api</em>' containment reference.
	 * @see #getSchmDeinitApi()
	 * @generated
	 */
	void setSchmDeinitApi(SchmDeinitApi value);

} // Rte
