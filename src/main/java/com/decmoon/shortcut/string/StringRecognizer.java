package com.decmoon.shortcut.string;

import com.decmoon.shortcut.bool.BooleanJudge;

import java.util.Objects;

/**
 * String character manipulation methods
 *
 * @author decmoon
 */
public class StringRecognizer {
    /**
     * Determines whether the string contains valid characters
     *
     * @param string String
     * @return boolean
     */
    public static boolean hasText(String string) {
        if (BooleanJudge.allFalse(Objects.isNull(string), string.isEmpty()))
            for (int i = 0; i < string.length(); i++)
                if (!Character.isWhitespace(string.charAt(i)))
                    return true;
        return false;
    }


}
