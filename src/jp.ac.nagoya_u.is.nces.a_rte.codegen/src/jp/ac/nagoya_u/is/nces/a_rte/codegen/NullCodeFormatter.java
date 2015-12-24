package jp.ac.nagoya_u.is.nces.a_rte.codegen;

import java.io.File;

import jp.ac.nagoya_u.is.nces.a_rte.codegen.internal.InternalCodegenException;

public class NullCodeFormatter implements CodeFormatter {

	@Override
	public void format(File file) throws InternalCodegenException {
		// Do nothing.
	}

}
