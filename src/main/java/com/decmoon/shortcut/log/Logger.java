package com.decmoon.shortcut.log;

import com.decmoon.shortcut.date.DateRecorder;
import com.decmoon.shortcut.print.Print;
import com.decmoon.shortcut.string.StringProcessor;
import com.decmoon.shortcut.string.ToString;

import static com.decmoon.shortcut.color.ColorCoater.*;

public class Logger {

    private final static String SHORTCUT = Logger.class.getName() + " ";

    public static void log(String message) {
        String time = DateRecorder.now();
        Print.print(content(time), green(message));
    }

    public static void err(String message) {
        String time = DateRecorder.now();
        Print.print(content(time), red(message));
    }


    private final static StringBuffer content(String time) {
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
