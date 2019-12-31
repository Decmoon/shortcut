package com.decmoon.shortcut.string;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.bool.BooleanJudge;
import com.decmoon.shortcut.exception.ExceptionLogger;

import static com.decmoon.shortcut.argument.Arguments.parameterIllegal;

/**
 * Character value manipulation methods
 *
 * @author decmoon
 */
public class StringProcessor {

    private StringProcessor() {
    }

    /**
     * Determines whether a string contains substrings
     *
     * @param string    Initial string
     * @param subString Judgment string
     * @return TRUE if the string contains substrings
     */
    public final static boolean contains(String string, String subString) {
        return parameterIllegal(string, subString) ? false : string.contains(subString);
    }

    /**
     * Determines whether a string contains substrings
     *
     * @param string    Initial string
     * @param subString Judgment string
     * @return TRUE if the string contains no substrings
     */
    public final static boolean nonContains(String string, String subString) {
        return !contains(string, subString);
    }

    /**
     * In a string, replace the old string with a new string
     *
     * @param string Initial string
     * @param newSub new string
     * @param oldSub the old substring of initial string
     * @return final string
     */
    public final static String replace(String string, String newSub, String oldSub) {
        if (parameterIllegal(string)) {
            ExceptionLogger.parameterErr(StringProcessor.class, "replace(String string, String newSub, String oldSub)");
            return null;
        }
        return string.replace(oldSub, newSub);
    }

    /**
     * In a string, replace the old string with a new string
     *
     * @param string  Initial string
     * @param newSub  new string
     * @param oldSubs the old substring of initial strings
     * @return final string
     */
    public final static String replace(String string, String newSub, String... oldSubs) {
        if (parameterIllegal(string)) {
            ExceptionLogger.parameterErr(StringProcessor.class, "replace(String string, String newSub, String... oldSubs)");
            return null;
        }
        String replace = string;
        for (String oldSub : oldSubs) {
            replace = replace(replace, newSub, oldSub);
        }
        return replace;
    }

    /**
     * Compare strings for equality
     *
     * @param string1 String
     * @param string2 String
     * @return TRUE if two strings are equal,otherwise
     */
    public final static boolean equals(String string1, String string2) {
        if (string1 == string2) {
            return true;
        }
        return parameterIllegal(string1) ? string2.equals(string1) : string1.equals(string2);
    }

    /**
     * String interception
     *
     * @param string Raw string
     * @param begin  Initial position
     * @param end    End position
     * @return String
     */
    public final static String subString(String string, int begin, int end) {
        if (BooleanJudge.hasTrue(
                parameterIllegal(string),
                begin < 0,
                end <= 0,
                begin > string.length(),
                end > string.length(),
                begin >= end
        )) {
            ExceptionLogger.parameterErr(StringProcessor.class, "subString(String string, int begin, int end)");
            return null;
        }
        return string.substring(begin, end);
    }

    /**
     * Add Spaces to the string ，string left alignment
     *
     * @param maxSize Output string length
     * @param string  Specified string
     * @return string
     */
    public static String headString(int maxSize, String string) {
        return headString(maxSize, string, false);
    }

    /**
     * Add Spaces to the string ，string left alignment
     *
     * @param maxSize Output string length
     * @param string  Specified string
     * @param haveTo  If True ,when string exceeds maximum range , returns null,otherwise
     * @return string
     */

    public static String headString(int maxSize, String string, boolean haveTo) {
        StringBuffer stringBuffer = Strings.newStringBuffer();
        stringBuffer.append(string);

        int length = string.length();
        if (length < maxSize) {
            for (int i = 0; i < maxSize; i++) {
                stringBuffer.append(" ");
            }
            return stringBuffer.substring(0, maxSize);
        } else {
            if (haveTo) {
                ExceptionLogger.parameterErr(StringProcessor.class, "headString(int maxSize, String string,boolean haveTo)");
                return null;
            } else {
                return string;
            }
        }

    }


    /**
     * Add Spaces to the string ，string right alignment
     *
     * @param maxSize Output string length
     * @param string  Specified string
     * @return string
     */
    public final static String tailString(int maxSize, String string) {
        return tailString(maxSize, string, false);
    }

    /**
     * Add Spaces to the string ，string right alignment
     *
     * @param maxSize Output string length
     * @param string  Specified string
     * @param haveTo  If True ,when string exceeds maximum range , returns null,otherwise
     * @return string
     */
    public final static String tailString(int maxSize, String string, boolean haveTo) {
        int length = string.length();
        if (length <= maxSize) {
            StringBuffer stringBuffer = Strings.newStringBuffer();
            for (int i = 0; i < maxSize; i++)
                stringBuffer.append(" ");
            stringBuffer.append(string);
            return stringBuffer.substring(length);
        } else {
            if (haveTo) {
                ExceptionLogger.parameterErr(StringProcessor.class, "tailString(int maxSize, String string,boolean haveTo)");
                return null;
            } else return string;
        }
    }

    public static String INITCAP(String string) {
        if (Arguments.parameterIllegal(string)) return "";
        String s = string.trim().toLowerCase();
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

}
