/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Masked New Differs Masked Old Filter Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation#getOldValueVariable <em>Old Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getMaskedNewDiffersMaskedOldFilterOperation()
 * @model
 * @generated
 */
public interface MaskedNewDiffersMaskedOldFilterOperation extends FilterOperation {
	/**
	 * Returns the value of the '<em><b>Old Value Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Value Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value Variable</em>' reference.
	 * @see #setOldValueVariable(GlobalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getMaskedNewDiffersMaskedOldFilterOperation_OldValueVariable()
	 * @model required="true"
	 * @generated
	 */
	GlobalVariable getOldValueVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation#getOldValueVariable <em>Old Value Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value Variable</em>' reference.
	 * @see #getOldValueVariable()
	 * @generated
	 */
	void setOldValueVariable(GlobalVariable value);

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' reference.
	 * @see #setMask(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getMaskedNewDiffersMaskedOldFilterOperation_Mask()
	 * @model required="true"
	 * @generated
	 */
	Constant getMask();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersMaskedOldFilterOperation#getMask <em>Mask</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' reference.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(Constant value);

} // MaskedNewDiffersMaskedOldFilterOperation
