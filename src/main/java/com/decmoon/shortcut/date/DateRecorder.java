package com.decmoon.shortcut.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRecorder {

    public final static String yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";

    public final static String yyyy_MM_dd = "yyyy-MM-dd";

    public final static String yyyyMMdd = "yyyy/MM/dd";

    public final static String HH_mm_ss = "HH:mm:ss";

    public static String now() {
        return now(yyyy_MM_dd_HH_mm_ss);
    }

    public static String now(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        String time = dateFormat.format(new Date());
        return time;
    }

}
