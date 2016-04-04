/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Masked New Differs XFilter Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation#getMask <em>Mask</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getMaskedNewDiffersXFilterOperation()
 * @model
 * @generated
 */
public interface MaskedNewDiffersXFilterOperation extends FilterOperation {
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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getMaskedNewDiffersXFilterOperation_Mask()
	 * @model required="true"
	 * @generated
	 */
	Constant getMask();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation#getMask <em>Mask</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' reference.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(Constant value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' reference.
	 * @see #setX(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getMaskedNewDiffersXFilterOperation_X()
	 * @model required="true"
	 * @generated
	 */
	Constant getX();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.MaskedNewDiffersXFilterOperation#getX <em>X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(Constant value);

} // MaskedNewDiffersXFilterOperation
