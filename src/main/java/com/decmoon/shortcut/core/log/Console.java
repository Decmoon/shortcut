package com.decmoon.shortcut.core.log;

import com.decmoon.shortcut.date.DateRecorder;
import com.decmoon.shortcut.print.Print;
import com.decmoon.shortcut.string.StringProcessor;
import com.decmoon.shortcut.string.ToString;

import static com.decmoon.shortcut.color.ColorCoater.*;

/**
 * 控制台阶级输出
 *
 * @author decmoon
 */
public final class Console {

    private static final String SHORTCUT = Console.class.getName() + " ";

    public static final void info(String message) {
        String time = DateRecorder.now();
        String string = ToString.toString(content(time), green(message), black(""));
        Print.print(string);
    }


    public static final void warn(String message) {
        String time = DateRecorder.now();
        String string = ToString.toString(content(time), yellow(message), black(""));
        Print.print(string);
    }


    public static final void err(String message) {
        String time = DateRecorder.now();
        String string = ToString.toString(content(time), red(message), black(""));
        Print.print(string);
    }

    private static final StringBuffer content(String time) {
        return ToString.toStringBuffer(white("["),
                yellow(time),
                white("]"),
                white(" ∽ ["),
                white(StringProcessor.tailString(16, Thread.currentThread().getName().toUpperCase())),
                white("] ∽ "),
                cyan(SHORTCUT),
                white(">>>> :  "));
    }
}
