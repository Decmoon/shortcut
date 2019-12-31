package com.decmoon.shortcut.function;

/**
 * This functional interface is for threads
 *
 * @author decmoon
 */
@FunctionalInterface
public interface Mission<V> {

    /**
     * Allows users to customize the execution content
     */
    V execute();
}
