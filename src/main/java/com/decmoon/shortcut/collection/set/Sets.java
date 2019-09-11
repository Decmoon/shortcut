package com.decmoon.shortcut.collection.set;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.collection.list.Lists;
import com.decmoon.shortcut.log.Logger;

import java.util.Collection;
import java.util.HashSet;

public class Sets {

    public final static <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }

    public final static <E> HashSet<E> newHashSet(Collection<? extends E> collection) {
        if (Arguments.parameterIllegal(collection)) {
            Logger.err(Sets.class.getName() + ".newHashSet() ->  parameter 'collection' illegal");
            return null;
        }
        return new HashSet<>(collection);
    }

}
