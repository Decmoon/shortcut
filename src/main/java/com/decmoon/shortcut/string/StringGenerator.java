package com.decmoon.shortcut.string;

public class StringGenerator {

    public final static StringBuffer newStringBuffer() {
        return new StringBuffer();
    }

    public final static StringBuffer newStringBuffer(String string) {
        return new StringBuffer(string);
    }

    public final static String toString(StringBuffer... stringBuffers) {
        StringBuffer string = newStringBuffer();
        for (StringBuffer stringBuffer : stringBuffers)
            string.append(stringBuffer);
        return string.toString();
    }

    public final static StringBuffer toStringBuffer(StringBuffer... stringBuffers) {
        StringBuffer stringBuffer = newStringBuffer();
        for (StringBuffer buffer : stringBuffers)
            stringBuffer.append(buffer);
        return stringBuffer;
    }

}
