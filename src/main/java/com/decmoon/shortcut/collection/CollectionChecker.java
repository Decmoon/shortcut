package com.decmoon.shortcut.collection;

import com.decmoon.shortcut.bool.BooleanJudge;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * A judgment operation for a collection
 *
 * @author decmoon
 */
public class CollectionChecker {
    /**
     * Judgment whether the collection is null
     *
     * @param collection Collection
     * @return TRUE if collection is null,otherwise
     */
    public static boolean isNull(Collection collection) {
        return Objects.isNull(collection);
    }

    /**
     * Judgment whether the collection is null
     *
     * @param collection Collection
     * @return TRUE if collection isn't null , otherwise
     */
    public static boolean nonNull(Collection collection) {
        return !isNull(collection);
    }

    /**
     * Judgment whether the collection is empty
     *
     * @param collection Collection
     * @return TRUE if collection is empty,otherwise
     */
    public static boolean isEmpty(Collection collection) {
        return collection.isEmpty();
    }

    /**
     * Judgment whether the collection is empty
     *
     * @param collection Collection
     * @return TRUE if collection isn't empty,otherwise
     */
    public static boolean nonEmpty(Collection collection) {
        return !isEmpty(collection);
    }

    /**
     * Judgment whether the map is null
     *
     * @param map Map
     * @return TRUE if collection is null,otherwise
     */
    public static boolean isNull(Map map) {
        return Objects.isNull(map);
    }

    /**
     * Judgment whether the map is null
     *
     * @param map Map
     * @return TRUE if collection isn't null,otherwise
     */
    public static boolean nonNull(Map map) {
        return !isNull(map);
    }

    /**
     * Judgment whether the map is empty
     *
     * @param map Map
     * @return TRUE if collection is empty,otherwise
     */
    public static boolean isEmpty(Map map) {
        return map.isEmpty();
    }

    /**
     * Judgment whether the map is empty
     *
     * @param map Map
     * @return TRUE if collection isn't empty,otherwise
     */
    public static boolean nonEmpty(Map map) {
        return !isEmpty(map);
    }

    /**
     * Determines whether the collection contains a null element
     *
     * @param collection Collection
     * @return TRUE if collection contains a null element
     */
    public static boolean containNULL(Collection collection) {
        if (BooleanJudge.hasTrue(isNull(collection), isEmpty(collection)))
            return true;
        for (Object o : collection)
            if (Objects.isNull(o)) return true;
        return false;
    }

    /**
     * Determines whether the collection contains a null element
     *
     * @param collection Collection
     * @return TRUE if collection not contains a null element
     */
    public static boolean nonContainNULL(Collection collection) {
        return !containNULL(collection);
    }


}
