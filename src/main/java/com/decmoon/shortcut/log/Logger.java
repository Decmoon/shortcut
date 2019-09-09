package com.decmoon.shortcut.log;

import com.decmoon.shortcut.date.DateRecorder;
import com.decmoon.shortcut.string.StringGenerator;

import static com.decmoon.shortcut.color.ColorCoater.*;

public class Logger {

    private final static String SHORTCUT = Logger.class.getName() + " ";

    public static void log(String message) {
        String time = DateRecorder.now();
        System.out.println(StringGenerator.toString(content(time), green(message)));
    }

    public static void err(String message) {
        String time = DateRecorder.now();
        System.out.println(StringGenerator.toString(content(time), red(message)));
    }


    private final static StringBuffer content(String time) {
        return StringGenerator.toStringBuffer(white("["),
                yellow(time),
                white("]"),
                white(" ∽ ["),
                white(formatThreadLog(Thread.currentThread().getName().toUpperCase())),
                white("] ∽ "),
                cyan(SHORTCUT),
                white(">>>> :  "));
    }


    private final static String formatThreadLog(String string) {
        String defaultString = "               ";
        int size = defaultString.length();
        int length = string.length();
        if (length <= size) {
            StringBuffer stringBuffer = StringGenerator.newStringBuffer(defaultString);
            stringBuffer.append(string);
            stringBuffer.substring(size - length);
            return stringBuffer.toString();
        } else
            return string;
    }


}
