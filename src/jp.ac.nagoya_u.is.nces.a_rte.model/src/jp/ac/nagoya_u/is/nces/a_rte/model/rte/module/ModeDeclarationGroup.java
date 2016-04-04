/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Declaration Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup#getModeType <em>Mode Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup#getImplementationDataType <em>Implementation Data Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup#getModeConstant <em>Mode Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup#getModeTransitionStatusConstant <em>Mode Transition Status Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup#getInitModeConstant <em>Init Mode Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModeDeclarationGroup()
 * @model
 * @generated
 */
public interface ModeDeclarationGroup extends ModuleReferrable {
	/**
	 * Returns the value of the '<em><b>Mode Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Type</em>' containment reference.
	 * @see #setModeType(ModeType)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModeDeclarationGroup_ModeType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModeType getModeType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup#getModeType <em>Mode Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Type</em>' containment reference.
	 * @see #getModeType()
	 * @generated
	 */
	void setModeType(ModeType value);

	/**
	 * Returns the value of the '<em><b>Implementation Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Data Type</em>' reference.
	 * @see #setImplementationDataType(Type)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModeDeclarationGroup_ImplementationDataType()
	 * @model required="true"
	 * @generated
	 */
	Type getImplementationDataType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup#getImplementationDataType <em>Implementation Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Data Type</em>' reference.
	 * @see #getImplementationDataType()
	 * @generated
	 */
	void setImplementationDataType(Type value);

	/**
	 * Returns the value of the '<em><b>Mode Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModeDeclarationGroup_ModeConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getModeConstant();

	/**
	 * Returns the value of the '<em><b>Mode Transition Status Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Transition Status Constant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Transition Status Constant</em>' containment reference.
	 * @see #setModeTransitionStatusConstant(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModeDeclarationGroup_ModeTransitionStatusConstant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constant getModeTransitionStatusConstant();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup#getModeTransitionStatusConstant <em>Mode Transition Status Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Transition Status Constant</em>' containment reference.
	 * @see #getModeTransitionStatusConstant()
	 * @generated
	 */
	void setModeTransitionStatusConstant(Constant value);

	/**
	 * Returns the value of the '<em><b>Init Mode Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Mode Constant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Mode Constant</em>' containment reference.
	 * @see #setInitModeConstant(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModeDeclarationGroup_InitModeConstant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constant getInitModeConstant();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup#getInitModeConstant <em>Init Mode Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Mode Constant</em>' containment reference.
	 * @see #getInitModeConstant()
	 * @generated
	 */
	void setInitModeConstant(Constant value);

} // ModeDeclarationGroup
