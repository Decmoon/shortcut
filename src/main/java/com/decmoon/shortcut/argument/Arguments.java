package com.decmoon.shortcut.argument;

import com.decmoon.shortcut.collection.CollectionChecker;
import com.decmoon.shortcut.collection.map.MapRecognizer;
import com.decmoon.shortcut.math.MathematicalComparator;
import com.decmoon.shortcut.string.StringRecognizer;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * Provides concrete actions for parameters
 *
 * @author decmoon
 */
public class Arguments {

    private Arguments() {
    }

    /**
     * Determines whether the argument is null
     *
     * @param object argument
     * @return TRUE is argument is null,otherwise
     */
    public static boolean isNull(Object object) {
        return Objects.isNull(object);
    }

    /**
     * Determines whether the argument isn't null
     *
     * @param object argument
     * @return TRUE is argument isn't null,otherwise
     */
    public static boolean nonNull(Object object) {
        return !isNull(object);
    }

    /**
     * Determine whether the parameter is illegal, illegal situation: the parameter is empty, the number is 0, the string is empty value
     *
     * @param object argument
     * @return TRUE if illegal , otherwise
     */
    public static boolean parameterIllegal(Object object) {
        return parameterIllegal(true, object);
    }

    /**
     * Determine whether the parameter is illegal, illegal situation: the parameter is empty, the number is 0, the string is empty value
     *
     * @param strict Severity will determine whether each element in the collection is an illegal element
     * @param object argument
     * @return TRUE if illegal , otherwise
     */
    public static boolean parameterIllegal(boolean strict, Object object) {
        if (isNull(object)) {
            return true;
        }
        if (object instanceof Number) {
            return MathematicalComparator.equalsZero((Number) object);
        }
        if (object instanceof Collection) {
            Collection collection = (Collection) object;
            if (strict) {
                return CollectionChecker.containNULL(collection);
            } else {
                return CollectionChecker.isNull(collection) || CollectionChecker.isEmpty(collection);
            }
        }
        if (object instanceof Map) {
            if (strict) {
                return MapRecognizer.hasNull((Map) object);
            } else {
                return CollectionChecker.isNull((Map) object) || CollectionChecker.isEmpty((Map) object);
            }
        }
        if (object instanceof String) {
            return !StringRecognizer.hasText((String) object);
        }
        return false;
    }


    /**
     * Determine whether the parameter is illegal, illegal situation: the parameter is empty, the number is 0, the string is empty value
     *
     * @param strict  Severity will determine whether each element in the collection is an illegal element
     * @param objects arguments
     * @return TRUE if illegal , otherwise
     */
    public static boolean parameterIllegal(boolean strict, Object... objects) {
        boolean bool = false;
        for (Object object : objects) {
            bool = parameterIllegal(strict, object);
            if (bool) return bool;
        }
        return bool;
    }

    /**
     * Determine whether the parameter is illegal, illegal situation: the parameter is empty, the number is 0, the string is empty value
     *
     * @param objects arguments
     * @return TRUE if illegal , otherwise
     */
    public static boolean parameterIllegal(Object... objects) {
        return parameterIllegal(true, objects);
    }

    /**
     * Determine whether the parameter is illegal, illegal situation: the parameter is empty, the number is 0, the string is empty value
     *
     * @param strict  Severity will determine whether each element in the collection is an illegal element
     * @param objects arguments
     * @return TRUE if legal , otherwise
     */
    public static boolean parameterLegal(boolean strict, Object... objects) {
        return !parameterIllegal(strict, objects);
    }

    /**
     * Determine whether the parameter is illegal, illegal situation: the parameter is empty, the number is 0, the string is empty value
     *
     * @param objects arguments
     * @return TRUE if legal , otherwise
     */
    public static boolean parameterLegal(Object... objects) {
        return parameterLegal(true, objects);
    }


}
