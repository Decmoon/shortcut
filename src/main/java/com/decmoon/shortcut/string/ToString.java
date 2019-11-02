package com.decmoon.shortcut.string;

import static com.decmoon.shortcut.string.Strings.newStringBuffer;
import static com.decmoon.shortcut.string.Strings.newStringBuilder;

/**
 * String merge simple method operation
 *
 * @author decmoon
 */
public class ToString {
    /**
     * Multiple StringBuffer objects are merged into string
     *
     * @param stringBuffers StringBuffer objects
     * @return String
     */
    public static String toString(StringBuffer... stringBuffers) {
        return toStringBuffer(stringBuffers).toString();
    }

    /**
     * Multiple StringBuffer objects are merged into StringBuffer
     *
     * @param stringBuffers StringBuffer objects
     * @return StringBuffer
     */
    public static StringBuffer toStringBuffer(StringBuffer... stringBuffers) {
        StringBuffer stringBuffer = newStringBuffer();
        for (StringBuffer buffer : stringBuffers)
            stringBuffer.append(buffer);
        return stringBuffer;
    }

    /**
     * Multiple String objects are merged into string
     *
     * @param strings String objects
     * @return String
     */
    public static String toString(String... strings) {
        return toStringBuffer(strings).toString();
    }

    /**
     * Multiple String objects are merged into StringBuffer
     *
     * @param strings String objects
     * @return StringBuffer
     */
    public static StringBuffer toStringBuffer(String... strings) {
        StringBuffer stringBuffer = newStringBuffer();
        for (String string : strings)
            stringBuffer.append(string);
        return stringBuffer;
    }

    /**
     * Multiple StringBuilder objects are merged into StringBuilder
     *
     * @param stringBuilders StringBuilder objects
     * @return StringBuilder
     */
    public static StringBuilder toStringBuilder(StringBuilder... stringBuilders) {
        StringBuilder stringBuilder = newStringBuilder();
        for (StringBuilder string : stringBuilders)
            stringBuilder.append(string);
        return stringBuilder;
    }

    /**
     * Multiple String objects are merged into StringBuilder
     *
     * @param strings String objects
     * @return StringBuilder
     */
    public static StringBuilder toStringBuilder(String... strings) {
        StringBuilder stringBuilder = newStringBuilder();
        for (String string : strings)
            stringBuilder.append(string);
        return stringBuilder;
    }

    /**
     * Multiple StringBuilder objects are merged into String
     *
     * @param stringBuilders StringBuilder objects
     * @return String
     */
    public static String toString(StringBuilder... stringBuilders) {
        return toStringBuilder(stringBuilders).toString();
    }


}
