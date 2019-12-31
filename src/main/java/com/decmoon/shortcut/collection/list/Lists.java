package com.decmoon.shortcut.collection.list;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.ExceptionLogger;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Provides the creation of a List collection
 *
 * @author decmoon
 */
public class Lists {

    private Lists() {
    }

    /**
     * Create a new ArrayList object
     *
     * @param <E> Supports generics
     * @return ArrayList object
     */
    public static final <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    /**
     * Create a new ArrayList object
     *
     * @param collection collection
     * @param <E>        Supports generics
     * @return ArrayList object
     */
    public static final <E> ArrayList<E> newArrayList(Collection<? extends E> collection) {
        if (Arguments.parameterIllegal(collection)) {
            ExceptionLogger.parameterErr(Lists.class, "newArrayList(Collection<? extends E> collection)");
            return null;
        }
        return new ArrayList<>(collection);
    }

    /**
     * Create a new CopyOnWriteArrayList object
     *
     * @param <E> Supports generics
     * @return CopyOnWriteArrayList object
     */
    public static final <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new CopyOnWriteArrayList<>();
    }

    /**
     * Create a new CopyOnWriteArrayList object
     *
     * @param collection collection
     * @param <E>        Supports generics
     * @return CopyOnWriteArrayList object
     */
    public static final <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Collection<? extends E> collection) {
        if (Arguments.parameterIllegal(collection)) {
            ExceptionLogger.parameterErr(Lists.class, "newCopyOnWriteArrayList(Collection<? extends E> collection)");
            return null;
        }
        return new CopyOnWriteArrayList<>(collection);
    }

    /**
     * Create a new LinkedList object
     *
     * @param <E> Supports generics
     * @return LinkedList object
     */
    public static final <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    /**
     * Create a new LinkedList object
     *
     * @param collection Collection
     * @param <E>        Supports generics
     * @return LinkedList object
     */
    public static final <E> LinkedList<E> newLinkedList(Collection<? extends E> collection) {
        if (Arguments.parameterIllegal(collection)) {
            ExceptionLogger.parameterErr(Lists.class, "newLinkedList(Collection<? extends E> collection)");
            return null;
        }
        return new LinkedList<>(collection);
    }

    /**
     * Create a new Vector object
     *
     * @param <E> Supports generics
     * @return Vector object
     */
    public static final <E> Vector<E> newVector() {
        return new Vector<>();
    }


    /**
     * Create a new Vector object
     *
     * @param collection Collection
     * @param <E>        Supports generics
     * @return Vector object
     */
    public static final <E> Vector<E> newVector(Collection<? extends E> collection) {
        if (Arguments.parameterIllegal(collection)) {
            ExceptionLogger.parameterErr(Lists.class, "newVector(Collection<? extends E> collection)");
            return null;
        }
        return new Vector<>(collection);
    }


    /**
     * Create a unmodifiable collection
     *
     * @param collection Collection
     * @param <T>        Supports generics
     * @return Collection
     */
    public static final <T> Collection<T> newUnmodifiableCollection(Collection<? extends T> collection) {
        if (Arguments.parameterIllegal(collection)) {
            ExceptionLogger.parameterErr(Lists.class, "newUnmodifiableCollection(Collection<? extends T> collection)");
            return null;
        }
        return Collections.unmodifiableCollection(collection);
    }

    /**
     * Create a unmodifiable list
     *
     * @param list List collection
     * @param <T>  Supports generics
     * @return List
     */
    public static final <T> List<T> newUnmodifiableList(List<? extends T> list) {
        return Collections.unmodifiableList(list);
    }

}
