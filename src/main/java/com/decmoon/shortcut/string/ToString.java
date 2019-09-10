package com.decmoon.shortcut.string;

import static com.decmoon.shortcut.string.Strings.newStringBuffer;

public class ToString {

    public final static String toString(StringBuffer... stringBuffers) {
        return toStringBuffer(stringBuffers).toString();
    }

    public final static StringBuffer toStringBuffer(StringBuffer... stringBuffers) {
        StringBuffer stringBuffer = newStringBuffer();
        for (StringBuffer buffer : stringBuffers)
            stringBuffer.append(buffer);
        return stringBuffer;
    }


    public final static StringBuffer toString(String... strings) {
        StringBuffer stringBuffer = newStringBuffer();
        for (String string : strings)
            stringBuffer.append(string);
        return stringBuffer;
    }
}
