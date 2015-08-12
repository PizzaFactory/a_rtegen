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

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RteEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.RunnableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ServerCallPoint;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwcInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableAccess;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runnable Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RunnableEntityImpl#getDataSendPoint <em>Data Send Point</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RunnableEntityImpl#getDataReceivePointByArgument <em>Data Receive Point By Argument</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RunnableEntityImpl#getServerCallPoint <em>Server Call Point</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RunnableEntityImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RunnableEntityImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RunnableEntityImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RunnableEntityImpl#getWrittenLocalVariable <em>Written Local Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.RunnableEntityImpl#getReadLocalVariable <em>Read Local Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunnableEntityImpl extends ExecutableEntityImpl implements RunnableEntity {
	/**
	 * The cached value of the '{@link #getDataSendPoint() <em>Data Send Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSendPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableAccess> dataSendPoint;

	/**
	 * The cached value of the '{@link #getDataReceivePointByArgument() <em>Data Receive Point By Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataReceivePointByArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableAccess> dataReceivePointByArgument;

	/**
	 * The cached value of the '{@link #getServerCallPoint() <em>Server Call Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerCallPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ServerCallPoint> serverCallPoint;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<RteEvent> event;

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWrittenLocalVariable() <em>Written Local Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrittenLocalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableAccess> writtenLocalVariable;

	/**
	 * The cached value of the '{@link #getReadLocalVariable() <em>Read Local Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadLocalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableAccess> readLocalVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnableEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.RUNNABLE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableAccess> getDataSendPoint() {
		if (dataSendPoint == null) {
			dataSendPoint = new EObjectContainmentEList<VariableAccess>(VariableAccess.class, this, M2Package.RUNNABLE_ENTITY__DATA_SEND_POINT);
		}
		return dataSendPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableAccess> getDataReceivePointByArgument() {
		if (dataReceivePointByArgument == null) {
			dataReceivePointByArgument = new EObjectContainmentEList<VariableAccess>(VariableAccess.class, this, M2Package.RUNNABLE_ENTITY__DATA_RECEIVE_POINT_BY_ARGUMENT);
		}
		return dataReceivePointByArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.RUNNABLE_ENTITY__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableAccess> getWrittenLocalVariable() {
		if (writtenLocalVariable == null) {
			writtenLocalVariable = new EObjectContainmentEList<VariableAccess>(VariableAccess.class, this, M2Package.RUNNABLE_ENTITY__WRITTEN_LOCAL_VARIABLE);
		}
		return writtenLocalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableAccess> getReadLocalVariable() {
		if (readLocalVariable == null) {
			readLocalVariable = new EObjectContainmentEList<VariableAccess>(VariableAccess.class, this, M2Package.RUNNABLE_ENTITY__READ_LOCAL_VARIABLE);
		}
		return readLocalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServerCallPoint> getServerCallPoint() {
		if (serverCallPoint == null) {
			serverCallPoint = new EObjectContainmentEList<ServerCallPoint>(ServerCallPoint.class, this, M2Package.RUNNABLE_ENTITY__SERVER_CALL_POINT);
		}
		return serverCallPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteEvent> getEvent() {
		if (event == null) {
			event = new EObjectWithInverseResolvingEList<RteEvent>(RteEvent.class, this, M2Package.RUNNABLE_ENTITY__EVENT, M2Package.RTE_EVENT__START_ON_EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwcInternalBehavior getParent() {
		if (eContainerFeatureID() != M2Package.RUNNABLE_ENTITY__PARENT) return null;
		return (SwcInternalBehavior)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(SwcInternalBehavior newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, M2Package.RUNNABLE_ENTITY__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(SwcInternalBehavior newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != M2Package.RUNNABLE_ENTITY__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, M2Package.SWC_INTERNAL_BEHAVIOR__RUNNABLE, SwcInternalBehavior.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.RUNNABLE_ENTITY__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.RUNNABLE_ENTITY__EVENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvent()).basicAdd(otherEnd, msgs);
			case M2Package.RUNNABLE_ENTITY__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((SwcInternalBehavior)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.RUNNABLE_ENTITY__DATA_SEND_POINT:
				return ((InternalEList<?>)getDataSendPoint()).basicRemove(otherEnd, msgs);
			case M2Package.RUNNABLE_ENTITY__DATA_RECEIVE_POINT_BY_ARGUMENT:
				return ((InternalEList<?>)getDataReceivePointByArgument()).basicRemove(otherEnd, msgs);
			case M2Package.RUNNABLE_ENTITY__SERVER_CALL_POINT:
				return ((InternalEList<?>)getServerCallPoint()).basicRemove(otherEnd, msgs);
			case M2Package.RUNNABLE_ENTITY__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case M2Package.RUNNABLE_ENTITY__PARENT:
				return basicSetParent(null, msgs);
			case M2Package.RUNNABLE_ENTITY__WRITTEN_LOCAL_VARIABLE:
				return ((InternalEList<?>)getWrittenLocalVariable()).basicRemove(otherEnd, msgs);
			case M2Package.RUNNABLE_ENTITY__READ_LOCAL_VARIABLE:
				return ((InternalEList<?>)getReadLocalVariable()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case M2Package.RUNNABLE_ENTITY__PARENT:
				return eInternalContainer().eInverseRemove(this, M2Package.SWC_INTERNAL_BEHAVIOR__RUNNABLE, SwcInternalBehavior.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.RUNNABLE_ENTITY__DATA_SEND_POINT:
				return getDataSendPoint();
			case M2Package.RUNNABLE_ENTITY__DATA_RECEIVE_POINT_BY_ARGUMENT:
				return getDataReceivePointByArgument();
			case M2Package.RUNNABLE_ENTITY__SERVER_CALL_POINT:
				return getServerCallPoint();
			case M2Package.RUNNABLE_ENTITY__EVENT:
				return getEvent();
			case M2Package.RUNNABLE_ENTITY__PARENT:
				return getParent();
			case M2Package.RUNNABLE_ENTITY__SYMBOL:
				return getSymbol();
			case M2Package.RUNNABLE_ENTITY__WRITTEN_LOCAL_VARIABLE:
				return getWrittenLocalVariable();
			case M2Package.RUNNABLE_ENTITY__READ_LOCAL_VARIABLE:
				return getReadLocalVariable();
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
			case M2Package.RUNNABLE_ENTITY__DATA_SEND_POINT:
				getDataSendPoint().clear();
				getDataSendPoint().addAll((Collection<? extends VariableAccess>)newValue);
				return;
			case M2Package.RUNNABLE_ENTITY__DATA_RECEIVE_POINT_BY_ARGUMENT:
				getDataReceivePointByArgument().clear();
				getDataReceivePointByArgument().addAll((Collection<? extends VariableAccess>)newValue);
				return;
			case M2Package.RUNNABLE_ENTITY__SERVER_CALL_POINT:
				getServerCallPoint().clear();
				getServerCallPoint().addAll((Collection<? extends ServerCallPoint>)newValue);
				return;
			case M2Package.RUNNABLE_ENTITY__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends RteEvent>)newValue);
				return;
			case M2Package.RUNNABLE_ENTITY__PARENT:
				setParent((SwcInternalBehavior)newValue);
				return;
			case M2Package.RUNNABLE_ENTITY__SYMBOL:
				setSymbol((String)newValue);
				return;
			case M2Package.RUNNABLE_ENTITY__WRITTEN_LOCAL_VARIABLE:
				getWrittenLocalVariable().clear();
				getWrittenLocalVariable().addAll((Collection<? extends VariableAccess>)newValue);
				return;
			case M2Package.RUNNABLE_ENTITY__READ_LOCAL_VARIABLE:
				getReadLocalVariable().clear();
				getReadLocalVariable().addAll((Collection<? extends VariableAccess>)newValue);
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
			case M2Package.RUNNABLE_ENTITY__DATA_SEND_POINT:
				getDataSendPoint().clear();
				return;
			case M2Package.RUNNABLE_ENTITY__DATA_RECEIVE_POINT_BY_ARGUMENT:
				getDataReceivePointByArgument().clear();
				return;
			case M2Package.RUNNABLE_ENTITY__SERVER_CALL_POINT:
				getServerCallPoint().clear();
				return;
			case M2Package.RUNNABLE_ENTITY__EVENT:
				getEvent().clear();
				return;
			case M2Package.RUNNABLE_ENTITY__PARENT:
				setParent((SwcInternalBehavior)null);
				return;
			case M2Package.RUNNABLE_ENTITY__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case M2Package.RUNNABLE_ENTITY__WRITTEN_LOCAL_VARIABLE:
				getWrittenLocalVariable().clear();
				return;
			case M2Package.RUNNABLE_ENTITY__READ_LOCAL_VARIABLE:
				getReadLocalVariable().clear();
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
			case M2Package.RUNNABLE_ENTITY__DATA_SEND_POINT:
				return dataSendPoint != null && !dataSendPoint.isEmpty();
			case M2Package.RUNNABLE_ENTITY__DATA_RECEIVE_POINT_BY_ARGUMENT:
				return dataReceivePointByArgument != null && !dataReceivePointByArgument.isEmpty();
			case M2Package.RUNNABLE_ENTITY__SERVER_CALL_POINT:
				return serverCallPoint != null && !serverCallPoint.isEmpty();
			case M2Package.RUNNABLE_ENTITY__EVENT:
				return event != null && !event.isEmpty();
			case M2Package.RUNNABLE_ENTITY__PARENT:
				return getParent() != null;
			case M2Package.RUNNABLE_ENTITY__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case M2Package.RUNNABLE_ENTITY__WRITTEN_LOCAL_VARIABLE:
				return writtenLocalVariable != null && !writtenLocalVariable.isEmpty();
			case M2Package.RUNNABLE_ENTITY__READ_LOCAL_VARIABLE:
				return readLocalVariable != null && !readLocalVariable.isEmpty();
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
		result.append(" (symbol: ");
		result.append(symbol);
		result.append(')');
		return result.toString();
	}

} //RunnableEntityImpl
