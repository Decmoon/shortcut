package com.decmoon.shortcut.collection.map;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.ExceptionLogger;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Maps {

    public final static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    public final static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        if (Arguments.parameterIllegal(map)) {
            ExceptionLogger.parameterErr(Maps.class,"newHashMap(Map<? extends K, ? extends V> map)");
            return null;
        }
        return new HashMap<>(map);
    }


    public final static <K, V> Hashtable<K, V> newHashTable() {
        return new Hashtable<>();
    }
    public final static <K, V> Hashtable<K, V> newHashTable(Map<? extends K, ? extends V> map) {
        if (Arguments.parameterIllegal(map)) {
            ExceptionLogger.parameterErr(Maps.class,"newHashTable(Map<? extends K, ? extends V> map)");
            return null;
        }
        return new Hashtable<>(map);
    }

}
