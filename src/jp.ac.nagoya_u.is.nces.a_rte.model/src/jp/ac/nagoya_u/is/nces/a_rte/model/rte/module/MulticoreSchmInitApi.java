/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multicore Schm Init Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MulticoreSchmInitApi#getCoreInitApiImpl <em>Core Init Api Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getMulticoreSchmInitApi()
 * @model
 * @generated
 */
public interface MulticoreSchmInitApi extends SchmInitApi {
	/**
	 * Returns the value of the '<em><b>Core Init Api Impl</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmCoreInitApiImpl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Init Api Impl</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Init Api Impl</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getMulticoreSchmInitApi_CoreInitApiImpl()
	 * @model
	 * @generated
	 */
	EList<SchmCoreInitApiImpl> getCoreInitApiImpl();

} // MulticoreSchmInitApi
