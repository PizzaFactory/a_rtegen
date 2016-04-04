/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition Terminated Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionTerminatedApi#getSrInterPartitionTimeoutOperation <em>Sr Inter Partition Timeout Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionTerminatedApi#getActivationOperation <em>Activation Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartitionTerminatedApi()
 * @model
 * @generated
 */
public interface PartitionTerminatedApi extends RteLifecycleApi {
	/**
	 * Returns the value of the '<em><b>Sr Inter Partition Timeout Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Inter Partition Timeout Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Inter Partition Timeout Operation</em>' containment reference.
	 * @see #setSrInterPartitionTimeoutOperation(InterPartitionTimeoutOperation)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartitionTerminatedApi_SrInterPartitionTimeoutOperation()
	 * @model containment="true"
	 * @generated
	 */
	InterPartitionTimeoutOperation getSrInterPartitionTimeoutOperation();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartitionTerminatedApi#getSrInterPartitionTimeoutOperation <em>Sr Inter Partition Timeout Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Inter Partition Timeout Operation</em>' containment reference.
	 * @see #getSrInterPartitionTimeoutOperation()
	 * @generated
	 */
	void setSrInterPartitionTimeoutOperation(InterPartitionTimeoutOperation value);

	/**
	 * Returns the value of the '<em><b>Activation Operation</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ActivationOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Operation</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartitionTerminatedApi_ActivationOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivationOperation> getActivationOperation();

} // PartitionTerminatedApi
