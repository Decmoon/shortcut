package com.decmoon.shortcut.math;

import com.decmoon.shortcut.bool.BooleanJudge;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.*;

/**
 * Provides methods for numeric manipulation
 *
 * @author decmoon
 */
public class MathematicalComparator {

    private MathematicalComparator() {
    }

    /**
     * Calculate if the number is greater than 0
     *
     * @param number Number
     * @return boolean
     */
    public static boolean moreThanZero(Number number) {
        if (number instanceof Integer ||
                number instanceof AtomicInteger ||
                number instanceof BigInteger) {
            return number.intValue() > 0;
        }
        if (number instanceof Double ||
                number instanceof DoubleAdder ||
                number instanceof DoubleAccumulator
        ) {
            return number.doubleValue() > 0.0d;
        }
        if (number instanceof Float) {
            return number.floatValue() > 0.0f;
        }
        if (number instanceof Long ||
                number instanceof AtomicLong ||
                number instanceof LongAdder ||
                number instanceof LongAccumulator
        ) {
            return number.longValue() > 0L;
        }
        if (number instanceof BigDecimal) {
            return ((BigDecimal) number).compareTo(BigDecimal.ZERO) > 0;
        }
        if (number instanceof Short) {
            return number.shortValue() > 0;
        }
        if (number instanceof Byte) {
            return number.byteValue() > 0;
        }
        return false;
    }

    /**
     * Calculate if the number is greater than 0
     *
     * @param numbers Numbers
     * @return boolean
     */
    public static boolean allMoreThanZero(Number... numbers) {
        for (Number number : numbers) {
            if (!moreThanZero(number)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculate if there is a number greater than 0
     *
     * @param numbers Numbers
     * @return boolean
     */
    public static boolean hasMoreThanZero(Number... numbers) {
        for (Number number : numbers) {
            if (moreThanZero(number)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Calculate if the number is less than 0
     *
     * @param number Number
     * @return boolean
     */
    public static boolean lessThanZero(Number number) {
        if (number instanceof Integer ||
                number instanceof AtomicInteger ||
                number instanceof BigInteger) {
            return number.intValue() < 0;
        }
        if (number instanceof Double ||
                number instanceof DoubleAdder ||
                number instanceof DoubleAccumulator
        ) {
            return number.doubleValue() < 0.0d;
        }
        if (number instanceof Float) {
            return number.floatValue() < 0.0f;
        }
        if (number instanceof Long ||
                number instanceof AtomicLong ||
                number instanceof LongAdder ||
                number instanceof LongAccumulator
        ) {
            return number.longValue() < 0L;
        }
        if (number instanceof BigDecimal) {
            return ((BigDecimal) number).compareTo(BigDecimal.ZERO) < 0;
        }
        if (number instanceof Short) {
            return number.shortValue() < 0;
        }
        if (number instanceof Byte) {
            return number.byteValue() < 0;
        }
        return false;
    }

    /**
     * Calculate if all Numbers are less than 0
     *
     * @param numbers Numbers
     * @return boolean
     */
    public static boolean allLessThanZero(Number... numbers) {
        for (Number number : numbers) {
            if (!lessThanZero(number)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculate if there is a number less than 0
     *
     * @param numbers Numbers
     * @return boolean
     */
    public static boolean hasLessThanZero(Number... numbers) {
        for (Number number : numbers) {
            if (lessThanZero(number)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Calculate if the number is equal to 0
     *
     * @param number Number
     * @return boolean
     */
    public static boolean equalsZero(Number number) {
        return !BooleanJudge.hasTrue(moreThanZero(number), lessThanZero(number));
    }

    /**
     * Calculate if the number isn't equal to 0
     *
     * @param number Number
     * @return boolean
     */
    public static boolean unequalZero(Number number) {
        return !equalsZero(number);
    }


}
