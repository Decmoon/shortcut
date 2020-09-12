package com.decmoon.shortcut.html;

import com.decmoon.shortcut.exception.illegal.InstantiateException;
import com.decmoon.shortcut.string.StringRecognizer;

/**
 * HTML 快速转换器
 *
 * @author decmoon
 */
public class HtmlGenerator {

    private HtmlGenerator() {
        throw new InstantiateException();
    }

    /**
     *
     * 用于将HTML转换成字符串
     *
     * @param html
     * @return
     */
    public static String createHtml(String html) {
        final String n = "\n";
        final char t = '\t';
        final char quote = '\'';
        final char plus = '+';
        StringBuilder stringBuilder = new StringBuilder();
        String[] splits = html.split(n);
        int min = 0;
        int lastIndexOf;
        for (String split : splits) {
            lastIndexOf = split.lastIndexOf(t);
            if (min == 0 && lastIndexOf > 0) {
                min = lastIndexOf;
            }
            if (lastIndexOf > 0) {
                min = Math.min(min, lastIndexOf);
            }
        }
        for (String split : splits) {
            char[] chars = split.toCharArray();
            int i = 0;
            for (; i < chars.length; i++) {
                char aChar = chars[i];
                if (aChar != t) {
                    break;
                }
            }
            if (i >= min) {
                for (int k = 0; k < i - min; k++) {
                    stringBuilder.append(t);
                }
                stringBuilder.append(quote).append(split.substring(i)).append(quote).append(plus).append(n);
            } else if (StringRecognizer.hasText(split)) {
                stringBuilder.append(quote).append(split).append(quote).append(plus).append(n);
            }
        }
        int length = stringBuilder.length();
        return stringBuilder.substring(0, length - 2);
    }


}
