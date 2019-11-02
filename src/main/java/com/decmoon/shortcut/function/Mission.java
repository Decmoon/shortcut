package com.decmoon.shortcut.function;

/**
 * This functional interface is for threads
 *
 * @author decmoon
 */
@FunctionalInterface
public interface Mission<V> {
    V execute();
}
