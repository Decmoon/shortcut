package com.decmoon.shortcut.exception.io.file;

import com.decmoon.shortcut.exception.ShortCutException;

/**
 * @author decmoon
 */
public class FileNotDocumentTypeException extends ShortCutException {

    public FileNotDocumentTypeException() {
        super(FileNotDocumentTypeException.class, "The created file object is not a [document] type");
    }

    public FileNotDocumentTypeException(String message) {
        super(FileNotDocumentTypeException.class, message);
    }
}
