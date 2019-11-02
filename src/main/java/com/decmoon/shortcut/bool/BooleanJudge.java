package com.decmoon.shortcut.bool;
/**
 * Provides concrete actions for boolean
 *
 * @author decmoon
 */
public class BooleanJudge {

    /**
     * Determines whether all the answers in the custom expression are true
     *
     * @param booleans Boolean values or expressions
     * @return TRUE if all the values is true
     */
    public static boolean allTrue(boolean... booleans) {
        for (boolean aBoolean : booleans)
            if (!aBoolean)
                return false;

        return true;
    }

    /**
     * Determines whether all the answers in the custom expression are false
     *
     * @param booleans Boolean values or expressions
     * @return TRUE if all the values is false
     */
    public static boolean allFalse(boolean... booleans) {
        for (boolean aBoolean : booleans)
            if (aBoolean)
                return false;
        return true;
    }

    /**
     * Determines whether has an answer in the custom expression is true
     *
     * @param booleans Boolean values or expressions
     * @return TRUE if have an answer is true
     */
    public static boolean hasTrue(boolean... booleans) {
        return !allFalse(booleans);
    }

    /**
     * Determines whether has an answer in the custom expression is false
     *
     * @param booleans Boolean values or expressions
     * @return TRUE if have an answer is false
     */
    public static boolean hasFalse(boolean... booleans) {
        return !allTrue(booleans);
    }

}
