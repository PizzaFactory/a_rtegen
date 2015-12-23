package jp.ac.nagoya_u.is.nces.a_rte.persist.internal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "jp.pizzafactory.a_rte.persist"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private static boolean debug;
	private static final String DEBUG_OPTION = PLUGIN_ID + "/debug"; //$NON-NLS-1$

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		String debugOption = Platform.getDebugOption(DEBUG_OPTION);
		debug = Boolean.parseBoolean(debugOption);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		debug = false;
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

	public static void debugLog(String message) {
		if (debug) {
			IStatus status = new Status(IStatus.INFO, Activator.PLUGIN_ID, message);
			plugin.getLog().log(status);
		}
	}
}
