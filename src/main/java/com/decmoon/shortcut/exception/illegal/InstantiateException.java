package com.decmoon.shortcut.exception.illegal;

import com.decmoon.shortcut.exception.ShortCutException;

/**
 *
 * @author decmoon
 */
public class InstantiateException extends ShortCutException {

    public InstantiateException() {
        super(InstantiateException.class, "Cannot be instantiated");
    }

    public InstantiateException(String message) {
        super(InstantiateException.class, message);
    }
}
