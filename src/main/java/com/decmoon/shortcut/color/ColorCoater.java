package com.decmoon.shortcut.color;

import org.fusesource.jansi.Ansi;

import static com.decmoon.shortcut.string.Strings.newStringBuffer;
import static org.fusesource.jansi.Ansi.ansi;

/**
 * 使你的控制台字体有颜色
 * <p>
 * Make your console font has color
 *
 * @author decmoon
 */
public class ColorCoater {

    private ColorCoater() {
    }

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


    public static StringBuffer black(StringBuffer stringBuffer) {
        return newStringBuffer(color(Ansi.Color.BLACK, stringBuffer));
    }

    public static StringBuffer red(StringBuffer stringBuffer) {
        return newStringBuffer(color(Ansi.Color.RED, stringBuffer));
    }

    public static StringBuffer green(StringBuffer stringBuffer) {
        return newStringBuffer(color(Ansi.Color.GREEN, stringBuffer));
    }

    public static StringBuffer yellow(StringBuffer stringBuffer) {
        return newStringBuffer(color(Ansi.Color.YELLOW, stringBuffer));
    }

    public static StringBuffer blue(StringBuffer stringBuffer) {
        return newStringBuffer(color(Ansi.Color.BLUE, stringBuffer));
    }

    public static StringBuffer magenta(StringBuffer stringBuffer) {
        return newStringBuffer(color(Ansi.Color.MAGENTA, stringBuffer));
    }

    public static StringBuffer cyan(StringBuffer stringBuffer) {
        return newStringBuffer(color(Ansi.Color.CYAN, stringBuffer));
    }

    public static StringBuffer white(StringBuffer stringBuffer) {
        return newStringBuffer(color(Ansi.Color.WHITE, stringBuffer));
    }

    private final static String color(Ansi.Color color, String string) {
        return ansi().eraseScreen().fg(color).a(string).toString();
    }

    private final static String color(Ansi.Color color, StringBuffer stringBuffer) {
        return ansi().eraseScreen().fg(color).a(stringBuffer).toString();
    }
}
