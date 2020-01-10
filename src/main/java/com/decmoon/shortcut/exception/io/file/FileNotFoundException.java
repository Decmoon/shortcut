package com.decmoon.shortcut.exception.io.file;

import com.decmoon.shortcut.exception.ShortCutException;


/**
 * @author decmoon
 */
public class FileNotFoundException extends ShortCutException {

    public FileNotFoundException() {
        super(FileNotFoundException.class, "File not found ");
    }

}
