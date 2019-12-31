package com.decmoon.shortcut.collection.set;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.ExceptionLogger;

import java.util.Collection;
import java.util.HashSet;

/**
 * Provides the creation of a Set collection
 *
 * @author decmoon
 */
public class Sets {

    private Sets() {
    }

    /**
     * Create a new HashSet object
     *
     * @param <E> Supports generics
     * @return HashSet object
     */
    public final static <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }


    /**
     * Create a new HashSet object
     *
     * @param collection collection
     * @param <E>        Supports generics
     * @return HashSet object
     */
    public final static <E> HashSet<E> newHashSet(Collection<? extends E> collection) {
        if (Arguments.parameterIllegal(collection)) {
            ExceptionLogger.parameterErr(Sets.class, "newHashSet(Collection<? extends E> collection)");
            return null;
        }
        return new HashSet<>(collection);
    }

}
