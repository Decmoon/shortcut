package com.decmoon.shortcut.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * File stream processing
 *
 * @author decmoon
 */
public class FileOutPutStreamGenerator {

    private FileOutPutStreamGenerator() {
    }

    /**
     * Create a new FileOutputStream object
     *
     * @param file File
     * @return FileOutputStream object
     */
    public static FileOutputStream newFileOutPutStream(File file) throws com.decmoon.shortcut.exception.io.file.FileNotFoundException {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = newFileOutPutStreamWithThrows(file);
            return fileOutputStream;
        } catch (FileNotFoundException e) {
            throw new com.decmoon.shortcut.exception.io.file.FileNotFoundException();
        }
    }

    public static FileOutputStream newFileOutPutStreamWithThrows(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

}
