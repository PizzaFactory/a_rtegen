package jp.ac.nagoya_u.is.nces.a_rte.app.internal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin implements BundleActivator {

	public static final String PLUGIN_ID = "jp.ac.nagoya?u.nces.a_rte.app"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public static void log(String message, Exception e) {
		IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, message, e);
		plugin.getLog().log(status);
	}
}
