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
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswModuleEntry;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ModeDeclarationGroupPrototype;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bsw Module Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleEntityImpl#getImplementedEntry <em>Implemented Entry</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleEntityImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleEntityImpl#getAccessedModeGroup <em>Accessed Mode Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswModuleEntityImpl#getManagedModeGroup <em>Managed Mode Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BswModuleEntityImpl extends ExecutableEntityImpl implements BswModuleEntity {
	/**
	 * The cached value of the '{@link #getImplementedEntry() <em>Implemented Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedEntry()
	 * @generated
	 * @ordered
	 */
	protected BswModuleEntry implementedEntry;

	/**
	 * The cached value of the '{@link #getAccessedModeGroup() <em>Accessed Mode Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessedModeGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeDeclarationGroupPrototype> accessedModeGroup;
	/**
	 * The cached value of the '{@link #getManagedModeGroup() <em>Managed Mode Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedModeGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeDeclarationGroupPrototype> managedModeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswModuleEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.BSW_MODULE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswModuleEntry getImplementedEntry() {
		if (implementedEntry != null && ((EObject)implementedEntry).eIsProxy()) {
			InternalEObject oldImplementedEntry = (InternalEObject)implementedEntry;
			implementedEntry = (BswModuleEntry)eResolveProxy(oldImplementedEntry);
			if (implementedEntry != oldImplementedEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.BSW_MODULE_ENTITY__IMPLEMENTED_ENTRY, oldImplementedEntry, implementedEntry));
			}
		}
		return implementedEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswModuleEntry basicGetImplementedEntry() {
		return implementedEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementedEntry(BswModuleEntry newImplementedEntry) {
		BswModuleEntry oldImplementedEntry = implementedEntry;
		implementedEntry = newImplementedEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.BSW_MODULE_ENTITY__IMPLEMENTED_ENTRY, oldImplementedEntry, implementedEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswInternalBehavior getParent() {
		if (eContainerFeatureID() != M2Package.BSW_MODULE_ENTITY__PARENT) return null;
		return (BswInternalBehavior)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(BswInternalBehavior newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, M2Package.BSW_MODULE_ENTITY__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(BswInternalBehavior newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != M2Package.BSW_MODULE_ENTITY__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, M2Package.BSW_INTERNAL_BEHAVIOR__ENTITY, BswInternalBehavior.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.BSW_MODULE_ENTITY__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeDeclarationGroupPrototype> getAccessedModeGroup() {
		if (accessedModeGroup == null) {
			accessedModeGroup = new EObjectResolvingEList<ModeDeclarationGroupPrototype>(ModeDeclarationGroupPrototype.class, this, M2Package.BSW_MODULE_ENTITY__ACCESSED_MODE_GROUP);
		}
		return accessedModeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeDeclarationGroupPrototype> getManagedModeGroup() {
		if (managedModeGroup == null) {
			managedModeGroup = new EObjectResolvingEList<ModeDeclarationGroupPrototype>(ModeDeclarationGroupPrototype.class, this, M2Package.BSW_MODULE_ENTITY__MANAGED_MODE_GROUP);
		}
		return managedModeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.BSW_MODULE_ENTITY__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((BswInternalBehavior)otherEnd, msgs);
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
			case M2Package.BSW_MODULE_ENTITY__PARENT:
				return basicSetParent(null, msgs);
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
			case M2Package.BSW_MODULE_ENTITY__PARENT:
				return eInternalContainer().eInverseRemove(this, M2Package.BSW_INTERNAL_BEHAVIOR__ENTITY, BswInternalBehavior.class, msgs);
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
			case M2Package.BSW_MODULE_ENTITY__IMPLEMENTED_ENTRY:
				if (resolve) return getImplementedEntry();
				return basicGetImplementedEntry();
			case M2Package.BSW_MODULE_ENTITY__PARENT:
				return getParent();
			case M2Package.BSW_MODULE_ENTITY__ACCESSED_MODE_GROUP:
				return getAccessedModeGroup();
			case M2Package.BSW_MODULE_ENTITY__MANAGED_MODE_GROUP:
				return getManagedModeGroup();
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
			case M2Package.BSW_MODULE_ENTITY__IMPLEMENTED_ENTRY:
				setImplementedEntry((BswModuleEntry)newValue);
				return;
			case M2Package.BSW_MODULE_ENTITY__PARENT:
				setParent((BswInternalBehavior)newValue);
				return;
			case M2Package.BSW_MODULE_ENTITY__ACCESSED_MODE_GROUP:
				getAccessedModeGroup().clear();
				getAccessedModeGroup().addAll((Collection<? extends ModeDeclarationGroupPrototype>)newValue);
				return;
			case M2Package.BSW_MODULE_ENTITY__MANAGED_MODE_GROUP:
				getManagedModeGroup().clear();
				getManagedModeGroup().addAll((Collection<? extends ModeDeclarationGroupPrototype>)newValue);
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
			case M2Package.BSW_MODULE_ENTITY__IMPLEMENTED_ENTRY:
				setImplementedEntry((BswModuleEntry)null);
				return;
			case M2Package.BSW_MODULE_ENTITY__PARENT:
				setParent((BswInternalBehavior)null);
				return;
			case M2Package.BSW_MODULE_ENTITY__ACCESSED_MODE_GROUP:
				getAccessedModeGroup().clear();
				return;
			case M2Package.BSW_MODULE_ENTITY__MANAGED_MODE_GROUP:
				getManagedModeGroup().clear();
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
			case M2Package.BSW_MODULE_ENTITY__IMPLEMENTED_ENTRY:
				return implementedEntry != null;
			case M2Package.BSW_MODULE_ENTITY__PARENT:
				return getParent() != null;
			case M2Package.BSW_MODULE_ENTITY__ACCESSED_MODE_GROUP:
				return accessedModeGroup != null && !accessedModeGroup.isEmpty();
			case M2Package.BSW_MODULE_ENTITY__MANAGED_MODE_GROUP:
				return managedModeGroup != null && !managedModeGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BswModuleEntityImpl
