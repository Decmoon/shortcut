package com.decmoon.shortcut.collection;

import com.decmoon.shortcut.bool.BooleanJudge;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;
import com.decmoon.shortcut.exception.illegal.InstantiateException;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * 一个集合的判断操作
 * <p>
 * A judgment operation for a collection
 *
 * @author decmoon
 */
public class CollectionChecker {

    private CollectionChecker() {
        throw new InstantiateException();
    }

    /**
     * 确定集合是否包含空元素
     * <p>
     * Determines whether the collection contains a null element
     *
     * @param collection Collection
     * @return TRUE if collection contains a null element
     */
    public static boolean containNULL(Collection collection) {
        if (BooleanJudge.hasTrue(Objects.isNull(collection), collection.isEmpty())) {
            throw new ParameterIllegalException();
        }
        for (Object o : collection) {
            if (Objects.isNull(o)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断Map集合中是否有null元素
     * <p>
     * Determines if there are null elements in the Map collection
     *
     * @param map collection
     * @param <K> type
     * @param <V> type
     * @return TRUE if has null elements , otherwise
     */
    public static <K, V> boolean containNULL(Map<K, V> map) {

        if (Objects.isNull(map) || map.isEmpty()) {
            throw new ParameterIllegalException();
        }

        for (Map.Entry<K, V> entry : map.entrySet()) {
            K k = entry.getKey();
            V v = entry.getValue();
            if (BooleanJudge.hasTrue(k == null, v == null)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 确定集合是否不包含空元素
     * <p>
     * Determines whether the collection not contains a null element
     *
     * @param collection Collection
     * @return TRUE if collection not contains a null element
     */
    public static boolean nonContainNULL(Collection collection) {
        return !containNULL(collection);
    }


    /**
     * 确定集合是否不包含空元素
     * <p>
     * Determines whether the collection not contains a null element
     *
     * @param map collection
     * @param <K> type
     * @param <V> type
     * @return TRUE if collection not contains a null element
     */
    public static <K, V> boolean nonContainNULL(Map<K, V> map) {
        return !containNULL(map);
    }


}
