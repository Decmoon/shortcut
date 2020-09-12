package com.decmoon.shortcut.i18n.ascii;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;
import com.decmoon.shortcut.core.log.Logger;
import com.decmoon.shortcut.exception.illegal.InstantiateException;

/**
 * ASCII 码 转换器
 *
 * @author decmoon
 */
public class ASCIITransformer {

    private ASCIITransformer() {
        throw new InstantiateException();
    }

    /**
     * 用于ASCII码中文转换
     * <p>
     * 切合国际化 properties文档格式 转换会自动忽略英文字符
     * ps：带有英文的转换会使 i18n 运行时出现一些问题
     *
     * @param message
     * @return
     */
    public static String transformForI18n(String message) {
        return transform(message, true);
    }

    /**
     * 用于ASCII码中文转换
     *
     * @param message
     * @return
     */
    public static String transform(String message) {
        return transform(message, false);
    }

    /**
     * 用于ASCII码中文转换  自定义英文是否转换
     *
     * @param message
     * @return
     */
    public static String transform(String message, boolean ignoreEnglish) {
        if (Arguments.parameterIllegal(message)) {
            throw new ParameterIllegalException();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (ignoreEnglish) {
                if (c >= 19968 && c <= 40869) {
                    stringBuilder.append("\\u").append(Integer.toHexString(c));
                } else {
                    stringBuilder.append(c);
                }
            } else {
                stringBuilder.append("\\u").append(Integer.toHexString(c));
            }
        }
        return stringBuilder.toString();
    }

}
