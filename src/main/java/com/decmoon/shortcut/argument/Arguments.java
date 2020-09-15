package com.decmoon.shortcut.argument;

import com.decmoon.shortcut.collection.CollectionChecker;
import com.decmoon.shortcut.exception.illegal.InstantiateException;
import com.decmoon.shortcut.math.MathematicalComparator;
import com.decmoon.shortcut.string.StringRecognizer;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * 为参数提供具体的操作
 * <p>
 * Provides concrete actions for parameters
 *
 * @author decmoon
 */
public class Arguments {

    private Arguments() {
        throw new InstantiateException();
    }

    /**
     * 确定参数是否为空
     * <p>
     * Determines whether the argument is null
     *
     * @param object argument
     * @return TRUE is argument is null,otherwise
     */
    public static boolean isNull(Object object) {
        return Objects.isNull(object);
    }

    /**
     * 确定参数是否非空
     * <p>
     * Determines whether the argument isn't null
     *
     * @param object argument
     * @return TRUE is argument isn't null,otherwise
     */
    public static boolean nonNull(Object object) {
        return !isNull(object);
    }


    /**
     * 确定参数是否非法
     * <p>
     * Determine whether the parameter is illegal
     *
     * @param strict Severity will determine whether each element in the collection is an illegal element
     * @param object object
     * @return TRUE if illegal , otherwise
     */
    public static boolean parameterIllegal(boolean strict, Object object) {
        return isIllegal(strict, object);
    }

    /**
     * 确定参数是否非法
     * <p>
     * Determine whether the parameter is illegal
     *
     * @param strict  Severity will determine whether each element in the collection is an illegal element
     * @param objects arguments
     * @return TRUE if illegal , otherwise
     */
    public static boolean parameterIllegal(boolean strict, Object... objects) {
        boolean bool = false;
        for (Object object : objects) {
            bool = isIllegal(strict, object);
            if (bool) {
                return bool;
            }
        }
        return bool;
    }

    /**
     * 确定参数是否非法
     * <p>
     * Determine whether the parameter is illegal
     *
     * @param objects arguments
     * @return TRUE if illegal , otherwise
     */
    public static boolean parameterIllegal(Object... objects) {
        return parameterIllegal(true, objects);
    }

    /**
     * 确定参数是否合法
     * <p>
     * Determine whether the parameter is legal
     *
     * @param strict Severity will determine whether each element in the collection is an illegal element
     * @param object object
     * @return TRUE if legal , otherwise
     */
    public static boolean parameterLegal(boolean strict, Object object) {
        return !isIllegal(strict, object);
    }

    /**
     * 确定参数是否合法
     * <p>
     * Determine whether the parameter is legal
     *
     * @param strict  Severity will determine whether each element in the collection is an illegal element
     * @param objects arguments
     * @return TRUE if legal , otherwise
     */
    public static boolean parameterLegal(boolean strict, Object... objects) {
        return !parameterIllegal(strict, objects);
    }

    /**
     * 确定参数是否合法
     * <p>
     * Determine whether the parameter is legal
     *
     * @param objects arguments
     * @return TRUE if legal , otherwise
     */
    public static boolean parameterLegal(Object... objects) {
        return parameterLegal(true, objects);
    }


    /**
     * 判断参数是否非法
     * <p>
     * Determine whether the parameter is illegal
     *
     * @param strict Severity will determine whether each element in the collection is an illegal element
     * @param object argument
     * @return TRUE if illegal , otherwise
     */
    private static boolean isIllegal(boolean strict, Object object) {
        if (isNull(object)) {
            return true;
        }

        if (object instanceof Collection) {
            Collection collection = (Collection) object;
            if (strict) {
                return CollectionChecker.containNULL(collection);
            } else {
                return collection.isEmpty();
            }
        }
        if (object instanceof Map) {
            if (strict) {
                return CollectionChecker.containNULL((Map) object);
            } else {
                return ((Map) object).isEmpty();
            }
        }
        if (object instanceof String) {
            if (strict) {
                return !StringRecognizer.hasText((String) object);
            } else {
                return MathematicalComparator.equalsZero(((String) object).length());
            }
        }

        if (object instanceof StringBuilder || object instanceof StringBuffer) {
            return isIllegal(strict, object.toString());
        }
        return false;
    }

}
