package com.decmoon.shortcut.math;

import com.decmoon.shortcut.exception.illegal.InstantiateException;

/**
 * Provides operation methods for numeric values
 *
 * @author decmoon
 */
public class MathematicalValueProcessor {

    private MathematicalValueProcessor() {
        throw new InstantiateException();
    }

    /**
     * Calculate the absolute value of the value
     *
     * @param dou Number
     * @return Absolute value of the number
     */
    public static final double absolute(double dou) {
        return Math.abs(dou);
    }

    /**
     * Calculate the absolute value of the value
     *
     * @param number Number
     * @return Absolute value of the number
     */
    public static final int absolute(int number) {
        return Math.abs(number);
    }

}
