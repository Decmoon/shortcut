package com.decmoon.shortcut.math;

import com.decmoon.shortcut.exception.illegal.InstantiateException;

import static com.decmoon.shortcut.math.MathematicalComparator.*;
import static com.decmoon.shortcut.math.MathematicalValueProcessor.absolute;

/**
 * Provide random number generation
 *
 * @author decmoon
 */
public class RandomNumberGenerator {

    private RandomNumberGenerator() {
        throw new InstantiateException();
    }

    /**
     * Return random number
     *
     * @return Random number
     */
    public static final double random() {
        return Math.random();
    }

    /**
     * Return random number
     *
     * @param start The starting value
     * @param end   The ending value
     * @return Random number
     */
    public static final double random(double start, double end) {
        if (start == end) return start;
        double sta, fin;
        sta = Math.min(start, end);
        fin = Math.max(start, end);
        if (hasLessThanZero(sta, fin)) {
            if (moreThanZero(fin)) return random() * sta + random() * fin;
            if (lessThanZero(fin)) return -(random() * (absolute(fin) - absolute(sta)) + absolute(sta));
        }
        return Math.random() * (fin - sta) + sta;
    }

    /**
     * Return random number
     *
     * @param start The starting value
     * @param end   The ending value
     * @return Random number
     */
    public static final int random(int start, int end) {
        return (int) random((double) start, (double) end);
    }

}
