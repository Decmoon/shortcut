package com.decmoon.shortcut.bool;

/**
 * 为布尔值提供具体的操作
 * <p>
 * Provide specific operations for Boolean values
 *
 * @author decmoon
 */
public class BooleanJudge {

    private BooleanJudge() {
    }

    /**
     * 确定自定义表达式中的所有答案是否为 TRUE
     * <p>
     * Determines whether all answers in the custom expression are TRUE
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
     * <p>
     * Determines whether all answers in the custom expression are FALSE
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
     * <p>
     * Determines whether TRUE exists for the answer in the custom expression
     *
     * @param booleans bool
     * @return 存在 TRUE 则返回 TRUE
     */
    public static boolean hasTrue(boolean... booleans) {
        return !allFalse(booleans);
    }


    /**
     * 确定自定义表达式中的答案是否存在 FALSE
     * <p>
     * Determines whether FALSE exists in the answer in the custom expression
     *
     * @param booleans
     * @return 存在 FALSE 则返回 TRUE
     */
    public static boolean hasFalse(boolean... booleans) {
        return !allTrue(booleans);
    }

}
