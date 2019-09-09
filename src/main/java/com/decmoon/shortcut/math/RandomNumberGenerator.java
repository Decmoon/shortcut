package com.decmoon.shortcut.math;


import static com.decmoon.shortcut.math.MathematicalComparator.*;
import static com.decmoon.shortcut.math.MathematicalValueProcessor.absolute;

public class RandomNumberGenerator {

    public final static double random() {
        return Math.random();
    }

    public final static double random(double start, double end) {
        if (start == end) return start;
        double sta, fin;
        sta = Math.min(start, end);
        fin = Math.max(start, end);
        if (hasLessThanZero(sta, fin)) {
            if (moreThanZero(fin)) return random() * sta + random() * fin;
            if (lessThanZero(fin)) return -(random() * (absolute(fin) - absolute(sta)) + absolute(sta));
        }
        return Math.random() * (sta - fin) + sta;
    }

    public final static int random(int start, int end) {
        return (int) random((double) start, (double) end);
    }
}
