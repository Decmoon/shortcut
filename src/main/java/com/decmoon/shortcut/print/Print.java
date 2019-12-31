package com.decmoon.shortcut.print;

import com.decmoon.shortcut.string.ToString;

/**
 * Packaging method for printing
 *
 * @author decmoon
 */
public class Print {

    private Print() {
    }

    /**
     * Print multiple strings
     *
     * @param strings Strings
     */
    public static void print(String... strings) {
        System.out.println(ToString.toString(strings));
    }

    /**
     * Print space lines
     */
    public static void print() {
        System.out.println();
    }

    /**
     * Print multiple StringBuffers
     *
     * @param stringBuffers StringBuffers
     */
    public static void print(StringBuffer... stringBuffers) {
        System.out.println(ToString.toString(stringBuffers));
    }

}
