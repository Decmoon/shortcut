package com.decmoon.shortcut.exception.io.file;

import com.decmoon.shortcut.exception.ShortCutException;

/**
 * @author decmoon
 */
public class FileNotDirectoryTypeException extends ShortCutException {

    public FileNotDirectoryTypeException() {
        super(FileNotDirectoryTypeException.class, "The created file object is not a [directory] type");
    }

    public FileNotDirectoryTypeException(String message) {
        super(FileNotDirectoryTypeException.class, message);
    }
}
