package com.decmoon.shortcut.core.config;

/**
 * @author decmoon
 */
@FunctionalInterface
public interface AspectStrategy {

    void execute() throws Throwable;

}
