package com.decmoon.shortcut.file;

import com.decmoon.shortcut.exception.ExceptionLogger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * File stream processing
 *
 * @author decmoon
 */
public class FileWrite {


    /**
     * Create a new FileWriter object
     *
     * @param file File
     * @return FileWriter object
     */
    public static FileWriter newFileWriter(File file) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file);
            return fileWriter;
        } catch (IOException e) {
            ExceptionLogger.parameterErr(FileWrite.class, "newFileWriter(File file)", e);
        }
        return null;
    }

}
