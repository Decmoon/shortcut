package com.decmoon.shortcut.data.typechar;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;
import com.decmoon.shortcut.exception.illegal.InstantiateException;

/**
 * char 解析器
 *
 * @author decmoon
 */
public class CharResolver {

    private CharResolver() {
        throw new InstantiateException();
    }

    public static char[] getCharArray(String string) {
        return string.toCharArray();
    }

    public static char getFirstChar(String string) {
        if (Arguments.parameterLegal(string)) {
            char[] chars = getCharArray(string);
            return chars[0];
        } else {
            throw new ParameterIllegalException();
        }
    }

    public static char getLastChar(String string) {
        if (Arguments.parameterLegal(string)) {
            char[] chars = getCharArray(string);
            return chars[chars.length - 1];
        } else {
            throw new ParameterIllegalException();
        }
    }

    public static boolean charEqual(char c, char c2) {
        return c == c2;
    }

}
