package com.decmoon.shortcut.file;

import com.decmoon.shortcut.exception.ExceptionLogger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * File stream processing
 *
 * @author decmoon
 */
public class FileInput {

    /**
     * Create a new BufferedWriter object
     *
     * @param file File
     * @return FileInputStream object
     */
    public static FileInputStream newFileInputStream(File file) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            ExceptionLogger.parameterErr(FileInput.class, "newFileInputStream(File file)", e);
        }
        return fileInputStream;
    }


}
