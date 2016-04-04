/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableFileContentsGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Variable File Contents Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableFileContentsGroupImpl#getGlobalVariable <em>Global Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.GlobalVariableFileContentsGroupImpl#getMemoryMapping <em>Memory Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalVariableFileContentsGroupImpl extends ModuleObjectImpl implements GlobalVariableFileContentsGroup {
	/**
	 * The cached value of the '{@link #getGlobalVariable() <em>Global Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> globalVariable;

	/**
	 * The cached value of the '{@link #getMemoryMapping() <em>Memory Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMapping()
	 * @generated
	 * @ordered
	 */
	protected MemoryMapping memoryMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalVariableFileContentsGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getGlobalVariable() {
		if (globalVariable == null) {
			globalVariable = new EObjectResolvingEList<GlobalVariable>(GlobalVariable.class, this, ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__GLOBAL_VARIABLE);
		}
		return globalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapping getMemoryMapping() {
		if (memoryMapping != null && ((EObject)memoryMapping).eIsProxy()) {
			InternalEObject oldMemoryMapping = (InternalEObject)memoryMapping;
			memoryMapping = (MemoryMapping)eResolveProxy(oldMemoryMapping);
			if (memoryMapping != oldMemoryMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING, oldMemoryMapping, memoryMapping));
			}
		}
		return memoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapping basicGetMemoryMapping() {
		return memoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryMapping(MemoryMapping newMemoryMapping) {
		MemoryMapping oldMemoryMapping = memoryMapping;
		memoryMapping = newMemoryMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING, oldMemoryMapping, memoryMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__GLOBAL_VARIABLE:
				return getGlobalVariable();
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING:
				if (resolve) return getMemoryMapping();
				return basicGetMemoryMapping();
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
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__GLOBAL_VARIABLE:
				getGlobalVariable().clear();
				getGlobalVariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING:
				setMemoryMapping((MemoryMapping)newValue);
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
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__GLOBAL_VARIABLE:
				getGlobalVariable().clear();
				return;
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING:
				setMemoryMapping((MemoryMapping)null);
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
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__GLOBAL_VARIABLE:
				return globalVariable != null && !globalVariable.isEmpty();
			case ModulePackage.GLOBAL_VARIABLE_FILE_CONTENTS_GROUP__MEMORY_MAPPING:
				return memoryMapping != null;
		}
		return super.eIsSet(featureID);
	}

} //GlobalVariableFileContentsGroupImpl
