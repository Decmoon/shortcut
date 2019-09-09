package com.decmoon.shortcut.color;

import org.fusesource.jansi.Ansi;

import static com.decmoon.shortcut.string.StringGenerator.newStringBuffer;
import static org.fusesource.jansi.Ansi.ansi;

public class ColorCoater {

    public static StringBuffer black(String string) {
        return newStringBuffer(color(Ansi.Color.BLACK, string));
    }

    public static StringBuffer red(String string) {
        return newStringBuffer(color(Ansi.Color.RED, string));
    }

    public static StringBuffer green(String string) {
        return newStringBuffer(color(Ansi.Color.GREEN, string));
    }

    public static StringBuffer yellow(String string) {
        return newStringBuffer(color(Ansi.Color.YELLOW, string));
    }

    public static StringBuffer blue(String string) {
        return newStringBuffer(color(Ansi.Color.BLUE, string));
    }

    public static StringBuffer magenta(String string) {
        return newStringBuffer(color(Ansi.Color.MAGENTA, string));
    }

    public static StringBuffer cyan(String string) {
        return newStringBuffer(color(Ansi.Color.CYAN, string));
    }

    public static StringBuffer white(String string) {
        return newStringBuffer(color(Ansi.Color.WHITE, string));
    }

    private final static String color(Ansi.Color color, String string) {
        return ansi().eraseScreen().fg(color).a(string).toString();
    }

}
