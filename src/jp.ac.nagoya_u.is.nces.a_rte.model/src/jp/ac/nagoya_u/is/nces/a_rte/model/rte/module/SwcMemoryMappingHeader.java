/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swc Memory Mapping Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMappingHeader#getMemoryMapping <em>Memory Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwcMemoryMappingHeader()
 * @model
 * @generated
 */
public interface SwcMemoryMappingHeader extends HeaderFile {
	/**
	 * Returns the value of the '<em><b>Memory Mapping</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Mapping</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Mapping</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwcMemoryMappingHeader_MemoryMapping()
	 * @model
	 * @generated
	 */
	EList<SwcMemoryMapping> getMemoryMapping();

} // SwcMemoryMappingHeader
