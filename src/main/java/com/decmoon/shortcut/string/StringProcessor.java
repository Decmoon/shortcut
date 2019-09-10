package com.decmoon.shortcut.string;

import static com.decmoon.shortcut.argument.Arguments.parameterIllegal;

public class StringProcessor {

    public final static boolean contains(String string, String subString) {
        return parameterIllegal(string, subString) ? false : string.contains(subString);
    }

    public final static boolean notContains(String string, String subString) {
        return !contains(string, subString);
    }

    public final static String replace(String string, String newSub, String oldSub) {
        if (parameterIllegal(string, oldSub)) return string;
        return string.replace(oldSub, newSub);
    }

    public final static String replace(String string, String newSub, String... oldSubs) {

        if (parameterIllegal(string, oldSubs)) return string;
        String replace = string;
        for (String oldSub : oldSubs)
            replace = replace(replace, newSub, oldSub);
        return replace;
    }


    public final static String replaceAll(String string, String oldPattern, String newPattern) {
        if (parameterIllegal(string, oldPattern, newPattern)) return string;
        return string.replaceAll(oldPattern, newPattern);
    }

    public final static boolean equals(String string1, String string2) {
        return parameterIllegal(string1) ? string2.equals(string1) : string1.equals(string2);
    }

    public final static String subString(String string, int begin, int end) {
        if (parameterIllegal(string) || begin <= 0 || end <= 0 || begin > string.length() || end > string.length() || begin >= end)
            return string;
        return string.substring(begin, end);
    }

    /**
     *
     * @param maxSize
     * @param string
     * @return
     */
    public static String headString(int maxSize, String string) {
        StringBuffer stringBuffer = Strings.newStringBuffer();
        stringBuffer.append(string);

        int length = string.length();
        if(length < maxSize){
            for (int i = 0; i < maxSize; i++)
                stringBuffer.append(" ");
            return stringBuffer.substring(0, maxSize);
        }else return string;

    }


    public  final static String tailString(int maxSize,String string) {
        int length = string.length();
        if (length <= maxSize) {
            StringBuffer stringBuffer = Strings.newStringBuffer();
            for (int i = 0; i < maxSize; i++)
                stringBuffer.append(" ");
            stringBuffer.append(string);
            return  stringBuffer.substring(length);
        } else
            return string;
    }


}
