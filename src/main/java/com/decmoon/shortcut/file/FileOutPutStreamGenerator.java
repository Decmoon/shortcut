package com.decmoon.shortcut.file;

import com.decmoon.shortcut.exception.ExceptionLogger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * File stream processing
 *
 * @author decmoon
 */
public class FileOutPutStreamGenerator {

    private FileOutPutStreamGenerator(){}

    /**
     * Create a new FileOutputStream object
     *
     * @param file File
     * @return FileOutputStream object
     */
    public static FileOutputStream newFileOutPutStream(File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = newFileOutPutStreamWithThrows(file);
            return fileOutputStream;
        } catch (FileNotFoundException e) {
            ExceptionLogger.parameterErr(FileOutPutStreamGenerator.class, "newFileOutPutStream(File file)", e);
        }
        return null;
    }

    public static FileOutputStream newFileOutPutStreamWithThrows(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

}
