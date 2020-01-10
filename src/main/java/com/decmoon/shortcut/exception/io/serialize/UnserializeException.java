package com.decmoon.shortcut.exception.io.serialize;

import com.decmoon.shortcut.exception.ShortCutException;

/**
 * @author decmoon
 */
public class UnserializeException extends ShortCutException {

    public UnserializeException() {
        super(SerializeException.class, "Un serialization failure");
    }
}
