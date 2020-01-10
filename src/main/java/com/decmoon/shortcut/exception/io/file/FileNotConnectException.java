package com.decmoon.shortcut.exception.io.file;

import com.decmoon.shortcut.exception.ShortCutException;

/**
 * @author decmoon
 */
public class FileNotConnectException extends ShortCutException {

    public FileNotConnectException() {
        super(FileNotConnectException.class, "An exception occurred during the file exchange");
    }
}
