package com.decmoon.shortcut.string;

import static com.decmoon.shortcut.string.Strings.newStringBuffer;
import static com.decmoon.shortcut.string.Strings.newStringBuilder;

public class ToString {

    public static String toString(StringBuffer... stringBuffers) {
        return toStringBuffer(stringBuffers).toString();
    }

    public static StringBuffer toStringBuffer(StringBuffer... stringBuffers) {
        StringBuffer stringBuffer = newStringBuffer();
        for (StringBuffer buffer : stringBuffers)
            stringBuffer.append(buffer);
        return stringBuffer;
    }

    public static String toString(String... strings) {
        return toStringBuffer(strings).toString();
    }

    public static StringBuffer toStringBuffer(String... strings) {
        StringBuffer stringBuffer = newStringBuffer();
        for (String string : strings)
            stringBuffer.append(string);
        return stringBuffer;
    }

    public static StringBuilder toStringBuilder(StringBuilder... stringBuilders) {
        StringBuilder stringBuilder = newStringBuilder();
        for (StringBuilder string : stringBuilders)
            stringBuilder.append(string);
        return stringBuilder;
    }

    public static StringBuilder toStringBuilder(String... strings) {
        StringBuilder stringBuilder = newStringBuilder();
        for (String string : strings)
            stringBuilder.append(string);
        return stringBuilder;
    }

    public static String toString(StringBuilder... stringBuilders) {
        return toStringBuilder(stringBuilders).toString();
    }


}
