package com.decmoon.shortcut.exception;

import com.decmoon.shortcut.log.Logger;

/**
 * Error for output log
 *
 * @author decmoon
 */
public class ExceptionLogger {
    /**
     * Exception log
     *
     * @param clazz  The class in which the exception occurred
     * @param method The method in which the exception occurred
     */
    public static void parameterErr(Class clazz, String method) {
        Logger.err(clazz.getName() + "." + method + "  ->  parameter is illegal");
    }

    /**
     * Exception log
     *
     * @param clazz   The class in which the exception occurred
     * @param method  The method in which the exception occurred
     * @param message Log message
     */
    public static void parameterErr(Class clazz, String method, String message) {
        Logger.err(clazz.getName() + "." + method + "  ->  " + message);
    }

    /**
     * Exception log
     *
     * @param clazz     The class in which the exception occurred
     * @param method    The method in which the exception occurred
     * @param throwable Exception throwable
     */
    public static void parameterErr(Class clazz, String method, Throwable throwable) {
        Logger.err(clazz.getName() + "." + method + "  ->  " + throwable.fillInStackTrace());
    }

    /**
     * Exception log
     *
     * @param clazz     The class in which the exception occurred
     * @param throwable Exception throwable
     */
    public static void parameterErr(Class clazz, Throwable throwable) {
        Logger.err(clazz.getName() + "  ->  " + throwable.fillInStackTrace());
    }
}
