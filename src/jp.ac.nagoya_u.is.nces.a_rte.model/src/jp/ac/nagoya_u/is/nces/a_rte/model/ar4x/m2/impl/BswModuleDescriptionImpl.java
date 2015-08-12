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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleDescription;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntry;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bsw Module Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleDescriptionImpl#getInternalBehavior <em>Internal Behavior</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleDescriptionImpl#getProvidedEntry <em>Provided Entry</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleDescriptionImpl#getProvidedModeGroup <em>Provided Mode Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleDescriptionImpl#getRequiredModeGroup <em>Required Mode Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BswModuleDescriptionImpl extends ArElementImpl implements BswModuleDescription {
	/**
	 * The cached value of the '{@link #getInternalBehavior() <em>Internal Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<BswInternalBehavior> internalBehavior;

	/**
	 * The cached value of the '{@link #getProvidedEntry() <em>Provided Entry</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<BswModuleEntry> providedEntry;

	/**
	 * The cached value of the '{@link #getProvidedModeGroup() <em>Provided Mode Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedModeGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeDeclarationGroupPrototype> providedModeGroup;

	/**
	 * The cached value of the '{@link #getRequiredModeGroup() <em>Required Mode Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredModeGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeDeclarationGroupPrototype> requiredModeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswModuleDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.BSW_MODULE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswInternalBehavior> getInternalBehavior() {
		if (internalBehavior == null) {
			internalBehavior = new EObjectContainmentWithInverseEList<BswInternalBehavior>(BswInternalBehavior.class, this, M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR, M2Package.BSW_INTERNAL_BEHAVIOR__PARENT);
		}
		return internalBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswModuleEntry> getProvidedEntry() {
		if (providedEntry == null) {
			providedEntry = new EObjectResolvingEList<BswModuleEntry>(BswModuleEntry.class, this, M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_ENTRY);
		}
		return providedEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeDeclarationGroupPrototype> getProvidedModeGroup() {
		if (providedModeGroup == null) {
			providedModeGroup = new EObjectContainmentEList<ModeDeclarationGroupPrototype>(ModeDeclarationGroupPrototype.class, this, M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_MODE_GROUP);
		}
		return providedModeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeDeclarationGroupPrototype> getRequiredModeGroup() {
		if (requiredModeGroup == null) {
			requiredModeGroup = new EObjectContainmentEList<ModeDeclarationGroupPrototype>(ModeDeclarationGroupPrototype.class, this, M2Package.BSW_MODULE_DESCRIPTION__REQUIRED_MODE_GROUP);
		}
		return requiredModeGroup;
	}

	/**
	 * The cached invocation delegate for the '{@link #getEnableInternalBehavior() <em>Get Enable Internal Behavior</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableInternalBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ENABLE_INTERNAL_BEHAVIOR__EINVOCATION_DELEGATE = ((EOperation.Internal)M2Package.Literals.BSW_MODULE_DESCRIPTION___GET_ENABLE_INTERNAL_BEHAVIOR).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswInternalBehavior getEnableInternalBehavior() {
		try {
			return (BswInternalBehavior)GET_ENABLE_INTERNAL_BEHAVIOR__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInternalBehavior()).basicAdd(otherEnd, msgs);
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
			case M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR:
				return ((InternalEList<?>)getInternalBehavior()).basicRemove(otherEnd, msgs);
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_MODE_GROUP:
				return ((InternalEList<?>)getProvidedModeGroup()).basicRemove(otherEnd, msgs);
			case M2Package.BSW_MODULE_DESCRIPTION__REQUIRED_MODE_GROUP:
				return ((InternalEList<?>)getRequiredModeGroup()).basicRemove(otherEnd, msgs);
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
			case M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR:
				return getInternalBehavior();
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_ENTRY:
				return getProvidedEntry();
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_MODE_GROUP:
				return getProvidedModeGroup();
			case M2Package.BSW_MODULE_DESCRIPTION__REQUIRED_MODE_GROUP:
				return getRequiredModeGroup();
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
			case M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR:
				getInternalBehavior().clear();
				getInternalBehavior().addAll((Collection<? extends BswInternalBehavior>)newValue);
				return;
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_ENTRY:
				getProvidedEntry().clear();
				getProvidedEntry().addAll((Collection<? extends BswModuleEntry>)newValue);
				return;
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_MODE_GROUP:
				getProvidedModeGroup().clear();
				getProvidedModeGroup().addAll((Collection<? extends ModeDeclarationGroupPrototype>)newValue);
				return;
			case M2Package.BSW_MODULE_DESCRIPTION__REQUIRED_MODE_GROUP:
				getRequiredModeGroup().clear();
				getRequiredModeGroup().addAll((Collection<? extends ModeDeclarationGroupPrototype>)newValue);
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
			case M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR:
				getInternalBehavior().clear();
				return;
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_ENTRY:
				getProvidedEntry().clear();
				return;
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_MODE_GROUP:
				getProvidedModeGroup().clear();
				return;
			case M2Package.BSW_MODULE_DESCRIPTION__REQUIRED_MODE_GROUP:
				getRequiredModeGroup().clear();
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
			case M2Package.BSW_MODULE_DESCRIPTION__INTERNAL_BEHAVIOR:
				return internalBehavior != null && !internalBehavior.isEmpty();
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_ENTRY:
				return providedEntry != null && !providedEntry.isEmpty();
			case M2Package.BSW_MODULE_DESCRIPTION__PROVIDED_MODE_GROUP:
				return providedModeGroup != null && !providedModeGroup.isEmpty();
			case M2Package.BSW_MODULE_DESCRIPTION__REQUIRED_MODE_GROUP:
				return requiredModeGroup != null && !requiredModeGroup.isEmpty();
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
			case M2Package.BSW_MODULE_DESCRIPTION___GET_ENABLE_INTERNAL_BEHAVIOR:
				return getEnableInternalBehavior();
		}
		return super.eInvoke(operationID, arguments);
	}

} //BswModuleDescriptionImpl
