package com.decmoon.shortcut.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Lists {

    public final static <E> List<E> newArrayList() {
        return new ArrayList<>();
    }

    public final static <E> List<E> newCopyOnWriteArrayList() {
        return new CopyOnWriteArrayList<>();
    }

    public final static <E> List<E> newLinkedList() {
        return new LinkedList<>();
    }

    public final static <E> Vector<E> newVector() {
        return new Vector<E>();
    }


}
