package com.decmoon.shortcut.collection.map;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;
import com.decmoon.shortcut.exception.illegal.InstantiateException;
import com.decmoon.shortcut.math.MathematicalComparator;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 提供Map集合的创建
 * <p>
 * Provides the creation of a Map collection
 *
 * @author decmoon
 */
public class Maps {

    private Maps() {
        throw new InstantiateException();
    }

    /**
     * 创建一个新的HashMap对象
     * <p>
     * Create a new HashMap object
     *
     * @param <K> Supports generics
     * @param <V> Supports generics
     * @return HashMap object
     */
    public final static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    /**
     * 创建一个新的HashMap对象
     * <p>
     * Create a new HashMap object
     *
     * @param map Map
     * @param <K> Supports generics
     * @param <V> Supports generics
     * @return HashMap object
     */
    public final static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        if (Arguments.parameterIllegal(map)) {
            throw new ParameterIllegalException();
        }
        return new HashMap<>(map);
    }

    /**
     * 创建一个新的Hash table对象
     * <p>
     * Create a new Hash table object
     *
     * @param <K> Supports generics
     * @param <V> Supports generics
     * @return Hash table object
     */
    public final static <K, V> Hashtable<K, V> newHashTable() {
        return new Hashtable<>();
    }

    /**
     * 创建一个新的Hash table对象
     * <p>
     * Create a new Hash table object
     *
     * @param map Map
     * @param <K> Supports generics
     * @param <V> Supports generics
     * @return Hash table object
     */
    public final static <K, V> Hashtable<K, V> newHashTable(Map<? extends K, ? extends V> map) {
        if (Arguments.parameterIllegal(map)) {
            throw new ParameterIllegalException();
        }
        return new Hashtable<>(map);
    }

    /**
     * 创建一个新的ConcurrentHashMap对象
     * <p>
     * Create a new ConcurrentHashMap object
     *
     * @param <K> Supports generics
     * @param <V> Supports generics
     * @return ConcurrentHashMap object
     */
    public final static <K, V> ConcurrentHashMap<K, V> newConcurrentHashMap() {
        return new ConcurrentHashMap<>();
    }

    /**
     * 创建一个新的ConcurrentHashMap对象
     * <p>
     * Create a new ConcurrentHashMap object
     *
     * @param map Map
     * @param <K> Supports generics
     * @param <V> Supports generics
     * @return ConcurrentHashMap object
     */
    public final static <K, V> ConcurrentHashMap<K, V> newConcurrentHashMap(Map<? extends K, ? extends V> map) {
        if (Arguments.parameterIllegal(map)) {
            throw new ParameterIllegalException();
        }
        return new ConcurrentHashMap<>(map);
    }

    /**
     * 创建一个新的ConcurrentHashMap对象
     * <p>
     * Create a new ConcurrentHashMap object
     *
     * @param initialCapacity ConcurrentHashMap's capacity
     * @param <K>             Supports generics
     * @param <V>             Supports generics
     * @return ConcurrentHashMap object
     */
    public final static <K, V> ConcurrentHashMap<K, V> newConcurrentHashMap(int initialCapacity) {
        if (MathematicalComparator.lessThanZero(initialCapacity)) {
            throw new ParameterIllegalException();
        }
        return new ConcurrentHashMap<>(initialCapacity);
    }

}
