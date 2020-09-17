package com.decmoon.shortcut.core.config;

/**
 * @author decmoon
 */
@FunctionalInterface
public interface AspectReturnStrategy {

    Object execute() throws Throwable;

}
