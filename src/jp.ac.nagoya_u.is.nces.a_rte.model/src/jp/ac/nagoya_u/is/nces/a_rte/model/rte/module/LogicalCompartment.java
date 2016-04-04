/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LogicalCompartment#getCompartmentName <em>Compartment Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getLogicalCompartment()
 * @model abstract="true"
 * @generated
 */
public interface LogicalCompartment extends ModuleReferrable {
	/**
	 * Returns the value of the '<em><b>Compartment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment Name</em>' attribute.
	 * @see #setCompartmentName(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getLogicalCompartment_CompartmentName()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.String" required="true"
	 * @generated
	 */
	String getCompartmentName();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LogicalCompartment#getCompartmentName <em>Compartment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment Name</em>' attribute.
	 * @see #getCompartmentName()
	 * @generated
	 */
	void setCompartmentName(String value);

} // LogicalCompartment
