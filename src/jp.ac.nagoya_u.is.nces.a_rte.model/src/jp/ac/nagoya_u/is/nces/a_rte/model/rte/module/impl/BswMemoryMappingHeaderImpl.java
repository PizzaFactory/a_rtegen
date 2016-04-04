/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMappingHeader;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bsw Memory Mapping Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.BswMemoryMappingHeaderImpl#getMemoryMapping <em>Memory Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BswMemoryMappingHeaderImpl extends HeaderFileImpl implements BswMemoryMappingHeader {
	/**
	 * The cached value of the '{@link #getMemoryMapping() <em>Memory Mapping</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<BswMemoryMapping> memoryMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswMemoryMappingHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.BSW_MEMORY_MAPPING_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BswMemoryMapping> getMemoryMapping() {
		if (memoryMapping == null) {
			memoryMapping = new EObjectResolvingEList<BswMemoryMapping>(BswMemoryMapping.class, this, ModulePackage.BSW_MEMORY_MAPPING_HEADER__MEMORY_MAPPING);
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
			case ModulePackage.BSW_MEMORY_MAPPING_HEADER__MEMORY_MAPPING:
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
			case ModulePackage.BSW_MEMORY_MAPPING_HEADER__MEMORY_MAPPING:
				getMemoryMapping().clear();
				getMemoryMapping().addAll((Collection<? extends BswMemoryMapping>)newValue);
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
			case ModulePackage.BSW_MEMORY_MAPPING_HEADER__MEMORY_MAPPING:
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
			case ModulePackage.BSW_MEMORY_MAPPING_HEADER__MEMORY_MAPPING:
				return memoryMapping != null && !memoryMapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BswMemoryMappingHeaderImpl
