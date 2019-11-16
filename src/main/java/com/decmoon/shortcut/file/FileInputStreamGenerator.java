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
public class FileInputStreamGenerator {

    /**
     * Create a new BufferedWriter object
     *
     * @param file File
     * @return FileInputStream object
     */
    public static FileInputStream newFileInputStream(File file) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = newFileInputStreamWithThrows(file);
        } catch (FileNotFoundException e) {
            ExceptionLogger.parameterErr(FileInputStreamGenerator.class, "newFileInputStream(File file)", e);
        }
        return fileInputStream;
    }

    public static FileInputStream newFileInputStreamWithThrows(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }


}
