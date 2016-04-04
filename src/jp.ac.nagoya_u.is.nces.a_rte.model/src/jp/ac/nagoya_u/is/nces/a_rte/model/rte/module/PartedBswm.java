/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parted Bswm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getBswm <em>Bswm</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getBswMemoryMapping <em>Bsw Memory Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getDependentBswSchedulableEntity <em>Dependent Bsw Schedulable Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getModeMachineInstance <em>Mode Machine Instance</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getSchmApi <em>Schm Api</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartedBswm()
 * @model
 * @generated
 */
public interface PartedBswm extends LogicalCompartment {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getPartedBswm <em>Parted Bswm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Partition)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartedBswm_Parent()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getPartedBswm
	 * @model opposite="partedBswm" required="true" transient="false"
	 * @generated
	 */
	Partition getParent();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Partition value);

	/**
	 * Returns the value of the '<em><b>Bswm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm#getPartedBswm <em>Parted Bswm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bswm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bswm</em>' reference.
	 * @see #setBswm(Bswm)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartedBswm_Bswm()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Bswm#getPartedBswm
	 * @model opposite="partedBswm" required="true"
	 * @generated
	 */
	Bswm getBswm();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PartedBswm#getBswm <em>Bswm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bswm</em>' reference.
	 * @see #getBswm()
	 * @generated
	 */
	void setBswm(Bswm value);

	/**
	 * Returns the value of the '<em><b>Bsw Memory Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswMemoryMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bsw Memory Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bsw Memory Mapping</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartedBswm_BswMemoryMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<BswMemoryMapping> getBswMemoryMapping();

	/**
	 * Returns the value of the '<em><b>Dependent Bsw Schedulable Entity</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity#getParentPartedBswm <em>Parent Parted Bswm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Bsw Schedulable Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Bsw Schedulable Entity</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartedBswm_DependentBswSchedulableEntity()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntity#getParentPartedBswm
	 * @model opposite="parentPartedBswm" containment="true"
	 * @generated
	 */
	EList<BswSchedulableEntity> getDependentBswSchedulableEntity();

	/**
	 * Returns the value of the '<em><b>Mode Machine Instance</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Machine Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Machine Instance</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartedBswm_ModeMachineInstance()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModeMachineInstance> getModeMachineInstance();

	/**
	 * Returns the value of the '<em><b>Schm Api</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schm Api</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schm Api</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getPartedBswm_SchmApi()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApi#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<SchmApi> getSchmApi();

} // PartedBswm
