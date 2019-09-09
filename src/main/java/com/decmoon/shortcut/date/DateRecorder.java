package com.decmoon.shortcut.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRecorder {

    public final static String yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";

    public static String now() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(yyyy_MM_dd_HH_mm_ss);
        String time = dateFormat.format(new Date());
        return time;
    }

    public static String now(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        String time = dateFormat.format(new Date());
        return time;
    }

    public static void main(String[] args) {
        System.out.println(now());
    }
}
