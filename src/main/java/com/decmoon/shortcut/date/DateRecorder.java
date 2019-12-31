package com.decmoon.shortcut.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Provides concrete actions for time
 *
 * @author decmoon
 */
public class DateRecorder {

    public final static String yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";

    public final static String yyyy_MM_dd = "yyyy-MM-dd";

    public final static String yyyyMMdd = "yyyy/MM/dd";

    public final static String HH_mm_ss = "HH:mm:ss";

    private DateRecorder() {
    }

    /**
     * Returns the moment time, formatted as "yyyy_MM_dd_HH_mm_ss"
     *
     * @return At the moment of time
     */
    public static String now() {
        return now(yyyy_MM_dd_HH_mm_ss);
    }

    /**
     * Return the custom format of the moment time
     *
     * @param format Custom format
     * @return At the moment of time
     */
    public static String now(String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(new Date());
    }

}
