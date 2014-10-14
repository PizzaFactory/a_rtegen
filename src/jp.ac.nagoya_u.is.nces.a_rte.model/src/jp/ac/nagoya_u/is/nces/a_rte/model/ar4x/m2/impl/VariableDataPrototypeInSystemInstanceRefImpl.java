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
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import java.util.Collection;
import java.util.Collections;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.IInstanceRef;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.PortPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototypeInSystemInstanceRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Data Prototype In System Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableDataPrototypeInSystemInstanceRefImpl#getInstanceRef <em>Instance Ref</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableDataPrototypeInSystemInstanceRefImpl#getContextComponent <em>Context Component</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableDataPrototypeInSystemInstanceRefImpl#getContextPort <em>Context Port</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.VariableDataPrototypeInSystemInstanceRefImpl#getTargetDataPrototype <em>Target Data Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDataPrototypeInSystemInstanceRefImpl extends M2ObjectImpl implements VariableDataPrototypeInSystemInstanceRef {
	/**
	 * The cached value of the '{@link #getContextComponent() <em>Context Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextComponent()
	 * @generated
	 * @ordered
	 */
	protected SwComponentPrototype contextComponent;

	/**
	 * The cached value of the '{@link #getContextPort() <em>Context Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextPort()
	 * @generated
	 * @ordered
	 */
	protected PortPrototype contextPort;

	/**
	 * The cached value of the '{@link #getTargetDataPrototype() <em>Target Data Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDataPrototype()
	 * @generated
	 * @ordered
	 */
	protected VariableDataPrototype targetDataPrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDataPrototypeInSystemInstanceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getInstanceRef() {
		BasicInternalEList<String> instanceRefs = new BasicInternalEList<String>(String.class);
		if (getContextComponent() != null) {
			instanceRefs.add(getContextComponent().getId());
		}
		Collections.addAll(instanceRefs, getContextPort().getId(), getTargetDataPrototype().getId());
		return instanceRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwComponentPrototype getContextComponent() {
		if (contextComponent != null && ((EObject)contextComponent).eIsProxy()) {
			InternalEObject oldContextComponent = (InternalEObject)contextComponent;
			contextComponent = (SwComponentPrototype)eResolveProxy(oldContextComponent);
			if (contextComponent != oldContextComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_COMPONENT, oldContextComponent, contextComponent));
			}
		}
		return contextComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwComponentPrototype basicGetContextComponent() {
		return contextComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextComponent(SwComponentPrototype newContextComponent) {
		SwComponentPrototype oldContextComponent = contextComponent;
		contextComponent = newContextComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_COMPONENT, oldContextComponent, contextComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPrototype getContextPort() {
		if (contextPort != null && ((EObject)contextPort).eIsProxy()) {
			InternalEObject oldContextPort = (InternalEObject)contextPort;
			contextPort = (PortPrototype)eResolveProxy(oldContextPort);
			if (contextPort != oldContextPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_PORT, oldContextPort, contextPort));
			}
		}
		return contextPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPrototype basicGetContextPort() {
		return contextPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextPort(PortPrototype newContextPort) {
		PortPrototype oldContextPort = contextPort;
		contextPort = newContextPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_PORT, oldContextPort, contextPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototype getTargetDataPrototype() {
		if (targetDataPrototype != null && ((EObject)targetDataPrototype).eIsProxy()) {
			InternalEObject oldTargetDataPrototype = (InternalEObject)targetDataPrototype;
			targetDataPrototype = (VariableDataPrototype)eResolveProxy(oldTargetDataPrototype);
			if (targetDataPrototype != oldTargetDataPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__TARGET_DATA_PROTOTYPE, oldTargetDataPrototype, targetDataPrototype));
			}
		}
		return targetDataPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDataPrototype basicGetTargetDataPrototype() {
		return targetDataPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDataPrototype(VariableDataPrototype newTargetDataPrototype) {
		VariableDataPrototype oldTargetDataPrototype = targetDataPrototype;
		targetDataPrototype = newTargetDataPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__TARGET_DATA_PROTOTYPE, oldTargetDataPrototype, targetDataPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__INSTANCE_REF:
				return getInstanceRef();
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_COMPONENT:
				if (resolve) return getContextComponent();
				return basicGetContextComponent();
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_PORT:
				if (resolve) return getContextPort();
				return basicGetContextPort();
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__TARGET_DATA_PROTOTYPE:
				if (resolve) return getTargetDataPrototype();
				return basicGetTargetDataPrototype();
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
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__INSTANCE_REF:
				getInstanceRef().clear();
				getInstanceRef().addAll((Collection<? extends String>)newValue);
				return;
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_COMPONENT:
				setContextComponent((SwComponentPrototype)newValue);
				return;
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_PORT:
				setContextPort((PortPrototype)newValue);
				return;
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__TARGET_DATA_PROTOTYPE:
				setTargetDataPrototype((VariableDataPrototype)newValue);
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
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__INSTANCE_REF:
				getInstanceRef().clear();
				return;
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_COMPONENT:
				setContextComponent((SwComponentPrototype)null);
				return;
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_PORT:
				setContextPort((PortPrototype)null);
				return;
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__TARGET_DATA_PROTOTYPE:
				setTargetDataPrototype((VariableDataPrototype)null);
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
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__INSTANCE_REF:
				return !getInstanceRef().isEmpty();
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_COMPONENT:
				return contextComponent != null;
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__CONTEXT_PORT:
				return contextPort != null;
			case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__TARGET_DATA_PROTOTYPE:
				return targetDataPrototype != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IInstanceRef.class) {
			switch (derivedFeatureID) {
				case M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__INSTANCE_REF: return M2Package.IINSTANCE_REF__INSTANCE_REF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IInstanceRef.class) {
			switch (baseFeatureID) {
				case M2Package.IINSTANCE_REF__INSTANCE_REF: return M2Package.VARIABLE_DATA_PROTOTYPE_IN_SYSTEM_INSTANCE_REF__INSTANCE_REF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //VariableDataPrototypeInSystemInstanceRefImpl
