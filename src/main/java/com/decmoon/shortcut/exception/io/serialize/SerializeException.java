package com.decmoon.shortcut.exception.io.serialize;

import com.decmoon.shortcut.exception.ShortCutException;

/**
 * @author decmoon
 */
@Deprecated
public class SerializeException extends ShortCutException {

    public SerializeException() {
        super(SerializeException.class, "Serialization failure");
    }

    public SerializeException(String message) {
        super(SerializeException.class, message);
    }
}
