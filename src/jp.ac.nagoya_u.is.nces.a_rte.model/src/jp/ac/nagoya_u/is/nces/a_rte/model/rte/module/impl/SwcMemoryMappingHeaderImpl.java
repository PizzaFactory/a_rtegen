/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMappingHeader;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swc Memory Mapping Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.SwcMemoryMappingHeaderImpl#getMemoryMapping <em>Memory Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwcMemoryMappingHeaderImpl extends HeaderFileImpl implements SwcMemoryMappingHeader {
	/**
	 * The cached value of the '{@link #getMemoryMapping() <em>Memory Mapping</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<SwcMemoryMapping> memoryMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwcMemoryMappingHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.SWC_MEMORY_MAPPING_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwcMemoryMapping> getMemoryMapping() {
		if (memoryMapping == null) {
			memoryMapping = new EObjectResolvingEList<SwcMemoryMapping>(SwcMemoryMapping.class, this, ModulePackage.SWC_MEMORY_MAPPING_HEADER__MEMORY_MAPPING);
		}
		return memoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.SWC_MEMORY_MAPPING_HEADER__MEMORY_MAPPING:
				return getMemoryMapping();
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
			case ModulePackage.SWC_MEMORY_MAPPING_HEADER__MEMORY_MAPPING:
				getMemoryMapping().clear();
				getMemoryMapping().addAll((Collection<? extends SwcMemoryMapping>)newValue);
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
			case ModulePackage.SWC_MEMORY_MAPPING_HEADER__MEMORY_MAPPING:
				getMemoryMapping().clear();
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
			case ModulePackage.SWC_MEMORY_MAPPING_HEADER__MEMORY_MAPPING:
				return memoryMapping != null && !memoryMapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SwcMemoryMappingHeaderImpl
