package com.decmoon.shortcut.collection;

import com.decmoon.shortcut.bool.BooleanJudge;
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
     * 判断集合是否为 null
     * <p>
     * Judgment whether the collection is null
     *
     * @param collection Collection
     * @return TRUE if collection is null,otherwise
     */
    public static boolean isNull(Collection collection) {
        return Objects.isNull(collection);
    }

    /**
     * 判断集合是否为 null
     * <p>
     * Judgment whether the collection is null
     *
     * @param collection Collection
     * @return TRUE if collection isn't null , otherwise
     */
    public static boolean nonNull(Collection collection) {
        return !isNull(collection);
    }

    /**
     * 判断集合是否为空集合
     * <p>
     * Judgment whether the collection is empty
     *
     * @param collection Collection
     * @return TRUE if collection is empty,otherwise
     */
    public static boolean isEmpty(Collection collection) {
        return collection.isEmpty();
    }

    /**
     * 判断集合是否为空集合
     * <p>
     * Judgment whether the collection is empty
     *
     * @param collection Collection
     * @return TRUE if collection isn't empty,otherwise
     */
    public static boolean nonEmpty(Collection collection) {
        return !isEmpty(collection);
    }

    /**
     * 判断map集合是否为 null
     * <p>
     * Judgment whether the map is null
     *
     * @param map Map
     * @return TRUE if collection is null,otherwise
     */
    public static boolean isNull(Map map) {
        return Objects.isNull(map);
    }

    /**
     * 判断map集合是否为 null
     * <p>
     * Judgment whether the map is null
     *
     * @param map Map
     * @return TRUE if collection isn't null,otherwise
     */
    public static boolean nonNull(Map map) {
        return !isNull(map);
    }

    /**
     * 判断map集合是否为空
     * <p>
     * Judgment whether the map is empty
     *
     * @param map Map
     * @return TRUE if collection is empty,otherwise
     */
    public static boolean isEmpty(Map map) {
        return map.isEmpty();
    }

    /**
     * 判断map集合是否为空
     * <p>
     * Judgment whether the map is empty
     *
     * @param map Map
     * @return TRUE if collection isn't empty,otherwise
     */
    public static boolean nonEmpty(Map map) {
        return !isEmpty(map);
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
        if (BooleanJudge.hasTrue(isNull(collection), isEmpty(collection))) {
            return true;
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


}
