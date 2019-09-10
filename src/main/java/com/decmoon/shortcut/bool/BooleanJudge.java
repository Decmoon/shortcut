package com.decmoon.shortcut.bool;

public class BooleanJudge {

    public static boolean allTrue(boolean... booleans) {
        for (boolean aBoolean : booleans)
            if (!aBoolean)
                return false;

        return true;
    }

    public static boolean allFalse(boolean... booleans) {
        for (boolean aBoolean : booleans)
            if (aBoolean)
                return false;
        return true;
    }

    public static boolean hasTrue(boolean... booleans) {
        return !allFalse(booleans);
    }

    public static boolean hasFalse(boolean... booleans) {
        return !allTrue(booleans);
    }

}
