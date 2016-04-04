/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multicore Rte Start Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreRteStartApi#getCoreStartApiImpl <em>Core Start Api Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getMulticoreRteStartApi()
 * @model
 * @generated
 */
public interface MulticoreRteStartApi extends RteLifecycleApi, RteStartApi {
	/**
	 * Returns the value of the '<em><b>Core Start Api Impl</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteCoreStartApiImpl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Start Api Impl</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Start Api Impl</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getMulticoreRteStartApi_CoreStartApiImpl()
	 * @model
	 * @generated
	 */
	EList<RteCoreStartApiImpl> getCoreStartApiImpl();

} // MulticoreRteStartApi
