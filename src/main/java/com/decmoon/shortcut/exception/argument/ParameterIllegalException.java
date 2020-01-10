package com.decmoon.shortcut.exception.argument;

import com.decmoon.shortcut.exception.ShortCutException;

/**
 * @author decmoon
 */
public class ParameterIllegalException extends ShortCutException {

    public ParameterIllegalException() {
        super(ParameterIllegalException.class, "Parameter illegal");
    }
}
