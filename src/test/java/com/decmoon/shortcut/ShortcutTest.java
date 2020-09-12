package com.decmoon.shortcut;

import junit.framework.AssertionFailedError;

import java.util.LinkedList;

public class ShortcutTest {

    private final static LinkedList<AssertionFailedError> list = new LinkedList<>();

    public static void add(AssertionFailedError assertionFailedError) {
        list.add(assertionFailedError);
    }

    public static void print() {
        list.forEach(e -> e.printStackTrace());
    }

}
