package com.decmoon.shortcut.collection.set;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.ExceptionLogger;

import java.util.Collection;
import java.util.HashSet;

public class Sets {

    public final static <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }

    public final static <E> HashSet<E> newHashSet(Collection<? extends E> collection) {
        if (Arguments.parameterIllegal(collection)) {
            ExceptionLogger.parameterErr(Sets.class,"newHashSet(Collection<? extends E> collection)");
            return null;
        }
        return new HashSet<>(collection);
    }

}
