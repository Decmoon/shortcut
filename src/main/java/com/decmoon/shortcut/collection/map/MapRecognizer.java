package com.decmoon.shortcut.collection.map;

import com.decmoon.shortcut.bool.BooleanJudge;

import java.util.Map;

public class MapRecognizer {

    public static <K, V> boolean hasNull(Map<K, V> map) {

        for (Map.Entry<K, V> entry : map.entrySet()) {
            K k = entry.getKey();
            V v = entry.getValue();
            if (BooleanJudge.hasTrue(k == null, v == null))
                return true;
        }
        return false;
    }


}
