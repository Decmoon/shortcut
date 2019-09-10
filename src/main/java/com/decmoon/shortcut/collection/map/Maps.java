package com.decmoon.shortcut.collection.map;

import java.util.HashMap;
import java.util.Hashtable;

public class Maps {

    public final static<K,V> HashMap<K,V> newHashMap(){
        return new HashMap<>();
    }

    public final static<K,V> Hashtable<K,V> newHashTable(){
        return new Hashtable<>();
    }
}
