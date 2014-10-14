/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2014 by Eiwa System Management, Inc., JAPAN
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
package jp.ac.nagoya_u.is.nces.a_rte.model.internal;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.regex.Pattern;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelLabels;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelQuery;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.OCLInput;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.utilities.UMLReflection;
import org.stringtemplate.v4.ST;

import com.google.common.io.Resources;

public class OclModelValidator implements IModelValidator {
	private static final Charset DEFAULT_ENCODING = Charset.forName("EUC-JP");

	private static final Pattern IMPORT_STATEMENT_PATTERN = Pattern.compile("^\\s*import\\s*.+$", Pattern.MULTILINE);

	private final OCL<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, Constraint, EClass, EObject> ocl;
	private final Properties messageProperties;

	public OclModelValidator(Iterable<URL> ruleFiles, Iterable<URL> messageFiles) throws ModelException {
		// ���ڥ롼����ɤ߹���
		this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);

		try {
			for (URL ruleFile : ruleFiles) {
				String oclText = filterImportStatements(Resources.toString(ruleFile, DEFAULT_ENCODING));
				OCLInput oclInput = new OCLInput(oclText);
				this.ocl.parse(oclInput);
			}
		} catch (ParserException e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			throw new ModelException("Internal error occurred while initializing model validator.", e);
		} catch (IOException e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			throw new ModelException("Internal error occurred while initializing model validator.", e);
		}

		// ���ڥ��顼��å��������ɤ߹���
		this.messageProperties = new Properties();
		try {
			for (URL messageFile : messageFiles) {
				this.messageProperties.load(Resources.newInputStreamSupplier(messageFile).getInput());
			}
		} catch (IOException e) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
			throw new ModelException("Internal error occurred while initializing model validator.", e);
		}
	}

	private String filterImportStatements(String input) {
		return IMPORT_STATEMENT_PATTERN.matcher(input).replaceAll("");
	}

	/* (non-Javadoc)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.internal.IModelValidator#validate(org.eclipse.emf.ecore.resource.Resource, org.eclipse.emf.common.util.DiagnosticChain)
	 */
	@Override
	public boolean validate(Resource eResource, DiagnosticChain diagnostics) {
		boolean isValid = true;
		ModelQuery query = new ModelQuery(eResource);
		for (Constraint constraint : this.ocl.getConstraints()) {
			if (!isInvariant(constraint)) {
				continue;
			}

			for (EObject eObject : query.findByKind((EClass) constraint.getSpecification().getContextVariable().getType())) {
				if (!this.ocl.check(eObject, constraint)) {
					isValid = false;
					diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, null, -1, createErrorMessage(eObject, constraint), new Object[0]));
				}
			}
		}
		return isValid;
	}

	private static boolean isInvariant(Constraint constraint) {
		return UMLReflection.INVARIANT.equals(constraint.getStereotype());
	}

	private String createErrorMessage(EObject eContextObject, Constraint constraint) {
		String message = this.messageProperties.getProperty(constraint.getName(), constraint.getName());

		ST template = new ST(message);
		template.add("self", eContextObject);
		template.add("selfId", ModelLabels.getLabel(eContextObject));
		template.add("selfType", eContextObject.eClass());
		return "[" + constraint.getName() + "] " + template.render();
	}
}
