package com.decmoon.shortcut.collection.list;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.log.Logger;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Lists {

    public final static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    public final static <E> ArrayList<E> newArrayList(Collection<? extends E> collection) {
        if (Arguments.parameterIllegal(collection)) {
            Logger.err(Lists.class.getName() + ".newArrayList() ->  parameter 'collection' illegal");
            return null;
        }
        return new ArrayList<>(collection);
    }

    public final static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new CopyOnWriteArrayList<>();
    }

    public final static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Collection<? extends E> collection) {
        if (Arguments.parameterIllegal(collection)) {
            Logger.err(Lists.class.getName() + ".newCopyOnWriteArrayList() ->  parameter 'collection' illegal");
            return null;
        }

        return new CopyOnWriteArrayList<>(collection);
    }


    public final static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    public final static <E> LinkedList<E> newLinkedList(Collection<? extends E> collection) {
        if (Arguments.parameterIllegal(collection)) {
            Logger.err(Lists.class.getName() + ".newLinkedList() ->  parameter 'collection' illegal");
            return null;
        }
        return new LinkedList<>(collection);
    }

    public final static <E> Vector<E> newVector() {
        return new Vector<E>();
    }

    public final static <E> Vector<E> newVector(Collection<? extends E> collection) {
        if (Arguments.parameterIllegal(collection)) {
            Logger.err(Lists.class.getName() + ".newVector() ->  parameter 'collection' illegal");
            return null;
        }
        return new Vector<>(collection);
    }

}
