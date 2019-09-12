package com.decmoon.shortcut.collection;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.bool.BooleanJudge;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class CollectionChecker {

    public static boolean isNull(Collection collection) {
        return Objects.isNull(collection);
    }

    public static boolean nonNull(Collection collection) {
        return !isNull(collection);
    }

    public static boolean isEmpty(Collection collection) {
        return collection.isEmpty();
    }

    public static boolean nonEmpty(Collection collection) {
        return !isEmpty(collection);
    }

    public static boolean isNull(Map map) {
        return Objects.isNull(map);
    }

    public static boolean nonNull(Map map) {
        return !isNull(map);
    }

    public static boolean isEmpty(Map map) {
        return map.isEmpty();
    }

    public static boolean nonEmpty(Map map) {
        return !isEmpty(map);
    }


    public static boolean containNULL(Collection collection) {
        if (BooleanJudge.hasTrue(isNull(collection), isEmpty(collection)))
            return true;
        for (Object o : collection)
            if (Arguments.parameterIllegal(o)) return true;
        return false;
    }

    public static boolean nonContainNULL(Collection collection) {
        return !containNULL(collection);
    }


}
