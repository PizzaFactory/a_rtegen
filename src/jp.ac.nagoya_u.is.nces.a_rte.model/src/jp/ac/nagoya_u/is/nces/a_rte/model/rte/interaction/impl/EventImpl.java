/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ExecutableEntity;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.Event;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EventImpl#getStartOnEvent <em>Start On Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.EventImpl#getBswEvent <em>Bsw Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends InteractionObjectImpl implements Event {
	/**
	 * The cached value of the '{@link #getStartOnEvent() <em>Start On Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOnEvent()
	 * @generated
	 * @ordered
	 */
	protected ExecutableEntity startOnEvent;

	/**
	 * The cached value of the '{@link #getBswEvent() <em>Bsw Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBswEvent()
	 * @generated
	 * @ordered
	 */
	protected BswEvent bswEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableEntity getStartOnEvent() {
		if (startOnEvent != null && ((EObject)startOnEvent).eIsProxy()) {
			InternalEObject oldStartOnEvent = (InternalEObject)startOnEvent;
			startOnEvent = (ExecutableEntity)eResolveProxy(oldStartOnEvent);
			if (startOnEvent != oldStartOnEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.EVENT__START_ON_EVENT, oldStartOnEvent, startOnEvent));
			}
		}
		return startOnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableEntity basicGetStartOnEvent() {
		return startOnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOnEvent(ExecutableEntity newStartOnEvent) {
		ExecutableEntity oldStartOnEvent = startOnEvent;
		startOnEvent = newStartOnEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.EVENT__START_ON_EVENT, oldStartOnEvent, startOnEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswEvent getBswEvent() {
		if (bswEvent != null && ((EObject)bswEvent).eIsProxy()) {
			InternalEObject oldBswEvent = (InternalEObject)bswEvent;
			bswEvent = (BswEvent)eResolveProxy(oldBswEvent);
			if (bswEvent != oldBswEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.EVENT__BSW_EVENT, oldBswEvent, bswEvent));
			}
		}
		return bswEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswEvent basicGetBswEvent() {
		return bswEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBswEvent(BswEvent newBswEvent) {
		BswEvent oldBswEvent = bswEvent;
		bswEvent = newBswEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.EVENT__BSW_EVENT, oldBswEvent, bswEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.EVENT__START_ON_EVENT:
				if (resolve) return getStartOnEvent();
				return basicGetStartOnEvent();
			case InteractionPackage.EVENT__BSW_EVENT:
				if (resolve) return getBswEvent();
				return basicGetBswEvent();
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
			case InteractionPackage.EVENT__START_ON_EVENT:
				setStartOnEvent((ExecutableEntity)newValue);
				return;
			case InteractionPackage.EVENT__BSW_EVENT:
				setBswEvent((BswEvent)newValue);
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
			case InteractionPackage.EVENT__START_ON_EVENT:
				setStartOnEvent((ExecutableEntity)null);
				return;
			case InteractionPackage.EVENT__BSW_EVENT:
				setBswEvent((BswEvent)null);
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
			case InteractionPackage.EVENT__START_ON_EVENT:
				return startOnEvent != null;
			case InteractionPackage.EVENT__BSW_EVENT:
				return bswEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //EventImpl
