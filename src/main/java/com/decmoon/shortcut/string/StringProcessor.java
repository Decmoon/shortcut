package com.decmoon.shortcut.string;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.bool.BooleanJudge;
import com.decmoon.shortcut.exception.ExceptionLogger;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;
import com.decmoon.shortcut.log.Logger;

import static com.decmoon.shortcut.argument.Arguments.parameterIllegal;

/**
 * String 处理器
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
     * 在字符串中，用新字符串替换旧字符串
     *
     * @param string Initial string
     * @param newSub new string
     * @param oldSub the old substring of initial string
     * @return final string
     */
    public static final String replace(String string, String newSub, String oldSub) {
        if (parameterIllegal(string)) {
            throw new ParameterIllegalException();
        }
        return string.replace(oldSub, newSub);
    }

    /**
     * 在字符串中，用新字符串替换旧字符串
     *
     * @param string  Initial string
     * @param newSub  new string
     * @param oldSubs the old substring of initial strings
     * @return final string
     */
    public final static String replace(String string, String newSub, String... oldSubs) {
        if (parameterIllegal(string)) {
            throw new ParameterIllegalException();
        }
        String replace = string;
        for (String oldSub : oldSubs) {
            replace = replace(replace, newSub, oldSub);
        }
        return replace;
    }

    /**
     * 比较字符串是否相等
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
    public static final String subString(String string, int begin, int end) {
        if (BooleanJudge.hasTrue(
                parameterIllegal(string),
                begin < 0,
                end < 0,
                begin > string.length(),
                end > string.length(),
                begin > end
        )) {
            throw new ParameterIllegalException();
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
     * 向字符串中添加空格，字符串右对齐
     *
     * @param maxSize Output string length
     * @param string  Specified string
     * @return string
     */
    public final static String tailString(int maxSize, String string) {
        return tailString(maxSize, string, false);
    }

    /**
     * 向字符串中添加空格，字符串右对齐
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
            } else {
                return string;
            }
        }
    }

    /**
     * 首字母大写
     *
     * @param string
     * @return
     */
    public static String INITCAP(String string) {
        if (Arguments.parameterIllegal(string)) {
            return "";
        }
        String s = string.trim().toLowerCase();
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }


    /**
     * 获取 子串 出现在 母串中的 起始位置
     *
     * @param string    不可为空
     * @param subString 不可为空
     * @return
     */
    public static int indexOfSubstring(String string, String subString) {
        if (Arguments.parameterLegal(string, subString) && subString.length() <= string.length()) {
            int size = subString.length();
            for (int i = 0; i < string.length() && i + size <= string.length(); i++) {
                if (string.substring(i, i + size).equals(subString)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * 获取 子串 出现在 母串中的 终点位置
     *
     * @param string    不可为空
     * @param subString 不可为空
     * @return
     */
    public static int lastIndexOfSubstring(String string, String subString) {
        int i = indexOfSubstring(string, subString);
        return i == -1 ? -1 : indexOfSubstring(string, subString) + subString.length() - 1;
    }

    /**
     * 剪切字符串
     *
     * @param string
     * @param subString
     * @return 返回字符串 返回区域为 0-子串首 , 若子串不再原串中，返回原串
     */
    public static String headSubString(String string, String subString) {
        if (Arguments.parameterLegal(string, subString) && subString.length() <= string.length()) {
            int index = indexOfSubstring(string, subString);
            if (index == -1) {
                Logger.warn("headSubString(String string, String subString) can't find the substring in original string");
                return string;
            }
            return subString(string, 0, index);
        } else {
            throw new ParameterIllegalException();
        }
    }

    /**
     * 剪切字符串
     *
     * @param string
     * @param subString
     * @return 返回字符串 返回区域为 子串尾-原串尾 , 若子串不再原串中，返回原串
     */
    public static String tailSubString(String string, String subString) {
        if (Arguments.parameterLegal(string, subString) && subString.length() <= string.length()) {
            int index = lastIndexOfSubstring(string, subString);
            if (index == -1) {
                Logger.warn("tailSubString(String string, String subString) can't find the substring in original string");
                return string;
            }
            return subString(string, index + 1, string.length());
        } else {
            throw new ParameterIllegalException();
        }
    }

}
