package com.decmoon.shortcut.function;

/**
 * This functional interface is for threads
 *
 * @author decmoon
 */
@FunctionalInterface
public interface Execute {

    /**
     * Allows users to customize the execution content
     */
    void execute();
}