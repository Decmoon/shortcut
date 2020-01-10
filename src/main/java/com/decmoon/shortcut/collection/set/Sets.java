package com.decmoon.shortcut.collection.set;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;

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
    public static final <E> HashSet<E> newHashSet() {
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
            try {
                throw new ParameterIllegalException();
            } catch (ParameterIllegalException e) {
                e.shutdown();
            }
        }
        return new HashSet<>(collection);
    }

}
