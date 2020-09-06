package com.decmoon.shortcut.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * File stream processing
 *
 * @author decmoon
 */
public class FileInputStreamGenerator {

    private FileInputStreamGenerator() {
    }

    /**
     * Create a new BufferedWriter object
     *
     * @param file File
     * @return FileInputStream object
     */
    public static FileInputStream newFileInputStream(File file) throws com.decmoon.shortcut.exception.io.file.FileNotFoundException {
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new com.decmoon.shortcut.exception.io.file.FileNotFoundException();
        }
    }


}
