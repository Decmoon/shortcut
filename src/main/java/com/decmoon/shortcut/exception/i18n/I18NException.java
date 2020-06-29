package com.decmoon.shortcut.exception.i18n;

import com.decmoon.shortcut.exception.ShortCutException;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;

public class I18NException extends ShortCutException {

    public I18NException() {
        super(ParameterIllegalException.class, "Invalid file path");
    }
}
