package com.decmoon.shortcut.argument;

import java.util.LinkedList;
import java.util.List;

/**
 * @author decmoon
 */
public class ArgumentList {

    private static final List<Object> list = new LinkedList<>();

    private ArgumentList() {
    }


    private static class inner {
        private static final ArgumentList argumentList = new ArgumentList();
    }

    protected void clear() {
        list.clear();
    }

    protected List<Object> getArguments() {
        return list;
    }

    protected static ArgumentList asList(Object... objects) {
        for (Object object : objects) {
            list.add(object);
        }
        return inner.argumentList;
    }
}
