package com.decmoon.shortcut.bool;

/**
 * Provides concrete actions for boolean
 *
 * @author decmoon
 */
public class BooleanJudge {

    private BooleanJudge() {
    }

    /**
     * 确定自定义表达式中的所有答案是否为 TRUE
     *
     * @param booleans
     * @return 所有为 TRUE 返回 TRUE ，otherwise
     */
    public static boolean allTrue(boolean... booleans) {
        for (boolean aBoolean : booleans) {
            if (!aBoolean) {
                return false;
            }
        }
        return true;
    }

    /**
     * 确定自定义表达式中的所有答案是否为 FALSE
     *
     * @param booleans
     * @return 所有为 FALSE 返回 TRUE ，otherwise
     */
    public static boolean allFalse(boolean... booleans) {
        for (boolean aBoolean : booleans) {
            if (aBoolean) {
                return false;
            }
        }
        return true;
    }

    /**
     * 确定自定义表达式中的答案是否存在 TRUE
     *
     * @param booleans
     * @return 存在 TRUE 则返回 TRUE
     */
    public static boolean hasTrue(boolean... booleans) {
        return !allFalse(booleans);
    }


    /**
     * 确定自定义表达式中的答案是否存在 FALSE
     *
     * @param booleans
     * @return 存在 FALSE 则返回 TRUE
     */
    public static boolean hasFalse(boolean... booleans) {
        return !allTrue(booleans);
    }

}
