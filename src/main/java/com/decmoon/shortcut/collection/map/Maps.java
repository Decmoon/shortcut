package com.decmoon.shortcut.collection.map;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;
import com.decmoon.shortcut.math.MathematicalComparator;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Provides the creation of a Map collection
 *
 * @author decmoon
 */
public class Maps {

    private Maps() {
    }

    /**
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
     * Create a new HashMap object
     *
     * @param map Map
     * @param <K> Supports generics
     * @param <V> Supports generics
     * @return HashMap object
     */
    public final static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        if (Arguments.parameterIllegal(map)) {
            try {
                throw new ParameterIllegalException();
            } catch (ParameterIllegalException e) {
                e.shutdown();
            }
        }
        return new HashMap<>(map);
    }

    /**
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
     * Create a new Hash table object
     *
     * @param map Map
     * @param <K> Supports generics
     * @param <V> Supports generics
     * @return Hash table object
     */
    public final static <K, V> Hashtable<K, V> newHashTable(Map<? extends K, ? extends V> map) {
        if (Arguments.parameterIllegal(map)) {
            try {
                throw new ParameterIllegalException();
            } catch (ParameterIllegalException e) {
                e.shutdown();
            }
        }
        return new Hashtable<>(map);
    }

    /**
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
     * Create a new ConcurrentHashMap object
     *
     * @param map Map
     * @param <K> Supports generics
     * @param <V> Supports generics
     * @return ConcurrentHashMap object
     */
    public final static <K, V> ConcurrentHashMap<K, V> newConcurrentHashMap(Map<? extends K, ? extends V> map) {
        if (Arguments.parameterIllegal(map)) {
            try {
                throw new ParameterIllegalException();
            } catch (ParameterIllegalException e) {
                e.shutdown();
            }
        }
        return new ConcurrentHashMap<>(map);
    }

    /**
     * Create a new ConcurrentHashMap object
     *
     * @param initialCapacity ConcurrentHashMap's capacity
     * @param <K>             Supports generics
     * @param <V>             Supports generics
     * @return ConcurrentHashMap object
     */
    public final static <K, V> ConcurrentHashMap<K, V> newConcurrentHashMap(int initialCapacity) {
        if (MathematicalComparator.lessThanZero(initialCapacity)) {
            try {
                throw new ParameterIllegalException();
            } catch (ParameterIllegalException e) {
                e.shutdown();
            }
        }
        return new ConcurrentHashMap<>(initialCapacity);
    }

}
