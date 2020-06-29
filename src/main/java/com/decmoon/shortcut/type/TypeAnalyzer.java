package com.decmoon.shortcut.type;

import com.decmoon.shortcut.data.typechar.CharResolver;

/**
 * 类型分析器
 *
 * @author decmoon
 */
public class TypeAnalyzer {

    public static final char PREFIX_ARRAY = '[';
    public static final String PREFIX_ARRAY_CHAR = PREFIX_ARRAY + "C";

    private TypeAnalyzer() {
    }

    /**
     * 判断 object 是否为数组类型
     *
     * @param object
     * @return
     */
    public static boolean isArray(Object object) {
        return CharResolver.charEqual(
                PREFIX_ARRAY,
                CharResolver.getFirstChar(object.toString()));
    }


}
