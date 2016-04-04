/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Bsw Api Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBswApiHeader#getIocApi <em>Ioc Api</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBswApiHeader()
 * @model
 * @generated
 */
public interface RteBswApiHeader extends HeaderFile {
	/**
	 * Returns the value of the '<em><b>Ioc Api</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ioc Api</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ioc Api</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBswApiHeader_IocApi()
	 * @model
	 * @generated
	 */
	EList<IocApi> getIocApi();

} // RteBswApiHeader
