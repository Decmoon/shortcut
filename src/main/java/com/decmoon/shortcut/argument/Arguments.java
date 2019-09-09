package com.decmoon.shortcut.argument;

import com.decmoon.shortcut.math.MathematicalComparator;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Arguments {

    public static boolean isNull(Object object) {
        return Objects.isNull(object);
    }

    public static boolean nonNull(Object object) {
        return !isNull(object);
    }

    public static boolean parameterIllegal(Object object) {
        if (isNull(object)) return true;

        if (object instanceof Number)
            return MathematicalComparator.equalsZero((Number) object);

        if (object instanceof Collection) {
            boolean empty = ((Collection) object).isEmpty();
            if (!empty && object instanceof List) {
                List list = (List) object;
                for (Object o : list)
                    if (parameterIllegal(o)) return true;
            }
            return empty;
        }
        if (object instanceof String)
            return "".equals(((String) object).trim());
        return false;
    }

    public static boolean parameterLegal(Object... objects) {
        return !parameterIllegal(objects);
    }

    public static boolean parameterIllegal(Object... objects) {
        boolean bool = false;
        for (Object object : objects) {
            bool = parameterIllegal(object);
            if (bool) return bool;
        }
        return bool;
    }

    public static void parameterIllegalThrow(String message,Object... objects) {
        if (parameterIllegal(objects))
            throw new IllegalArgumentException(message);
    }


}
