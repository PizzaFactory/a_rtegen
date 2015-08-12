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
package jp.ac.nagoya_u.is.nces.a_rte.validation.internal;

import java.io.IOException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import jp.ac.nagoya_u.is.nces.a_rte.validation.ModelValidator;
import org.eclipse.emf.common.util.ResourceLocator;

import com.google.common.io.Closer;

public class ValidationResourceLocator implements ResourceLocator {
	private final URL resourceUrl;
	private ResourceBundle resourceBundle;

	public ValidationResourceLocator(URL resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	@Override
	public String getString(String key, Object[] substitutions, boolean translate) {
		return MessageFormat.format(getString(key, translate), substitutions);
	}

	@Override
	public String getString(String key, Object[] substitutions) {
		return getString(key, substitutions, false);
	}

	@Override
	public String getString(String key, boolean translate) {
		if (this.resourceBundle == null) {
			Closer closer = Closer.create();
			try {
				try {
					this.resourceBundle = new PropertyResourceBundle(closer.register(this.resourceUrl.openStream()));
				} finally {
					closer.close();
				}
			} catch (IOException ioException) { // COVERAGE ���̤ã(�Զ�纮�����Τ���ã���륳���ɤʤΤǡ�̤���Х�å�������ʤ�)
				throw new MissingResourceException("Missing properties: " + ModelValidator.EMF_VALIDATION_MESSAGES_PROPERTIES, getClass().getName(), "plugin.properties");
			}
		}
		return this.resourceBundle.getString(key);
	}

	@Override
	public String getString(String key) {
		return getString(key, false); // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	@Override
	public Object getImage(String key) {
		return null; // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}

	@Override
	public URL getBaseURL() {
		return null; // COVERAGE ���̤ã(���ߤΥġ������ե��Ǥϻ��Ѥ���ʤ��������󥿥ե��������Թ��Ĥ��Ƥ��롥 �����ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�)
	}
}