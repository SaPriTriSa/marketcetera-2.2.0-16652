package org.marketcetera.photon.module;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServerConnection;

import org.marketcetera.module.ModuleManager;
import org.marketcetera.photon.internal.module.Activator;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Provides access to the core module framework, and related services.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ModuleSupport.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.1.0
 */
@ClassVersion("$Id: ModuleSupport.java 16154 2012-07-14 16:34:05Z colin $")
public final class ModuleSupport {

    /**
     * The core {@link ModuleManager} instance.
     * 
     * @return the core module manager, or null if this bundle is not activated
     */
    public static ModuleManager getModuleManager() {
        Activator instance = Activator.getDefault();
        return instance == null ? null : instance.getModuleManager();
    }

    /**
     * Returns the {@link MBeanServerConnection} used for module management.
     * 
     * @return the {@link MBeanServerConnection} used for module management
     */
    public static MBeanServerConnection getMBeanServerConnection() {
        return ManagementFactory.getPlatformMBeanServer();
    }

    /**
     * Returns the {@link IModuleAttributeSupport} which enables interaction
     * with the module attributes.
     * 
     * @return a module attribute support interface, or null if this bundle is
     *         not activated
     */
    public static IModuleAttributeSupport getModuleAttributeSupport() {
        Activator instance = Activator.getDefault();
        return instance == null ? null : instance.getModuleAttributeSupport();
    }

    /**
     * Returns the {@link ISinkDataManager} which enables handling of sink data.
     * 
     * @return a sink data manager interface, or null if this bundle is not
     *         activated
     */
    public static ISinkDataManager getSinkDataManager() {
        Activator instance = Activator.getDefault();
        return instance == null ? null : instance.getSinkDataManager();
    }

    /**
     * Returns the {@link IDataFlowLabelProvider} which labels sink data.
     * 
     * @return the data flow label provider, or null if this bundle is not
     *         activated
     */
    public static IDataFlowLabelProvider getDataFlowLabelProvider() {
        Activator instance = Activator.getDefault();
        return instance == null ? null : instance.getDataFlowLabelProvider().get();
    }

}
