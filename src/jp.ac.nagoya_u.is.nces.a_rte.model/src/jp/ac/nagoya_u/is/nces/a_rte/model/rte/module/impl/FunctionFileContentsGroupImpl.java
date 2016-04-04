/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Function;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionFileContentsGroup;
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
 * An implementation of the model object '<em><b>Function File Contents Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionFileContentsGroupImpl#getMemoryMapping <em>Memory Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.FunctionFileContentsGroupImpl#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FunctionFileContentsGroupImpl extends ModuleObjectImpl implements FunctionFileContentsGroup {
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
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionFileContentsGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.FUNCTION_FILE_CONTENTS_GROUP;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.FUNCTION_FILE_CONTENTS_GROUP__MEMORY_MAPPING, oldMemoryMapping, memoryMapping));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.FUNCTION_FILE_CONTENTS_GROUP__MEMORY_MAPPING, oldMemoryMapping, memoryMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunction() {
		if (function == null) {
			function = new EObjectResolvingEList<Function>(Function.class, this, ModulePackage.FUNCTION_FILE_CONTENTS_GROUP__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.FUNCTION_FILE_CONTENTS_GROUP__MEMORY_MAPPING:
				if (resolve) return getMemoryMapping();
				return basicGetMemoryMapping();
			case ModulePackage.FUNCTION_FILE_CONTENTS_GROUP__FUNCTION:
				return getFunction();
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
			case ModulePackage.FUNCTION_FILE_CONTENTS_GROUP__MEMORY_MAPPING:
				setMemoryMapping((MemoryMapping)newValue);
				return;
			case ModulePackage.FUNCTION_FILE_CONTENTS_GROUP__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends Function>)newValue);
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
			case ModulePackage.FUNCTION_FILE_CONTENTS_GROUP__MEMORY_MAPPING:
				setMemoryMapping((MemoryMapping)null);
				return;
			case ModulePackage.FUNCTION_FILE_CONTENTS_GROUP__FUNCTION:
				getFunction().clear();
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
			case ModulePackage.FUNCTION_FILE_CONTENTS_GROUP__MEMORY_MAPPING:
				return memoryMapping != null;
			case ModulePackage.FUNCTION_FILE_CONTENTS_GROUP__FUNCTION:
				return function != null && !function.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionFileContentsGroupImpl
