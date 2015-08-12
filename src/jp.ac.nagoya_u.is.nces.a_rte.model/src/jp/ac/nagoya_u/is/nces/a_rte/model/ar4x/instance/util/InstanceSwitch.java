/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  �嵭����Ԥϡ��ʲ���(1)��(4)�ξ������������˸¤ꡤ�ܥ��եȥ���
 *  �����ܥ��եȥ���������Ѥ�����Τ�ޤࡥ�ʲ�Ʊ���ˤ���ѡ�ʣ������
 *  �ѡ������ۡʰʲ������ѤȸƤ֡ˤ��뤳�Ȥ�̵���ǵ������롥
 *  (1) �ܥ��եȥ������򥽡��������ɤη������Ѥ�����ˤϡ��嵭������
 *      ��ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ��꤬�����Τޤޤη��ǥ���
 *      ����������˴ޤޤ�Ƥ��뤳�ȡ�
 *  (2) �ܥ��եȥ������򡤥饤�֥������ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ�����Ǻ����ۤ�����ˤϡ������ۤ�ȼ���ɥ�����ȡ�����
 *      �ԥޥ˥奢��ʤɡˤˡ��嵭�����ɽ�����������Ѿ�浪��Ӳ���
 *      ��̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *  (3) �ܥ��եȥ������򡤵�����Ȥ߹���ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ��ʤ����Ǻ����ۤ�����ˤϡ����Τ����줫�ξ�����������
 *      �ȡ�
 *    (a) �����ۤ�ȼ���ɥ�����ȡ����Ѽԥޥ˥奢��ʤɡˤˡ��嵭����
 *        �ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *    (b) �����ۤη��֤��̤�������ˡ�ˤ�äơ�TOPPERS�ץ������Ȥ�
 *        ��𤹤뤳�ȡ�
 *  (4) �ܥ��եȥ����������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������뤤���ʤ�»
 *      ������⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ����դ��뤳�ȡ�
 *      �ޤ����ܥ��եȥ������Υ桼���ޤ��ϥ���ɥ桼������Τ����ʤ���
 *      ͳ�˴�Ť����ᤫ��⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ�
 *      ���դ��뤳�ȡ�
 *
 *  �ܥ��եȥ������ϡ�AUTOSAR��AUTomotive Open System ARchitecture�˻�
 *  �ͤ˴�Ť��Ƥ��롥�嵭�ε����ϡ�AUTOSAR����Ū�⻺������������Τ�
 *  �Ϥʤ���AUTOSAR�ϡ�AUTOSAR���ͤ˴�Ť������եȥ�����������Ū����
 *  �Ѥ���Ԥ��Ф��ơ�AUTOSAR�ѡ��ȥʡ��ˤʤ뤳�Ȥ���Ƥ��롥
 *
 *  �ܥ��եȥ������ϡ�̵�ݾڤ��󶡤���Ƥ����ΤǤ��롥�嵭����Ԥ�
 *  ���TOPPERS�ץ������Ȥϡ��ܥ��եȥ������˴ؤ��ơ�����λ�����Ū
 *  ���Ф���Ŭ������ޤ�ơ������ʤ��ݾڤ�Ԥ�ʤ����ޤ����ܥ��եȥ���
 *  �������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������������ʤ�»���˴ؤ��Ƥ⡤��
 *  ����Ǥ�����ʤ���
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.util;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage
 * @generated
 */
public class InstanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSwitch() {
		if (modelPackage == null) {
			modelPackage = InstancePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InstancePackage.INSTANCE_REFERRABLE: {
				InstanceReferrable instanceReferrable = (InstanceReferrable)theEObject;
				T result = caseInstanceReferrable(instanceReferrable);
				if (result == null) result = caseIInstanceObject(instanceReferrable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.PORT_INSTANCE_IN_COMPOSITION: {
				PortInstanceInComposition portInstanceInComposition = (PortInstanceInComposition)theEObject;
				T result = casePortInstanceInComposition(portInstanceInComposition);
				if (result == null) result = caseInstanceReferrable(portInstanceInComposition);
				if (result == null) result = caseIInstanceObject(portInstanceInComposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_SWC: {
				VariableDataInstanceInSwc variableDataInstanceInSwc = (VariableDataInstanceInSwc)theEObject;
				T result = caseVariableDataInstanceInSwc(variableDataInstanceInSwc);
				if (result == null) result = caseVariableDataInstance(variableDataInstanceInSwc);
				if (result == null) result = caseInstanceReferrable(variableDataInstanceInSwc);
				if (result == null) result = caseIInstanceObject(variableDataInstanceInSwc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.VARIABLE_DATA_INSTANCE_IN_COMPOSITION: {
				VariableDataInstanceInComposition variableDataInstanceInComposition = (VariableDataInstanceInComposition)theEObject;
				T result = caseVariableDataInstanceInComposition(variableDataInstanceInComposition);
				if (result == null) result = caseVariableDataInstance(variableDataInstanceInComposition);
				if (result == null) result = caseInstanceReferrable(variableDataInstanceInComposition);
				if (result == null) result = caseIInstanceObject(variableDataInstanceInComposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.PVARIABLE_DATA_INSTANCE_IN_SWC: {
				PVariableDataInstanceInSwc pVariableDataInstanceInSwc = (PVariableDataInstanceInSwc)theEObject;
				T result = casePVariableDataInstanceInSwc(pVariableDataInstanceInSwc);
				if (result == null) result = caseVariableDataInstanceInSwc(pVariableDataInstanceInSwc);
				if (result == null) result = caseVariableDataInstance(pVariableDataInstanceInSwc);
				if (result == null) result = caseInstanceReferrable(pVariableDataInstanceInSwc);
				if (result == null) result = caseIInstanceObject(pVariableDataInstanceInSwc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.RVARIABLE_DATA_INSTANCE_IN_SWC: {
				RVariableDataInstanceInSwc rVariableDataInstanceInSwc = (RVariableDataInstanceInSwc)theEObject;
				T result = caseRVariableDataInstanceInSwc(rVariableDataInstanceInSwc);
				if (result == null) result = caseVariableDataInstanceInSwc(rVariableDataInstanceInSwc);
				if (result == null) result = caseVariableDataInstance(rVariableDataInstanceInSwc);
				if (result == null) result = caseInstanceReferrable(rVariableDataInstanceInSwc);
				if (result == null) result = caseIInstanceObject(rVariableDataInstanceInSwc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.ASSEMBLY_DATA_INSTANCE_CONNECTOR: {
				AssemblyDataInstanceConnector assemblyDataInstanceConnector = (AssemblyDataInstanceConnector)theEObject;
				T result = caseAssemblyDataInstanceConnector(assemblyDataInstanceConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.DELEGATION_DATA_INSTANCE_CONNECTOR: {
				DelegationDataInstanceConnector delegationDataInstanceConnector = (DelegationDataInstanceConnector)theEObject;
				T result = caseDelegationDataInstanceConnector(delegationDataInstanceConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.OPERATION_INSTANCE_IN_SWC: {
				OperationInstanceInSwc operationInstanceInSwc = (OperationInstanceInSwc)theEObject;
				T result = caseOperationInstanceInSwc(operationInstanceInSwc);
				if (result == null) result = caseInstanceReferrable(operationInstanceInSwc);
				if (result == null) result = caseIInstanceObject(operationInstanceInSwc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.ROPERATION_INSTANCE_IN_SWC: {
				ROperationInstanceInSwc rOperationInstanceInSwc = (ROperationInstanceInSwc)theEObject;
				T result = caseROperationInstanceInSwc(rOperationInstanceInSwc);
				if (result == null) result = caseOperationInstanceInSwc(rOperationInstanceInSwc);
				if (result == null) result = caseInstanceReferrable(rOperationInstanceInSwc);
				if (result == null) result = caseIInstanceObject(rOperationInstanceInSwc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.POPERATION_INSTANCE_IN_SWC: {
				POperationInstanceInSwc pOperationInstanceInSwc = (POperationInstanceInSwc)theEObject;
				T result = casePOperationInstanceInSwc(pOperationInstanceInSwc);
				if (result == null) result = caseOperationInstanceInSwc(pOperationInstanceInSwc);
				if (result == null) result = caseInstanceReferrable(pOperationInstanceInSwc);
				if (result == null) result = caseIInstanceObject(pOperationInstanceInSwc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.OPERATION_INSTANCE_IN_COMPOSITION: {
				OperationInstanceInComposition operationInstanceInComposition = (OperationInstanceInComposition)theEObject;
				T result = caseOperationInstanceInComposition(operationInstanceInComposition);
				if (result == null) result = caseInstanceReferrable(operationInstanceInComposition);
				if (result == null) result = caseIInstanceObject(operationInstanceInComposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.ASSEMBLY_OPERATION_INSTANCE_CONNECTOR: {
				AssemblyOperationInstanceConnector assemblyOperationInstanceConnector = (AssemblyOperationInstanceConnector)theEObject;
				T result = caseAssemblyOperationInstanceConnector(assemblyOperationInstanceConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.IINSTANCE_OBJECT: {
				IInstanceObject iInstanceObject = (IInstanceObject)theEObject;
				T result = caseIInstanceObject(iInstanceObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.SW_COMPONENT_INSTANCE_IN_SYSTEM: {
				SwComponentInstanceInSystem swComponentInstanceInSystem = (SwComponentInstanceInSystem)theEObject;
				T result = caseSwComponentInstanceInSystem(swComponentInstanceInSystem);
				if (result == null) result = caseInstanceReferrable(swComponentInstanceInSystem);
				if (result == null) result = caseIInstanceObject(swComponentInstanceInSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.INSTANCE_ROOT: {
				InstanceRoot instanceRoot = (InstanceRoot)theEObject;
				T result = caseInstanceRoot(instanceRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.VARIABLE_DATA_INSTANCE: {
				VariableDataInstance variableDataInstance = (VariableDataInstance)theEObject;
				T result = caseVariableDataInstance(variableDataInstance);
				if (result == null) result = caseInstanceReferrable(variableDataInstance);
				if (result == null) result = caseIInstanceObject(variableDataInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceReferrable(InstanceReferrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Instance In Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Instance In Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortInstanceInComposition(PortInstanceInComposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Data Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Data Instance In Swc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDataInstanceInSwc(VariableDataInstanceInSwc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Data Instance In Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Data Instance In Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDataInstanceInComposition(VariableDataInstanceInComposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PVariable Data Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PVariable Data Instance In Swc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePVariableDataInstanceInSwc(PVariableDataInstanceInSwc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RVariable Data Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RVariable Data Instance In Swc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRVariableDataInstanceInSwc(RVariableDataInstanceInSwc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Data Instance Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Data Instance Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyDataInstanceConnector(AssemblyDataInstanceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegation Data Instance Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation Data Instance Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegationDataInstanceConnector(DelegationDataInstanceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Instance In Swc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationInstanceInSwc(OperationInstanceInSwc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROperation Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROperation Instance In Swc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROperationInstanceInSwc(ROperationInstanceInSwc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>POperation Instance In Swc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>POperation Instance In Swc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePOperationInstanceInSwc(POperationInstanceInSwc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Instance In Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Instance In Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationInstanceInComposition(OperationInstanceInComposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Operation Instance Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Operation Instance Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyOperationInstanceConnector(AssemblyOperationInstanceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IInstance Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IInstance Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIInstanceObject(IInstanceObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sw Component Instance In System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sw Component Instance In System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwComponentInstanceInSystem(SwComponentInstanceInSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceRoot(InstanceRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Data Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Data Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDataInstance(VariableDataInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InstanceSwitch
