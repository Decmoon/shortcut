package com.decmoon.shortcut.collection.set;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;

import java.util.Collection;
import java.util.HashSet;

/**
 * 提供创建Set集合
 * <p>
 * Provides the creation of a Set collection
 *
 * @author decmoon
 */
public class Sets {

    private Sets() {
    }

    /**
     * 创建一个新的HashSet对象
     * <p>
     * Create a new HashSet object
     *
     * @param <E> Supports generics
     * @return HashSet object
     */
    public static final <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }


    /**
     * 创建一个新的HashSet对象
     * <p>
     * Create a new HashSet object
     *
     * @param collection collection
     * @param <E>        Supports generics
     * @return HashSet object
     */
    public final static <E> HashSet<E> newHashSet(Collection<? extends E> collection) {
        if (Arguments.parameterIllegal(collection)) {
            throw new ParameterIllegalException();
        }
        return new HashSet<>(collection);
    }

}
