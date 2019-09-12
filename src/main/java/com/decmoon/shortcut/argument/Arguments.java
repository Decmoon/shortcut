package com.decmoon.shortcut.argument;

import com.decmoon.shortcut.collection.CollectionChecker;
import com.decmoon.shortcut.math.MathematicalComparator;

import java.util.Collection;
import java.util.Objects;

public class Arguments {

    public static boolean isNull(Object object) {
        return Objects.isNull(object);
    }

    public static boolean nonNull(Object object) {
        return !isNull(object);
    }

    public static boolean parameterIllegal(Object object) {
        return parameterIllegal(true, object);
    }

    public static boolean parameterIllegal(boolean strict, Object object) {
        if (isNull(object)) return true;

        if (object instanceof Number)
            return MathematicalComparator.equalsZero((Number) object);
        if (object instanceof Collection) {
            Collection collection = (Collection) object;
            if (strict)
                return CollectionChecker.containNULL(collection);
            else
                return CollectionChecker.isNull(collection) || CollectionChecker.isEmpty(collection);
        }
        if (object instanceof String)
            return "".equals(((String) object).trim());
        return false;
    }

    public static boolean parameterIllegal(boolean strict, Object... objects) {
        boolean bool = false;
        for (Object object : objects) {
            bool = parameterIllegal(strict, object);
            if (bool) return bool;
        }
        return bool;
    }

    public static boolean parameterIllegal(Object... objects) {
        return parameterIllegal(true, objects);
    }

    public static boolean parameterLegal(boolean strict, Object... objects) {
        return !parameterIllegal(strict, objects);
    }

    public static boolean parameterLegal(Object... objects) {
        return parameterLegal(true, objects);
    }


}
