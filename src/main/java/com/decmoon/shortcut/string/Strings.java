package com.decmoon.shortcut.string;

import com.decmoon.shortcut.exception.illegal.InstantiateException;

/**
 * Provides the creation of a Strings
 *
 * @author decmoon
 */
public class Strings {

    private Strings(){
        throw new InstantiateException();
    }
    /**
     * Create a new String object
     *
     * @return String object
     */
    public final static String newString() {
        return new String();
    }

    /**
     * Create a new StringBuffer object
     *
     * @return StringBuffer object
     */
    public final static StringBuffer newStringBuffer() {
        return new StringBuffer();
    }

    /**
     * Create a new StringBuffer object
     *
     * @param strings Specified strings
     * @return StringBuffer
     */
    public final static StringBuffer newStringBuffer(String... strings) {
        return new StringBuffer(ToString.toString(strings));
    }

    /**
     * Create a new StringBuffer object
     *
     * @param string Specified string
     * @return StringBuffer
     */
    public final static StringBuffer newStringBuffer(String string) {
        return new StringBuffer(string);
    }

    /**
     * Create a new StringBuilder object
     *
     * @return StringBuilder object
     */
    public final static StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    /**
     * Create a new StringBuilder object
     *
     * @param strings Specified strings
     * @return StringBuilder object
     */
    public final static StringBuilder newStringBuilder(String... strings) {
        StringBuilder stringBuffer = newStringBuilder(ToString.toString(strings));
        return stringBuffer;
    }

    /**
     * Create a new StringBuilder object
     *
     * @param string String
     * @return StringBuilder object
     */
    public final static StringBuilder newStringBuilder(String string) {
        return new StringBuilder(string);
    }


}
