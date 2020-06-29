package com.decmoon.shortcut.system;

import java.util.Properties;

/**
 * Query system information methods
 *
 * @author decmoon
 */
public class SystemInfo {

    private SystemInfo() {
    }

    /**
     * 所有详细信息
     *
     * @return Properties
     */
    public final static Properties getProperty() {
        return System.getProperties();
    }

    /**
     * 当前项目路径
     *
     * @return String
     */
    public final static String getUserDir() {
        return getProperty().getProperty("user.dir");
    }

    /**
     * 当前系统目录文件路径
     *
     * @return String
     */
    public final static String getUserHome() {
        return getProperty().getProperty("user.home");
    }

}
