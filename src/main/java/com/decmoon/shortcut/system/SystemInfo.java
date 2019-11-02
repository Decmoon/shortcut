package com.decmoon.shortcut.system;

import java.util.Properties;

/**
 * Query system information methods
 *
 * @author decmoon
 */
public class SystemInfo {

    /**
     * Returns system details
     *
     * @return Properties
     */
    public final static Properties getProperty() {
        return System.getProperties();
    }

    /**
     * Returns the current workspace system address
     *
     * @return String
     */
    public final static String getUserDir() {
        return System.getProperties().getProperty("user.dir");
    }

}
