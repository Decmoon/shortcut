package com.decmoon.shortcut.string;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.bool.BooleanJudge;

import java.util.Objects;

/**
 * String 识别器
 *
 * @author decmoon
 */
public class StringRecognizer {

    private StringRecognizer() {
    }

    /**
     * 确定字符串是否包含有效字符
     *
     * @param string String
     * @return boolean
     */
    public static boolean hasText(String string) {
        if (BooleanJudge.allFalse(Objects.isNull(string), string.isEmpty())) {
            for (int i = 0; i < string.length(); i++) {
                if (!Character.isWhitespace(string.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }


}
